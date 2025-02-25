// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned policies.</p>
         */
        public Builder notifyPolicyList(NotifyPolicyList notifyPolicyList) {
            this.notifyPolicyList = notifyPolicyList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6072F026-C441-41A6-B114-35A1E8F8FDD3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBody build() {
            return new DescribeMonitorGroupNotifyPolicyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorGroupNotifyPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupNotifyPolicyListResponseBody</p>
     */
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
             * <p>The end of the time range to query.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1551761781273</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>6780****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The beginning of the time range to query.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1551761781273</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PauseNotify</p>
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
    /**
     * 
     * {@link DescribeMonitorGroupNotifyPolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupNotifyPolicyListResponseBody</p>
     */
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
