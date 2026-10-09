// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeTrFirewallsV2DetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2DetailResponseBody</p>
 */
public class DescribeTrFirewallsV2DetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.NameInMap("FirewallAttachmentZone")
    private String firewallAttachmentZone;

    @com.aliyun.core.annotation.NameInMap("FirewallDescription")
    private String firewallDescription;

    @com.aliyun.core.annotation.NameInMap("FirewallEniId")
    private String firewallEniId;

    @com.aliyun.core.annotation.NameInMap("FirewallEniVpcId")
    private String firewallEniVpcId;

    @com.aliyun.core.annotation.NameInMap("FirewallEniVswitchId")
    private String firewallEniVswitchId;

    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.NameInMap("FirewallName")
    private String firewallName;

    @com.aliyun.core.annotation.NameInMap("FirewallServiceMode")
    private String firewallServiceMode;

    @com.aliyun.core.annotation.NameInMap("FirewallServiceZones")
    private java.util.List<String> firewallServiceZones;

    @com.aliyun.core.annotation.NameInMap("FirewallStatus")
    private String firewallStatus;

    @com.aliyun.core.annotation.NameInMap("FirewallSubnetCidr")
    private String firewallSubnetCidr;

    @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @com.aliyun.core.annotation.NameInMap("FirewallVpcCidr")
    private String firewallVpcCidr;

    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMode")
    private String routeMode;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentId")
    private String trAttachmentId;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterCidr")
    @Deprecated
    private String trAttachmentMasterCidr;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterZone")
    @Deprecated
    private String trAttachmentMasterZone;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveCidr")
    @Deprecated
    private String trAttachmentSlaveCidr;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveZone")
    @Deprecated
    private String trAttachmentSlaveZone;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentZones")
    private java.util.List<TrAttachmentZones> trAttachmentZones;

    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private DescribeTrFirewallsV2DetailResponseBody(Builder builder) {
        this.cenId = builder.cenId;
        this.firewallAttachmentZone = builder.firewallAttachmentZone;
        this.firewallDescription = builder.firewallDescription;
        this.firewallEniId = builder.firewallEniId;
        this.firewallEniVpcId = builder.firewallEniVpcId;
        this.firewallEniVswitchId = builder.firewallEniVswitchId;
        this.firewallId = builder.firewallId;
        this.firewallName = builder.firewallName;
        this.firewallServiceMode = builder.firewallServiceMode;
        this.firewallServiceZones = builder.firewallServiceZones;
        this.firewallStatus = builder.firewallStatus;
        this.firewallSubnetCidr = builder.firewallSubnetCidr;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.firewallVpcCidr = builder.firewallVpcCidr;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
        this.routeMode = builder.routeMode;
        this.trAttachmentId = builder.trAttachmentId;
        this.trAttachmentMasterCidr = builder.trAttachmentMasterCidr;
        this.trAttachmentMasterZone = builder.trAttachmentMasterZone;
        this.trAttachmentSlaveCidr = builder.trAttachmentSlaveCidr;
        this.trAttachmentSlaveZone = builder.trAttachmentSlaveZone;
        this.trAttachmentZones = builder.trAttachmentZones;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2DetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return firewallAttachmentZone
     */
    public String getFirewallAttachmentZone() {
        return this.firewallAttachmentZone;
    }

    /**
     * @return firewallDescription
     */
    public String getFirewallDescription() {
        return this.firewallDescription;
    }

    /**
     * @return firewallEniId
     */
    public String getFirewallEniId() {
        return this.firewallEniId;
    }

    /**
     * @return firewallEniVpcId
     */
    public String getFirewallEniVpcId() {
        return this.firewallEniVpcId;
    }

    /**
     * @return firewallEniVswitchId
     */
    public String getFirewallEniVswitchId() {
        return this.firewallEniVswitchId;
    }

    /**
     * @return firewallId
     */
    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * @return firewallName
     */
    public String getFirewallName() {
        return this.firewallName;
    }

    /**
     * @return firewallServiceMode
     */
    public String getFirewallServiceMode() {
        return this.firewallServiceMode;
    }

    /**
     * @return firewallServiceZones
     */
    public java.util.List<String> getFirewallServiceZones() {
        return this.firewallServiceZones;
    }

    /**
     * @return firewallStatus
     */
    public String getFirewallStatus() {
        return this.firewallStatus;
    }

    /**
     * @return firewallSubnetCidr
     */
    public String getFirewallSubnetCidr() {
        return this.firewallSubnetCidr;
    }

    /**
     * @return firewallSwitchStatus
     */
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    /**
     * @return firewallVpcCidr
     */
    public String getFirewallVpcCidr() {
        return this.firewallVpcCidr;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeMode
     */
    public String getRouteMode() {
        return this.routeMode;
    }

    /**
     * @return trAttachmentId
     */
    public String getTrAttachmentId() {
        return this.trAttachmentId;
    }

    /**
     * @return trAttachmentMasterCidr
     */
    public String getTrAttachmentMasterCidr() {
        return this.trAttachmentMasterCidr;
    }

    /**
     * @return trAttachmentMasterZone
     */
    public String getTrAttachmentMasterZone() {
        return this.trAttachmentMasterZone;
    }

    /**
     * @return trAttachmentSlaveCidr
     */
    public String getTrAttachmentSlaveCidr() {
        return this.trAttachmentSlaveCidr;
    }

    /**
     * @return trAttachmentSlaveZone
     */
    public String getTrAttachmentSlaveZone() {
        return this.trAttachmentSlaveZone;
    }

    /**
     * @return trAttachmentZones
     */
    public java.util.List<TrAttachmentZones> getTrAttachmentZones() {
        return this.trAttachmentZones;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder {
        private String cenId; 
        private String firewallAttachmentZone; 
        private String firewallDescription; 
        private String firewallEniId; 
        private String firewallEniVpcId; 
        private String firewallEniVswitchId; 
        private String firewallId; 
        private String firewallName; 
        private String firewallServiceMode; 
        private java.util.List<String> firewallServiceZones; 
        private String firewallStatus; 
        private String firewallSubnetCidr; 
        private String firewallSwitchStatus; 
        private String firewallVpcCidr; 
        private String regionNo; 
        private String requestId; 
        private String routeMode; 
        private String trAttachmentId; 
        private String trAttachmentMasterCidr; 
        private String trAttachmentMasterZone; 
        private String trAttachmentSlaveCidr; 
        private String trAttachmentSlaveZone; 
        private java.util.List<TrAttachmentZones> trAttachmentZones; 
        private String transitRouterId; 

        private Builder() {
        } 

        private Builder(DescribeTrFirewallsV2DetailResponseBody model) {
            this.cenId = model.cenId;
            this.firewallAttachmentZone = model.firewallAttachmentZone;
            this.firewallDescription = model.firewallDescription;
            this.firewallEniId = model.firewallEniId;
            this.firewallEniVpcId = model.firewallEniVpcId;
            this.firewallEniVswitchId = model.firewallEniVswitchId;
            this.firewallId = model.firewallId;
            this.firewallName = model.firewallName;
            this.firewallServiceMode = model.firewallServiceMode;
            this.firewallServiceZones = model.firewallServiceZones;
            this.firewallStatus = model.firewallStatus;
            this.firewallSubnetCidr = model.firewallSubnetCidr;
            this.firewallSwitchStatus = model.firewallSwitchStatus;
            this.firewallVpcCidr = model.firewallVpcCidr;
            this.regionNo = model.regionNo;
            this.requestId = model.requestId;
            this.routeMode = model.routeMode;
            this.trAttachmentId = model.trAttachmentId;
            this.trAttachmentMasterCidr = model.trAttachmentMasterCidr;
            this.trAttachmentMasterZone = model.trAttachmentMasterZone;
            this.trAttachmentSlaveCidr = model.trAttachmentSlaveCidr;
            this.trAttachmentSlaveZone = model.trAttachmentSlaveZone;
            this.trAttachmentZones = model.trAttachmentZones;
            this.transitRouterId = model.transitRouterId;
        } 

        /**
         * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
         * 
         * <strong>example:</strong>
         * <p>cen-37nddhri7jf0d2****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The zone ID used by the firewall connection.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder firewallAttachmentZone(String firewallAttachmentZone) {
            this.firewallAttachmentZone = firewallAttachmentZone;
            return this;
        }

        /**
         * <p>The description of the firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-firewall-description</p>
         */
        public Builder firewallDescription(String firewallDescription) {
            this.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * <p>The ID of the firewall ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-uf621u00nafypeex****</p>
         */
        public Builder firewallEniId(String firewallEniId) {
            this.firewallEniId = firewallEniId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the firewall ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeppcci782zeh2bk****</p>
         */
        public Builder firewallEniVpcId(String firewallEniVpcId) {
            this.firewallEniVpcId = firewallEniVpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the firewall ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6ptq1kl1c1d9pw9****</p>
         */
        public Builder firewallEniVswitchId(String firewallEniVswitchId) {
            this.firewallEniVswitchId = firewallEniVswitchId;
            return this;
        }

        /**
         * <p>The instance ID of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-9c7c711abdfa4d80****</p>
         */
        public Builder firewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The instance name of the virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall-manual</p>
         */
        public Builder firewallName(String firewallName) {
            this.firewallName = firewallName;
            return this;
        }

        /**
         * <p>The deployment mode of the VPC firewall for the transit router. Valid values: <strong>PrimaryStandby</strong> (active/standby mode) and <strong>MultiPrimary</strong> (active-active mode).</p>
         * 
         * <strong>example:</strong>
         * <p>PrimaryStandby</p>
         */
        public Builder firewallServiceMode(String firewallServiceMode) {
            this.firewallServiceMode = firewallServiceMode;
            return this;
        }

        /**
         * <p>The list of zone IDs used by the VPC firewall for the transit router.</p>
         */
        public Builder firewallServiceZones(java.util.List<String> firewallServiceZones) {
            this.firewallServiceZones = firewallServiceZones;
            return this;
        }

        /**
         * <p>The status of the firewall. Valid values:</p>
         * <ul>
         * <li><p>Creating: The firewall is being created.</p>
         * </li>
         * <li><p>Deleting: The firewall is being deleted.</p>
         * </li>
         * <li><p>Ready: The firewall is ready.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder firewallStatus(String firewallStatus) {
            this.firewallStatus = firewallStatus;
            return this;
        }

        /**
         * <p>The subnet CIDR block that stores the firewall ENI in the firewall VPC in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.0/24</p>
         */
        public Builder firewallSubnetCidr(String firewallSubnetCidr) {
            this.firewallSubnetCidr = firewallSubnetCidr;
            return this;
        }

        /**
         * <p>The status of the virtual private cloud (VPC) firewalls. Valid values:</p>
         * <ul>
         * <li><p><strong>opened</strong>: enabled.</p>
         * </li>
         * <li><p><strong>closed</strong>: disabled.</p>
         * </li>
         * <li><p><strong>notconfigured</strong>: the virtual private cloud (VPC) firewalls are not configured.</p>
         * </li>
         * <li><p><strong>configured</strong>: the virtual private cloud (VPC) firewalls are configured but not enabled.</p>
         * </li>
         * <li><p><strong>creating</strong>: the virtual private cloud (VPC) firewalls are being created.</p>
         * </li>
         * <li><p><strong>opening</strong>: the virtual private cloud (VPC) firewalls are being enabled.</p>
         * </li>
         * <li><p><strong>deleting</strong>: the virtual private cloud (VPC) firewalls are being deleted.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not set, virtual private cloud (VPC) firewalls in all states are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * <p>The CIDR block of the firewall VPC in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        public Builder firewallVpcCidr(String firewallVpcCidr) {
            this.firewallVpcCidr = firewallVpcCidr;
            return this;
        }

        /**
         * <p>The region ID of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E53A7FB-3EB9-5E33-8E50-B8F417D1E02B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The routing mode. Valid values:</p>
         * <ul>
         * <li><p><strong>managed</strong>: automatic mode.</p>
         * </li>
         * <li><p><strong>manual</strong>: manual mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>managed</p>
         */
        public Builder routeMode(String routeMode) {
            this.routeMode = routeMode;
            return this;
        }

        /**
         * <p>The attachment ID used to connect the firewall VPC to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-r1llaxxeha71jsm36v</p>
         */
        public Builder trAttachmentId(String trAttachmentId) {
            this.trAttachmentId = trAttachmentId;
            return this;
        }

        /**
         * <p>The primary subnet CIDR block used to connect the firewall VPC to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.2.0/24</p>
         */
        public Builder trAttachmentMasterCidr(String trAttachmentMasterCidr) {
            this.trAttachmentMasterCidr = trAttachmentMasterCidr;
            return this;
        }

        /**
         * <p>The primary zone used to connect the firewall VPC to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder trAttachmentMasterZone(String trAttachmentMasterZone) {
            this.trAttachmentMasterZone = trAttachmentMasterZone;
            return this;
        }

        /**
         * <p>The secondary subnet CIDR block used to connect the firewall VPC to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.3.0/24</p>
         */
        public Builder trAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
            this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
            return this;
        }

        /**
         * <p>The secondary zone used to connect the firewall VPC to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder trAttachmentSlaveZone(String trAttachmentSlaveZone) {
            this.trAttachmentSlaveZone = trAttachmentSlaveZone;
            return this;
        }

        /**
         * <p>The list of zones and vSwitch CIDR blocks for the transit router connection.</p>
         */
        public Builder trAttachmentZones(java.util.List<TrAttachmentZones> trAttachmentZones) {
            this.trAttachmentZones = trAttachmentZones;
            return this;
        }

        /**
         * <p>The ID of the transit routing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-wz9y8sgug8b1xb416****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }

        public DescribeTrFirewallsV2DetailResponseBody build() {
            return new DescribeTrFirewallsV2DetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrFirewallsV2DetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallsV2DetailResponseBody</p>
     */
    public static class TrAttachmentZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchCidr")
        private String vSwitchCidr;

        @com.aliyun.core.annotation.NameInMap("VSwitchZoneId")
        private String vSwitchZoneId;

        private TrAttachmentZones(Builder builder) {
            this.vSwitchCidr = builder.vSwitchCidr;
            this.vSwitchZoneId = builder.vSwitchZoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrAttachmentZones create() {
            return builder().build();
        }

        /**
         * @return vSwitchCidr
         */
        public String getVSwitchCidr() {
            return this.vSwitchCidr;
        }

        /**
         * @return vSwitchZoneId
         */
        public String getVSwitchZoneId() {
            return this.vSwitchZoneId;
        }

        public static final class Builder {
            private String vSwitchCidr; 
            private String vSwitchZoneId; 

            private Builder() {
            } 

            private Builder(TrAttachmentZones model) {
                this.vSwitchCidr = model.vSwitchCidr;
                this.vSwitchZoneId = model.vSwitchZoneId;
            } 

            /**
             * <p>The CIDR block of the vSwitch for the transit router connection.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.2.0/24</p>
             */
            public Builder vSwitchCidr(String vSwitchCidr) {
                this.vSwitchCidr = vSwitchCidr;
                return this;
            }

            /**
             * <p>The zone ID of the vSwitch for the transit router connection.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder vSwitchZoneId(String vSwitchZoneId) {
                this.vSwitchZoneId = vSwitchZoneId;
                return this;
            }

            public TrAttachmentZones build() {
                return new TrAttachmentZones(this);
            } 

        } 

    }
}
