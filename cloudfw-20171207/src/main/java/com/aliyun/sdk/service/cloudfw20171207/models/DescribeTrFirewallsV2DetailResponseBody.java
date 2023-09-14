// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallsV2DetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2DetailResponseBody</p>
 */
public class DescribeTrFirewallsV2DetailResponseBody extends TeaModel {
    @NameInMap("CenId")
    private String cenId;

    @NameInMap("FirewallDescription")
    private String firewallDescription;

    @NameInMap("FirewallEniId")
    private String firewallEniId;

    @NameInMap("FirewallEniVpcId")
    private String firewallEniVpcId;

    @NameInMap("FirewallEniVswitchId")
    private String firewallEniVswitchId;

    @NameInMap("FirewallId")
    private String firewallId;

    @NameInMap("FirewallName")
    private String firewallName;

    @NameInMap("FirewallStatus")
    private String firewallStatus;

    @NameInMap("FirewallSubnetCidr")
    private String firewallSubnetCidr;

    @NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @NameInMap("FirewallVpcCidr")
    private String firewallVpcCidr;

    @NameInMap("RegionNo")
    private String regionNo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteMode")
    private String routeMode;

    @NameInMap("TrAttachmentMasterCidr")
    private String trAttachmentMasterCidr;

    @NameInMap("TrAttachmentSlaveCidr")
    private String trAttachmentSlaveCidr;

    @NameInMap("TransitRouterId")
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
        this.trAttachmentSlaveCidr = builder.trAttachmentSlaveCidr;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2DetailResponseBody create() {
        return builder().build();
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
     * @return trAttachmentSlaveCidr
     */
    public String getTrAttachmentSlaveCidr() {
        return this.trAttachmentSlaveCidr;
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
        private String trAttachmentSlaveCidr; 
        private String transitRouterId; 

        /**
         * The ID of the Cloud Enterprise Network (CEN) instance.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * The description of the VPC firewall.
         */
        public Builder firewallDescription(String firewallDescription) {
            this.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * The ID of the Elastic Network Interface (ENI) with which the VPC firewall is associated.
         */
        public Builder firewallEniId(String firewallEniId) {
            this.firewallEniId = firewallEniId;
            return this;
        }

        /**
         * The ID of the VPC to which the ENI is attached.
         */
        public Builder firewallEniVpcId(String firewallEniVpcId) {
            this.firewallEniVpcId = firewallEniVpcId;
            return this;
        }

        /**
         * The ID of the vSwitch with which the ENI is associated.
         */
        public Builder firewallEniVswitchId(String firewallEniVswitchId) {
            this.firewallEniVswitchId = firewallEniVswitchId;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder firewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }

        /**
         * The name of the VPC firewall.
         */
        public Builder firewallName(String firewallName) {
            this.firewallName = firewallName;
            return this;
        }

        /**
         * The status of the VPC firewall. Valid values:
         * <p>
         * 
         * *   Creating
         * *   Deleting
         * *   Ready
         */
        public Builder firewallStatus(String firewallStatus) {
            this.firewallStatus = firewallStatus;
            return this;
        }

        /**
         * FirewallSubnetCidr.
         */
        public Builder firewallSubnetCidr(String firewallSubnetCidr) {
            this.firewallSubnetCidr = firewallSubnetCidr;
            return this;
        }

        /**
         * The status of the VPC firewall. Valid values:
         * <p>
         * 
         * *   **opened**: The VPC firewall is enabled.
         * *   **closed**: The VPC firewall is disabled.
         * *   **notconfigured**: The VPC firewall is not created.
         * *   **configured**: The VPC firewall is created but is not enabled.
         * *   **creating**: The VPC firewall is being created.
         * *   **opening**: The VPC firewall is being enabled.
         * *   **deleting**: The VPC firewall is being deleted.
         * 
         * > If you do not specify this parameter, VPC firewalls in all states are queried.
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * FirewallVpcCidr.
         */
        public Builder firewallVpcCidr(String firewallVpcCidr) {
            this.firewallVpcCidr = firewallVpcCidr;
            return this;
        }

        /**
         * The region ID of the transit router.
         */
        public Builder regionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The routing mode of the VPC firewall. Valid values:
         * <p>
         * 
         * *   **managed**: automatic mode
         * *   **manual**: manual mode
         */
        public Builder routeMode(String routeMode) {
            this.routeMode = routeMode;
            return this;
        }

        /**
         * TrAttachmentMasterCidr.
         */
        public Builder trAttachmentMasterCidr(String trAttachmentMasterCidr) {
            this.trAttachmentMasterCidr = trAttachmentMasterCidr;
            return this;
        }

        /**
         * TrAttachmentSlaveCidr.
         */
        public Builder trAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
            this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
            return this;
        }

        /**
         * The ID of the transit router.
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
