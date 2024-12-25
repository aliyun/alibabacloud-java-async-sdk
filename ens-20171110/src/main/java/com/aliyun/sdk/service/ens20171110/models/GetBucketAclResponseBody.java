// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBucketAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketAclResponseBody</p>
 */
public class GetBucketAclResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketAcl")
    private String bucketAcl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ACL of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder bucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5C881388-2D4B-46F4-A96B-D4E6BD0886A2</p>
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
