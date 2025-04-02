# Movies-Reservation-Modulate-Project-RICO-4

V0.0.1.2:
#Proceso de Inicio#

1. Se abre la consola dentro de Traefik y se ejecuta el comando:

.\traefik.exe --configFile="RUTA DEL ARCHIVO TRAEFIK.YML"

2. Se abre la consola dentro de cada servicio y se ejecuta el comando:

.\gradlew bootRun

3. (Opcional) Se abre la consola dentro de cada servicio y se ejecuta el comando:

./gradlew clean build --refresh-dependencies


--- Endpoints para realizar Pruebas: ---

http://localhost/user/ -> Debería redirigir a user-service (puerto 8081).

http://localhost/movie/ -> Debería redirigir a movie-service (puerto 8082).

http://localhost/showtime/ -> Debería redirigir a showtime-service (puerto 8083).

http://localhost/reservation/ -> Debería redirigir a reservation-service (puerto 8084).


#Datos de prueba POSTMAN#
USER:

    {
        "name": "Juan Pérez",
        "email": "juan@example.com",
        "password": "123456"
    }

MOVIE:

    {
        "title": "Interestellar",
        "director": "Christopher Nolan",
        "genre": "Sci-Fi",
        "durationMinutes": 169
    }

SHOWTIME:

    {
        "movieId": "1",                                #ID de la película creada
        "theaterId": "A1",
        "startTime": "2025-03-15T13:00:00",
        "endTime": "2025-03-15T15:30:00",
        "available": true
    }

RESERVATION:

    {
        "userId": "1",                                #ID del usuario creado
        "showtimeId": "67e45e47ba5fb75f77abcc78",     #ID del showtime creado
        "seats": ["A1", "A2", "A3", "A4"],
        "status": "CONFIRMED"
}
    }