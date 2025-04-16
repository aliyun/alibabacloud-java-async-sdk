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
 * {@link DescribeTrFirewallsV2ListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallsV2ListRequest</p>
 */
public class DescribeTrFirewallsV2ListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallName")
    private String firewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMode")
    private String routeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
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
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-rig0t5zi96crkl****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-f1799baa9e254651****</p>
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The name of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder firewallName(String firewallName) {
            this.putQueryParameter("FirewallName", firewallName);
            this.firewallName = firewallName;
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
         * <p> If you do not specify this parameter, VPC firewalls in all states are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.putQueryParameter("FirewallSwitchStatus", firewallSwitchStatus);
            this.firewallSwitchStatus = firewallSwitchStatus;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the transit router.</p>
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
         * <blockquote>
         * <p> If you do not specify this parameter, VPC firewalls in all routing modes are queried.</p>
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
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf6egtvyaedvt20xl****</p>
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
