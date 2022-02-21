// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBucketRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketRequest</p>
 */
public class DeleteBucketRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteBucketRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteBucketRequest, Builder> {
        private String bucketName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketRequest response) {
            super(response);
            this.bucketName = response.bucketName;
            this.ownerId = response.ownerId;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DeleteBucketRequest build() {
            return new DeleteBucketRequest(this);
        } 

    } 

}
