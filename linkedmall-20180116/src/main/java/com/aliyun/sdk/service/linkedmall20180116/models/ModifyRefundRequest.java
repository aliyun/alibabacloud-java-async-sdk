// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ModifyRefundRequest} extends {@link RequestModel}
 *
 * <p>ModifyRefundRequest</p>
 */
public class ModifyRefundRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyReasonTextId")
    private Long applyReasonTextId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyRefundCount")
    private Integer applyRefundCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyRefundFee")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyRefundFee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizClaimType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizClaimType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisputeId")
    private Long disputeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GoodsStatus")
    private Integer goodsStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeaveMessage")
    private String leaveMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeavePictureList")
    private java.util.List<LeavePictureList> leavePictureList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubLmOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subLmOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private ModifyRefundRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.applyReasonTextId = builder.applyReasonTextId;
        this.applyRefundCount = builder.applyRefundCount;
        this.applyRefundFee = builder.applyRefundFee;
        this.bizClaimType = builder.bizClaimType;
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.disputeId = builder.disputeId;
        this.goodsStatus = builder.goodsStatus;
        this.leaveMessage = builder.leaveMessage;
        this.leavePictureList = builder.leavePictureList;
        this.subLmOrderId = builder.subLmOrderId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRefundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return applyReasonTextId
     */
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    /**
     * @return applyRefundCount
     */
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    /**
     * @return applyRefundFee
     */
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    /**
     * @return bizClaimType
     */
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return goodsStatus
     */
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @return leaveMessage
     */
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    /**
     * @return leavePictureList
     */
    public java.util.List<LeavePictureList> getLeavePictureList() {
        return this.leavePictureList;
    }

    /**
     * @return subLmOrderId
     */
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<ModifyRefundRequest, Builder> {
        private String accountType; 
        private Long applyReasonTextId; 
        private Integer applyRefundCount; 
        private Long applyRefundFee; 
        private Integer bizClaimType; 
        private String bizId; 
        private String bizUid; 
        private Long disputeId; 
        private Integer goodsStatus; 
        private String leaveMessage; 
        private java.util.List<LeavePictureList> leavePictureList; 
        private String subLmOrderId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRefundRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.applyReasonTextId = request.applyReasonTextId;
            this.applyRefundCount = request.applyRefundCount;
            this.applyRefundFee = request.applyRefundFee;
            this.bizClaimType = request.bizClaimType;
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.disputeId = request.disputeId;
            this.goodsStatus = request.goodsStatus;
            this.leaveMessage = request.leaveMessage;
            this.leavePictureList = request.leavePictureList;
            this.subLmOrderId = request.subLmOrderId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * ApplyReasonTextId.
         */
        public Builder applyReasonTextId(Long applyReasonTextId) {
            this.putQueryParameter("ApplyReasonTextId", applyReasonTextId);
            this.applyReasonTextId = applyReasonTextId;
            return this;
        }

        /**
         * ApplyRefundCount.
         */
        public Builder applyRefundCount(Integer applyRefundCount) {
            this.putQueryParameter("ApplyRefundCount", applyRefundCount);
            this.applyRefundCount = applyRefundCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>790</p>
         */
        public Builder applyRefundFee(Long applyRefundFee) {
            this.putQueryParameter("ApplyRefundFee", applyRefundFee);
            this.applyRefundFee = applyRefundFee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.putQueryParameter("BizClaimType", bizClaimType);
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>220635******232</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * DisputeId.
         */
        public Builder disputeId(Long disputeId) {
            this.putQueryParameter("DisputeId", disputeId);
            this.disputeId = disputeId;
            return this;
        }

        /**
         * GoodsStatus.
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.putQueryParameter("GoodsStatus", goodsStatus);
            this.goodsStatus = goodsStatus;
            return this;
        }

        /**
         * LeaveMessage.
         */
        public Builder leaveMessage(String leaveMessage) {
            this.putBodyParameter("LeaveMessage", leaveMessage);
            this.leaveMessage = leaveMessage;
            return this;
        }

        /**
         * LeavePictureList.
         */
        public Builder leavePictureList(java.util.List<LeavePictureList> leavePictureList) {
            this.putBodyParameter("LeavePictureList", leavePictureList);
            this.leavePictureList = leavePictureList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>38******75</p>
         */
        public Builder subLmOrderId(String subLmOrderId) {
            this.putQueryParameter("SubLmOrderId", subLmOrderId);
            this.subLmOrderId = subLmOrderId;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public ModifyRefundRequest build() {
            return new ModifyRefundRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyRefundRequest} extends {@link TeaModel}
     *
     * <p>ModifyRefundRequest</p>
     */
    public static class LeavePictureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Picture")
        private String picture;

        private LeavePictureList(Builder builder) {
            this.desc = builder.desc;
            this.picture = builder.picture;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LeavePictureList create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return picture
         */
        public String getPicture() {
            return this.picture;
        }

        public static final class Builder {
            private String desc; 
            private String picture; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Picture.
             */
            public Builder picture(String picture) {
                this.picture = picture;
                return this;
            }

            public LeavePictureList build() {
                return new LeavePictureList(this);
            } 

        } 

    }
}
