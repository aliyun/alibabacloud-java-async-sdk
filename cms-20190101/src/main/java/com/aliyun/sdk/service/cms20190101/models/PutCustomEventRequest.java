// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomEventRequest} extends {@link RequestModel}
 *
 * <p>PutCustomEventRequest</p>
 */
public class PutCustomEventRequest extends Request {
    @Query
    @NameInMap("EventInfo")
    @Validation(required = true)
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
         * EventInfo.
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
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("EventName")
        @Validation(required = true)
        private String eventName;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Time")
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
             * The ID of the request.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The time when the custom event occurred.
             * <p>
             * 
             * Format: `yyyyMMddTHHmmss.SSSZ`.
             * 
             * Valid values of N: 1 to 50.
             * 
             * >  You can also specify a UNIX timestamp. Example: 1552199984000. Unit: milliseconds.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The content of the custom event. Valid values of N: 1 to 50.
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
