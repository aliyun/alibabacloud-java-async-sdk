// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightCreateOrderRequest} extends {@link RequestModel}
 *
 * <p>FlightCreateOrderRequest</p>
 */
public class FlightCreateOrderRequest extends Request {
    @Body
    @NameInMap("arr_airport_code")
    private String arrAirportCode;

    @Body
    @NameInMap("arr_city_code")
    @Validation(required = true)
    private String arrCityCode;

    @Body
    @NameInMap("auto_pay")
    private Integer autoPay;

    @Body
    @NameInMap("buyer_name")
    private String buyerName;

    @Body
    @NameInMap("buyer_unique_key")
    @Validation(required = true)
    private String buyerUniqueKey;

    @Body
    @NameInMap("contact_info")
    @Validation(required = true)
    private ContactInfo contactInfo;

    @Body
    @NameInMap("dep_airport_code")
    private String depAirportCode;

    @Body
    @NameInMap("dep_city_code")
    @Validation(required = true)
    private String depCityCode;

    @Body
    @NameInMap("dep_date")
    @Validation(required = true)
    private String depDate;

    @Body
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Body
    @NameInMap("order_attr")
    private java.util.Map < String, ? > orderAttr;

    @Body
    @NameInMap("order_params")
    @Validation(required = true)
    private String orderParams;

    @Body
    @NameInMap("ota_item_id")
    @Validation(required = true)
    private String otaItemId;

    @Body
    @NameInMap("price")
    @Validation(required = true)
    private Long price;

    @Body
    @NameInMap("receipt_address")
    private String receiptAddress;

    @Body
    @NameInMap("receipt_target")
    private Integer receiptTarget;

    @Body
    @NameInMap("receipt_title")
    private String receiptTitle;

    @Body
    @NameInMap("traveler_info_list")
    @Validation(required = true)
    private java.util.List < TravelerInfoList> travelerInfoList;

    @Body
    @NameInMap("trip_type")
    @Validation(required = true)
    private Integer tripType;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightCreateOrderRequest(Builder builder) {
        super(builder);
        this.arrAirportCode = builder.arrAirportCode;
        this.arrCityCode = builder.arrCityCode;
        this.autoPay = builder.autoPay;
        this.buyerName = builder.buyerName;
        this.buyerUniqueKey = builder.buyerUniqueKey;
        this.contactInfo = builder.contactInfo;
        this.depAirportCode = builder.depAirportCode;
        this.depCityCode = builder.depCityCode;
        this.depDate = builder.depDate;
        this.disOrderId = builder.disOrderId;
        this.orderAttr = builder.orderAttr;
        this.orderParams = builder.orderParams;
        this.otaItemId = builder.otaItemId;
        this.price = builder.price;
        this.receiptAddress = builder.receiptAddress;
        this.receiptTarget = builder.receiptTarget;
        this.receiptTitle = builder.receiptTitle;
        this.travelerInfoList = builder.travelerInfoList;
        this.tripType = builder.tripType;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightCreateOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrAirportCode
     */
    public String getArrAirportCode() {
        return this.arrAirportCode;
    }

    /**
     * @return arrCityCode
     */
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    /**
     * @return autoPay
     */
    public Integer getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return buyerUniqueKey
     */
    public String getBuyerUniqueKey() {
        return this.buyerUniqueKey;
    }

    /**
     * @return contactInfo
     */
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return depAirportCode
     */
    public String getDepAirportCode() {
        return this.depAirportCode;
    }

    /**
     * @return depCityCode
     */
    public String getDepCityCode() {
        return this.depCityCode;
    }

    /**
     * @return depDate
     */
    public String getDepDate() {
        return this.depDate;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return orderAttr
     */
    public java.util.Map < String, ? > getOrderAttr() {
        return this.orderAttr;
    }

    /**
     * @return orderParams
     */
    public String getOrderParams() {
        return this.orderParams;
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return receiptAddress
     */
    public String getReceiptAddress() {
        return this.receiptAddress;
    }

    /**
     * @return receiptTarget
     */
    public Integer getReceiptTarget() {
        return this.receiptTarget;
    }

    /**
     * @return receiptTitle
     */
    public String getReceiptTitle() {
        return this.receiptTitle;
    }

    /**
     * @return travelerInfoList
     */
    public java.util.List < TravelerInfoList> getTravelerInfoList() {
        return this.travelerInfoList;
    }

    /**
     * @return tripType
     */
    public Integer getTripType() {
        return this.tripType;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightCreateOrderRequest, Builder> {
        private String arrAirportCode; 
        private String arrCityCode; 
        private Integer autoPay; 
        private String buyerName; 
        private String buyerUniqueKey; 
        private ContactInfo contactInfo; 
        private String depAirportCode; 
        private String depCityCode; 
        private String depDate; 
        private String disOrderId; 
        private java.util.Map < String, ? > orderAttr; 
        private String orderParams; 
        private String otaItemId; 
        private Long price; 
        private String receiptAddress; 
        private Integer receiptTarget; 
        private String receiptTitle; 
        private java.util.List < TravelerInfoList> travelerInfoList; 
        private Integer tripType; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightCreateOrderRequest request) {
            super(request);
            this.arrAirportCode = request.arrAirportCode;
            this.arrCityCode = request.arrCityCode;
            this.autoPay = request.autoPay;
            this.buyerName = request.buyerName;
            this.buyerUniqueKey = request.buyerUniqueKey;
            this.contactInfo = request.contactInfo;
            this.depAirportCode = request.depAirportCode;
            this.depCityCode = request.depCityCode;
            this.depDate = request.depDate;
            this.disOrderId = request.disOrderId;
            this.orderAttr = request.orderAttr;
            this.orderParams = request.orderParams;
            this.otaItemId = request.otaItemId;
            this.price = request.price;
            this.receiptAddress = request.receiptAddress;
            this.receiptTarget = request.receiptTarget;
            this.receiptTitle = request.receiptTitle;
            this.travelerInfoList = request.travelerInfoList;
            this.tripType = request.tripType;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 到达机场编码
         */
        public Builder arrAirportCode(String arrAirportCode) {
            this.putBodyParameter("arr_airport_code", arrAirportCode);
            this.arrAirportCode = arrAirportCode;
            return this;
        }

        /**
         * 到达城市编码
         */
        public Builder arrCityCode(String arrCityCode) {
            this.putBodyParameter("arr_city_code", arrCityCode);
            this.arrCityCode = arrCityCode;
            return this;
        }

        /**
         * 自动支付
         */
        public Builder autoPay(Integer autoPay) {
            this.putBodyParameter("auto_pay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * 买家姓名
         */
        public Builder buyerName(String buyerName) {
            this.putBodyParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * 分销场景，外部渠道用户唯一标识
         */
        public Builder buyerUniqueKey(String buyerUniqueKey) {
            this.putBodyParameter("buyer_unique_key", buyerUniqueKey);
            this.buyerUniqueKey = buyerUniqueKey;
            return this;
        }

        /**
         * 联系人
         */
        public Builder contactInfo(ContactInfo contactInfo) {
            String contactInfoShrink = shrink(contactInfo, "contact_info", "json");
            this.putBodyParameter("contact_info", contactInfoShrink);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * 出发机场编码
         */
        public Builder depAirportCode(String depAirportCode) {
            this.putBodyParameter("dep_airport_code", depAirportCode);
            this.depAirportCode = depAirportCode;
            return this;
        }

        /**
         * 出发城市编码
         */
        public Builder depCityCode(String depCityCode) {
            this.putBodyParameter("dep_city_code", depCityCode);
            this.depCityCode = depCityCode;
            return this;
        }

        /**
         * 出发日期
         */
        public Builder depDate(String depDate) {
            this.putBodyParameter("dep_date", depDate);
            this.depDate = depDate;
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
         * 需要订单标记字段
         */
        public Builder orderAttr(java.util.Map < String, ? > orderAttr) {
            String orderAttrShrink = shrink(orderAttr, "order_attr", "json");
            this.putBodyParameter("order_attr", orderAttrShrink);
            this.orderAttr = orderAttr;
            return this;
        }

        /**
         * 预定下单加密参数
         */
        public Builder orderParams(String orderParams) {
            this.putBodyParameter("order_params", orderParams);
            this.orderParams = orderParams;
            return this;
        }

        /**
         * 商品id
         */
        public Builder otaItemId(String otaItemId) {
            this.putBodyParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * 价格
         */
        public Builder price(Long price) {
            this.putBodyParameter("price", price);
            this.price = price;
            return this;
        }

        /**
         * 需要统一邮寄发票时，不能为空
         */
        public Builder receiptAddress(String receiptAddress) {
            this.putBodyParameter("receipt_address", receiptAddress);
            this.receiptAddress = receiptAddress;
            return this;
        }

        /**
         * 1:个人，2：公司
         */
        public Builder receiptTarget(Integer receiptTarget) {
            this.putBodyParameter("receipt_target", receiptTarget);
            this.receiptTarget = receiptTarget;
            return this;
        }

        /**
         * 需要统一邮寄发票时，不能为空
         */
        public Builder receiptTitle(String receiptTitle) {
            this.putBodyParameter("receipt_title", receiptTitle);
            this.receiptTitle = receiptTitle;
            return this;
        }

        /**
         * 乘机人列表
         */
        public Builder travelerInfoList(java.util.List < TravelerInfoList> travelerInfoList) {
            String travelerInfoListShrink = shrink(travelerInfoList, "traveler_info_list", "json");
            this.putBodyParameter("traveler_info_list", travelerInfoListShrink);
            this.travelerInfoList = travelerInfoList;
            return this;
        }

        /**
         * 行程类型
         */
        public Builder tripType(Integer tripType) {
            this.putBodyParameter("trip_type", tripType);
            this.tripType = tripType;
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
        public FlightCreateOrderRequest build() {
            return new FlightCreateOrderRequest(this);
        } 

    } 

    public static class ContactInfo extends TeaModel {
        @NameInMap("contact_email")
        private String contactEmail;

        @NameInMap("contact_name")
        @Validation(required = true)
        private String contactName;

        @NameInMap("contact_phone")
        @Validation(required = true)
        private String contactPhone;

        private ContactInfo(Builder builder) {
            this.contactEmail = builder.contactEmail;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfo create() {
            return builder().build();
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        public static final class Builder {
            private String contactEmail; 
            private String contactName; 
            private String contactPhone; 

            /**
             * 联系人邮箱
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * 联系人姓名
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * 联系人手机号
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
    public static class TravelerInfoList extends TeaModel {
        @NameInMap("birthday")
        private String birthday;

        @NameInMap("cert_nation")
        private String certNation;

        @NameInMap("cert_no")
        @Validation(required = true)
        private String certNo;

        @NameInMap("cert_type")
        @Validation(required = true)
        private String certType;

        @NameInMap("cert_valid_date")
        private String certValidDate;

        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("nationality")
        private String nationality;

        @NameInMap("nationality_code")
        private String nationalityCode;

        @NameInMap("out_user_id")
        @Validation(required = true)
        private String outUserId;

        @NameInMap("phone")
        @Validation(required = true)
        private String phone;

        @NameInMap("sex")
        private Integer sex;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        private TravelerInfoList(Builder builder) {
            this.birthday = builder.birthday;
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.name = builder.name;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.outUserId = builder.outUserId;
            this.phone = builder.phone;
            this.sex = builder.sex;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerInfoList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return certNation
         */
        public String getCertNation() {
            return this.certNation;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return certValidDate
         */
        public String getCertValidDate() {
            return this.certValidDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return outUserId
         */
        public String getOutUserId() {
            return this.outUserId;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return sex
         */
        public Integer getSex() {
            return this.sex;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthday; 
            private String certNation; 
            private String certNo; 
            private String certType; 
            private String certValidDate; 
            private String name; 
            private String nationality; 
            private String nationalityCode; 
            private String outUserId; 
            private String phone; 
            private Integer sex; 
            private String type; 

            /**
             * 生日
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * 证件签发国
             */
            public Builder certNation(String certNation) {
                this.certNation = certNation;
                return this;
            }

            /**
             * 证件号
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * 证件类型
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * 证件有效期
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * 姓名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 国籍
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * 国籍二字码
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * 员工编号
             */
            public Builder outUserId(String outUserId) {
                this.outUserId = outUserId;
                return this;
            }

            /**
             * 手机号
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * 性别
             */
            public Builder sex(Integer sex) {
                this.sex = sex;
                return this;
            }

            /**
             * 乘客类型 (ENUM_INVALID, ADULT, CHILD, INFANT, STUDENT, OTHER)
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TravelerInfoList build() {
                return new TravelerInfoList(this);
            } 

        } 

    }
}
