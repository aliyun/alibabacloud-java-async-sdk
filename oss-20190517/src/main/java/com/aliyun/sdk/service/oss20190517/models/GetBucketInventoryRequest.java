// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>GetBucketInventoryRequest</p>
 */
public class GetBucketInventoryRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("inventoryId")
    @Validation(required = true)
    private String inventoryId;

    private GetBucketInventoryRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.inventoryId = builder.inventoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketInventoryRequest create() {
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

    public static final class Builder extends Request.Builder<GetBucketInventoryRequest, Builder> {
        private String bucket; 
        private String inventoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketInventoryRequest request) {
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
         * The ID of the inventory rule to query
         */
        public Builder inventoryId(String inventoryId) {
            this.putQueryParameter("inventoryId", inventoryId);
            this.inventoryId = inventoryId;
            return this;
        }

        @Override
        public GetBucketInventoryRequest build() {
            return new GetBucketInventoryRequest(this);
        } 

    } 

}
