// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusGlobalViewByAliClusterIdsRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusGlobalViewByAliClusterIdsRequest</p>
 */
public class AddPrometheusGlobalViewByAliClusterIdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddPrometheusGlobalViewByAliClusterIdsRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.groupName = builder.groupName;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusGlobalViewByAliClusterIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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

    public static final class Builder extends Request.Builder<AddPrometheusGlobalViewByAliClusterIdsRequest, Builder> {
        private String clusterIds; 
        private String groupName; 
        private String productCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddPrometheusGlobalViewByAliClusterIdsRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.groupName = request.groupName;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of clusters. Separate multiple IDs with commas (,).
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * The name of the global aggregation instance.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The identifier to identify the service if custom dashboards are created for the specified clusters.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddPrometheusGlobalViewByAliClusterIdsRequest build() {
            return new AddPrometheusGlobalViewByAliClusterIdsRequest(this);
        } 

    } 

}
