// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteColumnsRequest} extends {@link RequestModel}
 *
 * <p>DeleteColumnsRequest</p>
 */
public class DeleteColumnsRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Column")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long column;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ColumnCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long columnCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SheetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sheetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkbookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workbookId;

    private DeleteColumnsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.column = builder.column;
        this.columnCount = builder.columnCount;
        this.sheetId = builder.sheetId;
        this.tenantContext = builder.tenantContext;
        this.workbookId = builder.workbookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteColumnsRequest create() {
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
     * @return column
     */
    public Long getColumn() {
        return this.column;
    }

    /**
     * @return columnCount
     */
    public Long getColumnCount() {
        return this.columnCount;
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

    public static final class Builder extends Request.Builder<DeleteColumnsRequest, Builder> {
        private AccountContext accountContext; 
        private Long column; 
        private Long columnCount; 
        private String sheetId; 
        private TenantContext tenantContext; 
        private String workbookId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteColumnsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.column = request.column;
            this.columnCount = request.columnCount;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder column(Long column) {
            this.putBodyParameter("Column", column);
            this.column = column;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder columnCount(Long columnCount) {
            this.putBodyParameter("ColumnCount", columnCount);
            this.columnCount = columnCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sheet1</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stxxxx</p>
         */
        public Builder workbookId(String workbookId) {
            this.putBodyParameter("WorkbookId", workbookId);
            this.workbookId = workbookId;
            return this;
        }

        @Override
        public DeleteColumnsRequest build() {
            return new DeleteColumnsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteColumnsRequest} extends {@link TeaModel}
     *
     * <p>DeleteColumnsRequest</p>
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
     * {@link DeleteColumnsRequest} extends {@link TeaModel}
     *
     * <p>DeleteColumnsRequest</p>
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
