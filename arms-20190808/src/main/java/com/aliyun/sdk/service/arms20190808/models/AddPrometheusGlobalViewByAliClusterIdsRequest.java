// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusGlobalViewByAliClusterIdsRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusGlobalViewByAliClusterIdsRequest</p>
 */
public class AddPrometheusGlobalViewByAliClusterIdsRequest extends Request {
    @Query
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private String clusterIds;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * ClusterIds.
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
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
        public AddPrometheusGlobalViewByAliClusterIdsRequest build() {
            return new AddPrometheusGlobalViewByAliClusterIdsRequest(this);
        } 

    } 

}
