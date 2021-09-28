// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketInventoryRequest</p>
 */
public class DeleteBucketInventoryRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("inventoryId")
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

    public static final class Builder extends Request.Builder<DeleteBucketInventoryRequest.Builder> {
        private String bucket; 
        private String inventoryId; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The ID of the inventory task to delete</p>
         */
        public Builder inventoryId(String inventoryId) {
            this.putQueryParameter("inventoryId", inventoryId);
            this.inventoryId = inventoryId;
            return this;
        }

        public DeleteBucketInventoryRequest build() {
            return new DeleteBucketInventoryRequest(this);
        } 

    } 

}
