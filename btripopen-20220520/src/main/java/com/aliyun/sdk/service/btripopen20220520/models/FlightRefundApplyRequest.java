// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundApplyRequest} extends {@link RequestModel}
 *
 * <p>FlightRefundApplyRequest</p>
 */
public class FlightRefundApplyRequest extends Request {
    @Body
    @NameInMap("corp_refund_price")
    private Long corpRefundPrice;

    @Body
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Body
    @NameInMap("dis_sub_order_id")
    @Validation(required = true)
    private String disSubOrderId;

    @Body
    @NameInMap("display_refund_money")
    @Validation(required = true)
    private String displayRefundMoney;

    @Body
    @NameInMap("extra")
    private java.util.Map < String, String > extra;

    @Body
    @NameInMap("is_voluntary")
    @Validation(required = true)
    private Integer isVoluntary;

    @Body
    @NameInMap("item_unit_ids")
    @Validation(required = true)
    private String itemUnitIds;

    @Body
    @NameInMap("passenger_segment_info_list")
    private java.util.List < PassengerSegmentInfoList> passengerSegmentInfoList;

    @Body
    @NameInMap("personal_refund_price")
    private Long personalRefundPrice;

    @Body
    @NameInMap("reason_detail")
    private String reasonDetail;

    @Body
    @NameInMap("reason_type")
    @Validation(required = true)
    private Integer reasonType;

    @Body
    @NameInMap("refund_voucher_info")
    private java.util.List < String > refundVoucherInfo;

    @Body
    @NameInMap("session_id")
    @Validation(required = true)
    private String sessionId;

    @Body
    @NameInMap("total_refund_price")
    private Long totalRefundPrice;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightRefundApplyRequest(Builder builder) {
        super(builder);
        this.corpRefundPrice = builder.corpRefundPrice;
        this.disOrderId = builder.disOrderId;
        this.disSubOrderId = builder.disSubOrderId;
        this.displayRefundMoney = builder.displayRefundMoney;
        this.extra = builder.extra;
        this.isVoluntary = builder.isVoluntary;
        this.itemUnitIds = builder.itemUnitIds;
        this.passengerSegmentInfoList = builder.passengerSegmentInfoList;
        this.personalRefundPrice = builder.personalRefundPrice;
        this.reasonDetail = builder.reasonDetail;
        this.reasonType = builder.reasonType;
        this.refundVoucherInfo = builder.refundVoucherInfo;
        this.sessionId = builder.sessionId;
        this.totalRefundPrice = builder.totalRefundPrice;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightRefundApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpRefundPrice
     */
    public Long getCorpRefundPrice() {
        return this.corpRefundPrice;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return disSubOrderId
     */
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    /**
     * @return displayRefundMoney
     */
    public String getDisplayRefundMoney() {
        return this.displayRefundMoney;
    }

    /**
     * @return extra
     */
    public java.util.Map < String, String > getExtra() {
        return this.extra;
    }

    /**
     * @return isVoluntary
     */
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    /**
     * @return itemUnitIds
     */
    public String getItemUnitIds() {
        return this.itemUnitIds;
    }

    /**
     * @return passengerSegmentInfoList
     */
    public java.util.List < PassengerSegmentInfoList> getPassengerSegmentInfoList() {
        return this.passengerSegmentInfoList;
    }

    /**
     * @return personalRefundPrice
     */
    public Long getPersonalRefundPrice() {
        return this.personalRefundPrice;
    }

    /**
     * @return reasonDetail
     */
    public String getReasonDetail() {
        return this.reasonDetail;
    }

    /**
     * @return reasonType
     */
    public Integer getReasonType() {
        return this.reasonType;
    }

    /**
     * @return refundVoucherInfo
     */
    public java.util.List < String > getRefundVoucherInfo() {
        return this.refundVoucherInfo;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return totalRefundPrice
     */
    public Long getTotalRefundPrice() {
        return this.totalRefundPrice;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightRefundApplyRequest, Builder> {
        private Long corpRefundPrice; 
        private String disOrderId; 
        private String disSubOrderId; 
        private String displayRefundMoney; 
        private java.util.Map < String, String > extra; 
        private Integer isVoluntary; 
        private String itemUnitIds; 
        private java.util.List < PassengerSegmentInfoList> passengerSegmentInfoList; 
        private Long personalRefundPrice; 
        private String reasonDetail; 
        private Integer reasonType; 
        private java.util.List < String > refundVoucherInfo; 
        private String sessionId; 
        private Long totalRefundPrice; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightRefundApplyRequest request) {
            super(request);
            this.corpRefundPrice = request.corpRefundPrice;
            this.disOrderId = request.disOrderId;
            this.disSubOrderId = request.disSubOrderId;
            this.displayRefundMoney = request.displayRefundMoney;
            this.extra = request.extra;
            this.isVoluntary = request.isVoluntary;
            this.itemUnitIds = request.itemUnitIds;
            this.passengerSegmentInfoList = request.passengerSegmentInfoList;
            this.personalRefundPrice = request.personalRefundPrice;
            this.reasonDetail = request.reasonDetail;
            this.reasonType = request.reasonType;
            this.refundVoucherInfo = request.refundVoucherInfo;
            this.sessionId = request.sessionId;
            this.totalRefundPrice = request.totalRefundPrice;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 企业退款金额
         */
        public Builder corpRefundPrice(Long corpRefundPrice) {
            this.putBodyParameter("corp_refund_price", corpRefundPrice);
            this.corpRefundPrice = corpRefundPrice;
            return this;
        }

        /**
         * 分销外部订单号
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * 分销外部订单号
         */
        public Builder disSubOrderId(String disSubOrderId) {
            this.putBodyParameter("dis_sub_order_id", disSubOrderId);
            this.disSubOrderId = disSubOrderId;
            return this;
        }

        /**
         * display_refund_money.
         */
        public Builder displayRefundMoney(String displayRefundMoney) {
            this.putBodyParameter("display_refund_money", displayRefundMoney);
            this.displayRefundMoney = displayRefundMoney;
            return this;
        }

        /**
         * 扩展信息
         */
        public Builder extra(java.util.Map < String, String > extra) {
            String extraShrink = shrink(extra, "extra", "json");
            this.putBodyParameter("extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * 是否自愿:0自愿，1非自愿F
         */
        public Builder isVoluntary(Integer isVoluntary) {
            this.putBodyParameter("is_voluntary", isVoluntary);
            this.isVoluntary = isVoluntary;
            return this;
        }

        /**
         * item_unit_ids.
         */
        public Builder itemUnitIds(String itemUnitIds) {
            this.putBodyParameter("item_unit_ids", itemUnitIds);
            this.itemUnitIds = itemUnitIds;
            return this;
        }

        /**
         * 选择的要退票的乘客航段列表
         */
        public Builder passengerSegmentInfoList(java.util.List < PassengerSegmentInfoList> passengerSegmentInfoList) {
            String passengerSegmentInfoListShrink = shrink(passengerSegmentInfoList, "passenger_segment_info_list", "json");
            this.putBodyParameter("passenger_segment_info_list", passengerSegmentInfoListShrink);
            this.passengerSegmentInfoList = passengerSegmentInfoList;
            return this;
        }

        /**
         * 个人退款金额
         */
        public Builder personalRefundPrice(Long personalRefundPrice) {
            this.putBodyParameter("personal_refund_price", personalRefundPrice);
            this.personalRefundPrice = personalRefundPrice;
            return this;
        }

        /**
         * 退票原因
         */
        public Builder reasonDetail(String reasonDetail) {
            this.putBodyParameter("reason_detail", reasonDetail);
            this.reasonDetail = reasonDetail;
            return this;
        }

        /**
         * 退票原因类型(1：自愿退票（我要改变行程计划、我不想飞）；2：自愿退票（填错名字、选错日期、选错航班）；3：自愿退票（没赶上飞机、证件忘带了）；4：自愿退票（生病了无法乘机（无二甲医院证明））；5：自愿退票（其他）；6：非自愿退票（航班延误或取消、航班时刻变更等航司原因）；7：非自愿退票（身体原因且有二级甲等医院<含>以上的医院证明）；)
         */
        public Builder reasonType(Integer reasonType) {
            this.putBodyParameter("reason_type", reasonType);
            this.reasonType = reasonType;
            return this;
        }

        /**
         * 退票上传凭证信息(json格式)
         */
        public Builder refundVoucherInfo(java.util.List < String > refundVoucherInfo) {
            String refundVoucherInfoShrink = shrink(refundVoucherInfo, "refund_voucher_info", "json");
            this.putBodyParameter("refund_voucher_info", refundVoucherInfoShrink);
            this.refundVoucherInfo = refundVoucherInfo;
            return this;
        }

        /**
         * session_id.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("session_id", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * 订单退款总金额
         */
        public Builder totalRefundPrice(Long totalRefundPrice) {
            this.putBodyParameter("total_refund_price", totalRefundPrice);
            this.totalRefundPrice = totalRefundPrice;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public FlightRefundApplyRequest build() {
            return new FlightRefundApplyRequest(this);
        } 

    } 

    public static class PassengerSegmentInfoList extends TeaModel {
        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("user_id")
        private String userId;

        private PassengerSegmentInfoList(Builder builder) {
            this.flightNo = builder.flightNo;
            this.passengerName = builder.passengerName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerSegmentInfoList create() {
            return builder().build();
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String flightNo; 
            private String passengerName; 
            private String userId; 

            /**
             * 航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * 乘客姓名
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PassengerSegmentInfoList build() {
                return new PassengerSegmentInfoList(this);
            } 

        } 

    }
}
