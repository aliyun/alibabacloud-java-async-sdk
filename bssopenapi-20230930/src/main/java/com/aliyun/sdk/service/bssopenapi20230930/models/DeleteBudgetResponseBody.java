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
 * {@link DeleteBudgetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBudgetResponseBody</p>
 */
public class DeleteBudgetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteBudgetResponseBody(Builder builder) {
        this.budgetName = builder.budgetName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBudgetResponseBody create() {
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

        private Builder(DeleteBudgetResponseBody model) {
            this.budgetName = model.budgetName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The budget name.</p>
         * 
         * <strong>example:</strong>
         * <p>department1</p>
         */
        public Builder budgetName(String budgetName) {
            this.budgetName = budgetName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7EA6C02D-06D0-4213-9C3B-E67910F7D1EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBudgetResponseBody build() {
            return new DeleteBudgetResponseBody(this);
        } 

    } 

}
