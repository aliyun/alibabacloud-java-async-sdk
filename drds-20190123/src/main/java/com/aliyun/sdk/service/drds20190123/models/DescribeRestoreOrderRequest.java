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
 * {@link DescribeRestoreOrderRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreOrderRequest</p>
 */
public class DescribeRestoreOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupDbNames")
    private String backupDbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLevel")
    private String backupLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
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
         * <p>The name of the database involved in the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_flashback</p>
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>1918df27-4563-11e9-8403-af4fbe******</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The level of the backup. Valid values:</p>
         * <ul>
         * <li><strong>DB</strong>: The database Level</li>
         * <li>**instance **: instance level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
        }

        /**
         * <p>The backup mode. Valid values: <strong>logic</strong> or <strong>phy</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>phy</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The ID of the instance for which to modify the backup policy.</p>
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

        /**
         * <p>The preferred backup time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-16 15:12:53</p>
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
