// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardsByNameRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardsByNameRequest</p>
 */
public class ListDashboardsByNameRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("DashBoardName")
    private String dashBoardName;

    @Query
    @NameInMap("DashBoardVersion")
    private String dashBoardVersion;

    @Query
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("OnlyQuery")
    private Boolean onlyQuery;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * DashBoardName.
         */
        public Builder dashBoardName(String dashBoardName) {
            this.putQueryParameter("DashBoardName", dashBoardName);
            this.dashBoardName = dashBoardName;
            return this;
        }

        /**
         * DashBoardVersion.
         */
        public Builder dashBoardVersion(String dashBoardVersion) {
            this.putQueryParameter("DashBoardVersion", dashBoardVersion);
            this.dashBoardVersion = dashBoardVersion;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
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
         * OnlyQuery.
         */
        public Builder onlyQuery(Boolean onlyQuery) {
            this.putQueryParameter("OnlyQuery", onlyQuery);
            this.onlyQuery = onlyQuery;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * RegionId.
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
