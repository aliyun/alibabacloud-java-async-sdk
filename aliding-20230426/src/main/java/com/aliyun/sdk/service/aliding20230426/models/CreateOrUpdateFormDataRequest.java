// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateFormDataRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateFormDataRequest</p>
 */
public class CreateOrUpdateFormDataRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    private String appType;

    @Body
    @NameInMap("FormDataJson")
    private String formDataJson;

    @Body
    @NameInMap("FormUuid")
    private String formUuid;

    @Body
    @NameInMap("NoExecuteExpression")
    private Boolean noExecuteExpression;

    @Body
    @NameInMap("SearchCondition")
    private String searchCondition;

    @Body
    @NameInMap("SystemToken")
    private String systemToken;

    @Body
    @NameInMap("UserId")
    private String userId;

    private CreateOrUpdateFormDataRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.formDataJson = builder.formDataJson;
        this.formUuid = builder.formUuid;
        this.noExecuteExpression = builder.noExecuteExpression;
        this.searchCondition = builder.searchCondition;
        this.systemToken = builder.systemToken;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateFormDataRequest create() {
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
     * @return formDataJson
     */
    public String getFormDataJson() {
        return this.formDataJson;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return noExecuteExpression
     */
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    /**
     * @return searchCondition
     */
    public String getSearchCondition() {
        return this.searchCondition;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateFormDataRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String formDataJson; 
        private String formUuid; 
        private Boolean noExecuteExpression; 
        private String searchCondition; 
        private String systemToken; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateFormDataRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.formDataJson = request.formDataJson;
            this.formUuid = request.formUuid;
            this.noExecuteExpression = request.noExecuteExpression;
            this.searchCondition = request.searchCondition;
            this.systemToken = request.systemToken;
            this.userId = request.userId;
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
         * FormDataJson.
         */
        public Builder formDataJson(String formDataJson) {
            this.putBodyParameter("FormDataJson", formDataJson);
            this.formDataJson = formDataJson;
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
         * NoExecuteExpression.
         */
        public Builder noExecuteExpression(Boolean noExecuteExpression) {
            this.putBodyParameter("NoExecuteExpression", noExecuteExpression);
            this.noExecuteExpression = noExecuteExpression;
            return this;
        }

        /**
         * SearchCondition.
         */
        public Builder searchCondition(String searchCondition) {
            this.putBodyParameter("SearchCondition", searchCondition);
            this.searchCondition = searchCondition;
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

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateOrUpdateFormDataRequest build() {
            return new CreateOrUpdateFormDataRequest(this);
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
