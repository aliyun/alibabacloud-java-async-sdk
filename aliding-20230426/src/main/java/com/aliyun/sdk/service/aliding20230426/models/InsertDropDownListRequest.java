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
 * {@link InsertDropDownListRequest} extends {@link RequestModel}
 *
 * <p>InsertDropDownListRequest</p>
 */
public class InsertDropDownListRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Options> options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RangeAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rangeAddress;

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

    private InsertDropDownListRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.options = builder.options;
        this.rangeAddress = builder.rangeAddress;
        this.sheetId = builder.sheetId;
        this.tenantContext = builder.tenantContext;
        this.workbookId = builder.workbookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertDropDownListRequest create() {
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
     * @return options
     */
    public java.util.List<Options> getOptions() {
        return this.options;
    }

    /**
     * @return rangeAddress
     */
    public String getRangeAddress() {
        return this.rangeAddress;
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

    public static final class Builder extends Request.Builder<InsertDropDownListRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<Options> options; 
        private String rangeAddress; 
        private String sheetId; 
        private TenantContext tenantContext; 
        private String workbookId; 

        private Builder() {
            super();
        } 

        private Builder(InsertDropDownListRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.options = request.options;
            this.rangeAddress = request.rangeAddress;
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
         */
        public Builder options(java.util.List<Options> options) {
            String optionsShrink = shrink(options, "Options", "json");
            this.putBodyParameter("Options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A3:C3</p>
         */
        public Builder rangeAddress(String rangeAddress) {
            this.putBodyParameter("RangeAddress", rangeAddress);
            this.rangeAddress = rangeAddress;
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
        public InsertDropDownListRequest build() {
            return new InsertDropDownListRequest(this);
        } 

    } 

    /**
     * 
     * {@link InsertDropDownListRequest} extends {@link TeaModel}
     *
     * <p>InsertDropDownListRequest</p>
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
     * {@link InsertDropDownListRequest} extends {@link TeaModel}
     *
     * <p>InsertDropDownListRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Color")
        @com.aliyun.core.annotation.Validation(required = true)
        private String color;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Options(Builder builder) {
            this.color = builder.color;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String color; 
            private String value; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.color = model.color;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>#FF0000</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsertDropDownListRequest} extends {@link TeaModel}
     *
     * <p>InsertDropDownListRequest</p>
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
