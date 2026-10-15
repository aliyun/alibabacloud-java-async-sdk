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
         * <p>The Alibaba Cloud account name or Alibaba Cloud ID to query.</p>
         * <ul>
         * <li>When you enter an account name:<ul>
         * <li>If the organization user is a primary account (for example, main_account), the query account format is the primary account. That is, enter the primary account main_account. </li>
         * <li>If the organization user is a RAM user (for example, <a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a>), the query account format is the prefix of the RAM user. That is, enter zhangsan.</li>
         * </ul>
         * </li>
         * <li>When you enter an Alibaba Cloud ID:<ul>
         * <li>Enter the complete account UID to query the corresponding account information.</li>
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
         * <p>The account name of the primary account when a duplicate error occurs during RAM user query. For example, <a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:zhangsan@test.onaliyun.com">zhangsan@test.onaliyun.com</a></p>
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
