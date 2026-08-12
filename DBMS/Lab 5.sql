--LAB 5

--PART-A

--1. Add column state varchar(20). 
Alter table Deposit
add STATE varchar(20)

select * from Deposit_Detail

--2. Add two more columns city varchar(20) and pincode int. 
Alter table Deposit
Add CITY varchar(20), PINCODE int

--3. Change the size of cname column from varchar(50) to varchar(35). 
Alter table Deposit
Alter column CNAME varchar(35)

--4. Change the data type of amount from decimal to int. 
Alter table Deposit
Alter column AMOUNT int

--5. Delete column city from the DEPOSIT table.
Alter table Deposit
drop column CITY

--6. Rename column actno to ano. 
SP_RENAME 'Deposit.ACTNO', 'ANO'

--7. Rename column bname to branch_name.
SP_RENAME 'Deposit.BNAME', 'BRANCH_NAME'

--8. Rename table DEPOSIT to DEPOSIT_DETAIL. 
SP_RENAME 'Deposit', 'DEPOSIT_DETAIL'

select * from DEPOSIT_DETAIL

--9. Add column ifsc_code varchar(15). 
Alter table DEPOSIT_DETAIL
add IFSC_CODE varchar(15)

--10. Change the size of bname column from varchar(50) to varchar(30). 
Alter table DEPOSIT_DETAIL
alter column BRANCH_NAME varchar(30)