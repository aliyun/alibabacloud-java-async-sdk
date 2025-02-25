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
 * {@link GetTaskCopiesRequest} extends {@link RequestModel}
 *
 * <p>GetTaskCopiesRequest</p>
 */
public class GetTaskCopiesRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateFromTimeGMT")
    private Long createFromTimeGMT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateToTimeGMT")
    private Long createToTimeGMT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessCodes")
    private String processCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemToken;

    private GetTaskCopiesRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.createFromTimeGMT = builder.createFromTimeGMT;
        this.createToTimeGMT = builder.createToTimeGMT;
        this.keyword = builder.keyword;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processCodes = builder.processCodes;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskCopiesRequest create() {
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return createFromTimeGMT
     */
    public Long getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    /**
     * @return createToTimeGMT
     */
    public Long getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return processCodes
     */
    public String getProcessCodes() {
        return this.processCodes;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<GetTaskCopiesRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private Long createFromTimeGMT; 
        private Long createToTimeGMT; 
        private String keyword; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processCodes; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskCopiesRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.createFromTimeGMT = request.createFromTimeGMT;
            this.createToTimeGMT = request.createToTimeGMT;
            this.keyword = request.keyword;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processCodes = request.processCodes;
            this.systemToken = request.systemToken;
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
         * AppType.
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * CreateFromTimeGMT.
         */
        public Builder createFromTimeGMT(Long createFromTimeGMT) {
            this.putBodyParameter("CreateFromTimeGMT", createFromTimeGMT);
            this.createFromTimeGMT = createFromTimeGMT;
            return this;
        }

        /**
         * CreateToTimeGMT.
         */
        public Builder createToTimeGMT(Long createToTimeGMT) {
            this.putBodyParameter("CreateToTimeGMT", createToTimeGMT);
            this.createToTimeGMT = createToTimeGMT;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
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
         * ProcessCodes.
         */
        public Builder processCodes(String processCodes) {
            this.putBodyParameter("ProcessCodes", processCodes);
            this.processCodes = processCodes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hexxxx</p>
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        @Override
        public GetTaskCopiesRequest build() {
            return new GetTaskCopiesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskCopiesRequest} extends {@link TeaModel}
     *
     * <p>GetTaskCopiesRequest</p>
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
