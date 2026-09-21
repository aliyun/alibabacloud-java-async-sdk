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
 * {@link InvokeContainerRequest} extends {@link RequestModel}
 *
 * <p>InvokeContainerRequest</p>
 */
public class InvokeContainerRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private String params;

    private InvokeContainerRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.operationId = builder.operationId;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeContainerRequest create() {
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
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<InvokeContainerRequest, Builder> {
        private AccountContext accountContext; 
        private String operationId; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(InvokeContainerRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.operationId = request.operationId;
            this.params = request.params;
        } 

        /**
         * accountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "accountContext", "json");
            this.putHeaderParameter("accountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>createSandbox</p>
         */
        public Builder operationId(String operationId) {
            this.putBodyParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * params.
         */
        public Builder params(String params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public InvokeContainerRequest build() {
            return new InvokeContainerRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeContainerRequest} extends {@link TeaModel}
     *
     * <p>InvokeContainerRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("alidingSsoTicket")
        private String alidingSsoTicket;

        @com.aliyun.core.annotation.NameInMap("ssoTicket")
        private String ssoTicket;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
            this.alidingSsoTicket = builder.alidingSsoTicket;
            this.ssoTicket = builder.ssoTicket;
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

        /**
         * @return alidingSsoTicket
         */
        public String getAlidingSsoTicket() {
            return this.alidingSsoTicket;
        }

        /**
         * @return ssoTicket
         */
        public String getSsoTicket() {
            return this.ssoTicket;
        }

        public static final class Builder {
            private String accountId; 
            private String alidingSsoTicket; 
            private String ssoTicket; 

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
                this.alidingSsoTicket = model.alidingSsoTicket;
                this.ssoTicket = model.ssoTicket;
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

            /**
             * alidingSsoTicket.
             */
            public Builder alidingSsoTicket(String alidingSsoTicket) {
                this.alidingSsoTicket = alidingSsoTicket;
                return this;
            }

            /**
             * ssoTicket.
             */
            public Builder ssoTicket(String ssoTicket) {
                this.ssoTicket = ssoTicket;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
