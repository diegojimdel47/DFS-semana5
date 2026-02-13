package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
  
        Owner o1 = new Owner();
        o1.setOwnerName("Diego");
        o1.setRfc("12DH200J34GH");
        o1.setPhoneNumber("442 569-1021");

        Pet p1 = new Pet();
        p1.setPetName("Rufina");
        p1.setSpecies("Perro");
        p1.setOwner(o1);
        p1.setAge(2);
        p1.setWeight(10.5);

        Vet v1 = new Vet();
        v1.setEmployeeName("Juan");
        v1.setEmployeeID("001");
        v1.setSpeciality("Medicina general");
        v1.setExperienceYears(5);

        Service s1 = new Service();
        s1.setServiceName("Vacunación");
        s1.setPrice(300);
        s1.setDuration(30);

        Appointment a1 = new Appointment();
        a1.setDate("10/02/2026");
        a1.setPet(p1);
        a1.setVet(v1);
        a1.setService(s1);

        System.out.println("--Mascota--");
        System.out.println("Nombre: " + p1.getPetName());
        System.out.println("Especie: " + p1.getSpecies());
        System.out.println("Edad: " + p1.getAge() + " años");
        System.out.println("Peso: " + p1.getWeight() + " kg");
        System.out.println("Dueño: " + p1.getOwner().getOwnerName());
        System.out.println();

        System.out.println("--Veterinario--");
        System.out.println("Nombre: " + v1.getEmployeeName());
        System.out.println("Especialidad: " + v1.getSpeciality());
        System.out.println("Años de experiencia: " + v1.getExperienceYears() + " años");
        System.out.println();

        System.out.println("--Consulta--");
        System.out.println("Fecha: " + a1.getDate());
        System.out.println("Servicio realizado: " + a1.getService().getServiceName());
        System.out.println("Precio total: $" + a1.getTotalPrice());
        System.out.println();
    }
}
    class Pet {
        private String petName;
        private String species;
        private Owner owner;
        private int age;
        private double weight;

        public Pet() {
        }

        public Pet(String petName, String species, Owner owner, int age, double weight) {
            this.petName = petName;
            this.species = species;
            this.owner = owner;
            this.age = age;
            this.weight = weight;
        }

        public Pet(Pet other) {
            this.petName = other.petName;
            this.species = other.species;
            this.owner = new Owner(other.owner);
            this.age = other.age;
            this.weight = other.weight;
        }
        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            if (petName == null) {
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
        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            if (owner == null) {
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

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
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

        public Owner() {
        }

        public Owner(String ownerName, String rfc, String phoneNumber) {
            this.ownerName = ownerName;
            this.rfc = rfc;
            this.phoneNumber = phoneNumber;
        }

        public Owner(Owner other) {
            this.ownerName = other.ownerName;
            this.rfc = other.rfc;
            this.phoneNumber = other.phoneNumber;
        }

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

        public Vet() {
        }

        public Vet(String employeeName, String employeeID, String speciality, int experienceYears) {
            this.employeeName = employeeName;
            this.employeeID = employeeID;
            this.speciality = speciality;
            this.experienceYears = experienceYears;
        }

        public Vet(Vet other) {
            this.employeeName = other.employeeName;
            this.employeeID = other.employeeID;
            this.speciality = other.speciality;
            this.experienceYears = other.experienceYears;
        }

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
        private double price;
        private int duration;

        public Service() {
        }

        public Service(String serviceName, double price, int duration) {
            this.serviceName = serviceName;
            this.price = price;
            this.duration = duration;
        }

        public Service(Service other) {
            this.serviceName = other.serviceName;
            this.price = other.price;
            this.duration = other.duration;
        }

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            if (serviceName == null || serviceName.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del servicio no puede estar vacío");
            }
            this.serviceName = serviceName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
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
        private Pet pet;
        private Vet vet;
        private Service service;
        private double totalPrice;

        public Appointment() {
        }

        public Appointment(String date, Pet pet, Vet vet, Service service, double totalPrice) {
            this.date = date;
            this.pet = pet;
            this.vet = vet;
            this.service = service;
            this.totalPrice = service.getPrice();
        }

        public Appointment(Appointment other) {
            this.date = other.date;
            this.pet = new Pet(other.pet);
            this.vet = new Vet(other.vet);
            this.service = new Service(other.service);
            this.totalPrice = other.totalPrice;
        }

        public String getDate() {
            return date;
        }
        
        public void setDate(String date) {
            if (date == null || date.trim().isEmpty()) {
                throw new IllegalArgumentException("La fecha no puede estar vacía");
            }
            this.date = date;
        }

        public Pet getPet() {
            return pet;
        }

        public void setPet(Pet pet) {
            if (pet == null) {
                throw new IllegalArgumentException("La mascota no puede ser nula");
            }
            this.pet = pet;
        }

        public Vet getVet() {
            return vet;
        }

        public void setVet( Vet vet) {
            if (vet == null) {
                throw new IllegalArgumentException("El veterinario no puede ser nulo");
            }
            this.vet = vet;
        }

        public Service getService() {
            return service;
        }
        public void setService(Service service) {
            if (service == null) {
                throw new IllegalArgumentException("El servicio no puede estar vacío");
            }
            this.service = service;
            this.totalPrice = service.getPrice();
        }
        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            if (totalPrice < 0) {
                throw new IllegalArgumentException("El precio total no puede estar vacío");
            }
            this.totalPrice = totalPrice;
        }
    }