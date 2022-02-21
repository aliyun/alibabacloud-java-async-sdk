// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCollectorNameResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCollectorNameResponseBody</p>
 */
public class UpdateCollectorNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdateCollectorNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCollectorNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateCollectorNameResponseBody build() {
            return new UpdateCollectorNameResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("fileName")
        private String fileName;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class Machines extends TeaModel {
        @NameInMap("agentStatus")
        private String agentStatus;

        @NameInMap("instanceId")
        private String instanceId;

        private Machines(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Machines create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String agentStatus; 
            private String instanceId; 

            /**
             * agentStatus.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Machines build() {
                return new Machines(this);
            } 

        } 

    }
    public static class ExtendConfigs extends TeaModel {
        @NameInMap("configType")
        private String configType;

        @NameInMap("enableMonitoring")
        private Boolean enableMonitoring;

        @NameInMap("groupId")
        private String groupId;

        @NameInMap("host")
        private String host;

        @NameInMap("hosts")
        private java.util.List < String > hosts;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("instanceType")
        private String instanceType;

        @NameInMap("kibanaHost")
        private String kibanaHost;

        @NameInMap("machines")
        private java.util.List < Machines> machines;

        @NameInMap("protocol")
        private String protocol;

        @NameInMap("successPodsCount")
        private String successPodsCount;

        @NameInMap("totalPodsCount")
        private String totalPodsCount;

        @NameInMap("type")
        private String type;

        @NameInMap("userName")
        private String userName;

        private ExtendConfigs(Builder builder) {
            this.configType = builder.configType;
            this.enableMonitoring = builder.enableMonitoring;
            this.groupId = builder.groupId;
            this.host = builder.host;
            this.hosts = builder.hosts;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.kibanaHost = builder.kibanaHost;
            this.machines = builder.machines;
            this.protocol = builder.protocol;
            this.successPodsCount = builder.successPodsCount;
            this.totalPodsCount = builder.totalPodsCount;
            this.type = builder.type;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendConfigs create() {
            return builder().build();
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return enableMonitoring
         */
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return hosts
         */
        public java.util.List < String > getHosts() {
            return this.hosts;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return kibanaHost
         */
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        /**
         * @return machines
         */
        public java.util.List < Machines> getMachines() {
            return this.machines;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return successPodsCount
         */
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        /**
         * @return totalPodsCount
         */
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String configType; 
            private Boolean enableMonitoring; 
            private String groupId; 
            private String host; 
            private java.util.List < String > hosts; 
            private String instanceId; 
            private String instanceType; 
            private String kibanaHost; 
            private java.util.List < Machines> machines; 
            private String protocol; 
            private String successPodsCount; 
            private String totalPodsCount; 
            private String type; 
            private String userName; 

            /**
             * configType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * enableMonitoring.
             */
            public Builder enableMonitoring(Boolean enableMonitoring) {
                this.enableMonitoring = enableMonitoring;
                return this;
            }

            /**
             * groupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * hosts.
             */
            public Builder hosts(java.util.List < String > hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * kibanaHost.
             */
            public Builder kibanaHost(String kibanaHost) {
                this.kibanaHost = kibanaHost;
                return this;
            }

            /**
             * machines.
             */
            public Builder machines(java.util.List < Machines> machines) {
                this.machines = machines;
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
             * successPodsCount.
             */
            public Builder successPodsCount(String successPodsCount) {
                this.successPodsCount = successPodsCount;
                return this;
            }

            /**
             * totalPodsCount.
             */
            public Builder totalPodsCount(String totalPodsCount) {
                this.totalPodsCount = totalPodsCount;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ExtendConfigs build() {
                return new ExtendConfigs(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("collectorPaths")
        private java.util.List < String > collectorPaths;

        @NameInMap("configs")
        private java.util.List < Configs> configs;

        @NameInMap("dryRun")
        private Boolean dryRun;

        @NameInMap("extendConfigs")
        private java.util.List < ExtendConfigs> extendConfigs;

        @NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @NameInMap("name")
        private String name;

        @NameInMap("ownerId")
        private String ownerId;

        @NameInMap("resId")
        private String resId;

        @NameInMap("resType")
        private String resType;

        @NameInMap("resVersion")
        private String resVersion;

        @NameInMap("status")
        private String status;

        @NameInMap("vpcId")
        private String vpcId;

        private Result(Builder builder) {
            this.collectorPaths = builder.collectorPaths;
            this.configs = builder.configs;
            this.dryRun = builder.dryRun;
            this.extendConfigs = builder.extendConfigs;
            this.gmtCreatedTime = builder.gmtCreatedTime;
            this.gmtUpdateTime = builder.gmtUpdateTime;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.resId = builder.resId;
            this.resType = builder.resType;
            this.resVersion = builder.resVersion;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return collectorPaths
         */
        public java.util.List < String > getCollectorPaths() {
            return this.collectorPaths;
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return extendConfigs
         */
        public java.util.List < ExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return gmtCreatedTime
         */
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        /**
         * @return gmtUpdateTime
         */
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resId
         */
        public String getResId() {
            return this.resId;
        }

        /**
         * @return resType
         */
        public String getResType() {
            return this.resType;
        }

        /**
         * @return resVersion
         */
        public String getResVersion() {
            return this.resVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > collectorPaths; 
            private java.util.List < Configs> configs; 
            private Boolean dryRun; 
            private java.util.List < ExtendConfigs> extendConfigs; 
            private String gmtCreatedTime; 
            private String gmtUpdateTime; 
            private String name; 
            private String ownerId; 
            private String resId; 
            private String resType; 
            private String resVersion; 
            private String status; 
            private String vpcId; 

            /**
             * collectorPaths.
             */
            public Builder collectorPaths(java.util.List < String > collectorPaths) {
                this.collectorPaths = collectorPaths;
                return this;
            }

            /**
             * configs.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * dryRun.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * extendConfigs.
             */
            public Builder extendConfigs(java.util.List < ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * gmtCreatedTime.
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * gmtUpdateTime.
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
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
             * ownerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * resId.
             */
            public Builder resId(String resId) {
                this.resId = resId;
                return this;
            }

            /**
             * resType.
             */
            public Builder resType(String resType) {
                this.resType = resType;
                return this;
            }

            /**
             * resVersion.
             */
            public Builder resVersion(String resVersion) {
                this.resVersion = resVersion;
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
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
