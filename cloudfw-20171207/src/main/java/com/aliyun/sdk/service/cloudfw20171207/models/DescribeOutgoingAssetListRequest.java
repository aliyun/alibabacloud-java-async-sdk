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
 * {@link DescribeOutgoingAssetListRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingAssetListRequest</p>
 */
public class DescribeOutgoingAssetListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsRegion")
    private String assetsRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPType")
    private String IPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayName")
    private String natGatewayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIP")
    private String privateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIP")
    private String publicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityRisk")
    private String securityRisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeOutgoingAssetListRequest(Builder builder) {
        super(builder);
        this.assetsRegion = builder.assetsRegion;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.groupName = builder.groupName;
        this.IPType = builder.IPType;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.natGatewayName = builder.natGatewayName;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.privateIP = builder.privateIP;
        this.publicIP = builder.publicIP;
        this.resourceType = builder.resourceType;
        this.securityRisk = builder.securityRisk;
        this.sort = builder.sort;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingAssetListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsRegion
     */
    public String getAssetsRegion() {
        return this.assetsRegion;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return IPType
     */
    public String getIPType() {
        return this.IPType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natGatewayName
     */
    public String getNatGatewayName() {
        return this.natGatewayName;
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
     * @return privateIP
     */
    public String getPrivateIP() {
        return this.privateIP;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return securityRisk
     */
    public String getSecurityRisk() {
        return this.securityRisk;
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

    public static final class Builder extends Request.Builder<DescribeOutgoingAssetListRequest, Builder> {
        private String assetsRegion; 
        private String currentPage; 
        private String endTime; 
        private String groupName; 
        private String IPType; 
        private String lang; 
        private String natGatewayId; 
        private String natGatewayName; 
        private String order; 
        private String pageSize; 
        private String privateIP; 
        private String publicIP; 
        private String resourceType; 
        private String securityRisk; 
        private String sort; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingAssetListRequest request) {
            super(request);
            this.assetsRegion = request.assetsRegion;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.groupName = request.groupName;
            this.IPType = request.IPType;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.natGatewayName = request.natGatewayName;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.privateIP = request.privateIP;
            this.publicIP = request.publicIP;
            this.resourceType = request.resourceType;
            this.securityRisk = request.securityRisk;
            this.sort = request.sort;
            this.startTime = request.startTime;
        } 

        /**
         * AssetsRegion.
         */
        public Builder assetsRegion(String assetsRegion) {
            this.putQueryParameter("AssetsRegion", assetsRegion);
            this.assetsRegion = assetsRegion;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1736438400</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IPType.
         */
        public Builder IPType(String IPType) {
            this.putQueryParameter("IPType", IPType);
            this.IPType = IPType;
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
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * NatGatewayName.
         */
        public Builder natGatewayName(String natGatewayName) {
            this.putQueryParameter("NatGatewayName", natGatewayName);
            this.natGatewayName = natGatewayName;
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
         * PrivateIP.
         */
        public Builder privateIP(String privateIP) {
            this.putQueryParameter("PrivateIP", privateIP);
            this.privateIP = privateIP;
            return this;
        }

        /**
         * PublicIP.
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SecurityRisk.
         */
        public Builder securityRisk(String securityRisk) {
            this.putQueryParameter("SecurityRisk", securityRisk);
            this.securityRisk = securityRisk;
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
         * <p>1743647114</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeOutgoingAssetListRequest build() {
            return new DescribeOutgoingAssetListRequest(this);
        } 

    } 

}
