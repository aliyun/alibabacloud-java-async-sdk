// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveFormRemarkRequest} extends {@link RequestModel}
 *
 * <p>SaveFormRemarkRequest</p>
 */
public class SaveFormRemarkRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    @Validation(required = true)
    private String appType;

    @Body
    @NameInMap("AtUserId")
    private String atUserId;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("FormInstanceId")
    @Validation(required = true)
    private String formInstanceId;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("ReplyId")
    private Long replyId;

    @Body
    @NameInMap("SystemToken")
    @Validation(required = true)
    private String systemToken;

    private SaveFormRemarkRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.atUserId = builder.atUserId;
        this.content = builder.content;
        this.formInstanceId = builder.formInstanceId;
        this.language = builder.language;
        this.replyId = builder.replyId;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveFormRemarkRequest create() {
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
     * @return atUserId
     */
    public String getAtUserId() {
        return this.atUserId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return formInstanceId
     */
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return replyId
     */
    public Long getReplyId() {
        return this.replyId;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<SaveFormRemarkRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String atUserId; 
        private String content; 
        private String formInstanceId; 
        private String language; 
        private Long replyId; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(SaveFormRemarkRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.atUserId = request.atUserId;
            this.content = request.content;
            this.formInstanceId = request.formInstanceId;
            this.language = request.language;
            this.replyId = request.replyId;
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
         * AtUserId.
         */
        public Builder atUserId(String atUserId) {
            this.putBodyParameter("AtUserId", atUserId);
            this.atUserId = atUserId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * FormInstanceId.
         */
        public Builder formInstanceId(String formInstanceId) {
            this.putBodyParameter("FormInstanceId", formInstanceId);
            this.formInstanceId = formInstanceId;
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
         * ReplyId.
         */
        public Builder replyId(Long replyId) {
            this.putBodyParameter("ReplyId", replyId);
            this.replyId = replyId;
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
        public SaveFormRemarkRequest build() {
            return new SaveFormRemarkRequest(this);
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
