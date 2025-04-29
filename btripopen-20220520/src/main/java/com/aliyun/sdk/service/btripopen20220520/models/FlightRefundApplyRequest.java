// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link FlightRefundApplyRequest} extends {@link RequestModel}
 *
 * <p>FlightRefundApplyRequest</p>
 */
public class FlightRefundApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corp_refund_price")
    private Long corpRefundPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disSubOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("display_refund_money")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayRefundMoney;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, String> extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_voluntary")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer isVoluntary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("item_unit_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemUnitIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_segment_info_list")
    private java.util.List<PassengerSegmentInfoList> passengerSegmentInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("personal_refund_price")
    private Long personalRefundPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason_detail")
    private String reasonDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer reasonType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_voucher_info")
    private java.util.List<String> refundVoucherInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("session_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_refund_price")
    private Long totalRefundPrice;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
    public java.util.Map<String, String> getExtra() {
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
    public java.util.List<PassengerSegmentInfoList> getPassengerSegmentInfoList() {
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
    public java.util.List<String> getRefundVoucherInfo() {
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
        private java.util.Map<String, String> extra; 
        private Integer isVoluntary; 
        private String itemUnitIds; 
        private java.util.List<PassengerSegmentInfoList> passengerSegmentInfoList; 
        private Long personalRefundPrice; 
        private String reasonDetail; 
        private Integer reasonType; 
        private java.util.List<String> refundVoucherInfo; 
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
         * corp_refund_price.
         */
        public Builder corpRefundPrice(Long corpRefundPrice) {
            this.putBodyParameter("corp_refund_price", corpRefundPrice);
            this.corpRefundPrice = corpRefundPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>refu123</p>
         */
        public Builder disSubOrderId(String disSubOrderId) {
            this.putBodyParameter("dis_sub_order_id", disSubOrderId);
            this.disSubOrderId = disSubOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder displayRefundMoney(String displayRefundMoney) {
            this.putBodyParameter("display_refund_money", displayRefundMoney);
            this.displayRefundMoney = displayRefundMoney;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map<String, String> extra) {
            String extraShrink = shrink(extra, "extra", "json");
            this.putBodyParameter("extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isVoluntary(Integer isVoluntary) {
            this.putBodyParameter("is_voluntary", isVoluntary);
            this.isVoluntary = isVoluntary;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FlightItem_9966772382</p>
         */
        public Builder itemUnitIds(String itemUnitIds) {
            this.putBodyParameter("item_unit_ids", itemUnitIds);
            this.itemUnitIds = itemUnitIds;
            return this;
        }

        /**
         * passenger_segment_info_list.
         */
        public Builder passengerSegmentInfoList(java.util.List<PassengerSegmentInfoList> passengerSegmentInfoList) {
            String passengerSegmentInfoListShrink = shrink(passengerSegmentInfoList, "passenger_segment_info_list", "json");
            this.putBodyParameter("passenger_segment_info_list", passengerSegmentInfoListShrink);
            this.passengerSegmentInfoList = passengerSegmentInfoList;
            return this;
        }

        /**
         * personal_refund_price.
         */
        public Builder personalRefundPrice(Long personalRefundPrice) {
            this.putBodyParameter("personal_refund_price", personalRefundPrice);
            this.personalRefundPrice = personalRefundPrice;
            return this;
        }

        /**
         * reason_detail.
         */
        public Builder reasonDetail(String reasonDetail) {
            this.putBodyParameter("reason_detail", reasonDetail);
            this.reasonDetail = reasonDetail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reasonType(Integer reasonType) {
            this.putBodyParameter("reason_type", reasonType);
            this.reasonType = reasonType;
            return this;
        }

        /**
         * refund_voucher_info.
         */
        public Builder refundVoucherInfo(java.util.List<String> refundVoucherInfo) {
            String refundVoucherInfoShrink = shrink(refundVoucherInfo, "refund_voucher_info", "json");
            this.putBodyParameter("refund_voucher_info", refundVoucherInfoShrink);
            this.refundVoucherInfo = refundVoucherInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0f9418cd2ce34af49ab0de16fea166d1</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("session_id", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * total_refund_price.
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

    /**
     * 
     * {@link FlightRefundApplyRequest} extends {@link TeaModel}
     *
     * <p>FlightRefundApplyRequest</p>
     */
    public static class PassengerSegmentInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("user_id")
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

            private Builder() {
            } 

            private Builder(PassengerSegmentInfoList model) {
                this.flightNo = model.flightNo;
                this.passengerName = model.passengerName;
                this.userId = model.userId;
            } 

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * user_id.
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
