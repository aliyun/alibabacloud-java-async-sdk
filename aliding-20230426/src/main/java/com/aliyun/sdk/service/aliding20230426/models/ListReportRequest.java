// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReportRequest} extends {@link RequestModel}
 *
 * <p>ListReportRequest</p>
 */
public class ListReportRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("Cursor")
    @Validation(required = true)
    private Long cursor;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("ModifiedEndTime")
    private Long modifiedEndTime;

    @Body
    @NameInMap("ModifiedStartTime")
    private Long modifiedStartTime;

    @Body
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Body
    @NameInMap("TemplateName")
    private String templateName;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    private ListReportRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.cursor = builder.cursor;
        this.endTime = builder.endTime;
        this.modifiedEndTime = builder.modifiedEndTime;
        this.modifiedStartTime = builder.modifiedStartTime;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.templateName = builder.templateName;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReportRequest create() {
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
     * @return cursor
     */
    public Long getCursor() {
        return this.cursor;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return modifiedEndTime
     */
    public Long getModifiedEndTime() {
        return this.modifiedEndTime;
    }

    /**
     * @return modifiedStartTime
     */
    public Long getModifiedStartTime() {
        return this.modifiedStartTime;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<ListReportRequest, Builder> {
        private AccountContext accountContext; 
        private Long cursor; 
        private Long endTime; 
        private Long modifiedEndTime; 
        private Long modifiedStartTime; 
        private Long size; 
        private Long startTime; 
        private String templateName; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(ListReportRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.cursor = request.cursor;
            this.endTime = request.endTime;
            this.modifiedEndTime = request.modifiedEndTime;
            this.modifiedStartTime = request.modifiedStartTime;
            this.size = request.size;
            this.startTime = request.startTime;
            this.templateName = request.templateName;
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
         * Cursor.
         */
        public Builder cursor(Long cursor) {
            this.putBodyParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ModifiedEndTime.
         */
        public Builder modifiedEndTime(Long modifiedEndTime) {
            this.putBodyParameter("ModifiedEndTime", modifiedEndTime);
            this.modifiedEndTime = modifiedEndTime;
            return this;
        }

        /**
         * ModifiedStartTime.
         */
        public Builder modifiedStartTime(Long modifiedStartTime) {
            this.putBodyParameter("ModifiedStartTime", modifiedStartTime);
            this.modifiedStartTime = modifiedStartTime;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
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
        public ListReportRequest build() {
            return new ListReportRequest(this);
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
