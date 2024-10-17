// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTraceResponseBody</p>
 */
public class GetTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Spans")
    private java.util.List < Spans> spans;

    private GetTraceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spans = builder.spans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spans
     */
    public java.util.List < Spans> getSpans() {
        return this.spans;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Spans> spans; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A9AEA84-7186-4D8D-B498-4585C6A2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the trace.</p>
         */
        public Builder spans(java.util.List < Spans> spans) {
            this.spans = spans;
            return this;
        }

        public GetTraceResponseBody build() {
            return new GetTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
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

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>http.status.code</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
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
             * <p>The tags of the trace.</p>
             */
            public Builder tagEntryList(java.util.List < TagEntryList> tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * <p>The timestamp when the log event was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1590388651</p>
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
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
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

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>http.status.code</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class Spans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List < java.util.Map<String, ?>> children;

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
            this.children = builder.children;
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
         * @return children
         */
        public java.util.List < java.util.Map<String, ?>> getChildren() {
            return this.children;
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
            private java.util.List < java.util.Map<String, ?>> children; 
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
             * <p>The child spans of the current span.</p>
             */
            public Builder children(java.util.List < java.util.Map<String, ?>> children) {
                this.children = children;
                return this;
            }

            /**
             * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether a method stack was provided.</p>
             * <ul>
             * <li><code>true</code>: A method stack was provided.</li>
             * <li><code>false</code>: No method stack was provided.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder haveStack(Boolean haveStack) {
                this.haveStack = haveStack;
                return this;
            }

            /**
             * <p>The log events in the trace.</p>
             */
            public Builder logEventList(java.util.List < LogEventList> logEventList) {
                this.logEventList = logEventList;
                return this;
            }

            /**
             * <p>The name of the traced span.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/demo</p>
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * <p>The ID of the parent span.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder parentSpanId(String parentSpanId) {
                this.parentSpanId = parentSpanId;
                return this;
            }

            /**
             * <p>The status code.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The ID of the RPC mode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * <p>The type of the remote procedure call (RPC) mode.</p>
             * <ul>
             * <li>0: HTTP entry</li>
             * <li>25: HTTP call</li>
             * <li>1: High-speed Service Framework (HSF) call</li>
             * <li>2: HSF provision</li>
             * <li>40: on-premises API call</li>
             * <li>60: MySQL call</li>
             * <li>62: Oracle call</li>
             * <li>63: PostgreSQL call</li>
             * <li>70: Redis call</li>
             * <li>4: Taobao Distributed Data Layer (TDDL) call</li>
             * <li>5: Tair call</li>
             * <li>13: MetaQ message sending</li>
             * <li>252: MetaQ message receiving</li>
             * <li>3: notification sending</li>
             * <li>254: notification receiving</li>
             * <li>7: Apache Dubbo call</li>
             * <li>8: Apache Dubbo provision</li>
             * <li>19: SOFARPC call</li>
             * <li>18: SOFARPC provision</li>
             * <li>11: Distributed Service Framework (DSF) call</li>
             * <li>12: DSF provision</li>
             * <li>-1: unknown call</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rpcType(Integer rpcType) {
                this.rpcType = rpcType;
                return this;
            }

            /**
             * <p>The IP address of the host where the application resides.</p>
             * 
             * <strong>example:</strong>
             * <p>172.20.XX.XX</p>
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-demo</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The span ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder spanId(String spanId) {
                this.spanId = spanId;
                return this;
            }

            /**
             * <p>The tags of the trace.</p>
             */
            public Builder tagEntryList(java.util.List < SpansTagEntryList> tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * <p>The timestamp generated when the span was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1590388651</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The trace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ac14001a15954493811405707d****</p>
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
}
