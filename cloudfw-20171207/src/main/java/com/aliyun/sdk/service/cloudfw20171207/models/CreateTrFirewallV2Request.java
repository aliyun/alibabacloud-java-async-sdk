// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrFirewallV2Request} extends {@link RequestModel}
 *
 * <p>CreateTrFirewallV2Request</p>
 */
public class CreateTrFirewallV2Request extends Request {
    @Query
    @NameInMap("CenId")
    private String cenId;

    @Query
    @NameInMap("FirewallDescription")
    private String firewallDescription;

    @Query
    @NameInMap("FirewallName")
    private String firewallName;

    @Query
    @NameInMap("FirewallSubnetCidr")
    private String firewallSubnetCidr;

    @Query
    @NameInMap("FirewallVpcCidr")
    private String firewallVpcCidr;

    @Query
    @NameInMap("FirewallVpcId")
    private String firewallVpcId;

    @Query
    @NameInMap("FirewallVswitchId")
    private String firewallVswitchId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("RouteMode")
    private String routeMode;

    @Query
    @NameInMap("TrAttachmentMasterCidr")
    private String trAttachmentMasterCidr;

    @Query
    @NameInMap("TrAttachmentSlaveCidr")
    private String trAttachmentSlaveCidr;

    @Query
    @NameInMap("TransitRouterId")
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
        this.trAttachmentSlaveCidr = builder.trAttachmentSlaveCidr;
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
        private String trAttachmentSlaveCidr; 
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
            this.trAttachmentSlaveCidr = request.trAttachmentSlaveCidr;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * FirewallDescription.
         */
        public Builder firewallDescription(String firewallDescription) {
            this.putQueryParameter("FirewallDescription", firewallDescription);
            this.firewallDescription = firewallDescription;
            return this;
        }

        /**
         * FirewallName.
         */
        public Builder firewallName(String firewallName) {
            this.putQueryParameter("FirewallName", firewallName);
            this.firewallName = firewallName;
            return this;
        }

        /**
         * FirewallSubnetCidr.
         */
        public Builder firewallSubnetCidr(String firewallSubnetCidr) {
            this.putQueryParameter("FirewallSubnetCidr", firewallSubnetCidr);
            this.firewallSubnetCidr = firewallSubnetCidr;
            return this;
        }

        /**
         * FirewallVpcCidr.
         */
        public Builder firewallVpcCidr(String firewallVpcCidr) {
            this.putQueryParameter("FirewallVpcCidr", firewallVpcCidr);
            this.firewallVpcCidr = firewallVpcCidr;
            return this;
        }

        /**
         * FirewallVpcId.
         */
        public Builder firewallVpcId(String firewallVpcId) {
            this.putQueryParameter("FirewallVpcId", firewallVpcId);
            this.firewallVpcId = firewallVpcId;
            return this;
        }

        /**
         * FirewallVswitchId.
         */
        public Builder firewallVswitchId(String firewallVswitchId) {
            this.putQueryParameter("FirewallVswitchId", firewallVswitchId);
            this.firewallVswitchId = firewallVswitchId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * RouteMode.
         */
        public Builder routeMode(String routeMode) {
            this.putQueryParameter("RouteMode", routeMode);
            this.routeMode = routeMode;
            return this;
        }

        /**
         * TrAttachmentMasterCidr.
         */
        public Builder trAttachmentMasterCidr(String trAttachmentMasterCidr) {
            this.putQueryParameter("TrAttachmentMasterCidr", trAttachmentMasterCidr);
            this.trAttachmentMasterCidr = trAttachmentMasterCidr;
            return this;
        }

        /**
         * TrAttachmentSlaveCidr.
         */
        public Builder trAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
            this.putQueryParameter("TrAttachmentSlaveCidr", trAttachmentSlaveCidr);
            this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
            return this;
        }

        /**
         * TransitRouterId.
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
