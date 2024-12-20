// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceInfos")
    private java.util.List<TraceInfos> traceInfos;

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
    public java.util.List<TraceInfos> getTraceInfos() {
        return this.traceInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TraceInfos> traceInfos; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C518054-852F-4023-ABC1-4AF95FF7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the returned traces.</p>
         */
        public Builder traceInfos(java.util.List<TraceInfos> traceInfos) {
            this.traceInfos = traceInfos;
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
    public static class TraceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("OperationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SpanID")
        private String spanID;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceID")
        private String traceID;

        private TraceInfos(Builder builder) {
            this.duration = builder.duration;
            this.operationName = builder.operationName;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.spanID = builder.spanID;
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
         * @return spanID
         */
        public String getSpanID() {
            return this.spanID;
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
            private String spanID; 
            private Long timestamp; 
            private String traceID; 

            /**
             * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the traced span.</p>
             * 
             * <strong>example:</strong>
             * <p>get***</p>
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * <p>The IP address of the host where the application resides.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.20.**.**</code></p>
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-k8s-demo-subcomponent</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SpanID.
             */
            public Builder spanID(String spanID) {
                this.spanID = spanID;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1595174436993</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The trace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ac1400a115951744369937024d****</p>
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
