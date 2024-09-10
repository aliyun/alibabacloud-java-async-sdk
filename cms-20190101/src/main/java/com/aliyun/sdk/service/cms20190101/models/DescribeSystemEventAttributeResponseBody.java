// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventAttributeResponseBody</p>
 */
public class DescribeSystemEventAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SystemEvents")
    private SystemEvents systemEvents;

    private DescribeSystemEventAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.systemEvents = builder.systemEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventAttributeResponseBody create() {
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return systemEvents
     */
    public SystemEvents getSystemEvents() {
        return this.systemEvents;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 
        private SystemEvents systemEvents; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, `success` is returned. If the call fails, an error message is returned.
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
         * Indicates whether the call is successful. Valid values: True: The call is successful. false: The call fails.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The details of the event.
         */
        public Builder systemEvents(SystemEvents systemEvents) {
            this.systemEvents = systemEvents;
            return this;
        }

        public DescribeSystemEventAttributeResponseBody build() {
            return new DescribeSystemEventAttributeResponseBody(this);
        } 

    } 

    public static class SystemEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private SystemEvent(Builder builder) {
            this.content = builder.content;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.level = builder.level;
            this.name = builder.name;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEvent create() {
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String content; 
            private String groupId; 
            private String id; 
            private String instanceName; 
            private String level; 
            private String name; 
            private String product; 
            private String regionId; 
            private String resourceId; 
            private String status; 
            private Long time; 

            /**
             * The details of the event.
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
             * The event ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The level of the event. Valid values:
             * <p>
             * 
             * *   CRITICAL
             * *   WARN
             * *   INFO
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The event name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The abbreviation of the service name.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The status of the event.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the event occurred. The value is a timestamp.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public SystemEvent build() {
                return new SystemEvent(this);
            } 

        } 

    }
    public static class SystemEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemEvent")
        private java.util.List < SystemEvent> systemEvent;

        private SystemEvents(Builder builder) {
            this.systemEvent = builder.systemEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEvents create() {
            return builder().build();
        }

        /**
         * @return systemEvent
         */
        public java.util.List < SystemEvent> getSystemEvent() {
            return this.systemEvent;
        }

        public static final class Builder {
            private java.util.List < SystemEvent> systemEvent; 

            /**
             * SystemEvent.
             */
            public Builder systemEvent(java.util.List < SystemEvent> systemEvent) {
                this.systemEvent = systemEvent;
                return this;
            }

            public SystemEvents build() {
                return new SystemEvents(this);
            } 

        } 

    }
}
