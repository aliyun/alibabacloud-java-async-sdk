// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostComponentRequest} extends {@link RequestModel}
 *
 * <p>ListClusterHostComponentRequest</p>
 */
public class ListClusterHostComponentRequest extends Request {
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
    @NameInMap("HostInstanceId")
    private String hostInstanceId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("HostRole")
    private String hostRole;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

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

    private ListClusterHostComponentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentName = builder.componentName;
        this.componentStatus = builder.componentStatus;
        this.hostInstanceId = builder.hostInstanceId;
        this.hostName = builder.hostName;
        this.hostRole = builder.hostRole;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHostComponentRequest create() {
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
     * @return hostInstanceId
     */
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return hostRole
     */
    public String getHostRole() {
        return this.hostRole;
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

    public static final class Builder extends Request.Builder<ListClusterHostComponentRequest, Builder> {
        private String clusterId; 
        private String componentName; 
        private String componentStatus; 
        private String hostInstanceId; 
        private String hostName; 
        private String hostRole; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterHostComponentRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.componentName = response.componentName;
            this.componentStatus = response.componentStatus;
            this.hostInstanceId = response.hostInstanceId;
            this.hostName = response.hostName;
            this.hostRole = response.hostRole;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
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
         * HostInstanceId.
         */
        public Builder hostInstanceId(String hostInstanceId) {
            this.putQueryParameter("HostInstanceId", hostInstanceId);
            this.hostInstanceId = hostInstanceId;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * HostRole.
         */
        public Builder hostRole(String hostRole) {
            this.putQueryParameter("HostRole", hostRole);
            this.hostRole = hostRole;
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
        public ListClusterHostComponentRequest build() {
            return new ListClusterHostComponentRequest(this);
        } 

    } 

}
