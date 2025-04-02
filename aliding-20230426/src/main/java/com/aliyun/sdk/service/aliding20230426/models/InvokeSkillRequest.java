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
 * {@link InvokeSkillRequest} extends {@link RequestModel}
 *
 * <p>InvokeSkillRequest</p>
 */
public class InvokeSkillRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.Map<String, ?> params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    private InvokeSkillRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.params = builder.params;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeSkillRequest create() {
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
     * @return params
     */
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder extends Request.Builder<InvokeSkillRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.Map<String, ?> params; 
        private String skillId; 

        private Builder() {
            super();
        } 

        private Builder(InvokeSkillRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.params = request.params;
            this.skillId = request.skillId;
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
         * Params.
         */
        public Builder params(java.util.Map<String, ?> params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        /**
         * SkillId.
         */
        public Builder skillId(String skillId) {
            this.putBodyParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        @Override
        public InvokeSkillRequest build() {
            return new InvokeSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeSkillRequest} extends {@link TeaModel}
     *
     * <p>InvokeSkillRequest</p>
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
