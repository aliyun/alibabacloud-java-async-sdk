// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigTrackResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigTrackResponseBody</p>
 */
public class ListConfigTrackResponseBody extends TeaModel {
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

    private ListConfigTrackResponseBody(Builder builder) {
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

    public static ListConfigTrackResponseBody create() {
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
         * The page number of the returned page.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The track data.
         */
        public Builder traces(java.util.List < Traces> traces) {
            this.traces = traces;
            return this;
        }

        public ListConfigTrackResponseBody build() {
            return new ListConfigTrackResponseBody(this);
        } 

    } 

    public static class Traces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Client")
        private Boolean client;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("LogDate")
        private String logDate;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Push")
        private Boolean push;

        @com.aliyun.core.annotation.NameInMap("RequestIp")
        private String requestIp;

        @com.aliyun.core.annotation.NameInMap("ResponseIp")
        private String responseIp;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private String ts;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Traces(Builder builder) {
            this.client = builder.client;
            this.dataId = builder.dataId;
            this.delay = builder.delay;
            this.event = builder.event;
            this.group = builder.group;
            this.logDate = builder.logDate;
            this.md5 = builder.md5;
            this.push = builder.push;
            this.requestIp = builder.requestIp;
            this.responseIp = builder.responseIp;
            this.result = builder.result;
            this.ts = builder.ts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traces create() {
            return builder().build();
        }

        /**
         * @return client
         */
        public Boolean getClient() {
            return this.client;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return logDate
         */
        public String getLogDate() {
            return this.logDate;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return push
         */
        public Boolean getPush() {
            return this.push;
        }

        /**
         * @return requestIp
         */
        public String getRequestIp() {
            return this.requestIp;
        }

        /**
         * @return responseIp
         */
        public String getResponseIp() {
            return this.responseIp;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return ts
         */
        public String getTs() {
            return this.ts;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean client; 
            private String dataId; 
            private String delay; 
            private String event; 
            private String group; 
            private String logDate; 
            private String md5; 
            private Boolean push; 
            private String requestIp; 
            private String responseIp; 
            private String result; 
            private String ts; 
            private String type; 

            /**
             * Indicates whether the request is sent from the client. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder client(Boolean client) {
                this.client = client;
                return this;
            }

            /**
             * The ID of the configuration.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The response latency. Unit: milliseconds.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The event. Valid values:
             * <p>
             * 
             * *   pull: configuration acquisition events
             * *   persist: persistence events
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * The name of the configuration group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The logging time.
             */
            public Builder logDate(String logDate) {
                this.logDate = logDate;
                return this;
            }

            /**
             * The MD5 value.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Indicates whether messages are pushed by a server. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder push(Boolean push) {
                this.push = push;
                return this;
            }

            /**
             * The source IP address of the request.
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * The response node.
             */
            public Builder responseIp(String responseIp) {
                this.responseIp = responseIp;
                return this;
            }

            /**
             * The result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The timestamp that indicates the time when the metric value is collected.
             * <p>
             * 
             * Unit: seconds.
             */
            public Builder ts(String ts) {
                this.ts = ts;
                return this;
            }

            /**
             * The release type. Valid values:
             * <p>
             * 
             * *   beta: beta release
             * *   tag: canary release
             * *   batch: batch release
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Traces build() {
                return new Traces(this);
            } 

        } 

    }
}
