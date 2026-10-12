// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListMigrationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationTasksResponseBody</p>
 */
public class ListMigrationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMigrationTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMigrationTasksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>019FB5FB-615B-52AB-A92F-D40A3193DA96</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMigrationTasksResponseBody build() {
            return new ListMigrationTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMigrationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationTasksResponseBody</p>
     */
    public static class IngressConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ingressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("watchNamespace")
        private String watchNamespace;

        private IngressConfig(Builder builder) {
            this.ingressClass = builder.ingressClass;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressConfig create() {
            return builder().build();
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private String ingressClass; 
            private String watchNamespace; 

            private Builder() {
            } 

            private Builder(IngressConfig model) {
                this.ingressClass = model.ingressClass;
                this.watchNamespace = model.watchNamespace;
            } 

            /**
             * <p>The monitored Ingress Class.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>The monitored namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressConfig build() {
                return new IngressConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationTasksResponseBody</p>
     */
    public static class VirtualServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupId")
        private String virtualServiceGroupId;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupName")
        private String virtualServiceGroupName;

        private VirtualServices(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.virtualServiceGroupId = builder.virtualServiceGroupId;
            this.virtualServiceGroupName = builder.virtualServiceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualServices create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return virtualServiceGroupId
         */
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        /**
         * @return virtualServiceGroupName
         */
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 
            private String virtualServiceGroupId; 
            private String virtualServiceGroupName; 

            private Builder() {
            } 

            private Builder(VirtualServices model) {
                this.port = model.port;
                this.protocol = model.protocol;
                this.virtualServiceGroupId = model.virtualServiceGroupId;
                this.virtualServiceGroupName = model.virtualServiceGroupName;
            } 

            /**
             * <p>The listener port. Valid values: 1 to 65535. This parameter is required in Step 3 of the frontend form.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The listener protocol. This parameter is required for CLB migration. During MSE migration validation, CLB requests without a protocol are directly rejected. See migrationtask.go#L95-L97. This parameter can be left empty for NLB scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The virtual server group ID. For CLB, this is the VServerGroupId. For NLB, this is the ServerGroupId. This parameter is required in Step 3 of the frontend form.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-xxxx</p>
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * <p>The name of the virtual server group.</p>
             * 
             * <strong>example:</strong>
             * <p>80-tcp</p>
             */
            public Builder virtualServiceGroupName(String virtualServiceGroupName) {
                this.virtualServiceGroupName = virtualServiceGroupName;
                return this;
            }

            public VirtualServices build() {
                return new VirtualServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("clusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("clusterNamespace")
        private String clusterNamespace;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("envId")
        private String envId;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("gatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("ingressConfig")
        private IngressConfig ingressConfig;

        @com.aliyun.core.annotation.NameInMap("migrationType")
        private String migrationType;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("slbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("switchType")
        private String switchType;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("virtualServices")
        private java.util.List<VirtualServices> virtualServices;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private Items(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterNamespace = builder.clusterNamespace;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.envId = builder.envId;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.ingressConfig = builder.ingressConfig;
            this.migrationType = builder.migrationType;
            this.serviceName = builder.serviceName;
            this.slbId = builder.slbId;
            this.status = builder.status;
            this.switchType = builder.switchType;
            this.taskId = builder.taskId;
            this.userId = builder.userId;
            this.virtualServices = builder.virtualServices;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterNamespace
         */
        public String getClusterNamespace() {
            return this.clusterNamespace;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return ingressConfig
         */
        public IngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchType
         */
        public String getSwitchType() {
            return this.switchType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return virtualServices
         */
        public java.util.List<VirtualServices> getVirtualServices() {
            return this.virtualServices;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String clusterId; 
            private String clusterName; 
            private String clusterNamespace; 
            private Long createTime; 
            private String description; 
            private String envId; 
            private String gatewayId; 
            private String gatewayName; 
            private IngressConfig ingressConfig; 
            private String migrationType; 
            private String serviceName; 
            private String slbId; 
            private String status; 
            private String switchType; 
            private String taskId; 
            private String userId; 
            private java.util.List<VirtualServices> virtualServices; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterNamespace = model.clusterNamespace;
                this.createTime = model.createTime;
                this.description = model.description;
                this.envId = model.envId;
                this.gatewayId = model.gatewayId;
                this.gatewayName = model.gatewayName;
                this.ingressConfig = model.ingressConfig;
                this.migrationType = model.migrationType;
                this.serviceName = model.serviceName;
                this.slbId = model.slbId;
                this.status = model.status;
                this.switchType = model.switchType;
                this.taskId = model.taskId;
                this.userId = model.userId;
                this.virtualServices = model.virtualServices;
                this.weight = model.weight;
            } 

            /**
             * <p>The associated HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The associated HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-name</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The source ACK cluster. A hyphen (-) is displayed if the cluster name fails to be queried.</p>
             * 
             * <strong>example:</strong>
             * <p>c-xxxxxx</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_hz_domain_1</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The namespace for SLB traffic switching.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder clusterNamespace(String clusterNamespace) {
                this.clusterNamespace = clusterNamespace;
                return this;
            }

            /**
             * <p>The creation time, in Unix seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1756262400</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>Migration test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the destination environment.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxxx</p>
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * <p>The ID of the destination gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The name of the gateway to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-gateway</p>
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * <p>The monitored Ingress Class configuration.</p>
             */
            public Builder ingressConfig(IngressConfig ingressConfig) {
                this.ingressConfig = ingressConfig;
                return this;
            }

            /**
             * <p>The migration type. Currently, only Nginx Ingress is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Nginx Ingress</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The name of the SLB service.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx-ingress-lb</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The ID of the SLB instance used for traffic switching.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1xxxx</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>FlowSwitch</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The traffic switching method. Valid values: DNS and SLB.</p>
             * 
             * <strong>example:</strong>
             * <p>SLB</p>
             */
            public Builder switchType(String switchType) {
                this.switchType = switchType;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mt-xxxxxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The ID of the user to whom the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The list of virtual server groups.</p>
             */
            public Builder virtualServices(java.util.List<VirtualServices> virtualServices) {
                this.virtualServices = virtualServices;
                return this;
            }

            /**
             * <p>The weight of the service on the API gateway side in the legacy workflow. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
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
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The list of migration tasks.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
