// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenDcdnServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenDcdnServiceRequest</p>
 */
public class OpenDcdnServiceRequest extends Request {
    @Query
    @NameInMap("BillType")
    @Validation(required = true)
    private String billType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("WebsocketBillType")
    @Validation(required = true)
    private String websocketBillType;

    private OpenDcdnServiceRequest(Builder builder) {
        super(builder);
        this.billType = builder.billType;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.websocketBillType = builder.websocketBillType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenDcdnServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billType
     */
    public String getBillType() {
        return this.billType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return websocketBillType
     */
    public String getWebsocketBillType() {
        return this.websocketBillType;
    }

    public static final class Builder extends Request.Builder<OpenDcdnServiceRequest, Builder> {
        private String billType; 
        private Long ownerId; 
        private String securityToken; 
        private String websocketBillType; 

        private Builder() {
            super();
        } 

        private Builder(OpenDcdnServiceRequest request) {
            super(request);
            this.billType = request.billType;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.websocketBillType = request.websocketBillType;
        } 

        /**
         * The metering method of DCDN. Valid values:
         * <p>
         * 
         * *   **PayByTraffic**: pay-by-traffic
         * *   **PayByBandwidth**: pay-by-bandwidth
         */
        public Builder billType(String billType) {
            this.putQueryParameter("BillType", billType);
            this.billType = billType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * The metering method of WebSocket. Valid values:
         * <p>
         * 
         * *   **websockettraffic**: pay-by-data-transfer
         * *   **websocketbps**: pay-by-bandwidth
         */
        public Builder websocketBillType(String websocketBillType) {
            this.putQueryParameter("WebsocketBillType", websocketBillType);
            this.websocketBillType = websocketBillType;
            return this;
        }

        @Override
        public OpenDcdnServiceRequest build() {
            return new OpenDcdnServiceRequest(this);
        } 

    } 

}
