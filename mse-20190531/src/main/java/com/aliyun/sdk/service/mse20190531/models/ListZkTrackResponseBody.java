// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListZkTrackResponseBody} extends {@link TeaModel}
 *
 * <p>ListZkTrackResponseBody</p>
 */
public class ListZkTrackResponseBody extends TeaModel {
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

    private ListZkTrackResponseBody(Builder builder) {
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

    public static ListZkTrackResponseBody create() {
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

        public ListZkTrackResponseBody build() {
            return new ListZkTrackResponseBody(this);
        } 

    } 

    public static class Traces extends TeaModel {
        @NameInMap("Acl")
        private String acl;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Finished")
        private Boolean finished;

        @NameInMap("LogDate")
        private String logDate;

        @NameInMap("MultiSize")
        private Long multiSize;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("Path")
        private String path;

        @NameInMap("Result")
        private String result;

        @NameInMap("SessionId")
        private String sessionId;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("TraceType")
        private String traceType;

        @NameInMap("Ttl")
        private Long ttl;

        @NameInMap("Watch")
        private Boolean watch;

        private Traces(Builder builder) {
            this.acl = builder.acl;
            this.dataType = builder.dataType;
            this.eventType = builder.eventType;
            this.finished = builder.finished;
            this.logDate = builder.logDate;
            this.multiSize = builder.multiSize;
            this.opType = builder.opType;
            this.path = builder.path;
            this.result = builder.result;
            this.sessionId = builder.sessionId;
            this.timestamp = builder.timestamp;
            this.traceType = builder.traceType;
            this.ttl = builder.ttl;
            this.watch = builder.watch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traces create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return logDate
         */
        public String getLogDate() {
            return this.logDate;
        }

        /**
         * @return multiSize
         */
        public Long getMultiSize() {
            return this.multiSize;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return traceType
         */
        public String getTraceType() {
            return this.traceType;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        /**
         * @return watch
         */
        public Boolean getWatch() {
            return this.watch;
        }

        public static final class Builder {
            private String acl; 
            private String dataType; 
            private String eventType; 
            private Boolean finished; 
            private String logDate; 
            private Long multiSize; 
            private String opType; 
            private String path; 
            private String result; 
            private String sessionId; 
            private String timestamp; 
            private String traceType; 
            private Long ttl; 
            private Boolean watch; 

            /**
             * Acl.
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * 数据类型：persist、ephemeral
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * 事件类型
             * <p>
             * 对于notify：
             *   ○ NodeCreated
             *   ○ NodeDeleted
             *   ○ NodeDataChanged
             *   ○ NodeChildrenChanged
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * Finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
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
             * MultiSize.
             */
            public Builder multiSize(Long multiSize) {
                this.multiSize = multiSize;
                return this;
            }

            /**
             * 操作类型
             * <p>
             * 对于Push
             *   ○ Create
             *   ○ Update
             *   ○ Delete
             *   ○ SetAcl
             *   ○ Multi
             * 对于Pull
             *   ○ GetData
             *   ○ GetChild
             *   ○ GetStat
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * 轨迹类型：push、pull、notify
             */
            public Builder traceType(String traceType) {
                this.traceType = traceType;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * 监听
             */
            public Builder watch(Boolean watch) {
                this.watch = watch;
                return this;
            }

            public Traces build() {
                return new Traces(this);
            } 

        } 

    }
}
