// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTracesByPageResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTracesByPageResponseBody</p>
 */
public class SearchTracesByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SearchTracesByPageResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesByPageResponseBody create() {
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
         * The returned struct.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchTracesByPageResponseBody build() {
            return new SearchTracesByPageResponseBody(this);
        } 

    } 

    public static class TraceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("OperationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceID")
        private String traceID;

        private TraceInfos(Builder builder) {
            this.duration = builder.duration;
            this.operationName = builder.operationName;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.timestamp = builder.timestamp;
            this.traceID = builder.traceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceInfos create() {
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
            private Long timestamp; 
            private String traceID; 

            /**
             * The amount of time consumed by the trace. Unit: milliseconds.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The name of the traced span.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * The IP address of the host where the application resides.
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The trace ID.
             */
            public Builder traceID(String traceID) {
                this.traceID = traceID;
                return this;
            }

            public TraceInfos build() {
                return new TraceInfos(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TraceInfos")
        private java.util.List < TraceInfos> traceInfos;

        private PageBean(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return traceInfos
         */
        public java.util.List < TraceInfos> getTraceInfos() {
            return this.traceInfos;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 
            private java.util.List < TraceInfos> traceInfos; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * The details of the returned traces.
             */
            public Builder traceInfos(java.util.List < TraceInfos> traceInfos) {
                this.traceInfos = traceInfos;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
