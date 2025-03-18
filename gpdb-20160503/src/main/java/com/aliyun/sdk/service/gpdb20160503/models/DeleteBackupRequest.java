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
 * {@link DeleteBackupRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupRequest</p>
 */
public class DeleteBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    private DeleteBackupRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBackupRequest, Builder> {
        private String backupId; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.DBInstanceId = request.DBInstanceId;
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

        @Override
        public DeleteBackupRequest build() {
            return new DeleteBackupRequest(this);
        } 

    } 

}
