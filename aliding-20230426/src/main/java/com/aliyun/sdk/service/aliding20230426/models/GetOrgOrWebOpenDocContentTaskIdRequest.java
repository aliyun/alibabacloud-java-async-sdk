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
 * {@link GetOrgOrWebOpenDocContentTaskIdRequest} extends {@link RequestModel}
 *
 * <p>GetOrgOrWebOpenDocContentTaskIdRequest</p>
 */
public class GetOrgOrWebOpenDocContentTaskIdRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GenerateCp")
    private Boolean generateCp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private Integer scopeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFormat")
    private String targetFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private GetOrgOrWebOpenDocContentTaskIdRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryUuid = builder.dentryUuid;
        this.generateCp = builder.generateCp;
        this.scopeType = builder.scopeType;
        this.targetFormat = builder.targetFormat;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrgOrWebOpenDocContentTaskIdRequest create() {
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
     * @return dentryUuid
     */
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    /**
     * @return generateCp
     */
    public Boolean getGenerateCp() {
        return this.generateCp;
    }

    /**
     * @return scopeType
     */
    public Integer getScopeType() {
        return this.scopeType;
    }

    /**
     * @return targetFormat
     */
    public String getTargetFormat() {
        return this.targetFormat;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<GetOrgOrWebOpenDocContentTaskIdRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryUuid; 
        private Boolean generateCp; 
        private Integer scopeType; 
        private String targetFormat; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(GetOrgOrWebOpenDocContentTaskIdRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryUuid = request.dentryUuid;
            this.generateCp = request.generateCp;
            this.scopeType = request.scopeType;
            this.targetFormat = request.targetFormat;
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
         * <p>20eMKjyp810mMdK4Hz4B5BA6JxAZB1Gv</p>
         */
        public Builder dentryUuid(String dentryUuid) {
            this.putBodyParameter("DentryUuid", dentryUuid);
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * GenerateCp.
         */
        public Builder generateCp(Boolean generateCp) {
            this.putBodyParameter("GenerateCp", generateCp);
            this.generateCp = generateCp;
            return this;
        }

        /**
         * ScopeType.
         */
        public Builder scopeType(Integer scopeType) {
            this.putBodyParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * TargetFormat.
         */
        public Builder targetFormat(String targetFormat) {
            this.putBodyParameter("TargetFormat", targetFormat);
            this.targetFormat = targetFormat;
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
        public GetOrgOrWebOpenDocContentTaskIdRequest build() {
            return new GetOrgOrWebOpenDocContentTaskIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetOrgOrWebOpenDocContentTaskIdRequest} extends {@link TeaModel}
     *
     * <p>GetOrgOrWebOpenDocContentTaskIdRequest</p>
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
     * {@link GetOrgOrWebOpenDocContentTaskIdRequest} extends {@link TeaModel}
     *
     * <p>GetOrgOrWebOpenDocContentTaskIdRequest</p>
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
