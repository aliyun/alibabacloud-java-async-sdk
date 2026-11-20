// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
    @com.aliyun.core.annotation.NameInMap("ListReplica")
    private Boolean listReplica;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberType")
    private String memberType;

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
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaName")
    private String replicaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

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
        this.listReplica = builder.listReplica;
        this.memberType = builder.memberType;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.quotaId = builder.quotaId;
        this.replicaName = builder.replicaName;
        this.resource = builder.resource;
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
     * @return listReplica
     */
    public Boolean getListReplica() {
        return this.listReplica;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
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
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return replicaName
     */
    public String getReplicaName() {
        return this.replicaName;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
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
        private Boolean listReplica; 
        private String memberType; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String quotaId; 
        private String replicaName; 
        private String resource; 
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
            this.listReplica = request.listReplica;
            this.memberType = request.memberType;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.quotaId = request.quotaId;
            this.replicaName = request.replicaName;
            this.resource = request.resource;
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
         * <p>The service name. For more information, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
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
         * <p>A keyword for the search. You can search by instance name, instance IP address, host IP address, or instance type.</p>
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
         * <p>The IP address of the host where the service instance is deployed.</p>
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
         * <p>The IP address of the service instance.</p>
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
         * <p>The name of the service instance.</p>
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
         * <p>The status of the service instance.</p>
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
         * <p>Specifies whether the instance is a spot instance.</p>
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
         * <p>Specifies whether to query the list of instance replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder listReplica(Boolean listReplica) {
            this.putQueryParameter("ListReplica", listReplica);
            this.listReplica = listReplica;
            return this;
        }

        /**
         * <p>The type of the sub-service. This parameter is valid only for aggregation services.</p>
         * 
         * <strong>example:</strong>
         * <p>LLMDecode</p>
         */
        public Builder memberType(String memberType) {
            this.putQueryParameter("MemberType", memberType);
            this.memberType = memberType;
            return this;
        }

        /**
         * <p>The sort order.</p>
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
         * <p>The page number. The default value is 1.</p>
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
         * <p>The number of entries to return on each page. The default value is 100.</p>
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
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1****</p>
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The name of the instance replica.</p>
         * 
         * <strong>example:</strong>
         * <p>cbh-qwen3-a1bc-prefill-ep1tp4dp</p>
         */
        public Builder replicaName(String replicaName) {
            this.putQueryParameter("ReplicaName", replicaName);
            this.replicaName = replicaName;
            return this;
        }

        /**
         * <p>The resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-xxxxxxx</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The type of the resource group to which the service instance belongs.</p>
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
         * <p>The role of the service.</p>
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
         * <p>The field to use for sorting.</p>
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
