// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainCcActivityLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainCcActivityLogResponseBody</p>
 */
public class DescribeDcdnDomainCcActivityLogResponseBody extends TeaModel {
    @NameInMap("ActivityLog")
    private java.util.List < ActivityLog> activityLog;

    @NameInMap("PageIndex")
    private Long pageIndex;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeDcdnDomainCcActivityLogResponseBody(Builder builder) {
        this.activityLog = builder.activityLog;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainCcActivityLogResponseBody create() {
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
         * The log data of the event that triggered rate limiting.
         */
        public Builder activityLog(java.util.List < ActivityLog> activityLog) {
            this.activityLog = activityLog;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDcdnDomainCcActivityLogResponseBody build() {
            return new DescribeDcdnDomainCcActivityLogResponseBody(this);
        } 

    } 

    public static class ActivityLog extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("TriggerObject")
        private String triggerObject;

        @NameInMap("Ttl")
        private Long ttl;

        @NameInMap("Value")
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
             * The action that was triggered.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The accelerated domain name whose ICP filing status you want to update.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The name of the rule that was triggered.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The object that triggered the blocking event.
             */
            public Builder triggerObject(String triggerObject) {
                this.triggerObject = triggerObject;
                return this;
            }

            /**
             * The period of time during which rate limiting remains effective.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * The value of the trigger for rate limiting.
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
