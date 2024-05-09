// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightCreateOrderRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightCreateOrderRequest</p>
 */
public class IntlFlightCreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("async_create_order_key")
    private String asyncCreateOrderKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("async_create_order_mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean asyncCreateOrderMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contact_info")
    private ContactInfo contactInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cost_center")
    private CostCenter costCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("extra_info")
    private java.util.Map < String, String > extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    private String otaItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("passenger_list")
    private java.util.List < PassengerList> passengerList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("render_key")
    private String renderKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("total_price_cent")
    private Long totalPriceCent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightCreateOrderRequest(Builder builder) {
        super(builder);
        this.asyncCreateOrderKey = builder.asyncCreateOrderKey;
        this.asyncCreateOrderMode = builder.asyncCreateOrderMode;
        this.contactInfo = builder.contactInfo;
        this.costCenter = builder.costCenter;
        this.extraInfo = builder.extraInfo;
        this.isvName = builder.isvName;
        this.language = builder.language;
        this.otaItemId = builder.otaItemId;
        this.outOrderId = builder.outOrderId;
        this.passengerList = builder.passengerList;
        this.renderKey = builder.renderKey;
        this.totalPriceCent = builder.totalPriceCent;
        this.userId = builder.userId;
        this.userName = builder.userName;
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
     * @return contactInfo
     */
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return costCenter
     */
    public CostCenter getCostCenter() {
        return this.costCenter;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map < String, String > getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
    public java.util.List < PassengerList> getPassengerList() {
        return this.passengerList;
    }

    /**
     * @return renderKey
     */
    public String getRenderKey() {
        return this.renderKey;
    }

    /**
     * @return totalPriceCent
     */
    public Long getTotalPriceCent() {
        return this.totalPriceCent;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
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
        private ContactInfo contactInfo; 
        private CostCenter costCenter; 
        private java.util.Map < String, String > extraInfo; 
        private String isvName; 
        private String language; 
        private String otaItemId; 
        private String outOrderId; 
        private java.util.List < PassengerList> passengerList; 
        private String renderKey; 
        private Long totalPriceCent; 
        private String userId; 
        private String userName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightCreateOrderRequest request) {
            super(request);
            this.asyncCreateOrderKey = request.asyncCreateOrderKey;
            this.asyncCreateOrderMode = request.asyncCreateOrderMode;
            this.contactInfo = request.contactInfo;
            this.costCenter = request.costCenter;
            this.extraInfo = request.extraInfo;
            this.isvName = request.isvName;
            this.language = request.language;
            this.otaItemId = request.otaItemId;
            this.outOrderId = request.outOrderId;
            this.passengerList = request.passengerList;
            this.renderKey = request.renderKey;
            this.totalPriceCent = request.totalPriceCent;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * async_create_order_key.
         */
        public Builder asyncCreateOrderKey(String asyncCreateOrderKey) {
            this.putQueryParameter("async_create_order_key", asyncCreateOrderKey);
            this.asyncCreateOrderKey = asyncCreateOrderKey;
            return this;
        }

        /**
         * async_create_order_mode.
         */
        public Builder asyncCreateOrderMode(Boolean asyncCreateOrderMode) {
            this.putQueryParameter("async_create_order_mode", asyncCreateOrderMode);
            this.asyncCreateOrderMode = asyncCreateOrderMode;
            return this;
        }

        /**
         * contact_info.
         */
        public Builder contactInfo(ContactInfo contactInfo) {
            String contactInfoShrink = shrink(contactInfo, "contact_info", "json");
            this.putQueryParameter("contact_info", contactInfoShrink);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * cost_center.
         */
        public Builder costCenter(CostCenter costCenter) {
            String costCenterShrink = shrink(costCenter, "cost_center", "json");
            this.putQueryParameter("cost_center", costCenterShrink);
            this.costCenter = costCenter;
            return this;
        }

        /**
         * extra_info.
         */
        public Builder extraInfo(java.util.Map < String, String > extraInfo) {
            String extraInfoShrink = shrink(extraInfo, "extra_info", "json");
            this.putQueryParameter("extra_info", extraInfoShrink);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * ota_item_id.
         */
        public Builder otaItemId(String otaItemId) {
            this.putQueryParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * passenger_list.
         */
        public Builder passengerList(java.util.List < PassengerList> passengerList) {
            String passengerListShrink = shrink(passengerList, "passenger_list", "json");
            this.putQueryParameter("passenger_list", passengerListShrink);
            this.passengerList = passengerList;
            return this;
        }

        /**
         * render_key.
         */
        public Builder renderKey(String renderKey) {
            this.putQueryParameter("render_key", renderKey);
            this.renderKey = renderKey;
            return this;
        }

        /**
         * total_price_cent.
         */
        public Builder totalPriceCent(Long totalPriceCent) {
            this.putQueryParameter("total_price_cent", totalPriceCent);
            this.totalPriceCent = totalPriceCent;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("user_name", userName);
            this.userName = userName;
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

        @com.aliyun.core.annotation.NameInMap("send_msg_to_passenger")
        @com.aliyun.core.annotation.Validation(required = true)
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
    public static class CostCenter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        @com.aliyun.core.annotation.Validation(required = true)
        private String costCenterNumber;

        private CostCenter(Builder builder) {
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenter create() {
            return builder().build();
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

        public static final class Builder {
            private String costCenterName; 
            private String costCenterNumber; 

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

            public CostCenter build() {
                return new CostCenter(this);
            } 

        } 

    }
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("cert_valid_date")
        private String certValidDate;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private CertInfo(Builder builder) {
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String name; 

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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    public static class SubsidiaryCertInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("cert_valid_date")
        private String certValidDate;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private SubsidiaryCertInfoList(Builder builder) {
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubsidiaryCertInfoList create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String name; 

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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SubsidiaryCertInfoList build() {
                return new SubsidiaryCertInfoList(this);
            } 

        } 

    }
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        @com.aliyun.core.annotation.Validation(required = true)
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("cascade_dept_mask")
        private String cascadeDeptMask;

        @com.aliyun.core.annotation.NameInMap("cascade_dept_name")
        private String cascadeDeptName;

        @com.aliyun.core.annotation.NameInMap("cert_info")
        @com.aliyun.core.annotation.Validation(required = true)
        private CertInfo certInfo;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("dept_id")
        private String deptId;

        @com.aliyun.core.annotation.NameInMap("dept_name")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private String invoiceId;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("nationality_code")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("passenger_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer passengerType;

        @com.aliyun.core.annotation.NameInMap("phone")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phone;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("subsidiary_cert_info_list")
        private java.util.List < SubsidiaryCertInfoList> subsidiaryCertInfoList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.cascadeDeptMask = builder.cascadeDeptMask;
            this.cascadeDeptName = builder.cascadeDeptName;
            this.certInfo = builder.certInfo;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.deptId = builder.deptId;
            this.deptName = builder.deptName;
            this.gender = builder.gender;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.jobNo = builder.jobNo;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.passengerType = builder.passengerType;
            this.phone = builder.phone;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.subsidiaryCertInfoList = builder.subsidiaryCertInfoList;
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
         * @return cascadeDeptMask
         */
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        /**
         * @return cascadeDeptName
         */
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        /**
         * @return certInfo
         */
        public CertInfo getCertInfo() {
            return this.certInfo;
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
         * @return invoiceId
         */
        public String getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return mobileCountryCode
         */
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
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
         * @return subsidiaryCertInfoList
         */
        public java.util.List < SubsidiaryCertInfoList> getSubsidiaryCertInfoList() {
            return this.subsidiaryCertInfoList;
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
            private String cascadeDeptMask; 
            private String cascadeDeptName; 
            private CertInfo certInfo; 
            private String costCenterName; 
            private String costCenterNumber; 
            private String deptId; 
            private String deptName; 
            private Integer gender; 
            private String invoiceId; 
            private String invoiceTitle; 
            private String jobNo; 
            private String mobileCountryCode; 
            private String nationality; 
            private String nationalityCode; 
            private Integer passengerType; 
            private String phone; 
            private String projectCode; 
            private String projectTitle; 
            private java.util.List < SubsidiaryCertInfoList> subsidiaryCertInfoList; 
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
             * cascade_dept_mask.
             */
            public Builder cascadeDeptMask(String cascadeDeptMask) {
                this.cascadeDeptMask = cascadeDeptMask;
                return this;
            }

            /**
             * cascade_dept_name.
             */
            public Builder cascadeDeptName(String cascadeDeptName) {
                this.cascadeDeptName = cascadeDeptName;
                return this;
            }

            /**
             * cert_info.
             */
            public Builder certInfo(CertInfo certInfo) {
                this.certInfo = certInfo;
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
             * invoice_id.
             */
            public Builder invoiceId(String invoiceId) {
                this.invoiceId = invoiceId;
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
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * mobile_country_code.
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
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
             * subsidiary_cert_info_list.
             */
            public Builder subsidiaryCertInfoList(java.util.List < SubsidiaryCertInfoList> subsidiaryCertInfoList) {
                this.subsidiaryCertInfoList = subsidiaryCertInfoList;
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

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
}
