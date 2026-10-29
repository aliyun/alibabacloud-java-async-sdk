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
 * {@link DescribeSystemEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventCountResponseBody</p>
 */
public class DescribeSystemEventCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SystemEventCounts")
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

        private Builder() {
        } 

        private Builder(DescribeSystemEventCountResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.systemEventCounts = model.systemEventCounts;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A value of 200 indicates success.</p>
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
         * <p>The returned message.</p>
         * <p>If the request is successful, a success message is returned. If the request fails, the failure reason is returned.</p>
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
         * <p>C7A7B776-0ACE-5A93-9B07-DE8008D9CCDF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation is successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * SystemEventCounts.
         */
        public Builder systemEventCounts(SystemEventCounts systemEventCounts) {
            this.systemEventCounts = systemEventCounts;
            return this;
        }

        public DescribeSystemEventCountResponseBody build() {
            return new DescribeSystemEventCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSystemEventCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventCountResponseBody</p>
     */
    public static class SystemEventCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

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

            private Builder() {
            } 

            private Builder(SystemEventCount model) {
                this.content = model.content;
                this.groupId = model.groupId;
                this.instanceName = model.instanceName;
                this.level = model.level;
                this.name = model.name;
                this.num = model.num;
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
             * Num.
             */
            public Builder num(Long num) {
                this.num = num;
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

            public SystemEventCount build() {
                return new SystemEventCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSystemEventCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventCountResponseBody</p>
     */
    public static class SystemEventCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemEventCount")
        private java.util.List<SystemEventCount> systemEventCount;

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
        public java.util.List<SystemEventCount> getSystemEventCount() {
            return this.systemEventCount;
        }

        public static final class Builder {
            private java.util.List<SystemEventCount> systemEventCount; 

            private Builder() {
            } 

            private Builder(SystemEventCounts model) {
                this.systemEventCount = model.systemEventCount;
            } 

            /**
             * SystemEventCount.
             */
            public Builder systemEventCount(java.util.List<SystemEventCount> systemEventCount) {
                this.systemEventCount = systemEventCount;
                return this;
            }

            public SystemEventCounts build() {
                return new SystemEventCounts(this);
            } 

        } 

    }
}
