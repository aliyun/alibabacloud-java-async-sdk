// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAllNodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllNodeResponseBody</p>
 */
public class ListAllNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListAllNodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllNodeResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The zone ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>0D71B597-F3FF-5B56-88D7-74F9D3F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The CPU utilization.</p>
         * <blockquote>
         * <p> If the <strong>extended</strong> request parameter is set to <strong>true</strong> and the monitoring information of the nodes in the cluster is being synchronized, the value of the cpuPercent parameter is null. In this case, you need to send a request again after 10 seconds to obtain the value of the cpuPercent parameter.</p>
         * </blockquote>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListAllNodeResponseBody build() {
            return new ListAllNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllNodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllNodeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuPercent")
        private String cpuPercent;

        @com.aliyun.core.annotation.NameInMap("diskUsedPercent")
        private String diskUsedPercent;

        @com.aliyun.core.annotation.NameInMap("health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("heapPercent")
        private String heapPercent;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("loadOneM")
        private String loadOneM;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.cpuPercent = builder.cpuPercent;
            this.diskUsedPercent = builder.diskUsedPercent;
            this.health = builder.health;
            this.heapPercent = builder.heapPercent;
            this.host = builder.host;
            this.loadOneM = builder.loadOneM;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cpuPercent
         */
        public String getCpuPercent() {
            return this.cpuPercent;
        }

        /**
         * @return diskUsedPercent
         */
        public String getDiskUsedPercent() {
            return this.diskUsedPercent;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return heapPercent
         */
        public String getHeapPercent() {
            return this.heapPercent;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return loadOneM
         */
        public String getLoadOneM() {
            return this.loadOneM;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cpuPercent; 
            private String diskUsedPercent; 
            private String health; 
            private String heapPercent; 
            private String host; 
            private String loadOneM; 
            private String nodeType; 
            private Integer port; 
            private String zoneId; 

            /**
             * <p>The disk usage.</p>
             * 
             * <strong>example:</strong>
             * <p>4.2%</p>
             */
            public Builder cpuPercent(String cpuPercent) {
                this.cpuPercent = cpuPercent;
                return this;
            }

            /**
             * <p>The health status of the node. Valid values: GREEN, YELLOW, RED, and GRAY.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0%</p>
             */
            public Builder diskUsedPercent(String diskUsedPercent) {
                this.diskUsedPercent = diskUsedPercent;
                return this;
            }

            /**
             * health.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>21.6%</p>
             */
            public Builder heapPercent(String heapPercent) {
                this.heapPercent = heapPercent;
                return this;
            }

            /**
             * <p>The port that is used to connect to the node.</p>
             * 
             * <strong>example:</strong>
             * <p>10.15.XX.XX</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * loadOneM.
             */
            public Builder loadOneM(String loadOneM) {
                this.loadOneM = loadOneM;
                return this;
            }

            /**
             * <p>The 1-minute load of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKER</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the nodes. Valid values:</p>
             * <ul>
             * <li>MASTER: dedicated master node</li>
             * <li>WORKER: hot node</li>
             * <li>WORKER_WARM: warm node</li>
             * <li>COORDINATING: client node</li>
             * <li>KIBANA: Kibana node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
