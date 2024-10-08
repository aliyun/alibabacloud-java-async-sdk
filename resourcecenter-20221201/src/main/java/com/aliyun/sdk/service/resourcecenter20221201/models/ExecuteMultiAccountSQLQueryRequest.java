// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteMultiAccountSQLQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteMultiAccountSQLQueryRequest</p>
 */
public class ExecuteMultiAccountSQLQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The SQL statement to be executed.</p>
         * <p>The number of characters in the SQL statement must be less than 2,000.</p>
         * <p>For more information about the SQL syntax, see <a href="~~2539395~~">Basic SQL syntax</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM resources LIMIT 100;</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The search scope. The value of this parameter can be one of the following items:</p>
         * <ul>
         * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</li>
         * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</li>
         * <li>ID of a folder: Resources within all members in the folder are searched.</li>
         * <li>ID of a member: Resources within the member are searched.</li>
         * <li>ID of a member/ID of a Resource group: Resources within the member in the resource group are searched.</li>
         * </ul>
         * <p>For more information about how to obtain the ID of a resource directory, the Root folder, a folder, a member, or a resource group, see <a href="~~159995~~">GetResourceDirectory</a>, <a href="~~159997~~">ListFoldersForParent</a>, <a href="~~159997~~">ListFoldersForParent</a>, <a href="~~160016~~">ListAccounts</a>, or <a href="~~158855~~">ListResourceGroups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-r4****</p>
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
