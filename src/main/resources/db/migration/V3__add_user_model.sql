CREATE TABLE gira_user (
	ID 					VARCHAR ( 36 ) NOT NULL,
	created_at 			TIMESTAMP,
	created_by 			VARCHAR ( 36 ),
	last_modified_at 	TIMESTAMP,
	last_modified_by 	VARCHAR ( 36 ),
	VERSION 			int4 NOT NULL,
	username 			varchar(100) not null unique,
	password			varchar(255) not null,
	display_name		varchar(255) not null,
	first_name			varchar(100),
	last_name			varchar(100),
	email				varchar(100) not null unique,
	avatar				varchar(255),
	status				varchar(50) not null,
	department			varchar(255),
	major				varchar(255),
	hobbies				varchar(255),
	facebook			varchar(255),	
	PRIMARY KEY ( ID ) 
);
CREATE TABLE gira_group_user ( 
	group_id 	VARCHAR ( 36 ) NOT NULL, 
	user_id 	VARCHAR ( 36 ) NOT NULL, 
	PRIMARY KEY ( group_id, user_id ) 
);
ALTER TABLE IF EXISTS gira_group_user 
	ADD CONSTRAINT FK_GROUP_ROLE_USER FOREIGN KEY ( user_id ) REFERENCES gira_user(id);
ALTER TABLE IF EXISTS gira_group_user 
	ADD CONSTRAINT FK_GROUP_ROLE_GROUP FOREIGN KEY ( group_id ) REFERENCES gira_group(id);