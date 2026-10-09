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
 * {@link DescribeVpcFirewallSummaryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallSummaryInfoResponseBody</p>
 */
public class DescribeVpcFirewallSummaryInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableVpcFirewallQuota")
    private Integer availableVpcFirewallQuota;

    @com.aliyun.core.annotation.NameInMap("CenExpressConnectVpcCount")
    private Integer cenExpressConnectVpcCount;

    @com.aliyun.core.annotation.NameInMap("CenFirewallVpcCount")
    private Integer cenFirewallVpcCount;

    @com.aliyun.core.annotation.NameInMap("CenTrVpcCount")
    private Integer cenTrVpcCount;

    @com.aliyun.core.annotation.NameInMap("ClosedCenFirewallCount")
    private Integer closedCenFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ClosedExpressConnectFirewallCount")
    private Integer closedExpressConnectFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ClosedVpcFirewallCount")
    private Integer closedVpcFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredCenFirewallCount")
    private Integer configuredCenFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredCenFirewallRegionCount")
    private Integer configuredCenFirewallRegionCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredCenFirewallVpcCount")
    private Integer configuredCenFirewallVpcCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredCenTrFirewallCount")
    private Integer configuredCenTrFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredExpressConnectFirewallCount")
    private Integer configuredExpressConnectFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredExpressConnectVpcCount")
    private Integer configuredExpressConnectVpcCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredVpcFirewallCount")
    private Integer configuredVpcFirewallCount;

    @com.aliyun.core.annotation.NameInMap("ConfiguredVpcFirewallVpcCount")
    private Integer configuredVpcFirewallVpcCount;

    @com.aliyun.core.annotation.NameInMap("ExpressConnectVpcCount")
    private Integer expressConnectVpcCount;

    @com.aliyun.core.annotation.NameInMap("NotConfiguredCenFirewallCount")
    private Integer notConfiguredCenFirewallCount;

    @com.aliyun.core.annotation.NameInMap("NotConfiguredCenTrFirewallCount")
    private Integer notConfiguredCenTrFirewallCount;

    @com.aliyun.core.annotation.NameInMap("NotConfiguredExpressConnectFirewallCount")
    private Integer notConfiguredExpressConnectFirewallCount;

    @com.aliyun.core.annotation.NameInMap("NotConfiguredVpcFirewallCount")
    private Integer notConfiguredVpcFirewallCount;

    @com.aliyun.core.annotation.NameInMap("OpenedCenExpressConnectVpcCount")
    private Integer openedCenExpressConnectVpcCount;

    @com.aliyun.core.annotation.NameInMap("OpenedCenFirewallCount")
    private Integer openedCenFirewallCount;

    @com.aliyun.core.annotation.NameInMap("OpenedCenFirewallVpcCount")
    private Integer openedCenFirewallVpcCount;

    @com.aliyun.core.annotation.NameInMap("OpenedCenTrFirewallVpcCount")
    private Integer openedCenTrFirewallVpcCount;

    @com.aliyun.core.annotation.NameInMap("OpenedEcrCount")
    private Integer openedEcrCount;

    @com.aliyun.core.annotation.NameInMap("OpenedExpressConnectFirewallCount")
    private Integer openedExpressConnectFirewallCount;

    @com.aliyun.core.annotation.NameInMap("OpenedExpressConnectVpcCount")
    private Integer openedExpressConnectVpcCount;

    @com.aliyun.core.annotation.NameInMap("OpenedPeerTrCount")
    private Integer openedPeerTrCount;

    @com.aliyun.core.annotation.NameInMap("OpenedVbrCount")
    private Integer openedVbrCount;

    @com.aliyun.core.annotation.NameInMap("OpenedVpcCount")
    private Integer openedVpcCount;

    @com.aliyun.core.annotation.NameInMap("OpenedVpcFirewallCount")
    private Integer openedVpcFirewallCount;

    @com.aliyun.core.annotation.NameInMap("OpenedVpnCount")
    private Integer openedVpnCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalEcrCount")
    private Integer totalEcrCount;

    @com.aliyun.core.annotation.NameInMap("TotalPeerTrCount")
    private Integer totalPeerTrCount;

    @com.aliyun.core.annotation.NameInMap("TotalVbrCount")
    private Integer totalVbrCount;

    @com.aliyun.core.annotation.NameInMap("TotalVpcCount")
    private Integer totalVpcCount;

    @com.aliyun.core.annotation.NameInMap("TotalVpcFirewallQuota")
    private Integer totalVpcFirewallQuota;

    @com.aliyun.core.annotation.NameInMap("TotalVpnCount")
    private Integer totalVpnCount;

    private DescribeVpcFirewallSummaryInfoResponseBody(Builder builder) {
        this.availableVpcFirewallQuota = builder.availableVpcFirewallQuota;
        this.cenExpressConnectVpcCount = builder.cenExpressConnectVpcCount;
        this.cenFirewallVpcCount = builder.cenFirewallVpcCount;
        this.cenTrVpcCount = builder.cenTrVpcCount;
        this.closedCenFirewallCount = builder.closedCenFirewallCount;
        this.closedExpressConnectFirewallCount = builder.closedExpressConnectFirewallCount;
        this.closedVpcFirewallCount = builder.closedVpcFirewallCount;
        this.configuredCenFirewallCount = builder.configuredCenFirewallCount;
        this.configuredCenFirewallRegionCount = builder.configuredCenFirewallRegionCount;
        this.configuredCenFirewallVpcCount = builder.configuredCenFirewallVpcCount;
        this.configuredCenTrFirewallCount = builder.configuredCenTrFirewallCount;
        this.configuredExpressConnectFirewallCount = builder.configuredExpressConnectFirewallCount;
        this.configuredExpressConnectVpcCount = builder.configuredExpressConnectVpcCount;
        this.configuredVpcFirewallCount = builder.configuredVpcFirewallCount;
        this.configuredVpcFirewallVpcCount = builder.configuredVpcFirewallVpcCount;
        this.expressConnectVpcCount = builder.expressConnectVpcCount;
        this.notConfiguredCenFirewallCount = builder.notConfiguredCenFirewallCount;
        this.notConfiguredCenTrFirewallCount = builder.notConfiguredCenTrFirewallCount;
        this.notConfiguredExpressConnectFirewallCount = builder.notConfiguredExpressConnectFirewallCount;
        this.notConfiguredVpcFirewallCount = builder.notConfiguredVpcFirewallCount;
        this.openedCenExpressConnectVpcCount = builder.openedCenExpressConnectVpcCount;
        this.openedCenFirewallCount = builder.openedCenFirewallCount;
        this.openedCenFirewallVpcCount = builder.openedCenFirewallVpcCount;
        this.openedCenTrFirewallVpcCount = builder.openedCenTrFirewallVpcCount;
        this.openedEcrCount = builder.openedEcrCount;
        this.openedExpressConnectFirewallCount = builder.openedExpressConnectFirewallCount;
        this.openedExpressConnectVpcCount = builder.openedExpressConnectVpcCount;
        this.openedPeerTrCount = builder.openedPeerTrCount;
        this.openedVbrCount = builder.openedVbrCount;
        this.openedVpcCount = builder.openedVpcCount;
        this.openedVpcFirewallCount = builder.openedVpcFirewallCount;
        this.openedVpnCount = builder.openedVpnCount;
        this.requestId = builder.requestId;
        this.totalEcrCount = builder.totalEcrCount;
        this.totalPeerTrCount = builder.totalPeerTrCount;
        this.totalVbrCount = builder.totalVbrCount;
        this.totalVpcCount = builder.totalVpcCount;
        this.totalVpcFirewallQuota = builder.totalVpcFirewallQuota;
        this.totalVpnCount = builder.totalVpnCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallSummaryInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableVpcFirewallQuota
     */
    public Integer getAvailableVpcFirewallQuota() {
        return this.availableVpcFirewallQuota;
    }

    /**
     * @return cenExpressConnectVpcCount
     */
    public Integer getCenExpressConnectVpcCount() {
        return this.cenExpressConnectVpcCount;
    }

    /**
     * @return cenFirewallVpcCount
     */
    public Integer getCenFirewallVpcCount() {
        return this.cenFirewallVpcCount;
    }

    /**
     * @return cenTrVpcCount
     */
    public Integer getCenTrVpcCount() {
        return this.cenTrVpcCount;
    }

    /**
     * @return closedCenFirewallCount
     */
    public Integer getClosedCenFirewallCount() {
        return this.closedCenFirewallCount;
    }

    /**
     * @return closedExpressConnectFirewallCount
     */
    public Integer getClosedExpressConnectFirewallCount() {
        return this.closedExpressConnectFirewallCount;
    }

    /**
     * @return closedVpcFirewallCount
     */
    public Integer getClosedVpcFirewallCount() {
        return this.closedVpcFirewallCount;
    }

    /**
     * @return configuredCenFirewallCount
     */
    public Integer getConfiguredCenFirewallCount() {
        return this.configuredCenFirewallCount;
    }

    /**
     * @return configuredCenFirewallRegionCount
     */
    public Integer getConfiguredCenFirewallRegionCount() {
        return this.configuredCenFirewallRegionCount;
    }

    /**
     * @return configuredCenFirewallVpcCount
     */
    public Integer getConfiguredCenFirewallVpcCount() {
        return this.configuredCenFirewallVpcCount;
    }

    /**
     * @return configuredCenTrFirewallCount
     */
    public Integer getConfiguredCenTrFirewallCount() {
        return this.configuredCenTrFirewallCount;
    }

    /**
     * @return configuredExpressConnectFirewallCount
     */
    public Integer getConfiguredExpressConnectFirewallCount() {
        return this.configuredExpressConnectFirewallCount;
    }

    /**
     * @return configuredExpressConnectVpcCount
     */
    public Integer getConfiguredExpressConnectVpcCount() {
        return this.configuredExpressConnectVpcCount;
    }

    /**
     * @return configuredVpcFirewallCount
     */
    public Integer getConfiguredVpcFirewallCount() {
        return this.configuredVpcFirewallCount;
    }

    /**
     * @return configuredVpcFirewallVpcCount
     */
    public Integer getConfiguredVpcFirewallVpcCount() {
        return this.configuredVpcFirewallVpcCount;
    }

    /**
     * @return expressConnectVpcCount
     */
    public Integer getExpressConnectVpcCount() {
        return this.expressConnectVpcCount;
    }

    /**
     * @return notConfiguredCenFirewallCount
     */
    public Integer getNotConfiguredCenFirewallCount() {
        return this.notConfiguredCenFirewallCount;
    }

    /**
     * @return notConfiguredCenTrFirewallCount
     */
    public Integer getNotConfiguredCenTrFirewallCount() {
        return this.notConfiguredCenTrFirewallCount;
    }

    /**
     * @return notConfiguredExpressConnectFirewallCount
     */
    public Integer getNotConfiguredExpressConnectFirewallCount() {
        return this.notConfiguredExpressConnectFirewallCount;
    }

    /**
     * @return notConfiguredVpcFirewallCount
     */
    public Integer getNotConfiguredVpcFirewallCount() {
        return this.notConfiguredVpcFirewallCount;
    }

    /**
     * @return openedCenExpressConnectVpcCount
     */
    public Integer getOpenedCenExpressConnectVpcCount() {
        return this.openedCenExpressConnectVpcCount;
    }

    /**
     * @return openedCenFirewallCount
     */
    public Integer getOpenedCenFirewallCount() {
        return this.openedCenFirewallCount;
    }

    /**
     * @return openedCenFirewallVpcCount
     */
    public Integer getOpenedCenFirewallVpcCount() {
        return this.openedCenFirewallVpcCount;
    }

    /**
     * @return openedCenTrFirewallVpcCount
     */
    public Integer getOpenedCenTrFirewallVpcCount() {
        return this.openedCenTrFirewallVpcCount;
    }

    /**
     * @return openedEcrCount
     */
    public Integer getOpenedEcrCount() {
        return this.openedEcrCount;
    }

    /**
     * @return openedExpressConnectFirewallCount
     */
    public Integer getOpenedExpressConnectFirewallCount() {
        return this.openedExpressConnectFirewallCount;
    }

    /**
     * @return openedExpressConnectVpcCount
     */
    public Integer getOpenedExpressConnectVpcCount() {
        return this.openedExpressConnectVpcCount;
    }

    /**
     * @return openedPeerTrCount
     */
    public Integer getOpenedPeerTrCount() {
        return this.openedPeerTrCount;
    }

    /**
     * @return openedVbrCount
     */
    public Integer getOpenedVbrCount() {
        return this.openedVbrCount;
    }

    /**
     * @return openedVpcCount
     */
    public Integer getOpenedVpcCount() {
        return this.openedVpcCount;
    }

    /**
     * @return openedVpcFirewallCount
     */
    public Integer getOpenedVpcFirewallCount() {
        return this.openedVpcFirewallCount;
    }

    /**
     * @return openedVpnCount
     */
    public Integer getOpenedVpnCount() {
        return this.openedVpnCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalEcrCount
     */
    public Integer getTotalEcrCount() {
        return this.totalEcrCount;
    }

    /**
     * @return totalPeerTrCount
     */
    public Integer getTotalPeerTrCount() {
        return this.totalPeerTrCount;
    }

    /**
     * @return totalVbrCount
     */
    public Integer getTotalVbrCount() {
        return this.totalVbrCount;
    }

    /**
     * @return totalVpcCount
     */
    public Integer getTotalVpcCount() {
        return this.totalVpcCount;
    }

    /**
     * @return totalVpcFirewallQuota
     */
    public Integer getTotalVpcFirewallQuota() {
        return this.totalVpcFirewallQuota;
    }

    /**
     * @return totalVpnCount
     */
    public Integer getTotalVpnCount() {
        return this.totalVpnCount;
    }

    public static final class Builder {
        private Integer availableVpcFirewallQuota; 
        private Integer cenExpressConnectVpcCount; 
        private Integer cenFirewallVpcCount; 
        private Integer cenTrVpcCount; 
        private Integer closedCenFirewallCount; 
        private Integer closedExpressConnectFirewallCount; 
        private Integer closedVpcFirewallCount; 
        private Integer configuredCenFirewallCount; 
        private Integer configuredCenFirewallRegionCount; 
        private Integer configuredCenFirewallVpcCount; 
        private Integer configuredCenTrFirewallCount; 
        private Integer configuredExpressConnectFirewallCount; 
        private Integer configuredExpressConnectVpcCount; 
        private Integer configuredVpcFirewallCount; 
        private Integer configuredVpcFirewallVpcCount; 
        private Integer expressConnectVpcCount; 
        private Integer notConfiguredCenFirewallCount; 
        private Integer notConfiguredCenTrFirewallCount; 
        private Integer notConfiguredExpressConnectFirewallCount; 
        private Integer notConfiguredVpcFirewallCount; 
        private Integer openedCenExpressConnectVpcCount; 
        private Integer openedCenFirewallCount; 
        private Integer openedCenFirewallVpcCount; 
        private Integer openedCenTrFirewallVpcCount; 
        private Integer openedEcrCount; 
        private Integer openedExpressConnectFirewallCount; 
        private Integer openedExpressConnectVpcCount; 
        private Integer openedPeerTrCount; 
        private Integer openedVbrCount; 
        private Integer openedVpcCount; 
        private Integer openedVpcFirewallCount; 
        private Integer openedVpnCount; 
        private String requestId; 
        private Integer totalEcrCount; 
        private Integer totalPeerTrCount; 
        private Integer totalVbrCount; 
        private Integer totalVpcCount; 
        private Integer totalVpcFirewallQuota; 
        private Integer totalVpnCount; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallSummaryInfoResponseBody model) {
            this.availableVpcFirewallQuota = model.availableVpcFirewallQuota;
            this.cenExpressConnectVpcCount = model.cenExpressConnectVpcCount;
            this.cenFirewallVpcCount = model.cenFirewallVpcCount;
            this.cenTrVpcCount = model.cenTrVpcCount;
            this.closedCenFirewallCount = model.closedCenFirewallCount;
            this.closedExpressConnectFirewallCount = model.closedExpressConnectFirewallCount;
            this.closedVpcFirewallCount = model.closedVpcFirewallCount;
            this.configuredCenFirewallCount = model.configuredCenFirewallCount;
            this.configuredCenFirewallRegionCount = model.configuredCenFirewallRegionCount;
            this.configuredCenFirewallVpcCount = model.configuredCenFirewallVpcCount;
            this.configuredCenTrFirewallCount = model.configuredCenTrFirewallCount;
            this.configuredExpressConnectFirewallCount = model.configuredExpressConnectFirewallCount;
            this.configuredExpressConnectVpcCount = model.configuredExpressConnectVpcCount;
            this.configuredVpcFirewallCount = model.configuredVpcFirewallCount;
            this.configuredVpcFirewallVpcCount = model.configuredVpcFirewallVpcCount;
            this.expressConnectVpcCount = model.expressConnectVpcCount;
            this.notConfiguredCenFirewallCount = model.notConfiguredCenFirewallCount;
            this.notConfiguredCenTrFirewallCount = model.notConfiguredCenTrFirewallCount;
            this.notConfiguredExpressConnectFirewallCount = model.notConfiguredExpressConnectFirewallCount;
            this.notConfiguredVpcFirewallCount = model.notConfiguredVpcFirewallCount;
            this.openedCenExpressConnectVpcCount = model.openedCenExpressConnectVpcCount;
            this.openedCenFirewallCount = model.openedCenFirewallCount;
            this.openedCenFirewallVpcCount = model.openedCenFirewallVpcCount;
            this.openedCenTrFirewallVpcCount = model.openedCenTrFirewallVpcCount;
            this.openedEcrCount = model.openedEcrCount;
            this.openedExpressConnectFirewallCount = model.openedExpressConnectFirewallCount;
            this.openedExpressConnectVpcCount = model.openedExpressConnectVpcCount;
            this.openedPeerTrCount = model.openedPeerTrCount;
            this.openedVbrCount = model.openedVbrCount;
            this.openedVpcCount = model.openedVpcCount;
            this.openedVpcFirewallCount = model.openedVpcFirewallCount;
            this.openedVpnCount = model.openedVpnCount;
            this.requestId = model.requestId;
            this.totalEcrCount = model.totalEcrCount;
            this.totalPeerTrCount = model.totalPeerTrCount;
            this.totalVbrCount = model.totalVbrCount;
            this.totalVpcCount = model.totalVpcCount;
            this.totalVpcFirewallQuota = model.totalVpcFirewallQuota;
            this.totalVpnCount = model.totalVpnCount;
        } 

        /**
         * <p>The remaining available quota for VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder availableVpcFirewallQuota(Integer availableVpcFirewallQuota) {
            this.availableVpcFirewallQuota = availableVpcFirewallQuota;
            return this;
        }

        /**
         * <p>The number of VPCs connected through Cloud Enterprise Network (CEN).</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder cenExpressConnectVpcCount(Integer cenExpressConnectVpcCount) {
            this.cenExpressConnectVpcCount = cenExpressConnectVpcCount;
            return this;
        }

        /**
         * <p>The number of CEN VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder cenFirewallVpcCount(Integer cenFirewallVpcCount) {
            this.cenFirewallVpcCount = cenFirewallVpcCount;
            return this;
        }

        /**
         * <p>The total number of VPCs connected through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder cenTrVpcCount(Integer cenTrVpcCount) {
            this.cenTrVpcCount = cenTrVpcCount;
            return this;
        }

        /**
         * <p>The number of configured but disabled CEN firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder closedCenFirewallCount(Integer closedCenFirewallCount) {
            this.closedCenFirewallCount = closedCenFirewallCount;
            return this;
        }

        /**
         * <p>The number of configured but disabled Express Connect firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder closedExpressConnectFirewallCount(Integer closedExpressConnectFirewallCount) {
            this.closedExpressConnectFirewallCount = closedExpressConnectFirewallCount;
            return this;
        }

        /**
         * <p>The number of all configured but disabled VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder closedVpcFirewallCount(Integer closedVpcFirewallCount) {
            this.closedVpcFirewallCount = closedVpcFirewallCount;
            return this;
        }

        /**
         * <p>The number of configured CEN Basic Edition firewall instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder configuredCenFirewallCount(Integer configuredCenFirewallCount) {
            this.configuredCenFirewallCount = configuredCenFirewallCount;
            return this;
        }

        /**
         * <p>The number of configured CEN regions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder configuredCenFirewallRegionCount(Integer configuredCenFirewallRegionCount) {
            this.configuredCenFirewallRegionCount = configuredCenFirewallRegionCount;
            return this;
        }

        /**
         * <p>The number of configured CEN VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder configuredCenFirewallVpcCount(Integer configuredCenFirewallVpcCount) {
            this.configuredCenFirewallVpcCount = configuredCenFirewallVpcCount;
            return this;
        }

        /**
         * <p>The number of configured CEN transit router firewall instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder configuredCenTrFirewallCount(Integer configuredCenTrFirewallCount) {
            this.configuredCenTrFirewallCount = configuredCenTrFirewallCount;
            return this;
        }

        /**
         * <p>The number of configured Express Connect circuits.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder configuredExpressConnectFirewallCount(Integer configuredExpressConnectFirewallCount) {
            this.configuredExpressConnectFirewallCount = configuredExpressConnectFirewallCount;
            return this;
        }

        /**
         * <p>The number of configured Express Connect VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder configuredExpressConnectVpcCount(Integer configuredExpressConnectVpcCount) {
            this.configuredExpressConnectVpcCount = configuredExpressConnectVpcCount;
            return this;
        }

        /**
         * <p>The number of all configured VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder configuredVpcFirewallCount(Integer configuredVpcFirewallCount) {
            this.configuredVpcFirewallCount = configuredVpcFirewallCount;
            return this;
        }

        /**
         * <p>The number of VPCs with firewalls configured.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configuredVpcFirewallVpcCount(Integer configuredVpcFirewallVpcCount) {
            this.configuredVpcFirewallVpcCount = configuredVpcFirewallVpcCount;
            return this;
        }

        /**
         * <p>The number of Express Connect VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder expressConnectVpcCount(Integer expressConnectVpcCount) {
            this.expressConnectVpcCount = expressConnectVpcCount;
            return this;
        }

        /**
         * <p>The number of unconfigured CEN firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder notConfiguredCenFirewallCount(Integer notConfiguredCenFirewallCount) {
            this.notConfiguredCenFirewallCount = notConfiguredCenFirewallCount;
            return this;
        }

        /**
         * <p>The number of unconfigured CEN transit router firewall instances.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder notConfiguredCenTrFirewallCount(Integer notConfiguredCenTrFirewallCount) {
            this.notConfiguredCenTrFirewallCount = notConfiguredCenTrFirewallCount;
            return this;
        }

        /**
         * <p>The number of unconfigured Express Connect firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder notConfiguredExpressConnectFirewallCount(Integer notConfiguredExpressConnectFirewallCount) {
            this.notConfiguredExpressConnectFirewallCount = notConfiguredExpressConnectFirewallCount;
            return this;
        }

        /**
         * <p>The number of all unconfigured VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder notConfiguredVpcFirewallCount(Integer notConfiguredVpcFirewallCount) {
            this.notConfiguredVpcFirewallCount = notConfiguredVpcFirewallCount;
            return this;
        }

        /**
         * <p>The number of enabled and active VPC connections.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder openedCenExpressConnectVpcCount(Integer openedCenExpressConnectVpcCount) {
            this.openedCenExpressConnectVpcCount = openedCenExpressConnectVpcCount;
            return this;
        }

        /**
         * <p>The number of enabled CEN firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder openedCenFirewallCount(Integer openedCenFirewallCount) {
            this.openedCenFirewallCount = openedCenFirewallCount;
            return this;
        }

        /**
         * <p>The number of VPCs protected by CEN firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder openedCenFirewallVpcCount(Integer openedCenFirewallVpcCount) {
            this.openedCenFirewallVpcCount = openedCenFirewallVpcCount;
            return this;
        }

        /**
         * <p>The number of VPCs protected by CEN transit router firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder openedCenTrFirewallVpcCount(Integer openedCenTrFirewallVpcCount) {
            this.openedCenTrFirewallVpcCount = openedCenTrFirewallVpcCount;
            return this;
        }

        /**
         * <p>The number of CEN Express Connect Router (ECR) instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder openedEcrCount(Integer openedEcrCount) {
            this.openedEcrCount = openedEcrCount;
            return this;
        }

        /**
         * <p>The number of enabled Express Connect firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder openedExpressConnectFirewallCount(Integer openedExpressConnectFirewallCount) {
            this.openedExpressConnectFirewallCount = openedExpressConnectFirewallCount;
            return this;
        }

        /**
         * <p>The number of VPCs protected by Express Connect firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder openedExpressConnectVpcCount(Integer openedExpressConnectVpcCount) {
            this.openedExpressConnectVpcCount = openedExpressConnectVpcCount;
            return this;
        }

        /**
         * <p>The number of protected inter-region connections through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder openedPeerTrCount(Integer openedPeerTrCount) {
            this.openedPeerTrCount = openedPeerTrCount;
            return this;
        }

        /**
         * <p>The total number of protected Virtual Border Routers (VBRs) through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder openedVbrCount(Integer openedVbrCount) {
            this.openedVbrCount = openedVbrCount;
            return this;
        }

        /**
         * <p>The total number of protected VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder openedVpcCount(Integer openedVpcCount) {
            this.openedVpcCount = openedVpcCount;
            return this;
        }

        /**
         * <p>The number of all enabled VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder openedVpcFirewallCount(Integer openedVpcFirewallCount) {
            this.openedVpcFirewallCount = openedVpcFirewallCount;
            return this;
        }

        /**
         * <p>The total number of protected VPN connections through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder openedVpnCount(Integer openedVpnCount) {
            this.openedVpnCount = openedVpnCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8AABEF64-7ABF-52CB-BA6C-0598E3DB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of ECR instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalEcrCount(Integer totalEcrCount) {
            this.totalEcrCount = totalEcrCount;
            return this;
        }

        /**
         * <p>The total number of inter-region connections through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalPeerTrCount(Integer totalPeerTrCount) {
            this.totalPeerTrCount = totalPeerTrCount;
            return this;
        }

        /**
         * <p>The total number of VBRs through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalVbrCount(Integer totalVbrCount) {
            this.totalVbrCount = totalVbrCount;
            return this;
        }

        /**
         * <p>The total number of interconnected VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalVpcCount(Integer totalVpcCount) {
            this.totalVpcCount = totalVpcCount;
            return this;
        }

        /**
         * <p>The total VPC firewall quota.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalVpcFirewallQuota(Integer totalVpcFirewallQuota) {
            this.totalVpcFirewallQuota = totalVpcFirewallQuota;
            return this;
        }

        /**
         * <p>The total number of VPN connections through CEN transit routers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalVpnCount(Integer totalVpnCount) {
            this.totalVpnCount = totalVpnCount;
            return this;
        }

        public DescribeVpcFirewallSummaryInfoResponseBody build() {
            return new DescribeVpcFirewallSummaryInfoResponseBody(this);
        } 

    } 

}
