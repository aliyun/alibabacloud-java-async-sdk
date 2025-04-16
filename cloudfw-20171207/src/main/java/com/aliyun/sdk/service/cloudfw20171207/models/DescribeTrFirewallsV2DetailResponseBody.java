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

    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterCidr")
    private String trAttachmentMasterCidr;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterZone")
    private String trAttachmentMasterZone;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveCidr")
    private String trAttachmentSlaveCidr;

    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveZone")
    private String trAttachmentSlaveZone;

    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private DescribeTrFirewallsV2DetailResponseBody(Builder builder) {
        this.cenId = builder.cenId;
        this.firewallDescription = builder.firewallDescription;
        this.firewallEniId = builder.firewallEniId;
        this.firewallEniVpcId = builder.firewallEniVpcId;
        this.firewallEniVswitchId = builder.firewallEniVswitchId;
        this.firewallId = builder.firewallId;
        this.firewallName = builder.firewallName;
        this.firewallStatus = builder.firewallStatus;
        this.firewallSubnetCidr = builder.firewallSubnetCidr;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.firewallVpcCidr = builder.firewallVpcCidr;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
        this.routeMode = builder.routeMode;
        this.trAttachmentMasterCidr = builder.trAttachmentMasterCidr;
        this.trAttachmentMasterZone = builder.trAttachmentMasterZone;
        this.trAttachmentSlaveCidr = builder.trAttachmentSlaveCidr;
        this.trAttachmentSlaveZone = builder.trAttachmentSlaveZone;
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder {
        private String cenId; 
        private String firewallDescription; 
        private String firewallEniId; 
        private String firewallEniVpcId; 
        private String firewallEniVswitchId; 
        private String firewallId; 
        private String firewallName; 
        private String firewallStatus; 
        private String firewallSubnetCidr; 
        private String firewallSwitchStatus; 
        private String firewallVpcCidr; 
        private String regionNo; 
        private String requestId; 
        private String routeMode; 
        private String trAttachmentMasterCidr; 
        private String trAttachmentMasterZone; 
        private String trAttachmentSlaveCidr; 
        private String trAttachmentSlaveZone; 
        private String transitRouterId; 

        private Builder() {
        } 

        private Builder(DescribeTrFirewallsV2DetailResponseBody model) {
            this.cenId = model.cenId;
            this.firewallDescription = model.firewallDescription;
            this.firewallEniId = model.firewallEniId;
            this.firewallEniVpcId = model.firewallEniVpcId;
            this.firewallEniVswitchId = model.firewallEniVswitchId;
            this.firewallId = model.firewallId;
            this.firewallName = model.firewallName;
            this.firewallStatus = model.firewallStatus;
            this.firewallSubnetCidr = model.firewallSubnetCidr;
            this.firewallSwitchStatus = model.firewallSwitchStatus;
            this.firewallVpcCidr = model.firewallVpcCidr;
            this.regionNo = model.regionNo;
            this.requestId = model.requestId;
            this.routeMode = model.routeMode;
            this.trAttachmentMasterCidr = model.trAttachmentMasterCidr;
            this.trAttachmentMasterZone = model.trAttachmentMasterZone;
            this.trAttachmentSlaveCidr = model.trAttachmentSlaveCidr;
            this.trAttachmentSlaveZone = model.trAttachmentSlaveZone;
            this.transitRouterId = model.transitRouterId;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-37nddhri7jf0d2****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The description of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC Firewall</p>
         */
        public Builder firewallDescription(String firewallDescription) {
            this.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * <p>The ID of the Elastic Network Interface (ENI) with which the VPC firewall is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-uf621u00nafypeex****</p>
         */
        public Builder firewallEniId(String firewallEniId) {
            this.firewallEniId = firewallEniId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the ENI is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeppcci782zeh2bk****</p>
         */
        public Builder firewallEniVpcId(String firewallEniVpcId) {
            this.firewallEniVpcId = firewallEniVpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch with which the ENI is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6ptq1kl1c1d9pw9****</p>
         */
        public Builder firewallEniVswitchId(String firewallEniVswitchId) {
            this.firewallEniVswitchId = firewallEniVswitchId;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-9c7c711abdfa4d80****</p>
         */
        public Builder firewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The name of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall-manual</p>
         */
        public Builder firewallName(String firewallName) {
            this.firewallName = firewallName;
            return this;
        }

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Deleting</li>
         * <li>Ready</li>
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
         * <p>The subnet CIDR block of the VPC in which the ENI of the firewall is stored in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.0/24</p>
         */
        public Builder firewallSubnetCidr(String firewallSubnetCidr) {
            this.firewallSubnetCidr = firewallSubnetCidr;
            return this;
        }

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
         * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
         * <li><strong>notconfigured</strong>: The VPC firewall is not created.</li>
         * <li><strong>configured</strong>: The VPC firewall is created but is not enabled.</li>
         * <li><strong>creating</strong>: The VPC firewall is being created.</li>
         * <li><strong>opening</strong>: The VPC firewall is being enabled.</li>
         * <li><strong>deleting</strong>: The VPC firewall is being deleted.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, VPC firewalls in all states are queried.</p>
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
         * <p>The CIDR block that is allocated to the VPC created for the VPC firewall in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        public Builder firewallVpcCidr(String firewallVpcCidr) {
            this.firewallVpcCidr = firewallVpcCidr;
            return this;
        }

        /**
         * <p>The region ID of the transit router.</p>
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
         * <p>The routing mode of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>managed</strong>: automatic mode</li>
         * <li><strong>manual</strong>: manual mode</li>
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
         * <p>The primary subnet CIDR block that the VPC uses to connect to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.2.0/24</p>
         */
        public Builder trAttachmentMasterCidr(String trAttachmentMasterCidr) {
            this.trAttachmentMasterCidr = trAttachmentMasterCidr;
            return this;
        }

        /**
         * TrAttachmentMasterZone.
         */
        public Builder trAttachmentMasterZone(String trAttachmentMasterZone) {
            this.trAttachmentMasterZone = trAttachmentMasterZone;
            return this;
        }

        /**
         * <p>The secondary subnet CIDR block that the VPC uses to connect to the transit router in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.3.0/24</p>
         */
        public Builder trAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
            this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
            return this;
        }

        /**
         * TrAttachmentSlaveZone.
         */
        public Builder trAttachmentSlaveZone(String trAttachmentSlaveZone) {
            this.trAttachmentSlaveZone = trAttachmentSlaveZone;
            return this;
        }

        /**
         * <p>The ID of the transit router.</p>
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

}
