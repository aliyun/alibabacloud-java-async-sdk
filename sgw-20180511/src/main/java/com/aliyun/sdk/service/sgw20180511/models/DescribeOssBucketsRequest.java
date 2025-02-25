// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssBucketsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssBucketsRequest</p>
 */
public class DescribeOssBucketsRequest extends Request {
    @Query
    @NameInMap("BucketEndpoint")
    private String bucketEndpoint;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeOssBucketsRequest(Builder builder) {
        super(builder);
        this.bucketEndpoint = builder.bucketEndpoint;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssBucketsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketEndpoint
     */
    public String getBucketEndpoint() {
        return this.bucketEndpoint;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeOssBucketsRequest, Builder> {
        private String bucketEndpoint; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssBucketsRequest request) {
            super(request);
            this.bucketEndpoint = request.bucketEndpoint;
            this.securityToken = request.securityToken;
        } 

        /**
         * BucketEndpoint.
         */
        public Builder bucketEndpoint(String bucketEndpoint) {
            this.putQueryParameter("BucketEndpoint", bucketEndpoint);
            this.bucketEndpoint = bucketEndpoint;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeOssBucketsRequest build() {
            return new DescribeOssBucketsRequest(this);
        } 

    } 

}
