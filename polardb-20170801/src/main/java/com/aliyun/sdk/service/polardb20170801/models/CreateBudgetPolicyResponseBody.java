// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateBudgetPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBudgetPolicyResponseBody</p>
 */
public class CreateBudgetPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BudgetPolicyId")
    private String budgetPolicyId;

    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBudgetPolicyResponseBody(Builder builder) {
        this.budgetPolicyId = builder.budgetPolicyId;
        this.gwClusterId = builder.gwClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBudgetPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budgetPolicyId
     */
    public String getBudgetPolicyId() {
        return this.budgetPolicyId;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String budgetPolicyId; 
        private String gwClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBudgetPolicyResponseBody model) {
            this.budgetPolicyId = model.budgetPolicyId;
            this.gwClusterId = model.gwClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * BudgetPolicyId.
         */
        public Builder budgetPolicyId(String budgetPolicyId) {
            this.budgetPolicyId = budgetPolicyId;
            return this;
        }

        /**
         * GwClusterId.
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBudgetPolicyResponseBody build() {
            return new CreateBudgetPolicyResponseBody(this);
        } 

    } 

}
