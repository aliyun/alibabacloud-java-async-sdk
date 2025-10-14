// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link EnableSqlAuditRequest} extends {@link RequestModel}
 *
 * <p>EnableSqlAuditRequest</p>
 */
public class EnableSqlAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAccountName")
    private String auditAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAccountPassword")
    private String auditAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireAfterDays")
    @com.aliyun.core.annotation.Validation(maximum = 365, minimum = 1)
    private Integer expireAfterDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private EnableSqlAuditRequest(Builder builder) {
        super(builder);
        this.auditAccountName = builder.auditAccountName;
        this.auditAccountPassword = builder.auditAccountPassword;
        this.DBInstanceId = builder.DBInstanceId;
        this.expireAfterDays = builder.expireAfterDays;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSqlAuditRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return expireAfterDays
     */
    public Integer getExpireAfterDays() {
        return this.expireAfterDays;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EnableSqlAuditRequest, Builder> {
        private String auditAccountName; 
        private String auditAccountPassword; 
        private String DBInstanceId; 
        private Integer expireAfterDays; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableSqlAuditRequest request) {
            super(request);
            this.auditAccountName = request.auditAccountName;
            this.auditAccountPassword = request.auditAccountPassword;
            this.DBInstanceId = request.DBInstanceId;
            this.expireAfterDays = request.expireAfterDays;
            this.regionId = request.regionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-****************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ExpireAfterDays.
         */
        public Builder expireAfterDays(Integer expireAfterDays) {
            this.putQueryParameter("ExpireAfterDays", expireAfterDays);
            this.expireAfterDays = expireAfterDays;
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

        @Override
        public EnableSqlAuditRequest build() {
            return new EnableSqlAuditRequest(this);
        } 

    } 

}
