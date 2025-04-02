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
 * {@link ExecutePlatformTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecutePlatformTaskRequest</p>
 */
public class ExecutePlatformTaskRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormDataJson")
    private String formDataJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoExecuteExpressions")
    private String noExecuteExpressions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutResult")
    private String outResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
    private String processInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    private String systemToken;

    private ExecutePlatformTaskRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.formDataJson = builder.formDataJson;
        this.language = builder.language;
        this.noExecuteExpressions = builder.noExecuteExpressions;
        this.outResult = builder.outResult;
        this.processInstanceId = builder.processInstanceId;
        this.remark = builder.remark;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecutePlatformTaskRequest create() {
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return noExecuteExpressions
     */
    public String getNoExecuteExpressions() {
        return this.noExecuteExpressions;
    }

    /**
     * @return outResult
     */
    public String getOutResult() {
        return this.outResult;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<ExecutePlatformTaskRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String formDataJson; 
        private String language; 
        private String noExecuteExpressions; 
        private String outResult; 
        private String processInstanceId; 
        private String remark; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(ExecutePlatformTaskRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.formDataJson = request.formDataJson;
            this.language = request.language;
            this.noExecuteExpressions = request.noExecuteExpressions;
            this.outResult = request.outResult;
            this.processInstanceId = request.processInstanceId;
            this.remark = request.remark;
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
         * FormDataJson.
         */
        public Builder formDataJson(String formDataJson) {
            this.putBodyParameter("FormDataJson", formDataJson);
            this.formDataJson = formDataJson;
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
         * NoExecuteExpressions.
         */
        public Builder noExecuteExpressions(String noExecuteExpressions) {
            this.putBodyParameter("NoExecuteExpressions", noExecuteExpressions);
            this.noExecuteExpressions = noExecuteExpressions;
            return this;
        }

        /**
         * OutResult.
         */
        public Builder outResult(String outResult) {
            this.putBodyParameter("OutResult", outResult);
            this.outResult = outResult;
            return this;
        }

        /**
         * ProcessInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.putBodyParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
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
        public ExecutePlatformTaskRequest build() {
            return new ExecutePlatformTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecutePlatformTaskRequest} extends {@link TeaModel}
     *
     * <p>ExecutePlatformTaskRequest</p>
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
