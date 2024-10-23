// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTicketRequest} extends {@link RequestModel}
 *
 * <p>GetTicketRequest</p>
 */
public class GetTicketRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenTeamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openTeamId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenTicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openTicketId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private GetTicketRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.openTeamId = builder.openTeamId;
        this.openTicketId = builder.openTicketId;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketRequest create() {
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
     * @return openTeamId
     */
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    /**
     * @return openTicketId
     */
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<GetTicketRequest, Builder> {
        private AccountContext accountContext; 
        private String openTeamId; 
        private String openTicketId; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(GetTicketRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.openTeamId = request.openTeamId;
            this.openTicketId = request.openTicketId;
            this.tenantContext = request.tenantContext;
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
         * <p>eKWh3xxxxiE</p>
         */
        public Builder openTeamId(String openTeamId) {
            this.putBodyParameter("OpenTeamId", openTeamId);
            this.openTeamId = openTeamId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dq9hP8Sk2v6vQxxxxiE</p>
         */
        public Builder openTicketId(String openTicketId) {
            this.putBodyParameter("OpenTicketId", openTicketId);
            this.openTicketId = openTicketId;
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

        @Override
        public GetTicketRequest build() {
            return new GetTicketRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketRequest} extends {@link TeaModel}
     *
     * <p>GetTicketRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
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
    /**
     * 
     * {@link GetTicketRequest} extends {@link TeaModel}
     *
     * <p>GetTicketRequest</p>
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
