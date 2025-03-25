// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CloneDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CloneDBInstanceRequest</p>
 */
public class CloneDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDbInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcDbInstanceName;

    private CloneDBInstanceRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.DBInstanceId = builder.DBInstanceId;
        this.srcDbInstanceName = builder.srcDbInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return srcDbInstanceName
     */
    public String getSrcDbInstanceName() {
        return this.srcDbInstanceName;
    }

    public static final class Builder extends Request.Builder<CloneDBInstanceRequest, Builder> {
        private String backupId; 
        private String DBInstanceId; 
        private String srcDbInstanceName; 

        private Builder() {
            super();
        } 

        private Builder(CloneDBInstanceRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.DBInstanceId = request.DBInstanceId;
            this.srcDbInstanceName = request.srcDbInstanceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
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
         * <p>gp-bp***************</p>
         */
        public Builder srcDbInstanceName(String srcDbInstanceName) {
            this.putQueryParameter("SrcDbInstanceName", srcDbInstanceName);
            this.srcDbInstanceName = srcDbInstanceName;
            return this;
        }

        @Override
        public CloneDBInstanceRequest build() {
            return new CloneDBInstanceRequest(this);
        } 

    } 

}
