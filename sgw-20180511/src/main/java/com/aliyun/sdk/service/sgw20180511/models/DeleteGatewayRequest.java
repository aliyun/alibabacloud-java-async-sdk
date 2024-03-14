// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayRequest</p>
 */
public class DeleteGatewayRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("ReasonDetail")
    private String reasonDetail;

    @Query
    @NameInMap("ReasonType")
    private String reasonType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.reasonDetail = builder.reasonDetail;
        this.reasonType = builder.reasonType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayRequest create() {
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
     * @return reasonDetail
     */
    public String getReasonDetail() {
        return this.reasonDetail;
    }

    /**
     * @return reasonType
     */
    public String getReasonType() {
        return this.reasonType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayRequest, Builder> {
        private String gatewayId; 
        private String reasonDetail; 
        private String reasonType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.reasonDetail = request.reasonDetail;
            this.reasonType = request.reasonType;
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
         * ReasonDetail.
         */
        public Builder reasonDetail(String reasonDetail) {
            this.putQueryParameter("ReasonDetail", reasonDetail);
            this.reasonDetail = reasonDetail;
            return this;
        }

        /**
         * ReasonType.
         */
        public Builder reasonType(String reasonType) {
            this.putQueryParameter("ReasonType", reasonType);
            this.reasonType = reasonType;
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
        public DeleteGatewayRequest build() {
            return new DeleteGatewayRequest(this);
        } 

    } 

}
