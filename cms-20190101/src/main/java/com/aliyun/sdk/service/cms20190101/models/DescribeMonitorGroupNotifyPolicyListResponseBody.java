// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupNotifyPolicyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupNotifyPolicyListResponseBody</p>
 */
public class DescribeMonitorGroupNotifyPolicyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NotifyPolicyList")
    private NotifyPolicyList notifyPolicyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeMonitorGroupNotifyPolicyListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.notifyPolicyList = builder.notifyPolicyList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupNotifyPolicyListResponseBody create() {
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
     * @return notifyPolicyList
     */
    public NotifyPolicyList getNotifyPolicyList() {
        return this.notifyPolicyList;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private NotifyPolicyList notifyPolicyList; 
        private String requestId; 
        private String success; 
        private Integer total; 

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned policies.
         */
        public Builder notifyPolicyList(NotifyPolicyList notifyPolicyList) {
            this.notifyPolicyList = notifyPolicyList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBody build() {
            return new DescribeMonitorGroupNotifyPolicyListResponseBody(this);
        } 

    } 

    public static class NotifyPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NotifyPolicy(Builder builder) {
            this.endTime = builder.endTime;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyPolicy create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long endTime; 
            private String groupId; 
            private String id; 
            private Long startTime; 
            private String type; 

            /**
             * The end of the time range to query.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * The policy ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The beginning of the time range to query.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The policy type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NotifyPolicy build() {
                return new NotifyPolicy(this);
            } 

        } 

    }
    public static class NotifyPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyPolicy")
        private java.util.List < NotifyPolicy> notifyPolicy;

        private NotifyPolicyList(Builder builder) {
            this.notifyPolicy = builder.notifyPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyPolicyList create() {
            return builder().build();
        }

        /**
         * @return notifyPolicy
         */
        public java.util.List < NotifyPolicy> getNotifyPolicy() {
            return this.notifyPolicy;
        }

        public static final class Builder {
            private java.util.List < NotifyPolicy> notifyPolicy; 

            /**
             * NotifyPolicy.
             */
            public Builder notifyPolicy(java.util.List < NotifyPolicy> notifyPolicy) {
                this.notifyPolicy = notifyPolicy;
                return this;
            }

            public NotifyPolicyList build() {
                return new NotifyPolicyList(this);
            } 

        } 

    }
}
