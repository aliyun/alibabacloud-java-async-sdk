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
 * {@link DeleteBudgetRequest} extends {@link RequestModel}
 *
 * <p>DeleteBudgetRequest</p>
 */
public class DeleteBudgetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private DeleteBudgetRequest(Builder builder) {
        super(builder);
        this.budgetName = builder.budgetName;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBudgetRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBudgetRequest, Builder> {
        private String budgetName; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBudgetRequest request) {
            super(request);
            this.budgetName = request.budgetName;
            this.nbid = request.nbid;
        } 

        /**
         * <p>The budget name.</p>
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
         * <p>The ID of the primary marketplace. If this parameter is left empty, the marketplace ID of the current user is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2684201000001</p>
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        @Override
        public DeleteBudgetRequest build() {
            return new DeleteBudgetRequest(this);
        } 

    } 

}
