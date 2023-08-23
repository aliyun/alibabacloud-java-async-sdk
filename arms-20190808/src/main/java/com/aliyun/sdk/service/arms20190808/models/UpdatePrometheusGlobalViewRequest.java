// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusGlobalViewRequest</p>
 */
public class UpdatePrometheusGlobalViewRequest extends Request {
    @Query
    @NameInMap("AllSubClustersSuccess")
    private Boolean allSubClustersSuccess;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("MostRegionId")
    private String mostRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SubClustersJson")
    @Validation(required = true)
    private String subClustersJson;

    private UpdatePrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.allSubClustersSuccess = builder.allSubClustersSuccess;
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.mostRegionId = builder.mostRegionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subClustersJson = builder.subClustersJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allSubClustersSuccess
     */
    public Boolean getAllSubClustersSuccess() {
        return this.allSubClustersSuccess;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return mostRegionId
     */
    public String getMostRegionId() {
        return this.mostRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subClustersJson
     */
    public String getSubClustersJson() {
        return this.subClustersJson;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusGlobalViewRequest, Builder> {
        private Boolean allSubClustersSuccess; 
        private String clusterId; 
        private String groupName; 
        private String mostRegionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subClustersJson; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusGlobalViewRequest request) {
            super(request);
            this.allSubClustersSuccess = request.allSubClustersSuccess;
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.mostRegionId = request.mostRegionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subClustersJson = request.subClustersJson;
        } 

        /**
         * 创建GlobalView时，是否要求所有子实例都校验成功时，才创建GlobalView实例。默认是false，即可以部分成功。
         */
        public Builder allSubClustersSuccess(Boolean allSubClustersSuccess) {
            this.putQueryParameter("AllSubClustersSuccess", allSubClustersSuccess);
            this.allSubClustersSuccess = allSubClustersSuccess;
            return this;
        }

        /**
         * The ID of the Prometheus instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * MostRegionId.
         */
        public Builder mostRegionId(String mostRegionId) {
            this.putQueryParameter("MostRegionId", mostRegionId);
            this.mostRegionId = mostRegionId;
            return this;
        }

        /**
         * The ID of the region in which the Prometheus instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the Prometheus instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The data sources of the Prometheus instance for GlobalView.
         */
        public Builder subClustersJson(String subClustersJson) {
            this.putQueryParameter("SubClustersJson", subClustersJson);
            this.subClustersJson = subClustersJson;
            return this;
        }

        @Override
        public UpdatePrometheusGlobalViewRequest build() {
            return new UpdatePrometheusGlobalViewRequest(this);
        } 

    } 

}
