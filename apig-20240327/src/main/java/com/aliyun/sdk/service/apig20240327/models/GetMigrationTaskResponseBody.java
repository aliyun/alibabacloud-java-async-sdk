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
 * {@link GetMigrationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetMigrationTaskResponseBody</p>
 */
public class GetMigrationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMigrationTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationTaskResponseBody create() {
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

        private Builder(GetMigrationTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
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
         * <p>42EAF9DB-9082-5F11-8EE1-C2357906DA0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMigrationTaskResponseBody build() {
            return new GetMigrationTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationTaskResponseBody</p>
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
             * <p>The Ingress class to listen on.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>The namespace in which to listen for Ingress resources.</p>
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
     * {@link GetMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationTaskResponseBody</p>
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
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. This parameter is required for CLB.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The backend server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-xxxx</p>
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * <p>The name.</p>
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
     * {@link GetMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
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
             * <p>The ID of the associated HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name. This value may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>ingress-api</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The ID of the source ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c-xxxxxx</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the source cluster. The name is retrieved by looking up the service source based on gatewayId and clusterId. If the lookup fails, a hyphen (-) is returned as a fallback.</p>
             * 
             * <strong>example:</strong>
             * <p>my-cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The namespace of the source cluster. This value is selected during SLB traffic switching.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder clusterNamespace(String clusterNamespace) {
                this.clusterNamespace = clusterNamespace;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in seconds. Multiply the value by 1000 on the frontend before formatting.</p>
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
             * <p>workspace api monitor test</p>
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
             * <p>The name of the destination gateway. If the query fails, a hyphen (-) is returned as a fallback without blocking the return of the main task information.</p>
             * 
             * <strong>example:</strong>
             * <p>my-gateway</p>
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * <p>The Ingress configuration.</p>
             */
            public Builder ingressConfig(IngressConfig ingressConfig) {
                this.ingressConfig = ingressConfig;
                return this;
            }

            /**
             * <p>The migration type.
             * [_single.resp.200.props.data.migrationType.enum.Nginx Ingress]Nginx Ingress migration.</p>
             * 
             * <strong>example:</strong>
             * <p>Nginx Ingress</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The name of the selected SLB service.</p>
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
             * <p>The traffic switching method.</p>
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
             * <p>The list of SLB virtual server groups.</p>
             */
            public Builder virtualServices(java.util.List<VirtualServices> virtualServices) {
                this.virtualServices = virtualServices;
                return this;
            }

            /**
             * <p>The weight of the APIG-side service in the legacy flow (0-100).</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
