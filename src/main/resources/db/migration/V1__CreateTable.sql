CREATE TABLE IF NOT EXISTS staffs_second(
    staff_id serial NOT NULL
  , first_name character varying(50)
  , last_name character varying(50)
  , created_by character varying(50)
  , created_at timestamp
  , updated_by character varying(50)
  , updated_at timestamp
  , version int
  , PRIMARY KEY (staff_id)
)