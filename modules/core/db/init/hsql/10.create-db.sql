-- begin CANOOLIBRARY_BOOK
create table CANOOLIBRARY_BOOK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(500),
    ISSUE_DATE date,
    EXCERPT longvarchar,
    ISBN varchar(255),
    --
    primary key (ID)
)^
-- end CANOOLIBRARY_BOOK
