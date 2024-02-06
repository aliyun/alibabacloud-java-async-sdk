// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketAclResponseBody</p>
 */
public class GetBucketAclResponseBody extends TeaModel {
    @NameInMap("BucketAcl")
    private String bucketAcl;

    @NameInMap("RequestId")
    private String requestId;

    private GetBucketAclResponseBody(Builder builder) {
        this.bucketAcl = builder.bucketAcl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketAcl
     */
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bucketAcl; 
        private String requestId; 

        /**
         * The ACL of the bucket.
         */
        public Builder bucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBucketAclResponseBody build() {
            return new GetBucketAclResponseBody(this);
        } 

    } 

}
