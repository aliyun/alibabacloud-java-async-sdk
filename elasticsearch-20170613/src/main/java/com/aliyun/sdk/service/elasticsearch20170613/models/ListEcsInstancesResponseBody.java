// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsInstancesResponseBody</p>
 */
public class ListEcsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListEcsInstancesResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The number of returned records.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The header of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Cloud Assistant the installation status, support:</p>
         * <ul>
         * <li>true: The Prometheus agent was installed.</li>
         * <li>false: The Prometheus agent was not installed.</li>
         * </ul>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListEcsInstancesResponseBody build() {
            return new ListEcsInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
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

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xTotalCount = model.xTotalCount;
            } 

            /**
             * <p>The returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("fileName")
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

            private Builder() {
            } 

            private Builder(Configs model) {
                this.content = model.content;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>key: log\n title: Log file content\n description: &gt;\n Contains log file lines.\n ....</li>
             * </ul>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The information about the extended parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>fields.yml</p>
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
    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class Machines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("instanceId")
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

            private Builder() {
            } 

            private Builder(Machines model) {
                this.agentStatus = model.agentStatus;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The IDs of ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>heartOk</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The list of access addresses of the specified instance for the output of the collector. Displayed when the <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp13y63575oypr9d****</p>
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
    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class ExtendConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("enableMonitoring")
        private Boolean enableMonitoring;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("hosts")
        private java.util.List<String> hosts;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("machines")
        private java.util.List<Machines> machines;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userName")
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
        public java.util.List<String> getHosts() {
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
        public java.util.List<Machines> getMachines() {
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
            private java.util.List<String> hosts; 
            private String instanceId; 
            private String instanceType; 
            private java.util.List<Machines> machines; 
            private String protocol; 
            private String type; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ExtendConfigs model) {
                this.configType = model.configType;
                this.enableMonitoring = model.enableMonitoring;
                this.groupId = model.groupId;
                this.hosts = model.hosts;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.machines = model.machines;
                this.protocol = model.protocol;
                this.type = model.type;
                this.userName = model.userName;
            } 

            /**
             * <p>The instance type specified by Collector Output. Supports Elasticsearch and Logstash. Displayed when the <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>collectorDeployMachine</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The ID of the host group. Displayed when the <strong>configType</strong> is <strong>collectorDeployMachine</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMonitoring(Boolean enableMonitoring) {
                this.enableMonitoring = enableMonitoring;
                return this;
            }

            /**
             * <p>The configuration type. Valid values:</p>
             * <ul>
             * <li>collectorTargetInstance: Collector Output</li>
             * <li>collectorDeployMachine: Collector Deployment Machine</li>
             * <li>Collector Elasticsearch ForKibana: Elasticsearch instance information that supports the Kibana dashboard</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default_ct-cn-5i2l75bz4776****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The path in which Filebeat is collected.</p>
             */
            public Builder hosts(java.util.List<String> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>The list of ECS instances on which the collector is deployed. Displayed when the <strong>configType</strong> is <strong>collectorDeployMachines</strong> and the <strong>type</strong> is <strong>ECSInstanceId</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-nif1z89fz003i****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The transmission protocol, which must be the same as the access protocol of the instance specified by Output. HTTP and HTTPS. Displayed when the <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The status of each crawl on the ECS instance. Valid values:</p>
             * <ul>
             * <li>heartOk: The heartbeat is normal.</li>
             * <li>heartLost: The heartbeat is abnormal.</li>
             * <li>uninstalled</li>
             * <li>failed: The installation failed.</li>
             * </ul>
             */
            public Builder machines(java.util.List<Machines> machines) {
                this.machines = machines;
                return this;
            }

            /**
             * <p>The username that is used to access the instance. The default value is elastic. Displayed when the <strong>configType</strong> is <strong>collectorTargetInstance</strong> or <strong>collectorElasticsearchForKibana</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the instance that is associated with the crawker. If the <strong>configType</strong> parameter is set to <strong>collectorTargetInstance</strong>, the value of this parameter is the ID of the output collector. If the <strong>configType</strong> parameter is set to <strong>collectorDeployMachines</strong> and the <strong>type</strong> parameter is set to <strong>ACKCluster</strong>, the value of this parameter is the ID of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSInstanceId</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The type of the machine on which the Collector is deployed. This parameter is displayed when the <strong>configType</strong> is <strong>collectorDeployMachine</strong>. Valid values:</p>
             * <ul>
             * <li>ECSInstanceId:ECS</li>
             * <li>ACKCluster: Container Kubernetes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>elastic</p>
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
    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class Collectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collectorPaths")
        private java.util.List<String> collectorPaths;

        @com.aliyun.core.annotation.NameInMap("configs")
        private java.util.List<Configs> configs;

        @com.aliyun.core.annotation.NameInMap("dryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("extendConfigs")
        private java.util.List<ExtendConfigs> extendConfigs;

        @com.aliyun.core.annotation.NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @com.aliyun.core.annotation.NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("resId")
        private String resId;

        @com.aliyun.core.annotation.NameInMap("resType")
        private String resType;

        @com.aliyun.core.annotation.NameInMap("resVersion")
        private String resVersion;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("vpcId")
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
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

        /**
         * @return configs
         */
        public java.util.List<Configs> getConfigs() {
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
        public java.util.List<ExtendConfigs> getExtendConfigs() {
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
            private java.util.List<String> collectorPaths; 
            private java.util.List<Configs> configs; 
            private Boolean dryRun; 
            private java.util.List<ExtendConfigs> extendConfigs; 
            private String gmtCreatedTime; 
            private String gmtUpdateTime; 
            private String name; 
            private String ownerId; 
            private String resId; 
            private String resType; 
            private String resVersion; 
            private String status; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Collectors model) {
                this.collectorPaths = model.collectorPaths;
                this.configs = model.configs;
                this.dryRun = model.dryRun;
                this.extendConfigs = model.extendConfigs;
                this.gmtCreatedTime = model.gmtCreatedTime;
                this.gmtUpdateTime = model.gmtUpdateTime;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.resId = model.resId;
                this.resType = model.resType;
                this.resVersion = model.resVersion;
                this.status = model.status;
                this.vpcId = model.vpcId;
            } 

            /**
             * collectorPaths.
             */
            public Builder collectorPaths(java.util.List<String> collectorPaths) {
                this.collectorPaths = collectorPaths;
                return this;
            }

            /**
             * <p>The content of the file.</p>
             */
            public Builder configs(java.util.List<Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>Whether Monitoring is enabled. This field is displayed when the <strong>configType</strong> is <strong>collectorTargetInstance</strong> and the <strong>instanceType</strong> is <strong>Elasticsearch</strong>. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             */
            public Builder extendConfigs(java.util.List<ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * <p>The status of the collector. Valid values:</p>
             * <ul>
             * <li>activating: The project is taking effect.</li>
             * <li>active: The instance has taken effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-06-20T07:26:47.000+0000</p>
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * <p>Specifies whether to verify and create a crawer. Valid values:</p>
             * <ul>
             * <li>true: only verifies and does not create a</li>
             * <li>false: verifies and creates a</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-06-20T07:26:47.000+0000</p>
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * <p>The configuration file information of the collector.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-testAbc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the Virtual Private Cloud to which the collector belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>16852<em><strong>488</strong></em>**</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The time when the collector was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-cn-0v3xj86085dvq****</p>
             */
            public Builder resId(String resId) {
                this.resId = resId;
                return this;
            }

            /**
             * <p>The version of the collector. If the machine type of the collector is ECS, only <strong>6.8.5_with_community</strong> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>fileBeat</p>
             */
            public Builder resType(String resType) {
                this.resType = resType;
                return this;
            }

            /**
             * <p>The time when the crawl collector was created.</p>
             * 
             * <strong>example:</strong>
             * <p>6.8.5_with_community</p>
             */
            public Builder resVersion(String resVersion) {
                this.resVersion = resVersion;
                return this;
            }

            /**
             * <p>The name of the collector.</p>
             * 
             * <strong>example:</strong>
             * <p>activing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the collector. FileBeat, metricBeat, heartBeat, and auditBeat are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtm******</p>
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
    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class IpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("ipType")
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

            private Builder() {
            } 

            private Builder(IpAddress model) {
                this.host = model.host;
                this.ipType = model.ipType;
            } 

            /**
             * <p>The information about the collectors on the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.xx.xx</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The IP address of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
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
    /**
     * 
     * {@link ListEcsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsInstancesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cloudAssistantStatus")
        private String cloudAssistantStatus;

        @com.aliyun.core.annotation.NameInMap("collectors")
        private java.util.List<Collectors> collectors;

        @com.aliyun.core.annotation.NameInMap("ecsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("ecsInstanceName")
        private String ecsInstanceName;

        @com.aliyun.core.annotation.NameInMap("ipAddress")
        private java.util.List<IpAddress> ipAddress;

        @com.aliyun.core.annotation.NameInMap("osType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
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
        public java.util.List<Collectors> getCollectors() {
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
        public java.util.List<IpAddress> getIpAddress() {
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
            private java.util.List<Collectors> collectors; 
            private String ecsInstanceId; 
            private String ecsInstanceName; 
            private java.util.List<IpAddress> ipAddress; 
            private String osType; 
            private String status; 
            private String tags; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cloudAssistantStatus = model.cloudAssistantStatus;
                this.collectors = model.collectors;
                this.ecsInstanceId = model.ecsInstanceId;
                this.ecsInstanceName = model.ecsInstanceName;
                this.ipAddress = model.ipAddress;
                this.osType = model.osType;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * <p>The ID of the collector instance.</p>
             */
            public Builder collectors(java.util.List<Collectors> collectors) {
                this.collectors = collectors;
                return this;
            }

            /**
             * <p>The tags of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp14ncqge8wy3l3d****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecsTestName</p>
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * <p>The type of the IP address that is used by the instance. Valid values:</p>
             * <ul>
             * <li>public: public endpoint</li>
             * <li>private: private network address</li>
             * </ul>
             */
            public Builder ipAddress(java.util.List<IpAddress> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The status of the ECS instance. Valid values:</p>
             * <ul>
             * <li>running: The master instance is running</li>
             * <li>starting</li>
             * <li>stopping: The task is being stopped.</li>
             * <li>stopped: The node is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The operating system type of the ECS instance. Valid values:</p>
             * <ul>
             * <li>windows:Windows operating system</li>
             * <li>linux:Linux operating system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[ { &quot;tagKey&quot;: &quot;a&quot;, &quot;tagValue&quot;: &quot;b&quot; } ]</p>
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
