// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBucketInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateBucketInfoRequest</p>
 */
public class UpdateBucketInfoRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UpdateBucketInfoRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.comment = builder.comment;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBucketInfoRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UpdateBucketInfoRequest, Builder> {
        private String bucketName; 
        private String comment; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBucketInfoRequest response) {
            super(response);
            this.bucketName = response.bucketName;
            this.comment = response.comment;
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
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
        public UpdateBucketInfoRequest build() {
            return new UpdateBucketInfoRequest(this);
        } 

    } 

}
