// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSharesBucketInfoForExpressSyncRequest} extends {@link RequestModel}
 *
 * <p>DescribeSharesBucketInfoForExpressSyncRequest</p>
 */
public class DescribeSharesBucketInfoForExpressSyncRequest extends Request {
    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("BucketRegion")
    private String bucketRegion;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeSharesBucketInfoForExpressSyncRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.bucketRegion = builder.bucketRegion;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSharesBucketInfoForExpressSyncRequest create() {
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
     * @return bucketRegion
     */
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeSharesBucketInfoForExpressSyncRequest, Builder> {
        private String bucketName; 
        private String bucketRegion; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSharesBucketInfoForExpressSyncRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.bucketRegion = request.bucketRegion;
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
         * BucketRegion.
         */
        public Builder bucketRegion(String bucketRegion) {
            this.putQueryParameter("BucketRegion", bucketRegion);
            this.bucketRegion = bucketRegion;
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
        public DescribeSharesBucketInfoForExpressSyncRequest build() {
            return new DescribeSharesBucketInfoForExpressSyncRequest(this);
        } 

    } 

}
