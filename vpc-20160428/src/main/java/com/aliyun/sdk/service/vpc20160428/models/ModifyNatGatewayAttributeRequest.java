// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyNatGatewayAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatGatewayAttributeRequest</p>
 */
public class ModifyNatGatewayAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipBindMode")
    private String eipBindMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSessionLog")
    private Boolean enableSessionLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IcmpReplyEnabled")
    private Boolean icmpReplyEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDelivery")
    private LogDelivery logDelivery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyNatGatewayAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eipBindMode = builder.eipBindMode;
        this.enableSessionLog = builder.enableSessionLog;
        this.icmpReplyEnabled = builder.icmpReplyEnabled;
        this.logDelivery = builder.logDelivery;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatGatewayAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eipBindMode
     */
    public String getEipBindMode() {
        return this.eipBindMode;
    }

    /**
     * @return enableSessionLog
     */
    public Boolean getEnableSessionLog() {
        return this.enableSessionLog;
    }

    /**
     * @return icmpReplyEnabled
     */
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    /**
     * @return logDelivery
     */
    public LogDelivery getLogDelivery() {
        return this.logDelivery;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyNatGatewayAttributeRequest, Builder> {
        private String description; 
        private String eipBindMode; 
        private Boolean enableSessionLog; 
        private Boolean icmpReplyEnabled; 
        private LogDelivery logDelivery; 
        private String name; 
        private String natGatewayId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatGatewayAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.eipBindMode = request.eipBindMode;
            this.enableSessionLog = request.enableSessionLog;
            this.icmpReplyEnabled = request.icmpReplyEnabled;
            this.logDelivery = request.logDelivery;
            this.name = request.name;
            this.natGatewayId = request.natGatewayId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The description of the NAT gateway that you want to modify.</p>
         * <p>The description must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The EIP attach pattern of the NAT gateway. Valid values: The value can be empty. If the value is not empty, only <strong>NAT</strong> is allowed, which indicates that the attach pattern is EIP Normal pattern.</p>
         * <blockquote>
         * <ul>
         * <li>You can only change the pattern from <strong>MULTI_BINDED</strong> to <strong>NAT</strong>. You cannot change the pattern from <strong>NAT</strong> to <strong>MULTI_BINDED</strong>. For more information about the <strong>MULTI_BINDED</strong> pattern, see <a href="https://help.aliyun.com/document_detail/120219.html">CreateNatGateway</a>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>During the EIP attach pattern switchover procedure, network connectivity may experience second-level transient connections (the transient connection duration increases as the number of EIPs increases. Currently, configuration changes are supported for NAT gateways with up to 5 EIPs attached). Execute the switchover during off-peak hours.</li>
         * <li>After the EIP attach pattern is changed to <strong>NAT</strong>, the Internet NAT gateway is compatible with the IPv4 gateway. However, attaching a public EIP occupies a private IP in the vSwitch where the NAT gateway resides. Make sure that sufficient private IP addresses are available in the vSwitch. If no available idle private IP addresses exist in the vSwitch, new EIPs cannot be attached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAT</p>
         */
        public Builder eipBindMode(String eipBindMode) {
            this.putQueryParameter("EipBindMode", eipBindMode);
            this.eipBindMode = eipBindMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable session logging. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Session logging is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Session logging is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSessionLog(Boolean enableSessionLog) {
            this.putQueryParameter("EnableSessionLog", enableSessionLog);
            this.enableSessionLog = enableSessionLog;
            return this;
        }

        /**
         * <p>Specifies whether to enable ICMP echo reply. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder icmpReplyEnabled(Boolean icmpReplyEnabled) {
            this.putQueryParameter("IcmpReplyEnabled", icmpReplyEnabled);
            this.icmpReplyEnabled = icmpReplyEnabled;
            return this;
        }

        /**
         * <p>The session log configuration.</p>
         */
        public Builder logDelivery(LogDelivery logDelivery) {
            String logDeliveryShrink = shrink(logDelivery, "LogDelivery", "json");
            this.putQueryParameter("LogDelivery", logDeliveryShrink);
            this.logDelivery = logDelivery;
            return this;
        }

        /**
         * <p>The name of the NAT gateway that you want to modify.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>nat123</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-2ze0dcn4mq31qx2jc****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The region ID of the NAT gateway that you want to modify. </p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyNatGatewayAttributeRequest build() {
            return new ModifyNatGatewayAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyNatGatewayAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNatGatewayAttributeRequest</p>
     */
    public static class LogDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogDeliveryType")
        private String logDeliveryType;

        @com.aliyun.core.annotation.NameInMap("LogDestination")
        private String logDestination;

        private LogDelivery(Builder builder) {
            this.logDeliveryType = builder.logDeliveryType;
            this.logDestination = builder.logDestination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDelivery create() {
            return builder().build();
        }

        /**
         * @return logDeliveryType
         */
        public String getLogDeliveryType() {
            return this.logDeliveryType;
        }

        /**
         * @return logDestination
         */
        public String getLogDestination() {
            return this.logDestination;
        }

        public static final class Builder {
            private String logDeliveryType; 
            private String logDestination; 

            private Builder() {
            } 

            private Builder(LogDelivery model) {
                this.logDeliveryType = model.logDeliveryType;
                this.logDestination = model.logDestination;
            } 

            /**
             * <p>The type of session log delivery. Valid values: <strong>sls</strong>, which indicates Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder logDeliveryType(String logDeliveryType) {
                this.logDeliveryType = logDeliveryType;
                return this;
            }

            /**
             * <p>The destination address for session log delivery. Value: acs:log:${regionName}:${projectOwnerAliUid}:project/${projectName}/logstore/${logstoreName}</p>
             * 
             * <strong>example:</strong>
             * <p>acs:log:cn-hangzhou:0000:project/nat_session_log_project/logstore/session_log_test</p>
             */
            public Builder logDestination(String logDestination) {
                this.logDestination = logDestination;
                return this;
            }

            public LogDelivery build() {
                return new LogDelivery(this);
            } 

        } 

    }
}
