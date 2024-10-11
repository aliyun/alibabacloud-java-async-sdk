// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListZkTrackResponseBody} extends {@link TeaModel}
 *
 * <p>ListZkTrackResponseBody</p>
 */
public class ListZkTrackResponseBody extends TeaModel {
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
         * <p>The HTTP status code.</p>
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
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The track data.</p>
         */
        public Builder traces(java.util.List < Traces> traces) {
            this.traces = traces;
            return this;
        }

        public ListZkTrackResponseBody build() {
            return new ListZkTrackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListZkTrackResponseBody} extends {@link TeaModel}
     *
     * <p>ListZkTrackResponseBody</p>
     */
    public static class Traces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acl")
        private String acl;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("LogDate")
        private String logDate;

        @com.aliyun.core.annotation.NameInMap("MultiSize")
        private Long multiSize;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceType")
        private String traceType;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Long ttl;

        @com.aliyun.core.annotation.NameInMap("Watch")
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
             * <p>The access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>world:anyone:cdrwa</p>
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * <ul>
             * <li>persist</li>
             * <li>ephemeral</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>persist</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The type of the event. For trajectory of the Notify type:</p>
             * <ul>
             * <li>NodeCreated</li>
             * <li>NodeDeleted</li>
             * <li>NodeDataChanged</li>
             * <li>NodeChildrenChanged</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NodeCreated</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>Indicates whether the transaction ended.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * <p>The logging time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28 15:09:15,606</p>
             */
            public Builder logDate(String logDate) {
                this.logDate = logDate;
                return this;
            }

            /**
             * <p>The transaction size.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder multiSize(Long multiSize) {
                this.multiSize = multiSize;
                return this;
            }

            /**
             * <p>The type of the operation. For trajectory of the Push type:</p>
             * <ul>
             * <li>Create</li>
             * <li>Update</li>
             * <li>Delete</li>
             * <li>SetAcl</li>
             * <li>Multi</li>
             * </ul>
             * <p>For trajectory of the Pull type:</p>
             * <ul>
             * <li>GetData</li>
             * <li>GetChild</li>
             * <li>GetStat</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/path</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The returned result.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0x301fdfbdbf00***</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The timestamp. It is not available.</p>
             * 
             * <strong>example:</strong>
             * <p>1669619383000</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The type of the trajectory. Valid values:</p>
             * <ul>
             * <li>Push</li>
             * <li>Pull</li>
             * <li>Notify</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Push</p>
             */
            public Builder traceType(String traceType) {
                this.traceType = traceType;
                return this;
            }

            /**
             * <p>The time to live (TTL).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>Indicates whether the monitoring feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
