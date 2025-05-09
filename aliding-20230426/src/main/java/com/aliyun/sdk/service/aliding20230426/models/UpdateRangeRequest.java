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
 * {@link UpdateRangeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRangeRequest</p>
 */
public class UpdateRangeRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BackgroundColors")
    private java.util.List<java.util.List<String>> backgroundColors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hyperlinks")
    private java.util.List<java.util.List<Hyperlinks>> hyperlinks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NumberFormat")
    private String numberFormat;

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
    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<java.util.List<String>> values;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkbookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workbookId;

    private UpdateRangeRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.backgroundColors = builder.backgroundColors;
        this.hyperlinks = builder.hyperlinks;
        this.numberFormat = builder.numberFormat;
        this.rangeAddress = builder.rangeAddress;
        this.sheetId = builder.sheetId;
        this.tenantContext = builder.tenantContext;
        this.values = builder.values;
        this.workbookId = builder.workbookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRangeRequest create() {
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
     * @return backgroundColors
     */
    public java.util.List<java.util.List<String>> getBackgroundColors() {
        return this.backgroundColors;
    }

    /**
     * @return hyperlinks
     */
    public java.util.List<java.util.List<Hyperlinks>> getHyperlinks() {
        return this.hyperlinks;
    }

    /**
     * @return numberFormat
     */
    public String getNumberFormat() {
        return this.numberFormat;
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
     * @return values
     */
    public java.util.List<java.util.List<String>> getValues() {
        return this.values;
    }

    /**
     * @return workbookId
     */
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static final class Builder extends Request.Builder<UpdateRangeRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<java.util.List<String>> backgroundColors; 
        private java.util.List<java.util.List<Hyperlinks>> hyperlinks; 
        private String numberFormat; 
        private String rangeAddress; 
        private String sheetId; 
        private TenantContext tenantContext; 
        private java.util.List<java.util.List<String>> values; 
        private String workbookId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRangeRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.backgroundColors = request.backgroundColors;
            this.hyperlinks = request.hyperlinks;
            this.numberFormat = request.numberFormat;
            this.rangeAddress = request.rangeAddress;
            this.sheetId = request.sheetId;
            this.tenantContext = request.tenantContext;
            this.values = request.values;
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
         * BackgroundColors.
         */
        public Builder backgroundColors(java.util.List<java.util.List<String>> backgroundColors) {
            String backgroundColorsShrink = shrink(backgroundColors, "BackgroundColors", "json");
            this.putBodyParameter("BackgroundColors", backgroundColorsShrink);
            this.backgroundColors = backgroundColors;
            return this;
        }

        /**
         * Hyperlinks.
         */
        public Builder hyperlinks(java.util.List<java.util.List<Hyperlinks>> hyperlinks) {
            String hyperlinksShrink = shrink(hyperlinks, "Hyperlinks", "json");
            this.putBodyParameter("Hyperlinks", hyperlinksShrink);
            this.hyperlinks = hyperlinks;
            return this;
        }

        /**
         * NumberFormat.
         */
        public Builder numberFormat(String numberFormat) {
            this.putBodyParameter("NumberFormat", numberFormat);
            this.numberFormat = numberFormat;
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
         * Values.
         */
        public Builder values(java.util.List<java.util.List<String>> values) {
            String valuesShrink = shrink(values, "Values", "json");
            this.putBodyParameter("Values", valuesShrink);
            this.values = values;
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
        public UpdateRangeRequest build() {
            return new UpdateRangeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRangeRequest} extends {@link TeaModel}
     *
     * <p>UpdateRangeRequest</p>
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

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
     * {@link UpdateRangeRequest} extends {@link TeaModel}
     *
     * <p>UpdateRangeRequest</p>
     */
    public static class Hyperlinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Hyperlinks(Builder builder) {
            this.type = builder.type;
            this.link = builder.link;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hyperlinks create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String type; 
            private String link; 
            private String text; 

            private Builder() {
            } 

            private Builder(Hyperlinks model) {
                this.type = model.type;
                this.link = model.link;
                this.text = model.text;
            } 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Hyperlinks build() {
                return new Hyperlinks(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRangeRequest} extends {@link TeaModel}
     *
     * <p>UpdateRangeRequest</p>
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
