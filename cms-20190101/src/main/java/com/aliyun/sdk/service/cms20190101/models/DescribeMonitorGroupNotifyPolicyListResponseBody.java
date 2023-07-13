// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupNotifyPolicyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupNotifyPolicyListResponseBody</p>
 */
public class DescribeMonitorGroupNotifyPolicyListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("NotifyPolicyList")
    private NotifyPolicyList notifyPolicyList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("Total")
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
         * The ID of the application group.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The policies that were returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The type of the policy.
         * <p>
         * 
         * Valid value: PauseNotify.
         */
        public Builder notifyPolicyList(NotifyPolicyList notifyPolicyList) {
            this.notifyPolicyList = notifyPolicyList;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeMonitorGroupNotifyPolicyList**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The error message.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The timestamp that specifies the beginning of the time range to query.
         * <p>
         * 
         * Unit: milliseconds.
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
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Id")
        private String id;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Type")
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
             * The ID of the policy.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * The ID of the request.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of the application group.
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
        @NameInMap("NotifyPolicy")
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
