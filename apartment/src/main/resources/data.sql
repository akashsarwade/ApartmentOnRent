INSERT INTO
    clients(client_id, full_name, email, phone)
VALUES
    ('87009ba1-6da0-431a-8ff9-73182d506e6d', 'Clark Kent', 'clark.kent@mail.com', '999-9999');
 
INSERT INTO
    clients(client_id, full_name, email, phone)
VALUES
    ('a0da67a8-5bf7-44f5-8e53-5d23b8afe952', 'Bruce Wayne', 'bruce.wayne@mail.com', '888-8888');
   
	  
INSERT INTO
    client_apartments(
        apartment_id, description, building_name, street_address,
        city, postal_code, is_available_for_rent, rent_price, client_id
    )
VALUES
    (
        'd681955b-b6dd-4169-849d-fc27bfeb775e',
        'Clark building 1',
        'Daily Planet Tower',
        '101 Metro Main Street',
        'Metropolis',
        '11111',
        TRUE,
        '472895',
        '87009ba1-6da0-431a-8ff9-73182d506e6d'
    );
	  
INSERT INTO
    client_apartments(
        apartment_id, description, building_name, street_address,
        city, postal_code, is_available_for_rent, rent_price, client_id
    )
VALUES
    (
        '94eece17-a7ff-428e-9b68-a6db0aa8e5f7',
        'Bruce building 1',
        'Wayne Hospital',
        '401 Gotham Main Street',
        'Gotham',
        '22222',
        TRUE,
        '683995',
        'a0da67a8-5bf7-44f5-8e53-5d23b8afe952'
    );
 
INSERT INTO
    client_apartments(
        apartment_id, description, building_name, street_address,
        city, postal_code, is_available_for_rent, rent_price, client_id
    )
VALUES
    (
        'c345633f-2477-4638-aade-49c9f5ffa163',
        'Bruce building 2',
        'Wayne Hotel',
        '402 Gotham Main Street',
        'Gotham',
        '22222',
        TRUE,
        '320157',
        'a0da67a8-5bf7-44f5-8e53-5d23b8afe952'
    );