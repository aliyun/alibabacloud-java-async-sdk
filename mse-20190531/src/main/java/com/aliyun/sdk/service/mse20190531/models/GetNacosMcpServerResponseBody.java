// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetNacosMcpServerResponseBody</p>
 */
public class GetNacosMcpServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNacosMcpServerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacosMcpServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNacosMcpServerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNacosMcpServerResponseBody build() {
            return new GetNacosMcpServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class AllVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Is_latest")
        private Boolean isLatest;

        @com.aliyun.core.annotation.NameInMap("Release_date")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AllVersions(Builder builder) {
            this.isLatest = builder.isLatest;
            this.releaseDate = builder.releaseDate;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllVersions create() {
            return builder().build();
        }

        /**
         * @return isLatest
         */
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean isLatest; 
            private String releaseDate; 
            private String version; 

            private Builder() {
            } 

            private Builder(AllVersions model) {
                this.isLatest = model.isLatest;
                this.releaseDate = model.releaseDate;
                this.version = model.version;
            } 

            /**
             * Is_latest.
             */
            public Builder isLatest(Boolean isLatest) {
                this.isLatest = isLatest;
                return this;
            }

            /**
             * Release_date.
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AllVersions build() {
                return new AllVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class BackendEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private BackendEndpoints(Builder builder) {
            this.address = builder.address;
            this.path = builder.path;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendEndpoints create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String address; 
            private String path; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(BackendEndpoints model) {
                this.address = model.address;
                this.path = model.path;
                this.port = model.port;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public BackendEndpoints build() {
                return new BackendEndpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class ServiceRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private ServiceRef(Builder builder) {
            this.groupName = builder.groupName;
            this.namespaceId = builder.namespaceId;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceRef create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String groupName; 
            private String namespaceId; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(ServiceRef model) {
                this.groupName = model.groupName;
                this.namespaceId = model.namespaceId;
                this.serviceName = model.serviceName;
            } 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServiceRef build() {
                return new ServiceRef(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class RemoteServerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportPath")
        private String exportPath;

        @com.aliyun.core.annotation.NameInMap("ServiceRef")
        private ServiceRef serviceRef;

        private RemoteServerConfig(Builder builder) {
            this.exportPath = builder.exportPath;
            this.serviceRef = builder.serviceRef;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteServerConfig create() {
            return builder().build();
        }

        /**
         * @return exportPath
         */
        public String getExportPath() {
            return this.exportPath;
        }

        /**
         * @return serviceRef
         */
        public ServiceRef getServiceRef() {
            return this.serviceRef;
        }

        public static final class Builder {
            private String exportPath; 
            private ServiceRef serviceRef; 

            private Builder() {
            } 

            private Builder(RemoteServerConfig model) {
                this.exportPath = model.exportPath;
                this.serviceRef = model.serviceRef;
            } 

            /**
             * ExportPath.
             */
            public Builder exportPath(String exportPath) {
                this.exportPath = exportPath;
                return this;
            }

            /**
             * ServiceRef.
             */
            public Builder serviceRef(ServiceRef serviceRef) {
                this.serviceRef = serviceRef;
                return this;
            }

            public RemoteServerConfig build() {
                return new RemoteServerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputSchema")
        private java.util.Map<String, ?> inputSchema;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Tools(Builder builder) {
            this.description = builder.description;
            this.inputSchema = builder.inputSchema;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputSchema
         */
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private java.util.Map<String, ?> inputSchema; 
            private String name; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.description = model.description;
                this.inputSchema = model.inputSchema;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InputSchema.
             */
            public Builder inputSchema(java.util.Map<String, ?> inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class ToolSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecuritySchemes")
        private Object securitySchemes;

        @com.aliyun.core.annotation.NameInMap("SpecificationType")
        private String specificationType;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("ToolsMeta")
        private java.util.Map<String, DataToolSpecToolsMetaValue> toolsMeta;

        private ToolSpec(Builder builder) {
            this.securitySchemes = builder.securitySchemes;
            this.specificationType = builder.specificationType;
            this.tools = builder.tools;
            this.toolsMeta = builder.toolsMeta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolSpec create() {
            return builder().build();
        }

        /**
         * @return securitySchemes
         */
        public Object getSecuritySchemes() {
            return this.securitySchemes;
        }

        /**
         * @return specificationType
         */
        public String getSpecificationType() {
            return this.specificationType;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        /**
         * @return toolsMeta
         */
        public java.util.Map<String, DataToolSpecToolsMetaValue> getToolsMeta() {
            return this.toolsMeta;
        }

        public static final class Builder {
            private Object securitySchemes; 
            private String specificationType; 
            private java.util.List<Tools> tools; 
            private java.util.Map<String, DataToolSpecToolsMetaValue> toolsMeta; 

            private Builder() {
            } 

            private Builder(ToolSpec model) {
                this.securitySchemes = model.securitySchemes;
                this.specificationType = model.specificationType;
                this.tools = model.tools;
                this.toolsMeta = model.toolsMeta;
            } 

            /**
             * SecuritySchemes.
             */
            public Builder securitySchemes(Object securitySchemes) {
                this.securitySchemes = securitySchemes;
                return this;
            }

            /**
             * SpecificationType.
             */
            public Builder specificationType(String specificationType) {
                this.specificationType = specificationType;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * ToolsMeta.
             */
            public Builder toolsMeta(java.util.Map<String, DataToolSpecToolsMetaValue> toolsMeta) {
                this.toolsMeta = toolsMeta;
                return this;
            }

            public ToolSpec build() {
                return new ToolSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class VersionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsLatest")
        private Boolean isLatest;

        @com.aliyun.core.annotation.NameInMap("ReleaseDate")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private VersionDetail(Builder builder) {
            this.isLatest = builder.isLatest;
            this.releaseDate = builder.releaseDate;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionDetail create() {
            return builder().build();
        }

        /**
         * @return isLatest
         */
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean isLatest; 
            private String releaseDate; 
            private String version; 

            private Builder() {
            } 

            private Builder(VersionDetail model) {
                this.isLatest = model.isLatest;
                this.releaseDate = model.releaseDate;
                this.version = model.version;
            } 

            /**
             * IsLatest.
             */
            public Builder isLatest(Boolean isLatest) {
                this.isLatest = isLatest;
                return this;
            }

            /**
             * ReleaseDate.
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionDetail build() {
                return new VersionDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNacosMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetNacosMcpServerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllVersions")
        private java.util.List<AllVersions> allVersions;

        @com.aliyun.core.annotation.NameInMap("BackendEndpoints")
        private java.util.List<BackendEndpoints> backendEndpoints;

        @com.aliyun.core.annotation.NameInMap("Capabilities")
        private java.util.List<String> capabilities;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("FrontProtocol")
        private String frontProtocol;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LocalServerConfig")
        private java.util.Map<String, ?> localServerConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RemoteServerConfig")
        private RemoteServerConfig remoteServerConfig;

        @com.aliyun.core.annotation.NameInMap("ToolSpec")
        private ToolSpec toolSpec;

        @com.aliyun.core.annotation.NameInMap("VersionDetail")
        private VersionDetail versionDetail;

        @com.aliyun.core.annotation.NameInMap("YamlConfig")
        private String yamlConfig;

        private Data(Builder builder) {
            this.allVersions = builder.allVersions;
            this.backendEndpoints = builder.backendEndpoints;
            this.capabilities = builder.capabilities;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.frontProtocol = builder.frontProtocol;
            this.id = builder.id;
            this.localServerConfig = builder.localServerConfig;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.remoteServerConfig = builder.remoteServerConfig;
            this.toolSpec = builder.toolSpec;
            this.versionDetail = builder.versionDetail;
            this.yamlConfig = builder.yamlConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allVersions
         */
        public java.util.List<AllVersions> getAllVersions() {
            return this.allVersions;
        }

        /**
         * @return backendEndpoints
         */
        public java.util.List<BackendEndpoints> getBackendEndpoints() {
            return this.backendEndpoints;
        }

        /**
         * @return capabilities
         */
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return frontProtocol
         */
        public String getFrontProtocol() {
            return this.frontProtocol;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return localServerConfig
         */
        public java.util.Map<String, ?> getLocalServerConfig() {
            return this.localServerConfig;
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
         * @return remoteServerConfig
         */
        public RemoteServerConfig getRemoteServerConfig() {
            return this.remoteServerConfig;
        }

        /**
         * @return toolSpec
         */
        public ToolSpec getToolSpec() {
            return this.toolSpec;
        }

        /**
         * @return versionDetail
         */
        public VersionDetail getVersionDetail() {
            return this.versionDetail;
        }

        /**
         * @return yamlConfig
         */
        public String getYamlConfig() {
            return this.yamlConfig;
        }

        public static final class Builder {
            private java.util.List<AllVersions> allVersions; 
            private java.util.List<BackendEndpoints> backendEndpoints; 
            private java.util.List<String> capabilities; 
            private String description; 
            private Boolean enabled; 
            private String frontProtocol; 
            private String id; 
            private java.util.Map<String, ?> localServerConfig; 
            private String name; 
            private String protocol; 
            private RemoteServerConfig remoteServerConfig; 
            private ToolSpec toolSpec; 
            private VersionDetail versionDetail; 
            private String yamlConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allVersions = model.allVersions;
                this.backendEndpoints = model.backendEndpoints;
                this.capabilities = model.capabilities;
                this.description = model.description;
                this.enabled = model.enabled;
                this.frontProtocol = model.frontProtocol;
                this.id = model.id;
                this.localServerConfig = model.localServerConfig;
                this.name = model.name;
                this.protocol = model.protocol;
                this.remoteServerConfig = model.remoteServerConfig;
                this.toolSpec = model.toolSpec;
                this.versionDetail = model.versionDetail;
                this.yamlConfig = model.yamlConfig;
            } 

            /**
             * AllVersions.
             */
            public Builder allVersions(java.util.List<AllVersions> allVersions) {
                this.allVersions = allVersions;
                return this;
            }

            /**
             * BackendEndpoints.
             */
            public Builder backendEndpoints(java.util.List<BackendEndpoints> backendEndpoints) {
                this.backendEndpoints = backendEndpoints;
                return this;
            }

            /**
             * Capabilities.
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * FrontProtocol.
             */
            public Builder frontProtocol(String frontProtocol) {
                this.frontProtocol = frontProtocol;
                return this;
            }

            /**
             * <p>ID。</p>
             * 
             * <strong>example:</strong>
             * <p>5e3c5211-d365-4013-8540-c4106ec2a5dc</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LocalServerConfig.
             */
            public Builder localServerConfig(java.util.Map<String, ?> localServerConfig) {
                this.localServerConfig = localServerConfig;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RemoteServerConfig.
             */
            public Builder remoteServerConfig(RemoteServerConfig remoteServerConfig) {
                this.remoteServerConfig = remoteServerConfig;
                return this;
            }

            /**
             * ToolSpec.
             */
            public Builder toolSpec(ToolSpec toolSpec) {
                this.toolSpec = toolSpec;
                return this;
            }

            /**
             * VersionDetail.
             */
            public Builder versionDetail(VersionDetail versionDetail) {
                this.versionDetail = versionDetail;
                return this;
            }

            /**
             * YamlConfig.
             */
            public Builder yamlConfig(String yamlConfig) {
                this.yamlConfig = yamlConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
