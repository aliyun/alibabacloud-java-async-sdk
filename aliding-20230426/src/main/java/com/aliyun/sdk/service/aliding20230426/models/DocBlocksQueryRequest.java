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
 * {@link DocBlocksQueryRequest} extends {@link RequestModel}
 *
 * <p>DocBlocksQueryRequest</p>
 */
public class DocBlocksQueryRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockType")
    private String blockType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndIndex")
    private Integer endIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartIndex")
    private Integer startIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private DocBlocksQueryRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.blockType = builder.blockType;
        this.docKey = builder.docKey;
        this.endIndex = builder.endIndex;
        this.startIndex = builder.startIndex;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocBlocksQueryRequest create() {
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
     * @return blockType
     */
    public String getBlockType() {
        return this.blockType;
    }

    /**
     * @return docKey
     */
    public String getDocKey() {
        return this.docKey;
    }

    /**
     * @return endIndex
     */
    public Integer getEndIndex() {
        return this.endIndex;
    }

    /**
     * @return startIndex
     */
    public Integer getStartIndex() {
        return this.startIndex;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<DocBlocksQueryRequest, Builder> {
        private AccountContext accountContext; 
        private String blockType; 
        private String docKey; 
        private Integer endIndex; 
        private Integer startIndex; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(DocBlocksQueryRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.blockType = request.blockType;
            this.docKey = request.docKey;
            this.endIndex = request.endIndex;
            this.startIndex = request.startIndex;
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
         * BlockType.
         */
        public Builder blockType(String blockType) {
            this.putBodyParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder docKey(String docKey) {
            this.putBodyParameter("DocKey", docKey);
            this.docKey = docKey;
            return this;
        }

        /**
         * EndIndex.
         */
        public Builder endIndex(Integer endIndex) {
            this.putBodyParameter("EndIndex", endIndex);
            this.endIndex = endIndex;
            return this;
        }

        /**
         * StartIndex.
         */
        public Builder startIndex(Integer startIndex) {
            this.putBodyParameter("StartIndex", startIndex);
            this.startIndex = startIndex;
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
        public DocBlocksQueryRequest build() {
            return new DocBlocksQueryRequest(this);
        } 

    } 

    /**
     * 
     * {@link DocBlocksQueryRequest} extends {@link TeaModel}
     *
     * <p>DocBlocksQueryRequest</p>
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
     * {@link DocBlocksQueryRequest} extends {@link TeaModel}
     *
     * <p>DocBlocksQueryRequest</p>
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
