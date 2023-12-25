// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSaveFormDataRequest} extends {@link RequestModel}
 *
 * <p>BatchSaveFormDataRequest</p>
 */
public class BatchSaveFormDataRequest extends Request {
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
    @NameInMap("FormDataJsonList")
    private java.util.List < String > formDataJsonList;

    @Body
    @NameInMap("FormUuid")
    private String formUuid;

    @Body
    @NameInMap("KeepRunningAfterException")
    private Boolean keepRunningAfterException;

    @Body
    @NameInMap("NoExecuteExpression")
    private Boolean noExecuteExpression;

    @Body
    @NameInMap("SystemToken")
    private String systemToken;

    private BatchSaveFormDataRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.asynchronousExecution = builder.asynchronousExecution;
        this.formDataJsonList = builder.formDataJsonList;
        this.formUuid = builder.formUuid;
        this.keepRunningAfterException = builder.keepRunningAfterException;
        this.noExecuteExpression = builder.noExecuteExpression;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSaveFormDataRequest create() {
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
     * @return formDataJsonList
     */
    public java.util.List < String > getFormDataJsonList() {
        return this.formDataJsonList;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return keepRunningAfterException
     */
    public Boolean getKeepRunningAfterException() {
        return this.keepRunningAfterException;
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

    public static final class Builder extends Request.Builder<BatchSaveFormDataRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private Boolean asynchronousExecution; 
        private java.util.List < String > formDataJsonList; 
        private String formUuid; 
        private Boolean keepRunningAfterException; 
        private Boolean noExecuteExpression; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchSaveFormDataRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.asynchronousExecution = request.asynchronousExecution;
            this.formDataJsonList = request.formDataJsonList;
            this.formUuid = request.formUuid;
            this.keepRunningAfterException = request.keepRunningAfterException;
            this.noExecuteExpression = request.noExecuteExpression;
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
         * FormDataJsonList.
         */
        public Builder formDataJsonList(java.util.List < String > formDataJsonList) {
            String formDataJsonListShrink = shrink(formDataJsonList, "FormDataJsonList", "json");
            this.putBodyParameter("FormDataJsonList", formDataJsonListShrink);
            this.formDataJsonList = formDataJsonList;
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
         * KeepRunningAfterException.
         */
        public Builder keepRunningAfterException(Boolean keepRunningAfterException) {
            this.putBodyParameter("KeepRunningAfterException", keepRunningAfterException);
            this.keepRunningAfterException = keepRunningAfterException;
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

        @Override
        public BatchSaveFormDataRequest build() {
            return new BatchSaveFormDataRequest(this);
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
