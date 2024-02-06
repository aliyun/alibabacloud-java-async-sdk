// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteObjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteObjectRequest</p>
 */
public class DeleteObjectRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("ObjectKey")
    @Validation(required = true)
    private String objectKey;

    private DeleteObjectRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.objectKey = builder.objectKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteObjectRequest create() {
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
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    public static final class Builder extends Request.Builder<DeleteObjectRequest, Builder> {
        private String bucketName; 
        private String objectKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteObjectRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.objectKey = request.objectKey;
        } 

        /**
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The name of the source file.
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
            return this;
        }

        @Override
        public DeleteObjectRequest build() {
            return new DeleteObjectRequest(this);
        } 

    } 

}
