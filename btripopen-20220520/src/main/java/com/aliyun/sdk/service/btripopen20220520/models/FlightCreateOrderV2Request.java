// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightCreateOrderV2Request} extends {@link RequestModel}
 *
 * <p>FlightCreateOrderV2Request</p>
 */
public class FlightCreateOrderV2Request extends Request {
    @Body
    @NameInMap("async_create_order_key")
    private String asyncCreateOrderKey;

    @Body
    @NameInMap("async_create_order_mode")
    private Boolean asyncCreateOrderMode;

    @Body
    @NameInMap("btrip_user_id")
    private String btripUserId;

    @Body
    @NameInMap("buyer_name")
    private String buyerName;

    @Body
    @NameInMap("contact_info")
    @Validation(required = true)
    private ContactInfo contactInfo;

    @Body
    @NameInMap("isv_name")
    @Validation(required = true)
    private String isvName;

    @Body
    @NameInMap("ota_item_id")
    @Validation(required = true)
    private String otaItemId;

    @Body
    @NameInMap("out_order_id")
    @Validation(required = true)
    private String outOrderId;

    @Body
    @NameInMap("total_price_cent")
    private Long totalPriceCent;

    @Body
    @NameInMap("travelers")
    @Validation(required = true)
    private java.util.List < Travelers> travelers;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightCreateOrderV2Request(Builder builder) {
        super(builder);
        this.asyncCreateOrderKey = builder.asyncCreateOrderKey;
        this.asyncCreateOrderMode = builder.asyncCreateOrderMode;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.contactInfo = builder.contactInfo;
        this.isvName = builder.isvName;
        this.otaItemId = builder.otaItemId;
        this.outOrderId = builder.outOrderId;
        this.totalPriceCent = builder.totalPriceCent;
        this.travelers = builder.travelers;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightCreateOrderV2Request create() {
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
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
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
     * @return totalPriceCent
     */
    public Long getTotalPriceCent() {
        return this.totalPriceCent;
    }

    /**
     * @return travelers
     */
    public java.util.List < Travelers> getTravelers() {
        return this.travelers;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightCreateOrderV2Request, Builder> {
        private String asyncCreateOrderKey; 
        private Boolean asyncCreateOrderMode; 
        private String btripUserId; 
        private String buyerName; 
        private ContactInfo contactInfo; 
        private String isvName; 
        private String otaItemId; 
        private String outOrderId; 
        private Long totalPriceCent; 
        private java.util.List < Travelers> travelers; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightCreateOrderV2Request request) {
            super(request);
            this.asyncCreateOrderKey = request.asyncCreateOrderKey;
            this.asyncCreateOrderMode = request.asyncCreateOrderMode;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.contactInfo = request.contactInfo;
            this.isvName = request.isvName;
            this.otaItemId = request.otaItemId;
            this.outOrderId = request.outOrderId;
            this.totalPriceCent = request.totalPriceCent;
            this.travelers = request.travelers;
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
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
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
         * contact_info.
         */
        public Builder contactInfo(ContactInfo contactInfo) {
            String contactInfoShrink = shrink(contactInfo, "contact_info", "json");
            this.putBodyParameter("contact_info", contactInfoShrink);
            this.contactInfo = contactInfo;
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
         * ota_item_id.
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
         * total_price_cent.
         */
        public Builder totalPriceCent(Long totalPriceCent) {
            this.putBodyParameter("total_price_cent", totalPriceCent);
            this.totalPriceCent = totalPriceCent;
            return this;
        }

        /**
         * travelers.
         */
        public Builder travelers(java.util.List < Travelers> travelers) {
            String travelersShrink = shrink(travelers, "travelers", "json");
            this.putBodyParameter("travelers", travelersShrink);
            this.travelers = travelers;
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
        public FlightCreateOrderV2Request build() {
            return new FlightCreateOrderV2Request(this);
        } 

    } 

    public static class ContactInfo extends TeaModel {
        @NameInMap("contact_email")
        private String contactEmail;

        @NameInMap("contact_name")
        private String contactName;

        @NameInMap("contact_phone")
        private String contactPhone;

        @NameInMap("send_msg_to_passenger")
        private Boolean sendMsgToPassenger;

        private ContactInfo(Builder builder) {
            this.contactEmail = builder.contactEmail;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.sendMsgToPassenger = builder.sendMsgToPassenger;
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

        /**
         * @return sendMsgToPassenger
         */
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

        public static final class Builder {
            private String contactEmail; 
            private String contactName; 
            private String contactPhone; 
            private Boolean sendMsgToPassenger; 

            /**
             * contact_email.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * contact_phone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * send_msg_to_passenger.
             */
            public Builder sendMsgToPassenger(Boolean sendMsgToPassenger) {
                this.sendMsgToPassenger = sendMsgToPassenger;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
    public static class Travelers extends TeaModel {
        @NameInMap("birthday")
        @Validation(required = true)
        private String birthday;

        @NameInMap("cert_nation")
        private String certNation;

        @NameInMap("cert_no")
        @Validation(required = true)
        private String certNo;

        @NameInMap("cert_type")
        @Validation(required = true)
        private Integer certType;

        @NameInMap("cert_valid_date")
        private String certValidDate;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("dept_id")
        private String deptId;

        @NameInMap("dept_name")
        private String deptName;

        @NameInMap("gender")
        @Validation(required = true)
        private Integer gender;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("nationality")
        private String nationality;

        @NameInMap("nationality_code")
        private String nationalityCode;

        @NameInMap("passenger_name")
        @Validation(required = true)
        private String passengerName;

        @NameInMap("passenger_type")
        @Validation(required = true)
        private Integer passengerType;

        @NameInMap("phone")
        @Validation(required = true)
        private String phone;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("user_id")
        @Validation(required = true)
        private String userId;

        @NameInMap("user_type")
        private Integer userType;

        private Travelers(Builder builder) {
            this.birthday = builder.birthday;
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.deptId = builder.deptId;
            this.deptName = builder.deptName;
            this.gender = builder.gender;
            this.invoiceTitle = builder.invoiceTitle;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.passengerName = builder.passengerName;
            this.passengerType = builder.passengerType;
            this.phone = builder.phone;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Travelers create() {
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
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        /**
         * @return deptId
         */
        public String getDeptId() {
            return this.deptId;
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
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
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
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
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String costCenterName; 
            private String costCenterNumber; 
            private String deptId; 
            private String deptName; 
            private Integer gender; 
            private String invoiceTitle; 
            private String nationality; 
            private String nationalityCode; 
            private String passengerName; 
            private Integer passengerType; 
            private String phone; 
            private String projectCode; 
            private String projectTitle; 
            private String userId; 
            private Integer userType; 

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
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
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
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * cost_center_number.
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * dept_id.
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * dept_name.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
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
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * nationality_code.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
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
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
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
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * user_id.
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

            public Travelers build() {
                return new Travelers(this);
            } 

        } 

    }
}
