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
 * {@link UpdateConvExtensionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConvExtensionRequest</p>
 */
public class UpdateConvExtensionRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MobileUrl")
    private String mobileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PcUrl")
    private String pcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StaffIdList")
    private java.util.List<String> staffIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemUid")
    private String systemUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private UpdateConvExtensionRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.mobileUrl = builder.mobileUrl;
        this.pcUrl = builder.pcUrl;
        this.staffIdList = builder.staffIdList;
        this.systemUid = builder.systemUid;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConvExtensionRequest create() {
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
     * @return mobileUrl
     */
    public String getMobileUrl() {
        return this.mobileUrl;
    }

    /**
     * @return pcUrl
     */
    public String getPcUrl() {
        return this.pcUrl;
    }

    /**
     * @return staffIdList
     */
    public java.util.List<String> getStaffIdList() {
        return this.staffIdList;
    }

    /**
     * @return systemUid
     */
    public String getSystemUid() {
        return this.systemUid;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<UpdateConvExtensionRequest, Builder> {
        private AccountContext accountContext; 
        private String mobileUrl; 
        private String pcUrl; 
        private java.util.List<String> staffIdList; 
        private String systemUid; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConvExtensionRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.mobileUrl = request.mobileUrl;
            this.pcUrl = request.pcUrl;
            this.staffIdList = request.staffIdList;
            this.systemUid = request.systemUid;
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
         * MobileUrl.
         */
        public Builder mobileUrl(String mobileUrl) {
            this.putBodyParameter("MobileUrl", mobileUrl);
            this.mobileUrl = mobileUrl;
            return this;
        }

        /**
         * PcUrl.
         */
        public Builder pcUrl(String pcUrl) {
            this.putBodyParameter("PcUrl", pcUrl);
            this.pcUrl = pcUrl;
            return this;
        }

        /**
         * StaffIdList.
         */
        public Builder staffIdList(java.util.List<String> staffIdList) {
            String staffIdListShrink = shrink(staffIdList, "StaffIdList", "json");
            this.putBodyParameter("StaffIdList", staffIdListShrink);
            this.staffIdList = staffIdList;
            return this;
        }

        /**
         * SystemUid.
         */
        public Builder systemUid(String systemUid) {
            this.putBodyParameter("SystemUid", systemUid);
            this.systemUid = systemUid;
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
        public UpdateConvExtensionRequest build() {
            return new UpdateConvExtensionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConvExtensionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConvExtensionRequest</p>
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
     * {@link UpdateConvExtensionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConvExtensionRequest</p>
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
