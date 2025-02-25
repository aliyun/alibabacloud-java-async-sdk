// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceByConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceByConfigurationResponseBody</p>
 */
public class DescribeTraceByConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Traces")
    private java.util.List < Traces> traces;

    private DescribeTraceByConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.traces = builder.traces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceByConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traces
     */
    public java.util.List < Traces> getTraces() {
        return this.traces;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Traces> traces; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Traces.
         */
        public Builder traces(java.util.List < Traces> traces) {
            this.traces = traces;
            return this;
        }

        public DescribeTraceByConfigurationResponseBody build() {
            return new DescribeTraceByConfigurationResponseBody(this);
        } 

    } 

    public static class EventDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("HandleIp")
        private String handleIp;

        @com.aliyun.core.annotation.NameInMap("LogDate")
        private String logDate;

        @com.aliyun.core.annotation.NameInMap("RequestIp")
        private String requestIp;

        @com.aliyun.core.annotation.NameInMap("ResponseIp")
        private String responseIp;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private String ts;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EventDetails(Builder builder) {
            this.dataId = builder.dataId;
            this.delay = builder.delay;
            this.event = builder.event;
            this.ext = builder.ext;
            this.group = builder.group;
            this.handleIp = builder.handleIp;
            this.logDate = builder.logDate;
            this.requestIp = builder.requestIp;
            this.responseIp = builder.responseIp;
            this.ts = builder.ts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventDetails create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return handleIp
         */
        public String getHandleIp() {
            return this.handleIp;
        }

        /**
         * @return logDate
         */
        public String getLogDate() {
            return this.logDate;
        }

        /**
         * @return requestIp
         */
        public String getRequestIp() {
            return this.requestIp;
        }

        /**
         * @return responseIp
         */
        public String getResponseIp() {
            return this.responseIp;
        }

        /**
         * @return ts
         */
        public String getTs() {
            return this.ts;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String dataId; 
            private String delay; 
            private String event; 
            private String ext; 
            private String group; 
            private String handleIp; 
            private String logDate; 
            private String requestIp; 
            private String responseIp; 
            private String ts; 
            private String type; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * HandleIp.
             */
            public Builder handleIp(String handleIp) {
                this.handleIp = handleIp;
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
             * RequestIp.
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * ResponseIp.
             */
            public Builder responseIp(String responseIp) {
                this.responseIp = responseIp;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(String ts) {
                this.ts = ts;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventDetails build() {
                return new EventDetails(this);
            } 

        } 

    }
    public static class EventGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDetails")
        private java.util.List < EventDetails> eventDetails;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private EventGroups(Builder builder) {
            this.eventDetails = builder.eventDetails;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventGroups create() {
            return builder().build();
        }

        /**
         * @return eventDetails
         */
        public java.util.List < EventDetails> getEventDetails() {
            return this.eventDetails;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private java.util.List < EventDetails> eventDetails; 
            private String eventType; 

            /**
             * EventDetails.
             */
            public Builder eventDetails(java.util.List < EventDetails> eventDetails) {
                this.eventDetails = eventDetails;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public EventGroups build() {
                return new EventGroups(this);
            } 

        } 

    }
    public static class Traces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventGroups")
        private java.util.List < EventGroups> eventGroups;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Traces(Builder builder) {
            this.eventGroups = builder.eventGroups;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traces create() {
            return builder().build();
        }

        /**
         * @return eventGroups
         */
        public java.util.List < EventGroups> getEventGroups() {
            return this.eventGroups;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private java.util.List < EventGroups> eventGroups; 
            private Long timestamp; 

            /**
             * EventGroups.
             */
            public Builder eventGroups(java.util.List < EventGroups> eventGroups) {
                this.eventGroups = eventGroups;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Traces build() {
                return new Traces(this);
            } 

        } 

    }
}
