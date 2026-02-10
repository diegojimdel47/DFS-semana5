public class Ejercicio1 {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        p1.petName = "Rufina";
        p1.species = "Perro";
        p1.owner = "Diego";
        p1.age = 2;
        p1.weight = 10;

        p1.petInfo();

        Owner o1 = new Owner();
        o1.ownerName = "Diego";
        o1.rfc = "HOLA124578PL0";
        o1.phoneNumber = "479-338-6745";

        o1.ownerInfo();

        Vet v1 = new Vet();
        v1.employeeName = "Juan";
        v1.employeeID = "001";
        v1.speciality = "Medicina general";
        v1.experienceYears = 7;

        v1.vetInfo();

        Service s1 = new Service();
        s1.serviceName = "Vacunación";
        s1.price = 350;
        s1.duration = 20;

        s1.serviceInfo();

        Appointment a1 = new Appointment();
        a1.date = "09/02/2025";
        a1.service = "Vacunación";
        a1.totalPrice = 350;

        a1.appointmentInfo();
    }
}

    class Pet {
        String petName;
        String species;
        String owner;
        int age;
        int weight;

        public void petInfo() {
            System.out.println("--Mascota--");
            System.out.println("Nombre: " + petName);
            System.out.println("Especie: " + species);
            System.out.println("Dueño: " + owner);
            System.out.println("Edad: " + age + " años");
            System.out.println("Peso: " + weight + " kg");
            System.out.println();

        }
    }   


    class Owner {
        String ownerName;
        String rfc;
        String phoneNumber;

        public void ownerInfo() {
            System.out.println("--Dueño--");
            System.out.println("Nombre: " + ownerName);
            System.out.println("RFC: " + rfc);
            System.out.println("Número de teléfono: " + phoneNumber);
            System.out.println();
        }
    }

    class Vet {
        String employeeName;
        String employeeID;
        String speciality;
        int experienceYears;

        public void vetInfo() {
            System.out.println("--Empleado--");
            System.out.println("Nombre: " + employeeName);
            System.out.println("Número de empleado: " + employeeID);
            System.out.println("Especialidad: " + speciality);
            System.out.println("Años de experiencia: " + experienceYears + " años");
            System.out.println();

        }
    }

    class Service {
        String serviceName;
        int price;
        int duration;

        public void serviceInfo() {
            System.out.println("--Servicio--");
            System.out.println("Servicio: " + serviceName);
            System.out.println("Precio: $" + price);
            System.out.println("Duración: " + duration + " minutos");
            System.out.println();

        }
    }

    class Appointment {
        String date;
        String service;
        int totalPrice;

        public void appointmentInfo() {
            System.out.println("--Consulta--");
            System.out.println("Fecha: " + date);
            System.out.println("Servicio realizado: " + service);
            System.out.println("Precio total: $" + totalPrice);
            System.out.println();

        }
    }