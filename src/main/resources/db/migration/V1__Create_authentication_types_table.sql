CREATE TABLE authentication_types (
    id BIGSERIAL PRIMARY KEY,
    unique_id VARCHAR(128) NOT NULL UNIQUE,
    type VARCHAR(64) NOT NULL UNIQUE,
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ
);
