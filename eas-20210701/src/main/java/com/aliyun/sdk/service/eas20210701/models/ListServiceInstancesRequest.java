// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListServiceInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstancesRequest</p>
 */
public class ListServiceInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostIP")
    private String hostIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIP")
    private String instanceIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSpot")
    private Boolean isSpot;

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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
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
         * <p>The ID of the region where the service is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The keyword used to query instances. Instances can be queried based on instance name, instance IP address, IP address of the server where the instance resides, and instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>10.118.xx.xx</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The IP address of the server where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>10.224.xx.xx</p>
         */
        public Builder hostIP(String hostIP) {
            this.putQueryParameter("HostIP", hostIP);
            this.hostIP = hostIP;
            return this;
        }

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.224.xx.xx</p>
         */
        public Builder instanceIP(String instanceIP) {
            this.putQueryParameter("InstanceIP", instanceIP);
            this.instanceIP = instanceIP;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>foo-bdc5xxxx-8l7rk</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance state.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.putQueryParameter("InstanceStatus", instanceStatus);
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether the instance is a preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSpot(Boolean isSpot) {
            this.putQueryParameter("IsSpot", isSpot);
            this.isSpot = isSpot;
            return this;
        }

        /**
         * <p>The sorting order.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>asc</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>The instances are sorted in ascending order.</p>
         * </li>
         * <li><p>desc</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>The instances are sorted in descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the resource group to which the instance belongs.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PublicResource</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DedicatedResource</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicResource</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The service role.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>DataSet</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>dataset service</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>SDProxy</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Stable-Diffusion proxy service</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>Standard</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>standard service</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>Queue</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>queue service</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Queue</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The field that you use to sort the query results.</p>
         * <ul>
         * <li><p>Set the value to StartTime.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>The value specifies that the query results are sorted based on the time when the instances were created</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StartTime</p>
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
