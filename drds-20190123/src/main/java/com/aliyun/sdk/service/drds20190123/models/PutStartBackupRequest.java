// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutStartBackupRequest} extends {@link RequestModel}
 *
 * <p>PutStartBackupRequest</p>
 */
public class PutStartBackupRequest extends Request {
    @Query
    @NameInMap("BackupDbNames")
    private String backupDbNames;

    @Query
    @NameInMap("BackupLevel")
    private String backupLevel;

    @Query
    @NameInMap("BackupMode")
    private String backupMode;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private PutStartBackupRequest(Builder builder) {
        super(builder);
        this.backupDbNames = builder.backupDbNames;
        this.backupLevel = builder.backupLevel;
        this.backupMode = builder.backupMode;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutStartBackupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupDbNames
     */
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    /**
     * @return backupLevel
     */
    public String getBackupLevel() {
        return this.backupLevel;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<PutStartBackupRequest, Builder> {
        private String backupDbNames; 
        private String backupLevel; 
        private String backupMode; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(PutStartBackupRequest response) {
            super(response);
            this.backupDbNames = response.backupDbNames;
            this.backupLevel = response.backupLevel;
            this.backupMode = response.backupMode;
            this.drdsInstanceId = response.drdsInstanceId;
        } 

        /**
         * BackupDbNames.
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * BackupLevel.
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
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
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public PutStartBackupRequest build() {
            return new PutStartBackupRequest(this);
        } 

    } 

}
