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
 * {@link DocBlocksModifyRequest} extends {@link RequestModel}
 *
 * <p>DocBlocksModifyRequest</p>
 */
public class DocBlocksModifyRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Element")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> element;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private DocBlocksModifyRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.blockId = builder.blockId;
        this.dentryUuid = builder.dentryUuid;
        this.element = builder.element;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocBlocksModifyRequest create() {
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
     * @return blockId
     */
    public String getBlockId() {
        return this.blockId;
    }

    /**
     * @return dentryUuid
     */
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    /**
     * @return element
     */
    public java.util.Map<String, ?> getElement() {
        return this.element;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<DocBlocksModifyRequest, Builder> {
        private AccountContext accountContext; 
        private String blockId; 
        private String dentryUuid; 
        private java.util.Map<String, ?> element; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(DocBlocksModifyRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.blockId = request.blockId;
            this.dentryUuid = request.dentryUuid;
            this.element = request.element;
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
         * <p>mgokkwiovcq5eu02le8</p>
         */
        public Builder blockId(String blockId) {
            this.putBodyParameter("BlockId", blockId);
            this.blockId = blockId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Obva6QBXJwxNZoMOC9bE11Zb8n4qY5Pr</p>
         */
        public Builder dentryUuid(String dentryUuid) {
            this.putBodyParameter("DentryUuid", dentryUuid);
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;blockType&quot;:&quot;paragraph&quot;,&quot;paragraph&quot;:{&quot;text&quot;:&quot;ok&quot;}}</p>
         */
        public Builder element(java.util.Map<String, ?> element) {
            String elementShrink = shrink(element, "Element", "json");
            this.putBodyParameter("Element", elementShrink);
            this.element = element;
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
        public DocBlocksModifyRequest build() {
            return new DocBlocksModifyRequest(this);
        } 

    } 

    /**
     * 
     * {@link DocBlocksModifyRequest} extends {@link TeaModel}
     *
     * <p>DocBlocksModifyRequest</p>
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
     * {@link DocBlocksModifyRequest} extends {@link TeaModel}
     *
     * <p>DocBlocksModifyRequest</p>
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
