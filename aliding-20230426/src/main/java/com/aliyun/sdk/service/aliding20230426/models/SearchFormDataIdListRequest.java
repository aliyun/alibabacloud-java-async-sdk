// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFormDataIdListRequest} extends {@link RequestModel}
 *
 * <p>SearchFormDataIdListRequest</p>
 */
public class SearchFormDataIdListRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    @Validation(required = true)
    private String appType;

    @Body
    @NameInMap("CreateFromTimeGMT")
    private String createFromTimeGMT;

    @Body
    @NameInMap("CreateToTimeGMT")
    private String createToTimeGMT;

    @Body
    @NameInMap("FormUuid")
    @Validation(required = true)
    private String formUuid;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("ModifiedFromTimeGMT")
    private String modifiedFromTimeGMT;

    @Body
    @NameInMap("ModifiedToTimeGMT")
    private String modifiedToTimeGMT;

    @Body
    @NameInMap("OriginatorId")
    private String originatorId;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SearchFieldJson")
    private String searchFieldJson;

    @Body
    @NameInMap("SystemToken")
    @Validation(required = true)
    private String systemToken;

    private SearchFormDataIdListRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.createFromTimeGMT = builder.createFromTimeGMT;
        this.createToTimeGMT = builder.createToTimeGMT;
        this.formUuid = builder.formUuid;
        this.language = builder.language;
        this.modifiedFromTimeGMT = builder.modifiedFromTimeGMT;
        this.modifiedToTimeGMT = builder.modifiedToTimeGMT;
        this.originatorId = builder.originatorId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchFieldJson = builder.searchFieldJson;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFormDataIdListRequest create() {
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
    public String getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    /**
     * @return createToTimeGMT
     */
    public String getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return modifiedFromTimeGMT
     */
    public String getModifiedFromTimeGMT() {
        return this.modifiedFromTimeGMT;
    }

    /**
     * @return modifiedToTimeGMT
     */
    public String getModifiedToTimeGMT() {
        return this.modifiedToTimeGMT;
    }

    /**
     * @return originatorId
     */
    public String getOriginatorId() {
        return this.originatorId;
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
     * @return searchFieldJson
     */
    public String getSearchFieldJson() {
        return this.searchFieldJson;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<SearchFormDataIdListRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String createFromTimeGMT; 
        private String createToTimeGMT; 
        private String formUuid; 
        private String language; 
        private String modifiedFromTimeGMT; 
        private String modifiedToTimeGMT; 
        private String originatorId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchFieldJson; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(SearchFormDataIdListRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.createFromTimeGMT = request.createFromTimeGMT;
            this.createToTimeGMT = request.createToTimeGMT;
            this.formUuid = request.formUuid;
            this.language = request.language;
            this.modifiedFromTimeGMT = request.modifiedFromTimeGMT;
            this.modifiedToTimeGMT = request.modifiedToTimeGMT;
            this.originatorId = request.originatorId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchFieldJson = request.searchFieldJson;
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
        public Builder createFromTimeGMT(String createFromTimeGMT) {
            this.putBodyParameter("CreateFromTimeGMT", createFromTimeGMT);
            this.createFromTimeGMT = createFromTimeGMT;
            return this;
        }

        /**
         * CreateToTimeGMT.
         */
        public Builder createToTimeGMT(String createToTimeGMT) {
            this.putBodyParameter("CreateToTimeGMT", createToTimeGMT);
            this.createToTimeGMT = createToTimeGMT;
            return this;
        }

        /**
         * FormUuid.
         */
        public Builder formUuid(String formUuid) {
            this.putBodyParameter("FormUuid", formUuid);
            this.formUuid = formUuid;
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
         * ModifiedFromTimeGMT.
         */
        public Builder modifiedFromTimeGMT(String modifiedFromTimeGMT) {
            this.putBodyParameter("ModifiedFromTimeGMT", modifiedFromTimeGMT);
            this.modifiedFromTimeGMT = modifiedFromTimeGMT;
            return this;
        }

        /**
         * ModifiedToTimeGMT.
         */
        public Builder modifiedToTimeGMT(String modifiedToTimeGMT) {
            this.putBodyParameter("ModifiedToTimeGMT", modifiedToTimeGMT);
            this.modifiedToTimeGMT = modifiedToTimeGMT;
            return this;
        }

        /**
         * OriginatorId.
         */
        public Builder originatorId(String originatorId) {
            this.putBodyParameter("OriginatorId", originatorId);
            this.originatorId = originatorId;
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
         * SearchFieldJson.
         */
        public Builder searchFieldJson(String searchFieldJson) {
            this.putBodyParameter("SearchFieldJson", searchFieldJson);
            this.searchFieldJson = searchFieldJson;
            return this;
        }

        /**
         * SystemToken.
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        @Override
        public SearchFormDataIdListRequest build() {
            return new SearchFormDataIdListRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
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
