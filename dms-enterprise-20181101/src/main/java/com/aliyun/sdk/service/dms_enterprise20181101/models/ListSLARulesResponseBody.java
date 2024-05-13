// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSLARulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSLARulesResponseBody</p>
 */
public class ListSLARulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SLARuleList")
    private SLARuleList SLARuleList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSLARulesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.SLARuleList = builder.SLARuleList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSLARulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SLARuleList
     */
    public SLARuleList getSLARuleList() {
        return this.SLARuleList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SLARuleList SLARuleList; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of SLA rules.
         */
        public Builder SLARuleList(SLARuleList SLARuleList) {
            this.SLARuleList = SLARuleList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSLARulesResponseBody build() {
            return new ListSLARulesResponseBody(this);
        } 

    } 

    public static class SLARule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IntervalMinutes")
        private Integer intervalMinutes;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private Integer ruleType;

        private SLARule(Builder builder) {
            this.dagId = builder.dagId;
            this.id = builder.id;
            this.intervalMinutes = builder.intervalMinutes;
            this.nodeId = builder.nodeId;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLARule create() {
            return builder().build();
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intervalMinutes
         */
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private Long dagId; 
            private Long id; 
            private Integer intervalMinutes; 
            private Long nodeId; 
            private Integer ruleType; 

            /**
             * The ID of the task flow.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The ID of the SLA rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The timeout period. Unit: minutes.
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * The ID of the task node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **0**: an SLA rule for a task flow
             * *   **1**: an SLA rule for a task node
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public SLARule build() {
                return new SLARule(this);
            } 

        } 

    }
    public static class SLARuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SLARule")
        private java.util.List < SLARule> SLARule;

        private SLARuleList(Builder builder) {
            this.SLARule = builder.SLARule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLARuleList create() {
            return builder().build();
        }

        /**
         * @return SLARule
         */
        public java.util.List < SLARule> getSLARule() {
            return this.SLARule;
        }

        public static final class Builder {
            private java.util.List < SLARule> SLARule; 

            /**
             * SLARule.
             */
            public Builder SLARule(java.util.List < SLARule> SLARule) {
                this.SLARule = SLARule;
                return this;
            }

            public SLARuleList build() {
                return new SLARuleList(this);
            } 

        } 

    }
}
