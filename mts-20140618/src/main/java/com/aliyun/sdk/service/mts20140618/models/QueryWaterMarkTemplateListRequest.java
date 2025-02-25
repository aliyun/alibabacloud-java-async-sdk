// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryWaterMarkTemplateListRequest} extends {@link RequestModel}
 *
 * <p>QueryWaterMarkTemplateListRequest</p>
 */
public class QueryWaterMarkTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaterMarkTemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waterMarkTemplateIds;

    private QueryWaterMarkTemplateListRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.waterMarkTemplateIds = builder.waterMarkTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWaterMarkTemplateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return waterMarkTemplateIds
     */
    public String getWaterMarkTemplateIds() {
        return this.waterMarkTemplateIds;
    }

    public static final class Builder extends Request.Builder<QueryWaterMarkTemplateListRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String waterMarkTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryWaterMarkTemplateListRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.waterMarkTemplateIds = request.waterMarkTemplateIds;
        } 

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The IDs of the watermark templates that you want to query. To obtain the IDs of the watermark templates, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Watermark Templates</strong> in the left-side navigation pane. You can query up to 10 watermark templates at a time. Separate multiple IDs of watermark templates with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3780bd69b2b74540bc7b1096f564****</p>
         */
        public Builder waterMarkTemplateIds(String waterMarkTemplateIds) {
            this.putQueryParameter("WaterMarkTemplateIds", waterMarkTemplateIds);
            this.waterMarkTemplateIds = waterMarkTemplateIds;
            return this;
        }

        @Override
        public QueryWaterMarkTemplateListRequest build() {
            return new QueryWaterMarkTemplateListRequest(this);
        } 

    } 

}
