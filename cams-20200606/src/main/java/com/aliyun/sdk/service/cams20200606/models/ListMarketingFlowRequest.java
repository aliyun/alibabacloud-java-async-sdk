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
 * {@link ListMarketingFlowRequest} extends {@link RequestModel}
 *
 * <p>ListMarketingFlowRequest</p>
 */
public class ListMarketingFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityCode")
    private String activityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityName")
    private String activityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityStatus")
    private String activityStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private String pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedFlowCode")
    private String relatedFlowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedGroupId")
    private Long relatedGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListMarketingFlowRequest(Builder builder) {
        super(builder);
        this.activityCode = builder.activityCode;
        this.activityName = builder.activityName;
        this.activityStatus = builder.activityStatus;
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.relatedFlowCode = builder.relatedFlowCode;
        this.relatedGroupId = builder.relatedGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMarketingFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityCode
     */
    public String getActivityCode() {
        return this.activityCode;
    }

    /**
     * @return activityName
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * @return activityStatus
     */
    public String getActivityStatus() {
        return this.activityStatus;
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return bizExtend
     */
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public String getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relatedFlowCode
     */
    public String getRelatedFlowCode() {
        return this.relatedFlowCode;
    }

    /**
     * @return relatedGroupId
     */
    public Long getRelatedGroupId() {
        return this.relatedGroupId;
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

    public static final class Builder extends Request.Builder<ListMarketingFlowRequest, Builder> {
        private String activityCode; 
        private String activityName; 
        private String activityStatus; 
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private Long ownerId; 
        private String pageIndex; 
        private String pageSize; 
        private String relatedFlowCode; 
        private Long relatedGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListMarketingFlowRequest request) {
            super(request);
            this.activityCode = request.activityCode;
            this.activityName = request.activityName;
            this.activityStatus = request.activityStatus;
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.ownerId = request.ownerId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.relatedFlowCode = request.relatedFlowCode;
            this.relatedGroupId = request.relatedGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ActivityCode.
         */
        public Builder activityCode(String activityCode) {
            this.putQueryParameter("ActivityCode", activityCode);
            this.activityCode = activityCode;
            return this;
        }

        /**
         * ActivityName.
         */
        public Builder activityName(String activityName) {
            this.putQueryParameter("ActivityName", activityName);
            this.activityName = activityName;
            return this;
        }

        /**
         * ActivityStatus.
         */
        public Builder activityStatus(String activityStatus) {
            this.putQueryParameter("ActivityStatus", activityStatus);
            this.activityStatus = activityStatus;
            return this;
        }

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * BizExtend.
         */
        public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
            String bizExtendShrink = shrink(bizExtend, "BizExtend", "json");
            this.putQueryParameter("BizExtend", bizExtendShrink);
            this.bizExtend = bizExtend;
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
         * PageIndex.
         */
        public Builder pageIndex(String pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RelatedFlowCode.
         */
        public Builder relatedFlowCode(String relatedFlowCode) {
            this.putQueryParameter("RelatedFlowCode", relatedFlowCode);
            this.relatedFlowCode = relatedFlowCode;
            return this;
        }

        /**
         * RelatedGroupId.
         */
        public Builder relatedGroupId(Long relatedGroupId) {
            this.putQueryParameter("RelatedGroupId", relatedGroupId);
            this.relatedGroupId = relatedGroupId;
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

        @Override
        public ListMarketingFlowRequest build() {
            return new ListMarketingFlowRequest(this);
        } 

    } 

}
