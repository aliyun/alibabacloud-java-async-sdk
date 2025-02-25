// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsToGatewayRequest} extends {@link RequestModel}
 *
 * <p>AddTagsToGatewayRequest</p>
 */
public class AddTagsToGatewayRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private AddTagsToGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagsToGatewayRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AddTagsToGatewayRequest, Builder> {
        private String gatewayId; 
        private String securityToken; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsToGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.tags = request.tags;
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
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public AddTagsToGatewayRequest build() {
            return new AddTagsToGatewayRequest(this);
        } 

    } 

}
