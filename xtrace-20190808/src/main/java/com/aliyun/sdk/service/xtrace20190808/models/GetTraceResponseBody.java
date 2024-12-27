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
 * {@link GetTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTraceResponseBody</p>
 */
public class GetTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Spans")
    private Spans spans;

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
    public Spans getSpans() {
        return this.spans;
    }

    public static final class Builder {
        private String requestId; 
        private Spans spans; 

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

        /**
         * <p>The spans that are contained in the trace.</p>
         */
        public Builder spans(Spans spans) {
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
    public static class TagEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagEntry(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntry create() {
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
             * <p>The tag key of the log event.</p>
             * 
             * <strong>example:</strong>
             * <p>logLevel</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the log event.</p>
             * 
             * <strong>example:</strong>
             * <p>Warning</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagEntry build() {
                return new TagEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class TagEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagEntry")
        private java.util.List<TagEntry> tagEntry;

        private TagEntryList(Builder builder) {
            this.tagEntry = builder.tagEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntryList create() {
            return builder().build();
        }

        /**
         * @return tagEntry
         */
        public java.util.List<TagEntry> getTagEntry() {
            return this.tagEntry;
        }

        public static final class Builder {
            private java.util.List<TagEntry> tagEntry; 

            /**
             * TagEntry.
             */
            public Builder tagEntry(java.util.List<TagEntry> tagEntry) {
                this.tagEntry = tagEntry;
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
    public static class LogEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagEntryList")
        private TagEntryList tagEntryList;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private LogEvent(Builder builder) {
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEvent create() {
            return builder().build();
        }

        /**
         * @return tagEntryList
         */
        public TagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private TagEntryList tagEntryList; 
            private Long timestamp; 

            /**
             * <p>The tags.</p>
             */
            public Builder tagEntryList(TagEntryList tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * <p>The timestamp when the log event was generated. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583683202047000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public LogEvent build() {
                return new LogEvent(this);
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
        @com.aliyun.core.annotation.NameInMap("LogEvent")
        private java.util.List<LogEvent> logEvent;

        private LogEventList(Builder builder) {
            this.logEvent = builder.logEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEventList create() {
            return builder().build();
        }

        /**
         * @return logEvent
         */
        public java.util.List<LogEvent> getLogEvent() {
            return this.logEvent;
        }

        public static final class Builder {
            private java.util.List<LogEvent> logEvent; 

            /**
             * LogEvent.
             */
            public Builder logEvent(java.util.List<LogEvent> logEvent) {
                this.logEvent = logEvent;
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
    public static class TagEntryListTagEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagEntryListTagEntry(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntryListTagEntry create() {
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
             * <p>The tag key of the span.</p>
             * 
             * <strong>example:</strong>
             * <p>logLevel</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the span.</p>
             * 
             * <strong>example:</strong>
             * <p>Warning</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagEntryListTagEntry build() {
                return new TagEntryListTagEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class SpanTagEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagEntry")
        private java.util.List<TagEntryListTagEntry> tagEntry;

        private SpanTagEntryList(Builder builder) {
            this.tagEntry = builder.tagEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpanTagEntryList create() {
            return builder().build();
        }

        /**
         * @return tagEntry
         */
        public java.util.List<TagEntryListTagEntry> getTagEntry() {
            return this.tagEntry;
        }

        public static final class Builder {
            private java.util.List<TagEntryListTagEntry> tagEntry; 

            /**
             * TagEntry.
             */
            public Builder tagEntry(java.util.List<TagEntryListTagEntry> tagEntry) {
                this.tagEntry = tagEntry;
                return this;
            }

            public SpanTagEntryList build() {
                return new SpanTagEntryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class Span extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("HaveStack")
        private Boolean haveStack;

        @com.aliyun.core.annotation.NameInMap("LogEventList")
        private LogEventList logEventList;

        @com.aliyun.core.annotation.NameInMap("OperationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("ParentSpanId")
        private String parentSpanId;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("RpcId")
        private String rpcId;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SpanId")
        private String spanId;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Long statusCode;

        @com.aliyun.core.annotation.NameInMap("TagEntryList")
        private SpanTagEntryList tagEntryList;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceID")
        private String traceID;

        private Span(Builder builder) {
            this.duration = builder.duration;
            this.haveStack = builder.haveStack;
            this.logEventList = builder.logEventList;
            this.operationName = builder.operationName;
            this.parentSpanId = builder.parentSpanId;
            this.resultCode = builder.resultCode;
            this.rpcId = builder.rpcId;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.spanId = builder.spanId;
            this.statusCode = builder.statusCode;
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
            this.traceID = builder.traceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Span create() {
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
        public LogEventList getLogEventList() {
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
         * @return statusCode
         */
        public Long getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return tagEntryList
         */
        public SpanTagEntryList getTagEntryList() {
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
            private LogEventList logEventList; 
            private String operationName; 
            private String parentSpanId; 
            private String resultCode; 
            private String rpcId; 
            private String serviceIp; 
            private String serviceName; 
            private String spanId; 
            private Long statusCode; 
            private SpanTagEntryList tagEntryList; 
            private Long timestamp; 
            private String traceID; 

            /**
             * <p>The duration of the span. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether the span has child spans. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
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
             * <p>The log events.</p>
             */
            public Builder logEventList(LogEventList logEventList) {
                this.logEventList = logEventList;
                return this;
            }

            /**
             * <p>The name of the span.</p>
             * 
             * <strong>example:</strong>
             * <p>/api</p>
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * <p>The ID of the parent span.</p>
             * 
             * <strong>example:</strong>
             * <p>fec891bb8f8XXX</p>
             */
            public Builder parentSpanId(String parentSpanId) {
                this.parentSpanId = parentSpanId;
                return this;
            }

            /**
             * <p>The response code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The parent-child and sibling relationship between spans. For example, span 1.1 is the parent of span 1.1.1, and span 1.1.2 and span 1.1.1 are siblings.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1</p>
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * <p>The IP address of the server on which the span resides.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XXX.XXX</p>
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>server1</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The span ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fec891bb8f8XXX</p>
             */
            public Builder spanId(String spanId) {
                this.spanId = spanId;
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
             * <p>The tags.</p>
             */
            public Builder tagEntryList(SpanTagEntryList tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * <p>The timestamp when the span was generated. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1689845513298000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The trace ID, which is the unique identifier of the trace.</p>
             * 
             * <strong>example:</strong>
             * <p>1c6881aab84191a4****</p>
             */
            public Builder traceID(String traceID) {
                this.traceID = traceID;
                return this;
            }

            public Span build() {
                return new Span(this);
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
        @com.aliyun.core.annotation.NameInMap("Span")
        private java.util.List<Span> span;

        private Spans(Builder builder) {
            this.span = builder.span;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spans create() {
            return builder().build();
        }

        /**
         * @return span
         */
        public java.util.List<Span> getSpan() {
            return this.span;
        }

        public static final class Builder {
            private java.util.List<Span> span; 

            /**
             * Span.
             */
            public Builder span(java.util.List<Span> span) {
                this.span = span;
                return this;
            }

            public Spans build() {
                return new Spans(this);
            } 

        } 

    }
}
