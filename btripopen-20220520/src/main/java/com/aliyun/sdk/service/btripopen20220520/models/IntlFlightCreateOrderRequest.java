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
 * {@link IntlFlightCreateOrderRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightCreateOrderRequest</p>
 */
public class IntlFlightCreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async_create_order_key")
    private String asyncCreateOrderKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async_create_order_mode")
    private Boolean asyncCreateOrderMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact_info")
    @com.aliyun.core.annotation.Validation(required = true)
    private ContactInfo contactInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra_info")
    private java.util.Map<String, String> extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_price")
    private Long orderPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PassengerList> passengerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("render_key")
    private String renderKey;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightCreateOrderRequest(Builder builder) {
        super(builder);
        this.asyncCreateOrderKey = builder.asyncCreateOrderKey;
        this.asyncCreateOrderMode = builder.asyncCreateOrderMode;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.contactInfo = builder.contactInfo;
        this.extraInfo = builder.extraInfo;
        this.isvName = builder.isvName;
        this.orderPrice = builder.orderPrice;
        this.otaItemId = builder.otaItemId;
        this.outOrderId = builder.outOrderId;
        this.passengerList = builder.passengerList;
        this.renderKey = builder.renderKey;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightCreateOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncCreateOrderKey
     */
    public String getAsyncCreateOrderKey() {
        return this.asyncCreateOrderKey;
    }

    /**
     * @return asyncCreateOrderMode
     */
    public Boolean getAsyncCreateOrderMode() {
        return this.asyncCreateOrderMode;
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return contactInfo
     */
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return orderPrice
     */
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return passengerList
     */
    public java.util.List<PassengerList> getPassengerList() {
        return this.passengerList;
    }

    /**
     * @return renderKey
     */
    public String getRenderKey() {
        return this.renderKey;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightCreateOrderRequest, Builder> {
        private String asyncCreateOrderKey; 
        private Boolean asyncCreateOrderMode; 
        private String btripUserId; 
        private String buyerName; 
        private ContactInfo contactInfo; 
        private java.util.Map<String, String> extraInfo; 
        private String isvName; 
        private Long orderPrice; 
        private String otaItemId; 
        private String outOrderId; 
        private java.util.List<PassengerList> passengerList; 
        private String renderKey; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightCreateOrderRequest request) {
            super(request);
            this.asyncCreateOrderKey = request.asyncCreateOrderKey;
            this.asyncCreateOrderMode = request.asyncCreateOrderMode;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.contactInfo = request.contactInfo;
            this.extraInfo = request.extraInfo;
            this.isvName = request.isvName;
            this.orderPrice = request.orderPrice;
            this.otaItemId = request.otaItemId;
            this.outOrderId = request.outOrderId;
            this.passengerList = request.passengerList;
            this.renderKey = request.renderKey;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * async_create_order_key.
         */
        public Builder asyncCreateOrderKey(String asyncCreateOrderKey) {
            this.putBodyParameter("async_create_order_key", asyncCreateOrderKey);
            this.asyncCreateOrderKey = asyncCreateOrderKey;
            return this;
        }

        /**
         * async_create_order_mode.
         */
        public Builder asyncCreateOrderMode(Boolean asyncCreateOrderMode) {
            this.putBodyParameter("async_create_order_mode", asyncCreateOrderMode);
            this.asyncCreateOrderMode = asyncCreateOrderMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        public Builder buyerName(String buyerName) {
            this.putBodyParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
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
         * extra_info.
         */
        public Builder extraInfo(java.util.Map<String, String> extraInfo) {
            String extraInfoShrink = shrink(extraInfo, "extra_info", "json");
            this.putBodyParameter("extra_info", extraInfoShrink);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * order_price.
         */
        public Builder orderPrice(Long orderPrice) {
            this.putBodyParameter("order_price", orderPrice);
            this.orderPrice = orderPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putBodyParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder passengerList(java.util.List<PassengerList> passengerList) {
            String passengerListShrink = shrink(passengerList, "passenger_list", "json");
            this.putBodyParameter("passenger_list", passengerListShrink);
            this.passengerList = passengerList;
            return this;
        }

        /**
         * render_key.
         */
        public Builder renderKey(String renderKey) {
            this.putBodyParameter("render_key", renderKey);
            this.renderKey = renderKey;
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
        public IntlFlightCreateOrderRequest build() {
            return new IntlFlightCreateOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightCreateOrderRequest</p>
     */
    public static class ContactInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contact_email")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
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
     * {@link IntlFlightCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightCreateOrderRequest</p>
     */
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("cert_valid_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certValidDate;

        @com.aliyun.core.annotation.NameInMap("issue_place")
        @com.aliyun.core.annotation.Validation(required = true)
        private String issuePlace;

        private CertInfo(Builder builder) {
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.issuePlace = builder.issuePlace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
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
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return certValidDate
         */
        public String getCertValidDate() {
            return this.certValidDate;
        }

        /**
         * @return issuePlace
         */
        public String getIssuePlace() {
            return this.issuePlace;
        }

        public static final class Builder {
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String issuePlace; 

            private Builder() {
            } 

            private Builder(CertInfo model) {
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.certValidDate = model.certValidDate;
                this.issuePlace = model.issuePlace;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>E1234567</p>
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
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2029-12-31</p>
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>中国大陆</p>
             */
            public Builder issuePlace(String issuePlace) {
                this.issuePlace = issuePlace;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightCreateOrderRequest</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        @com.aliyun.core.annotation.Validation(required = true)
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("cert_info")
        @com.aliyun.core.annotation.Validation(required = true)
        private CertInfo certInfo;

        @com.aliyun.core.annotation.NameInMap("full_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("gender")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("nationality")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("nationality_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("phone")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phone;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.certInfo = builder.certInfo;
            this.fullName = builder.fullName;
            this.gender = builder.gender;
            this.jobNo = builder.jobNo;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.phone = builder.phone;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return certInfo
         */
        public CertInfo getCertInfo() {
            return this.certInfo;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
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
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String birthday; 
            private CertInfo certInfo; 
            private String fullName; 
            private Integer gender; 
            private String jobNo; 
            private String nationality; 
            private String nationalityCode; 
            private String phone; 
            private Integer type; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(PassengerList model) {
                this.birthday = model.birthday;
                this.certInfo = model.certInfo;
                this.fullName = model.fullName;
                this.gender = model.gender;
                this.jobNo = model.jobNo;
                this.nationality = model.nationality;
                this.nationalityCode = model.nationalityCode;
                this.phone = model.phone;
                this.type = model.type;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1998-12-28</p>
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder certInfo(CertInfo certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG/SAN</p>
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>中国大陆</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>13100008888</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12292812036903456</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
}
