// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link ListApplicationRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationRequest</p>
 */
public class ListApplicationRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppFilter")
    private String appFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppNameSearchKeyword")
    private String appNameSearchKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CorpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String corpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private ListApplicationRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appFilter = builder.appFilter;
        this.appNameSearchKeyword = builder.appNameSearchKeyword;
        this.corpId = builder.corpId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return appFilter
     */
    public String getAppFilter() {
        return this.appFilter;
    }

    /**
     * @return appNameSearchKeyword
     */
    public String getAppNameSearchKeyword() {
        return this.appNameSearchKeyword;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<ListApplicationRequest, Builder> {
        private AccountContext accountContext; 
        private String appFilter; 
        private String appNameSearchKeyword; 
        private String corpId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appFilter = request.appFilter;
            this.appNameSearchKeyword = request.appNameSearchKeyword;
            this.corpId = request.corpId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.token = request.token;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * AppFilter.
         */
        public Builder appFilter(String appFilter) {
            this.putBodyParameter("AppFilter", appFilter);
            this.appFilter = appFilter;
            return this;
        }

        /**
         * AppNameSearchKeyword.
         */
        public Builder appNameSearchKeyword(String appNameSearchKeyword) {
            this.putBodyParameter("AppNameSearchKeyword", appNameSearchKeyword);
            this.appNameSearchKeyword = appNameSearchKeyword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>corpid</p>
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public ListApplicationRequest build() {
            return new ListApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationRequest} extends {@link TeaModel}
     *
     * <p>ListApplicationRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
