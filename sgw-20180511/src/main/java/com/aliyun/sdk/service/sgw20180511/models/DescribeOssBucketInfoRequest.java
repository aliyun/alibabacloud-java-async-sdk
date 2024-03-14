// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssBucketInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssBucketInfoRequest</p>
 */
public class DescribeOssBucketInfoRequest extends Request {
    @Query
    @NameInMap("BucketEndpoint")
    private String bucketEndpoint;

    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("GatewayId")
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeOssBucketInfoRequest(Builder builder) {
        super(builder);
        this.bucketEndpoint = builder.bucketEndpoint;
        this.bucketName = builder.bucketName;
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssBucketInfoRequest create() {
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
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeOssBucketInfoRequest, Builder> {
        private String bucketEndpoint; 
        private String bucketName; 
        private String gatewayId; 
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssBucketInfoRequest request) {
            super(request);
            this.bucketEndpoint = request.bucketEndpoint;
            this.bucketName = request.bucketName;
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.type = request.type;
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
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeOssBucketInfoRequest build() {
            return new DescribeOssBucketInfoRequest(this);
        } 

    } 

}
