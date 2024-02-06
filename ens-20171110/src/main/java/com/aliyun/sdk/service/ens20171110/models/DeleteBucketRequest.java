// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    private DeleteBucketRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
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

    public static final class Builder extends Request.Builder<DeleteBucketRequest, Builder> {
        private String bucketName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketRequest request) {
            super(request);
            this.bucketName = request.bucketName;
        } 

        /**
         * The name of the bucket that you want to delete. You can delete only one bucket at a time.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        @Override
        public DeleteBucketRequest build() {
            return new DeleteBucketRequest(this);
        } 

    } 

}
