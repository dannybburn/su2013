package com.example.blackburnhmwk6;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Homescreen extends Activity {

static final int System_Configuration_Request_Code = 1;
static final int Employee_Communications_Request_Code = 2;
static final int Ticket_System_Request_Code = 3;
/*View v;
{
startActivityForResult( new Intent(v.getContext(), 
		com.example.blackburnhmwk6.SystemConfiguration.class),System_Configuration_Request_Code);
}
{
startActivityForResult( new Intent(v.getContext(), 
		com.example.blackburnhmwk6.EmployeeCommunications.class),Employee_Communications_Request_Code);
}
{
startActivityForResult( new Intent(v.getContext(), 
		com.example.blackburnhmwk6.TicketSystem.class),Ticket_System_Request_Code);
}
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
switch (requestCode) {
case System_Configuration_Request_Code:

break;
case Employee_Communications_Request_Code:

break;
case Ticket_System_Request_Code:

break;
}
}*/
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
	}
	
	public void sysConfig (View v)
    {
    	Intent intent = new Intent(getApplicationContext(),
    			com.example.blackburnhmwk6.SystemConfiguration.class); 
    	startActivity(intent);
    }
	public void empComs (View v)
    {
    	Intent intent = new Intent(getApplicationContext(),
    			com.example.blackburnhmwk6.EmployeeCommunications.class); 
    	startActivity(intent);
    }	
	public void tktSys (View v)
    {
    	Intent intent = new Intent(getApplicationContext(),
    			com.example.blackburnhmwk6.TicketSystem.class); 
    	startActivity(intent);
    }
}
