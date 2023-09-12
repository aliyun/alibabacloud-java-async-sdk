// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRefund4DistributionRequest} extends {@link RequestModel}
 *
 * <p>ModifyRefund4DistributionRequest</p>
 */
public class ModifyRefund4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ApplyReasonTextId")
    private Long applyReasonTextId;

    @Body
    @NameInMap("ApplyRefundCount")
    private Integer applyRefundCount;

    @Body
    @NameInMap("ApplyRefundFee")
    private Long applyRefundFee;

    @Body
    @NameInMap("BizClaimType")
    private Integer bizClaimType;

    @Body
    @NameInMap("DisputeId")
    private Long disputeId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("GoodsStatus")
    private Integer goodsStatus;

    @Body
    @NameInMap("LeaveMessage")
    private String leaveMessage;

    @Body
    @NameInMap("LeavePictureLists")
    private java.util.List < LeavePictureLists> leavePictureLists;

    @Body
    @NameInMap("SubDistributionOrderId")
    private String subDistributionOrderId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private ModifyRefund4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyReasonTextId = builder.applyReasonTextId;
        this.applyRefundCount = builder.applyRefundCount;
        this.applyRefundFee = builder.applyRefundFee;
        this.bizClaimType = builder.bizClaimType;
        this.disputeId = builder.disputeId;
        this.distributorId = builder.distributorId;
        this.goodsStatus = builder.goodsStatus;
        this.leaveMessage = builder.leaveMessage;
        this.leavePictureLists = builder.leavePictureLists;
        this.subDistributionOrderId = builder.subDistributionOrderId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRefund4DistributionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
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
     * @return leavePictureLists
     */
    public java.util.List < LeavePictureLists> getLeavePictureLists() {
        return this.leavePictureLists;
    }

    /**
     * @return subDistributionOrderId
     */
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ModifyRefund4DistributionRequest, Builder> {
        private String regionId; 
        private Long applyReasonTextId; 
        private Integer applyRefundCount; 
        private Long applyRefundFee; 
        private Integer bizClaimType; 
        private Long disputeId; 
        private String distributorId; 
        private Integer goodsStatus; 
        private String leaveMessage; 
        private java.util.List < LeavePictureLists> leavePictureLists; 
        private String subDistributionOrderId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRefund4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applyReasonTextId = request.applyReasonTextId;
            this.applyRefundCount = request.applyRefundCount;
            this.applyRefundFee = request.applyRefundFee;
            this.bizClaimType = request.bizClaimType;
            this.disputeId = request.disputeId;
            this.distributorId = request.distributorId;
            this.goodsStatus = request.goodsStatus;
            this.leaveMessage = request.leaveMessage;
            this.leavePictureLists = request.leavePictureLists;
            this.subDistributionOrderId = request.subDistributionOrderId;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ApplyReasonTextId.
         */
        public Builder applyReasonTextId(Long applyReasonTextId) {
            this.putBodyParameter("ApplyReasonTextId", applyReasonTextId);
            this.applyReasonTextId = applyReasonTextId;
            return this;
        }

        /**
         * ApplyRefundCount.
         */
        public Builder applyRefundCount(Integer applyRefundCount) {
            this.putBodyParameter("ApplyRefundCount", applyRefundCount);
            this.applyRefundCount = applyRefundCount;
            return this;
        }

        /**
         * ApplyRefundFee.
         */
        public Builder applyRefundFee(Long applyRefundFee) {
            this.putBodyParameter("ApplyRefundFee", applyRefundFee);
            this.applyRefundFee = applyRefundFee;
            return this;
        }

        /**
         * BizClaimType.
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.putBodyParameter("BizClaimType", bizClaimType);
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * DisputeId.
         */
        public Builder disputeId(Long disputeId) {
            this.putBodyParameter("DisputeId", disputeId);
            this.disputeId = disputeId;
            return this;
        }

        /**
         * DistributorId.
         */
        public Builder distributorId(String distributorId) {
            this.putBodyParameter("DistributorId", distributorId);
            this.distributorId = distributorId;
            return this;
        }

        /**
         * GoodsStatus.
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.putBodyParameter("GoodsStatus", goodsStatus);
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
         * LeavePictureLists.
         */
        public Builder leavePictureLists(java.util.List < LeavePictureLists> leavePictureLists) {
            String leavePictureListsShrink = shrink(leavePictureLists, "LeavePictureLists", "json");
            this.putBodyParameter("LeavePictureLists", leavePictureListsShrink);
            this.leavePictureLists = leavePictureLists;
            return this;
        }

        /**
         * SubDistributionOrderId.
         */
        public Builder subDistributionOrderId(String subDistributionOrderId) {
            this.putBodyParameter("SubDistributionOrderId", subDistributionOrderId);
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ModifyRefund4DistributionRequest build() {
            return new ModifyRefund4DistributionRequest(this);
        } 

    } 

    public static class LeavePictureLists extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Picture")
        private String picture;

        private LeavePictureLists(Builder builder) {
            this.desc = builder.desc;
            this.picture = builder.picture;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LeavePictureLists create() {
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

            public LeavePictureLists build() {
                return new LeavePictureLists(this);
            } 

        } 

    }
}
