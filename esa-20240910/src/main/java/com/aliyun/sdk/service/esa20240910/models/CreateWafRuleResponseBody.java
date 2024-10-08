// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWafRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWafRuleResponseBody</p>
 */
public class CreateWafRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RulesetId")
    private Long rulesetId;

    private CreateWafRuleResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.rulesetId = builder.rulesetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWafRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
        private Long id; 
        private String requestId; 
        private Long rulesetId; 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RulesetId.
         */
        public Builder rulesetId(Long rulesetId) {
            this.rulesetId = rulesetId;
            return this;
        }

        public CreateWafRuleResponseBody build() {
            return new CreateWafRuleResponseBody(this);
        } 

    } 

}
