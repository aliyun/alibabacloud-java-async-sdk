// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomEventAttributeResponseBody</p>
 */
public class DescribeCustomEventAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CustomEvents")
    private CustomEvents customEvents;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeCustomEventAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.customEvents = builder.customEvents;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return customEvents
     */
    public CustomEvents getCustomEvents() {
        return this.customEvents;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private CustomEvents customEvents; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the custom event.
         */
        public Builder customEvents(CustomEvents customEvents) {
            this.customEvents = customEvents;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCustomEventAttributeResponseBody build() {
            return new DescribeCustomEventAttributeResponseBody(this);
        } 

    } 

    public static class CustomEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private CustomEvent(Builder builder) {
            this.content = builder.content;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEvent create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String content; 
            private String groupId; 
            private String id; 
            private String name; 
            private String time; 

            /**
             * The content of the custom event.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the custom event.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the custom event.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time when the custom event occurred.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public CustomEvent build() {
                return new CustomEvent(this);
            } 

        } 

    }
    public static class CustomEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomEvent")
        private java.util.List < CustomEvent> customEvent;

        private CustomEvents(Builder builder) {
            this.customEvent = builder.customEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEvents create() {
            return builder().build();
        }

        /**
         * @return customEvent
         */
        public java.util.List < CustomEvent> getCustomEvent() {
            return this.customEvent;
        }

        public static final class Builder {
            private java.util.List < CustomEvent> customEvent; 

            /**
             * CustomEvent.
             */
            public Builder customEvent(java.util.List < CustomEvent> customEvent) {
                this.customEvent = customEvent;
                return this;
            }

            public CustomEvents build() {
                return new CustomEvents(this);
            } 

        } 

    }
}
