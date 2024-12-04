// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableRightsSeparationRequest} extends {@link RequestModel}
 *
 * <p>EnableRightsSeparationRequest</p>
 */
public class EnableRightsSeparationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAccountDescription")
    private String auditAccountDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auditAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auditAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountDescription")
    private String securityAccountDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account_audit</p>
         */
        public Builder auditAccountName(String auditAccountName) {
            this.putQueryParameter("AuditAccountName", auditAccountName);
            this.auditAccountName = auditAccountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder auditAccountPassword(String auditAccountPassword) {
            this.putQueryParameter("AuditAccountPassword", auditAccountPassword);
            this.auditAccountPassword = auditAccountPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-htri0ori2r4k9p</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account_sec</p>
         */
        public Builder securityAccountName(String securityAccountName) {
            this.putQueryParameter("SecurityAccountName", securityAccountName);
            this.securityAccountName = securityAccountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
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
