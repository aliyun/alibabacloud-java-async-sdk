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
         * <p>The name of the audit administrator account. &gt; If the three-role mode is enabled, this parameter is required. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test_daa</p>
         */
        public Builder auditAccountName(String auditAccountName) {
            this.putQueryParameter("AuditAccountName", auditAccountName);
            this.auditAccountName = auditAccountName;
            return this;
        }

        /**
         * <p>The password of the audit administrator account. &gt; If the three-role mode is enabled, this parameter is required. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Pw@11111</p>
         */
        public Builder auditAccountPassword(String auditAccountPassword) {
            this.putQueryParameter("AuditAccountPassword", auditAccountPassword);
            this.auditAccountPassword = auditAccountPassword;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The number of days for which audit logs are retained.</p>
         * <ul>
         * <li><p>0: Logs are not retained. Automatic log expiration is disabled.</p>
         * </li>
         * <li><p>Greater than 0: Logs are automatically deleted after N days.</p>
         * </li>
         * <li><p>Common values: 30, 45, 90, 180, and 365.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder expireAfterDays(Integer expireAfterDays) {
            this.putQueryParameter("ExpireAfterDays", expireAfterDays);
            this.expireAfterDays = expireAfterDays;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
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
