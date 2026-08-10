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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * EventDesc.
             */
            public Builder eventDesc(String eventDesc) {
                this.eventDesc = eventDesc;
                return this;
            }

            /**
             * EventDescEn.
             */
            public Builder eventDescEn(String eventDescEn) {
                this.eventDescEn = eventDescEn;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelDesc.
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
