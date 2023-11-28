// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsInstancesResponseBody</p>
 */
public class ListEcsInstancesResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListEcsInstancesResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The number of returned records.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The header of the response.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Cloud Assistant the installation status, support:
         * <p>
         * 
         * *   true: The Prometheus agent was installed.
         * *   false: The Prometheus agent was not installed.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListEcsInstancesResponseBody build() {
            return new ListEcsInstancesResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * The returned data.
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

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
             * The name of the file.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The information about the extended parameter.
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
             * The IDs of ECS instances.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * The list of access addresses of the specified instance for the output of the collector. Displayed when the **configType** is **collectorTargetInstance**.
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

        @NameInMap("hosts")
        private java.util.List < String > hosts;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("instanceType")
        private String instanceType;

        @NameInMap("machines")
        private java.util.List < Machines> machines;

        @NameInMap("protocol")
        private String protocol;

        @NameInMap("type")
        private String type;

        @NameInMap("userName")
        private String userName;

        private ExtendConfigs(Builder builder) {
            this.configType = builder.configType;
            this.enableMonitoring = builder.enableMonitoring;
            this.groupId = builder.groupId;
            this.hosts = builder.hosts;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.machines = builder.machines;
            this.protocol = builder.protocol;
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
            private java.util.List < String > hosts; 
            private String instanceId; 
            private String instanceType; 
            private java.util.List < Machines> machines; 
            private String protocol; 
            private String type; 
            private String userName; 

            /**
             * The instance type specified by Collector Output. Supports Elasticsearch and Logstash. Displayed when the **configType** is **collectorTargetInstance**.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * The ID of the host group. Displayed when the **configType** is **collectorDeployMachine**.
             */
            public Builder enableMonitoring(Boolean enableMonitoring) {
                this.enableMonitoring = enableMonitoring;
                return this;
            }

            /**
             * The configuration type. Valid values:
             * <p>
             * 
             * *   collectorTargetInstance: Collector Output
             * *   collectorDeployMachine: Collector Deployment Machine
             * *   Collector Elasticsearch ForKibana: Elasticsearch instance information that supports the Kibana dashboard
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The path in which Filebeat is collected.
             */
            public Builder hosts(java.util.List < String > hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * The list of ECS instances on which the collector is deployed. Displayed when the **configType** is **collectorDeployMachines** and the **type** is **ECSInstanceId**.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The transmission protocol, which must be the same as the access protocol of the instance specified by Output. HTTP and HTTPS. Displayed when the **configType** is **collectorTargetInstance**.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The status of each crawl on the ECS instance. Valid values:
             * <p>
             * 
             * *   heartOk: The heartbeat is normal.
             * *   heartLost: The heartbeat is abnormal.
             * *   uninstalled
             * *   failed: The installation failed.
             */
            public Builder machines(java.util.List < Machines> machines) {
                this.machines = machines;
                return this;
            }

            /**
             * The username that is used to access the instance. The default value is elastic. Displayed when the **configType** is **collectorTargetInstance** or **collectorElasticsearchForKibana**.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The ID of the instance that is associated with the crawker. If the **configType** parameter is set to **collectorTargetInstance**, the value of this parameter is the ID of the output collector. If the **configType** parameter is set to **collectorDeployMachines** and the **type** parameter is set to **ACKCluster**, the value of this parameter is the ID of the ACK cluster.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The type of the machine on which the Collector is deployed. This parameter is displayed when the **configType** is **collectorDeployMachine**. Valid values:
             * <p>
             * 
             * *   ECSInstanceId:ECS
             * *   ACKCluster: Container Kubernetes
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
    public static class Collectors extends TeaModel {
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

        private Collectors(Builder builder) {
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

        public static Collectors create() {
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
             * The content of the file.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * Whether Monitoring is enabled. This field is displayed when the **configType** is **collectorTargetInstance** and the **instanceType** is **Elasticsearch**. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder extendConfigs(java.util.List < ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * The status of the collector. Valid values:
             * <p>
             * 
             * *   activating: The project is taking effect.
             * *   active: The instance has taken effect.
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * Specifies whether to verify and create a crawer. Valid values:
             * <p>
             * 
             * *   true: only verifies and does not create a
             * *   false: verifies and creates a
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * The configuration file information of the collector.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the Virtual Private Cloud to which the collector belongs.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The time when the collector was updated.
             */
            public Builder resId(String resId) {
                this.resId = resId;
                return this;
            }

            /**
             * The version of the collector. If the machine type of the collector is ECS, only **6.8.5\_with_community** is supported.
             */
            public Builder resType(String resType) {
                this.resType = resType;
                return this;
            }

            /**
             * The time when the crawl collector was created.
             */
            public Builder resVersion(String resVersion) {
                this.resVersion = resVersion;
                return this;
            }

            /**
             * The name of the collector.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the collector. FileBeat, metricBeat, heartBeat, and auditBeat are supported.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Collectors build() {
                return new Collectors(this);
            } 

        } 

    }
    public static class IpAddress extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("ipType")
        private String ipType;

        private IpAddress(Builder builder) {
            this.host = builder.host;
            this.ipType = builder.ipType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAddress create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        public static final class Builder {
            private String host; 
            private String ipType; 

            /**
             * The information about the collectors on the ECS instance.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The IP address of the endpoint.
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            public IpAddress build() {
                return new IpAddress(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("cloudAssistantStatus")
        private String cloudAssistantStatus;

        @NameInMap("collectors")
        private java.util.List < Collectors> collectors;

        @NameInMap("ecsInstanceId")
        private String ecsInstanceId;

        @NameInMap("ecsInstanceName")
        private String ecsInstanceName;

        @NameInMap("ipAddress")
        private java.util.List < IpAddress> ipAddress;

        @NameInMap("osType")
        private String osType;

        @NameInMap("status")
        private String status;

        @NameInMap("tags")
        private String tags;

        private Result(Builder builder) {
            this.cloudAssistantStatus = builder.cloudAssistantStatus;
            this.collectors = builder.collectors;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsInstanceName = builder.ecsInstanceName;
            this.ipAddress = builder.ipAddress;
            this.osType = builder.osType;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cloudAssistantStatus
         */
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        /**
         * @return collectors
         */
        public java.util.List < Collectors> getCollectors() {
            return this.collectors;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsInstanceName
         */
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        /**
         * @return ipAddress
         */
        public java.util.List < IpAddress> getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String cloudAssistantStatus; 
            private java.util.List < Collectors> collectors; 
            private String ecsInstanceId; 
            private String ecsInstanceName; 
            private java.util.List < IpAddress> ipAddress; 
            private String osType; 
            private String status; 
            private String tags; 

            /**
             * The name of the ECS instance.
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * The ID of the collector instance.
             */
            public Builder collectors(java.util.List < Collectors> collectors) {
                this.collectors = collectors;
                return this;
            }

            /**
             * The tags of the ECS instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * The type of the IP address that is used by the instance. Valid values:
             * <p>
             * 
             * *   public: public endpoint
             * *   private: private network address
             */
            public Builder ipAddress(java.util.List < IpAddress> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The status of the ECS instance. Valid values:
             * <p>
             * 
             * *   running: The master instance is running
             * *   starting
             * *   stopping: The task is being stopped.
             * *   stopped: The node is stopped.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The IP address of the ECS instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The operating system type of the ECS instance. Valid values:
             * <p>
             * 
             * *   windows:Windows operating system
             * *   linux:Linux operating system
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
