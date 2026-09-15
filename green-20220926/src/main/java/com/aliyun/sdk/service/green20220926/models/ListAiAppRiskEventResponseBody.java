// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListAiAppRiskEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListAiAppRiskEventResponseBody</p>
 */
public class ListAiAppRiskEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAiAppRiskEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiAppRiskEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAiAppRiskEventResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID assigned by the backend that uniquely identifies a request. This ID can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAiAppRiskEventResponseBody build() {
            return new ListAiAppRiskEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAiAppRiskEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppRiskEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventDesc")
        private String eventDesc;

        @com.aliyun.core.annotation.NameInMap("EventDescEn")
        private String eventDescEn;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelDesc")
        private String labelDesc;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.eventCode = builder.eventCode;
            this.eventDesc = builder.eventDesc;
            this.eventDescEn = builder.eventDescEn;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.label = builder.label;
            this.labelDesc = builder.labelDesc;
            this.level = builder.level;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventDesc
         */
        public String getEventDesc() {
            return this.eventDesc;
        }

        /**
         * @return eventDescEn
         */
        public String getEventDescEn() {
            return this.eventDescEn;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelDesc
         */
        public String getLabelDesc() {
            return this.labelDesc;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endTime; 
            private String eventCode; 
            private String eventDesc; 
            private String eventDescEn; 
            private String eventId; 
            private String eventName; 
            private String label; 
            private String labelDesc; 
            private String level; 
            private String startTime; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.eventCode = model.eventCode;
                this.eventDesc = model.eventDesc;
                this.eventDescEn = model.eventDescEn;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.label = model.label;
                this.labelDesc = model.labelDesc;
                this.level = model.level;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-25 10:22:02</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The event code that identifies the type or category of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>hit-xxxx</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The event description that provides details about the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>desc-xxx</p>
             */
            public Builder eventDesc(String eventDesc) {
                this.eventDesc = eventDesc;
                return this;
            }

            /**
             * <p>The event description in English.</p>
             * 
             * <strong>example:</strong>
             * <p>desc-xxx</p>
             */
            public Builder eventDescEn(String eventDescEn) {
                this.eventDescEn = eventDescEn;
                return this;
            }

            /**
             * <p>The event ID that uniquely identifies a risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>id-xxx</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event name that briefly describes the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>name-xxx</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The label used to mark or categorize the event.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The label description that provides details about the label.</p>
             * 
             * <strong>example:</strong>
             * <p>desc-xxx</p>
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * <p>The risk level that indicates the severity of the event, such as high, medium, or low.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The effective period. Format: YYYY-MM-DD HH:mm:ss (default time zone: UTC+08:00).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-22 16:41:15</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The event status that indicates the current processing state of the event, such as pending or resolved.</p>
             * 
             * <strong>example:</strong>
             * <p>resovled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The event type that indicates the category of the risk event, such as security or performance.</p>
             * 
             * <strong>example:</strong>
             * <p>sensitiveData</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
