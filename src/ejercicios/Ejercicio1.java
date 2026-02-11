public class Ejercicio1 {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        
        p1.setPetName("Rufina");
        p1.setSpecies("Perro");
        p1.setOwner("Diego");
        p1.setAge(2);
        p1.setWeight(10);

        System.out.println("--Mascota--");
        System.out.println("Nombre: " + p1.getPetName());
        System.out.println("Especie: " + p1.getSpecies());
        System.out.println("Dueño: " + p1.getOwner());
        System.out.println("Edad: " + p1.getAge() + " años");
        System.out.println("Peso: " + p1.getWeight() + " kg");
        System.out.println();

        Owner o1 = new Owner();

        o1.setOwnerName("Diego");
        o1.setRfc("DJKL010S0L872");
        o1.setPhoneNumber("477-245-6091");

        System.out.println("--Dueño--");
        System.out.println("Nombre: " + o1.getOwnerName());
        System.out.println("RFC: " + o1.getRfc());
        System.out.println("Número de teléfono: " + o1.getPhoneNumber());
        System.out.println();

        Vet v1 = new Vet();

        v1.setEmployeeName("Juan");
        v1.setEmployeeID("001");
        v1.setSpeciality("Medicina general");
        v1.setExperienceYears(5);

        System.out.println("--Empleado--");
        System.out.println("Nombre: " + v1.getEmployeeName());
        System.out.println("Número de empleado: " + v1.getEmployeeID());
        System.out.println("Especialidad: " + v1.getSpeciality());
        System.out.println("Años de experiencia: " + v1.getExperienceYears() + " años");
        System.out.println();

        Service s1 = new Service();

        s1.setServiceName("Vacunación");
        s1.setPrice(300);
        s1.setDuration(30);

        System.out.println("--Servicio--");
        System.out.println("Servicio: " + s1.getServiceName());
        System.out.println("Precio: $" + s1.getPrice());
        System.out.println("Duración: " + s1.getDuration() + " minutos");
        System.out.println();

        Appointment a1 = new Appointment();

        a1.setDate("10/02/2026");
        a1.setService("Vacunación");
        a1.setTotalPrice(300);

        System.out.println("--Consulta--");
        System.out.println("Fecha: " + a1.getDate());
        System.out.println("Servicio realizado: " + a1.getService());
        System.out.println("Precio total: $" + a1.getTotalPrice());
        System.out.println();
    }
}
    class Pet {
        private String petName;
        private String species;
        private String owner;
        private int age;
        private int weight;

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            if (petName == null || petName.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre de la mascota no puede estar vacío");
            }
            this.petName = petName;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            if (species == null || species.trim().isEmpty()) {
                throw new IllegalArgumentException("La especie no puede estar vacía");
            }
            this.species = species;
        }
        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            if (owner == null || owner.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del dueño no puede estar vacío");
            }
            this.owner = owner;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("La edad no puede ser menor a cero");
            }
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            if (weight < 0) {
                throw new IllegalArgumentException("El peso no puede ser menor a cero");
            }
            this.weight = weight;
        }
    }

    class Owner {
        private String ownerName;
        private String rfc;
        private String phoneNumber;

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            if (ownerName == null || ownerName.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del dueño no puede estar vacio");
            }
            this.ownerName = ownerName;
        } 

        public String getRfc() {
            return rfc;
        }

        public void setRfc(String rfc) {
            if (rfc == null || rfc.trim().isEmpty()) {
                throw new IllegalArgumentException("El rfc no puede estar vacío");
            }
            this.rfc = rfc;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("El número de teléfono no puede estar vacío");
            }
            this.phoneNumber = phoneNumber;
        } 
    }

    class Vet {
        private String employeeName;
        private String employeeID;
        private String speciality;
        private int experienceYears;

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            if (employeeName == null || employeeName.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del empleado no puede estar vacío");
            }
            this.employeeName = employeeName;
        }

        public String getEmployeeID() {
            return employeeID;
        } 

        public void setEmployeeID(String employeeID) {
            if (employeeID == null || employeeID.trim().isEmpty()) {
                throw new IllegalArgumentException("El número de empleado no puede estar vacío");
            }
            this.employeeID = employeeID;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
        if (speciality == null || speciality.trim().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía");
        }
        this.speciality = speciality;
        }

        public int getExperienceYears() {
            return experienceYears;
        }

        public void setExperienceYears(int experienceYears) {
            if (experienceYears < 0) {
                throw new IllegalArgumentException("Los años de experiencia no pueden ser menores a cero");
            }
            this.experienceYears = experienceYears;
        }
    }

    class Service {
        private String serviceName;
        private int price;
        private int duration;

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            if (serviceName == null || serviceName.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del servicio no puede estar vacío");
            }
            this.serviceName = serviceName;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            if (price <= 0) {
                throw new IllegalArgumentException("El precio no puede ser menor a cero");
            }
            this.price = price;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            if (duration <0) {
                throw new IllegalArgumentException("La duración no puede ser menor a cero");
            }
            this.duration = duration;
        }
    }

    class Appointment {
        private String date;
        private String service;
        private int totalPrice;

        public String getDate() {
            return date;
        }
        
        public void setDate(String date) {
            if (date == null || date.trim().isEmpty()) {
                throw new IllegalArgumentException("La fecha no puede estar vacía");
            }
            this.date = date;
        }

        public String getService() {
            return service;
        }
        public void setService(String service) {
            if (service == null || service.trim().isEmpty()) {
                throw new IllegalArgumentException("El servicio no puede estar vacío");
            }
            this.service = service;
        }
        public int getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(int totalPrice) {
            if (totalPrice < 0) {
                throw new IllegalArgumentException("El precio total no puede estar vacío");
            }
            this.totalPrice = totalPrice;
        }
    }