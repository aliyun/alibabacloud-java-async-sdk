// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link UpdateBudgetResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBudgetResponseBody</p>
 */
public class UpdateBudgetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateBudgetResponseBody(Builder builder) {
        this.budgetName = builder.budgetName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBudgetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budgetName
     */
    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String budgetName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateBudgetResponseBody model) {
            this.budgetName = model.budgetName;
            this.requestId = model.requestId;
        } 

        /**
         * BudgetName.
         */
        public Builder budgetName(String budgetName) {
            this.budgetName = budgetName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBudgetResponseBody build() {
            return new UpdateBudgetResponseBody(this);
        } 

    } 

}
