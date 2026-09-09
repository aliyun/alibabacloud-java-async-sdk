// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListGroupsForAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsForAuthorizationRuleResponseBody</p>
 */
public class ListGroupsForAuthorizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListGroupsForAuthorizationRuleResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsForAuthorizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Groups> groups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListGroupsForAuthorizationRuleResponseBody model) {
            this.groups = model.groups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of groups.</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is returned for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupsForAuthorizationRuleResponseBody build() {
            return new ListGroupsForAuthorizationRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupsForAuthorizationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForAuthorizationRuleResponseBody</p>
     */
    public static class ValidityPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private ValidityPeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidityPeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(ValidityPeriod model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time of the validity period. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1704042061000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the validity period. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1704042061000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public ValidityPeriod build() {
                return new ValidityPeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGroupsForAuthorizationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForAuthorizationRuleResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
        private ValidityPeriod validityPeriod;

        @com.aliyun.core.annotation.NameInMap("ValidityType")
        private String validityType;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.validityPeriod = builder.validityPeriod;
            this.validityType = builder.validityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return validityPeriod
         */
        public ValidityPeriod getValidityPeriod() {
            return this.validityPeriod;
        }

        /**
         * @return validityType
         */
        public String getValidityType() {
            return this.validityType;
        }

        public static final class Builder {
            private String groupId; 
            private String instanceId; 
            private ValidityPeriod validityPeriod; 
            private String validityType; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
                this.instanceId = model.instanceId;
                this.validityPeriod = model.validityPeriod;
                this.validityType = model.validityType;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time range of the validity period. This parameter takes effect only when <strong>ValidityType</strong> is set to <strong>time_bound</strong>.</p>
             */
            public Builder validityPeriod(ValidityPeriod validityPeriod) {
                this.validityPeriod = validityPeriod;
                return this;
            }

            /**
             * <p>The type of the validity period of the relationship. Valid values:</p>
             * <ul>
             * <li><p>permanent: permanent</p>
             * </li>
             * <li><p>time_bound: custom time range</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>permanent</p>
             */
            public Builder validityType(String validityType) {
                this.validityType = validityType;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
