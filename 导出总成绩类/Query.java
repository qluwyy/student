import java.sql.*;
public class Query {
	int hang;
	int lie;
	String SQL;//SQL语句
	String [] columnName;//全部字段名
	String [] [] record;//查询到的记录
	public void setSQL(String SQL) {
		this.SQL=SQL.trim();
	}
	public String[] getColumnName() {
		if (columnName ==null){
			System.out.println("先查询记录");
			return null;
		}
		return columnName;
	}
	public String [] [] getRecord() {
		startQuery();
		return record;
	}
	public int geth() {//
		return hang;
	}
	public int getl() {//
		return lie;
	}
	private void startQuery() {
		try{
			Connection con=GetDBConnection.connectDB("student","root","");
			Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=sql.executeQuery(SQL);
			ResultSetMetaData metaData=rs.getMetaData();
			int columnCount=metaData.getColumnCount();//字段数目
			columnName=new String [columnCount];
			lie=columnCount;
			
			for (int i=1;i<=columnCount;i++){
				columnName [i-1]=metaData.getColumnName(i);
			}
			rs.last();
			int recordAmount =rs.getRow();//结果集中的记录数目
			record =new String[recordAmount][columnCount];
			hang=recordAmount;
			int i=0;
			rs.beforeFirst();
			while (rs.next ()) {
				for (int j=1;j<=columnCount;j++)
					{
						record[i][j-1]=rs.getString(j);//第i条记录放入二维数组第二行
					}
					i++;
				}
			con.close();
		}
		catch(SQLException e) {
			System.out.println(""+e);
		}
	}
}

