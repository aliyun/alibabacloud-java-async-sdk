// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCorpTasksRequest} extends {@link RequestModel}
 *
 * <p>GetCorpTasksRequest</p>
 */
public class GetCorpTasksRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CorpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String corpId;

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
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private GetCorpTasksRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appTypes = builder.appTypes;
        this.corpId = builder.corpId;
        this.createFromTimeGMT = builder.createFromTimeGMT;
        this.createToTimeGMT = builder.createToTimeGMT;
        this.keyword = builder.keyword;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processCodes = builder.processCodes;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCorpTasksRequest create() {
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
     * @return appTypes
     */
    public String getAppTypes() {
        return this.appTypes;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetCorpTasksRequest, Builder> {
        private AccountContext accountContext; 
        private String appTypes; 
        private String corpId; 
        private Long createFromTimeGMT; 
        private Long createToTimeGMT; 
        private String keyword; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processCodes; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetCorpTasksRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appTypes = request.appTypes;
            this.corpId = request.corpId;
            this.createFromTimeGMT = request.createFromTimeGMT;
            this.createToTimeGMT = request.createToTimeGMT;
            this.keyword = request.keyword;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processCodes = request.processCodes;
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
         * AppTypes.
         */
        public Builder appTypes(String appTypes) {
            this.putBodyParameter("AppTypes", appTypes);
            this.appTypes = appTypes;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
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
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetCorpTasksRequest build() {
            return new GetCorpTasksRequest(this);
        } 

    } 

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
             * accountId.
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
