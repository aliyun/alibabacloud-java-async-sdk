// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayBlockVolumesRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayBlockVolumesRequest</p>
 */
public class DeleteGatewayBlockVolumesRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("IsSourceDeletion")
    private Boolean isSourceDeletion;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteGatewayBlockVolumesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.isSourceDeletion = builder.isSourceDeletion;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayBlockVolumesRequest create() {
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
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return isSourceDeletion
     */
    public Boolean getIsSourceDeletion() {
        return this.isSourceDeletion;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayBlockVolumesRequest, Builder> {
        private String gatewayId; 
        private String indexId; 
        private Boolean isSourceDeletion; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayBlockVolumesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.isSourceDeletion = request.isSourceDeletion;
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
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * IsSourceDeletion.
         */
        public Builder isSourceDeletion(Boolean isSourceDeletion) {
            this.putQueryParameter("IsSourceDeletion", isSourceDeletion);
            this.isSourceDeletion = isSourceDeletion;
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
        public DeleteGatewayBlockVolumesRequest build() {
            return new DeleteGatewayBlockVolumesRequest(this);
        } 

    } 

}
