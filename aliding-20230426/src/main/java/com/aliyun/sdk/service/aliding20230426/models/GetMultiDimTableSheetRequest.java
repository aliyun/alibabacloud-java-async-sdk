// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMultiDimTableSheetRequest} extends {@link RequestModel}
 *
 * <p>GetMultiDimTableSheetRequest</p>
 */
public class GetMultiDimTableSheetRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SheetIdOrName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sheetIdOrName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private GetMultiDimTableSheetRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.baseId = builder.baseId;
        this.sheetIdOrName = builder.sheetIdOrName;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiDimTableSheetRequest create() {
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
     * @return baseId
     */
    public String getBaseId() {
        return this.baseId;
    }

    /**
     * @return sheetIdOrName
     */
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<GetMultiDimTableSheetRequest, Builder> {
        private AccountContext accountContext; 
        private String baseId; 
        private String sheetIdOrName; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(GetMultiDimTableSheetRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.baseId = request.baseId;
            this.sheetIdOrName = request.sheetIdOrName;
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
         * <p>169899</p>
         */
        public Builder baseId(String baseId) {
            this.putBodyParameter("BaseId", baseId);
            this.baseId = baseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder sheetIdOrName(String sheetIdOrName) {
            this.putBodyParameter("SheetIdOrName", sheetIdOrName);
            this.sheetIdOrName = sheetIdOrName;
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
        public GetMultiDimTableSheetRequest build() {
            return new GetMultiDimTableSheetRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiDimTableSheetRequest} extends {@link TeaModel}
     *
     * <p>GetMultiDimTableSheetRequest</p>
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
    /**
     * 
     * {@link GetMultiDimTableSheetRequest} extends {@link TeaModel}
     *
     * <p>GetMultiDimTableSheetRequest</p>
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
