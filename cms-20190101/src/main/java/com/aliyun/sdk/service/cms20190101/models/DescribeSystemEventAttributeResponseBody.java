// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSystemEventAttributeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.systemEvents = model.systemEvents;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A value of 200 indicates that the call was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message. If the call is successful, <code>success</code> is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * SystemEvents.
         */
        public Builder systemEvents(SystemEvents systemEvents) {
            this.systemEvents = systemEvents;
            return this;
        }

        public DescribeSystemEventAttributeResponseBody build() {
            return new DescribeSystemEventAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSystemEventAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SystemEvent model) {
                this.content = model.content;
                this.groupId = model.groupId;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.level = model.level;
                this.name = model.name;
                this.product = model.product;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.status = model.status;
                this.time = model.time;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
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
             * Time.
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
    /**
     * 
     * {@link DescribeSystemEventAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventAttributeResponseBody</p>
     */
    public static class SystemEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemEvent")
        private java.util.List<SystemEvent> systemEvent;

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
        public java.util.List<SystemEvent> getSystemEvent() {
            return this.systemEvent;
        }

        public static final class Builder {
            private java.util.List<SystemEvent> systemEvent; 

            private Builder() {
            } 

            private Builder(SystemEvents model) {
                this.systemEvent = model.systemEvent;
            } 

            /**
             * SystemEvent.
             */
            public Builder systemEvent(java.util.List<SystemEvent> systemEvent) {
                this.systemEvent = systemEvent;
                return this;
            }

            public SystemEvents build() {
                return new SystemEvents(this);
            } 

        } 

    }
}
