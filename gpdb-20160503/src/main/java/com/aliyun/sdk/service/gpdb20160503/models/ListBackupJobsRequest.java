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
 * {@link ListBackupJobsRequest} extends {@link RequestModel}
 *
 * <p>ListBackupJobsRequest</p>
 */
public class ListBackupJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    private ListBackupJobsRequest(Builder builder) {
        super(builder);
        this.backupMode = builder.backupMode;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<ListBackupJobsRequest, Builder> {
        private String backupMode; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListBackupJobsRequest request) {
            super(request);
            this.backupMode = request.backupMode;
            this.DBInstanceId = request.DBInstanceId;
        } 

        /**
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
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
        public ListBackupJobsRequest build() {
            return new ListBackupJobsRequest(this);
        } 

    } 

}
