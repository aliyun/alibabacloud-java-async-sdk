// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketInventoryRequest</p>
 */
public class DeleteBucketInventoryRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("inventoryId")
    @Validation(required = true)
    private String inventoryId;

    private DeleteBucketInventoryRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.inventoryId = builder.inventoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketInventoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteBucketInventoryRequest, Builder> {
        private String bucket; 
        private String inventoryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketInventoryRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.inventoryId = request.inventoryId;
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
         * The ID of the inventory task to delete
         */
        public Builder inventoryId(String inventoryId) {
            this.putQueryParameter("inventoryId", inventoryId);
            this.inventoryId = inventoryId;
            return this;
        }

        @Override
        public DeleteBucketInventoryRequest build() {
            return new DeleteBucketInventoryRequest(this);
        } 

    } 

}
