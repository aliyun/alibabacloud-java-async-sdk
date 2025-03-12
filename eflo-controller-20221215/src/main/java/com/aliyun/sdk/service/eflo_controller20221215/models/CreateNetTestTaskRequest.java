// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateNetTestTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateNetTestTaskRequest</p>
 */
public class CreateNetTestTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommTest")
    private CommTest commTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DelayTest")
    private DelayTest delayTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetTestType")
    private String netTestType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkMode")
    private String networkMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficTest")
    private TrafficTest trafficTest;

    private CreateNetTestTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.commTest = builder.commTest;
        this.delayTest = builder.delayTest;
        this.netTestType = builder.netTestType;
        this.networkMode = builder.networkMode;
        this.port = builder.port;
        this.trafficTest = builder.trafficTest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetTestTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return commTest
     */
    public CommTest getCommTest() {
        return this.commTest;
    }

    /**
     * @return delayTest
     */
    public DelayTest getDelayTest() {
        return this.delayTest;
    }

    /**
     * @return netTestType
     */
    public String getNetTestType() {
        return this.netTestType;
    }

    /**
     * @return networkMode
     */
    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return trafficTest
     */
    public TrafficTest getTrafficTest() {
        return this.trafficTest;
    }

    public static final class Builder extends Request.Builder<CreateNetTestTaskRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String clusterName; 
        private CommTest commTest; 
        private DelayTest delayTest; 
        private String netTestType; 
        private String networkMode; 
        private String port; 
        private TrafficTest trafficTest; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetTestTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.commTest = request.commTest;
            this.delayTest = request.delayTest;
            this.netTestType = request.netTestType;
            this.networkMode = request.networkMode;
            this.port = request.port;
            this.trafficTest = request.trafficTest;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>i119982311660892626523</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Cluster name</p>
         * 
         * <strong>example:</strong>
         * <p>Eflo-YJ-Test-Cluster</p>
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Required when the test type is communication library testing</p>
         */
        public Builder commTest(CommTest commTest) {
            String commTestShrink = shrink(commTest, "CommTest", "json");
            this.putBodyParameter("CommTest", commTestShrink);
            this.commTest = commTest;
            return this;
        }

        /**
         * <p>Fill in this field when the network test type is delay testing.</p>
         */
        public Builder delayTest(DelayTest delayTest) {
            String delayTestShrink = shrink(delayTest, "DelayTest", "json");
            this.putBodyParameter("DelayTest", delayTestShrink);
            this.delayTest = delayTest;
            return this;
        }

        /**
         * <p>Network test type.
         * For example: DelayTest for latency testing, TrafficTest for traffic testing, CommTest for communication library testing.</p>
         * 
         * <strong>example:</strong>
         * <p>DelayTest</p>
         */
        public Builder netTestType(String netTestType) {
            this.putBodyParameter("NetTestType", netTestType);
            this.netTestType = netTestType;
            return this;
        }

        /**
         * <p>Network mode</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder networkMode(String networkMode) {
            this.putBodyParameter("NetworkMode", networkMode);
            this.networkMode = networkMode;
            return this;
        }

        /**
         * <p>Test port number.</p>
         * 
         * <strong>example:</strong>
         * <p>23604</p>
         */
        public Builder port(String port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>This field is empty if the TrafficModel is Fullmesh.</p>
         */
        public Builder trafficTest(TrafficTest trafficTest) {
            String trafficTestShrink = shrink(trafficTest, "TrafficTest", "json");
            this.putBodyParameter("TrafficTest", trafficTestShrink);
            this.trafficTest = trafficTest;
            return this;
        }

        @Override
        public CreateNetTestTaskRequest build() {
            return new CreateNetTestTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private Hosts(Builder builder) {
            this.ip = builder.ip;
            this.nodeId = builder.nodeId;
            this.resourceId = builder.resourceId;
            this.serverName = builder.serverName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        public static final class Builder {
            private String ip; 
            private String nodeId; 
            private String resourceId; 
            private String serverName; 

            /**
             * <p>IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>169.253.253.15</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-tw-bqisacl3z6l</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>i111670831721110797708</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>VBw</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class CommTest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GPUNum")
        private Long GPUNum;

        @com.aliyun.core.annotation.NameInMap("Hosts")
        private java.util.List<Hosts> hosts;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CommTest(Builder builder) {
            this.GPUNum = builder.GPUNum;
            this.hosts = builder.hosts;
            this.model = builder.model;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommTest create() {
            return builder().build();
        }

        /**
         * @return GPUNum
         */
        public Long getGPUNum() {
            return this.GPUNum;
        }

        /**
         * @return hosts
         */
        public java.util.List<Hosts> getHosts() {
            return this.hosts;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long GPUNum; 
            private java.util.List<Hosts> hosts; 
            private String model; 
            private String type; 

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPUNum(Long GPUNum) {
                this.GPUNum = GPUNum;
                return this;
            }

            /**
             * <p>Resource ID</p>
             */
            public Builder hosts(java.util.List<Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>Communication library model</p>
             * 
             * <strong>example:</strong>
             * <p>intention_v4</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Communication library test category: ACCL or NCCL</p>
             * 
             * <strong>example:</strong>
             * <p>ACCL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CommTest build() {
                return new CommTest(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class DelayTestHosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bond")
        private String bond;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private DelayTestHosts(Builder builder) {
            this.bond = builder.bond;
            this.ip = builder.ip;
            this.nodeId = builder.nodeId;
            this.resourceId = builder.resourceId;
            this.serverName = builder.serverName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayTestHosts create() {
            return builder().build();
        }

        /**
         * @return bond
         */
        public String getBond() {
            return this.bond;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        public static final class Builder {
            private String bond; 
            private String ip; 
            private String nodeId; 
            private String resourceId; 
            private String serverName; 

            /**
             * <p>Network interface bond port</p>
             * 
             * <strong>example:</strong>
             * <p>bond1</p>
             */
            public Builder bond(String bond) {
                this.bond = bond;
                return this;
            }

            /**
             * <p>Node IP</p>
             * 
             * <strong>example:</strong>
             * <p>125.210.225.48</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-fou43an0a05</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-bcd3u1aee06</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>NQU</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            public DelayTestHosts build() {
                return new DelayTestHosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class DelayTest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hosts")
        private java.util.List<DelayTestHosts> hosts;

        private DelayTest(Builder builder) {
            this.hosts = builder.hosts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayTest create() {
            return builder().build();
        }

        /**
         * @return hosts
         */
        public java.util.List<DelayTestHosts> getHosts() {
            return this.hosts;
        }

        public static final class Builder {
            private java.util.List<DelayTestHosts> hosts; 

            /**
             * <p>输入测试节点的hosts</p>
             */
            public Builder hosts(java.util.List<DelayTestHosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            public DelayTest build() {
                return new DelayTest(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bond")
        private String bond;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private Clients(Builder builder) {
            this.bond = builder.bond;
            this.ip = builder.ip;
            this.nodeId = builder.nodeId;
            this.resourceId = builder.resourceId;
            this.serverName = builder.serverName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return bond
         */
        public String getBond() {
            return this.bond;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        public static final class Builder {
            private String bond; 
            private String ip; 
            private String nodeId; 
            private String resourceId; 
            private String serverName; 

            /**
             * <p>Network card bond interface</p>
             * 
             * <strong>example:</strong>
             * <p>bond1</p>
             */
            public Builder bond(String bond) {
                this.bond = bond;
                return this;
            }

            /**
             * <p>Node IP</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-tw-w5elqg7pw18</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-20s41p6cx01</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>xMv</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class Servers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bond")
        private String bond;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private Servers(Builder builder) {
            this.bond = builder.bond;
            this.ip = builder.ip;
            this.nodeId = builder.nodeId;
            this.resourceId = builder.resourceId;
            this.serverName = builder.serverName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Servers create() {
            return builder().build();
        }

        /**
         * @return bond
         */
        public String getBond() {
            return this.bond;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        public static final class Builder {
            private String bond; 
            private String ip; 
            private String nodeId; 
            private String resourceId; 
            private String serverName; 

            /**
             * <p>Network card bond interface</p>
             * 
             * <strong>example:</strong>
             * <p>bond1</p>
             */
            public Builder bond(String bond) {
                this.bond = bond;
                return this;
            }

            /**
             * <p>Node IP</p>
             * 
             * <strong>example:</strong>
             * <p>47.121.110.190</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-tw-bqisacl3z6l</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-wwo3etaqu0b</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>xMv</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetTestTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateNetTestTaskRequest</p>
     */
    public static class TrafficTest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clients")
        private java.util.List<Clients> clients;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("GDR")
        private Boolean GDR;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("QP")
        private Long qp;

        @com.aliyun.core.annotation.NameInMap("Servers")
        private java.util.List<Servers> servers;

        @com.aliyun.core.annotation.NameInMap("TrafficModel")
        private String trafficModel;

        private TrafficTest(Builder builder) {
            this.clients = builder.clients;
            this.duration = builder.duration;
            this.GDR = builder.GDR;
            this.protocol = builder.protocol;
            this.qp = builder.qp;
            this.servers = builder.servers;
            this.trafficModel = builder.trafficModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficTest create() {
            return builder().build();
        }

        /**
         * @return clients
         */
        public java.util.List<Clients> getClients() {
            return this.clients;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return GDR
         */
        public Boolean getGDR() {
            return this.GDR;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return qp
         */
        public Long getQp() {
            return this.qp;
        }

        /**
         * @return servers
         */
        public java.util.List<Servers> getServers() {
            return this.servers;
        }

        /**
         * @return trafficModel
         */
        public String getTrafficModel() {
            return this.trafficModel;
        }

        public static final class Builder {
            private java.util.List<Clients> clients; 
            private Long duration; 
            private Boolean GDR; 
            private String protocol; 
            private Long qp; 
            private java.util.List<Servers> servers; 
            private String trafficModel; 

            /**
             * <p>Resource ID.</p>
             */
            public Builder clients(java.util.List<Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * <p>The duration of the workflow task in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Enter True/False when the protocol is RDMA, 
             * this field is empty when the protocol is TCP.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder GDR(Boolean GDR) {
                this.GDR = GDR;
                return this;
            }

            /**
             * <p>Network protocol, either RDMA or TCP.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Enter the number of concurrent connections when the protocol is TCP, or enter the configured QP value when the protocol is RDMA.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder qp(Long qp) {
                this.qp = qp;
                return this;
            }

            /**
             * <p>Service list</p>
             */
            public Builder servers(java.util.List<Servers> servers) {
                this.servers = servers;
                return this;
            }

            /**
             * <p>Traffic model, either MTON or Fullmesh.</p>
             * 
             * <strong>example:</strong>
             * <p>Fullmesh</p>
             */
            public Builder trafficModel(String trafficModel) {
                this.trafficModel = trafficModel;
                return this;
            }

            public TrafficTest build() {
                return new TrafficTest(this);
            } 

        } 

    }
}
