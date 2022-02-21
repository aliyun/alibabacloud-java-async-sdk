// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardsRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardsRequest</p>
 */
public class ListDashboardsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("DashboardName")
    private String dashboardName;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RecreateSwitch")
    private Boolean recreateSwitch;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Title")
    private String title;

    private ListDashboardsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.dashboardName = builder.dashboardName;
        this.product = builder.product;
        this.recreateSwitch = builder.recreateSwitch;
        this.regionId = builder.regionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardsRequest create() {
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
     * @return dashboardName
     */
    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return recreateSwitch
     */
    public Boolean getRecreateSwitch() {
        return this.recreateSwitch;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ListDashboardsRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String dashboardName; 
        private String product; 
        private Boolean recreateSwitch; 
        private String regionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardsRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.clusterType = response.clusterType;
            this.dashboardName = response.dashboardName;
            this.product = response.product;
            this.recreateSwitch = response.recreateSwitch;
            this.regionId = response.regionId;
            this.title = response.title;
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
         * DashboardName.
         */
        public Builder dashboardName(String dashboardName) {
            this.putQueryParameter("DashboardName", dashboardName);
            this.dashboardName = dashboardName;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RecreateSwitch.
         */
        public Builder recreateSwitch(Boolean recreateSwitch) {
            this.putQueryParameter("RecreateSwitch", recreateSwitch);
            this.recreateSwitch = recreateSwitch;
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

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public ListDashboardsRequest build() {
            return new ListDashboardsRequest(this);
        } 

    } 

}
