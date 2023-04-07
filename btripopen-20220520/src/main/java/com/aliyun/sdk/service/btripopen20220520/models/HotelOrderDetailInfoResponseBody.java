// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderDetailInfoResponseBody</p>
 */
public class HotelOrderDetailInfoResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
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
        @NameInMap("hour")
        private Long hour;

        @NameInMap("value")
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
        @NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        private java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @NameInMap("cancel_policy_type")
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
        @NameInMap("cancel_end_time")
        private String cancelEndTime;

        @NameInMap("cancel_start_time")
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
             * 取消结束时间
             */
            public Builder cancelEndTime(String cancelEndTime) {
                this.cancelEndTime = cancelEndTime;
                return this;
            }

            /**
             * 取消开始时间
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
        @NameInMap("address")
        private String address;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("hotel_tel")
        private String hotelTel;

        @NameInMap("shid")
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
             * 酒店地址
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * 城市
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 酒店名
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * 酒店电话
             */
            public Builder hotelTel(String hotelTel) {
                this.hotelTel = hotelTel;
                return this;
            }

            /**
             * 酒店ID
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
    public static class InvoiceInfo extends TeaModel {
        @NameInMap("billing_money")
        private Long billingMoney;

        @NameInMap("buyer_add")
        private String buyerAdd;

        @NameInMap("buyer_bank_acc")
        private String buyerBankAcc;

        @NameInMap("buyer_bank_add")
        private String buyerBankAdd;

        @NameInMap("buyer_phone")
        private String buyerPhone;

        @NameInMap("buyer_tax_num")
        private String buyerTaxNum;

        @NameInMap("delivery_address")
        private String deliveryAddress;

        @NameInMap("delivery_area")
        private String deliveryArea;

        @NameInMap("delivery_city")
        private String deliveryCity;

        @NameInMap("delivery_province")
        private String deliveryProvince;

        @NameInMap("delivery_street")
        private String deliveryStreet;

        @NameInMap("email")
        private String email;

        @NameInMap("invoice_material")
        private Integer invoiceMaterial;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("invoice_type")
        private Integer invoiceType;

        @NameInMap("postage")
        private Long postage;

        @NameInMap("receiver_name")
        private String receiverName;

        @NameInMap("receiver_phone")
        private String receiverPhone;

        @NameInMap("remark")
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
             * 开票金额,分
             */
            public Builder billingMoney(Long billingMoney) {
                this.billingMoney = billingMoney;
                return this;
            }

            /**
             * 公司地址
             */
            public Builder buyerAdd(String buyerAdd) {
                this.buyerAdd = buyerAdd;
                return this;
            }

            /**
             * 银行账号
             */
            public Builder buyerBankAcc(String buyerBankAcc) {
                this.buyerBankAcc = buyerBankAcc;
                return this;
            }

            /**
             * 银行名称
             */
            public Builder buyerBankAdd(String buyerBankAdd) {
                this.buyerBankAdd = buyerBankAdd;
                return this;
            }

            /**
             * 公司电话
             */
            public Builder buyerPhone(String buyerPhone) {
                this.buyerPhone = buyerPhone;
                return this;
            }

            /**
             * 税号
             */
            public Builder buyerTaxNum(String buyerTaxNum) {
                this.buyerTaxNum = buyerTaxNum;
                return this;
            }

            /**
             * 配送详细地址（纸质发票必填）
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * 配送区（纸质发票必填）
             */
            public Builder deliveryArea(String deliveryArea) {
                this.deliveryArea = deliveryArea;
                return this;
            }

            /**
             * 配送城市（纸质发票必填）
             */
            public Builder deliveryCity(String deliveryCity) {
                this.deliveryCity = deliveryCity;
                return this;
            }

            /**
             * 配送省（纸质发票必填）
             */
            public Builder deliveryProvince(String deliveryProvince) {
                this.deliveryProvince = deliveryProvince;
                return this;
            }

            /**
             * 配送街道（纸质发票必填）
             */
            public Builder deliveryStreet(String deliveryStreet) {
                this.deliveryStreet = deliveryStreet;
                return this;
            }

            /**
             * 邮箱地址（电子发票必填）
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 发票材质
             */
            public Builder invoiceMaterial(Integer invoiceMaterial) {
                this.invoiceMaterial = invoiceMaterial;
                return this;
            }

            /**
             * 发票抬头
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * 发票类，只支持（1：普通发票(电子)；2：专用发票(纸质)）
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * 邮寄费,分
             */
            public Builder postage(Long postage) {
                this.postage = postage;
                return this;
            }

            /**
             * 收件人姓名（纸质发票必填）
             */
            public Builder receiverName(String receiverName) {
                this.receiverName = receiverName;
                return this;
            }

            /**
             * 收件人电话（纸质发票必填）
             */
            public Builder receiverPhone(String receiverPhone) {
                this.receiverPhone = receiverPhone;
                return this;
            }

            /**
             * 发票备注
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
        @NameInMap("cost_center_id")
        private String costCenterId;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_no")
        private String costCenterNo;

        @NameInMap("cost_center_prices")
        private Long costCenterPrices;

        @NameInMap("cost_center_ratios")
        private Long costCenterRatios;

        @NameInMap("cost_center_subject_code")
        private String costCenterSubjectCode;

        @NameInMap("cost_center_subject_name")
        private String costCenterSubjectName;

        @NameInMap("settle_subject_id")
        private String settleSubjectId;

        @NameInMap("settle_subject_name")
        private String settleSubjectName;

        @NameInMap("settle_subject_no")
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
             * 成本中心ID
             */
            public Builder costCenterId(String costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * 成本中心名称
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * 成本中心编号
             */
            public Builder costCenterNo(String costCenterNo) {
                this.costCenterNo = costCenterNo;
                return this;
            }

            /**
             * 分摊金额
             */
            public Builder costCenterPrices(Long costCenterPrices) {
                this.costCenterPrices = costCenterPrices;
                return this;
            }

            /**
             * 分摊比例（%），如值为100代表100%
             */
            public Builder costCenterRatios(Long costCenterRatios) {
                this.costCenterRatios = costCenterRatios;
                return this;
            }

            /**
             * 费用科目编号
             */
            public Builder costCenterSubjectCode(String costCenterSubjectCode) {
                this.costCenterSubjectCode = costCenterSubjectCode;
                return this;
            }

            /**
             * 费用科目名称
             */
            public Builder costCenterSubjectName(String costCenterSubjectName) {
                this.costCenterSubjectName = costCenterSubjectName;
                return this;
            }

            /**
             * 核算主体ID
             */
            public Builder settleSubjectId(String settleSubjectId) {
                this.settleSubjectId = settleSubjectId;
                return this;
            }

            /**
             * 核算主体名称
             */
            public Builder settleSubjectName(String settleSubjectName) {
                this.settleSubjectName = settleSubjectName;
                return this;
            }

            /**
             * 核算主体编号
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
        @NameInMap("card_no")
        private String cardNo;

        @NameInMap("card_type")
        private Integer cardType;

        @NameInMap("cost_center_info_list")
        private java.util.List < CostCenterInfoList> costCenterInfoList;

        @NameInMap("customer_type")
        private Integer customerType;

        @NameInMap("department_id")
        private String departmentId;

        @NameInMap("department_name")
        private String departmentName;

        @NameInMap("email")
        private String email;

        @NameInMap("employee_type")
        private Integer employeeType;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("is_booker")
        private Boolean isBooker;

        @NameInMap("last_name")
        private String lastName;

        @NameInMap("name")
        private String name;

        @NameInMap("phone")
        private String phone;

        @NameInMap("selected")
        private Boolean selected;

        @NameInMap("staff_no")
        private String staffNo;

        @NameInMap("user_type")
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
            private Boolean selected; 
            private String staffNo; 
            private Integer userType; 

            /**
             * 证件号
             */
            public Builder cardNo(String cardNo) {
                this.cardNo = cardNo;
                return this;
            }

            /**
             * 证件类型
             */
            public Builder cardType(Integer cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * 成本中心
             */
            public Builder costCenterInfoList(java.util.List < CostCenterInfoList> costCenterInfoList) {
                this.costCenterInfoList = costCenterInfoList;
                return this;
            }

            /**
             * 入住人类型
             */
            public Builder customerType(Integer customerType) {
                this.customerType = customerType;
                return this;
            }

            /**
             * 用户部门id
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * 用户部门姓名
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
                return this;
            }

            /**
             * 入住人联系email
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 员工类型
             */
            public Builder employeeType(Integer employeeType) {
                this.employeeType = employeeType;
                return this;
            }

            /**
             * 英文名
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * 是否为预订人
             */
            public Builder isBooker(Boolean isBooker) {
                this.isBooker = isBooker;
                return this;
            }

            /**
             * 英文姓
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * 入住人姓名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 入住人联系电话
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * 选择是否接受短信
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * 员工编号
             */
            public Builder staffNo(String staffNo) {
                this.staffNo = staffNo;
                return this;
            }

            /**
             * 用户类型
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
        @NameInMap("board")
        private String board;

        @NameInMap("board_num")
        private Integer boardNum;

        @NameInMap("check_in")
        private String checkIn;

        @NameInMap("rate_plan_id")
        private String ratePlanId;

        @NameInMap("rate_plan_name")
        private String ratePlanName;

        @NameInMap("room_id")
        private String roomId;

        @NameInMap("room_name")
        private String roomName;

        @NameInMap("room_price")
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
             * 餐食
             */
            public Builder board(String board) {
                this.board = board;
                return this;
            }

            /**
             * 早餐数量
             */
            public Builder boardNum(Integer boardNum) {
                this.boardNum = boardNum;
                return this;
            }

            /**
             * 入住日期
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * 价格计划id
             */
            public Builder ratePlanId(String ratePlanId) {
                this.ratePlanId = ratePlanId;
                return this;
            }

            /**
             * 价格计划名称
             */
            public Builder ratePlanName(String ratePlanName) {
                this.ratePlanName = ratePlanName;
                return this;
            }

            /**
             * 房型id
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 房型名称
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * 房间价格
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
        @NameInMap("actual_check_in_time")
        private String actualCheckInTime;

        @NameInMap("actual_check_out_time")
        private String actualCheckOutTime;

        @NameInMap("btrip_hotel_cancel_policy_d_t_o")
        private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        @NameInMap("btrip_order_id")
        private String btripOrderId;

        @NameInMap("cancel_fine")
        private Long cancelFine;

        @NameInMap("cancel_info")
        private CancelInfo cancelInfo;

        @NameInMap("check_in")
        private String checkIn;

        @NameInMap("check_out")
        private String checkOut;

        @NameInMap("code")
        private String code;

        @NameInMap("confirm_order_time")
        private String confirmOrderTime;

        @NameInMap("contract_name")
        private String contractName;

        @NameInMap("contract_tel")
        private String contractTel;

        @NameInMap("create_order_time")
        private String createOrderTime;

        @NameInMap("desc")
        private String desc;

        @NameInMap("early_arrival_time")
        private String earlyArrivalTime;

        @NameInMap("early_departure")
        private Boolean earlyDeparture;

        @NameInMap("guest_count")
        private Integer guestCount;

        @NameInMap("hotel_detail_info")
        private HotelDetailInfo hotelDetailInfo;

        @NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @NameInMap("item_id")
        private String itemId;

        @NameInMap("last_arrival_time")
        private String lastArrivalTime;

        @NameInMap("occupant_info_list")
        private java.util.List < OccupantInfoList> occupantInfoList;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("order_status_desc")
        private String orderStatusDesc;

        @NameInMap("pay_time")
        private String payTime;

        @NameInMap("product_type")
        private Integer productType;

        @NameInMap("purchase_order_id")
        private String purchaseOrderId;

        @NameInMap("refund_price")
        private Long refundPrice;

        @NameInMap("refund_reason")
        private String refundReason;

        @NameInMap("refund_service_fee")
        private Long refundServiceFee;

        @NameInMap("room_night_price_info_list")
        private java.util.List < RoomNightPriceInfoList> roomNightPriceInfoList;

        @NameInMap("room_number")
        private Integer roomNumber;

        @NameInMap("room_type_name")
        private String roomTypeName;

        @NameInMap("seller_id")
        private String sellerId;

        @NameInMap("seller_name")
        private String sellerName;

        @NameInMap("service_fee")
        private Long serviceFee;

        @NameInMap("settle_type")
        private String settleType;

        @NameInMap("supplier_order_id")
        private String supplierOrderId;

        @NameInMap("total_price")
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
            this.code = builder.code;
            this.confirmOrderTime = builder.confirmOrderTime;
            this.contractName = builder.contractName;
            this.contractTel = builder.contractTel;
            this.createOrderTime = builder.createOrderTime;
            this.desc = builder.desc;
            this.earlyArrivalTime = builder.earlyArrivalTime;
            this.earlyDeparture = builder.earlyDeparture;
            this.guestCount = builder.guestCount;
            this.hotelDetailInfo = builder.hotelDetailInfo;
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
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return desc
         */
        public String getDesc() {
            return this.desc;
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
            private String code; 
            private String confirmOrderTime; 
            private String contractName; 
            private String contractTel; 
            private String createOrderTime; 
            private String desc; 
            private String earlyArrivalTime; 
            private Boolean earlyDeparture; 
            private Integer guestCount; 
            private HotelDetailInfo hotelDetailInfo; 
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
             * 实际入住时间
             */
            public Builder actualCheckInTime(String actualCheckInTime) {
                this.actualCheckInTime = actualCheckInTime;
                return this;
            }

            /**
             * 实际离店时间
             */
            public Builder actualCheckOutTime(String actualCheckOutTime) {
                this.actualCheckOutTime = actualCheckOutTime;
                return this;
            }

            /**
             * 取消政策
             */
            public Builder btripHotelCancelPolicyDTO(BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
                this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
                return this;
            }

            /**
             * 商旅订单号
             */
            public Builder btripOrderId(String btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * 退订罚金
             */
            public Builder cancelFine(Long cancelFine) {
                this.cancelFine = cancelFine;
                return this;
            }

            /**
             * 退订信息
             */
            public Builder cancelInfo(CancelInfo cancelInfo) {
                this.cancelInfo = cancelInfo;
                return this;
            }

            /**
             * 入住日期
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * 离店日期
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * 状态码
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 确认订单时间
             */
            public Builder confirmOrderTime(String confirmOrderTime) {
                this.confirmOrderTime = confirmOrderTime;
                return this;
            }

            /**
             * 联系人姓名
             */
            public Builder contractName(String contractName) {
                this.contractName = contractName;
                return this;
            }

            /**
             * 联系人电话
             */
            public Builder contractTel(String contractTel) {
                this.contractTel = contractTel;
                return this;
            }

            /**
             * 创单时间
             */
            public Builder createOrderTime(String createOrderTime) {
                this.createOrderTime = createOrderTime;
                return this;
            }

            /**
             * 状态描述
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * 最早到达时间
             */
            public Builder earlyArrivalTime(String earlyArrivalTime) {
                this.earlyArrivalTime = earlyArrivalTime;
                return this;
            }

            /**
             * 是否提前离店
             */
            public Builder earlyDeparture(Boolean earlyDeparture) {
                this.earlyDeparture = earlyDeparture;
                return this;
            }

            /**
             * 入住人数量
             */
            public Builder guestCount(Integer guestCount) {
                this.guestCount = guestCount;
                return this;
            }

            /**
             * 酒店数据
             */
            public Builder hotelDetailInfo(HotelDetailInfo hotelDetailInfo) {
                this.hotelDetailInfo = hotelDetailInfo;
                return this;
            }

            /**
             * 发票信息
             */
            public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * 商品id
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * 最晚到达时间
             */
            public Builder lastArrivalTime(String lastArrivalTime) {
                this.lastArrivalTime = lastArrivalTime;
                return this;
            }

            /**
             * 入住人信息
             */
            public Builder occupantInfoList(java.util.List < OccupantInfoList> occupantInfoList) {
                this.occupantInfoList = occupantInfoList;
                return this;
            }

            /**
             * 订单状态
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * 订单状态描述
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * 支付时间
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * 产品类型
             */
            public Builder productType(Integer productType) {
                this.productType = productType;
                return this;
            }

            /**
             * 商旅采购单号
             */
            public Builder purchaseOrderId(String purchaseOrderId) {
                this.purchaseOrderId = purchaseOrderId;
                return this;
            }

            /**
             * 应退金额
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * 退款原因
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * 退订服务费
             */
            public Builder refundServiceFee(Long refundServiceFee) {
                this.refundServiceFee = refundServiceFee;
                return this;
            }

            /**
             * 间夜价格
             */
            public Builder roomNightPriceInfoList(java.util.List < RoomNightPriceInfoList> roomNightPriceInfoList) {
                this.roomNightPriceInfoList = roomNightPriceInfoList;
                return this;
            }

            /**
             * 房间数
             */
            public Builder roomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
                return this;
            }

            /**
             * 房型名
             */
            public Builder roomTypeName(String roomTypeName) {
                this.roomTypeName = roomTypeName;
                return this;
            }

            /**
             * 卖家id
             */
            public Builder sellerId(String sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * 卖家名称
             */
            public Builder sellerName(String sellerName) {
                this.sellerName = sellerName;
                return this;
            }

            /**
             * 服务费
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * 支付类型
             */
            public Builder settleType(String settleType) {
                this.settleType = settleType;
                return this;
            }

            /**
             * 分销商酒店订单号
             */
            public Builder supplierOrderId(String supplierOrderId) {
                this.supplierOrderId = supplierOrderId;
                return this;
            }

            /**
             * 订单总价
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
