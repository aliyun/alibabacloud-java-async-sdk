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
 * {@link UpdateCollectorNameResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCollectorNameResponseBody</p>
 */
public class UpdateCollectorNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateCollectorNameResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateCollectorNameResponseBody build() {
            return new UpdateCollectorNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCollectorNameResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCollectorNameResponseBody</p>
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
             * <p>The content of the file.</p>
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
             * <p>The name of the file.</p>
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
     * {@link UpdateCollectorNameResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCollectorNameResponseBody</p>
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
             * <p>The status of the shipper on the ECS instance. Valid values: <strong>heartOk</strong>, <strong>heartLost</strong>, <strong>uninstalled</strong>, and <strong>failed</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>heartOk</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The IDs of the ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>c1b9fde5172b84f82b9928e825a7b8988</p>
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
     * {@link UpdateCollectorNameResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCollectorNameResponseBody</p>
     */
    public static class ExtendConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("enableMonitoring")
        private Boolean enableMonitoring;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("hosts")
        private java.util.List<String> hosts;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("kibanaHost")
        private String kibanaHost;

        @com.aliyun.core.annotation.NameInMap("machines")
        private java.util.List<Machines> machines;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("successPodsCount")
        private String successPodsCount;

        @com.aliyun.core.annotation.NameInMap("totalPodsCount")
        private String totalPodsCount;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userName")
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
         * @return kibanaHost
         */
        public String getKibanaHost() {
            return this.kibanaHost;
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
            private java.util.List<String> hosts; 
            private String instanceId; 
            private String instanceType; 
            private String kibanaHost; 
            private java.util.List<Machines> machines; 
            private String protocol; 
            private String successPodsCount; 
            private String totalPodsCount; 
            private String type; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ExtendConfigs model) {
                this.configType = model.configType;
                this.enableMonitoring = model.enableMonitoring;
                this.groupId = model.groupId;
                this.host = model.host;
                this.hosts = model.hosts;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.kibanaHost = model.kibanaHost;
                this.machines = model.machines;
                this.protocol = model.protocol;
                this.successPodsCount = model.successPodsCount;
                this.totalPodsCount = model.totalPodsCount;
                this.type = model.type;
                this.userName = model.userName;
            } 

            /**
             * <p>The configuration type. Valid values:</p>
             * <ul>
             * <li>collectorTargetInstance</li>
             * <li>collectorDeployMachine</li>
             * <li>collectorElasticsearchForKibana</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>collectorDeployMachine</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>Indicates whether monitoring is enabled. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong> and the value of <strong>instanceType</strong> is <strong>elasticsearch</strong>. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMonitoring(Boolean enableMonitoring) {
                this.enableMonitoring = enableMonitoring;
                return this;
            }

            /**
             * <p>The ID of the machine group. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>default_ct-cn-5i2l75bz4776****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The private endpoint of Kibana after you enable the Kibana dashboard. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorElasticsearchForKibana</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-4591jumei000u****-kibana.internal.elasticsearch.aliyuncs.com:5601</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * hosts.
             */
            public Builder hosts(java.util.List<String> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>The ID of the resource that is associated with the shipper. If the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong>, the value of this parameter is the ID of the resource specified in the output configuration part of the shipper. If the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong> and the value of <strong>type</strong> is <strong>ACKCluster</strong>, the value of this parameter is the ID of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-n6w1o1****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the cluster specified in the output configuration part of the shipper. Valid values: elasticsearch and logstash. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The public endpoint of Kibana after you enable the Kibana dashboard. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorElasticsearchForKibana</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://es-cn-4591jumei000u****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-4591jumei000u****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
             */
            public Builder kibanaHost(String kibanaHost) {
                this.kibanaHost = kibanaHost;
                return this;
            }

            /**
             * <p>The information about the ECS instances on which the shipper is deployed. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong> and the value of <strong>type</strong> is <strong>ECSInstanceId</strong>.</p>
             */
            public Builder machines(java.util.List<Machines> machines) {
                this.machines = machines;
                return this;
            }

            /**
             * <p>The transmission protocol. Valid values: <strong>HTTP</strong> and <strong>HTTPS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The number of pods from which data is successfully collected in the ACK cluster. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong> and the value of <strong>type</strong> is <strong>ACKCluster</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder successPodsCount(String successPodsCount) {
                this.successPodsCount = successPodsCount;
                return this;
            }

            /**
             * <p>The total number of pods from which data is collected in the ACK cluster. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong> and the value of <strong>type</strong> is <strong>ACKCluster</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalPodsCount(String totalPodsCount) {
                this.totalPodsCount = totalPodsCount;
                return this;
            }

            /**
             * <p>The type of the machine on which the shipper is deployed. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong>. Valid values:</p>
             * <ul>
             * <li>ECSInstanceId</li>
             * <li>ACKCluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECSInstanceId</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The username that is used to access the resource specified in the output configuration part of the shipper. The default value is elastic. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong> or <strong>collectorElasticsearchForKibana</strong>.</p>
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
     * {@link UpdateCollectorNameResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCollectorNameResponseBody</p>
     */
    public static class Result extends TeaModel {
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

            private Builder(Result model) {
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
             * <p>The information about the configuration file of the shipper.</p>
             */
            public Builder configs(java.util.List<Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>Indicates whether a dry run is performed. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>The extended configurations of the shipper.</p>
             */
            public Builder extendConfigs(java.util.List<ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * <p>The time when the shipper was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-20T07:26:47.000+0000</p>
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * <p>The time when the shipper was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-20T07:26:47.000+0000</p>
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * <p>The name of the shipper.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16852099488*****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the shipper.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-cn-77uqof2s7rg5c****</p>
             */
            public Builder resId(String resId) {
                this.resId = resId;
                return this;
            }

            /**
             * <p>The type of the shipper. Valid values: fileBeat, metricBeat, heartBeat, and audiBeat.</p>
             * 
             * <strong>example:</strong>
             * <p>fileBeat</p>
             */
            public Builder resType(String resType) {
                this.resType = resType;
                return this;
            }

            /**
             * <p>The version of the shipper. The version of a shipper depends on the type of the machine on which the shipper is deployed.</p>
             * <ul>
             * <li>Elastic Compute Service (ECS) instance: 6.8.5_with_community</li>
             * <li>Container Service for Kubernetes (ACK) cluster: 6.8.13_with_community</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6.8.5_with_community</p>
             */
            public Builder resVersion(String resVersion) {
                this.resVersion = resVersion;
                return this;
            }

            /**
             * <p>The status of the shipper. Valid values: activating and active.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) where the shipper resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtma*****</p>
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
