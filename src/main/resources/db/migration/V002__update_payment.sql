ALTER TABLE payments
ALTER COLUMN order_id TYPE uuid USING order_id::uuid;