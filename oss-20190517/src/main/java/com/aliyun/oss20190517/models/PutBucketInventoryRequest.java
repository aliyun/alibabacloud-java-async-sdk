// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>PutBucketInventoryRequest</p>
 */
public class PutBucketInventoryRequest extends Request {
    @Body
    @NameInMap("InventoryConfiguration")
    private InventoryConfiguration inventoryConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("inventoryId")
    private String inventoryId;


    private PutBucketInventoryRequest(Builder builder) {
        super(builder);
        this.inventoryConfiguration = builder.inventoryConfiguration;
        this.bucket = builder.bucket;
        this.inventoryId = builder.inventoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketInventoryRequest create() {
        return builder().build();
    }

    /**
     * @return inventoryConfiguration
     */
    public InventoryConfiguration getInventoryConfiguration() {
        return this.inventoryConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return inventoryId
     */
    public String getInventoryId() {
        return this.inventoryId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private InventoryConfiguration inventoryConfiguration; 
        private String bucket; 
        private String inventoryId; 

        /**
         * <p>InventoryConfiguration.</p>
         */
        public Builder inventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
            this.putBodyParameter("InventoryConfiguration", inventoryConfiguration);
            this.inventoryConfiguration = inventoryConfiguration;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>inventoryId.</p>
         */
        public Builder inventoryId(String inventoryId) {
            this.putQueryParameter("inventoryId", inventoryId);
            this.inventoryId = inventoryId;
            return this;
        }

        public PutBucketInventoryRequest build() {
            return new PutBucketInventoryRequest(this);
        } 

    } 

}
