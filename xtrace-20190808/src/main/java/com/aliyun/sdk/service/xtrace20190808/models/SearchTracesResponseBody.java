// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link SearchTracesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTracesResponseBody</p>
 */
public class SearchTracesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SearchTracesResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageBean pageBean; 
        private String requestId; 

        /**
         * <p>The information about the returned page.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchTracesResponseBody build() {
            return new SearchTracesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchTracesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTracesResponseBody</p>
     */
    public static class TraceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("OperationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Long statusCode;

        @com.aliyun.core.annotation.NameInMap("TagMap")
        private java.util.Map<String, ?> tagMap;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceID")
        private String traceID;

        private TraceInfo(Builder builder) {
            this.duration = builder.duration;
            this.operationName = builder.operationName;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.statusCode = builder.statusCode;
            this.tagMap = builder.tagMap;
            this.timestamp = builder.timestamp;
            this.traceID = builder.traceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceInfo create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        /**
         * @return serviceIp
         */
        public String getServiceIp() {
            return this.serviceIp;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return statusCode
         */
        public Long getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return tagMap
         */
        public java.util.Map<String, ?> getTagMap() {
            return this.tagMap;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return traceID
         */
        public String getTraceID() {
            return this.traceID;
        }

        public static final class Builder {
            private Long duration; 
            private String operationName; 
            private String serviceIp; 
            private String serviceName; 
            private Long statusCode; 
            private java.util.Map<String, ?> tagMap; 
            private Long timestamp; 
            private String traceID; 

            /**
             * <p>The execution duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The span name.</p>
             * 
             * <strong>example:</strong>
             * <p>/api</p>
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * <p>The IP address or name of the server on which the span is running.</p>
             * 
             * <strong>example:</strong>
             * <p>192.163.XXX.XXX</p>
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>service1</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(Long statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The tag information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;env&quot;:&quot;dev&quot;}</p>
             */
            public Builder tagMap(java.util.Map<String, ?> tagMap) {
                this.tagMap = tagMap;
                return this;
            }

            /**
             * <p>The timestamp when the span was generated. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1575561600000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The trace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1c6881aab84191a4</p>
             */
            public Builder traceID(String traceID) {
                this.traceID = traceID;
                return this;
            }

            public TraceInfo build() {
                return new TraceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchTracesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTracesResponseBody</p>
     */
    public static class TraceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TraceInfo")
        private java.util.List<TraceInfo> traceInfo;

        private TraceInfos(Builder builder) {
            this.traceInfo = builder.traceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceInfos create() {
            return builder().build();
        }

        /**
         * @return traceInfo
         */
        public java.util.List<TraceInfo> getTraceInfo() {
            return this.traceInfo;
        }

        public static final class Builder {
            private java.util.List<TraceInfo> traceInfo; 

            /**
             * TraceInfo.
             */
            public Builder traceInfo(java.util.List<TraceInfo> traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            public TraceInfos build() {
                return new TraceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchTracesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTracesResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TraceInfos")
        private TraceInfos traceInfos;

        private PageBean(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.traceInfos = builder.traceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return traceInfos
         */
        public TraceInfos getTraceInfos() {
            return this.traceInfos;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 
            private TraceInfos traceInfos; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The information about the traces that are returned.</p>
             */
            public Builder traceInfos(TraceInfos traceInfos) {
                this.traceInfos = traceInfos;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
