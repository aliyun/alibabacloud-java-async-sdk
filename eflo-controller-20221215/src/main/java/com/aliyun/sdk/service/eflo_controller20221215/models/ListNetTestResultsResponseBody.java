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
 * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetTestResultsResponseBody</p>
 */
public class ListNetTestResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NetTestResults")
    private java.util.List<NetTestResults> netTestResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNetTestResultsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.netTestResults = builder.netTestResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetTestResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return netTestResults
     */
    public java.util.List<NetTestResults> getNetTestResults() {
        return this.netTestResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long maxResults; 
        private java.util.List<NetTestResults> netTestResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNetTestResultsResponseBody model) {
            this.maxResults = model.maxResults;
            this.netTestResults = model.netTestResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>分页查询时每页行数。最大值为100。</p>
         * <p>默认值：</p>
         * <p>•当不设置值或设置的值小于20时，默认值为20。</p>
         * <p>•当设置的值大于100时，默认值为100。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>List of nodes</p>
         */
        public Builder netTestResults(java.util.List<NetTestResults> netTestResults) {
            this.netTestResults = netTestResults;
            return this;
        }

        /**
         * <p>NextToken for the next page, to be included in the request for the next page</p>
         * 
         * <strong>example:</strong>
         * <p>3a6b93229825ac667104463b56790c91</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3C683243-7915-57FB-9570-A2932C1C0F78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNetTestResultsResponseBody build() {
            return new ListNetTestResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private Hosts(Builder builder) {
            this.ip = builder.ip;
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
            private String resourceId; 
            private String serverName; 

            private Builder() {
            } 

            private Builder(Hosts model) {
                this.ip = model.ip;
                this.resourceId = model.resourceId;
                this.serverName = model.serverName;
            } 

            /**
             * <p>Node IP</p>
             * 
             * <strong>example:</strong>
             * <p>10.51.16.21</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-wwo3eteze19</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.xinjiaoyu.com">www.xinjiaoyu.com</a></p>
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
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class CommTest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GPUNum")
        private String GPUNum;

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
        public String getGPUNum() {
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
            private String GPUNum; 
            private java.util.List<Hosts> hosts; 
            private String model; 
            private String type; 

            private Builder() {
            } 

            private Builder(CommTest model) {
                this.GPUNum = model.GPUNum;
                this.hosts = model.hosts;
                this.model = model.model;
                this.type = model.type;
            } 

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder GPUNum(String GPUNum) {
                this.GPUNum = GPUNum;
                return this;
            }

            /**
             * <p>Input hosts for the test nodes</p>
             */
            public Builder hosts(java.util.List<Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>Communication library model</p>
             * 
             * <strong>example:</strong>
             * <p>AllToAll</p>
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
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class DelayTestHosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bond")
        private String bond;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private DelayTestHosts(Builder builder) {
            this.bond = builder.bond;
            this.ip = builder.ip;
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
            private String resourceId; 
            private String serverName; 

            private Builder() {
            } 

            private Builder(DelayTestHosts model) {
                this.bond = model.bond;
                this.ip = model.ip;
                this.resourceId = model.resourceId;
                this.serverName = model.serverName;
            } 

            /**
             * <p>Bond interface of the network card</p>
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
             * <p>pgm-bp174z988a27wre71o.pg.rds.aliyuncs.com</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>资源id</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-wwo3eteze19</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name</p>
             * 
             * <strong>example:</strong>
             * <p>WrF</p>
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
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DelayTest model) {
                this.hosts = model.hosts;
            } 

            /**
             * <p>Resource list</p>
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
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bond")
        private String bond;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private Clients(Builder builder) {
            this.bond = builder.bond;
            this.ip = builder.ip;
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
            private String resourceId; 
            private String serverName; 

            private Builder() {
            } 

            private Builder(Clients model) {
                this.bond = model.bond;
                this.ip = model.ip;
                this.resourceId = model.resourceId;
                this.serverName = model.serverName;
            } 

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
             * <p>IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>74.73.100.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-20p36bqet39</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-gf-cn.juequling.com</p>
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
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class Servers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bond")
        private String bond;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        private Servers(Builder builder) {
            this.bond = builder.bond;
            this.ip = builder.ip;
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
            private String resourceId; 
            private String serverName; 

            private Builder() {
            } 

            private Builder(Servers model) {
                this.bond = model.bond;
                this.ip = model.ip;
                this.resourceId = model.resourceId;
                this.serverName = model.serverName;
            } 

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
             * <p>10.1.168.183</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-wwo3eteze19</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-gf-cn.juequling.com</p>
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
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class TrafficTest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clients")
        private java.util.List<Clients> clients;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("GDR")
        private String GDR;

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
        public String getGDR() {
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
            private String GDR; 
            private String protocol; 
            private Long qp; 
            private java.util.List<Servers> servers; 
            private String trafficModel; 

            private Builder() {
            } 

            private Builder(TrafficTest model) {
                this.clients = model.clients;
                this.duration = model.duration;
                this.GDR = model.GDR;
                this.protocol = model.protocol;
                this.qp = model.qp;
                this.servers = model.servers;
                this.trafficModel = model.trafficModel;
            } 

            /**
             * <p>Clients</p>
             */
            public Builder clients(java.util.List<Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * <p>Duration of the workflow task, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>协议为RDMA时，填写True/False，
             * 协议为TCP时，此字段为空。</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder GDR(String GDR) {
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
             * <p>For TCP, enter the number of concurrent connections; for RDMA, enter the configured QP value.</p>
             * 
             * <strong>example:</strong>
             * <p>RDMA</p>
             */
            public Builder qp(Long qp) {
                this.qp = qp;
                return this;
            }

            /**
             * <p>This field is empty when the traffic model (TrafficModel) is Fullmesh.</p>
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
    /**
     * 
     * {@link ListNetTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetTestResultsResponseBody</p>
     */
    public static class NetTestResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CommTest")
        private CommTest commTest;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DelayTest")
        private DelayTest delayTest;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("NetTestType")
        private String netTestType;

        @com.aliyun.core.annotation.NameInMap("NetworkMode")
        private String networkMode;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TestId")
        private String testId;

        @com.aliyun.core.annotation.NameInMap("TrafficTest")
        private TrafficTest trafficTest;

        private NetTestResults(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.commTest = builder.commTest;
            this.creationTime = builder.creationTime;
            this.delayTest = builder.delayTest;
            this.finishedTime = builder.finishedTime;
            this.netTestType = builder.netTestType;
            this.networkMode = builder.networkMode;
            this.port = builder.port;
            this.status = builder.status;
            this.testId = builder.testId;
            this.trafficTest = builder.trafficTest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetTestResults create() {
            return builder().build();
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return delayTest
         */
        public DelayTest getDelayTest() {
            return this.delayTest;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return testId
         */
        public String getTestId() {
            return this.testId;
        }

        /**
         * @return trafficTest
         */
        public TrafficTest getTrafficTest() {
            return this.trafficTest;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private CommTest commTest; 
            private String creationTime; 
            private DelayTest delayTest; 
            private String finishedTime; 
            private String netTestType; 
            private String networkMode; 
            private String port; 
            private String status; 
            private String testId; 
            private TrafficTest trafficTest; 

            private Builder() {
            } 

            private Builder(NetTestResults model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.commTest = model.commTest;
                this.creationTime = model.creationTime;
                this.delayTest = model.delayTest;
                this.finishedTime = model.finishedTime;
                this.netTestType = model.netTestType;
                this.networkMode = model.networkMode;
                this.port = model.port;
                this.status = model.status;
                this.testId = model.testId;
                this.trafficTest = model.trafficTest;
            } 

            /**
             * <p>Cluster ID</p>
             * 
             * <strong>example:</strong>
             * <p>i110667211718265012218</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Cluster name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>To be filled when the network test type is communication library test</p>
             */
            public Builder commTest(CommTest commTest) {
                this.commTest = commTest;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-19T02:18:12Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Fill in when the network test type is latency test</p>
             */
            public Builder delayTest(DelayTest delayTest) {
                this.delayTest = delayTest;
                return this;
            }

            /**
             * <p>Completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-30T02:07Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>Type of network test.</p>
             * 
             * <strong>example:</strong>
             * <p>NetDiag</p>
             */
            public Builder netTestType(String netTestType) {
                this.netTestType = netTestType;
                return this;
            }

            /**
             * <p>Network mode</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p>Test port number.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Status of the network test task. Possible values:</br></p>
             * <ul>
             * <li>InProgress: Testing in progress.</br></li>
             * <li>Finished: Test completed.</br></li>
             * <li>Failed: Test failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InProgress</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Test ID. A unique identifier for the resource test task.</p>
             * 
             * <strong>example:</strong>
             * <p>String	i-uf6i0tv2refv8wz*****</p>
             */
            public Builder testId(String testId) {
                this.testId = testId;
                return this;
            }

            /**
             * <p>Fill in when the network test type is traffic test.</p>
             */
            public Builder trafficTest(TrafficTest trafficTest) {
                this.trafficTest = trafficTest;
                return this;
            }

            public NetTestResults build() {
                return new NetTestResults(this);
            } 

        } 

    }
}
