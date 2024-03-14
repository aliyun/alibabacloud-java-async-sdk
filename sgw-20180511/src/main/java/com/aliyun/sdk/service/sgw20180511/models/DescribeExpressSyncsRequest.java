// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressSyncsRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressSyncsRequest</p>
 */
public class DescribeExpressSyncsRequest extends Request {
    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("BucketPrefix")
    private String bucketPrefix;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeExpressSyncsRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.bucketPrefix = builder.bucketPrefix;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressSyncsRequest create() {
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
     * @return bucketPrefix
     */
    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeExpressSyncsRequest, Builder> {
        private String bucketName; 
        private String bucketPrefix; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressSyncsRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.bucketPrefix = request.bucketPrefix;
            this.securityToken = request.securityToken;
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
         * BucketPrefix.
         */
        public Builder bucketPrefix(String bucketPrefix) {
            this.putQueryParameter("BucketPrefix", bucketPrefix);
            this.bucketPrefix = bucketPrefix;
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
        public DescribeExpressSyncsRequest build() {
            return new DescribeExpressSyncsRequest(this);
        } 

    } 

}
