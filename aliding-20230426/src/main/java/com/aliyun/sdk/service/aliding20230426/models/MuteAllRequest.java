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
 * {@link MuteAllRequest} extends {@link RequestModel}
 *
 * <p>MuteAllRequest</p>
 */
public class MuteAllRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceMute")
    private Boolean forceMute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conferenceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conferenceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("muteAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String muteAction;

    private MuteAllRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.forceMute = builder.forceMute;
        this.tenantContext = builder.tenantContext;
        this.conferenceId = builder.conferenceId;
        this.muteAction = builder.muteAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MuteAllRequest create() {
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
     * @return forceMute
     */
    public Boolean getForceMute() {
        return this.forceMute;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return muteAction
     */
    public String getMuteAction() {
        return this.muteAction;
    }

    public static final class Builder extends Request.Builder<MuteAllRequest, Builder> {
        private AccountContext accountContext; 
        private Boolean forceMute; 
        private TenantContext tenantContext; 
        private String conferenceId; 
        private String muteAction; 

        private Builder() {
            super();
        } 

        private Builder(MuteAllRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.forceMute = request.forceMute;
            this.tenantContext = request.tenantContext;
            this.conferenceId = request.conferenceId;
            this.muteAction = request.muteAction;
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
         * ForceMute.
         */
        public Builder forceMute(Boolean forceMute) {
            this.putBodyParameter("ForceMute", forceMute);
            this.forceMute = forceMute;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("conferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mute</p>
         */
        public Builder muteAction(String muteAction) {
            this.putBodyParameter("muteAction", muteAction);
            this.muteAction = muteAction;
            return this;
        }

        @Override
        public MuteAllRequest build() {
            return new MuteAllRequest(this);
        } 

    } 

    /**
     * 
     * {@link MuteAllRequest} extends {@link TeaModel}
     *
     * <p>MuteAllRequest</p>
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
    /**
     * 
     * {@link MuteAllRequest} extends {@link TeaModel}
     *
     * <p>MuteAllRequest</p>
     */
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            private Builder() {
            } 

            private Builder(TenantContext model) {
                this.tenantId = model.tenantId;
            } 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
}
