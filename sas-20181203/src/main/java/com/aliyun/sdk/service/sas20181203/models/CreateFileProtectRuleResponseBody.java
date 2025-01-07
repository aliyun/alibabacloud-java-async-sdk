// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateFileProtectRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileProtectRuleResponseBody</p>
 */
public class CreateFileProtectRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private CreateFileProtectRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileProtectRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private String requestId; 
        private Long ruleId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC7C8984-D108-516F-9D36-3DF1D1228CCA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public CreateFileProtectRuleResponseBody build() {
            return new CreateFileProtectRuleResponseBody(this);
        } 

    } 

}
