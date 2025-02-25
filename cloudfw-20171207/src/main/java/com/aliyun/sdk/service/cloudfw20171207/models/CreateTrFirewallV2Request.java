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
    @com.aliyun.core.annotation.NameInMap("FirewallDescription")
    private String firewallDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallName")
    private String firewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSubnetCidr")
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
    private String trAttachmentMasterCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentMasterZone")
    private String trAttachmentMasterZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveCidr")
    private String trAttachmentSlaveCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrAttachmentSlaveZone")
    private String trAttachmentSlaveZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateTrFirewallV2Request(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.firewallDescription = builder.firewallDescription;
        this.firewallName = builder.firewallName;
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateTrFirewallV2Request, Builder> {
        private String cenId; 
        private String firewallDescription; 
        private String firewallName; 
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
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrFirewallV2Request request) {
            super(request);
            this.cenId = request.cenId;
            this.firewallDescription = request.firewallDescription;
            this.firewallName = request.firewallName;
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
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
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
         * <p>The description of the firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-sz</p>
         */
        public Builder firewallDescription(String firewallDescription) {
            this.putQueryParameter("FirewallDescription", firewallDescription);
            this.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * <p>The name of the firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw_test2</p>
         */
        public Builder firewallName(String firewallName) {
            this.putQueryParameter("FirewallName", firewallName);
            this.firewallName = firewallName;
            return this;
        }

        /**
         * <p>The subnet CIDR block of the VPC in which the ENI of the firewall is stored in automatic mode.</p>
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
         * <p>The CIDR block that is allocated to the VPC created for the VPC firewall in automatic mode.</p>
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
         * <p>The ID of the VPC in which the ENI associated with the VPC firewall is created in manual mode.</p>
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
         * <p>The ID of the vSwitch that is used to create the ENI in manual mode.</p>
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
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The region ID of the route router.</p>
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
            this.putQueryParameter("RouteMode", routeMode);
            this.routeMode = routeMode;
            return this;
        }

        /**
         * <p>The primary subnet CIDR block that the VPC uses to connect to the transit router in automatic mode.</p>
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
         * <p>The primary zone for the vSwitch.</p>
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
         * <p>The secondary subnet CIDR block that the VPC uses to connect to the transit router in automatic mode.</p>
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
         * <p>The secondary zone for the vSwitch.</p>
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
         * <p>The ID of the transit router.</p>
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
