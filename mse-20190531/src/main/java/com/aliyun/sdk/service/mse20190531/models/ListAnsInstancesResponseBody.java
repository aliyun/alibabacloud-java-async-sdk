// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnsInstancesResponseBody</p>
 */
public class ListAnsInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * systemError
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * system error
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAnsInstancesResponseBody build() {
            return new ListAnsInstancesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("App")
        private String app;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("DatumKey")
        private String datumKey;

        @NameInMap("DefaultKey")
        private String defaultKey;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Ephemeral")
        private Boolean ephemeral;

        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("Healthy")
        private Boolean healthy;

        @NameInMap("InstanceHeartBeatInterval")
        private Integer instanceHeartBeatInterval;

        @NameInMap("InstanceHeartBeatTimeOut")
        private Integer instanceHeartBeatTimeOut;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpDeleteTimeout")
        private Integer ipDeleteTimeout;

        @NameInMap("LastBeat")
        private Long lastBeat;

        @NameInMap("Marked")
        private Boolean marked;

        @NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @NameInMap("OkCount")
        private Integer okCount;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Weight")
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
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * DatumKey.
             */
            public Builder datumKey(String datumKey) {
                this.datumKey = datumKey;
                return this;
            }

            /**
             * DefaultKey.
             */
            public Builder defaultKey(String defaultKey) {
                this.defaultKey = defaultKey;
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
             * Ephemeral.
             */
            public Builder ephemeral(Boolean ephemeral) {
                this.ephemeral = ephemeral;
                return this;
            }

            /**
             * FailCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * Healthy.
             */
            public Builder healthy(Boolean healthy) {
                this.healthy = healthy;
                return this;
            }

            /**
             * InstanceHeartBeatInterval.
             */
            public Builder instanceHeartBeatInterval(Integer instanceHeartBeatInterval) {
                this.instanceHeartBeatInterval = instanceHeartBeatInterval;
                return this;
            }

            /**
             * InstanceHeartBeatTimeOut.
             */
            public Builder instanceHeartBeatTimeOut(Integer instanceHeartBeatTimeOut) {
                this.instanceHeartBeatTimeOut = instanceHeartBeatTimeOut;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * IpDeleteTimeout.
             */
            public Builder ipDeleteTimeout(Integer ipDeleteTimeout) {
                this.ipDeleteTimeout = ipDeleteTimeout;
                return this;
            }

            /**
             * LastBeat.
             */
            public Builder lastBeat(Long lastBeat) {
                this.lastBeat = lastBeat;
                return this;
            }

            /**
             * Marked.
             */
            public Builder marked(Boolean marked) {
                this.marked = marked;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * OkCount.
             */
            public Builder okCount(Integer okCount) {
                this.okCount = okCount;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Weight.
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
