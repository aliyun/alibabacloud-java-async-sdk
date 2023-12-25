// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateFormDataByInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateFormDataByInstanceIdRequest</p>
 */
public class BatchUpdateFormDataByInstanceIdRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    private String appType;

    @Body
    @NameInMap("AsynchronousExecution")
    private Boolean asynchronousExecution;

    @Body
    @NameInMap("FormInstanceIdList")
    @Validation(required = true)
    private java.util.List < String > formInstanceIdList;

    @Body
    @NameInMap("FormUuid")
    @Validation(required = true)
    private String formUuid;

    @Body
    @NameInMap("IgnoreEmpty")
    private Boolean ignoreEmpty;

    @Body
    @NameInMap("NoExecuteExpression")
    private Boolean noExecuteExpression;

    @Body
    @NameInMap("SystemToken")
    @Validation(required = true)
    private String systemToken;

    @Body
    @NameInMap("UpdateFormDataJson")
    @Validation(required = true)
    private String updateFormDataJson;

    @Body
    @NameInMap("UseLatestFormSchemaVersion")
    private Boolean useLatestFormSchemaVersion;

    private BatchUpdateFormDataByInstanceIdRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.asynchronousExecution = builder.asynchronousExecution;
        this.formInstanceIdList = builder.formInstanceIdList;
        this.formUuid = builder.formUuid;
        this.ignoreEmpty = builder.ignoreEmpty;
        this.noExecuteExpression = builder.noExecuteExpression;
        this.systemToken = builder.systemToken;
        this.updateFormDataJson = builder.updateFormDataJson;
        this.useLatestFormSchemaVersion = builder.useLatestFormSchemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateFormDataByInstanceIdRequest create() {
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
     * @return asynchronousExecution
     */
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    /**
     * @return formInstanceIdList
     */
    public java.util.List < String > getFormInstanceIdList() {
        return this.formInstanceIdList;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return ignoreEmpty
     */
    public Boolean getIgnoreEmpty() {
        return this.ignoreEmpty;
    }

    /**
     * @return noExecuteExpression
     */
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return updateFormDataJson
     */
    public String getUpdateFormDataJson() {
        return this.updateFormDataJson;
    }

    /**
     * @return useLatestFormSchemaVersion
     */
    public Boolean getUseLatestFormSchemaVersion() {
        return this.useLatestFormSchemaVersion;
    }

    public static final class Builder extends Request.Builder<BatchUpdateFormDataByInstanceIdRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private Boolean asynchronousExecution; 
        private java.util.List < String > formInstanceIdList; 
        private String formUuid; 
        private Boolean ignoreEmpty; 
        private Boolean noExecuteExpression; 
        private String systemToken; 
        private String updateFormDataJson; 
        private Boolean useLatestFormSchemaVersion; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateFormDataByInstanceIdRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.asynchronousExecution = request.asynchronousExecution;
            this.formInstanceIdList = request.formInstanceIdList;
            this.formUuid = request.formUuid;
            this.ignoreEmpty = request.ignoreEmpty;
            this.noExecuteExpression = request.noExecuteExpression;
            this.systemToken = request.systemToken;
            this.updateFormDataJson = request.updateFormDataJson;
            this.useLatestFormSchemaVersion = request.useLatestFormSchemaVersion;
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
         * AsynchronousExecution.
         */
        public Builder asynchronousExecution(Boolean asynchronousExecution) {
            this.putBodyParameter("AsynchronousExecution", asynchronousExecution);
            this.asynchronousExecution = asynchronousExecution;
            return this;
        }

        /**
         * FormInstanceIdList.
         */
        public Builder formInstanceIdList(java.util.List < String > formInstanceIdList) {
            String formInstanceIdListShrink = shrink(formInstanceIdList, "FormInstanceIdList", "json");
            this.putBodyParameter("FormInstanceIdList", formInstanceIdListShrink);
            this.formInstanceIdList = formInstanceIdList;
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
         * IgnoreEmpty.
         */
        public Builder ignoreEmpty(Boolean ignoreEmpty) {
            this.putBodyParameter("IgnoreEmpty", ignoreEmpty);
            this.ignoreEmpty = ignoreEmpty;
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
         * SystemToken.
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        /**
         * UpdateFormDataJson.
         */
        public Builder updateFormDataJson(String updateFormDataJson) {
            this.putBodyParameter("UpdateFormDataJson", updateFormDataJson);
            this.updateFormDataJson = updateFormDataJson;
            return this;
        }

        /**
         * UseLatestFormSchemaVersion.
         */
        public Builder useLatestFormSchemaVersion(Boolean useLatestFormSchemaVersion) {
            this.putBodyParameter("UseLatestFormSchemaVersion", useLatestFormSchemaVersion);
            this.useLatestFormSchemaVersion = useLatestFormSchemaVersion;
            return this;
        }

        @Override
        public BatchUpdateFormDataByInstanceIdRequest build() {
            return new BatchUpdateFormDataByInstanceIdRequest(this);
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
