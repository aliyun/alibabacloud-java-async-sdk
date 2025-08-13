// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DeepCopyRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeepCopyRuleResponseBody</p>
 */
public class DeepCopyRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DeepCopyRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeepCopyRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DeepCopyRuleResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DeepCopyRuleResponseBody build() {
            return new DeepCopyRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeepCopyRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DeepCopyRuleResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchCopyFlag")
        private Boolean batchCopyFlag;

        @com.aliyun.core.annotation.NameInMap("ConsoleRuleId")
        private Long consoleRuleId;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleVersionId")
        private Long ruleVersionId;

        private ResultObject(Builder builder) {
            this.batchCopyFlag = builder.batchCopyFlag;
            this.consoleRuleId = builder.consoleRuleId;
            this.ruleId = builder.ruleId;
            this.ruleVersionId = builder.ruleVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return batchCopyFlag
         */
        public Boolean getBatchCopyFlag() {
            return this.batchCopyFlag;
        }

        /**
         * @return consoleRuleId
         */
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleVersionId
         */
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public static final class Builder {
            private Boolean batchCopyFlag; 
            private Long consoleRuleId; 
            private String ruleId; 
            private Long ruleVersionId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.batchCopyFlag = model.batchCopyFlag;
                this.consoleRuleId = model.consoleRuleId;
                this.ruleId = model.ruleId;
                this.ruleVersionId = model.ruleVersionId;
            } 

            /**
             * <p>Whether to redirect to details</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder batchCopyFlag(Boolean batchCopyFlag) {
                this.batchCopyFlag = batchCopyFlag;
                return this;
            }

            /**
             * <p>Primary key of the policy</p>
             * 
             * <strong>example:</strong>
             * <p>2346</p>
             */
            public Builder consoleRuleId(Long consoleRuleId) {
                this.consoleRuleId = consoleRuleId;
                return this;
            }

            /**
             * <p>Policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>104556</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Primary key of the policy version</p>
             * 
             * <strong>example:</strong>
             * <p>1135</p>
             */
            public Builder ruleVersionId(Long ruleVersionId) {
                this.ruleVersionId = ruleVersionId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
