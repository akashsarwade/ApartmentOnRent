
CREATE TABLE clients (
    client_id UUID PRIMARY KEY,
    full_name VARCHAR(100) NULL,
    email VARCHAR(100) NULL,
    phone VARCHAR(16) NULL
);

CREATE TABLE client_apartments (
    apartment_id UUID PRIMARY KEY,
    description VARCHAR(100) NULL,
    building_name VARCHAR(100) NULL,
    street_address VARCHAR(100) NULL,
    city VARCHAR(100) NULL,
    postal_code VARCHAR(10) NULL,
    is_available_for_rent BOOLEAN NULL,
    rent_price INTEGER NULL,
    client_id UUID REFERENCES clients
);