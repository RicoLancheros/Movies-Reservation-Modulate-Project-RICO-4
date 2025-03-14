##### Movies-Reservation-Modulate-Project-RICO-4 ####

#V0.0.0.1:#


---Iniciar Traefik dentro de Archivos de programa y Traefik---

.\traefik.exe --configFile="Ruta"

.\gradlew bootRun - a cada servicio para iniciarlo (Pruebas)

--- Puertos en uso ---

http://localhost/user/ -> Debería redirigir a user-service (puerto 8081).

http://localhost/movie/ -> Debería redirigir a movie-service (puerto 8082).

http://localhost/showtime/ -> Debería redirigir a showtime-service (puerto 8083).

http://localhost/reservation/ -> Debería redirigir a reservation-service (puerto 8084).

---- Bases de datos ----

--MySQL Workbrench--
CREATE DATABASE user_db;
CREATE DATABASE movie_db;

--MongoDB Compass--
reservation_db
showtime_db

-----------------------
