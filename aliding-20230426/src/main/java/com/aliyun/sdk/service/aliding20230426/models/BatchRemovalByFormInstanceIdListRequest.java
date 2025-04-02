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
 * {@link BatchRemovalByFormInstanceIdListRequest} extends {@link RequestModel}
 *
 * <p>BatchRemovalByFormInstanceIdListRequest</p>
 */
public class BatchRemovalByFormInstanceIdListRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AsynchronousExecution")
    private Boolean asynchronousExecution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteExpression")
    private Boolean executeExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> formInstanceIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getFormInstanceIdList() {
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
        private java.util.List<String> formInstanceIdList; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_XCE0EVXS6DYG3YDYC5RD</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder formInstanceIdList(java.util.List<String> formInstanceIdList) {
            String formInstanceIdListShrink = shrink(formInstanceIdList, "FormInstanceIdList", "json");
            this.putBodyParameter("FormInstanceIdList", formInstanceIdListShrink);
            this.formInstanceIdList = formInstanceIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FORM-GX866MC1NC1VOFF6WVQW33FD16E23L3CPMKVKA</p>
         */
        public Builder formUuid(String formUuid) {
            this.putBodyParameter("FormUuid", formUuid);
            this.formUuid = formUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>09866181UTZVVD4R3DC955FNKIM52HVPU5WWK7</p>
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

    /**
     * 
     * {@link BatchRemovalByFormInstanceIdListRequest} extends {@link TeaModel}
     *
     * <p>BatchRemovalByFormInstanceIdListRequest</p>
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

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
