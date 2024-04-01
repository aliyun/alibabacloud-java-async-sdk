// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPurchasedApiGroupStatusRequest} extends {@link RequestModel}
 *
 * <p>SetPurchasedApiGroupStatusRequest</p>
 */
public class SetPurchasedApiGroupStatusRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("BillingStatus")
    private String billingStatus;

    @Query
    @NameInMap("CloseOrder")
    private Boolean closeOrder;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetPurchasedApiGroupStatusRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.billingStatus = builder.billingStatus;
        this.closeOrder = builder.closeOrder;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPurchasedApiGroupStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return billingStatus
     */
    public String getBillingStatus() {
        return this.billingStatus;
    }

    /**
     * @return closeOrder
     */
    public Boolean getCloseOrder() {
        return this.closeOrder;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetPurchasedApiGroupStatusRequest, Builder> {
        private Long aliUid; 
        private String billingStatus; 
        private Boolean closeOrder; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetPurchasedApiGroupStatusRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.billingStatus = request.billingStatus;
            this.closeOrder = request.closeOrder;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * BillingStatus.
         */
        public Builder billingStatus(String billingStatus) {
            this.putQueryParameter("BillingStatus", billingStatus);
            this.billingStatus = billingStatus;
            return this;
        }

        /**
         * CloseOrder.
         */
        public Builder closeOrder(Boolean closeOrder) {
            this.putQueryParameter("CloseOrder", closeOrder);
            this.closeOrder = closeOrder;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetPurchasedApiGroupStatusRequest build() {
            return new SetPurchasedApiGroupStatusRequest(this);
        } 

    } 

}
