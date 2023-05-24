// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderCreateRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderCreateRequest</p>
 */
public class HotelOrderCreateRequest extends Request {
    @Body
    @NameInMap("btrip_user_id")
    @Validation(required = true)
    private String btripUserId;

    @Body
    @NameInMap("check_in")
    @Validation(required = true)
    private String checkIn;

    @Body
    @NameInMap("check_out")
    @Validation(required = true)
    private String checkOut;

    @Body
    @NameInMap("contract_email")
    private String contractEmail;

    @Body
    @NameInMap("contract_name")
    private String contractName;

    @Body
    @NameInMap("contract_phone")
    @Validation(required = true)
    private String contractPhone;

    @Body
    @NameInMap("corp_pay_price")
    @Validation(required = true)
    private Long corpPayPrice;

    @Body
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Body
    @NameInMap("invoice_info")
    private InvoiceInfo invoiceInfo;

    @Body
    @NameInMap("item_id")
    @Validation(required = true)
    private Long itemId;

    @Body
    @NameInMap("itinerary_no")
    @Validation(required = true)
    private String itineraryNo;

    @Body
    @NameInMap("occupant_info_list")
    @Validation(required = true)
    private java.util.List < OccupantInfoList> occupantInfoList;

    @Body
    @NameInMap("person_pay_price")
    @Validation(required = true)
    private Long personPayPrice;

    @Body
    @NameInMap("promotion_info")
    private PromotionInfo promotionInfo;

    @Body
    @NameInMap("rate_plan_id")
    @Validation(required = true)
    private Long ratePlanId;

    @Body
    @NameInMap("room_id")
    @Validation(required = true)
    private Long roomId;

    @Body
    @NameInMap("room_num")
    @Validation(required = true)
    private Integer roomNum;

    @Body
    @NameInMap("seller_id")
    @Validation(required = true)
    private Long sellerId;

    @Body
    @NameInMap("shid")
    @Validation(required = true)
    private Long shid;

    @Body
    @NameInMap("total_order_price")
    @Validation(required = true)
    private Long totalOrderPrice;

    @Body
    @NameInMap("validate_res_key")
    @Validation(required = true)
    private String validateResKey;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
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
         * 入住日期
         */
        public Builder checkIn(String checkIn) {
            this.putBodyParameter("check_in", checkIn);
            this.checkIn = checkIn;
            return this;
        }

        /**
         * 离店日期
         */
        public Builder checkOut(String checkOut) {
            this.putBodyParameter("check_out", checkOut);
            this.checkOut = checkOut;
            return this;
        }

        /**
         * 联系人邮箱
         */
        public Builder contractEmail(String contractEmail) {
            this.putBodyParameter("contract_email", contractEmail);
            this.contractEmail = contractEmail;
            return this;
        }

        /**
         * 联系人姓名
         */
        public Builder contractName(String contractName) {
            this.putBodyParameter("contract_name", contractName);
            this.contractName = contractName;
            return this;
        }

        /**
         * 联系人电话
         */
        public Builder contractPhone(String contractPhone) {
            this.putBodyParameter("contract_phone", contractPhone);
            this.contractPhone = contractPhone;
            return this;
        }

        /**
         * 企业支付金额
         */
        public Builder corpPayPrice(Long corpPayPrice) {
            this.putBodyParameter("corp_pay_price", corpPayPrice);
            this.corpPayPrice = corpPayPrice;
            return this;
        }

        /**
         * 分销商订单id
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * 发票信息区块
         */
        public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
            String invoiceInfoShrink = shrink(invoiceInfo, "invoice_info", "json");
            this.putBodyParameter("invoice_info", invoiceInfoShrink);
            this.invoiceInfo = invoiceInfo;
            return this;
        }

        /**
         * 商品id
         */
        public Builder itemId(Long itemId) {
            this.putBodyParameter("item_id", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * btrip行程Id
         */
        public Builder itineraryNo(String itineraryNo) {
            this.putBodyParameter("itinerary_no", itineraryNo);
            this.itineraryNo = itineraryNo;
            return this;
        }

        /**
         * 入住人区块
         */
        public Builder occupantInfoList(java.util.List < OccupantInfoList> occupantInfoList) {
            String occupantInfoListShrink = shrink(occupantInfoList, "occupant_info_list", "json");
            this.putBodyParameter("occupant_info_list", occupantInfoListShrink);
            this.occupantInfoList = occupantInfoList;
            return this;
        }

        /**
         * 个人支付金额
         */
        public Builder personPayPrice(Long personPayPrice) {
            this.putBodyParameter("person_pay_price", personPayPrice);
            this.personPayPrice = personPayPrice;
            return this;
        }

        /**
         * 优惠信息区块
         */
        public Builder promotionInfo(PromotionInfo promotionInfo) {
            String promotionInfoShrink = shrink(promotionInfo, "promotion_info", "json");
            this.putBodyParameter("promotion_info", promotionInfoShrink);
            this.promotionInfo = promotionInfo;
            return this;
        }

        /**
         * 产品编号
         */
        public Builder ratePlanId(Long ratePlanId) {
            this.putBodyParameter("rate_plan_id", ratePlanId);
            this.ratePlanId = ratePlanId;
            return this;
        }

        /**
         * 房间id
         */
        public Builder roomId(Long roomId) {
            this.putBodyParameter("room_id", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 房间数
         */
        public Builder roomNum(Integer roomNum) {
            this.putBodyParameter("room_num", roomNum);
            this.roomNum = roomNum;
            return this;
        }

        /**
         * 卖家id
         */
        public Builder sellerId(Long sellerId) {
            this.putBodyParameter("seller_id", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * 标准酒店id
         */
        public Builder shid(Long shid) {
            this.putBodyParameter("shid", shid);
            this.shid = shid;
            return this;
        }

        /**
         * 总订单价格
         */
        public Builder totalOrderPrice(Long totalOrderPrice) {
            this.putBodyParameter("total_order_price", totalOrderPrice);
            this.totalOrderPrice = totalOrderPrice;
            return this;
        }

        /**
         * 渲染结果
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

        @NameInMap("receiver_name")
        private String receiverName;

        @NameInMap("receiver_phone")
        private String receiverPhone;

        @NameInMap("remark")
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
    public static class OccupantInfoList extends TeaModel {
        @NameInMap("card_no")
        private String cardNo;

        @NameInMap("card_type")
        private Integer cardType;

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

        @NameInMap("last_name")
        private String lastName;

        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("phone")
        @Validation(required = true)
        private String phone;

        @NameInMap("staff_no")
        private String staffNo;

        @NameInMap("user_type")
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
    public static class PromotionDetailInfoList extends TeaModel {
        @NameInMap("check_status")
        private Boolean checkStatus;

        @NameInMap("need_check")
        private Boolean needCheck;

        @NameInMap("promotion_id")
        private String promotionId;

        @NameInMap("promotion_name")
        private String promotionName;

        @NameInMap("promotion_price")
        private Long promotionPrice;

        @NameInMap("promotion_type")
        private String promotionType;

        private PromotionDetailInfoList(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.needCheck = builder.needCheck;
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
            private String promotionId; 
            private String promotionName; 
            private Long promotionPrice; 
            private String promotionType; 

            /**
             * 选中状态
             */
            public Builder checkStatus(Boolean checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * 是否需要选中
             */
            public Builder needCheck(Boolean needCheck) {
                this.needCheck = needCheck;
                return this;
            }

            /**
             * 优惠Id
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * 优惠名称
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * 优惠金额
             */
            public Builder promotionPrice(Long promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * 优惠类型
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
        @NameInMap("promotion_detail_info_list")
        private java.util.List < PromotionDetailInfoList> promotionDetailInfoList;

        @NameInMap("promotion_total_price")
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
             * 优惠信息
             */
            public Builder promotionDetailInfoList(java.util.List < PromotionDetailInfoList> promotionDetailInfoList) {
                this.promotionDetailInfoList = promotionDetailInfoList;
                return this;
            }

            /**
             * 总优惠金额
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
