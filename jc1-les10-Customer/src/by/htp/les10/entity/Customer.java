package by.htp.les10.entity;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Customer {
	private int id;
    private int bankAccaunt;
    private int cardNumber;
    private String addres;
    private String surname;
    private String name;
    private String patronymic;

    public Customer(){

    }
    public Customer(int id, int bankAccaunt, int cardNumber, String surname, String name, String patronymic, String addres){
        this.id = id;
        this.bankAccaunt = bankAccaunt;
        this.cardNumber = cardNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.addres = addres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBankAccaunt() {
        return bankAccaunt;
    }

    public void setBankAccaunt(int bankAccaunt) {
        this.bankAccaunt = bankAccaunt;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Customer " + surname + " " + name + " " + patronymic + ": id = " + id + ", addres = " + addres + ", Credit Card Number = " + cardNumber
                + ", Bank Accaunt = " + bankAccaunt;
    }


}
