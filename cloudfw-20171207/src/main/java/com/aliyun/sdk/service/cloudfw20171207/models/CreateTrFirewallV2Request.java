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
 * {@link CreateTrFirewallV2Request} extends {@link RequestModel}
 *
 * <p>CreateTrFirewallV2Request</p>
 */
public class CreateTrFirewallV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallAttachmentZone")
    private String firewallAttachmentZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallDescription")
    private String firewallDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallName")
    private String firewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallServiceMode")
    private String firewallServiceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallServiceZones")
    private java.util.List<String> firewallServiceZones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSubnetCidr")
    @Deprecated
    private String firewallSubnetCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVpcCidr")
    private String firewallVpcCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVpcId")
    private String firewallVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVswitchId")
    private String firewallVswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMode")
    private String routeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterCidr")
    @Deprecated
    private String trAttachmentMasterCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterZone")
    private String trAttachmentMasterZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveCidr")
    @Deprecated
    private String trAttachmentSlaveCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveZone")
    private String trAttachmentSlaveZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentZones")
    private java.util.List<String> trAttachmentZones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateTrFirewallV2Request(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.firewallAttachmentZone = builder.firewallAttachmentZone;
        this.firewallDescription = builder.firewallDescription;
        this.firewallName = builder.firewallName;
        this.firewallServiceMode = builder.firewallServiceMode;
        this.firewallServiceZones = builder.firewallServiceZones;
        this.firewallSubnetCidr = builder.firewallSubnetCidr;
        this.firewallVpcCidr = builder.firewallVpcCidr;
        this.firewallVpcId = builder.firewallVpcId;
        this.firewallVswitchId = builder.firewallVswitchId;
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
        this.routeMode = builder.routeMode;
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

    public static CreateTrFirewallV2Request create() {
        return builder().build();
    }

@Override
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
     * @return firewallSubnetCidr
     */
    public String getFirewallSubnetCidr() {
        return this.firewallSubnetCidr;
    }

    /**
     * @return firewallVpcCidr
     */
    public String getFirewallVpcCidr() {
        return this.firewallVpcCidr;
    }

    /**
     * @return firewallVpcId
     */
    public String getFirewallVpcId() {
        return this.firewallVpcId;
    }

    /**
     * @return firewallVswitchId
     */
    public String getFirewallVswitchId() {
        return this.firewallVswitchId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
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
     * @return trAttachmentZones
     */
    public java.util.List<String> getTrAttachmentZones() {
        return this.trAttachmentZones;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateTrFirewallV2Request, Builder> {
        private String cenId; 
        private String firewallAttachmentZone; 
        private String firewallDescription; 
        private String firewallName; 
        private String firewallServiceMode; 
        private java.util.List<String> firewallServiceZones; 
        private String firewallSubnetCidr; 
        private String firewallVpcCidr; 
        private String firewallVpcId; 
        private String firewallVswitchId; 
        private String lang; 
        private String regionNo; 
        private String routeMode; 
        private String trAttachmentMasterCidr; 
        private String trAttachmentMasterZone; 
        private String trAttachmentSlaveCidr; 
        private String trAttachmentSlaveZone; 
        private java.util.List<String> trAttachmentZones; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrFirewallV2Request request) {
            super(request);
            this.cenId = request.cenId;
            this.firewallAttachmentZone = request.firewallAttachmentZone;
            this.firewallDescription = request.firewallDescription;
            this.firewallName = request.firewallName;
            this.firewallServiceMode = request.firewallServiceMode;
            this.firewallServiceZones = request.firewallServiceZones;
            this.firewallSubnetCidr = request.firewallSubnetCidr;
            this.firewallVpcCidr = request.firewallVpcCidr;
            this.firewallVpcId = request.firewallVpcId;
            this.firewallVswitchId = request.firewallVswitchId;
            this.lang = request.lang;
            this.regionNo = request.regionNo;
            this.routeMode = request.routeMode;
            this.trAttachmentMasterCidr = request.trAttachmentMasterCidr;
            this.trAttachmentMasterZone = request.trAttachmentMasterZone;
            this.trAttachmentSlaveCidr = request.trAttachmentSlaveCidr;
            this.trAttachmentSlaveZone = request.trAttachmentSlaveZone;
            this.trAttachmentZones = request.trAttachmentZones;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>The ID of the CEN instance. Create a CEN instance in the CEN console first and make sure that an Enterprise Edition transit router has been created.</p>
         * <blockquote>
         * <p>Note: Although this parameter is marked as not required in the schema, it is actually required. If this parameter is not specified, the ErrorParameters (400) error is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cen-4xbjup276au29r****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
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
            this.putQueryParameter("FirewallAttachmentZone", firewallAttachmentZone);
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
            this.putQueryParameter("FirewallDescription", firewallDescription);
            this.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * <p>The name of the Cloud Firewall instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-firewall-test</p>
         */
        public Builder firewallName(String firewallName) {
            this.putQueryParameter("FirewallName", firewallName);
            this.firewallName = firewallName;
            return this;
        }

        /**
         * <p>The deployment mode of the firewall service. Valid values:</p>
         * <ul>
         * <li><strong>PrimaryStandby</strong>: Primary/standby mode.</li>
         * <li><strong>MultiPrimary</strong>: Active-active mode.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the system automatically selects a deployment mode based on the capabilities of the transit router. If an invalid value is specified, the ErrorFwServiceMode (-360437) error is returned. The MultiPrimary mode does not support specifying zones.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PrimaryStandby</p>
         */
        public Builder firewallServiceMode(String firewallServiceMode) {
            this.putQueryParameter("FirewallServiceMode", firewallServiceMode);
            this.firewallServiceMode = firewallServiceMode;
            return this;
        }

        /**
         * <p>The list of zone IDs used by the firewall service.</p>
         */
        public Builder firewallServiceZones(java.util.List<String> firewallServiceZones) {
            this.putQueryParameter("FirewallServiceZones", firewallServiceZones);
            this.firewallServiceZones = firewallServiceZones;
            return this;
        }

        /**
         * <p>The subnet CIDR block used to store the firewall elastic network interface (ENI) in the firewall VPC in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.0/24</p>
         */
        public Builder firewallSubnetCidr(String firewallSubnetCidr) {
            this.putQueryParameter("FirewallSubnetCidr", firewallSubnetCidr);
            this.firewallSubnetCidr = firewallSubnetCidr;
            return this;
        }

        /**
         * <p>The CIDR block of the firewall VPC in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        public Builder firewallVpcCidr(String firewallVpcCidr) {
            this.putQueryParameter("FirewallVpcCidr", firewallVpcCidr);
            this.firewallVpcCidr = firewallVpcCidr;
            return this;
        }

        /**
         * <p>The ID of the VPC in which the firewall ENI is created in manual mode.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9r5qvryn0lg3atb****</p>
         */
        public Builder firewallVpcId(String firewallVpcId) {
            this.putQueryParameter("FirewallVpcId", firewallVpcId);
            this.firewallVpcId = firewallVpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in which the firewall ENI is created in manual mode.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6ydz3vqj77mr5l6****</p>
         */
        public Builder firewallVswitchId(String firewallVswitchId) {
            this.putQueryParameter("FirewallVswitchId", firewallVswitchId);
            this.firewallVswitchId = firewallVswitchId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region ID of the Enterprise Edition transit router.</p>
         * <blockquote>
         * <p>Note: Although this parameter is marked as not required in the schema, it is actually required. If this parameter is not specified, the ErrorParameters (400) error is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The routing mode. Valid values: managed (automatic mode) and manual (manual mode). In managed mode, only FirewallVpcCidr is required. The FirewallSubnetCidr, TrAttachmentSlaveCidr, and TrAttachmentMasterCidr parameters are deprecated and do not need to be specified. In manual mode, specify FirewallVpcId, FirewallVswitchId, TrAttachmentSlaveZone, and TrAttachmentMasterZone.</p>
         * <blockquote>
         * <p>Note: Although this parameter is marked as not required in the schema, it is actually required. If this parameter is not specified, the ErrorParameters (400) error is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>managed</p>
         */
        public Builder routeMode(String routeMode) {
            this.putQueryParameter("RouteMode", routeMode);
            this.routeMode = routeMode;
            return this;
        }

        /**
         * <p>The primary subnet CIDR block used to connect to the TR in the firewall VPC in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.3.0/24</p>
         */
        public Builder trAttachmentMasterCidr(String trAttachmentMasterCidr) {
            this.putQueryParameter("TrAttachmentMasterCidr", trAttachmentMasterCidr);
            this.trAttachmentMasterCidr = trAttachmentMasterCidr;
            return this;
        }

        /**
         * <p>The primary zone of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-a</p>
         */
        public Builder trAttachmentMasterZone(String trAttachmentMasterZone) {
            this.putQueryParameter("TrAttachmentMasterZone", trAttachmentMasterZone);
            this.trAttachmentMasterZone = trAttachmentMasterZone;
            return this;
        }

        /**
         * <p>The secondary subnet CIDR block used to connect to the TR in the firewall VPC in automatic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.16/28</p>
         */
        public Builder trAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
            this.putQueryParameter("TrAttachmentSlaveCidr", trAttachmentSlaveCidr);
            this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
            return this;
        }

        /**
         * <p>The secondary zone of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-b</p>
         */
        public Builder trAttachmentSlaveZone(String trAttachmentSlaveZone) {
            this.putQueryParameter("TrAttachmentSlaveZone", trAttachmentSlaveZone);
            this.trAttachmentSlaveZone = trAttachmentSlaveZone;
            return this;
        }

        /**
         * <p>The list of zone IDs used by the TR connection.</p>
         */
        public Builder trAttachmentZones(java.util.List<String> trAttachmentZones) {
            this.putQueryParameter("TrAttachmentZones", trAttachmentZones);
            this.trAttachmentZones = trAttachmentZones;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Edition transit router instance. The transit router must belong to the CEN instance specified by CenId.</p>
         * <blockquote>
         * <p>Note: Although this parameter is marked as not required in the schema, it is actually required. If this parameter is not specified, the ErrorParameters (400) error is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tr-m5etmb2q7e0mxcur****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateTrFirewallV2Request build() {
            return new CreateTrFirewallV2Request(this);
        } 

    } 

}
