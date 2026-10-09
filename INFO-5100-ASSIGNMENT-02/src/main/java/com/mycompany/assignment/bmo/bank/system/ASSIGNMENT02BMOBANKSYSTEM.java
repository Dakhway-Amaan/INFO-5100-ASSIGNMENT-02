/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class ASSIGNMENT02BMOBANKSYSTEM {

    public static void main(String[] args) {
        
       // =====================================================
        // 1. CUSTOMER CLASSES
        // Constructor order for every customer:
        // (customerId, name, email, phone, dateOfBirth, ...extra fields)
        // =====================================================
        System.out.println("===== 1. CUSTOMERS =====");
 
        // Customer(customerId, name, email, phone, dateOfBirth)
        Customer bob = new Customer(
                "C000",                // customerId
                "Bob",                 // name
                "bob@example.com",     // email
                "416-555-0100",        // phone
                "1990-03-03");         // dateOfBirth
        
        System.out.println("Customer contact info: " + bob.getContactInfo());
        
        // updateCustomerInfo(name, email, phone) changes the data and returns the new contact info
        System.out.println("After update: " + bob.updateCustomerInfo(
                "Bob Smith",           // new name
                "bob.smith@example.com", // new email
                "416-555-0111"));      // new phone
        
 
        // OtherBankClient(..., bankName, externalClientId, clientName, contactInfo)
        OtherBankClient otherClient = new OtherBankClient(
                "C010", "Jordan", "jordan@example.com", "416-555-0110", "1988-08-08",
                "RBC",                 // bankName
                "EXT-9",               // externalClientId
                "Jordan Lee",          // clientName
                "jordan@rbc.com");     // contactInfo
        
        System.out.println("Other bank client: " + otherClient.getContactInfo()
                + " | bank = " + otherClient.getBankName());
 
        // BmoBankClient(..., clientSince)
        BmoBankClient bmoClient = new BmoBankClient(
                "C020", "Chris", "chris@example.com", "416-555-0120", "1985-05-05",
                "2015-06-01");         // clientSince
        System.out.println("BMO client: " + bmoClient.getContactInfo()
                + " | client since = " + bmoClient.getClientSince());
 
        // Minor(..., clientSince, age, guardianType, guardianInformation)
        Minor mia = new Minor(
                "C002", "Mia", "mia@example.com", "416-555-0102", "2012-05-05",
                "2020-01-01",          // clientSince
                14,                    // age
                "Parent",              // guardianType
                "Wei Chen");           // guardianInformation
        System.out.println("Minor: " + mia.getContactInfo() + " | age = " + mia.getAge());
        System.out.println("Guardian before: " + mia.getGuardian());
        mia.setGuardian("Li Chen");    // change guardian name
        System.out.println("Guardian after: " + mia.getGuardian());
 
        // Student(..., clientSince, institution, studentId)
        Student sam = new Student(
                "C030", "Sam", "sam@example.com", "416-555-0130", "2003-09-09",
                "2022-09-01",          // clientSince
                "Northeastern University", // institution
                "S-2026-77");          // studentId
        System.out.println("Student: " + sam.getContactInfo()
                + " | institution = " + sam.getInstitution());
 
        // Adult(..., clientSince, occupation, address, sinNumber)
        Adult adult = new Adult(
                "C040", "Dana", "dana@example.com", "416-555-0140", "1980-04-04",
                "2010-01-01",          // clientSince
                "Teacher",             // occupation
                "5 Queen St",          // address
                "111-222-333");        // sinNumber
        System.out.println("Adult: " + adult.getContactInfo()
                + " | occupation = " + adult.getOccupation());
 
        // Individual has the same values as Adult (no extra fields)
        Individual alice = new Individual(
                "C001",                // customerId
                "Alice",               // name
                "alice@example.com",   // email
                "416-555-0101",        // phone
                "2000-01-01",          // dateOfBirth
                "2020-01-01",          // clientSince
                "Engineer",            // occupation
                "12 King St",          // address
                "123-456-789");        // sinNumber
        System.out.println("Individual: " + alice.getContactInfo()
                + " | occupation = " + alice.getOccupation());
 
        // Investor(adult values..., portfolioValue)
        Investor investor = new Investor(
                "C050", "Eli", "eli@example.com", "416-555-0150", "1975-07-07",
                "2005-01-01", "Banker", "9 Bay St", "444-555-666",
                250000.50);            // portfolioValue
        System.out.println("Investor: " + investor.getContactInfo()
                + " | portfolio value = " + investor.getPortfolioValue());
 
        // SmallBusiness(adult values..., businessName, numberOfEmployees)
        SmallBusiness smallBiz = new SmallBusiness(
                "C060", "Fatima", "fatima@example.com", "416-555-0160", "1982-02-02",
                "2012-01-01", "Owner", "3 Yonge St", "777-888-999",
                "Fatima's Bakery",     // businessName
                8);                    // numberOfEmployees
        System.out.println("Small business: " + smallBiz.getContactInfo()
                + " | business = " + smallBiz.getBusinessName());
 
        // LargeBusiness(adult values..., corporateBusinessName, registrationNumber)
        LargeBusiness largeBiz = new LargeBusiness(
                "C070", "Gus", "gus@example.com", "416-555-0170", "1970-01-01",
                "2000-01-01", "CEO", "100 Front St", "000-111-222",
                "Big Corp Inc.",       // corporateBusinessName
                "REG-12345");          // registrationNumber
        System.out.println("Large business: " + largeBiz.getContactInfo()
                + " | corporate name = " + largeBiz.getCorporateBusinessName());
 
        // =====================================================
        // 2. ACCOUNT CLASSES
        // Constructor order: (accountNumber, balance, openedDate, ...extra fields)
        // =====================================================
        System.out.println();
        System.out.println("===== 2. ACCOUNTS =====");
 
        // Account(accountNumber, balance, openedDate)
        Account basic = new Account(
                "ACC-1",               // accountNumber
                1000,                  // starting balance
                "2020-01-01");         // openedDate
        System.out.println("Basic account " + basic.getAccountNumber()
                + " balance = " + basic.getBalance());
        basic.deposit(200);            // 1000 + 200 = 1200
        System.out.println("After deposit of 200: " + basic.getBalance());
        basic.withdraw(300);           // 1200 - 300 = 900
        System.out.println("After withdraw of 300: " + basic.getBalance());
 
        // NamedAccount(..., nickname)
        NamedAccount named = new NamedAccount(
                "NAM-1", 500, "2020-01-01",
                "Holiday fund");       // nickname
        System.out.println("Named account nickname: " + named.getNickname());
        named.setNickname("Trip to Japan"); // change nickname
        System.out.println("Nickname after change: " + named.getNickname());
 
        // CheckingAccount(..., nickname, overdraftLimit)
        CheckingAccount checking = new CheckingAccount(
                "CHK-1",               // accountNumber
                500,                   // starting balance
                "2020-01-01",          // openedDate
                "Everyday",            // nickname
                200);                  // overdraftLimit (can go 200 below zero)
        checking.deposit(250);         // 500 + 250 = 750
        System.out.println("Checking balance after deposit of 250: " + checking.getBalance());
        // 900 <= 750 + 200 (overdraft)? 900 <= 950, so yes. Balance becomes -150
        System.out.println("Cheque for 900 accepted? " + checking.writeCheck(900));
        System.out.println("Checking balance: " + checking.getBalance());
        // 100 <= -150 + 200? 100 <= 50, no, so it is rejected
        System.out.println("Cheque for 100 accepted? " + checking.writeCheck(100));
        System.out.println("Checking balance (unchanged): " + checking.getBalance());
 
        // SavingsAccount(..., nickname, interestRate)
        SavingsAccount savings = new SavingsAccount(
                "SAV-1",               // accountNumber
                1000,                  // starting balance
                "2020-01-01",          // openedDate
                "Rainy day",           // nickname
                0.02);                 // interestRate (2%)
        System.out.println("Savings interest (1000 x 0.02): " + savings.calculateInterest());
 
        // InvestmentAccount(..., nickname, riskProfile)
        InvestmentAccount invest = new InvestmentAccount(
                "INV-1", 5000, "2020-01-01",
                "TFSA",                // nickname
                "Balanced");           // riskProfile
        invest.buyAsset("BMO", 10);    // symbol, quantity
        invest.sellAsset("BMO", 4);    // symbol, quantity
 
        // LoanAccount(accountNumber, balance, openedDate, interestRate, principalAmount, termMonths)
        LoanAccount loan = new LoanAccount(
                "LN-1",                // accountNumber
                0,                     // balance
                "2020-01-01",          // openedDate
                0.05,                  // interestRate (5%)
                10000,                 // principalAmount
                24);                   // termMonths
        System.out.println("Loan interest rate: " + loan.getInterestRate());
        System.out.println("Loan interest over term (10000 x 0.05 x 24 / 12): " + loan.calculateInterest());
        loan.makeLoanPayment(2000);    // 10000 - 2000 = 8000
        System.out.println("Principal after paying 2000: " + loan.getPrincipalAmount());
 
        // =====================================================
        // 3. OPEN ACCOUNTS FOR CLIENTS
        // openAccount(account) prints which client opened which account
        // =====================================================
        System.out.println();
        System.out.println("===== 3. OPEN ACCOUNTS =====");
        alice.openAccount(checking);
        alice.openAccount(savings);
        mia.openAccount(named);
        investor.openAccount(invest);
 
        // =====================================================
        // 4. TRANSACTIONS
        // =====================================================
        System.out.println();
        System.out.println("===== 4. TRANSACTIONS =====");
 
        // Transaction(transactionId, date, amount, type)
        Transaction t1 = new Transaction(
                "TXN-001",             // transactionId
                "2026-10-08",          // date
                250.00,                // amount
                "DEPOSIT");            // type
        System.out.println("Transaction amount: " + t1.getAmount());
 
        // PointsTransaction(date, points, reason)
        PointsTransaction pt = new PointsTransaction(
                "2026-10-08",          // date
                25,                    // points
                "Earned from deposit"); // reason
        System.out.println("Points earned: " + pt.getPoints());
 
        // =====================================================
        // 5. LOYALTY ACCOUNT AND REDEMPTION
        // =====================================================
        System.out.println();
        System.out.println("===== 5. LOYALTY =====");
 
        // LoyaltyAccount(customerId, memberId, enrolledDate)
        LoyaltyAccount loyalty = new LoyaltyAccount(
                "C001",                // customerId (Alice)
                "M-1001",              // memberId
                "2020-01-01");         // enrolledDate
        System.out.println("Starting points: " + loyalty.getPoints());
        loyalty.addPoints(300);        // 0 + 300 = 300
        System.out.println("After adding 300: " + loyalty.getPoints());
        loyalty.redeemPoints(120);     // 300 - 120 = 180
        System.out.println("After redeeming 120: " + loyalty.getPoints());
 
        // Redemption(redeemedDate, pointCost, pointsUsed, rewardId, description)
        Redemption redemption = new Redemption(
                "2026-10-08",          // redeemedDate
                120,                   // pointCost
                120,                   // pointsUsed
                "R-55",                // rewardId
                "Coffee voucher");     // description
        System.out.println("Redeemed reward: " + redemption.getDescription());
        
    }
}
