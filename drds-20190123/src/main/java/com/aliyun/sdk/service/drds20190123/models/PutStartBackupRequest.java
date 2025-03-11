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
 * {@link PutStartBackupRequest} extends {@link RequestModel}
 *
 * <p>PutStartBackupRequest</p>
 */
public class PutStartBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupDbNames")
    private String backupDbNames;

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

        private Builder(PutStartBackupRequest request) {
            super(request);
            this.backupDbNames = request.backupDbNames;
            this.backupLevel = request.backupLevel;
            this.backupMode = request.backupMode;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * <p>If you need to back up data at the database level, you must specify the list of databases to be backed up, and separate multiple databases with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>db_1, db_2</p>
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * <p>The backup level. Valid values:</p>
         * <ul>
         * <li>instance: instance</li>
         * <li>db: The database type.</li>
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
         * <p>The backup mode. For more information, see <a href="https://help.aliyun.com/document_detail/108631.html">backup mode</a> and the valid values are as follows:</p>
         * <ul>
         * <li>phy: fast backup</li>
         * <li>logic: Consistent backup</li>
         * </ul>
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
         * <p>The ID of the DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds****c6vxxyzd</p>
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
