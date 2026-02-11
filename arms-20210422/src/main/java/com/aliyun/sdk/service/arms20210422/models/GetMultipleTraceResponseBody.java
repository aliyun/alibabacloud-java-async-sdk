// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultipleTraceResponseBody</p>
 */
public class GetMultipleTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MultiCallChainInfos")
    private java.util.List<MultiCallChainInfos> multiCallChainInfos;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multiCallChainInfos
     */
    public java.util.List<MultiCallChainInfos> getMultiCallChainInfos() {
        return this.multiCallChainInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MultiCallChainInfos> multiCallChainInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMultipleTraceResponseBody model) {
            this.multiCallChainInfos = model.multiCallChainInfos;
            this.requestId = model.requestId;
        } 

        /**
         * MultiCallChainInfos.
         */
        public Builder multiCallChainInfos(java.util.List<MultiCallChainInfos> multiCallChainInfos) {
            this.multiCallChainInfos = multiCallChainInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMultipleTraceResponseBody build() {
            return new GetMultipleTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipleTraceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TagEntryList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipleTraceResponseBody</p>
     */
    public static class LogEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagEntryList")
        private java.util.List<TagEntryList> tagEntryList;

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
        public java.util.List<TagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private java.util.List<TagEntryList> tagEntryList; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(LogEventList model) {
                this.tagEntryList = model.tagEntryList;
                this.timestamp = model.timestamp;
            } 

            /**
             * TagEntryList.
             */
            public Builder tagEntryList(java.util.List<TagEntryList> tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * Timestamp.
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
    /**
     * 
     * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipleTraceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SpansTagEntryList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipleTraceResponseBody</p>
     */
    public static class Spans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("HaveStack")
        private Boolean haveStack;

        @com.aliyun.core.annotation.NameInMap("LogEventList")
        private java.util.List<LogEventList> logEventList;

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
        private java.util.List<SpansTagEntryList> tagEntryList;

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
        public java.util.List<LogEventList> getLogEventList() {
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
        public java.util.List<SpansTagEntryList> getTagEntryList() {
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
            private java.util.List<LogEventList> logEventList; 
            private String operationName; 
            private String parentSpanId; 
            private String resultCode; 
            private String rpcId; 
            private Integer rpcType; 
            private String serviceIp; 
            private String serviceName; 
            private String spanId; 
            private java.util.List<SpansTagEntryList> tagEntryList; 
            private Long timestamp; 
            private String traceID; 

            private Builder() {
            } 

            private Builder(Spans model) {
                this.duration = model.duration;
                this.haveStack = model.haveStack;
                this.logEventList = model.logEventList;
                this.operationName = model.operationName;
                this.parentSpanId = model.parentSpanId;
                this.resultCode = model.resultCode;
                this.rpcId = model.rpcId;
                this.rpcType = model.rpcType;
                this.serviceIp = model.serviceIp;
                this.serviceName = model.serviceName;
                this.spanId = model.spanId;
                this.tagEntryList = model.tagEntryList;
                this.timestamp = model.timestamp;
                this.traceID = model.traceID;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * HaveStack.
             */
            public Builder haveStack(Boolean haveStack) {
                this.haveStack = haveStack;
                return this;
            }

            /**
             * LogEventList.
             */
            public Builder logEventList(java.util.List<LogEventList> logEventList) {
                this.logEventList = logEventList;
                return this;
            }

            /**
             * OperationName.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * ParentSpanId.
             */
            public Builder parentSpanId(String parentSpanId) {
                this.parentSpanId = parentSpanId;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * RpcId.
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * RpcType.
             */
            public Builder rpcType(Integer rpcType) {
                this.rpcType = rpcType;
                return this;
            }

            /**
             * ServiceIp.
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SpanId.
             */
            public Builder spanId(String spanId) {
                this.spanId = spanId;
                return this;
            }

            /**
             * TagEntryList.
             */
            public Builder tagEntryList(java.util.List<SpansTagEntryList> tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TraceID.
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
    /**
     * 
     * {@link GetMultipleTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipleTraceResponseBody</p>
     */
    public static class MultiCallChainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Spans")
        private java.util.List<Spans> spans;

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
        public java.util.List<Spans> getSpans() {
            return this.spans;
        }

        /**
         * @return traceID
         */
        public String getTraceID() {
            return this.traceID;
        }

        public static final class Builder {
            private java.util.List<Spans> spans; 
            private String traceID; 

            private Builder() {
            } 

            private Builder(MultiCallChainInfos model) {
                this.spans = model.spans;
                this.traceID = model.traceID;
            } 

            /**
             * Spans.
             */
            public Builder spans(java.util.List<Spans> spans) {
                this.spans = spans;
                return this;
            }

            /**
             * TraceID.
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
