// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchCreateDcdnWafRulesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateDcdnWafRulesResponseBody</p>
 */
public class BatchCreateDcdnWafRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private RuleIds ruleIds;

    private BatchCreateDcdnWafRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateDcdnWafRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleIds
     */
    public RuleIds getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private String requestId; 
        private RuleIds ruleIds; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of created rules.</p>
         */
        public Builder ruleIds(RuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public BatchCreateDcdnWafRulesResponseBody build() {
            return new BatchCreateDcdnWafRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateDcdnWafRulesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateDcdnWafRulesResponseBody</p>
     */
    public static class RuleIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private java.util.List < String > ruleId;

        private RuleIds(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleIds create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public java.util.List < String > getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List < String > ruleId; 

            /**
             * RuleId.
             */
            public Builder ruleId(java.util.List < String > ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleIds build() {
                return new RuleIds(this);
            } 

        } 

    }
}
