// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayImagesRequest</p>
 */
public class DescribeGatewayImagesRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeGatewayImagesRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeGatewayImagesRequest, Builder> {
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayImagesRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.type = request.type;
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
        public DescribeGatewayImagesRequest build() {
            return new DescribeGatewayImagesRequest(this);
        } 

    } 

}
