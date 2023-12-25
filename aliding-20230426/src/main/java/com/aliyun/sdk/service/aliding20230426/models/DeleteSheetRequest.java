// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSheetRequest} extends {@link RequestModel}
 *
 * <p>DeleteSheetRequest</p>
 */
public class DeleteSheetRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("SheetId")
    @Validation(required = true)
    private String sheetId;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("WorkbookId")
    @Validation(required = true)
    private String workbookId;

    private DeleteSheetRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.sheetId = builder.sheetId;
        this.tenantContext = builder.tenantContext;
        this.workbookId = builder.workbookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSheetRequest create() {
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
     * @return sheetId
     */
    public String getSheetId() {
        return this.sheetId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return workbookId
     */
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static final class Builder extends Request.Builder<DeleteSheetRequest, Builder> {
        private AccountContext accountContext; 
        private String sheetId; 
        private TenantContext tenantContext; 
        private String workbookId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSheetRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.sheetId = request.sheetId;
            this.tenantContext = request.tenantContext;
            this.workbookId = request.workbookId;
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
         * SheetId.
         */
        public Builder sheetId(String sheetId) {
            this.putBodyParameter("SheetId", sheetId);
            this.sheetId = sheetId;
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
         * WorkbookId.
         */
        public Builder workbookId(String workbookId) {
            this.putBodyParameter("WorkbookId", workbookId);
            this.workbookId = workbookId;
            return this;
        }

        @Override
        public DeleteSheetRequest build() {
            return new DeleteSheetRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
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
