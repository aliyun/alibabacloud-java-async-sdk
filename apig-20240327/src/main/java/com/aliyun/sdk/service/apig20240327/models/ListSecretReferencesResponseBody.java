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
 * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretReferencesResponseBody</p>
 */
public class ListSecretReferencesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListSecretReferencesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretReferencesResponseBody create() {
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

        private Builder(ListSecretReferencesResponseBody model) {
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

        public ListSecretReferencesResponseBody build() {
            return new ListSecretReferencesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretReferencesResponseBody</p>
     */
    public static class PluginConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pluginClassId")
        private String pluginClassId;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        private PluginConfig(Builder builder) {
            this.name = builder.name;
            this.pluginClassId = builder.pluginClassId;
            this.pluginId = builder.pluginId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginConfig create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pluginClassId
         */
        public String getPluginClassId() {
            return this.pluginClassId;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        public static final class Builder {
            private String name; 
            private String pluginClassId; 
            private String pluginId; 

            private Builder() {
            } 

            private Builder(PluginConfig model) {
                this.name = model.name;
                this.pluginClassId = model.pluginClassId;
                this.pluginId = model.pluginId;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pluginClassId.
             */
            public Builder pluginClassId(String pluginClassId) {
                this.pluginClassId = pluginClassId;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            public PluginConfig build() {
                return new PluginConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretReferencesResponseBody</p>
     */
    public static class ServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        private ServiceConfig(Builder builder) {
            this.name = builder.name;
            this.serviceId = builder.serviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfig create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        public static final class Builder {
            private String name; 
            private String serviceId; 

            private Builder() {
            } 

            private Builder(ServiceConfig model) {
                this.name = model.name;
                this.serviceId = model.serviceId;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            public ServiceConfig build() {
                return new ServiceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretReferencesResponseBody</p>
     */
    public static class ConsumerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ConsumerConfig(Builder builder) {
            this.consumerId = builder.consumerId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerConfig create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String consumerId; 
            private String name; 

            private Builder() {
            } 

            private Builder(ConsumerConfig model) {
                this.consumerId = model.consumerId;
                this.name = model.name;
            } 

            /**
             * consumerId.
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ConsumerConfig build() {
                return new ConsumerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretReferencesResponseBody</p>
     */
    public static class McpServerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("httpApiId")
        private String httpApiId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("routeId")
        private String routeId;

        private McpServerConfig(Builder builder) {
            this.httpApiId = builder.httpApiId;
            this.name = builder.name;
            this.routeId = builder.routeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServerConfig create() {
            return builder().build();
        }

        /**
         * @return httpApiId
         */
        public String getHttpApiId() {
            return this.httpApiId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        public static final class Builder {
            private String httpApiId; 
            private String name; 
            private String routeId; 

            private Builder() {
            } 

            private Builder(McpServerConfig model) {
                this.httpApiId = model.httpApiId;
                this.name = model.name;
                this.routeId = model.routeId;
            } 

            /**
             * httpApiId.
             */
            public Builder httpApiId(String httpApiId) {
                this.httpApiId = httpApiId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * routeId.
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            public McpServerConfig build() {
                return new McpServerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretReferencesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PluginConfig")
        private PluginConfig pluginConfig;

        @com.aliyun.core.annotation.NameInMap("ServiceConfig")
        private ServiceConfig serviceConfig;

        @com.aliyun.core.annotation.NameInMap("consumerConfig")
        private ConsumerConfig consumerConfig;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
        private McpServerConfig mcpServerConfig;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private Items(Builder builder) {
            this.pluginConfig = builder.pluginConfig;
            this.serviceConfig = builder.serviceConfig;
            this.consumerConfig = builder.consumerConfig;
            this.gatewayId = builder.gatewayId;
            this.mcpServerConfig = builder.mcpServerConfig;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return pluginConfig
         */
        public PluginConfig getPluginConfig() {
            return this.pluginConfig;
        }

        /**
         * @return serviceConfig
         */
        public ServiceConfig getServiceConfig() {
            return this.serviceConfig;
        }

        /**
         * @return consumerConfig
         */
        public ConsumerConfig getConsumerConfig() {
            return this.consumerConfig;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return mcpServerConfig
         */
        public McpServerConfig getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private PluginConfig pluginConfig; 
            private ServiceConfig serviceConfig; 
            private ConsumerConfig consumerConfig; 
            private String gatewayId; 
            private McpServerConfig mcpServerConfig; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.pluginConfig = model.pluginConfig;
                this.serviceConfig = model.serviceConfig;
                this.consumerConfig = model.consumerConfig;
                this.gatewayId = model.gatewayId;
                this.mcpServerConfig = model.mcpServerConfig;
                this.resourceType = model.resourceType;
            } 

            /**
             * PluginConfig.
             */
            public Builder pluginConfig(PluginConfig pluginConfig) {
                this.pluginConfig = pluginConfig;
                return this;
            }

            /**
             * ServiceConfig.
             */
            public Builder serviceConfig(ServiceConfig serviceConfig) {
                this.serviceConfig = serviceConfig;
                return this;
            }

            /**
             * consumerConfig.
             */
            public Builder consumerConfig(ConsumerConfig consumerConfig) {
                this.consumerConfig = consumerConfig;
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
             * mcpServerConfig.
             */
            public Builder mcpServerConfig(McpServerConfig mcpServerConfig) {
                this.mcpServerConfig = mcpServerConfig;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretReferencesResponseBody</p>
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
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalSize.
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
