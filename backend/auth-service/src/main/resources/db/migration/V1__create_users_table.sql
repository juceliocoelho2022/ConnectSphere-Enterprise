CREATE TABLE users (

                       id BIGSERIAL PRIMARY KEY,

                       uuid UUID NOT NULL UNIQUE,

                       first_name VARCHAR(100) NOT NULL,

                       last_name VARCHAR(100),

                       email VARCHAR(255) NOT NULL UNIQUE,

                       password VARCHAR(255) NOT NULL,

                       enabled BOOLEAN NOT NULL DEFAULT TRUE,

                       account_non_locked BOOLEAN NOT NULL DEFAULT TRUE,

                       credentials_non_expired BOOLEAN NOT NULL DEFAULT TRUE,

                       created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

                       updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP

);