// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCdnServiceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdnServiceRequest</p>
 */
public class ModifyCdnServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ModifyCdnServiceRequest(Builder builder) {
        super(builder);
        this.internetChargeType = builder.internetChargeType;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdnServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
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

    public static final class Builder extends Request.Builder<ModifyCdnServiceRequest, Builder> {
        private String internetChargeType; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdnServiceRequest request) {
            super(request);
            this.internetChargeType = request.internetChargeType;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The new metering method for Alibaba Cloud CDN. Valid values:</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
         * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
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

        @Override
        public ModifyCdnServiceRequest build() {
            return new ModifyCdnServiceRequest(this);
        } 

    } 

}
