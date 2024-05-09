// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderDetailInfoResponseBody</p>
 */
public class HotelOrderDetailInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelOrderDetailInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderDetailInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelOrderDetailInfoResponseBody build() {
            return new HotelOrderDetailInfoResponseBody(this);
        } 

    } 

    public static class BtripHotelCancelPolicyInfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hour")
        private Long hour;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private BtripHotelCancelPolicyInfoDTOList(Builder builder) {
            this.hour = builder.hour;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripHotelCancelPolicyInfoDTOList create() {
            return builder().build();
        }

        /**
         * @return hour
         */
        public Long getHour() {
            return this.hour;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long hour; 
            private Long value; 

            /**
             * hour.
             */
            public Builder hour(Long hour) {
                this.hour = hour;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public BtripHotelCancelPolicyInfoDTOList build() {
                return new BtripHotelCancelPolicyInfoDTOList(this);
            } 

        } 

    }
    public static class BtripHotelCancelPolicyDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        private java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_type")
        private Integer cancelPolicyType;

        private BtripHotelCancelPolicyDTO(Builder builder) {
            this.btripHotelCancelPolicyInfoDTOList = builder.btripHotelCancelPolicyInfoDTOList;
            this.cancelPolicyType = builder.cancelPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripHotelCancelPolicyDTO create() {
            return builder().build();
        }

        /**
         * @return btripHotelCancelPolicyInfoDTOList
         */
        public java.util.List < BtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        /**
         * @return cancelPolicyType
         */
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

        public static final class Builder {
            private java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList; 
            private Integer cancelPolicyType; 

            /**
             * btrip_hotel_cancel_policy_info_d_t_o_list.
             */
            public Builder btripHotelCancelPolicyInfoDTOList(java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
                this.btripHotelCancelPolicyInfoDTOList = btripHotelCancelPolicyInfoDTOList;
                return this;
            }

            /**
             * cancel_policy_type.
             */
            public Builder cancelPolicyType(Integer cancelPolicyType) {
                this.cancelPolicyType = cancelPolicyType;
                return this;
            }

            public BtripHotelCancelPolicyDTO build() {
                return new BtripHotelCancelPolicyDTO(this);
            } 

        } 

    }
    public static class CancelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_end_time")
        private String cancelEndTime;

        @com.aliyun.core.annotation.NameInMap("cancel_start_time")
        private String cancelStartTime;

        private CancelInfo(Builder builder) {
            this.cancelEndTime = builder.cancelEndTime;
            this.cancelStartTime = builder.cancelStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancelInfo create() {
            return builder().build();
        }

        /**
         * @return cancelEndTime
         */
        public String getCancelEndTime() {
            return this.cancelEndTime;
        }

        /**
         * @return cancelStartTime
         */
        public String getCancelStartTime() {
            return this.cancelStartTime;
        }

        public static final class Builder {
            private String cancelEndTime; 
            private String cancelStartTime; 

            /**
             * cancel_end_time.
             */
            public Builder cancelEndTime(String cancelEndTime) {
                this.cancelEndTime = cancelEndTime;
                return this;
            }

            /**
             * cancel_start_time.
             */
            public Builder cancelStartTime(String cancelStartTime) {
                this.cancelStartTime = cancelStartTime;
                return this;
            }

            public CancelInfo build() {
                return new CancelInfo(this);
            } 

        } 

    }
    public static class HotelDetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("hotel_tel")
        private String hotelTel;

        @com.aliyun.core.annotation.NameInMap("shid")
        private Long shid;

        private HotelDetailInfo(Builder builder) {
            this.address = builder.address;
            this.cityName = builder.cityName;
            this.hotelName = builder.hotelName;
            this.hotelTel = builder.hotelTel;
            this.shid = builder.shid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelDetailInfo create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelTel
         */
        public String getHotelTel() {
            return this.hotelTel;
        }

        /**
         * @return shid
         */
        public Long getShid() {
            return this.shid;
        }

        public static final class Builder {
            private String address; 
            private String cityName; 
            private String hotelName; 
            private String hotelTel; 
            private Long shid; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * hotel_tel.
             */
            public Builder hotelTel(String hotelTel) {
                this.hotelTel = hotelTel;
                return this;
            }

            /**
             * shid.
             */
            public Builder shid(Long shid) {
                this.shid = shid;
                return this;
            }

            public HotelDetailInfo build() {
                return new HotelDetailInfo(this);
            } 

        } 

    }
    public static class HotelSaleOrderRoomInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkin_date")
        private String checkinDate;

        @com.aliyun.core.annotation.NameInMap("checkout_date")
        private String checkoutDate;

        @com.aliyun.core.annotation.NameInMap("penal_sum")
        private Long penalSum;

        @com.aliyun.core.annotation.NameInMap("real_checkout_date")
        private String realCheckoutDate;

        @com.aliyun.core.annotation.NameInMap("refund_status")
        private Integer refundStatus;

        @com.aliyun.core.annotation.NameInMap("room_no")
        private Integer roomNo;

        @com.aliyun.core.annotation.NameInMap("room_price")
        private Long roomPrice;

        @com.aliyun.core.annotation.NameInMap("room_refund_price")
        private Long roomRefundPrice;

        @com.aliyun.core.annotation.NameInMap("traveler_id")
        private String travelerId;

        @com.aliyun.core.annotation.NameInMap("traveler_name")
        private String travelerName;

        private HotelSaleOrderRoomInfos(Builder builder) {
            this.checkinDate = builder.checkinDate;
            this.checkoutDate = builder.checkoutDate;
            this.penalSum = builder.penalSum;
            this.realCheckoutDate = builder.realCheckoutDate;
            this.refundStatus = builder.refundStatus;
            this.roomNo = builder.roomNo;
            this.roomPrice = builder.roomPrice;
            this.roomRefundPrice = builder.roomRefundPrice;
            this.travelerId = builder.travelerId;
            this.travelerName = builder.travelerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelSaleOrderRoomInfos create() {
            return builder().build();
        }

        /**
         * @return checkinDate
         */
        public String getCheckinDate() {
            return this.checkinDate;
        }

        /**
         * @return checkoutDate
         */
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        /**
         * @return penalSum
         */
        public Long getPenalSum() {
            return this.penalSum;
        }

        /**
         * @return realCheckoutDate
         */
        public String getRealCheckoutDate() {
            return this.realCheckoutDate;
        }

        /**
         * @return refundStatus
         */
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return roomNo
         */
        public Integer getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return roomPrice
         */
        public Long getRoomPrice() {
            return this.roomPrice;
        }

        /**
         * @return roomRefundPrice
         */
        public Long getRoomRefundPrice() {
            return this.roomRefundPrice;
        }

        /**
         * @return travelerId
         */
        public String getTravelerId() {
            return this.travelerId;
        }

        /**
         * @return travelerName
         */
        public String getTravelerName() {
            return this.travelerName;
        }

        public static final class Builder {
            private String checkinDate; 
            private String checkoutDate; 
            private Long penalSum; 
            private String realCheckoutDate; 
            private Integer refundStatus; 
            private Integer roomNo; 
            private Long roomPrice; 
            private Long roomRefundPrice; 
            private String travelerId; 
            private String travelerName; 

            /**
             * checkin_date.
             */
            public Builder checkinDate(String checkinDate) {
                this.checkinDate = checkinDate;
                return this;
            }

            /**
             * checkout_date.
             */
            public Builder checkoutDate(String checkoutDate) {
                this.checkoutDate = checkoutDate;
                return this;
            }

            /**
             * penal_sum.
             */
            public Builder penalSum(Long penalSum) {
                this.penalSum = penalSum;
                return this;
            }

            /**
             * real_checkout_date.
             */
            public Builder realCheckoutDate(String realCheckoutDate) {
                this.realCheckoutDate = realCheckoutDate;
                return this;
            }

            /**
             * refund_status.
             */
            public Builder refundStatus(Integer refundStatus) {
                this.refundStatus = refundStatus;
                return this;
            }

            /**
             * room_no.
             */
            public Builder roomNo(Integer roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * room_price.
             */
            public Builder roomPrice(Long roomPrice) {
                this.roomPrice = roomPrice;
                return this;
            }

            /**
             * room_refund_price.
             */
            public Builder roomRefundPrice(Long roomRefundPrice) {
                this.roomRefundPrice = roomRefundPrice;
                return this;
            }

            /**
             * traveler_id.
             */
            public Builder travelerId(String travelerId) {
                this.travelerId = travelerId;
                return this;
            }

            /**
             * traveler_name.
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
                return this;
            }

            public HotelSaleOrderRoomInfos build() {
                return new HotelSaleOrderRoomInfos(this);
            } 

        } 

    }
    public static class InvoiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billing_money")
        private Long billingMoney;

        @com.aliyun.core.annotation.NameInMap("buyer_add")
        private String buyerAdd;

        @com.aliyun.core.annotation.NameInMap("buyer_bank_acc")
        private String buyerBankAcc;

        @com.aliyun.core.annotation.NameInMap("buyer_bank_add")
        private String buyerBankAdd;

        @com.aliyun.core.annotation.NameInMap("buyer_phone")
        private String buyerPhone;

        @com.aliyun.core.annotation.NameInMap("buyer_tax_num")
        private String buyerTaxNum;

        @com.aliyun.core.annotation.NameInMap("delivery_address")
        private String deliveryAddress;

        @com.aliyun.core.annotation.NameInMap("delivery_area")
        private String deliveryArea;

        @com.aliyun.core.annotation.NameInMap("delivery_city")
        private String deliveryCity;

        @com.aliyun.core.annotation.NameInMap("delivery_province")
        private String deliveryProvince;

        @com.aliyun.core.annotation.NameInMap("delivery_street")
        private String deliveryStreet;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("invoice_material")
        private Integer invoiceMaterial;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("invoice_type")
        private Integer invoiceType;

        @com.aliyun.core.annotation.NameInMap("postage")
        private Long postage;

        @com.aliyun.core.annotation.NameInMap("receiver_name")
        private String receiverName;

        @com.aliyun.core.annotation.NameInMap("receiver_phone")
        private String receiverPhone;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        private InvoiceInfo(Builder builder) {
            this.billingMoney = builder.billingMoney;
            this.buyerAdd = builder.buyerAdd;
            this.buyerBankAcc = builder.buyerBankAcc;
            this.buyerBankAdd = builder.buyerBankAdd;
            this.buyerPhone = builder.buyerPhone;
            this.buyerTaxNum = builder.buyerTaxNum;
            this.deliveryAddress = builder.deliveryAddress;
            this.deliveryArea = builder.deliveryArea;
            this.deliveryCity = builder.deliveryCity;
            this.deliveryProvince = builder.deliveryProvince;
            this.deliveryStreet = builder.deliveryStreet;
            this.email = builder.email;
            this.invoiceMaterial = builder.invoiceMaterial;
            this.invoiceTitle = builder.invoiceTitle;
            this.invoiceType = builder.invoiceType;
            this.postage = builder.postage;
            this.receiverName = builder.receiverName;
            this.receiverPhone = builder.receiverPhone;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceInfo create() {
            return builder().build();
        }

        /**
         * @return billingMoney
         */
        public Long getBillingMoney() {
            return this.billingMoney;
        }

        /**
         * @return buyerAdd
         */
        public String getBuyerAdd() {
            return this.buyerAdd;
        }

        /**
         * @return buyerBankAcc
         */
        public String getBuyerBankAcc() {
            return this.buyerBankAcc;
        }

        /**
         * @return buyerBankAdd
         */
        public String getBuyerBankAdd() {
            return this.buyerBankAdd;
        }

        /**
         * @return buyerPhone
         */
        public String getBuyerPhone() {
            return this.buyerPhone;
        }

        /**
         * @return buyerTaxNum
         */
        public String getBuyerTaxNum() {
            return this.buyerTaxNum;
        }

        /**
         * @return deliveryAddress
         */
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        /**
         * @return deliveryArea
         */
        public String getDeliveryArea() {
            return this.deliveryArea;
        }

        /**
         * @return deliveryCity
         */
        public String getDeliveryCity() {
            return this.deliveryCity;
        }

        /**
         * @return deliveryProvince
         */
        public String getDeliveryProvince() {
            return this.deliveryProvince;
        }

        /**
         * @return deliveryStreet
         */
        public String getDeliveryStreet() {
            return this.deliveryStreet;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return invoiceMaterial
         */
        public Integer getInvoiceMaterial() {
            return this.invoiceMaterial;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return postage
         */
        public Long getPostage() {
            return this.postage;
        }

        /**
         * @return receiverName
         */
        public String getReceiverName() {
            return this.receiverName;
        }

        /**
         * @return receiverPhone
         */
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Long billingMoney; 
            private String buyerAdd; 
            private String buyerBankAcc; 
            private String buyerBankAdd; 
            private String buyerPhone; 
            private String buyerTaxNum; 
            private String deliveryAddress; 
            private String deliveryArea; 
            private String deliveryCity; 
            private String deliveryProvince; 
            private String deliveryStreet; 
            private String email; 
            private Integer invoiceMaterial; 
            private String invoiceTitle; 
            private Integer invoiceType; 
            private Long postage; 
            private String receiverName; 
            private String receiverPhone; 
            private String remark; 

            /**
             * billing_money.
             */
            public Builder billingMoney(Long billingMoney) {
                this.billingMoney = billingMoney;
                return this;
            }

            /**
             * buyer_add.
             */
            public Builder buyerAdd(String buyerAdd) {
                this.buyerAdd = buyerAdd;
                return this;
            }

            /**
             * buyer_bank_acc.
             */
            public Builder buyerBankAcc(String buyerBankAcc) {
                this.buyerBankAcc = buyerBankAcc;
                return this;
            }

            /**
             * buyer_bank_add.
             */
            public Builder buyerBankAdd(String buyerBankAdd) {
                this.buyerBankAdd = buyerBankAdd;
                return this;
            }

            /**
             * buyer_phone.
             */
            public Builder buyerPhone(String buyerPhone) {
                this.buyerPhone = buyerPhone;
                return this;
            }

            /**
             * buyer_tax_num.
             */
            public Builder buyerTaxNum(String buyerTaxNum) {
                this.buyerTaxNum = buyerTaxNum;
                return this;
            }

            /**
             * delivery_address.
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * delivery_area.
             */
            public Builder deliveryArea(String deliveryArea) {
                this.deliveryArea = deliveryArea;
                return this;
            }

            /**
             * delivery_city.
             */
            public Builder deliveryCity(String deliveryCity) {
                this.deliveryCity = deliveryCity;
                return this;
            }

            /**
             * delivery_province.
             */
            public Builder deliveryProvince(String deliveryProvince) {
                this.deliveryProvince = deliveryProvince;
                return this;
            }

            /**
             * delivery_street.
             */
            public Builder deliveryStreet(String deliveryStreet) {
                this.deliveryStreet = deliveryStreet;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * invoice_material.
             */
            public Builder invoiceMaterial(Integer invoiceMaterial) {
                this.invoiceMaterial = invoiceMaterial;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * invoice_type.
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * postage.
             */
            public Builder postage(Long postage) {
                this.postage = postage;
                return this;
            }

            /**
             * receiver_name.
             */
            public Builder receiverName(String receiverName) {
                this.receiverName = receiverName;
                return this;
            }

            /**
             * receiver_phone.
             */
            public Builder receiverPhone(String receiverPhone) {
                this.receiverPhone = receiverPhone;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public InvoiceInfo build() {
                return new InvoiceInfo(this);
            } 

        } 

    }
    public static class CostCenterInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private String costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_no")
        private String costCenterNo;

        @com.aliyun.core.annotation.NameInMap("cost_center_prices")
        private Long costCenterPrices;

        @com.aliyun.core.annotation.NameInMap("cost_center_ratios")
        private Long costCenterRatios;

        @com.aliyun.core.annotation.NameInMap("cost_center_subject_code")
        private String costCenterSubjectCode;

        @com.aliyun.core.annotation.NameInMap("cost_center_subject_name")
        private String costCenterSubjectName;

        @com.aliyun.core.annotation.NameInMap("settle_subject_id")
        private String settleSubjectId;

        @com.aliyun.core.annotation.NameInMap("settle_subject_name")
        private String settleSubjectName;

        @com.aliyun.core.annotation.NameInMap("settle_subject_no")
        private String settleSubjectNo;

        private CostCenterInfoList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNo = builder.costCenterNo;
            this.costCenterPrices = builder.costCenterPrices;
            this.costCenterRatios = builder.costCenterRatios;
            this.costCenterSubjectCode = builder.costCenterSubjectCode;
            this.costCenterSubjectName = builder.costCenterSubjectName;
            this.settleSubjectId = builder.settleSubjectId;
            this.settleSubjectName = builder.settleSubjectName;
            this.settleSubjectNo = builder.settleSubjectNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterInfoList create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public String getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNo
         */
        public String getCostCenterNo() {
            return this.costCenterNo;
        }

        /**
         * @return costCenterPrices
         */
        public Long getCostCenterPrices() {
            return this.costCenterPrices;
        }

        /**
         * @return costCenterRatios
         */
        public Long getCostCenterRatios() {
            return this.costCenterRatios;
        }

        /**
         * @return costCenterSubjectCode
         */
        public String getCostCenterSubjectCode() {
            return this.costCenterSubjectCode;
        }

        /**
         * @return costCenterSubjectName
         */
        public String getCostCenterSubjectName() {
            return this.costCenterSubjectName;
        }

        /**
         * @return settleSubjectId
         */
        public String getSettleSubjectId() {
            return this.settleSubjectId;
        }

        /**
         * @return settleSubjectName
         */
        public String getSettleSubjectName() {
            return this.settleSubjectName;
        }

        /**
         * @return settleSubjectNo
         */
        public String getSettleSubjectNo() {
            return this.settleSubjectNo;
        }

        public static final class Builder {
            private String costCenterId; 
            private String costCenterName; 
            private String costCenterNo; 
            private Long costCenterPrices; 
            private Long costCenterRatios; 
            private String costCenterSubjectCode; 
            private String costCenterSubjectName; 
            private String settleSubjectId; 
            private String settleSubjectName; 
            private String settleSubjectNo; 

            /**
             * cost_center_id.
             */
            public Builder costCenterId(String costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * cost_center_no.
             */
            public Builder costCenterNo(String costCenterNo) {
                this.costCenterNo = costCenterNo;
                return this;
            }

            /**
             * cost_center_prices.
             */
            public Builder costCenterPrices(Long costCenterPrices) {
                this.costCenterPrices = costCenterPrices;
                return this;
            }

            /**
             * cost_center_ratios.
             */
            public Builder costCenterRatios(Long costCenterRatios) {
                this.costCenterRatios = costCenterRatios;
                return this;
            }

            /**
             * cost_center_subject_code.
             */
            public Builder costCenterSubjectCode(String costCenterSubjectCode) {
                this.costCenterSubjectCode = costCenterSubjectCode;
                return this;
            }

            /**
             * cost_center_subject_name.
             */
            public Builder costCenterSubjectName(String costCenterSubjectName) {
                this.costCenterSubjectName = costCenterSubjectName;
                return this;
            }

            /**
             * settle_subject_id.
             */
            public Builder settleSubjectId(String settleSubjectId) {
                this.settleSubjectId = settleSubjectId;
                return this;
            }

            /**
             * settle_subject_name.
             */
            public Builder settleSubjectName(String settleSubjectName) {
                this.settleSubjectName = settleSubjectName;
                return this;
            }

            /**
             * settle_subject_no.
             */
            public Builder settleSubjectNo(String settleSubjectNo) {
                this.settleSubjectNo = settleSubjectNo;
                return this;
            }

            public CostCenterInfoList build() {
                return new CostCenterInfoList(this);
            } 

        } 

    }
    public static class OccupantInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("card_no")
        private String cardNo;

        @com.aliyun.core.annotation.NameInMap("card_type")
        private Integer cardType;

        @com.aliyun.core.annotation.NameInMap("cost_center_info_list")
        private java.util.List < CostCenterInfoList> costCenterInfoList;

        @com.aliyun.core.annotation.NameInMap("customer_type")
        private Integer customerType;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("department_name")
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("employee_type")
        private Integer employeeType;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("is_booker")
        private Boolean isBooker;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("room_no")
        private Integer roomNo;

        @com.aliyun.core.annotation.NameInMap("selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("staff_no")
        private String staffNo;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private OccupantInfoList(Builder builder) {
            this.cardNo = builder.cardNo;
            this.cardType = builder.cardType;
            this.costCenterInfoList = builder.costCenterInfoList;
            this.customerType = builder.customerType;
            this.departmentId = builder.departmentId;
            this.departmentName = builder.departmentName;
            this.email = builder.email;
            this.employeeType = builder.employeeType;
            this.firstName = builder.firstName;
            this.isBooker = builder.isBooker;
            this.lastName = builder.lastName;
            this.name = builder.name;
            this.phone = builder.phone;
            this.roomNo = builder.roomNo;
            this.selected = builder.selected;
            this.staffNo = builder.staffNo;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OccupantInfoList create() {
            return builder().build();
        }

        /**
         * @return cardNo
         */
        public String getCardNo() {
            return this.cardNo;
        }

        /**
         * @return cardType
         */
        public Integer getCardType() {
            return this.cardType;
        }

        /**
         * @return costCenterInfoList
         */
        public java.util.List < CostCenterInfoList> getCostCenterInfoList() {
            return this.costCenterInfoList;
        }

        /**
         * @return customerType
         */
        public Integer getCustomerType() {
            return this.customerType;
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return employeeType
         */
        public Integer getEmployeeType() {
            return this.employeeType;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return isBooker
         */
        public Boolean getIsBooker() {
            return this.isBooker;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return roomNo
         */
        public Integer getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return staffNo
         */
        public String getStaffNo() {
            return this.staffNo;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String cardNo; 
            private Integer cardType; 
            private java.util.List < CostCenterInfoList> costCenterInfoList; 
            private Integer customerType; 
            private String departmentId; 
            private String departmentName; 
            private String email; 
            private Integer employeeType; 
            private String firstName; 
            private Boolean isBooker; 
            private String lastName; 
            private String name; 
            private String phone; 
            private Integer roomNo; 
            private Boolean selected; 
            private String staffNo; 
            private Integer userType; 

            /**
             * card_no.
             */
            public Builder cardNo(String cardNo) {
                this.cardNo = cardNo;
                return this;
            }

            /**
             * card_type.
             */
            public Builder cardType(Integer cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * cost_center_info_list.
             */
            public Builder costCenterInfoList(java.util.List < CostCenterInfoList> costCenterInfoList) {
                this.costCenterInfoList = costCenterInfoList;
                return this;
            }

            /**
             * customer_type.
             */
            public Builder customerType(Integer customerType) {
                this.customerType = customerType;
                return this;
            }

            /**
             * department_id.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * department_name.
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * employee_type.
             */
            public Builder employeeType(Integer employeeType) {
                this.employeeType = employeeType;
                return this;
            }

            /**
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * is_booker.
             */
            public Builder isBooker(Boolean isBooker) {
                this.isBooker = isBooker;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * room_no.
             */
            public Builder roomNo(Integer roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * staff_no.
             */
            public Builder staffNo(String staffNo) {
                this.staffNo = staffNo;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public OccupantInfoList build() {
                return new OccupantInfoList(this);
            } 

        } 

    }
    public static class RoomNightPriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("board")
        private String board;

        @com.aliyun.core.annotation.NameInMap("board_num")
        private Integer boardNum;

        @com.aliyun.core.annotation.NameInMap("check_in")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("rate_plan_id")
        private String ratePlanId;

        @com.aliyun.core.annotation.NameInMap("rate_plan_name")
        private String ratePlanName;

        @com.aliyun.core.annotation.NameInMap("room_id")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("room_name")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("room_price")
        private Long roomPrice;

        private RoomNightPriceInfoList(Builder builder) {
            this.board = builder.board;
            this.boardNum = builder.boardNum;
            this.checkIn = builder.checkIn;
            this.ratePlanId = builder.ratePlanId;
            this.ratePlanName = builder.ratePlanName;
            this.roomId = builder.roomId;
            this.roomName = builder.roomName;
            this.roomPrice = builder.roomPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomNightPriceInfoList create() {
            return builder().build();
        }

        /**
         * @return board
         */
        public String getBoard() {
            return this.board;
        }

        /**
         * @return boardNum
         */
        public Integer getBoardNum() {
            return this.boardNum;
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return ratePlanId
         */
        public String getRatePlanId() {
            return this.ratePlanId;
        }

        /**
         * @return ratePlanName
         */
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return roomName
         */
        public String getRoomName() {
            return this.roomName;
        }

        /**
         * @return roomPrice
         */
        public Long getRoomPrice() {
            return this.roomPrice;
        }

        public static final class Builder {
            private String board; 
            private Integer boardNum; 
            private String checkIn; 
            private String ratePlanId; 
            private String ratePlanName; 
            private String roomId; 
            private String roomName; 
            private Long roomPrice; 

            /**
             * board.
             */
            public Builder board(String board) {
                this.board = board;
                return this;
            }

            /**
             * board_num.
             */
            public Builder boardNum(Integer boardNum) {
                this.boardNum = boardNum;
                return this;
            }

            /**
             * check_in.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * rate_plan_id.
             */
            public Builder ratePlanId(String ratePlanId) {
                this.ratePlanId = ratePlanId;
                return this;
            }

            /**
             * rate_plan_name.
             */
            public Builder ratePlanName(String ratePlanName) {
                this.ratePlanName = ratePlanName;
                return this;
            }

            /**
             * room_id.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * room_name.
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * room_price.
             */
            public Builder roomPrice(Long roomPrice) {
                this.roomPrice = roomPrice;
                return this;
            }

            public RoomNightPriceInfoList build() {
                return new RoomNightPriceInfoList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actual_check_in_time")
        private String actualCheckInTime;

        @com.aliyun.core.annotation.NameInMap("actual_check_out_time")
        private String actualCheckOutTime;

        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_d_t_o")
        private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        @com.aliyun.core.annotation.NameInMap("btrip_order_id")
        private String btripOrderId;

        @com.aliyun.core.annotation.NameInMap("cancel_fine")
        private Long cancelFine;

        @com.aliyun.core.annotation.NameInMap("cancel_info")
        private CancelInfo cancelInfo;

        @com.aliyun.core.annotation.NameInMap("check_in")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("check_out")
        private String checkOut;

        @com.aliyun.core.annotation.NameInMap("confirm_order_time")
        private String confirmOrderTime;

        @com.aliyun.core.annotation.NameInMap("contract_name")
        private String contractName;

        @com.aliyun.core.annotation.NameInMap("contract_tel")
        private String contractTel;

        @com.aliyun.core.annotation.NameInMap("create_order_time")
        private String createOrderTime;

        @com.aliyun.core.annotation.NameInMap("early_arrival_time")
        private String earlyArrivalTime;

        @com.aliyun.core.annotation.NameInMap("early_departure")
        private Boolean earlyDeparture;

        @com.aliyun.core.annotation.NameInMap("guest_count")
        private Integer guestCount;

        @com.aliyun.core.annotation.NameInMap("hotel_detail_info")
        private HotelDetailInfo hotelDetailInfo;

        @com.aliyun.core.annotation.NameInMap("hotel_sale_order_room_infos")
        private java.util.List < HotelSaleOrderRoomInfos> hotelSaleOrderRoomInfos;

        @com.aliyun.core.annotation.NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("item_id")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("last_arrival_time")
        private String lastArrivalTime;

        @com.aliyun.core.annotation.NameInMap("occupant_info_list")
        private java.util.List < OccupantInfoList> occupantInfoList;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("product_type")
        private Integer productType;

        @com.aliyun.core.annotation.NameInMap("purchase_order_id")
        private String purchaseOrderId;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        @com.aliyun.core.annotation.NameInMap("refund_reason")
        private String refundReason;

        @com.aliyun.core.annotation.NameInMap("refund_service_fee")
        private Long refundServiceFee;

        @com.aliyun.core.annotation.NameInMap("room_night_price_info_list")
        private java.util.List < RoomNightPriceInfoList> roomNightPriceInfoList;

        @com.aliyun.core.annotation.NameInMap("room_number")
        private Integer roomNumber;

        @com.aliyun.core.annotation.NameInMap("room_type_name")
        private String roomTypeName;

        @com.aliyun.core.annotation.NameInMap("seller_id")
        private String sellerId;

        @com.aliyun.core.annotation.NameInMap("seller_name")
        private String sellerName;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Long serviceFee;

        @com.aliyun.core.annotation.NameInMap("settle_type")
        private String settleType;

        @com.aliyun.core.annotation.NameInMap("supplier_order_id")
        private String supplierOrderId;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Long totalPrice;

        private Module(Builder builder) {
            this.actualCheckInTime = builder.actualCheckInTime;
            this.actualCheckOutTime = builder.actualCheckOutTime;
            this.btripHotelCancelPolicyDTO = builder.btripHotelCancelPolicyDTO;
            this.btripOrderId = builder.btripOrderId;
            this.cancelFine = builder.cancelFine;
            this.cancelInfo = builder.cancelInfo;
            this.checkIn = builder.checkIn;
            this.checkOut = builder.checkOut;
            this.confirmOrderTime = builder.confirmOrderTime;
            this.contractName = builder.contractName;
            this.contractTel = builder.contractTel;
            this.createOrderTime = builder.createOrderTime;
            this.earlyArrivalTime = builder.earlyArrivalTime;
            this.earlyDeparture = builder.earlyDeparture;
            this.guestCount = builder.guestCount;
            this.hotelDetailInfo = builder.hotelDetailInfo;
            this.hotelSaleOrderRoomInfos = builder.hotelSaleOrderRoomInfos;
            this.invoiceInfo = builder.invoiceInfo;
            this.itemId = builder.itemId;
            this.lastArrivalTime = builder.lastArrivalTime;
            this.occupantInfoList = builder.occupantInfoList;
            this.orderStatus = builder.orderStatus;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.payTime = builder.payTime;
            this.productType = builder.productType;
            this.purchaseOrderId = builder.purchaseOrderId;
            this.refundPrice = builder.refundPrice;
            this.refundReason = builder.refundReason;
            this.refundServiceFee = builder.refundServiceFee;
            this.roomNightPriceInfoList = builder.roomNightPriceInfoList;
            this.roomNumber = builder.roomNumber;
            this.roomTypeName = builder.roomTypeName;
            this.sellerId = builder.sellerId;
            this.sellerName = builder.sellerName;
            this.serviceFee = builder.serviceFee;
            this.settleType = builder.settleType;
            this.supplierOrderId = builder.supplierOrderId;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return actualCheckInTime
         */
        public String getActualCheckInTime() {
            return this.actualCheckInTime;
        }

        /**
         * @return actualCheckOutTime
         */
        public String getActualCheckOutTime() {
            return this.actualCheckOutTime;
        }

        /**
         * @return btripHotelCancelPolicyDTO
         */
        public BtripHotelCancelPolicyDTO getBtripHotelCancelPolicyDTO() {
            return this.btripHotelCancelPolicyDTO;
        }

        /**
         * @return btripOrderId
         */
        public String getBtripOrderId() {
            return this.btripOrderId;
        }

        /**
         * @return cancelFine
         */
        public Long getCancelFine() {
            return this.cancelFine;
        }

        /**
         * @return cancelInfo
         */
        public CancelInfo getCancelInfo() {
            return this.cancelInfo;
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return checkOut
         */
        public String getCheckOut() {
            return this.checkOut;
        }

        /**
         * @return confirmOrderTime
         */
        public String getConfirmOrderTime() {
            return this.confirmOrderTime;
        }

        /**
         * @return contractName
         */
        public String getContractName() {
            return this.contractName;
        }

        /**
         * @return contractTel
         */
        public String getContractTel() {
            return this.contractTel;
        }

        /**
         * @return createOrderTime
         */
        public String getCreateOrderTime() {
            return this.createOrderTime;
        }

        /**
         * @return earlyArrivalTime
         */
        public String getEarlyArrivalTime() {
            return this.earlyArrivalTime;
        }

        /**
         * @return earlyDeparture
         */
        public Boolean getEarlyDeparture() {
            return this.earlyDeparture;
        }

        /**
         * @return guestCount
         */
        public Integer getGuestCount() {
            return this.guestCount;
        }

        /**
         * @return hotelDetailInfo
         */
        public HotelDetailInfo getHotelDetailInfo() {
            return this.hotelDetailInfo;
        }

        /**
         * @return hotelSaleOrderRoomInfos
         */
        public java.util.List < HotelSaleOrderRoomInfos> getHotelSaleOrderRoomInfos() {
            return this.hotelSaleOrderRoomInfos;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return lastArrivalTime
         */
        public String getLastArrivalTime() {
            return this.lastArrivalTime;
        }

        /**
         * @return occupantInfoList
         */
        public java.util.List < OccupantInfoList> getOccupantInfoList() {
            return this.occupantInfoList;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return productType
         */
        public Integer getProductType() {
            return this.productType;
        }

        /**
         * @return purchaseOrderId
         */
        public String getPurchaseOrderId() {
            return this.purchaseOrderId;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        /**
         * @return refundReason
         */
        public String getRefundReason() {
            return this.refundReason;
        }

        /**
         * @return refundServiceFee
         */
        public Long getRefundServiceFee() {
            return this.refundServiceFee;
        }

        /**
         * @return roomNightPriceInfoList
         */
        public java.util.List < RoomNightPriceInfoList> getRoomNightPriceInfoList() {
            return this.roomNightPriceInfoList;
        }

        /**
         * @return roomNumber
         */
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        /**
         * @return roomTypeName
         */
        public String getRoomTypeName() {
            return this.roomTypeName;
        }

        /**
         * @return sellerId
         */
        public String getSellerId() {
            return this.sellerId;
        }

        /**
         * @return sellerName
         */
        public String getSellerName() {
            return this.sellerName;
        }

        /**
         * @return serviceFee
         */
        public Long getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return settleType
         */
        public String getSettleType() {
            return this.settleType;
        }

        /**
         * @return supplierOrderId
         */
        public String getSupplierOrderId() {
            return this.supplierOrderId;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String actualCheckInTime; 
            private String actualCheckOutTime; 
            private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO; 
            private String btripOrderId; 
            private Long cancelFine; 
            private CancelInfo cancelInfo; 
            private String checkIn; 
            private String checkOut; 
            private String confirmOrderTime; 
            private String contractName; 
            private String contractTel; 
            private String createOrderTime; 
            private String earlyArrivalTime; 
            private Boolean earlyDeparture; 
            private Integer guestCount; 
            private HotelDetailInfo hotelDetailInfo; 
            private java.util.List < HotelSaleOrderRoomInfos> hotelSaleOrderRoomInfos; 
            private InvoiceInfo invoiceInfo; 
            private String itemId; 
            private String lastArrivalTime; 
            private java.util.List < OccupantInfoList> occupantInfoList; 
            private Integer orderStatus; 
            private String orderStatusDesc; 
            private String payTime; 
            private Integer productType; 
            private String purchaseOrderId; 
            private Long refundPrice; 
            private String refundReason; 
            private Long refundServiceFee; 
            private java.util.List < RoomNightPriceInfoList> roomNightPriceInfoList; 
            private Integer roomNumber; 
            private String roomTypeName; 
            private String sellerId; 
            private String sellerName; 
            private Long serviceFee; 
            private String settleType; 
            private String supplierOrderId; 
            private Long totalPrice; 

            /**
             * actual_check_in_time.
             */
            public Builder actualCheckInTime(String actualCheckInTime) {
                this.actualCheckInTime = actualCheckInTime;
                return this;
            }

            /**
             * actual_check_out_time.
             */
            public Builder actualCheckOutTime(String actualCheckOutTime) {
                this.actualCheckOutTime = actualCheckOutTime;
                return this;
            }

            /**
             * btrip_hotel_cancel_policy_d_t_o.
             */
            public Builder btripHotelCancelPolicyDTO(BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
                this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
                return this;
            }

            /**
             * btrip_order_id.
             */
            public Builder btripOrderId(String btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * cancel_fine.
             */
            public Builder cancelFine(Long cancelFine) {
                this.cancelFine = cancelFine;
                return this;
            }

            /**
             * cancel_info.
             */
            public Builder cancelInfo(CancelInfo cancelInfo) {
                this.cancelInfo = cancelInfo;
                return this;
            }

            /**
             * check_in.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * check_out.
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * confirm_order_time.
             */
            public Builder confirmOrderTime(String confirmOrderTime) {
                this.confirmOrderTime = confirmOrderTime;
                return this;
            }

            /**
             * contract_name.
             */
            public Builder contractName(String contractName) {
                this.contractName = contractName;
                return this;
            }

            /**
             * contract_tel.
             */
            public Builder contractTel(String contractTel) {
                this.contractTel = contractTel;
                return this;
            }

            /**
             * create_order_time.
             */
            public Builder createOrderTime(String createOrderTime) {
                this.createOrderTime = createOrderTime;
                return this;
            }

            /**
             * early_arrival_time.
             */
            public Builder earlyArrivalTime(String earlyArrivalTime) {
                this.earlyArrivalTime = earlyArrivalTime;
                return this;
            }

            /**
             * early_departure.
             */
            public Builder earlyDeparture(Boolean earlyDeparture) {
                this.earlyDeparture = earlyDeparture;
                return this;
            }

            /**
             * guest_count.
             */
            public Builder guestCount(Integer guestCount) {
                this.guestCount = guestCount;
                return this;
            }

            /**
             * hotel_detail_info.
             */
            public Builder hotelDetailInfo(HotelDetailInfo hotelDetailInfo) {
                this.hotelDetailInfo = hotelDetailInfo;
                return this;
            }

            /**
             * hotel_sale_order_room_infos.
             */
            public Builder hotelSaleOrderRoomInfos(java.util.List < HotelSaleOrderRoomInfos> hotelSaleOrderRoomInfos) {
                this.hotelSaleOrderRoomInfos = hotelSaleOrderRoomInfos;
                return this;
            }

            /**
             * invoice_info.
             */
            public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * item_id.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * last_arrival_time.
             */
            public Builder lastArrivalTime(String lastArrivalTime) {
                this.lastArrivalTime = lastArrivalTime;
                return this;
            }

            /**
             * occupant_info_list.
             */
            public Builder occupantInfoList(java.util.List < OccupantInfoList> occupantInfoList) {
                this.occupantInfoList = occupantInfoList;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * order_status_desc.
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * product_type.
             */
            public Builder productType(Integer productType) {
                this.productType = productType;
                return this;
            }

            /**
             * purchase_order_id.
             */
            public Builder purchaseOrderId(String purchaseOrderId) {
                this.purchaseOrderId = purchaseOrderId;
                return this;
            }

            /**
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * refund_reason.
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * refund_service_fee.
             */
            public Builder refundServiceFee(Long refundServiceFee) {
                this.refundServiceFee = refundServiceFee;
                return this;
            }

            /**
             * room_night_price_info_list.
             */
            public Builder roomNightPriceInfoList(java.util.List < RoomNightPriceInfoList> roomNightPriceInfoList) {
                this.roomNightPriceInfoList = roomNightPriceInfoList;
                return this;
            }

            /**
             * room_number.
             */
            public Builder roomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
                return this;
            }

            /**
             * room_type_name.
             */
            public Builder roomTypeName(String roomTypeName) {
                this.roomTypeName = roomTypeName;
                return this;
            }

            /**
             * seller_id.
             */
            public Builder sellerId(String sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * seller_name.
             */
            public Builder sellerName(String sellerName) {
                this.sellerName = sellerName;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * settle_type.
             */
            public Builder settleType(String settleType) {
                this.settleType = settleType;
                return this;
            }

            /**
             * supplier_order_id.
             */
            public Builder supplierOrderId(String supplierOrderId) {
                this.supplierOrderId = supplierOrderId;
                return this;
            }

            /**
             * total_price.
             */
            public Builder totalPrice(Long totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
