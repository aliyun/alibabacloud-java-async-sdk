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
 * {@link ListAuthorizationRulesForApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizationRulesForApplicationResponseBody</p>
 */
public class ListAuthorizationRulesForApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationRules")
    private java.util.List<AuthorizationRules> authorizationRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthorizationRulesForApplicationResponseBody(Builder builder) {
        this.authorizationRules = builder.authorizationRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationRulesForApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRules
     */
    public java.util.List<AuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
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
        private java.util.List<AuthorizationRules> authorizationRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthorizationRulesForApplicationResponseBody model) {
            this.authorizationRules = model.authorizationRules;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AuthorizationRules.
         */
        public Builder authorizationRules(java.util.List<AuthorizationRules> authorizationRules) {
            this.authorizationRules = authorizationRules;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorizationRulesForApplicationResponseBody build() {
            return new ListAuthorizationRulesForApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizationRulesForApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizationRulesForApplicationResponseBody</p>
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
             * <p>授权生效结束时间。</p>
             * 
             * <strong>example:</strong>
             * <p>1704042061000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>授权生效开始时间。</p>
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
     * {@link ListAuthorizationRulesForApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizationRulesForApplicationResponseBody</p>
     */
    public static class AuthorizationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
        private ValidityPeriod validityPeriod;

        @com.aliyun.core.annotation.NameInMap("ValidityType")
        private String validityType;

        private AuthorizationRules(Builder builder) {
            this.authorizationRuleId = builder.authorizationRuleId;
            this.instanceId = builder.instanceId;
            this.validityPeriod = builder.validityPeriod;
            this.validityType = builder.validityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationRules create() {
            return builder().build();
        }

        /**
         * @return authorizationRuleId
         */
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
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
            private String authorizationRuleId; 
            private String instanceId; 
            private ValidityPeriod validityPeriod; 
            private String validityType; 

            private Builder() {
            } 

            private Builder(AuthorizationRules model) {
                this.authorizationRuleId = model.authorizationRuleId;
                this.instanceId = model.instanceId;
                this.validityPeriod = model.validityPeriod;
                this.validityType = model.validityType;
            } 

            /**
             * <p>授权规则标识。</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>有效周期。</p>
             */
            public Builder validityPeriod(ValidityPeriod validityPeriod) {
                this.validityPeriod = validityPeriod;
                return this;
            }

            /**
             * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
             * 
             * <strong>example:</strong>
             * <p>permanent</p>
             */
            public Builder validityType(String validityType) {
                this.validityType = validityType;
                return this;
            }

            public AuthorizationRules build() {
                return new AuthorizationRules(this);
            } 

        } 

    }
}
