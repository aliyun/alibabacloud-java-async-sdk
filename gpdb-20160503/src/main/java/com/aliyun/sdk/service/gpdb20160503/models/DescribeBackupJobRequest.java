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
 * {@link DescribeBackupJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupJobRequest</p>
 */
public class DescribeBackupJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long backupJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    private DescribeBackupJobRequest(Builder builder) {
        super(builder);
        this.backupJobId = builder.backupJobId;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupJobId
     */
    public Long getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupJobRequest, Builder> {
        private Long backupJobId; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupJobRequest request) {
            super(request);
            this.backupJobId = request.backupJobId;
            this.DBInstanceId = request.DBInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder backupJobId(Long backupJobId) {
            this.putQueryParameter("BackupJobId", backupJobId);
            this.backupJobId = backupJobId;
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

        @Override
        public DescribeBackupJobRequest build() {
            return new DescribeBackupJobRequest(this);
        } 

    } 

}
