// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateUserWafRulesetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserWafRulesetResponseBody</p>
 */
public class CreateUserWafRulesetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<Long> ruleIds;

    private CreateUserWafRulesetResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserWafRulesetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ruleIds
     */
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private Long id; 
        private String requestId; 
        private java.util.List<Long> ruleIds; 

        private Builder() {
        } 

        private Builder(CreateUserWafRulesetResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
            this.ruleIds = model.ruleIds;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * RuleIds.
         */
        public Builder ruleIds(java.util.List<Long> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public CreateUserWafRulesetResponseBody build() {
            return new CreateUserWafRulesetResponseBody(this);
        } 

    } 

}
