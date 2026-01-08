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
 * {@link ListMessageCampaignRequest} extends {@link RequestModel}
 *
 * <p>ListMessageCampaignRequest</p>
 */
public class ListMessageCampaignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdAccountId")
    private String adAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignName")
    private String campaignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListMessageCampaignRequest(Builder builder) {
        super(builder);
        this.adAccountId = builder.adAccountId;
        this.campaignId = builder.campaignId;
        this.campaignName = builder.campaignName;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.pageId = builder.pageId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageCampaignRequest create() {
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
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return campaignName
     */
    public String getCampaignName() {
        return this.campaignName;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMessageCampaignRequest, Builder> {
        private String adAccountId; 
        private String campaignId; 
        private String campaignName; 
        private String custSpaceId; 
        private Long ownerId; 
        private Page page; 
        private String pageId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageCampaignRequest request) {
            super(request);
            this.adAccountId = request.adAccountId;
            this.campaignId = request.campaignId;
            this.campaignName = request.campaignName;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.pageId = request.pageId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
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
         * CampaignId.
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * CampaignName.
         */
        public Builder campaignName(String campaignName) {
            this.putQueryParameter("CampaignName", campaignName);
            this.campaignName = campaignName;
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
         * <p>239***</p>
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMessageCampaignRequest build() {
            return new ListMessageCampaignRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageCampaignRequest} extends {@link TeaModel}
     *
     * <p>ListMessageCampaignRequest</p>
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
             * <p>7</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
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
