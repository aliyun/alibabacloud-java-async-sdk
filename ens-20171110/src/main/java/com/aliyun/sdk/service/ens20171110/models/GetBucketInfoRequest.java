// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketInfoRequest} extends {@link RequestModel}
 *
 * <p>GetBucketInfoRequest</p>
 */
public class GetBucketInfoRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    private GetBucketInfoRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetBucketInfoRequest, Builder> {
        private String bucketName; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketInfoRequest request) {
            super(request);
            this.bucketName = request.bucketName;
        } 

        /**
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        @Override
        public GetBucketInfoRequest build() {
            return new GetBucketInfoRequest(this);
        } 

    } 

}
