// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallsV2ListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallsV2ListRequest</p>
 */
public class DescribeTrFirewallsV2ListRequest extends Request {
    @Query
    @NameInMap("CenId")
    private String cenId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("FirewallId")
    private String firewallId;

    @Query
    @NameInMap("FirewallName")
    private String firewallName;

    @Query
    @NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("RouteMode")
    private String routeMode;

    @Query
    @NameInMap("TransitRouterId")
    private String transitRouterId;

    private DescribeTrFirewallsV2ListRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.currentPage = builder.currentPage;
        this.firewallId = builder.firewallId;
        this.firewallName = builder.firewallName;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.lang = builder.lang;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.routeMode = builder.routeMode;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2ListRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return firewallSwitchStatus
     */
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<DescribeTrFirewallsV2ListRequest, Builder> {
        private String cenId; 
        private Integer currentPage; 
        private String firewallId; 
        private String firewallName; 
        private String firewallSwitchStatus; 
        private String lang; 
        private String ownerId; 
        private Integer pageSize; 
        private String regionNo; 
        private String routeMode; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrFirewallsV2ListRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.currentPage = request.currentPage;
            this.firewallId = request.firewallId;
            this.firewallName = request.firewallName;
            this.firewallSwitchStatus = request.firewallSwitchStatus;
            this.lang = request.lang;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.routeMode = request.routeMode;
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * FirewallId.
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
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
         * FirewallSwitchStatus.
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.putQueryParameter("FirewallSwitchStatus", firewallSwitchStatus);
            this.firewallSwitchStatus = firewallSwitchStatus;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * TransitRouterId.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public DescribeTrFirewallsV2ListRequest build() {
            return new DescribeTrFirewallsV2ListRequest(this);
        } 

    } 

}
