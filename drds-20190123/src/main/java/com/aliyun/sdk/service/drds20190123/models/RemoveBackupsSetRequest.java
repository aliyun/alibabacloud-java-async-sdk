// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveBackupsSetRequest} extends {@link RequestModel}
 *
 * <p>RemoveBackupsSetRequest</p>
 */
public class RemoveBackupsSetRequest extends Request {
    @Query
    @NameInMap("BackupId")
    @Validation(required = true)
    private String backupId;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
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

        private Builder(RemoveBackupsSetRequest response) {
            super(response);
            this.backupId = response.backupId;
            this.drdsInstanceId = response.drdsInstanceId;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * DrdsInstanceId.
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
