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
 * {@link ListMcpServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcpServersResponseBody</p>
 */
public class ListMcpServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMcpServersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpServersResponseBody create() {
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

        private Builder(ListMcpServersResponseBody model) {
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
         * 
         * <strong>example:</strong>
         * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMcpServersResponseBody build() {
            return new ListMcpServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
     */
    public static class AssembledSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("mcpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<String> tools;

        private AssembledSources(Builder builder) {
            this.mcpServerId = builder.mcpServerId;
            this.mcpServerName = builder.mcpServerName;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssembledSources create() {
            return builder().build();
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        /**
         * @return tools
         */
        public java.util.List<String> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private String mcpServerId; 
            private String mcpServerName; 
            private java.util.List<String> tools; 

            private Builder() {
            } 

            private Builder(AssembledSources model) {
                this.mcpServerId = model.mcpServerId;
                this.mcpServerName = model.mcpServerName;
                this.tools = model.tools;
            } 

            /**
             * <p>MCP Server ID</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-adfef2334fa</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * mcpServerName.
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<String> tools) {
                this.tools = tools;
                return this;
            }

            public AssembledSources build() {
                return new AssembledSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
     */
    public static class NacosMcpSyncInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("importInstanceId")
        private String importInstanceId;

        @com.aliyun.core.annotation.NameInMap("importMcpServerId")
        private String importMcpServerId;

        @com.aliyun.core.annotation.NameInMap("importNamespace")
        private String importNamespace;

        private NacosMcpSyncInfo(Builder builder) {
            this.importInstanceId = builder.importInstanceId;
            this.importMcpServerId = builder.importMcpServerId;
            this.importNamespace = builder.importNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosMcpSyncInfo create() {
            return builder().build();
        }

        /**
         * @return importInstanceId
         */
        public String getImportInstanceId() {
            return this.importInstanceId;
        }

        /**
         * @return importMcpServerId
         */
        public String getImportMcpServerId() {
            return this.importMcpServerId;
        }

        /**
         * @return importNamespace
         */
        public String getImportNamespace() {
            return this.importNamespace;
        }

        public static final class Builder {
            private String importInstanceId; 
            private String importMcpServerId; 
            private String importNamespace; 

            private Builder() {
            } 

            private Builder(NacosMcpSyncInfo model) {
                this.importInstanceId = model.importInstanceId;
                this.importMcpServerId = model.importMcpServerId;
                this.importNamespace = model.importNamespace;
            } 

            /**
             * importInstanceId.
             */
            public Builder importInstanceId(String importInstanceId) {
                this.importInstanceId = importInstanceId;
                return this;
            }

            /**
             * importMcpServerId.
             */
            public Builder importMcpServerId(String importMcpServerId) {
                this.importMcpServerId = importMcpServerId;
                return this;
            }

            /**
             * importNamespace.
             */
            public Builder importNamespace(String importNamespace) {
                this.importNamespace = importNamespace;
                return this;
            }

            public NacosMcpSyncInfo build() {
                return new NacosMcpSyncInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("assembledSources")
        private java.util.List<AssembledSources> assembledSources;

        @com.aliyun.core.annotation.NameInMap("backend")
        private Backend backend;

        @com.aliyun.core.annotation.NameInMap("createFromType")
        private String createFromType;

        @com.aliyun.core.annotation.NameInMap("deployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domainIds")
        private java.util.List<String> domainIds;

        @com.aliyun.core.annotation.NameInMap("domainInfos")
        private java.util.List<HttpApiDomainInfo> domainInfos;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("exposedUriPath")
        private String exposedUriPath;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpRouteMatch match;

        @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
        private String mcpServerConfig;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("mcpServerPath")
        private String mcpServerPath;

        @com.aliyun.core.annotation.NameInMap("mcpStatisticsEnable")
        private Boolean mcpStatisticsEnable;

        @com.aliyun.core.annotation.NameInMap("nacosMcpSyncInfo")
        private NacosMcpSyncInfo nacosMcpSyncInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("routeId")
        private String routeId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Items(Builder builder) {
            this.apiId = builder.apiId;
            this.assembledSources = builder.assembledSources;
            this.backend = builder.backend;
            this.createFromType = builder.createFromType;
            this.deployStatus = builder.deployStatus;
            this.description = builder.description;
            this.domainIds = builder.domainIds;
            this.domainInfos = builder.domainInfos;
            this.environmentId = builder.environmentId;
            this.exposedUriPath = builder.exposedUriPath;
            this.gatewayId = builder.gatewayId;
            this.match = builder.match;
            this.mcpServerConfig = builder.mcpServerConfig;
            this.mcpServerId = builder.mcpServerId;
            this.mcpServerPath = builder.mcpServerPath;
            this.mcpStatisticsEnable = builder.mcpStatisticsEnable;
            this.nacosMcpSyncInfo = builder.nacosMcpSyncInfo;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.routeId = builder.routeId;
            this.type = builder.type;
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
         * @return assembledSources
         */
        public java.util.List<AssembledSources> getAssembledSources() {
            return this.assembledSources;
        }

        /**
         * @return backend
         */
        public Backend getBackend() {
            return this.backend;
        }

        /**
         * @return createFromType
         */
        public String getCreateFromType() {
            return this.createFromType;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainIds
         */
        public java.util.List<String> getDomainIds() {
            return this.domainIds;
        }

        /**
         * @return domainInfos
         */
        public java.util.List<HttpApiDomainInfo> getDomainInfos() {
            return this.domainInfos;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return exposedUriPath
         */
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return match
         */
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        /**
         * @return mcpServerConfig
         */
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return mcpServerPath
         */
        public String getMcpServerPath() {
            return this.mcpServerPath;
        }

        /**
         * @return mcpStatisticsEnable
         */
        public Boolean getMcpStatisticsEnable() {
            return this.mcpStatisticsEnable;
        }

        /**
         * @return nacosMcpSyncInfo
         */
        public NacosMcpSyncInfo getNacosMcpSyncInfo() {
            return this.nacosMcpSyncInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String apiId; 
            private java.util.List<AssembledSources> assembledSources; 
            private Backend backend; 
            private String createFromType; 
            private String deployStatus; 
            private String description; 
            private java.util.List<String> domainIds; 
            private java.util.List<HttpApiDomainInfo> domainInfos; 
            private String environmentId; 
            private String exposedUriPath; 
            private String gatewayId; 
            private HttpRouteMatch match; 
            private String mcpServerConfig; 
            private String mcpServerId; 
            private String mcpServerPath; 
            private Boolean mcpStatisticsEnable; 
            private NacosMcpSyncInfo nacosMcpSyncInfo; 
            private String name; 
            private String protocol; 
            private String routeId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiId = model.apiId;
                this.assembledSources = model.assembledSources;
                this.backend = model.backend;
                this.createFromType = model.createFromType;
                this.deployStatus = model.deployStatus;
                this.description = model.description;
                this.domainIds = model.domainIds;
                this.domainInfos = model.domainInfos;
                this.environmentId = model.environmentId;
                this.exposedUriPath = model.exposedUriPath;
                this.gatewayId = model.gatewayId;
                this.match = model.match;
                this.mcpServerConfig = model.mcpServerConfig;
                this.mcpServerId = model.mcpServerId;
                this.mcpServerPath = model.mcpServerPath;
                this.mcpStatisticsEnable = model.mcpStatisticsEnable;
                this.nacosMcpSyncInfo = model.nacosMcpSyncInfo;
                this.name = model.name;
                this.protocol = model.protocol;
                this.routeId = model.routeId;
                this.type = model.type;
            } 

            /**
             * apiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * assembledSources.
             */
            public Builder assembledSources(java.util.List<AssembledSources> assembledSources) {
                this.assembledSources = assembledSources;
                return this;
            }

            /**
             * backend.
             */
            public Builder backend(Backend backend) {
                this.backend = backend;
                return this;
            }

            /**
             * createFromType.
             */
            public Builder createFromType(String createFromType) {
                this.createFromType = createFromType;
                return this;
            }

            /**
             * deployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
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
             * domainIds.
             */
            public Builder domainIds(java.util.List<String> domainIds) {
                this.domainIds = domainIds;
                return this;
            }

            /**
             * domainInfos.
             */
            public Builder domainInfos(java.util.List<HttpApiDomainInfo> domainInfos) {
                this.domainInfos = domainInfos;
                return this;
            }

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * exposedUriPath.
             */
            public Builder exposedUriPath(String exposedUriPath) {
                this.exposedUriPath = exposedUriPath;
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
             * match.
             */
            public Builder match(HttpRouteMatch match) {
                this.match = match;
                return this;
            }

            /**
             * mcpServerConfig.
             */
            public Builder mcpServerConfig(String mcpServerConfig) {
                this.mcpServerConfig = mcpServerConfig;
                return this;
            }

            /**
             * <p>MCP Server ID</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-feaff34va</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * mcpServerPath.
             */
            public Builder mcpServerPath(String mcpServerPath) {
                this.mcpServerPath = mcpServerPath;
                return this;
            }

            /**
             * mcpStatisticsEnable.
             */
            public Builder mcpStatisticsEnable(Boolean mcpStatisticsEnable) {
                this.mcpStatisticsEnable = mcpStatisticsEnable;
                return this;
            }

            /**
             * nacosMcpSyncInfo.
             */
            public Builder nacosMcpSyncInfo(NacosMcpSyncInfo nacosMcpSyncInfo) {
                this.nacosMcpSyncInfo = nacosMcpSyncInfo;
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
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * routeId.
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServersResponseBody</p>
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
