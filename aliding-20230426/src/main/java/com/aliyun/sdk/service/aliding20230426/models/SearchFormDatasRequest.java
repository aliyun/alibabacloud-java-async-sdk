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
 * {@link SearchFormDatasRequest} extends {@link RequestModel}
 *
 * <p>SearchFormDatasRequest</p>
 */
public class SearchFormDatasRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateFromTimeGMT")
    private String createFromTimeGMT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateToTimeGMT")
    private String createToTimeGMT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicOrder")
    private String dynamicOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifiedFromTimeGMT")
    private String modifiedFromTimeGMT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifiedToTimeGMT")
    private String modifiedToTimeGMT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginatorId")
    private String originatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchFieldJson")
    private String searchFieldJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemToken;

    private SearchFormDatasRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.createFromTimeGMT = builder.createFromTimeGMT;
        this.createToTimeGMT = builder.createToTimeGMT;
        this.currentPage = builder.currentPage;
        this.dynamicOrder = builder.dynamicOrder;
        this.formUuid = builder.formUuid;
        this.language = builder.language;
        this.modifiedFromTimeGMT = builder.modifiedFromTimeGMT;
        this.modifiedToTimeGMT = builder.modifiedToTimeGMT;
        this.originatorId = builder.originatorId;
        this.pageSize = builder.pageSize;
        this.searchFieldJson = builder.searchFieldJson;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFormDatasRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dynamicOrder
     */
    public String getDynamicOrder() {
        return this.dynamicOrder;
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

    public static final class Builder extends Request.Builder<SearchFormDatasRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String createFromTimeGMT; 
        private String createToTimeGMT; 
        private Integer currentPage; 
        private String dynamicOrder; 
        private String formUuid; 
        private String language; 
        private String modifiedFromTimeGMT; 
        private String modifiedToTimeGMT; 
        private String originatorId; 
        private Integer pageSize; 
        private String searchFieldJson; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(SearchFormDatasRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.createFromTimeGMT = request.createFromTimeGMT;
            this.createToTimeGMT = request.createToTimeGMT;
            this.currentPage = request.currentPage;
            this.dynamicOrder = request.dynamicOrder;
            this.formUuid = request.formUuid;
            this.language = request.language;
            this.modifiedFromTimeGMT = request.modifiedFromTimeGMT;
            this.modifiedToTimeGMT = request.modifiedToTimeGMT;
            this.originatorId = request.originatorId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_PBKT0xxx</p>
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DynamicOrder.
         */
        public Builder dynamicOrder(String dynamicOrder) {
            this.putBodyParameter("DynamicOrder", dynamicOrder);
            this.dynamicOrder = dynamicOrder;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FORM-xxxxx</p>
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
        public SearchFormDatasRequest build() {
            return new SearchFormDatasRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchFormDatasRequest} extends {@link TeaModel}
     *
     * <p>SearchFormDatasRequest</p>
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
