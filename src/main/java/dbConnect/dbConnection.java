package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbConnection {
	String dbDriver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@DB202203081207_medium?TNS_ADMIN=C:/Users/rlacl/wallet/Wallet_DB202203081207";
	//String url = "jdbc:oracle:thin:@DB202203081207_medium?TNS_ADMIN=Wallet_DB202203081207";
	String user = "samp";
	String password = "Super1tiger";
	
	
	public dbConnection() throws Exception {
		Class.forName(dbDriver);
	}
	
	
	public String dbSelect() throws Exception {
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "Select * from test";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			String result = "";
			if(rs.next()) {
				result = rs.getString(1);
			}
			return result;
		} finally {
			
		}
	}
	
}
