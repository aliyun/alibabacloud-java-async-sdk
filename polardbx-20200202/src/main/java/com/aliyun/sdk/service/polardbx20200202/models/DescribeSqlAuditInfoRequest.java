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
 * {@link DescribeSqlAuditInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlAuditInfoRequest</p>
 */
public class DescribeSqlAuditInfoRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeSqlAuditInfoRequest(Builder builder) {
        super(builder);
        this.auditAccountName = builder.auditAccountName;
        this.auditAccountPassword = builder.auditAccountPassword;
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlAuditInfoRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeSqlAuditInfoRequest, Builder> {
        private String auditAccountName; 
        private String auditAccountPassword; 
        private String DBInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlAuditInfoRequest request) {
            super(request);
            this.auditAccountName = request.auditAccountName;
            this.auditAccountPassword = request.auditAccountPassword;
            this.DBInstanceId = request.DBInstanceId;
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
        public DescribeSqlAuditInfoRequest build() {
            return new DescribeSqlAuditInfoRequest(this);
        } 

    } 

}
