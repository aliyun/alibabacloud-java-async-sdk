// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTracesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTracesResponseBody</p>
 */
public class SearchTracesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceInfos")
    private java.util.List < TraceInfos> traceInfos;

    private SearchTracesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traceInfos = builder.traceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceInfos
     */
    public java.util.List < TraceInfos> getTraceInfos() {
        return this.traceInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TraceInfos> traceInfos; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the returned traces.
         */
        public Builder traceInfos(java.util.List < TraceInfos> traceInfos) {
            this.traceInfos = traceInfos;
            return this;
        }

        public SearchTracesResponseBody build() {
            return new SearchTracesResponseBody(this);
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
}
