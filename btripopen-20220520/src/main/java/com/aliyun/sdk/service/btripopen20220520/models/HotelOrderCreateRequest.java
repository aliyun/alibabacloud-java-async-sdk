// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderCreateRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderCreateRequest</p>
 */
public class HotelOrderCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_in")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkIn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_out")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkOut;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contract_email")
    private String contractEmail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contract_name")
    private String contractName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contract_phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contractPhone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corp_pay_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long corpPayPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("invoice_info")
    private InvoiceInfo invoiceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itinerary_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itineraryNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("occupant_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OccupantInfoList> occupantInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("person_pay_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long personPayPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("promotion_info")
    private PromotionInfo promotionInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rate_plan_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ratePlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("room_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roomId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("room_num")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer roomNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("seller_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sellerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long shid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_order_price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long totalOrderPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("validate_res_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validateResKey;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderCreateRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.contractEmail = builder.contractEmail;
        this.contractName = builder.contractName;
        this.contractPhone = builder.contractPhone;
        this.corpPayPrice = builder.corpPayPrice;
        this.disOrderId = builder.disOrderId;
        this.extra = builder.extra;
        this.invoiceInfo = builder.invoiceInfo;
        this.itemId = builder.itemId;
        this.itineraryNo = builder.itineraryNo;
        this.occupantInfoList = builder.occupantInfoList;
        this.personPayPrice = builder.personPayPrice;
        this.promotionInfo = builder.promotionInfo;
        this.ratePlanId = builder.ratePlanId;
        this.roomId = builder.roomId;
        this.roomNum = builder.roomNum;
        this.sellerId = builder.sellerId;
        this.shid = builder.shid;
        this.totalOrderPrice = builder.totalOrderPrice;
        this.validateResKey = builder.validateResKey;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderCreateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
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
     * @return contractEmail
     */
    public String getContractEmail() {
        return this.contractEmail;
    }

    /**
     * @return contractName
     */
    public String getContractName() {
        return this.contractName;
    }

    /**
     * @return contractPhone
     */
    public String getContractPhone() {
        return this.contractPhone;
    }

    /**
     * @return corpPayPrice
     */
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
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
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return itineraryNo
     */
    public String getItineraryNo() {
        return this.itineraryNo;
    }

    /**
     * @return occupantInfoList
     */
    public java.util.List < OccupantInfoList> getOccupantInfoList() {
        return this.occupantInfoList;
    }

    /**
     * @return personPayPrice
     */
    public Long getPersonPayPrice() {
        return this.personPayPrice;
    }

    /**
     * @return promotionInfo
     */
    public PromotionInfo getPromotionInfo() {
        return this.promotionInfo;
    }

    /**
     * @return ratePlanId
     */
    public Long getRatePlanId() {
        return this.ratePlanId;
    }

    /**
     * @return roomId
     */
    public Long getRoomId() {
        return this.roomId;
    }

    /**
     * @return roomNum
     */
    public Integer getRoomNum() {
        return this.roomNum;
    }

    /**
     * @return sellerId
     */
    public Long getSellerId() {
        return this.sellerId;
    }

    /**
     * @return shid
     */
    public Long getShid() {
        return this.shid;
    }

    /**
     * @return totalOrderPrice
     */
    public Long getTotalOrderPrice() {
        return this.totalOrderPrice;
    }

    /**
     * @return validateResKey
     */
    public String getValidateResKey() {
        return this.validateResKey;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelOrderCreateRequest, Builder> {
        private String btripUserId; 
        private String checkIn; 
        private String checkOut; 
        private String contractEmail; 
        private String contractName; 
        private String contractPhone; 
        private Long corpPayPrice; 
        private String disOrderId; 
        private String extra; 
        private InvoiceInfo invoiceInfo; 
        private Long itemId; 
        private String itineraryNo; 
        private java.util.List < OccupantInfoList> occupantInfoList; 
        private Long personPayPrice; 
        private PromotionInfo promotionInfo; 
        private Long ratePlanId; 
        private Long roomId; 
        private Integer roomNum; 
        private Long sellerId; 
        private Long shid; 
        private Long totalOrderPrice; 
        private String validateResKey; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderCreateRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.checkIn = request.checkIn;
            this.checkOut = request.checkOut;
            this.contractEmail = request.contractEmail;
            this.contractName = request.contractName;
            this.contractPhone = request.contractPhone;
            this.corpPayPrice = request.corpPayPrice;
            this.disOrderId = request.disOrderId;
            this.extra = request.extra;
            this.invoiceInfo = request.invoiceInfo;
            this.itemId = request.itemId;
            this.itineraryNo = request.itineraryNo;
            this.occupantInfoList = request.occupantInfoList;
            this.personPayPrice = request.personPayPrice;
            this.promotionInfo = request.promotionInfo;
            this.ratePlanId = request.ratePlanId;
            this.roomId = request.roomId;
            this.roomNum = request.roomNum;
            this.sellerId = request.sellerId;
            this.shid = request.shid;
            this.totalOrderPrice = request.totalOrderPrice;
            this.validateResKey = request.validateResKey;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * check_in.
         */
        public Builder checkIn(String checkIn) {
            this.putBodyParameter("check_in", checkIn);
            this.checkIn = checkIn;
            return this;
        }

        /**
         * check_out.
         */
        public Builder checkOut(String checkOut) {
            this.putBodyParameter("check_out", checkOut);
            this.checkOut = checkOut;
            return this;
        }

        /**
         * contract_email.
         */
        public Builder contractEmail(String contractEmail) {
            this.putBodyParameter("contract_email", contractEmail);
            this.contractEmail = contractEmail;
            return this;
        }

        /**
         * contract_name.
         */
        public Builder contractName(String contractName) {
            this.putBodyParameter("contract_name", contractName);
            this.contractName = contractName;
            return this;
        }

        /**
         * contract_phone.
         */
        public Builder contractPhone(String contractPhone) {
            this.putBodyParameter("contract_phone", contractPhone);
            this.contractPhone = contractPhone;
            return this;
        }

        /**
         * corp_pay_price.
         */
        public Builder corpPayPrice(Long corpPayPrice) {
            this.putBodyParameter("corp_pay_price", corpPayPrice);
            this.corpPayPrice = corpPayPrice;
            return this;
        }

        /**
         * dis_order_id.
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * invoice_info.
         */
        public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
            String invoiceInfoShrink = shrink(invoiceInfo, "invoice_info", "json");
            this.putBodyParameter("invoice_info", invoiceInfoShrink);
            this.invoiceInfo = invoiceInfo;
            return this;
        }

        /**
         * item_id.
         */
        public Builder itemId(Long itemId) {
            this.putBodyParameter("item_id", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * itinerary_no.
         */
        public Builder itineraryNo(String itineraryNo) {
            this.putBodyParameter("itinerary_no", itineraryNo);
            this.itineraryNo = itineraryNo;
            return this;
        }

        /**
         * occupant_info_list.
         */
        public Builder occupantInfoList(java.util.List < OccupantInfoList> occupantInfoList) {
            String occupantInfoListShrink = shrink(occupantInfoList, "occupant_info_list", "json");
            this.putBodyParameter("occupant_info_list", occupantInfoListShrink);
            this.occupantInfoList = occupantInfoList;
            return this;
        }

        /**
         * person_pay_price.
         */
        public Builder personPayPrice(Long personPayPrice) {
            this.putBodyParameter("person_pay_price", personPayPrice);
            this.personPayPrice = personPayPrice;
            return this;
        }

        /**
         * promotion_info.
         */
        public Builder promotionInfo(PromotionInfo promotionInfo) {
            String promotionInfoShrink = shrink(promotionInfo, "promotion_info", "json");
            this.putBodyParameter("promotion_info", promotionInfoShrink);
            this.promotionInfo = promotionInfo;
            return this;
        }

        /**
         * rate_plan_id.
         */
        public Builder ratePlanId(Long ratePlanId) {
            this.putBodyParameter("rate_plan_id", ratePlanId);
            this.ratePlanId = ratePlanId;
            return this;
        }

        /**
         * room_id.
         */
        public Builder roomId(Long roomId) {
            this.putBodyParameter("room_id", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * room_num.
         */
        public Builder roomNum(Integer roomNum) {
            this.putBodyParameter("room_num", roomNum);
            this.roomNum = roomNum;
            return this;
        }

        /**
         * seller_id.
         */
        public Builder sellerId(Long sellerId) {
            this.putBodyParameter("seller_id", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * shid.
         */
        public Builder shid(Long shid) {
            this.putBodyParameter("shid", shid);
            this.shid = shid;
            return this;
        }

        /**
         * total_order_price.
         */
        public Builder totalOrderPrice(Long totalOrderPrice) {
            this.putBodyParameter("total_order_price", totalOrderPrice);
            this.totalOrderPrice = totalOrderPrice;
            return this;
        }

        /**
         * validate_res_key.
         */
        public Builder validateResKey(String validateResKey) {
            this.putBodyParameter("validate_res_key", validateResKey);
            this.validateResKey = validateResKey;
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
        public HotelOrderCreateRequest build() {
            return new HotelOrderCreateRequest(this);
        } 

    } 

    public static class InvoiceInfo extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("receiver_name")
        private String receiverName;

        @com.aliyun.core.annotation.NameInMap("receiver_phone")
        private String receiverPhone;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        private InvoiceInfo(Builder builder) {
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
            private String receiverName; 
            private String receiverPhone; 
            private String remark; 

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
    public static class OccupantInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("card_no")
        private String cardNo;

        @com.aliyun.core.annotation.NameInMap("card_type")
        private Integer cardType;

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

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("phone")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phone;

        @com.aliyun.core.annotation.NameInMap("room_no")
        private Integer roomNo;

        @com.aliyun.core.annotation.NameInMap("staff_no")
        private String staffNo;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private OccupantInfoList(Builder builder) {
            this.cardNo = builder.cardNo;
            this.cardType = builder.cardType;
            this.customerType = builder.customerType;
            this.departmentId = builder.departmentId;
            this.departmentName = builder.departmentName;
            this.email = builder.email;
            this.employeeType = builder.employeeType;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.name = builder.name;
            this.phone = builder.phone;
            this.roomNo = builder.roomNo;
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
            private Integer customerType; 
            private String departmentId; 
            private String departmentName; 
            private String email; 
            private Integer employeeType; 
            private String firstName; 
            private String lastName; 
            private String name; 
            private String phone; 
            private Integer roomNo; 
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
    public static class PromotionDetailInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_status")
        private Boolean checkStatus;

        @com.aliyun.core.annotation.NameInMap("need_check")
        private Boolean needCheck;

        @com.aliyun.core.annotation.NameInMap("promotion_code")
        private String promotionCode;

        @com.aliyun.core.annotation.NameInMap("promotion_id")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("promotion_name")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("promotion_price")
        private Long promotionPrice;

        @com.aliyun.core.annotation.NameInMap("promotion_type")
        private String promotionType;

        private PromotionDetailInfoList(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.needCheck = builder.needCheck;
            this.promotionCode = builder.promotionCode;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.promotionPrice = builder.promotionPrice;
            this.promotionType = builder.promotionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionDetailInfoList create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public Boolean getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return needCheck
         */
        public Boolean getNeedCheck() {
            return this.needCheck;
        }

        /**
         * @return promotionCode
         */
        public String getPromotionCode() {
            return this.promotionCode;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionPrice
         */
        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return promotionType
         */
        public String getPromotionType() {
            return this.promotionType;
        }

        public static final class Builder {
            private Boolean checkStatus; 
            private Boolean needCheck; 
            private String promotionCode; 
            private String promotionId; 
            private String promotionName; 
            private Long promotionPrice; 
            private String promotionType; 

            /**
             * check_status.
             */
            public Builder checkStatus(Boolean checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * need_check.
             */
            public Builder needCheck(Boolean needCheck) {
                this.needCheck = needCheck;
                return this;
            }

            /**
             * promotion_code.
             */
            public Builder promotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
            }

            /**
             * promotion_id.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * promotion_name.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * promotion_price.
             */
            public Builder promotionPrice(Long promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * promotion_type.
             */
            public Builder promotionType(String promotionType) {
                this.promotionType = promotionType;
                return this;
            }

            public PromotionDetailInfoList build() {
                return new PromotionDetailInfoList(this);
            } 

        } 

    }
    public static class PromotionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("promotion_detail_info_list")
        private java.util.List < PromotionDetailInfoList> promotionDetailInfoList;

        @com.aliyun.core.annotation.NameInMap("promotion_total_price")
        private Long promotionTotalPrice;

        private PromotionInfo(Builder builder) {
            this.promotionDetailInfoList = builder.promotionDetailInfoList;
            this.promotionTotalPrice = builder.promotionTotalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionInfo create() {
            return builder().build();
        }

        /**
         * @return promotionDetailInfoList
         */
        public java.util.List < PromotionDetailInfoList> getPromotionDetailInfoList() {
            return this.promotionDetailInfoList;
        }

        /**
         * @return promotionTotalPrice
         */
        public Long getPromotionTotalPrice() {
            return this.promotionTotalPrice;
        }

        public static final class Builder {
            private java.util.List < PromotionDetailInfoList> promotionDetailInfoList; 
            private Long promotionTotalPrice; 

            /**
             * promotion_detail_info_list.
             */
            public Builder promotionDetailInfoList(java.util.List < PromotionDetailInfoList> promotionDetailInfoList) {
                this.promotionDetailInfoList = promotionDetailInfoList;
                return this;
            }

            /**
             * promotion_total_price.
             */
            public Builder promotionTotalPrice(Long promotionTotalPrice) {
                this.promotionTotalPrice = promotionTotalPrice;
                return this;
            }

            public PromotionInfo build() {
                return new PromotionInfo(this);
            } 

        } 

    }
}
