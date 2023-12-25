// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StatisticsListByTypeReportRequest} extends {@link RequestModel}
 *
 * <p>StatisticsListByTypeReportRequest</p>
 */
public class StatisticsListByTypeReportRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("Offset")
    @Validation(required = true)
    private Long offset;

    @Body
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    @Body
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private Long type;

    private StatisticsListByTypeReportRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.offset = builder.offset;
        this.reportId = builder.reportId;
        this.size = builder.size;
        this.tenantContext = builder.tenantContext;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatisticsListByTypeReportRequest create() {
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
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<StatisticsListByTypeReportRequest, Builder> {
        private AccountContext accountContext; 
        private Long offset; 
        private String reportId; 
        private Long size; 
        private TenantContext tenantContext; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(StatisticsListByTypeReportRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.offset = request.offset;
            this.reportId = request.reportId;
            this.size = request.size;
            this.tenantContext = request.tenantContext;
            this.type = request.type;
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
         * Offset.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putBodyParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putBodyParameter("Size", size);
            this.size = size;
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
         * Type.
         */
        public Builder type(Long type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public StatisticsListByTypeReportRequest build() {
            return new StatisticsListByTypeReportRequest(this);
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
