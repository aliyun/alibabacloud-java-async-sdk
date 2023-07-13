// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventCountResponseBody</p>
 */
public class DescribeSystemEventCountResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("SystemEventCounts")
    private SystemEventCounts systemEventCounts;

    private DescribeSystemEventCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.systemEventCounts = builder.systemEventCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventCountResponseBody create() {
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
     * @return systemEventCounts
     */
    public SystemEventCounts getSystemEventCounts() {
        return this.systemEventCounts;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 
        private SystemEventCounts systemEventCounts; 

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
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
         * The details of the system event.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the system event.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The timestamp when the system event occurred. Unit: milliseconds.
         */
        public Builder systemEventCounts(SystemEventCounts systemEventCounts) {
            this.systemEventCounts = systemEventCounts;
            return this;
        }

        public DescribeSystemEventCountResponseBody build() {
            return new DescribeSystemEventCountResponseBody(this);
        } 

    } 

    public static class SystemEventCount extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Level")
        private String level;

        @NameInMap("Name")
        private String name;

        @NameInMap("Num")
        private Long num;

        @NameInMap("Product")
        private String product;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Time")
        private Long time;

        private SystemEventCount(Builder builder) {
            this.content = builder.content;
            this.groupId = builder.groupId;
            this.instanceName = builder.instanceName;
            this.level = builder.level;
            this.name = builder.name;
            this.num = builder.num;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEventCount create() {
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
         * @return num
         */
        public Long getNum() {
            return this.num;
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
            private String instanceName; 
            private String level; 
            private String name; 
            private Long num; 
            private String product; 
            private String regionId; 
            private String resourceId; 
            private String status; 
            private Long time; 

            /**
             * The ID of the region.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * This topic provides an example on how to query the number of times that a system event occurred for Elastic Compute Service (`ECS`). The returned result indicates that the number of times that the specified system event occurred is 3.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The level of the system event. Valid values:
             * <p>
             * 
             * *   Critical
             * *   Warn
             * *   Info
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the system event.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * The number of times that the system event occurred.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The description of the system event.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the cloud service in which the system event occurred.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public SystemEventCount build() {
                return new SystemEventCount(this);
            } 

        } 

    }
    public static class SystemEventCounts extends TeaModel {
        @NameInMap("SystemEventCount")
        private java.util.List < SystemEventCount> systemEventCount;

        private SystemEventCounts(Builder builder) {
            this.systemEventCount = builder.systemEventCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEventCounts create() {
            return builder().build();
        }

        /**
         * @return systemEventCount
         */
        public java.util.List < SystemEventCount> getSystemEventCount() {
            return this.systemEventCount;
        }

        public static final class Builder {
            private java.util.List < SystemEventCount> systemEventCount; 

            /**
             * SystemEventCount.
             */
            public Builder systemEventCount(java.util.List < SystemEventCount> systemEventCount) {
                this.systemEventCount = systemEventCount;
                return this;
            }

            public SystemEventCounts build() {
                return new SystemEventCounts(this);
            } 

        } 

    }
}
