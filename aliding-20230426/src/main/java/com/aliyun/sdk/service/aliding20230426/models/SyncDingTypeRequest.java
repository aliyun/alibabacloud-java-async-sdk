// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDingTypeRequest} extends {@link RequestModel}
 *
 * <p>SyncDingTypeRequest</p>
 */
public class SyncDingTypeRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("DingType")
    @Validation(required = true)
    private String dingType;

    @Body
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("WorkNo")
    @Validation(required = true)
    private String workNo;

    private SyncDingTypeRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dingType = builder.dingType;
        this.source = builder.source;
        this.tenantContext = builder.tenantContext;
        this.workNo = builder.workNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDingTypeRequest create() {
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
     * @return dingType
     */
    public String getDingType() {
        return this.dingType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return workNo
     */
    public String getWorkNo() {
        return this.workNo;
    }

    public static final class Builder extends Request.Builder<SyncDingTypeRequest, Builder> {
        private AccountContext accountContext; 
        private String dingType; 
        private String source; 
        private TenantContext tenantContext; 
        private String workNo; 

        private Builder() {
            super();
        } 

        private Builder(SyncDingTypeRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dingType = request.dingType;
            this.source = request.source;
            this.tenantContext = request.tenantContext;
            this.workNo = request.workNo;
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
         * DingType.
         */
        public Builder dingType(String dingType) {
            this.putBodyParameter("DingType", dingType);
            this.dingType = dingType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
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
         * WorkNo.
         */
        public Builder workNo(String workNo) {
            this.putBodyParameter("WorkNo", workNo);
            this.workNo = workNo;
            return this;
        }

        @Override
        public SyncDingTypeRequest build() {
            return new SyncDingTypeRequest(this);
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
    public static class TenantContext extends TeaModel {
        @NameInMap("tenantId")
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
