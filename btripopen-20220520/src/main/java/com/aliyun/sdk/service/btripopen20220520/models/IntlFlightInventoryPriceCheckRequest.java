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
 * {@link IntlFlightInventoryPriceCheckRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightInventoryPriceCheckRequest</p>
 */
public class IntlFlightInventoryPriceCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_price")
    private Long orderPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PassengerList> passengerList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightInventoryPriceCheckRequest(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.language = builder.language;
        this.orderPrice = builder.orderPrice;
        this.otaItemId = builder.otaItemId;
        this.passengerList = builder.passengerList;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightInventoryPriceCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return passengerList
     */
    public java.util.List<PassengerList> getPassengerList() {
        return this.passengerList;
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

    public static final class Builder extends Request.Builder<IntlFlightInventoryPriceCheckRequest, Builder> {
        private String isvName; 
        private String language; 
        private Long orderPrice; 
        private String otaItemId; 
        private java.util.List<PassengerList> passengerList; 
        private String userId; 
        private String userName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightInventoryPriceCheckRequest request) {
            super(request);
            this.isvName = request.isvName;
            this.language = request.language;
            this.orderPrice = request.orderPrice;
            this.otaItemId = request.otaItemId;
            this.passengerList = request.passengerList;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
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
         * order_price.
         */
        public Builder orderPrice(Long orderPrice) {
            this.putQueryParameter("order_price", orderPrice);
            this.orderPrice = orderPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22111acaf9ea47c09ed0db6abc45be2d_0</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putQueryParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder passengerList(java.util.List<PassengerList> passengerList) {
            String passengerListShrink = shrink(passengerList, "passenger_list", "json");
            this.putQueryParameter("passenger_list", passengerListShrink);
            this.passengerList = passengerList;
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
        public IntlFlightInventoryPriceCheckRequest build() {
            return new IntlFlightInventoryPriceCheckRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightInventoryPriceCheckRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(CertInfo model) {
                this.certNation = model.certNation;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.certValidDate = model.certValidDate;
                this.name = model.name;
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
             * <p>H123456</p>
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
             * cert_valid_date.
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG/SAN</p>
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
    /**
     * 
     * {@link IntlFlightInventoryPriceCheckRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckRequest</p>
     */
    public static class SubsidiaryCertInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("cert_valid_date")
        private String certValidDate;

        @com.aliyun.core.annotation.NameInMap("name")
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

            private Builder() {
            } 

            private Builder(SubsidiaryCertInfoList model) {
                this.certNation = model.certNation;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.certValidDate = model.certValidDate;
                this.name = model.name;
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
             * <p>H123456</p>
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
             * cert_valid_date.
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG/SAN</p>
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
    /**
     * 
     * {@link IntlFlightInventoryPriceCheckRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckRequest</p>
     */
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
        private java.util.List<SubsidiaryCertInfoList> subsidiaryCertInfoList;

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
        public java.util.List<SubsidiaryCertInfoList> getSubsidiaryCertInfoList() {
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
            private java.util.List<SubsidiaryCertInfoList> subsidiaryCertInfoList; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(PassengerList model) {
                this.birthday = model.birthday;
                this.cascadeDeptMask = model.cascadeDeptMask;
                this.cascadeDeptName = model.cascadeDeptName;
                this.certInfo = model.certInfo;
                this.costCenterName = model.costCenterName;
                this.costCenterNumber = model.costCenterNumber;
                this.deptId = model.deptId;
                this.deptName = model.deptName;
                this.gender = model.gender;
                this.invoiceId = model.invoiceId;
                this.invoiceTitle = model.invoiceTitle;
                this.jobNo = model.jobNo;
                this.mobileCountryCode = model.mobileCountryCode;
                this.nationality = model.nationality;
                this.nationalityCode = model.nationalityCode;
                this.passengerType = model.passengerType;
                this.phone = model.phone;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
                this.subsidiaryCertInfoList = model.subsidiaryCertInfoList;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-01</p>
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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>18012341234</p>
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
            public Builder subsidiaryCertInfoList(java.util.List<SubsidiaryCertInfoList> subsidiaryCertInfoList) {
                this.subsidiaryCertInfoList = subsidiaryCertInfoList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
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
