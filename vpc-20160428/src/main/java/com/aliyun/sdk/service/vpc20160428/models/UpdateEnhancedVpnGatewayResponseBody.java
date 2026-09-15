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
 * {@link UpdateEnhancedVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEnhancedVpnGatewayResponseBody</p>
 */
public class UpdateEnhancedVpnGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoPropagate")
    private Boolean autoPropagate;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisasterRecoveryVSwitchId")
    private String disasterRecoveryVSwitchId;

    @com.aliyun.core.annotation.NameInMap("EnableBgp")
    private Boolean enableBgp;

    @com.aliyun.core.annotation.NameInMap("EniInstanceIds")
    private EniInstanceIds eniInstanceIds;

    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    @com.aliyun.core.annotation.NameInMap("VpnType")
    private String vpnType;

    private UpdateEnhancedVpnGatewayResponseBody(Builder builder) {
        this.autoPropagate = builder.autoPropagate;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.disasterRecoveryVSwitchId = builder.disasterRecoveryVSwitchId;
        this.enableBgp = builder.enableBgp;
        this.eniInstanceIds = builder.eniInstanceIds;
        this.gatewayType = builder.gatewayType;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.tags = builder.tags;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.vpnGatewayId = builder.vpnGatewayId;
        this.vpnType = builder.vpnType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnhancedVpnGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPropagate
     */
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disasterRecoveryVSwitchId
     */
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    /**
     * @return enableBgp
     */
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    /**
     * @return eniInstanceIds
     */
    public EniInstanceIds getEniInstanceIds() {
        return this.eniInstanceIds;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * @return vpnType
     */
    public String getVpnType() {
        return this.vpnType;
    }

    public static final class Builder {
        private Boolean autoPropagate; 
        private Long createTime; 
        private String description; 
        private String disasterRecoveryVSwitchId; 
        private Boolean enableBgp; 
        private EniInstanceIds eniInstanceIds; 
        private String gatewayType; 
        private String name; 
        private String networkType; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private String tag; 
        private Tags tags; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpnGatewayId; 
        private String vpnType; 

        private Builder() {
        } 

        private Builder(UpdateEnhancedVpnGatewayResponseBody model) {
            this.autoPropagate = model.autoPropagate;
            this.createTime = model.createTime;
            this.description = model.description;
            this.disasterRecoveryVSwitchId = model.disasterRecoveryVSwitchId;
            this.enableBgp = model.enableBgp;
            this.eniInstanceIds = model.eniInstanceIds;
            this.gatewayType = model.gatewayType;
            this.name = model.name;
            this.networkType = model.networkType;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tag = model.tag;
            this.tags = model.tags;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
            this.vpnGatewayId = model.vpnGatewayId;
            this.vpnType = model.vpnType;
        } 

        /**
         * <p>Indicates whether BGP route automatic propagation to the VPC is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Automatic propagation is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Automatic propagation is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPropagate(Boolean autoPropagate) {
            this.autoPropagate = autoPropagate;
            return this;
        }

        /**
         * <p>The timestamp when the enhanced VPN gateway instance was created. Unit: milliseconds.<br>
         * The timestamp follows the UNIX time format, which represents the total number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492753580000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the enhanced VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the second vSwitch associated with the enhanced VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w95ql6tmr2ludkt****</p>
         */
        public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }

        /**
         * <p>The enabling status of the BGP feature for the enhanced VPN gateway. Valid values:<br></p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        /**
         * EniInstanceIds.
         */
        public Builder eniInstanceIds(EniInstanceIds eniInstanceIds) {
            this.eniInstanceIds = eniInstanceIds;
            return this;
        }

        /**
         * <p>The type of the enhanced VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>Enhanced.SiteToSite</strong>: enhanced site-to-cloud VPN that supports only IPsec functionality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enhanced.SiteToSite</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The name of the enhanced VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the enhanced VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>public</strong> (default): public VPN gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the enhanced VPN gateway instance belongs.<br>
         * You can call <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> to query resource group information.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the enhanced VPN gateway.</p>
         * <ul>
         * <li><strong>init</strong>: initializing.</li>
         * <li><strong>provisioning</strong>: preparing.</li>
         * <li><strong>active</strong>: normal.</li>
         * <li><strong>updating</strong>: updating.</li>
         * <li><strong>deleting</strong>: deleting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of features supported by the enhanced VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VpnEnableBgp&quot;: true}</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the vSwitch associated with the enhanced VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1y9ovl1cu9ou4tv****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the enhanced VPN gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ub1yt9cvakoel****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the enhanced VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * <p>The type of the enhanced VPN gateway.</p>
         * <ul>
         * <li><strong>Normal</strong> (default): standard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder vpnType(String vpnType) {
            this.vpnType = vpnType;
            return this;
        }

        public UpdateEnhancedVpnGatewayResponseBody build() {
            return new UpdateEnhancedVpnGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEnhancedVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateEnhancedVpnGatewayResponseBody</p>
     */
    public static class EniInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private java.util.List<String> eniInstanceId;

        private EniInstanceIds(Builder builder) {
            this.eniInstanceId = builder.eniInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EniInstanceIds create() {
            return builder().build();
        }

        /**
         * @return eniInstanceId
         */
        public java.util.List<String> getEniInstanceId() {
            return this.eniInstanceId;
        }

        public static final class Builder {
            private java.util.List<String> eniInstanceId; 

            private Builder() {
            } 

            private Builder(EniInstanceIds model) {
                this.eniInstanceId = model.eniInstanceId;
            } 

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(java.util.List<String> eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            public EniInstanceIds build() {
                return new EniInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEnhancedVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateEnhancedVpnGatewayResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEnhancedVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateEnhancedVpnGatewayResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * <p>The list of features supported by the enhanced VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VpnEnableBgp&quot;: true}</p>
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
