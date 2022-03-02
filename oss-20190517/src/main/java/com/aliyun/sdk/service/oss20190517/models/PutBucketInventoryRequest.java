// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>PutBucketInventoryRequest</p>
 */
public class PutBucketInventoryRequest extends Request {
    @Body
    @NameInMap("InventoryConfiguration")
    @Validation(required = true)
    private InventoryConfiguration inventoryConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("inventoryId")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PutBucketInventoryRequest, Builder> {
        private InventoryConfiguration inventoryConfiguration; 
        private String bucket; 
        private String inventoryId; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketInventoryRequest request) {
            super(request);
            this.inventoryConfiguration = request.inventoryConfiguration;
            this.bucket = request.bucket;
            this.inventoryId = request.inventoryId;
        } 

        /**
         * InventoryConfiguration.
         */
        public Builder inventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
            this.putBodyParameter("InventoryConfiguration", inventoryConfiguration);
            this.inventoryConfiguration = inventoryConfiguration;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * inventoryId.
         */
        public Builder inventoryId(String inventoryId) {
            this.putQueryParameter("inventoryId", inventoryId);
            this.inventoryId = inventoryId;
            return this;
        }

        @Override
        public PutBucketInventoryRequest build() {
            return new PutBucketInventoryRequest(this);
        } 

    } 

}
