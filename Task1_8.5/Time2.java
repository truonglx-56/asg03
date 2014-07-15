/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truonglx.93
 */
public class Time2 {
     private int second;

      // Time2 no-argument constructor: initializes each instance variable
      // to zero; ensures that Time2 objects start in a consistent state  
      public Time2()                                                      
      {                                                                   
         second=0; // invoke Time2 constructor with three arguments
      } // end Time2 no-argument constructor                              
 
      // Time2 constructor: hour supplied, minute and second defaulted to 0
      public Time2( int h )                                                
      {                                                                    
        second=h*3600; // invoke Time2 constructor with three arguments
      } // end  Time2 one-argument constructor                             
 
      // Time2 constructor: hour and minute supplied, second defaulted to 0
      public Time2( int h, int m )                                         
      {                                                                    
         second=3600*h+60*m; // invoke Time2 constructor with three arguments 
      } // end Time2 two-argument constructor                              
 
      // Time2 constructor: hour, minute and second supplied   
      public Time2( int h, int m, int s )                      
      {                                                        
         setTime( h, m, s ); // invoke setTime to validate time
      } // end Time2 three-argument constructor                
 
      // Time2 constructor: another Time2 object supplied           
      public Time2( Time2 time )                                    
      {                                                             
         // invoke Time2 three-argument constructor                 
         this( time.getHour(), time.getMinute(), time.getSecond() );
      } // end Time2 constructor with a Time2 object argument       
 
      // Set Methods
      // set a new time value using universal time; ensure that
      // the data remains consistent by setting invalid values to zero
      public void setTime( int h, int m, int s )
      {
         setHour( h );   // set the hour
         setMinute( m ); // set the minute
         setSecond( s ); // set the second
      } // end method setTime
 
      // validate and set hour
      public void setHour( int h )
      {
         second =second + 3600* ( ( h >= 0 && h < 24 ) ? h : 0 );
      } // end method setHour
 
      // validate and set minute
      public void setMinute( int m )
      {
         second =second+ 60*( ( m >= 0 && m < 60 ) ? m : 0 );
      } // end method setMinute
 
      // validate and set second
      public void setSecond( int s )
      {
         second =second + ( ( s >= 0 && s < 60 ) ? s : 0 );
      } // end method setSecond
 
      // Get Methods
      // get hour value
      public int getHour()
      {
         return (second/3600);
      } // end method getHour
 
      // get minute value
      public int getMinute()
      {
         return ((second-3600*getHour())/60);
      } // end method getMinute
 
      // get second value
      public int getSecond()
      {
         return (second-3600*getHour()-60*getMinute());
      } // end method getSecond
 
      // convert to String in universal-time format (HH:MM:SS)
      public String toUniversalString()
      {
         return String.format(
            "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
      } // end method toUniversalString
 
      // convert to String in standard-time format (H:MM:SS AM or PM)
      public String toString()
      {
         return String.format( "%d:%02d:%02d %s",
           ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
           getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" )  );
     } // end method toString
  } // end class Time2