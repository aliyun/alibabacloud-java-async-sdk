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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("inventoryId")
    private String inventoryId;

    @Body
    @NameInMap("inventoryConfiguration")
    private InventoryConfiguration inventoryConfiguration;


    private PutBucketInventoryRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.inventoryId = builder.inventoryId;
        this.inventoryConfiguration = builder.inventoryConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketInventoryRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return inventoryId
     */
    public String inventoryId() {
        return this.inventoryId;
    }

    /**
     * @return inventoryConfiguration
     */
    public InventoryConfiguration inventoryConfiguration() {
        return this.inventoryConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketInventoryRequest.Builder> {
        private String bucket; 
        private String inventoryId; 
        private InventoryConfiguration inventoryConfiguration; 

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

        /**
         * <p>inventoryConfiguration.</p>
         */
        public Builder inventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
            this.putBodyParameter("inventoryConfiguration", inventoryConfiguration);
            this.inventoryConfiguration = inventoryConfiguration;
            return this;
        }

        public PutBucketInventoryRequest build() {
            return new PutBucketInventoryRequest(this);
        } 

    } 

}
