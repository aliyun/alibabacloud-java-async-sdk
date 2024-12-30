// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryUserInfoByAccountRequest} extends {@link RequestModel}
 *
 * <p>QueryUserInfoByAccountRequest</p>
 */
public class QueryUserInfoByAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentAccountName")
    private String parentAccountName;

    private QueryUserInfoByAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.parentAccountName = builder.parentAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserInfoByAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return parentAccountName
     */
    public String getParentAccountName() {
        return this.parentAccountName;
    }

    public static final class Builder extends Request.Builder<QueryUserInfoByAccountRequest, Builder> {
        private String account; 
        private String parentAccountName; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserInfoByAccountRequest request) {
            super(request);
            this.account = request.account;
            this.parentAccountName = request.parentAccountName;
        } 

        /**
         * <p>Enter the name or ID of the Alibaba Cloud account that you want to query.</p>
         * <ul>
         * <li><p>When you enter an account name:</p>
         * <ul>
         * <li>If the organization user is a master account, such as main_account, the query account format is master account. That is, the main account main_account to be entered.</li>
         * <li>If the organization user is a RAM user, such as a <a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a>, the query account format is the head of the RAM user, that is, the RAM user to be entered is zhangsan.</li>
         * </ul>
         * </li>
         * <li><p>ID：</p>
         * <ul>
         * <li>Enter the UID of the account to query the account information.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * ParentAccountName.
         */
        public Builder parentAccountName(String parentAccountName) {
            this.putQueryParameter("ParentAccountName", parentAccountName);
            this.parentAccountName = parentAccountName;
            return this;
        }

        @Override
        public QueryUserInfoByAccountRequest build() {
            return new QueryUserInfoByAccountRequest(this);
        } 

    } 

}
