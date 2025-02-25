// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicantsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicantsRequest</p>
 */
public class ListApplicantsRequest extends Request {
    @Query
    @NameInMap("ApplicantName")
    private String applicantName;

    @Query
    @NameInMap("ApplicantRegion")
    private Integer applicantRegion;

    @Query
    @NameInMap("ApplicantType")
    private Integer applicantType;

    @Query
    @NameInMap("ApplicantVersion")
    private String applicantVersion;

    @Query
    @NameInMap("AuditStatus")
    private Integer auditStatus;

    @Query
    @NameInMap("CardNumber")
    private String cardNumber;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PrincipalName")
    private Integer principalName;

    @Query
    @NameInMap("SystemVersion")
    private String systemVersion;

    private ListApplicantsRequest(Builder builder) {
        super(builder);
        this.applicantName = builder.applicantName;
        this.applicantRegion = builder.applicantRegion;
        this.applicantType = builder.applicantType;
        this.applicantVersion = builder.applicantVersion;
        this.auditStatus = builder.auditStatus;
        this.cardNumber = builder.cardNumber;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.principalName = builder.principalName;
        this.systemVersion = builder.systemVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicantsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return cardNumber
     */
    public String getCardNumber() {
        return this.cardNumber;
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

    public static final class Builder extends Request.Builder<ListApplicantsRequest, Builder> {
        private String applicantName; 
        private Integer applicantRegion; 
        private Integer applicantType; 
        private String applicantVersion; 
        private Integer auditStatus; 
        private String cardNumber; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer principalName; 
        private String systemVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicantsRequest request) {
            super(request);
            this.applicantName = request.applicantName;
            this.applicantRegion = request.applicantRegion;
            this.applicantType = request.applicantType;
            this.applicantVersion = request.applicantVersion;
            this.auditStatus = request.auditStatus;
            this.cardNumber = request.cardNumber;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.principalName = request.principalName;
            this.systemVersion = request.systemVersion;
        } 

        /**
         * ApplicantName.
         */
        public Builder applicantName(String applicantName) {
            this.putQueryParameter("ApplicantName", applicantName);
            this.applicantName = applicantName;
            return this;
        }

        /**
         * ApplicantRegion.
         */
        public Builder applicantRegion(Integer applicantRegion) {
            this.putQueryParameter("ApplicantRegion", applicantRegion);
            this.applicantRegion = applicantRegion;
            return this;
        }

        /**
         * ApplicantType.
         */
        public Builder applicantType(Integer applicantType) {
            this.putQueryParameter("ApplicantType", applicantType);
            this.applicantType = applicantType;
            return this;
        }

        /**
         * ApplicantVersion.
         */
        public Builder applicantVersion(String applicantVersion) {
            this.putQueryParameter("ApplicantVersion", applicantVersion);
            this.applicantVersion = applicantVersion;
            return this;
        }

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * CardNumber.
         */
        public Builder cardNumber(String cardNumber) {
            this.putQueryParameter("CardNumber", cardNumber);
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrincipalName.
         */
        public Builder principalName(Integer principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * SystemVersion.
         */
        public Builder systemVersion(String systemVersion) {
            this.putQueryParameter("SystemVersion", systemVersion);
            this.systemVersion = systemVersion;
            return this;
        }

        @Override
        public ListApplicantsRequest build() {
            return new ListApplicantsRequest(this);
        } 

    } 

}
