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
 * {@link DescribeVpcFirewallAssetListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallAssetListRequest</p>
 */
public class DescribeVpcFirewallAssetListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetIP")
    private String assetIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceName")
    private String ecsInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPProtocol")
    private String IPProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAITraffic")
    private String isAITraffic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcId")
    private String peerVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private DescribeVpcFirewallAssetListRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.assetIP = builder.assetIP;
        this.currentPage = builder.currentPage;
        this.direction = builder.direction;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.ecsInstanceName = builder.ecsInstanceName;
        this.endTime = builder.endTime;
        this.IPProtocol = builder.IPProtocol;
        this.isAITraffic = builder.isAITraffic;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.peerVpcId = builder.peerVpcId;
        this.port = builder.port;
        this.riskLevel = builder.riskLevel;
        this.sort = builder.sort;
        this.startTime = builder.startTime;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAssetListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return assetIP
     */
    public String getAssetIP() {
        return this.assetIP;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    /**
     * @return ecsInstanceName
     */
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return IPProtocol
     */
    public String getIPProtocol() {
        return this.IPProtocol;
    }

    /**
     * @return isAITraffic
     */
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallAssetListRequest, Builder> {
        private String appName; 
        private String assetIP; 
        private String currentPage; 
        private String direction; 
        private String ecsInstanceId; 
        private String ecsInstanceName; 
        private String endTime; 
        private String IPProtocol; 
        private String isAITraffic; 
        private String lang; 
        private String order; 
        private String pageSize; 
        private String peerVpcId; 
        private String port; 
        private String riskLevel; 
        private String sort; 
        private String startTime; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallAssetListRequest request) {
            super(request);
            this.appName = request.appName;
            this.assetIP = request.assetIP;
            this.currentPage = request.currentPage;
            this.direction = request.direction;
            this.ecsInstanceId = request.ecsInstanceId;
            this.ecsInstanceName = request.ecsInstanceName;
            this.endTime = request.endTime;
            this.IPProtocol = request.IPProtocol;
            this.isAITraffic = request.isAITraffic;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.peerVpcId = request.peerVpcId;
            this.port = request.port;
            this.riskLevel = request.riskLevel;
            this.sort = request.sort;
            this.startTime = request.startTime;
            this.vpcId = request.vpcId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AssetIP.
         */
        public Builder assetIP(String assetIP) {
            this.putQueryParameter("AssetIP", assetIP);
            this.assetIP = assetIP;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EcsInstanceId.
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * EcsInstanceName.
         */
        public Builder ecsInstanceName(String ecsInstanceName) {
            this.putQueryParameter("EcsInstanceName", ecsInstanceName);
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1756952150</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IPProtocol.
         */
        public Builder IPProtocol(String IPProtocol) {
            this.putQueryParameter("IPProtocol", IPProtocol);
            this.IPProtocol = IPProtocol;
            return this;
        }

        /**
         * IsAITraffic.
         */
        public Builder isAITraffic(String isAITraffic) {
            this.putQueryParameter("IsAITraffic", isAITraffic);
            this.isAITraffic = isAITraffic;
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
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PeerVpcId.
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9ulqcvly23w31zkh8sm****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeVpcFirewallAssetListRequest build() {
            return new DescribeVpcFirewallAssetListRequest(this);
        } 

    } 

}
