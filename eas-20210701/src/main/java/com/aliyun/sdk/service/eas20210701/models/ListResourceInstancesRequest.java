// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceInstancesRequest</p>
 */
public class ListResourceInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIP")
    private String instanceIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    private ListResourceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.chargeType = builder.chargeType;
        this.filter = builder.filter;
        this.instanceIP = builder.instanceIP;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceStatus = builder.instanceStatus;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceInstancesRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return instanceIP
     */
    public String getInstanceIP() {
        return this.instanceIP;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListResourceInstancesRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String chargeType; 
        private String filter; 
        private String instanceIP; 
        private String instanceId; 
        private String instanceName; 
        private String instanceStatus; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.chargeType = request.chargeType;
            this.filter = request.filter;
            this.instanceIP = request.instanceIP;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.instanceStatus = request.instanceStatus;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sort = request.sort;
        } 

        /**
         * The ID of the region to which the resource group belongs.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the resource group. For more information about how to query the ID of a resource group, see [ListResources](~~412133~~).
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription.
         * *   PostPaid: pay-as-you-go.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The keyword used to query instances. Instances can be queried by instance ID or instance IP address.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The IP address of the instance.
         */
        public Builder instanceIP(String instanceIP) {
            this.putQueryParameter("InstanceIP", instanceIP);
            this.instanceIP = instanceIP;
            return this;
        }

        /**
         * The instance ID. For more information about how to query the instance ID, see [ListResourceInstances](~~412129~~).
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The instance name.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The instance state.
         * <p>
         * 
         * Valid values:
         * 
         * *   Ready-SchedulingDisabled
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The instance is available but unschedulable
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   Ready
         * 
         *     <!-- -->
         * 
         *     : The instance
         * 
         *     <!-- -->
         * 
         *     is running
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   NotReady
         * 
         *     <!-- -->
         * 
         *     : The instance is unready.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Stopped
         * 
         *     <!-- -->
         * 
         *     : The instance has stopped.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   NotReady-SchedulingDisabled
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The instance is unavailable and unschedulable
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   Attaching
         * 
         *     <!-- -->
         * 
         *     : The instance
         * 
         *     <!-- -->
         * 
         *     is starting
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   Deleting
         * 
         *     <!-- -->
         * 
         *     : The instance is being deleted.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CreateFailed: The instance failed to be created.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder instanceStatus(String instanceStatus) {
            this.putQueryParameter("InstanceStatus", instanceStatus);
            this.instanceStatus = instanceStatus;
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
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The field that you use to sort the query results.
         * <p>
         * 
         * Valid values:
         * 
         * *   CreateTime
         * 
         *     <!-- -->
         * 
         *     : The instances are sorted based on the time when the instances were created.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   MemoryUsed
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The instances are sorted based on the memory usage of the instances
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   GpuUsed
         * 
         *     <!-- -->
         * 
         *     : The instances are sorted based on the
         * 
         *     <!-- -->
         * 
         *     GPU usage of the instances.
         * 
         *     <!-- -->
         * 
         * *   ExpireTime: The instances are sorted based on the time when the instances expired.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CpuUsed
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The instances are sorted based on the CPU utilization of the instances.
         * 
         *     <!-- -->
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListResourceInstancesRequest build() {
            return new ListResourceInstancesRequest(this);
        } 

    } 

}
