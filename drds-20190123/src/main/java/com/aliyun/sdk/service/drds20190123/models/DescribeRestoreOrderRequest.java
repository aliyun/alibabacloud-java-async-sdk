// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreOrderRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreOrderRequest</p>
 */
public class DescribeRestoreOrderRequest extends Request {
    @Query
    @NameInMap("BackupDbNames")
    private String backupDbNames;

    @Query
    @NameInMap("BackupId")
    private String backupId;

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

    @Query
    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    private DescribeRestoreOrderRequest(Builder builder) {
        super(builder);
        this.backupDbNames = builder.backupDbNames;
        this.backupId = builder.backupId;
        this.backupLevel = builder.backupLevel;
        this.backupMode = builder.backupMode;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.preferredBackupTime = builder.preferredBackupTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreOrderRequest create() {
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
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
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

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreOrderRequest, Builder> {
        private String backupDbNames; 
        private String backupId; 
        private String backupLevel; 
        private String backupMode; 
        private String drdsInstanceId; 
        private String preferredBackupTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreOrderRequest request) {
            super(request);
            this.backupDbNames = request.backupDbNames;
            this.backupId = request.backupId;
            this.backupLevel = request.backupLevel;
            this.backupMode = request.backupMode;
            this.drdsInstanceId = request.drdsInstanceId;
            this.preferredBackupTime = request.preferredBackupTime;
        } 

        /**
         * The name of the database involved in the backup.
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * The ID of the backup set.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The level of the backup. Valid values:
         * <p>
         * 
         * *   **DB**: The database Level
         * *   **instance **: instance level
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
        }

        /**
         * The backup mode. Valid values: **logic** or **phy**.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * The ID of the instance for which to modify the backup policy.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The preferred backup time.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        @Override
        public DescribeRestoreOrderRequest build() {
            return new DescribeRestoreOrderRequest(this);
        } 

    } 

}
