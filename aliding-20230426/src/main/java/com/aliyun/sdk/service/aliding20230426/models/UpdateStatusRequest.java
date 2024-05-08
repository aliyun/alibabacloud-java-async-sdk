// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateStatusRequest</p>
 */
public class UpdateStatusRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorLines")
    private java.util.List < Integer > errorLines;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImportSequence")
    private String importSequence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    private String systemToken;

    private UpdateStatusRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.errorLines = builder.errorLines;
        this.importSequence = builder.importSequence;
        this.language = builder.language;
        this.status = builder.status;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStatusRequest create() {
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
     * @return errorLines
     */
    public java.util.List < Integer > getErrorLines() {
        return this.errorLines;
    }

    /**
     * @return importSequence
     */
    public String getImportSequence() {
        return this.importSequence;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<UpdateStatusRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private java.util.List < Integer > errorLines; 
        private String importSequence; 
        private String language; 
        private String status; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStatusRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.errorLines = request.errorLines;
            this.importSequence = request.importSequence;
            this.language = request.language;
            this.status = request.status;
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
         * ErrorLines.
         */
        public Builder errorLines(java.util.List < Integer > errorLines) {
            String errorLinesShrink = shrink(errorLines, "ErrorLines", "json");
            this.putBodyParameter("ErrorLines", errorLinesShrink);
            this.errorLines = errorLines;
            return this;
        }

        /**
         * ImportSequence.
         */
        public Builder importSequence(String importSequence) {
            this.putBodyParameter("ImportSequence", importSequence);
            this.importSequence = importSequence;
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
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
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
        public UpdateStatusRequest build() {
            return new UpdateStatusRequest(this);
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
