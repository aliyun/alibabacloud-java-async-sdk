// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchCreateWafRulesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateWafRulesResponseBody</p>
 */
public class BatchCreateWafRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List < Long > ids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RulesetId")
    private Long rulesetId;

    private BatchCreateWafRulesResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
        this.rulesetId = builder.rulesetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateWafRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ids
     */
    public java.util.List < Long > getIds() {
        return this.ids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rulesetId
     */
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public static final class Builder {
        private java.util.List < Long > ids; 
        private String requestId; 
        private Long rulesetId; 

        /**
         * <p>The IDs of the WAF rules.<a href="~~2850237~~"></a></p>
         */
        public Builder ids(java.util.List < Long > ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the WAF ruleset.<a href="~~2850233~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder rulesetId(Long rulesetId) {
            this.rulesetId = rulesetId;
            return this;
        }

        public BatchCreateWafRulesResponseBody build() {
            return new BatchCreateWafRulesResponseBody(this);
        } 

    } 

}
