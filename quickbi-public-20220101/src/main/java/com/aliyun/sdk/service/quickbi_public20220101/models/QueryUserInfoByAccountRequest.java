// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserInfoByAccountRequest} extends {@link RequestModel}
 *
 * <p>QueryUserInfoByAccountRequest</p>
 */
public class QueryUserInfoByAccountRequest extends Request {
    @Query
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Query
    @NameInMap("ParentAccountName")
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
         * Enter the name or ID of the Alibaba Cloud account that you want to query.
         * <p>
         * 
         * *   When you enter an account name:
         * 
         *     *   If the organization user is a master account, such as main_account, the query account format is master account. That is, the main account main_account to be entered.
         *     *   If the organization user is a RAM user, such as a <zhangsan@test.onaliyun.com>, the query account format is the head of the RAM user, that is, the RAM user to be entered is zhangsan.
         * 
         * *   ID：
         * 
         *     *   Enter the UID of the account to query the account information.
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
