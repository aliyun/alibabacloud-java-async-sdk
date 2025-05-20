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
 * {@link InsertMultiDimTableRecordRequest} extends {@link RequestModel}
 *
 * <p>InsertMultiDimTableRecordRequest</p>
 */
public class InsertMultiDimTableRecordRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SheetIdOrName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sheetIdOrName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private InsertMultiDimTableRecordRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.baseId = builder.baseId;
        this.records = builder.records;
        this.sheetIdOrName = builder.sheetIdOrName;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertMultiDimTableRecordRequest create() {
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
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
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

    public static final class Builder extends Request.Builder<InsertMultiDimTableRecordRequest, Builder> {
        private AccountContext accountContext; 
        private String baseId; 
        private java.util.List<Records> records; 
        private String sheetIdOrName; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(InsertMultiDimTableRecordRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.baseId = request.baseId;
            this.records = request.records;
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
         * <p>r1R7q3QmWew5lo02fxB7nxxxxxxxx</p>
         */
        public Builder baseId(String baseId) {
            this.putBodyParameter("BaseId", baseId);
            this.baseId = baseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder records(java.util.List<Records> records) {
            String recordsShrink = shrink(records, "Records", "json");
            this.putBodyParameter("Records", recordsShrink);
            this.records = records;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public InsertMultiDimTableRecordRequest build() {
            return new InsertMultiDimTableRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link InsertMultiDimTableRecordRequest} extends {@link TeaModel}
     *
     * <p>InsertMultiDimTableRecordRequest</p>
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
     * {@link InsertMultiDimTableRecordRequest} extends {@link TeaModel}
     *
     * <p>InsertMultiDimTableRecordRequest</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, ?> fields;

        private Records(Builder builder) {
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.Map<String, ?> getFields() {
            return this.fields;
        }

        public static final class Builder {
            private java.util.Map<String, ?> fields; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.fields = model.fields;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder fields(java.util.Map<String, ?> fields) {
                this.fields = fields;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsertMultiDimTableRecordRequest} extends {@link TeaModel}
     *
     * <p>InsertMultiDimTableRecordRequest</p>
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
