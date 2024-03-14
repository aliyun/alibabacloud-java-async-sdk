// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportBlockVolumesRequest} extends {@link RequestModel}
 *
 * <p>ReportBlockVolumesRequest</p>
 */
public class ReportBlockVolumesRequest extends Request {
    @Query
    @NameInMap("ClientUUID")
    @Validation(required = true)
    private String clientUUID;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("Info")
    private String info;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ReportBlockVolumesRequest(Builder builder) {
        super(builder);
        this.clientUUID = builder.clientUUID;
        this.gatewayId = builder.gatewayId;
        this.info = builder.info;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportBlockVolumesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientUUID
     */
    public String getClientUUID() {
        return this.clientUUID;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ReportBlockVolumesRequest, Builder> {
        private String clientUUID; 
        private String gatewayId; 
        private String info; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ReportBlockVolumesRequest request) {
            super(request);
            this.clientUUID = request.clientUUID;
            this.gatewayId = request.gatewayId;
            this.info = request.info;
            this.securityToken = request.securityToken;
        } 

        /**
         * ClientUUID.
         */
        public Builder clientUUID(String clientUUID) {
            this.putQueryParameter("ClientUUID", clientUUID);
            this.clientUUID = clientUUID;
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
         * Info.
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
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
        public ReportBlockVolumesRequest build() {
            return new ReportBlockVolumesRequest(this);
        } 

    } 

}
