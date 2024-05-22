// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketAclRequest} extends {@link RequestModel}
 *
 * <p>GetBucketAclRequest</p>
 */
public class GetBucketAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    private GetBucketAclRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketAclRequest create() {
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

    public static final class Builder extends Request.Builder<GetBucketAclRequest, Builder> {
        private String bucketName; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketAclRequest request) {
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
        public GetBucketAclRequest build() {
            return new GetBucketAclRequest(this);
        } 

    } 

}
