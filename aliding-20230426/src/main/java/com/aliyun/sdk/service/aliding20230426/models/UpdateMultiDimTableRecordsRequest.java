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
 * {@link UpdateMultiDimTableRecordsRequest} extends {@link RequestModel}
 *
 * <p>UpdateMultiDimTableRecordsRequest</p>
 */
public class UpdateMultiDimTableRecordsRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RecordIds> recordIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SheetIdOrName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sheetIdOrName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private UpdateMultiDimTableRecordsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.baseId = builder.baseId;
        this.recordIds = builder.recordIds;
        this.sheetIdOrName = builder.sheetIdOrName;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMultiDimTableRecordsRequest create() {
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
     * @return recordIds
     */
    public java.util.List<RecordIds> getRecordIds() {
        return this.recordIds;
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

    public static final class Builder extends Request.Builder<UpdateMultiDimTableRecordsRequest, Builder> {
        private AccountContext accountContext; 
        private String baseId; 
        private java.util.List<RecordIds> recordIds; 
        private String sheetIdOrName; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMultiDimTableRecordsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.baseId = request.baseId;
            this.recordIds = request.recordIds;
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
        public Builder recordIds(java.util.List<RecordIds> recordIds) {
            String recordIdsShrink = shrink(recordIds, "RecordIds", "json");
            this.putBodyParameter("RecordIds", recordIdsShrink);
            this.recordIds = recordIds;
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
        public UpdateMultiDimTableRecordsRequest build() {
            return new UpdateMultiDimTableRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMultiDimTableRecordsRequest} extends {@link TeaModel}
     *
     * <p>UpdateMultiDimTableRecordsRequest</p>
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
     * {@link UpdateMultiDimTableRecordsRequest} extends {@link TeaModel}
     *
     * <p>UpdateMultiDimTableRecordsRequest</p>
     */
    public static class RecordIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, ?> fields;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private RecordIds(Builder builder) {
            this.fields = builder.fields;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordIds create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.Map<String, ?> getFields() {
            return this.fields;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.Map<String, ?> fields; 
            private String id; 

            private Builder() {
            } 

            private Builder(RecordIds model) {
                this.fields = model.fields;
                this.id = model.id;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder fields(java.util.Map<String, ?> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HyDGtSj</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public RecordIds build() {
                return new RecordIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMultiDimTableRecordsRequest} extends {@link TeaModel}
     *
     * <p>UpdateMultiDimTableRecordsRequest</p>
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
