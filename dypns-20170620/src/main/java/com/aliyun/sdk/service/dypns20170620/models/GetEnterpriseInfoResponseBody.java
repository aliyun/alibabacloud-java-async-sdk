// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link GetEnterpriseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnterpriseInfoResponseBody</p>
 */
public class GetEnterpriseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEnterpriseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEnterpriseInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEnterpriseInfoResponseBody build() {
            return new GetEnterpriseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEnterpriseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnterpriseInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditDesc")
        private String auditDesc;

        @com.aliyun.core.annotation.NameInMap("AuditTime")
        private String auditTime;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseAddress")
        private String businessLicenseAddress;

        @com.aliyun.core.annotation.NameInMap("BusinessLicensePicture")
        private String businessLicensePicture;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("EnterpriseName")
        private String enterpriseName;

        @com.aliyun.core.annotation.NameInMap("LegalPersonCertNumber")
        private String legalPersonCertNumber;

        @com.aliyun.core.annotation.NameInMap("LegalPersonCertPicture")
        private String legalPersonCertPicture;

        @com.aliyun.core.annotation.NameInMap("LegalPersonName")
        private String legalPersonName;

        @com.aliyun.core.annotation.NameInMap("ManagerCertNumber")
        private String managerCertNumber;

        @com.aliyun.core.annotation.NameInMap("ManagerCertPicture")
        private String managerCertPicture;

        @com.aliyun.core.annotation.NameInMap("ManagerContactNumber")
        private String managerContactNumber;

        @com.aliyun.core.annotation.NameInMap("ManagerName")
        private String managerName;

        @com.aliyun.core.annotation.NameInMap("NumberApplicationLetterPicture")
        private String numberApplicationLetterPicture;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OrganizationCode")
        private String organizationCode;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UndertakingPicture")
        private String undertakingPicture;

        private Data(Builder builder) {
            this.auditDesc = builder.auditDesc;
            this.auditTime = builder.auditTime;
            this.businessLicenseAddress = builder.businessLicenseAddress;
            this.businessLicensePicture = builder.businessLicensePicture;
            this.enterpriseId = builder.enterpriseId;
            this.enterpriseName = builder.enterpriseName;
            this.legalPersonCertNumber = builder.legalPersonCertNumber;
            this.legalPersonCertPicture = builder.legalPersonCertPicture;
            this.legalPersonName = builder.legalPersonName;
            this.managerCertNumber = builder.managerCertNumber;
            this.managerCertPicture = builder.managerCertPicture;
            this.managerContactNumber = builder.managerContactNumber;
            this.managerName = builder.managerName;
            this.numberApplicationLetterPicture = builder.numberApplicationLetterPicture;
            this.orderId = builder.orderId;
            this.organizationCode = builder.organizationCode;
            this.remark = builder.remark;
            this.status = builder.status;
            this.undertakingPicture = builder.undertakingPicture;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditDesc
         */
        public String getAuditDesc() {
            return this.auditDesc;
        }

        /**
         * @return auditTime
         */
        public String getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return businessLicenseAddress
         */
        public String getBusinessLicenseAddress() {
            return this.businessLicenseAddress;
        }

        /**
         * @return businessLicensePicture
         */
        public String getBusinessLicensePicture() {
            return this.businessLicensePicture;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return enterpriseName
         */
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        /**
         * @return legalPersonCertNumber
         */
        public String getLegalPersonCertNumber() {
            return this.legalPersonCertNumber;
        }

        /**
         * @return legalPersonCertPicture
         */
        public String getLegalPersonCertPicture() {
            return this.legalPersonCertPicture;
        }

        /**
         * @return legalPersonName
         */
        public String getLegalPersonName() {
            return this.legalPersonName;
        }

        /**
         * @return managerCertNumber
         */
        public String getManagerCertNumber() {
            return this.managerCertNumber;
        }

        /**
         * @return managerCertPicture
         */
        public String getManagerCertPicture() {
            return this.managerCertPicture;
        }

        /**
         * @return managerContactNumber
         */
        public String getManagerContactNumber() {
            return this.managerContactNumber;
        }

        /**
         * @return managerName
         */
        public String getManagerName() {
            return this.managerName;
        }

        /**
         * @return numberApplicationLetterPicture
         */
        public String getNumberApplicationLetterPicture() {
            return this.numberApplicationLetterPicture;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return organizationCode
         */
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return undertakingPicture
         */
        public String getUndertakingPicture() {
            return this.undertakingPicture;
        }

        public static final class Builder {
            private String auditDesc; 
            private String auditTime; 
            private String businessLicenseAddress; 
            private String businessLicensePicture; 
            private Long enterpriseId; 
            private String enterpriseName; 
            private String legalPersonCertNumber; 
            private String legalPersonCertPicture; 
            private String legalPersonName; 
            private String managerCertNumber; 
            private String managerCertPicture; 
            private String managerContactNumber; 
            private String managerName; 
            private String numberApplicationLetterPicture; 
            private Long orderId; 
            private String organizationCode; 
            private String remark; 
            private Integer status; 
            private String undertakingPicture; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditDesc = model.auditDesc;
                this.auditTime = model.auditTime;
                this.businessLicenseAddress = model.businessLicenseAddress;
                this.businessLicensePicture = model.businessLicensePicture;
                this.enterpriseId = model.enterpriseId;
                this.enterpriseName = model.enterpriseName;
                this.legalPersonCertNumber = model.legalPersonCertNumber;
                this.legalPersonCertPicture = model.legalPersonCertPicture;
                this.legalPersonName = model.legalPersonName;
                this.managerCertNumber = model.managerCertNumber;
                this.managerCertPicture = model.managerCertPicture;
                this.managerContactNumber = model.managerContactNumber;
                this.managerName = model.managerName;
                this.numberApplicationLetterPicture = model.numberApplicationLetterPicture;
                this.orderId = model.orderId;
                this.organizationCode = model.organizationCode;
                this.remark = model.remark;
                this.status = model.status;
                this.undertakingPicture = model.undertakingPicture;
            } 

            /**
             * AuditDesc.
             */
            public Builder auditDesc(String auditDesc) {
                this.auditDesc = auditDesc;
                return this;
            }

            /**
             * AuditTime.
             */
            public Builder auditTime(String auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * BusinessLicenseAddress.
             */
            public Builder businessLicenseAddress(String businessLicenseAddress) {
                this.businessLicenseAddress = businessLicenseAddress;
                return this;
            }

            /**
             * BusinessLicensePicture.
             */
            public Builder businessLicensePicture(String businessLicensePicture) {
                this.businessLicensePicture = businessLicensePicture;
                return this;
            }

            /**
             * EnterpriseId.
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * EnterpriseName.
             */
            public Builder enterpriseName(String enterpriseName) {
                this.enterpriseName = enterpriseName;
                return this;
            }

            /**
             * LegalPersonCertNumber.
             */
            public Builder legalPersonCertNumber(String legalPersonCertNumber) {
                this.legalPersonCertNumber = legalPersonCertNumber;
                return this;
            }

            /**
             * LegalPersonCertPicture.
             */
            public Builder legalPersonCertPicture(String legalPersonCertPicture) {
                this.legalPersonCertPicture = legalPersonCertPicture;
                return this;
            }

            /**
             * LegalPersonName.
             */
            public Builder legalPersonName(String legalPersonName) {
                this.legalPersonName = legalPersonName;
                return this;
            }

            /**
             * ManagerCertNumber.
             */
            public Builder managerCertNumber(String managerCertNumber) {
                this.managerCertNumber = managerCertNumber;
                return this;
            }

            /**
             * ManagerCertPicture.
             */
            public Builder managerCertPicture(String managerCertPicture) {
                this.managerCertPicture = managerCertPicture;
                return this;
            }

            /**
             * ManagerContactNumber.
             */
            public Builder managerContactNumber(String managerContactNumber) {
                this.managerContactNumber = managerContactNumber;
                return this;
            }

            /**
             * ManagerName.
             */
            public Builder managerName(String managerName) {
                this.managerName = managerName;
                return this;
            }

            /**
             * NumberApplicationLetterPicture.
             */
            public Builder numberApplicationLetterPicture(String numberApplicationLetterPicture) {
                this.numberApplicationLetterPicture = numberApplicationLetterPicture;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrganizationCode.
             */
            public Builder organizationCode(String organizationCode) {
                this.organizationCode = organizationCode;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UndertakingPicture.
             */
            public Builder undertakingPicture(String undertakingPicture) {
                this.undertakingPicture = undertakingPicture;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
