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
 * {@link FlightCreateOrderRequest} extends {@link RequestModel}
 *
 * <p>FlightCreateOrderRequest</p>
 */
public class FlightCreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arr_airport_code")
    private String arrAirportCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arr_city_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrCityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_pay")
    private Integer autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buyer_unique_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyerUniqueKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact_info")
    @com.aliyun.core.annotation.Validation(required = true)
    private ContactInfo contactInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_airport_code")
    private String depAirportCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_city_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depCityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_attr")
    private java.util.Map<String, ?> orderAttr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("price")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long price;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receipt_address")
    private String receiptAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receipt_target")
    private Integer receiptTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receipt_title")
    private String receiptTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("traveler_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TravelerInfoList> travelerInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trip_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer tripType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
    public java.util.Map<String, ?> getOrderAttr() {
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
    public java.util.List<TravelerInfoList> getTravelerInfoList() {
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
        private java.util.Map<String, ?> orderAttr; 
        private String orderParams; 
        private String otaItemId; 
        private Long price; 
        private String receiptAddress; 
        private Integer receiptTarget; 
        private String receiptTitle; 
        private java.util.List<TravelerInfoList> travelerInfoList; 
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
         * arr_airport_code.
         */
        public Builder arrAirportCode(String arrAirportCode) {
            this.putBodyParameter("arr_airport_code", arrAirportCode);
            this.arrAirportCode = arrAirportCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        public Builder arrCityCode(String arrCityCode) {
            this.putBodyParameter("arr_city_code", arrCityCode);
            this.arrCityCode = arrCityCode;
            return this;
        }

        /**
         * auto_pay.
         */
        public Builder autoPay(Integer autoPay) {
            this.putBodyParameter("auto_pay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * buyer_name.
         */
        public Builder buyerName(String buyerName) {
            this.putBodyParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder buyerUniqueKey(String buyerUniqueKey) {
            this.putBodyParameter("buyer_unique_key", buyerUniqueKey);
            this.buyerUniqueKey = buyerUniqueKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactInfo(ContactInfo contactInfo) {
            String contactInfoShrink = shrink(contactInfo, "contact_info", "json");
            this.putBodyParameter("contact_info", contactInfoShrink);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * dep_airport_code.
         */
        public Builder depAirportCode(String depAirportCode) {
            this.putBodyParameter("dep_airport_code", depAirportCode);
            this.depAirportCode = depAirportCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        public Builder depCityCode(String depCityCode) {
            this.putBodyParameter("dep_city_code", depCityCode);
            this.depCityCode = depCityCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        public Builder depDate(String depDate) {
            this.putBodyParameter("dep_date", depDate);
            this.depDate = depDate;
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
         * order_attr.
         */
        public Builder orderAttr(java.util.Map<String, ?> orderAttr) {
            String orderAttrShrink = shrink(orderAttr, "order_attr", "json");
            this.putBodyParameter("order_attr", orderAttrShrink);
            this.orderAttr = orderAttr;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000_1_0</p>
         */
        public Builder orderParams(String orderParams) {
            this.putBodyParameter("order_params", orderParams);
            this.orderParams = orderParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7fb731deeb4510b86c17e8c8c25740_11</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putBodyParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder price(Long price) {
            this.putBodyParameter("price", price);
            this.price = price;
            return this;
        }

        /**
         * receipt_address.
         */
        public Builder receiptAddress(String receiptAddress) {
            this.putBodyParameter("receipt_address", receiptAddress);
            this.receiptAddress = receiptAddress;
            return this;
        }

        /**
         * receipt_target.
         */
        public Builder receiptTarget(Integer receiptTarget) {
            this.putBodyParameter("receipt_target", receiptTarget);
            this.receiptTarget = receiptTarget;
            return this;
        }

        /**
         * receipt_title.
         */
        public Builder receiptTitle(String receiptTitle) {
            this.putBodyParameter("receipt_title", receiptTitle);
            this.receiptTitle = receiptTitle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder travelerInfoList(java.util.List<TravelerInfoList> travelerInfoList) {
            String travelerInfoListShrink = shrink(travelerInfoList, "traveler_info_list", "json");
            this.putBodyParameter("traveler_info_list", travelerInfoListShrink);
            this.travelerInfoList = travelerInfoList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

    /**
     * 
     * {@link FlightCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>FlightCreateOrderRequest</p>
     */
    public static class ContactInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contact_email")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("contact_phone")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(ContactInfo model) {
                this.contactEmail = model.contactEmail;
                this.contactName = model.contactName;
                this.contactPhone = model.contactPhone;
            } 

            /**
             * contact_email.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12312345211</p>
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
    /**
     * 
     * {@link FlightCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>FlightCreateOrderRequest</p>
     */
    public static class TravelerInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certType;

        @com.aliyun.core.annotation.NameInMap("cert_valid_date")
        private String certValidDate;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("nationality_code")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("out_user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outUserId;

        @com.aliyun.core.annotation.NameInMap("phone")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phone;

        @com.aliyun.core.annotation.NameInMap("sex")
        private Integer sex;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(TravelerInfoList model) {
                this.birthday = model.birthday;
                this.certNation = model.certNation;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.certValidDate = model.certValidDate;
                this.name = model.name;
                this.nationality = model.nationality;
                this.nationalityCode = model.nationalityCode;
                this.outUserId = model.outUserId;
                this.phone = model.phone;
                this.sex = model.sex;
                this.type = model.type;
            } 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * cert_nation.
             */
            public Builder certNation(String certNation) {
                this.certNation = certNation;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1262651555151</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * cert_valid_date.
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>国籍</p>
             * 
             * <strong>example:</strong>
             * <p>中国大陆</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>国籍二字码</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder outUserId(String outUserId) {
                this.outUserId = outUserId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12341231232</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * sex.
             */
            public Builder sex(Integer sex) {
                this.sex = sex;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
