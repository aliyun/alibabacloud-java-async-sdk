// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainCcActivityLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCcActivityLogResponseBody</p>
 */
public class DescribeDomainCcActivityLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivityLog")
    private java.util.List < ActivityLog> activityLog;

    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Long pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeDomainCcActivityLogResponseBody(Builder builder) {
        this.activityLog = builder.activityLog;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCcActivityLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return activityLog
     */
    public java.util.List < ActivityLog> getActivityLog() {
        return this.activityLog;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < ActivityLog> activityLog; 
        private Long pageIndex; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The list of rate limiting logs.</p>
         */
        public Builder activityLog(java.util.List < ActivityLog> activityLog) {
            this.activityLog = activityLog;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDomainCcActivityLogResponseBody build() {
            return new DescribeDomainCcActivityLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainCcActivityLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainCcActivityLogResponseBody</p>
     */
    public static class ActivityLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TriggerObject")
        private String triggerObject;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Long ttl;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ActivityLog(Builder builder) {
            this.action = builder.action;
            this.domainName = builder.domainName;
            this.ruleName = builder.ruleName;
            this.timeStamp = builder.timeStamp;
            this.triggerObject = builder.triggerObject;
            this.ttl = builder.ttl;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityLog create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return triggerObject
         */
        public String getTriggerObject() {
            return this.triggerObject;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String action; 
            private String domainName; 
            private String ruleName; 
            private String timeStamp; 
            private String triggerObject; 
            private Long ttl; 
            private String value; 

            /**
             * <p>The action that was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The name of the rule based on which rate limiting was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The trigger of rate limiting.</p>
             * 
             * <strong>example:</strong>
             * <p>Ip</p>
             */
            public Builder triggerObject(String triggerObject) {
                this.triggerObject = triggerObject;
                return this;
            }

            /**
             * <p>The period of time during which rate limiting remains effective.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The value of the trigger for rate limiting.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.3.4</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ActivityLog build() {
                return new ActivityLog(this);
            } 

        } 

    }
}
