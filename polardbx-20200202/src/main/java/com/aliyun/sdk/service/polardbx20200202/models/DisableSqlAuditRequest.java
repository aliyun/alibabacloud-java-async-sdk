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
 * {@link DisableSqlAuditRequest} extends {@link RequestModel}
 *
 * <p>DisableSqlAuditRequest</p>
 */
public class DisableSqlAuditRequest extends Request {
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

    private DisableSqlAuditRequest(Builder builder) {
        super(builder);
        this.auditAccountName = builder.auditAccountName;
        this.auditAccountPassword = builder.auditAccountPassword;
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableSqlAuditRequest create() {
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

    public static final class Builder extends Request.Builder<DisableSqlAuditRequest, Builder> {
        private String auditAccountName; 
        private String auditAccountPassword; 
        private String DBInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableSqlAuditRequest request) {
            super(request);
            this.auditAccountName = request.auditAccountName;
            this.auditAccountPassword = request.auditAccountPassword;
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the audit administrator account. &gt; This parameter is required if the three-role mode is enabled. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
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
         * <p>The password of the audit administrator account. &gt; This parameter is required if the three-role mode is enabled. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
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
         * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
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
         * <p>The ID of the region where the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
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
        public DisableSqlAuditRequest build() {
            return new DisableSqlAuditRequest(this);
        } 

    } 

}
