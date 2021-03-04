<!DOCTYPE html>
<html lang='en'>
  <head>
    <meta charset='utf-8' />
    <link href='fullcalendar/main.css' rel='stylesheet' />
    <script src='fullcalendar/main.js'></script>
    <script>

      document.addEventListener('DOMContentLoaded', function() {

        var calendarEl = document.getElementById('calendar');
        var calendar = new FullCalendar.Calendar(calendarEl, {

          height: 600,



          
           initialView: 'dayGridMonth',


           googleCalendarApiKey: 'AIzaSyAU26pmcXxK1CuHYTf774OzN8C_GzZuIAY',
            eventSources: [
        {
          googleCalendarId: 'hosni96.ht@gmail.com'
        },]
      
        });

        calendar.render();
      });

    </script>
  </head>
  <body>
    <div id='calendar'></div>
  </body>
</html>