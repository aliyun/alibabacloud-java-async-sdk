// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
    private java.util.List<Traces> traces;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Traces> getTraces() {
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
        private java.util.List<Traces> traces; 

        private Builder() {
        } 

        private Builder(ListNamingTrackResponseBody model) {
            this.errorCode = model.errorCode;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.traces = model.traces;
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
         * <p>200</p>
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
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9916CBED-B2D5-5685-9129-4592FE1*****</p>
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
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The data information.</p>
         */
        public Builder traces(java.util.List<Traces> traces) {
            this.traces = traces;
            return this;
        }

        public ListNamingTrackResponseBody build() {
            return new ListNamingTrackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNamingTrackResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamingTrackResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Traces model) {
                this.clientIp = model.clientIp;
                this.group = model.group;
                this.instanceSize = model.instanceSize;
                this.nodeName = model.nodeName;
                this.pushTime = model.pushTime;
                this.pushTimeAll = model.pushTimeAll;
                this.pushTimeNetwork = model.pushTimeNetwork;
                this.serverName = model.serverName;
                this.slaTime = model.slaTime;
            } 

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>120.40.32.235</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The group.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceSize(String instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-197*****-167083******-reg-center-0-0</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The push time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-16 11:48:07</p>
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>The total push time.</p>
             * 
             * <strong>example:</strong>
             * <p>628ms</p>
             */
            public Builder pushTimeAll(String pushTimeAll) {
                this.pushTimeAll = pushTimeAll;
                return this;
            }

            /**
             * <p>The push time for the network.</p>
             * 
             * <strong>example:</strong>
             * <p>37ms</p>
             */
            public Builder pushTimeNetwork(String pushTimeNetwork) {
                this.pushTimeNetwork = pushTimeNetwork;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>fpx-xms-baseinfo</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            /**
             * <p>The duration that is specified in the service-level agreement (SLA).</p>
             * 
             * <strong>example:</strong>
             * <p>628ms</p>
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
