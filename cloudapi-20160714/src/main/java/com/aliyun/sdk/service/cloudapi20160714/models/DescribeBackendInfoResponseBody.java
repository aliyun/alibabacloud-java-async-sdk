// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackendInfoResponseBody</p>
 */
public class DescribeBackendInfoResponseBody extends TeaModel {
    @NameInMap("BackendInfo")
    private BackendInfo backendInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackendInfoResponseBody(Builder builder) {
        this.backendInfo = builder.backendInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackendInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendInfo
     */
    public BackendInfo getBackendInfo() {
        return this.backendInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackendInfo backendInfo; 
        private String requestId; 

        /**
         * BackendInfo.
         */
        public Builder backendInfo(BackendInfo backendInfo) {
            this.backendInfo = backendInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackendInfoResponseBody build() {
            return new DescribeBackendInfoResponseBody(this);
        } 

    } 

    public static class EventBridgeConfig extends TeaModel {
        @NameInMap("EventBridgeRegionId")
        private String eventBridgeRegionId;

        @NameInMap("EventBus")
        private String eventBus;

        @NameInMap("EventSource")
        private String eventSource;

        @NameInMap("RoleArn")
        private String roleArn;

        private EventBridgeConfig(Builder builder) {
            this.eventBridgeRegionId = builder.eventBridgeRegionId;
            this.eventBus = builder.eventBus;
            this.eventSource = builder.eventSource;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBridgeConfig create() {
            return builder().build();
        }

        /**
         * @return eventBridgeRegionId
         */
        public String getEventBridgeRegionId() {
            return this.eventBridgeRegionId;
        }

        /**
         * @return eventBus
         */
        public String getEventBus() {
            return this.eventBus;
        }

        /**
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String eventBridgeRegionId; 
            private String eventBus; 
            private String eventSource; 
            private String roleArn; 

            /**
             * EventBridgeRegionId.
             */
            public Builder eventBridgeRegionId(String eventBridgeRegionId) {
                this.eventBridgeRegionId = eventBridgeRegionId;
                return this;
            }

            /**
             * EventBus.
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * EventSource.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public EventBridgeConfig build() {
                return new EventBridgeConfig(this);
            } 

        } 

    }
    public static class FunctionComputeConfig extends TeaModel {
        @NameInMap("FcBaseUrl")
        private String fcBaseUrl;

        @NameInMap("FcRegionId")
        private String fcRegionId;

        @NameInMap("FcType")
        private String fcType;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("OnlyBusinessPath")
        private Boolean onlyBusinessPath;

        @NameInMap("Qualifier")
        private String qualifier;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("ServiceName")
        private String serviceName;

        private FunctionComputeConfig(Builder builder) {
            this.fcBaseUrl = builder.fcBaseUrl;
            this.fcRegionId = builder.fcRegionId;
            this.fcType = builder.fcType;
            this.functionName = builder.functionName;
            this.onlyBusinessPath = builder.onlyBusinessPath;
            this.qualifier = builder.qualifier;
            this.roleArn = builder.roleArn;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionComputeConfig create() {
            return builder().build();
        }

        /**
         * @return fcBaseUrl
         */
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        /**
         * @return fcRegionId
         */
        public String getFcRegionId() {
            return this.fcRegionId;
        }

        /**
         * @return fcType
         */
        public String getFcType() {
            return this.fcType;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return onlyBusinessPath
         */
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String fcBaseUrl; 
            private String fcRegionId; 
            private String fcType; 
            private String functionName; 
            private Boolean onlyBusinessPath; 
            private String qualifier; 
            private String roleArn; 
            private String serviceName; 

            /**
             * FcBaseUrl.
             */
            public Builder fcBaseUrl(String fcBaseUrl) {
                this.fcBaseUrl = fcBaseUrl;
                return this;
            }

            /**
             * FcRegionId.
             */
            public Builder fcRegionId(String fcRegionId) {
                this.fcRegionId = fcRegionId;
                return this;
            }

            /**
             * FcType.
             */
            public Builder fcType(String fcType) {
                this.fcType = fcType;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * OnlyBusinessPath.
             */
            public Builder onlyBusinessPath(Boolean onlyBusinessPath) {
                this.onlyBusinessPath = onlyBusinessPath;
                return this;
            }

            /**
             * Qualifier.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FunctionComputeConfig build() {
                return new FunctionComputeConfig(this);
            } 

        } 

    }
    public static class OssConfig extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("OssRegionId")
        private String ossRegionId;

        private OssConfig(Builder builder) {
            this.bucketName = builder.bucketName;
            this.ossRegionId = builder.ossRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssConfig create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return ossRegionId
         */
        public String getOssRegionId() {
            return this.ossRegionId;
        }

        public static final class Builder {
            private String bucketName; 
            private String ossRegionId; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * OssRegionId.
             */
            public Builder ossRegionId(String ossRegionId) {
                this.ossRegionId = ossRegionId;
                return this;
            }

            public OssConfig build() {
                return new OssConfig(this);
            } 

        } 

    }
    public static class VpcConfig extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private Long port;

        @NameInMap("VpcAccessId")
        private String vpcAccessId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcScheme")
        private String vpcScheme;

        private VpcConfig(Builder builder) {
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.port = builder.port;
            this.vpcAccessId = builder.vpcAccessId;
            this.vpcId = builder.vpcId;
            this.vpcScheme = builder.vpcScheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return vpcAccessId
         */
        public String getVpcAccessId() {
            return this.vpcAccessId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcScheme
         */
        public String getVpcScheme() {
            return this.vpcScheme;
        }

        public static final class Builder {
            private String instanceId; 
            private String name; 
            private Long port; 
            private String vpcAccessId; 
            private String vpcId; 
            private String vpcScheme; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * VpcAccessId.
             */
            public Builder vpcAccessId(String vpcAccessId) {
                this.vpcAccessId = vpcAccessId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcScheme.
             */
            public Builder vpcScheme(String vpcScheme) {
                this.vpcScheme = vpcScheme;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
    public static class BackendConfig extends TeaModel {
        @NameInMap("EventBridgeConfig")
        private EventBridgeConfig eventBridgeConfig;

        @NameInMap("FunctionComputeConfig")
        private FunctionComputeConfig functionComputeConfig;

        @NameInMap("OssConfig")
        private OssConfig ossConfig;

        @NameInMap("ServiceAddress")
        private String serviceAddress;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcConfig")
        private VpcConfig vpcConfig;

        private BackendConfig(Builder builder) {
            this.eventBridgeConfig = builder.eventBridgeConfig;
            this.functionComputeConfig = builder.functionComputeConfig;
            this.ossConfig = builder.ossConfig;
            this.serviceAddress = builder.serviceAddress;
            this.type = builder.type;
            this.vpcConfig = builder.vpcConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendConfig create() {
            return builder().build();
        }

        /**
         * @return eventBridgeConfig
         */
        public EventBridgeConfig getEventBridgeConfig() {
            return this.eventBridgeConfig;
        }

        /**
         * @return functionComputeConfig
         */
        public FunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        /**
         * @return ossConfig
         */
        public OssConfig getOssConfig() {
            return this.ossConfig;
        }

        /**
         * @return serviceAddress
         */
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcConfig
         */
        public VpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public static final class Builder {
            private EventBridgeConfig eventBridgeConfig; 
            private FunctionComputeConfig functionComputeConfig; 
            private OssConfig ossConfig; 
            private String serviceAddress; 
            private String type; 
            private VpcConfig vpcConfig; 

            /**
             * EventBridgeConfig.
             */
            public Builder eventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
                this.eventBridgeConfig = eventBridgeConfig;
                return this;
            }

            /**
             * FunctionComputeConfig.
             */
            public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
                this.functionComputeConfig = functionComputeConfig;
                return this;
            }

            /**
             * OssConfig.
             */
            public Builder ossConfig(OssConfig ossConfig) {
                this.ossConfig = ossConfig;
                return this;
            }

            /**
             * ServiceAddress.
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VpcConfig.
             */
            public Builder vpcConfig(VpcConfig vpcConfig) {
                this.vpcConfig = vpcConfig;
                return this;
            }

            public BackendConfig build() {
                return new BackendConfig(this);
            } 

        } 

    }
    public static class BackendModels extends TeaModel {
        @NameInMap("BackendConfig")
        private BackendConfig backendConfig;

        @NameInMap("BackendModelId")
        private String backendModelId;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("StageModeId")
        private String stageModeId;

        @NameInMap("StageName")
        private String stageName;

        private BackendModels(Builder builder) {
            this.backendConfig = builder.backendConfig;
            this.backendModelId = builder.backendModelId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.stageModeId = builder.stageModeId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendModels create() {
            return builder().build();
        }

        /**
         * @return backendConfig
         */
        public BackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        /**
         * @return backendModelId
         */
        public String getBackendModelId() {
            return this.backendModelId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return stageModeId
         */
        public String getStageModeId() {
            return this.stageModeId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private BackendConfig backendConfig; 
            private String backendModelId; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String stageModeId; 
            private String stageName; 

            /**
             * BackendConfig.
             */
            public Builder backendConfig(BackendConfig backendConfig) {
                this.backendConfig = backendConfig;
                return this;
            }

            /**
             * BackendModelId.
             */
            public Builder backendModelId(String backendModelId) {
                this.backendModelId = backendModelId;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * StageModeId.
             */
            public Builder stageModeId(String stageModeId) {
                this.stageModeId = stageModeId;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public BackendModels build() {
                return new BackendModels(this);
            } 

        } 

    }
    public static class BackendInfo extends TeaModel {
        @NameInMap("BackendId")
        private String backendId;

        @NameInMap("BackendModels")
        private java.util.List < BackendModels> backendModels;

        @NameInMap("BackendName")
        private String backendName;

        @NameInMap("BackendType")
        private String backendType;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        private BackendInfo(Builder builder) {
            this.backendId = builder.backendId;
            this.backendModels = builder.backendModels;
            this.backendName = builder.backendName;
            this.backendType = builder.backendType;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendInfo create() {
            return builder().build();
        }

        /**
         * @return backendId
         */
        public String getBackendId() {
            return this.backendId;
        }

        /**
         * @return backendModels
         */
        public java.util.List < BackendModels> getBackendModels() {
            return this.backendModels;
        }

        /**
         * @return backendName
         */
        public String getBackendName() {
            return this.backendName;
        }

        /**
         * @return backendType
         */
        public String getBackendType() {
            return this.backendType;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String backendId; 
            private java.util.List < BackendModels> backendModels; 
            private String backendName; 
            private String backendType; 
            private String createdTime; 
            private String description; 
            private String modifiedTime; 

            /**
             * BackendId.
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * BackendModels.
             */
            public Builder backendModels(java.util.List < BackendModels> backendModels) {
                this.backendModels = backendModels;
                return this;
            }

            /**
             * BackendName.
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * BackendType.
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public BackendInfo build() {
                return new BackendInfo(this);
            } 

        } 

    }
}
