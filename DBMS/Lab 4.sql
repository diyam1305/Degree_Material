--Lab 4

--PART-A

--1. Update SPI of all students from 7.00 to 8.00. 
Update STUDENT
Set SPI = 8.00
Where SPI = 7.00

select * from STUDENT


--2. Change city of HETVI from RAJKOT to AHMEDABAD.
Update STUDENT
Set CITY = 'Ahmedabad'
where SNAME = 'Hetvi'


--3. Update SPI of DEEP to 9.20 and city to VADODARA. 
Update STUDENT
Set SPI = 9.20, City = 'Vadodara'
where SNAME = 'Deep'


--4. Update SPI of DHARMIK to 8.50. 
Update STUDENT
Set SPI = 8.50
where SNAME = 'Dharmik'


--5. Update branch name from COMPUTER to IT. 
Update STUDENT 
Set BRANCH = 'IT'
where BRANCH = 'Computer'


--6. Update branch of RAJ to AUTOMOBILE. 
Update STUDENT
Set BRANCH = 'AUTOMOBILE'
where SNAME = 'Raj'


--7. Update SPI to 7.50 where STDID is between 103 and 107.
Update STUDENT
Set SPI = 7.50
where STDID > 103 AND STDID < 107


--8. Update city of PARAG to MUMBAI. 
Update STUDENT
Set CITY = 'MUMBAI'
where SNAME = 'Parag'


--9. Update SPI of RIYA to 6.00. 
Update STUDENT
Set SPI = 6.00
where SNAME = 'Riya'


--10. Update SPI of SMAIR to 7.20 and branch to ELECTRICAL.
Update STUDENT
Set SPI = 7.20, BRANCH = 'ELECTRICAL'
where SNAME = 'Smair'



--PART-B


--11. Give 10% increment in SPI.  
Update STUDENT
SET SPI = SPI * 1.10


--12. Increase SPI by 20% for all students. 
Update STUDENT
Set SPI = SPI * 1.20


--13. Increase SPI by 0.50 in all records.  
Update STUDENT
Set SPI = SPI + 0.50


--14. Update branch to 'EC' and SPI to 8.00 and city to Surat where SNAME is KRUNAL.  
Update STUDENT
Set BRANCH = 'EC', SPI = 8.00, CITY = 'SURAT'
where SNAME = 'Krunal'


--15. Update city to 'RAJKOT' and SPI to 7.00 where branch is CIVIL and stdid is less than 105.
Update STUDENT
Set CITY = 'Rajkot', SPI = 7.00
where BRANCH = 'Civil' AND STDID < 105



--PART-C

--16. Update SPI of student with stdid 110 to NULL. 
Update STUDENT
Set SPI = NULL
where STDID = 110

--17. Update branch of VISHAL to NULL.  
Update STUDENT
Set BRANCH = NULL
where SNAME = 'Vishal'

--18. Display names of students whose SPI is NULL. 
Select SNAME from STUDENT where SPI IS NULL

--19. Display students who have branch assigned.  
Select * from STUDENT where BRANCH IS NOT NULL

--20. Update student with stdid 108 to name DARSHAN, branch COMPUTER, and SPI 8.50. 
Update STUDENT
Set SNAME = 'DARSHAN', BRANCH = 'COMPUTER', SPI = 8.50
where STDID = 108

--21. Update city to SURAT where SPI is less than 7.00.  
Update STUDENT
Set CITY = 'SURAT'
where SPI < 7.00

--22. Update city to NULL and branch to MECHANICAL where stdid is 109. 
Update STUDENT
Set CITY = NULL, BRANCH = 'MECHANICAL'
where STDID = 109