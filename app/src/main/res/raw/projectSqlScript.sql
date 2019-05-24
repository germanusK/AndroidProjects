/*library management system database script*/
  create table library(
    name varchar(45) not null,
    email varchar(100) not null,
    phone varchar(15) not null,
    location varchar(100) not null,
    libraryId int(10) not null unique,
    type varchar(45),
    picture varchar(255),
    primary key(libraryId)
  );
  create table admin(
    name varchar(45) not null,
    sex varchar(10) not null,
    dateOfBirth date not null,
    email varchar(100) not null,
    phone varchar(15) not null,
    homeAddress varchar(100) not null,
    adminId int(10) not null unique,
    username varchar(45) not null,
    password varchar(32),
    picture varchar(255),
    libraryId int(10) not null unique,
    primary key(adminId),
    foreign key(libraryId) references library on delete cascade
  );
  create table manager(
    name varchar(45) not null,
    sex varchar(10) not null,
    dateOfBirth date not null,
    email varchar(100) not null,
    phone varchar(15) not null,
    homeAddress varchar(100) not null,
    managerId int(10) not null unique,
    username varchar(45) not null,
    password varchar(32),
    picture varchar(255),
    libraryId int(10) not null unique,
    primary key(managerId),
    foreign key(libraryId) references library on delete cascade
  );
  create table otherStaff(
    name varchar(45) not null,
    sex varchar(10) not null,
    dateOfBirth date not null,
    email varchar(100) not null,
    phone varchar(15) not null,
    staffId int(10) not null unique;
    homeAddress varchar(100) not null,
    username varchar(45) not null,
    password varchar(32),
    picture varchar(255),
    libraryId int(10) not null unique,
    primary key(staffId),
    foreign key(libraryId) references library on delete cascade
  );
  create table student(
    name varchar(45) not null,
    sex varchar(10) not null,
    dateOfBirth date not null,
    email varchar(100) not null,
    phone varchar(15) not null,
    username varchar(45) not null,
    password varchar(32) not null,
    studentId int(10) not null unique,
    managerId int(10),
    picture varchar(255),
    primary key(studentId),
    foreign key(managerId) references manager
  );
  create table cell(
  shelfId int(10),
  cellNumber int(10) not null unique,
  primary key(shelfId, cellNumber),
  foreign key(shelfId) references shelf,
  );
   create table shelf(
   _section int(10),
   room int(10),
   shelfNumber int(10),
   shelfId int(10) not null unique,
   managerId int(10),
   libraryId int(10),
   picture varchar(255),
   primary key(shelfId),
   foreign key(managerId) references manager,
   foreign key(libraryId) references library
   );
   create table item_student(
   itemId int(10),
   studentId int(10),
   rating int,
   likes int,
   recommendations int
   studentDrawer int
   primary key(itemId, studentId),
   foreign key(itemId) references item
   );
   create table otherStaff_item(
   itemId int(10),
   staffId int(10),
   rating int in(0, 1, 2, 3, 4, 5),
   likes smallInt,
   staffDrawer int,
   primary key(itemId, staffId),
   foreign key(itemId) references item,
   foreign key(staffId) references otherStaff
   );
   create table item(
   title varchar(45) not null,
   author varchar(45) not null,
   category varchar(45),
   releaseDate date,
   itemId int(10),
   shelfId int(10),
   cellNumber int,
   picture varchar(255),
   libraryId int(10),
   primary key(itemId),
   foreign key(shelfId, cellNumber) references cell,
   foreign key(libraryId) references library
   );
   create table book(
   bookId int(10) not null unique,
   _size int not null,
   edition int not null,
   foreign key(bookId) references item on delete cascade,
   primary key(bookId)
   );
   create table video(
   videoId int(10) not null unique,
   _length minute not null,--int minutes
   videoCategory varchar(45),
   foreign key(videoId) references item on delete cascade,
   primary key(videoId)
   );
   create table newsLetter(
   newsLetterId int(10) not null unique,
   newsLetterCategory varchar(45),
   foreign key(newsLetterId) references Item on delete cascade,
   primary key(newsLetterId)
   );