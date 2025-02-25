// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListDashboardsByNameRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardsByNameRequest</p>
 */
public class ListDashboardsByNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashBoardName")
    private String dashBoardName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashBoardVersion")
    private String dashBoardVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyQuery")
    private Boolean onlyQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListDashboardsByNameRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.dashBoardName = builder.dashBoardName;
        this.dashBoardVersion = builder.dashBoardVersion;
        this.dataSourceType = builder.dataSourceType;
        this.groupName = builder.groupName;
        this.onlyQuery = builder.onlyQuery;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardsByNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return dashBoardName
     */
    public String getDashBoardName() {
        return this.dashBoardName;
    }

    /**
     * @return dashBoardVersion
     */
    public String getDashBoardVersion() {
        return this.dashBoardVersion;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return onlyQuery
     */
    public Boolean getOnlyQuery() {
        return this.onlyQuery;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDashboardsByNameRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String dashBoardName; 
        private String dashBoardVersion; 
        private String dataSourceType; 
        private String groupName; 
        private Boolean onlyQuery; 
        private String productCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardsByNameRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterType = request.clusterType;
            this.dashBoardName = request.dashBoardName;
            this.dashBoardVersion = request.dashBoardVersion;
            this.dataSourceType = request.dataSourceType;
            this.groupName = request.groupName;
            this.onlyQuery = request.onlyQuery;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cluster. If the ClusterType parameter is not set to <code>cloud-product-prometheus</code> or <code>cms-enterprise-prometheus</code>, you must specify the ClusterId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li>vpc-prometheus</li>
         * <li>cloud-product-prometheus</li>
         * <li>cms-enterprise-prometheus</li>
         * <li>ExternalKubernetes</li>
         * <li>Ask</li>
         * <li>Kubernetes</li>
         * <li>ManagedKubernetes</li>
         * <li>remote-write-prometheus</li>
         * <li>GlobalViewV2</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud-product-prometheus</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The name of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>edas-ingress-url</p>
         */
        public Builder dashBoardName(String dashBoardName) {
            this.putQueryParameter("DashBoardName", dashBoardName);
            this.dashBoardName = dashBoardName;
            return this;
        }

        /**
         * <p>The version of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        public Builder dashBoardVersion(String dashBoardVersion) {
            this.putQueryParameter("DashBoardVersion", dashBoardVersion);
            this.dashBoardVersion = dashBoardVersion;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>loki</li>
         * <li>prometheus</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>loki</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The name of the dashboard group.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Specifies whether to display the Grafana dashboard only in the Application Real-Time Monitoring Service (ARMS) console.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onlyQuery(Boolean onlyQuery) {
            this.putQueryParameter("OnlyQuery", onlyQuery);
            this.onlyQuery = onlyQuery;
            return this;
        }

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>edas</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDashboardsByNameRequest build() {
            return new ListDashboardsByNameRequest(this);
        } 

    } 

}
