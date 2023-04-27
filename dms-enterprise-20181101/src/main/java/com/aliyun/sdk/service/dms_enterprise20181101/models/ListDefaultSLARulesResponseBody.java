// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDefaultSLARulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDefaultSLARulesResponseBody</p>
 */
public class ListDefaultSLARulesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SLARuleList")
    private SLARuleList SLARuleList;

    @NameInMap("Success")
    private Boolean success;

    private ListDefaultSLARulesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.SLARuleList = builder.SLARuleList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDefaultSLARulesResponseBody create() {
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * SLARuleList.
         */
        public Builder SLARuleList(SLARuleList SLARuleList) {
            this.SLARuleList = SLARuleList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDefaultSLARulesResponseBody build() {
            return new ListDefaultSLARulesResponseBody(this);
        } 

    } 

    public static class SLARule extends TeaModel {
        @NameInMap("DagId")
        private Long dagId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IntervalMinutes")
        private Integer intervalMinutes;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("RuleType")
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
             * DagId.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IntervalMinutes.
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * RuleType.
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
        @NameInMap("SLARule")
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
