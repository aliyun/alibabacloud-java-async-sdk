// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeKmsKeyRequest</p>
 */
public class DescribeKmsKeyRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("KmsKey")
    @Validation(required = true)
    private String kmsKey;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeKmsKeyRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.kmsKey = builder.kmsKey;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKmsKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return kmsKey
     */
    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeKmsKeyRequest, Builder> {
        private String gatewayId; 
        private String kmsKey; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKmsKeyRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.kmsKey = request.kmsKey;
            this.securityToken = request.securityToken;
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
         * KmsKey.
         */
        public Builder kmsKey(String kmsKey) {
            this.putQueryParameter("KmsKey", kmsKey);
            this.kmsKey = kmsKey;
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
        public DescribeKmsKeyRequest build() {
            return new DescribeKmsKeyRequest(this);
        } 

    } 

}
