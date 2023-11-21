// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteMultiAccountSQLQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteMultiAccountSQLQueryRequest</p>
 */
public class ExecuteMultiAccountSQLQueryRequest extends Request {
    @Query
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Query
    @NameInMap("Scope")
    @Validation(required = true)
    private String scope;

    private ExecuteMultiAccountSQLQueryRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMultiAccountSQLQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ExecuteMultiAccountSQLQueryRequest, Builder> {
        private String expression; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteMultiAccountSQLQueryRequest request) {
            super(request);
            this.expression = request.expression;
            this.scope = request.scope;
        } 

        /**
         * The SQL statement to be executed.
         * <p>
         * 
         * The number of characters in the SQL statement must be less than 2,000.
         * 
         * For more information about the SQL syntax, see [Basic SQL syntax](~~2539395~~).
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * The search scope. The value of this parameter can be one of the following items:
         * <p>
         * 
         * *   ID of a resource directory: Resources within the management account and all members of the resource directory are searched.
         * *   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.
         * *   ID of a folder: Resources within all members in the folder are searched.
         * *   ID of a member: Resources within the member are searched.
         * *   ID of a member/ID of a Resource group: Resources within the member in the resource group are searched.
         * 
         * For more information about how to obtain the ID of a resource directory, the Root folder, a folder, a member, or a resource group, see [GetResourceDirectory](~~159995~~), [ListFoldersForParent](~~159997~~), [ListFoldersForParent](~~159997~~), [ListAccounts](~~160016~~), or [ListResourceGroups](~~158855~~).
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ExecuteMultiAccountSQLQueryRequest build() {
            return new ExecuteMultiAccountSQLQueryRequest(this);
        } 

    } 

}
