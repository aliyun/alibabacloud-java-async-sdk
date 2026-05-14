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
 * {@link DescribeBudgetRequest} extends {@link RequestModel}
 *
 * <p>DescribeBudgetRequest</p>
 */
public class DescribeBudgetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private DescribeBudgetRequest(Builder builder) {
        super(builder);
        this.budgetName = builder.budgetName;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetRequest create() {
        return builder().build();
    }

@Override
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
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    public static final class Builder extends Request.Builder<DescribeBudgetRequest, Builder> {
        private String budgetName; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBudgetRequest request) {
            super(request);
            this.budgetName = request.budgetName;
            this.nbid = request.nbid;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department1</p>
         */
        public Builder budgetName(String budgetName) {
            this.putBodyParameter("BudgetName", budgetName);
            this.budgetName = budgetName;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        @Override
        public DescribeBudgetRequest build() {
            return new DescribeBudgetRequest(this);
        } 

    } 

}
