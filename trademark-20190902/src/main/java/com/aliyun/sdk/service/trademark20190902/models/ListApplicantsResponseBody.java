// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicantsResponseBody</p>
 */
public class ListApplicantsResponseBody extends TeaModel {
    @NameInMap("Applicants")
    private Applicants applicants;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicantsResponseBody(Builder builder) {
        this.applicants = builder.applicants;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicants
     */
    public Applicants getApplicants() {
        return this.applicants;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Applicants applicants; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Applicants.
         */
        public Builder applicants(Applicants applicants) {
            this.applicants = applicants;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicantsResponseBody build() {
            return new ListApplicantsResponseBody(this);
        } 

    } 

    public static class Applicant extends TeaModel {
        @NameInMap("ApplicantId")
        private Long applicantId;

        @NameInMap("ApplicantName")
        private String applicantName;

        @NameInMap("ApplicantRegion")
        private Integer applicantRegion;

        @NameInMap("ApplicantType")
        private Integer applicantType;

        @NameInMap("ApplicantVersion")
        private String applicantVersion;

        @NameInMap("AuditStatus")
        private Integer auditStatus;

        @NameInMap("AuthorizationAuditStatus")
        private Integer authorizationAuditStatus;

        @NameInMap("AuthorizationUrl")
        private String authorizationUrl;

        @NameInMap("CardNumber")
        private String cardNumber;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("PrincipalName")
        private Integer principalName;

        @NameInMap("SystemVersion")
        private String systemVersion;

        @NameInMap("ValidDate")
        private Long validDate;

        private Applicant(Builder builder) {
            this.applicantId = builder.applicantId;
            this.applicantName = builder.applicantName;
            this.applicantRegion = builder.applicantRegion;
            this.applicantType = builder.applicantType;
            this.applicantVersion = builder.applicantVersion;
            this.auditStatus = builder.auditStatus;
            this.authorizationAuditStatus = builder.authorizationAuditStatus;
            this.authorizationUrl = builder.authorizationUrl;
            this.cardNumber = builder.cardNumber;
            this.contactName = builder.contactName;
            this.principalName = builder.principalName;
            this.systemVersion = builder.systemVersion;
            this.validDate = builder.validDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applicant create() {
            return builder().build();
        }

        /**
         * @return applicantId
         */
        public Long getApplicantId() {
            return this.applicantId;
        }

        /**
         * @return applicantName
         */
        public String getApplicantName() {
            return this.applicantName;
        }

        /**
         * @return applicantRegion
         */
        public Integer getApplicantRegion() {
            return this.applicantRegion;
        }

        /**
         * @return applicantType
         */
        public Integer getApplicantType() {
            return this.applicantType;
        }

        /**
         * @return applicantVersion
         */
        public String getApplicantVersion() {
            return this.applicantVersion;
        }

        /**
         * @return auditStatus
         */
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return authorizationAuditStatus
         */
        public Integer getAuthorizationAuditStatus() {
            return this.authorizationAuditStatus;
        }

        /**
         * @return authorizationUrl
         */
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        /**
         * @return cardNumber
         */
        public String getCardNumber() {
            return this.cardNumber;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return principalName
         */
        public Integer getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return validDate
         */
        public Long getValidDate() {
            return this.validDate;
        }

        public static final class Builder {
            private Long applicantId; 
            private String applicantName; 
            private Integer applicantRegion; 
            private Integer applicantType; 
            private String applicantVersion; 
            private Integer auditStatus; 
            private Integer authorizationAuditStatus; 
            private String authorizationUrl; 
            private String cardNumber; 
            private String contactName; 
            private Integer principalName; 
            private String systemVersion; 
            private Long validDate; 

            /**
             * ApplicantId.
             */
            public Builder applicantId(Long applicantId) {
                this.applicantId = applicantId;
                return this;
            }

            /**
             * ApplicantName.
             */
            public Builder applicantName(String applicantName) {
                this.applicantName = applicantName;
                return this;
            }

            /**
             * ApplicantRegion.
             */
            public Builder applicantRegion(Integer applicantRegion) {
                this.applicantRegion = applicantRegion;
                return this;
            }

            /**
             * ApplicantType.
             */
            public Builder applicantType(Integer applicantType) {
                this.applicantType = applicantType;
                return this;
            }

            /**
             * ApplicantVersion.
             */
            public Builder applicantVersion(String applicantVersion) {
                this.applicantVersion = applicantVersion;
                return this;
            }

            /**
             * AuditStatus.
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AuthorizationAuditStatus.
             */
            public Builder authorizationAuditStatus(Integer authorizationAuditStatus) {
                this.authorizationAuditStatus = authorizationAuditStatus;
                return this;
            }

            /**
             * AuthorizationUrl.
             */
            public Builder authorizationUrl(String authorizationUrl) {
                this.authorizationUrl = authorizationUrl;
                return this;
            }

            /**
             * CardNumber.
             */
            public Builder cardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * PrincipalName.
             */
            public Builder principalName(Integer principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * ValidDate.
             */
            public Builder validDate(Long validDate) {
                this.validDate = validDate;
                return this;
            }

            public Applicant build() {
                return new Applicant(this);
            } 

        } 

    }
    public static class Applicants extends TeaModel {
        @NameInMap("Applicant")
        private java.util.List < Applicant> applicant;

        private Applicants(Builder builder) {
            this.applicant = builder.applicant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applicants create() {
            return builder().build();
        }

        /**
         * @return applicant
         */
        public java.util.List < Applicant> getApplicant() {
            return this.applicant;
        }

        public static final class Builder {
            private java.util.List < Applicant> applicant; 

            /**
             * Applicant.
             */
            public Builder applicant(java.util.List < Applicant> applicant) {
                this.applicant = applicant;
                return this;
            }

            public Applicants build() {
                return new Applicants(this);
            } 

        } 

    }
}
