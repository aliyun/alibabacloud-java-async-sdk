// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultipleTraceResponseBody</p>
 */
public class GetMultipleTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MultiCallChainInfos")
    private java.util.List < MultiCallChainInfos> multiCallChainInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMultipleTraceResponseBody(Builder builder) {
        this.multiCallChainInfos = builder.multiCallChainInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultipleTraceResponseBody create() {
        return builder().build();
    }

    /**
     * @return multiCallChainInfos
     */
    public java.util.List < MultiCallChainInfos> getMultiCallChainInfos() {
        return this.multiCallChainInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MultiCallChainInfos> multiCallChainInfos; 
        private String requestId; 

        /**
         * The details of traces.
         */
        public Builder multiCallChainInfos(java.util.List < MultiCallChainInfos> multiCallChainInfos) {
            this.multiCallChainInfos = multiCallChainInfos;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMultipleTraceResponseBody build() {
            return new GetMultipleTraceResponseBody(this);
        } 

    } 

    public static class TagEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagEntryList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntryList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagEntryList build() {
                return new TagEntryList(this);
            } 

        } 

    }
    public static class LogEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagEntryList")
        private java.util.List < TagEntryList> tagEntryList;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private LogEventList(Builder builder) {
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEventList create() {
            return builder().build();
        }

        /**
         * @return tagEntryList
         */
        public java.util.List < TagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private java.util.List < TagEntryList> tagEntryList; 
            private Long timestamp; 

            /**
             * The tags of the trace.
             */
            public Builder tagEntryList(java.util.List < TagEntryList> tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * The time when the log was generated. The value is a timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public LogEventList build() {
                return new LogEventList(this);
            } 

        } 

    }
    public static class SpansTagEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SpansTagEntryList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpansTagEntryList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SpansTagEntryList build() {
                return new SpansTagEntryList(this);
            } 

        } 

    }
    public static class Spans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("HaveStack")
        private Boolean haveStack;

        @com.aliyun.core.annotation.NameInMap("LogEventList")
        private java.util.List < LogEventList> logEventList;

        @com.aliyun.core.annotation.NameInMap("OperationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("ParentSpanId")
        private String parentSpanId;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("RpcId")
        private String rpcId;

        @com.aliyun.core.annotation.NameInMap("RpcType")
        private Integer rpcType;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SpanId")
        private String spanId;

        @com.aliyun.core.annotation.NameInMap("TagEntryList")
        private java.util.List < SpansTagEntryList> tagEntryList;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceID")
        private String traceID;

        private Spans(Builder builder) {
            this.duration = builder.duration;
            this.haveStack = builder.haveStack;
            this.logEventList = builder.logEventList;
            this.operationName = builder.operationName;
            this.parentSpanId = builder.parentSpanId;
            this.resultCode = builder.resultCode;
            this.rpcId = builder.rpcId;
            this.rpcType = builder.rpcType;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.spanId = builder.spanId;
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
            this.traceID = builder.traceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spans create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return haveStack
         */
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        /**
         * @return logEventList
         */
        public java.util.List < LogEventList> getLogEventList() {
            return this.logEventList;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        /**
         * @return parentSpanId
         */
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return rpcType
         */
        public Integer getRpcType() {
            return this.rpcType;
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
         * @return spanId
         */
        public String getSpanId() {
            return this.spanId;
        }

        /**
         * @return tagEntryList
         */
        public java.util.List < SpansTagEntryList> getTagEntryList() {
            return this.tagEntryList;
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
            private Boolean haveStack; 
            private java.util.List < LogEventList> logEventList; 
            private String operationName; 
            private String parentSpanId; 
            private String resultCode; 
            private String rpcId; 
            private Integer rpcType; 
            private String serviceIp; 
            private String serviceName; 
            private String spanId; 
            private java.util.List < SpansTagEntryList> tagEntryList; 
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
             * Indicates whether a method stack was provided.
             * <p>
             * 
             * *   `true`: A method stack was provided.
             * *   `false`: No method stack was provided.
             */
            public Builder haveStack(Boolean haveStack) {
                this.haveStack = haveStack;
                return this;
            }

            /**
             * The log events in the trace.
             */
            public Builder logEventList(java.util.List < LogEventList> logEventList) {
                this.logEventList = logEventList;
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
             * The ID of the parent span.
             */
            public Builder parentSpanId(String parentSpanId) {
                this.parentSpanId = parentSpanId;
                return this;
            }

            /**
             * The status code returned.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * RPC ID
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * The type of the remote procedure call (RPC) mode.
             * <p>
             * 
             * *   0: HTTP entry
             * *   25: HTTP call
             * *   1: High-speed Service Framework (HSF) call
             * *   2: HSF provision
             * *   40: on-premises API call
             * *   60: MySQL call
             * *   62: Oracle call
             * *   63: PostgreSQL call
             * *   70: Redis call
             * *   4: Taobao Distributed Data Layer (TDDL) call
             * *   5: Tair call
             * *   13: MetaQ message sending
             * *   252: MetaQ message receiving
             * *   3: notification sending
             * *   254: notification receiving
             * *   7: Apache Dubbo call
             * *   8: Apache Dubbo provision
             * *   19: SOFARPC call
             * *   18: SOFARPC provision
             * *   11: Distributed Service Framework (DSF) call
             * *   12: DSF provision
             * *   \-1: unknown call
             */
            public Builder rpcType(Integer rpcType) {
                this.rpcType = rpcType;
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
             * The span ID.
             */
            public Builder spanId(String spanId) {
                this.spanId = spanId;
                return this;
            }

            /**
             * The tags of the trace.
             */
            public Builder tagEntryList(java.util.List < SpansTagEntryList> tagEntryList) {
                this.tagEntryList = tagEntryList;
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

            public Spans build() {
                return new Spans(this);
            } 

        } 

    }
    public static class MultiCallChainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Spans")
        private java.util.List < Spans> spans;

        @com.aliyun.core.annotation.NameInMap("TraceID")
        private String traceID;

        private MultiCallChainInfos(Builder builder) {
            this.spans = builder.spans;
            this.traceID = builder.traceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiCallChainInfos create() {
            return builder().build();
        }

        /**
         * @return spans
         */
        public java.util.List < Spans> getSpans() {
            return this.spans;
        }

        /**
         * @return traceID
         */
        public String getTraceID() {
            return this.traceID;
        }

        public static final class Builder {
            private java.util.List < Spans> spans; 
            private String traceID; 

            /**
             * The details of the trace.
             */
            public Builder spans(java.util.List < Spans> spans) {
                this.spans = spans;
                return this;
            }

            /**
             * The trace ID.
             */
            public Builder traceID(String traceID) {
                this.traceID = traceID;
                return this;
            }

            public MultiCallChainInfos build() {
                return new MultiCallChainInfos(this);
            } 

        } 

    }
}
