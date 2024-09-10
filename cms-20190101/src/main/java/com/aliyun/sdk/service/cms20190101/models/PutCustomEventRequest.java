// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomEventRequest} extends {@link RequestModel}
 *
 * <p>PutCustomEventRequest</p>
 */
public class PutCustomEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < EventInfo> eventInfo;

    private PutCustomEventRequest(Builder builder) {
        super(builder);
        this.eventInfo = builder.eventInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventInfo
     */
    public java.util.List < EventInfo> getEventInfo() {
        return this.eventInfo;
    }

    public static final class Builder extends Request.Builder<PutCustomEventRequest, Builder> {
        private java.util.List < EventInfo> eventInfo; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomEventRequest request) {
            super(request);
            this.eventInfo = request.eventInfo;
        } 

        /**
         * The event details.
         */
        public Builder eventInfo(java.util.List < EventInfo> eventInfo) {
            this.putQueryParameter("EventInfo", eventInfo);
            this.eventInfo = eventInfo;
            return this;
        }

        @Override
        public PutCustomEventRequest build() {
            return new PutCustomEventRequest(this);
        } 

    } 

    public static class EventInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("EventName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private EventInfo(Builder builder) {
            this.content = builder.content;
            this.eventName = builder.eventName;
            this.groupId = builder.groupId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String content; 
            private String eventName; 
            private String groupId; 
            private String time; 

            /**
             * The event content. Valid values of N: 1 to 50.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The event name. Valid values of N: 1 to 50.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The ID of the application group. Valid values of N: 1 to 50.
             * <p>
             * 
             * Default value: 0. This value indicates that the event to be reported does not belong to any application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The time when the event occurred.
             * <p>
             * 
             * Format: `yyyyMMddTHHmmss.SSSZ`.
             * 
             * Valid values of N: 1 to 50.
             * 
             * >  You can also specify a UNIX timestamp. Example: 1552199984000. Unit: milliseconds.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public EventInfo build() {
                return new EventInfo(this);
            } 

        } 

    }
}
