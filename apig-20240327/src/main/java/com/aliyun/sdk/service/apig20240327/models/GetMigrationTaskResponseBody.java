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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
             * ingressClass.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * watchNamespace.
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
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * virtualServiceGroupId.
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * virtualServiceGroupName.
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
             * apiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * clusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * clusterNamespace.
             */
            public Builder clusterNamespace(String clusterNamespace) {
                this.clusterNamespace = clusterNamespace;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * envId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * gatewayName.
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * ingressConfig.
             */
            public Builder ingressConfig(IngressConfig ingressConfig) {
                this.ingressConfig = ingressConfig;
                return this;
            }

            /**
             * migrationType.
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * slbId.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * switchType.
             */
            public Builder switchType(String switchType) {
                this.switchType = switchType;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * virtualServices.
             */
            public Builder virtualServices(java.util.List<VirtualServices> virtualServices) {
                this.virtualServices = virtualServices;
                return this;
            }

            /**
             * weight.
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
