// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGatewayAutoUpgradeConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetGatewayAutoUpgradeConfigurationRequest</p>
 */
public class SetGatewayAutoUpgradeConfigurationRequest extends Request {
    @Query
    @NameInMap("AutoUpgradeEndHour")
    @Validation(required = true)
    private Integer autoUpgradeEndHour;

    @Query
    @NameInMap("AutoUpgradeStartHour")
    @Validation(required = true)
    private Integer autoUpgradeStartHour;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IsAutoUpgrade")
    @Validation(required = true)
    private Boolean isAutoUpgrade;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetGatewayAutoUpgradeConfigurationRequest(Builder builder) {
        super(builder);
        this.autoUpgradeEndHour = builder.autoUpgradeEndHour;
        this.autoUpgradeStartHour = builder.autoUpgradeStartHour;
        this.gatewayId = builder.gatewayId;
        this.isAutoUpgrade = builder.isAutoUpgrade;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGatewayAutoUpgradeConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUpgradeEndHour
     */
    public Integer getAutoUpgradeEndHour() {
        return this.autoUpgradeEndHour;
    }

    /**
     * @return autoUpgradeStartHour
     */
    public Integer getAutoUpgradeStartHour() {
        return this.autoUpgradeStartHour;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return isAutoUpgrade
     */
    public Boolean getIsAutoUpgrade() {
        return this.isAutoUpgrade;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetGatewayAutoUpgradeConfigurationRequest, Builder> {
        private Integer autoUpgradeEndHour; 
        private Integer autoUpgradeStartHour; 
        private String gatewayId; 
        private Boolean isAutoUpgrade; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetGatewayAutoUpgradeConfigurationRequest request) {
            super(request);
            this.autoUpgradeEndHour = request.autoUpgradeEndHour;
            this.autoUpgradeStartHour = request.autoUpgradeStartHour;
            this.gatewayId = request.gatewayId;
            this.isAutoUpgrade = request.isAutoUpgrade;
            this.securityToken = request.securityToken;
        } 

        /**
         * AutoUpgradeEndHour.
         */
        public Builder autoUpgradeEndHour(Integer autoUpgradeEndHour) {
            this.putQueryParameter("AutoUpgradeEndHour", autoUpgradeEndHour);
            this.autoUpgradeEndHour = autoUpgradeEndHour;
            return this;
        }

        /**
         * AutoUpgradeStartHour.
         */
        public Builder autoUpgradeStartHour(Integer autoUpgradeStartHour) {
            this.putQueryParameter("AutoUpgradeStartHour", autoUpgradeStartHour);
            this.autoUpgradeStartHour = autoUpgradeStartHour;
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
         * IsAutoUpgrade.
         */
        public Builder isAutoUpgrade(Boolean isAutoUpgrade) {
            this.putQueryParameter("IsAutoUpgrade", isAutoUpgrade);
            this.isAutoUpgrade = isAutoUpgrade;
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
        public SetGatewayAutoUpgradeConfigurationRequest build() {
            return new SetGatewayAutoUpgradeConfigurationRequest(this);
        } 

    } 

}
