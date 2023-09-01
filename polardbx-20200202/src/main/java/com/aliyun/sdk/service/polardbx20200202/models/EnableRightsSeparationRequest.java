// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRightsSeparationRequest} extends {@link RequestModel}
 *
 * <p>EnableRightsSeparationRequest</p>
 */
public class EnableRightsSeparationRequest extends Request {
    @Query
    @NameInMap("AuditAccountDescription")
    private String auditAccountDescription;

    @Query
    @NameInMap("AuditAccountName")
    @Validation(required = true)
    private String auditAccountName;

    @Query
    @NameInMap("AuditAccountPassword")
    @Validation(required = true)
    private String auditAccountPassword;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityAccountDescription")
    private String securityAccountDescription;

    @Query
    @NameInMap("SecurityAccountName")
    @Validation(required = true)
    private String securityAccountName;

    @Query
    @NameInMap("SecurityAccountPassword")
    @Validation(required = true)
    private String securityAccountPassword;

    private EnableRightsSeparationRequest(Builder builder) {
        super(builder);
        this.auditAccountDescription = builder.auditAccountDescription;
        this.auditAccountName = builder.auditAccountName;
        this.auditAccountPassword = builder.auditAccountPassword;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.securityAccountDescription = builder.securityAccountDescription;
        this.securityAccountName = builder.securityAccountName;
        this.securityAccountPassword = builder.securityAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableRightsSeparationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditAccountDescription
     */
    public String getAuditAccountDescription() {
        return this.auditAccountDescription;
    }

    /**
     * @return auditAccountName
     */
    public String getAuditAccountName() {
        return this.auditAccountName;
    }

    /**
     * @return auditAccountPassword
     */
    public String getAuditAccountPassword() {
        return this.auditAccountPassword;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityAccountDescription
     */
    public String getSecurityAccountDescription() {
        return this.securityAccountDescription;
    }

    /**
     * @return securityAccountName
     */
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    /**
     * @return securityAccountPassword
     */
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

    public static final class Builder extends Request.Builder<EnableRightsSeparationRequest, Builder> {
        private String auditAccountDescription; 
        private String auditAccountName; 
        private String auditAccountPassword; 
        private String DBInstanceName; 
        private String regionId; 
        private String securityAccountDescription; 
        private String securityAccountName; 
        private String securityAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(EnableRightsSeparationRequest request) {
            super(request);
            this.auditAccountDescription = request.auditAccountDescription;
            this.auditAccountName = request.auditAccountName;
            this.auditAccountPassword = request.auditAccountPassword;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.securityAccountDescription = request.securityAccountDescription;
            this.securityAccountName = request.securityAccountName;
            this.securityAccountPassword = request.securityAccountPassword;
        } 

        /**
         * AuditAccountDescription.
         */
        public Builder auditAccountDescription(String auditAccountDescription) {
            this.putQueryParameter("AuditAccountDescription", auditAccountDescription);
            this.auditAccountDescription = auditAccountDescription;
            return this;
        }

        /**
         * AuditAccountName.
         */
        public Builder auditAccountName(String auditAccountName) {
            this.putQueryParameter("AuditAccountName", auditAccountName);
            this.auditAccountName = auditAccountName;
            return this;
        }

        /**
         * AuditAccountPassword.
         */
        public Builder auditAccountPassword(String auditAccountPassword) {
            this.putQueryParameter("AuditAccountPassword", auditAccountPassword);
            this.auditAccountPassword = auditAccountPassword;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityAccountDescription.
         */
        public Builder securityAccountDescription(String securityAccountDescription) {
            this.putQueryParameter("SecurityAccountDescription", securityAccountDescription);
            this.securityAccountDescription = securityAccountDescription;
            return this;
        }

        /**
         * SecurityAccountName.
         */
        public Builder securityAccountName(String securityAccountName) {
            this.putQueryParameter("SecurityAccountName", securityAccountName);
            this.securityAccountName = securityAccountName;
            return this;
        }

        /**
         * SecurityAccountPassword.
         */
        public Builder securityAccountPassword(String securityAccountPassword) {
            this.putQueryParameter("SecurityAccountPassword", securityAccountPassword);
            this.securityAccountPassword = securityAccountPassword;
            return this;
        }

        @Override
        public EnableRightsSeparationRequest build() {
            return new EnableRightsSeparationRequest(this);
        } 

    } 

}
