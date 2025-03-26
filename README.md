# Movies-Reservation-Modulate-Project-RICO-4

V0.0.0.1:

--Iniciar Traefik dentro del archivo local de instalacion de  Traefik (CMD)--

.\traefik.exe --configFile="Ruta del archivo traefik.yml"

.\gradlew bootRun - a cada servicio para iniciarlo (Pruebas)

http://localhost/user/ -> Debería redirigir a user-service (puerto 8081).

http://localhost/movie/ -> Debería redirigir a movie-service (puerto 8082).

http://localhost/showtime/ -> Debería redirigir a showtime-service (puerto 8083).

http://localhost/reservation/ -> Debería redirigir a reservation-service (puerto 8084).
