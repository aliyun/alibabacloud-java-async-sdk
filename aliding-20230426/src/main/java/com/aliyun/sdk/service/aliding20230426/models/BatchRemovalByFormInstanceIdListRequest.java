// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRemovalByFormInstanceIdListRequest} extends {@link RequestModel}
 *
 * <p>BatchRemovalByFormInstanceIdListRequest</p>
 */
public class BatchRemovalByFormInstanceIdListRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    @Validation(required = true)
    private String appType;

    @Body
    @NameInMap("AsynchronousExecution")
    private Boolean asynchronousExecution;

    @Body
    @NameInMap("ExecuteExpression")
    private Boolean executeExpression;

    @Body
    @NameInMap("FormInstanceIdList")
    @Validation(required = true)
    private java.util.List < String > formInstanceIdList;

    @Body
    @NameInMap("FormUuid")
    @Validation(required = true)
    private String formUuid;

    @Body
    @NameInMap("SystemToken")
    @Validation(required = true)
    private String systemToken;

    private BatchRemovalByFormInstanceIdListRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.asynchronousExecution = builder.asynchronousExecution;
        this.executeExpression = builder.executeExpression;
        this.formInstanceIdList = builder.formInstanceIdList;
        this.formUuid = builder.formUuid;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRemovalByFormInstanceIdListRequest create() {
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
     * @return executeExpression
     */
    public Boolean getExecuteExpression() {
        return this.executeExpression;
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
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<BatchRemovalByFormInstanceIdListRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private Boolean asynchronousExecution; 
        private Boolean executeExpression; 
        private java.util.List < String > formInstanceIdList; 
        private String formUuid; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchRemovalByFormInstanceIdListRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.asynchronousExecution = request.asynchronousExecution;
            this.executeExpression = request.executeExpression;
            this.formInstanceIdList = request.formInstanceIdList;
            this.formUuid = request.formUuid;
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
         * AsynchronousExecution.
         */
        public Builder asynchronousExecution(Boolean asynchronousExecution) {
            this.putBodyParameter("AsynchronousExecution", asynchronousExecution);
            this.asynchronousExecution = asynchronousExecution;
            return this;
        }

        /**
         * ExecuteExpression.
         */
        public Builder executeExpression(Boolean executeExpression) {
            this.putBodyParameter("ExecuteExpression", executeExpression);
            this.executeExpression = executeExpression;
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
         * SystemToken.
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        @Override
        public BatchRemovalByFormInstanceIdListRequest build() {
            return new BatchRemovalByFormInstanceIdListRequest(this);
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
