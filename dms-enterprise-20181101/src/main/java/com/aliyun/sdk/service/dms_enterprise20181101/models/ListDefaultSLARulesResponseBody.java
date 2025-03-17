// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListDefaultSLARulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDefaultSLARulesResponseBody</p>
 */
public class ListDefaultSLARulesResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDefaultSLARulesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.SLARuleList = model.SLARuleList;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3E8AF4C3-A822-53A8-970C-059EE83BBD5A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of SLA rules.</p>
         */
        public Builder SLARuleList(SLARuleList SLARuleList) {
            this.SLARuleList = SLARuleList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDefaultSLARulesResponseBody build() {
            return new ListDefaultSLARulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDefaultSLARulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDefaultSLARulesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SLARule model) {
                this.dagId = model.dagId;
                this.id = model.id;
                this.intervalMinutes = model.intervalMinutes;
                this.nodeId = model.nodeId;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The ID of the SLA rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The timeout period. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * <p>The ID of the task node.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an SLA rule for a task flow</li>
             * <li><strong>1</strong>: an SLA rule for a task node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListDefaultSLARulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDefaultSLARulesResponseBody</p>
     */
    public static class SLARuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SLARule")
        private java.util.List<SLARule> SLARule;

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
        public java.util.List<SLARule> getSLARule() {
            return this.SLARule;
        }

        public static final class Builder {
            private java.util.List<SLARule> SLARule; 

            private Builder() {
            } 

            private Builder(SLARuleList model) {
                this.SLARule = model.SLARule;
            } 

            /**
             * SLARule.
             */
            public Builder SLARule(java.util.List<SLARule> SLARule) {
                this.SLARule = SLARule;
                return this;
            }

            public SLARuleList build() {
                return new SLARuleList(this);
            } 

        } 

    }
}
