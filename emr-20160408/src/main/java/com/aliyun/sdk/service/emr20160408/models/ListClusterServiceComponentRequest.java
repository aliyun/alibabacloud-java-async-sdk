// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceComponentRequest} extends {@link RequestModel}
 *
 * <p>ListClusterServiceComponentRequest</p>
 */
public class ListClusterServiceComponentRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentName")
    private String componentName;

    @Query
    @NameInMap("ComponentStatus")
    private String componentStatus;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PodName")
    private String podName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    private ListClusterServiceComponentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentName = builder.componentName;
        this.componentStatus = builder.componentStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.podName = builder.podName;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceComponentRequest create() {
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
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return componentStatus
     */
    public String getComponentStatus() {
        return this.componentStatus;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListClusterServiceComponentRequest, Builder> {
        private String clusterId; 
        private String componentName; 
        private String componentStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String podName; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterServiceComponentRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.componentName = response.componentName;
            this.componentStatus = response.componentStatus;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.podName = response.podName;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serviceName = response.serviceName;
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
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * ComponentStatus.
         */
        public Builder componentStatus(String componentStatus) {
            this.putQueryParameter("ComponentStatus", componentStatus);
            this.componentStatus = componentStatus;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListClusterServiceComponentRequest build() {
            return new ListClusterServiceComponentRequest(this);
        } 

    } 

}
