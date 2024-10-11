// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAnsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnsInstancesResponseBody</p>
 */
public class ListAnsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAnsInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>52BA6DA6-A702-4362-A32F-DFF79655****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned instances.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAnsInstancesResponseBody build() {
            return new ListAnsInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnsInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("DatumKey")
        private String datumKey;

        @com.aliyun.core.annotation.NameInMap("DefaultKey")
        private String defaultKey;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Ephemeral")
        private Boolean ephemeral;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("Healthy")
        private Boolean healthy;

        @com.aliyun.core.annotation.NameInMap("InstanceHeartBeatInterval")
        private Integer instanceHeartBeatInterval;

        @com.aliyun.core.annotation.NameInMap("InstanceHeartBeatTimeOut")
        private Integer instanceHeartBeatTimeOut;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpDeleteTimeout")
        private Integer ipDeleteTimeout;

        @com.aliyun.core.annotation.NameInMap("LastBeat")
        private Long lastBeat;

        @com.aliyun.core.annotation.NameInMap("Marked")
        private Boolean marked;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @com.aliyun.core.annotation.NameInMap("OkCount")
        private Integer okCount;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Data(Builder builder) {
            this.app = builder.app;
            this.clusterName = builder.clusterName;
            this.datumKey = builder.datumKey;
            this.defaultKey = builder.defaultKey;
            this.enabled = builder.enabled;
            this.ephemeral = builder.ephemeral;
            this.failCount = builder.failCount;
            this.healthy = builder.healthy;
            this.instanceHeartBeatInterval = builder.instanceHeartBeatInterval;
            this.instanceHeartBeatTimeOut = builder.instanceHeartBeatTimeOut;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.ipDeleteTimeout = builder.ipDeleteTimeout;
            this.lastBeat = builder.lastBeat;
            this.marked = builder.marked;
            this.metadata = builder.metadata;
            this.okCount = builder.okCount;
            this.port = builder.port;
            this.serviceName = builder.serviceName;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return datumKey
         */
        public String getDatumKey() {
            return this.datumKey;
        }

        /**
         * @return defaultKey
         */
        public String getDefaultKey() {
            return this.defaultKey;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return ephemeral
         */
        public Boolean getEphemeral() {
            return this.ephemeral;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return healthy
         */
        public Boolean getHealthy() {
            return this.healthy;
        }

        /**
         * @return instanceHeartBeatInterval
         */
        public Integer getInstanceHeartBeatInterval() {
            return this.instanceHeartBeatInterval;
        }

        /**
         * @return instanceHeartBeatTimeOut
         */
        public Integer getInstanceHeartBeatTimeOut() {
            return this.instanceHeartBeatTimeOut;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipDeleteTimeout
         */
        public Integer getIpDeleteTimeout() {
            return this.ipDeleteTimeout;
        }

        /**
         * @return lastBeat
         */
        public Long getLastBeat() {
            return this.lastBeat;
        }

        /**
         * @return marked
         */
        public Boolean getMarked() {
            return this.marked;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return okCount
         */
        public Integer getOkCount() {
            return this.okCount;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String app; 
            private String clusterName; 
            private String datumKey; 
            private String defaultKey; 
            private Boolean enabled; 
            private Boolean ephemeral; 
            private Integer failCount; 
            private Boolean healthy; 
            private Integer instanceHeartBeatInterval; 
            private Integer instanceHeartBeatTimeOut; 
            private String instanceId; 
            private String ip; 
            private Integer ipDeleteTimeout; 
            private Long lastBeat; 
            private Boolean marked; 
            private java.util.Map < String, ? > metadata; 
            private Integer okCount; 
            private Integer port; 
            private String serviceName; 
            private Integer weight; 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The reference key.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.XX.XX:unknown:DEFAULT</p>
             */
            public Builder datumKey(String datumKey) {
                this.datumKey = datumKey;
                return this;
            }

            /**
             * <p>The default key.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.XX.XX:unknown</p>
             */
            public Builder defaultKey(String defaultKey) {
                this.defaultKey = defaultKey;
                return this;
            }

            /**
             * <p>The effective status of the instance. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The instance takes effect.</li>
             * <li><code>false</code>: The instance does not take effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Indicates whether the information about the ephemeral node is obtained. Valid values:</p>
             * <ul>
             * <li><code>true</code>: yes</li>
             * <li><code>false</code>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ephemeral(Boolean ephemeral) {
                this.ephemeral = ephemeral;
                return this;
            }

            /**
             * <p>The number of counted failures.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The health status of the instance. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The instance is healthy.</li>
             * <li><code>false</code>: The instance is unhealthy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder healthy(Boolean healthy) {
                this.healthy = healthy;
                return this;
            }

            /**
             * <p>The heartbeat interval of the instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder instanceHeartBeatInterval(Integer instanceHeartBeatInterval) {
                this.instanceHeartBeatInterval = instanceHeartBeatInterval;
                return this;
            }

            /**
             * <p>The timeout period of the instance heartbeat.</p>
             * 
             * <strong>example:</strong>
             * <p>15000</p>
             */
            public Builder instanceHeartBeatTimeOut(Integer instanceHeartBeatTimeOut) {
                this.instanceHeartBeatTimeOut = instanceHeartBeatTimeOut;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.XX.XX#0#DEFAULT#DEFAULT_GROUP@@consumers:com.alibaba.edas.IHelloService</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The timeout period for removing an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>30000</p>
             */
            public Builder ipDeleteTimeout(Integer ipDeleteTimeout) {
                this.ipDeleteTimeout = ipDeleteTimeout;
                return this;
            }

            /**
             * <p>The last heartbeat time.</p>
             * 
             * <strong>example:</strong>
             * <p>20201010</p>
             */
            public Builder lastBeat(Long lastBeat) {
                this.lastBeat = lastBeat;
                return this;
            }

            /**
             * <p>Indicates whether the instance was marked. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The instance marking was successful.</li>
             * <li><code>false</code>: The instance marking failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder marked(Boolean marked) {
                this.marked = marked;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>[int]</p>
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The number of counted successes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder okCount(Integer okCount) {
                this.okCount = okCount;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP@@consumers:com.alibaba.edas.IHelloService::</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The weight.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
