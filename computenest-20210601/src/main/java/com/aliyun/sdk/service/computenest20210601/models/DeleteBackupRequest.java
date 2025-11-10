// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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

    private DeleteBackupRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
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

    public static final class Builder extends Request.Builder<DeleteBackupRequest, Builder> {
        private String backupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupRequest request) {
            super(request);
            this.backupId = request.backupId;
        } 

        /**
         * <p>The backup ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-385d35fb088f453c8fa1</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        @Override
        public DeleteBackupRequest build() {
            return new DeleteBackupRequest(this);
        } 

    } 

}
