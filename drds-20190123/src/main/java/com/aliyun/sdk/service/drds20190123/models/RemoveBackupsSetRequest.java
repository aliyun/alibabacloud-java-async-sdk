// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link RemoveBackupsSetRequest} extends {@link RequestModel}
 *
 * <p>RemoveBackupsSetRequest</p>
 */
public class RemoveBackupsSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    private RemoveBackupsSetRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveBackupsSetRequest create() {
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
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<RemoveBackupsSetRequest, Builder> {
        private String backupId; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveBackupsSetRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/139331.html">DescribeBackupSets</a> interface to query the ID of a backup set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ba30d5c4-a6dc-11ea-bd40-************</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public RemoveBackupsSetRequest build() {
            return new RemoveBackupsSetRequest(this);
        } 

    } 

}
