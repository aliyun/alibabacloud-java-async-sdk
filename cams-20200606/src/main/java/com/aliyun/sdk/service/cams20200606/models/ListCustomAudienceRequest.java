// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListCustomAudienceRequest} extends {@link RequestModel}
 *
 * <p>ListCustomAudienceRequest</p>
 */
public class ListCustomAudienceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdAccountId")
    private String adAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAudienceId")
    private String customAudienceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAudienceName")
    private String customAudienceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Page page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenType")
    private String tokenType;

    private ListCustomAudienceRequest(Builder builder) {
        super(builder);
        this.adAccountId = builder.adAccountId;
        this.custSpaceId = builder.custSpaceId;
        this.customAudienceId = builder.customAudienceId;
        this.customAudienceName = builder.customAudienceName;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.pageId = builder.pageId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomAudienceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adAccountId
     */
    public String getAdAccountId() {
        return this.adAccountId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return customAudienceId
     */
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    /**
     * @return customAudienceName
     */
    public String getCustomAudienceName() {
        return this.customAudienceName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static final class Builder extends Request.Builder<ListCustomAudienceRequest, Builder> {
        private String adAccountId; 
        private String custSpaceId; 
        private String customAudienceId; 
        private String customAudienceName; 
        private Long ownerId; 
        private Page page; 
        private String pageId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tokenType; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomAudienceRequest request) {
            super(request);
            this.adAccountId = request.adAccountId;
            this.custSpaceId = request.custSpaceId;
            this.customAudienceId = request.customAudienceId;
            this.customAudienceName = request.customAudienceName;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.pageId = request.pageId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tokenType = request.tokenType;
        } 

        /**
         * AdAccountId.
         */
        public Builder adAccountId(String adAccountId) {
            this.putQueryParameter("AdAccountId", adAccountId);
            this.adAccountId = adAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-**</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * CustomAudienceId.
         */
        public Builder customAudienceId(String customAudienceId) {
            this.putQueryParameter("CustomAudienceId", customAudienceId);
            this.customAudienceId = customAudienceId;
            return this;
        }

        /**
         * CustomAudienceName.
         */
        public Builder customAudienceName(String customAudienceName) {
            this.putQueryParameter("CustomAudienceName", customAudienceName);
            this.customAudienceName = customAudienceName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putQueryParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3939**</p>
         */
        public Builder pageId(String pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * TokenType.
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        @Override
        public ListCustomAudienceRequest build() {
            return new ListCustomAudienceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomAudienceRequest} extends {@link TeaModel}
     *
     * <p>ListCustomAudienceRequest</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Size")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long size;

        private Page(Builder builder) {
            this.index = builder.index;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Long index; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.index = model.index;
                this.size = model.size;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
