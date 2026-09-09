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
 * {@link CheckBudgetNameExistsResponseBody} extends {@link TeaModel}
 *
 * <p>CheckBudgetNameExistsResponseBody</p>
 */
public class CheckBudgetNameExistsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.NameInMap("Exists")
    private Boolean exists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckBudgetNameExistsResponseBody(Builder builder) {
        this.budgetName = builder.budgetName;
        this.exists = builder.exists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBudgetNameExistsResponseBody create() {
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
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String budgetName; 
        private Boolean exists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckBudgetNameExistsResponseBody model) {
            this.budgetName = model.budgetName;
            this.exists = model.exists;
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
         * <p>Indicates whether the budget name already exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F1E2D3C4-B5A6-7890-1234-567890ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckBudgetNameExistsResponseBody build() {
            return new CheckBudgetNameExistsResponseBody(this);
        } 

    } 

}
