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
 * {@link GetFieldDefByUuidRequest} extends {@link RequestModel}
 *
 * <p>GetFieldDefByUuidRequest</p>
 */
public class GetFieldDefByUuidRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemToken;

    private GetFieldDefByUuidRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.formUuid = builder.formUuid;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFieldDefByUuidRequest create() {
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

    public static final class Builder extends Request.Builder<GetFieldDefByUuidRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String formUuid; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(GetFieldDefByUuidRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
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
         * <p>APP_PBKT0xxx</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
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
        public GetFieldDefByUuidRequest build() {
            return new GetFieldDefByUuidRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetFieldDefByUuidRequest} extends {@link TeaModel}
     *
     * <p>GetFieldDefByUuidRequest</p>
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
