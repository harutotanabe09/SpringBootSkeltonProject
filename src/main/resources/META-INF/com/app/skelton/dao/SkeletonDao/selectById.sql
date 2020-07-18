SELECT
  /*%expand*/*
FROM
  staffs
WHERE
  deleted_at IS NULL
  AND id = /* id */1