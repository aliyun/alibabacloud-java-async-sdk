// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigTrackResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigTrackResponseBody</p>
 */
public class ListConfigTrackResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Traces")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpCode.
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
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Traces.
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
        @NameInMap("Client")
        private Boolean client;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Delay")
        private String delay;

        @NameInMap("Event")
        private String event;

        @NameInMap("Group")
        private String group;

        @NameInMap("LogDate")
        private String logDate;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Push")
        private Boolean push;

        @NameInMap("RequestIp")
        private String requestIp;

        @NameInMap("ResponseIp")
        private String responseIp;

        @NameInMap("Result")
        private String result;

        @NameInMap("Ts")
        private String ts;

        @NameInMap("Type")
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
             * Client.
             */
            public Builder client(Boolean client) {
                this.client = client;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * LogDate.
             */
            public Builder logDate(String logDate) {
                this.logDate = logDate;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Push.
             */
            public Builder push(Boolean push) {
                this.push = push;
                return this;
            }

            /**
             * RequestIp.
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * ResponseIp.
             */
            public Builder responseIp(String responseIp) {
                this.responseIp = responseIp;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(String ts) {
                this.ts = ts;
                return this;
            }

            /**
             * Type.
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
