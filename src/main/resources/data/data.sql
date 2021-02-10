-------------------------------------------------------------
-- users
-------------------------------------------------------------
INSERT INTO users (id, created_by, created_date, last_modified_date, last_modified_by, version, full_name, username, email) VALUES 
(1, 'system', now(), now(), 'system', 1, 'User 1', 'user1', 'user1@email.com'),
(2, 'system', now(), now(), 'system', 1, 'User 2', 'user2', 'user2@email.com'),
(3, 'system', now(), now(), 'system', 1, 'User 3', 'user3', 'user3@email.com'),
(4, 'system', now(), now(), 'system', 1, 'User 4', 'user4', 'user4@email.com'),
(5, 'system', now(), now(), 'system', 1, 'User 5', 'user5', 'user5@email.com'),
(6, 'system', now(), now(), 'system', 1, 'User 6', 'user6', 'user6@email.com'),
(7, 'system', now(), now(), 'system', 1, 'User 7', 'user7', 'user7@email.com'),
(8, 'system', now(), now(), 'system', 1, 'User 8', 'user8', 'user8@email.com'),
(9, 'system', now(), now(), 'system', 1, 'User 9', 'user9', 'user9@email.com'),
(10, 'system', now(), now(), 'system', 1, 'User 10', 'user10', 'user10@email.com');

-------------------------------------------------------------
-- features
-------------------------------------------------------------
INSERT INTO features (id, created_by, created_date, last_modified_date, last_modified_by, version, name, description) VALUES 
(1, 'system', now(), now(), 'system', 1, 'Feature 1', 'feature1'),
(2, 'system', now(), now(), 'system', 1, 'Feature 2', 'feature2'),
(3, 'system', now(), now(), 'system', 1, 'Feature 3', 'feature3'),
(4, 'system', now(), now(), 'system', 1, 'Feature 4', 'feature4'),
(5, 'system', now(), now(), 'system', 1, 'Feature 5', 'feature5'),
(6, 'system', now(), now(), 'system', 1, 'Feature 6', 'feature6'),
(7, 'system', now(), now(), 'system', 1, 'Feature 7', 'feature7'),
(8, 'system', now(), now(), 'system', 1, 'Feature 8', 'feature8'),
(9, 'system', now(), now(), 'system', 1, 'Feature 9', 'feature9'),
(10, 'system', now(), now(), 'system', 1, 'Feature 10', 'feature10');


-------------------------------------------------------------
-- permission
-------------------------------------------------------------
INSERT INTO permissions (id, created_by, created_date, last_modified_date, last_modified_by, version, user_id, feature_id, can_access) VALUES 
(1, 'system', now(), now(), 'system', 1, 1, 1, 1),
(2, 'system', now(), now(), 'system', 1, 1, 2, 1),
(3, 'system', now(), now(), 'system', 1, 1, 3, 1),
(4, 'system', now(), now(), 'system', 1, 1, 4, 1),
(5, 'system', now(), now(), 'system', 1, 1, 5, 1),
(6, 'system', now(), now(), 'system', 1, 1, 6, 1),
(7, 'system', now(), now(), 'system', 1, 1, 7, 1),
(8, 'system', now(), now(), 'system', 1, 1, 8, 1),
(9, 'system', now(), now(), 'system', 1, 1, 9, 1);
