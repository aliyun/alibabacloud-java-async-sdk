// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstancesRequest</p>
 */
public class ListServiceInstancesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("HostIP")
    private String hostIP;

    @Query
    @NameInMap("InstanceIP")
    private String instanceIP;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("IsSpot")
    private Boolean isSpot;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Sort")
    private String sort;

    private ListServiceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.filter = builder.filter;
        this.hostIP = builder.hostIP;
        this.instanceIP = builder.instanceIP;
        this.instanceName = builder.instanceName;
        this.instanceStatus = builder.instanceStatus;
        this.instanceType = builder.instanceType;
        this.isSpot = builder.isSpot;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.role = builder.role;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstancesRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return hostIP
     */
    public String getHostIP() {
        return this.hostIP;
    }

    /**
     * @return instanceIP
     */
    public String getInstanceIP() {
        return this.instanceIP;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isSpot
     */
    public Boolean getIsSpot() {
        return this.isSpot;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListServiceInstancesRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String filter; 
        private String hostIP; 
        private String instanceIP; 
        private String instanceName; 
        private String instanceStatus; 
        private String instanceType; 
        private Boolean isSpot; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceType; 
        private String role; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.filter = request.filter;
            this.hostIP = request.hostIP;
            this.instanceIP = request.instanceIP;
            this.instanceName = request.instanceName;
            this.instanceStatus = request.instanceStatus;
            this.instanceType = request.instanceType;
            this.isSpot = request.isSpot;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.role = request.role;
            this.sort = request.sort;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * HostIP.
         */
        public Builder hostIP(String hostIP) {
            this.putQueryParameter("HostIP", hostIP);
            this.hostIP = hostIP;
            return this;
        }

        /**
         * InstanceIP.
         */
        public Builder instanceIP(String instanceIP) {
            this.putQueryParameter("InstanceIP", instanceIP);
            this.instanceIP = instanceIP;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.putQueryParameter("InstanceStatus", instanceStatus);
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * IsSpot.
         */
        public Builder isSpot(Boolean isSpot) {
            this.putQueryParameter("IsSpot", isSpot);
            this.isSpot = isSpot;
            return this;
        }

        /**
         * The sorting order.
         * <p>
         * 
         * Valid values:
         * 
         * *   asc: The instances are sorted in ascending order.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   desc
         * 
         *     <!-- -->
         * 
         *     : The instances are sorted in descending order.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
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

        @Override
        public ListServiceInstancesRequest build() {
            return new ListServiceInstancesRequest(this);
        } 

    } 

}
