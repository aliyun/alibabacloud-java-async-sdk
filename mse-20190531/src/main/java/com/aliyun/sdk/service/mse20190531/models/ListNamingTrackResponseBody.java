// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamingTrackResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamingTrackResponseBody</p>
 */
public class ListNamingTrackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Traces")
    private java.util.List < Traces> traces;

    private ListNamingTrackResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.traces = builder.traces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamingTrackResponseBody create() {
        return builder().build();
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return traces
     */
    public java.util.List < Traces> getTraces() {
        return this.traces;
    }

    public static final class Builder {
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private java.util.List < Traces> traces; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The data information.
         */
        public Builder traces(java.util.List < Traces> traces) {
            this.traces = traces;
            return this;
        }

        public ListNamingTrackResponseBody build() {
            return new ListNamingTrackResponseBody(this);
        } 

    } 

    public static class Traces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("InstanceSize")
        private String instanceSize;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("PushTimeAll")
        private String pushTimeAll;

        @com.aliyun.core.annotation.NameInMap("PushTimeNetwork")
        private String pushTimeNetwork;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        @com.aliyun.core.annotation.NameInMap("SlaTime")
        private String slaTime;

        private Traces(Builder builder) {
            this.clientIp = builder.clientIp;
            this.group = builder.group;
            this.instanceSize = builder.instanceSize;
            this.nodeName = builder.nodeName;
            this.pushTime = builder.pushTime;
            this.pushTimeAll = builder.pushTimeAll;
            this.pushTimeNetwork = builder.pushTimeNetwork;
            this.serverName = builder.serverName;
            this.slaTime = builder.slaTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traces create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return instanceSize
         */
        public String getInstanceSize() {
            return this.instanceSize;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return pushTimeAll
         */
        public String getPushTimeAll() {
            return this.pushTimeAll;
        }

        /**
         * @return pushTimeNetwork
         */
        public String getPushTimeNetwork() {
            return this.pushTimeNetwork;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        /**
         * @return slaTime
         */
        public String getSlaTime() {
            return this.slaTime;
        }

        public static final class Builder {
            private String clientIp; 
            private String group; 
            private String instanceSize; 
            private String nodeName; 
            private String pushTime; 
            private String pushTimeAll; 
            private String pushTimeNetwork; 
            private String serverName; 
            private String slaTime; 

            /**
             * The IP address of the client.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder instanceSize(String instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The push time.
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * The total push time.
             */
            public Builder pushTimeAll(String pushTimeAll) {
                this.pushTimeAll = pushTimeAll;
                return this;
            }

            /**
             * The push time for the network.
             */
            public Builder pushTimeNetwork(String pushTimeNetwork) {
                this.pushTimeNetwork = pushTimeNetwork;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            /**
             * The duration that is specified in the service-level agreement (SLA).
             */
            public Builder slaTime(String slaTime) {
                this.slaTime = slaTime;
                return this;
            }

            public Traces build() {
                return new Traces(this);
            } 

        } 

    }
}
