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
 * {@link CreateBudgetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBudgetResponseBody</p>
 */
public class CreateBudgetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBudgetResponseBody(Builder builder) {
        this.budgetName = builder.budgetName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBudgetResponseBody create() {
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

        private Builder(CreateBudgetResponseBody model) {
            this.budgetName = model.budgetName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The budget name.</p>
         * 
         * <strong>example:</strong>
         * <p>Department_dev_budget</p>
         */
        public Builder budgetName(String budgetName) {
            this.budgetName = budgetName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39EDD65E-68C5-1B17-8440-C729C7591D74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBudgetResponseBody build() {
            return new CreateBudgetResponseBody(this);
        } 

    } 

}
