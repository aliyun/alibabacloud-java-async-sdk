// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportGatewayInfoRequest} extends {@link RequestModel}
 *
 * <p>ReportGatewayInfoRequest</p>
 */
public class ReportGatewayInfoRequest extends Request {
    @Query
    @NameInMap("ClientUUID")
    @Validation(required = true)
    private String clientUUID;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("GatewayStatus")
    private String gatewayStatus;

    @Query
    @NameInMap("Info")
    private String info;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Time")
    private Long time;

    private ReportGatewayInfoRequest(Builder builder) {
        super(builder);
        this.clientUUID = builder.clientUUID;
        this.gatewayId = builder.gatewayId;
        this.gatewayStatus = builder.gatewayStatus;
        this.info = builder.info;
        this.securityToken = builder.securityToken;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportGatewayInfoRequest create() {
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
     * @return gatewayStatus
     */
    public String getGatewayStatus() {
        return this.gatewayStatus;
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

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<ReportGatewayInfoRequest, Builder> {
        private String clientUUID; 
        private String gatewayId; 
        private String gatewayStatus; 
        private String info; 
        private String securityToken; 
        private Long time; 

        private Builder() {
            super();
        } 

        private Builder(ReportGatewayInfoRequest request) {
            super(request);
            this.clientUUID = request.clientUUID;
            this.gatewayId = request.gatewayId;
            this.gatewayStatus = request.gatewayStatus;
            this.info = request.info;
            this.securityToken = request.securityToken;
            this.time = request.time;
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
         * GatewayStatus.
         */
        public Builder gatewayStatus(String gatewayStatus) {
            this.putQueryParameter("GatewayStatus", gatewayStatus);
            this.gatewayStatus = gatewayStatus;
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

        /**
         * Time.
         */
        public Builder time(Long time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public ReportGatewayInfoRequest build() {
            return new ReportGatewayInfoRequest(this);
        } 

    } 

}
