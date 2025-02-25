// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInstanceRequest} extends {@link RequestModel}
 *
 * <p>EnableInstanceRequest</p>
 */
public class EnableInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceClass")
    private String dbInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDbInstId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDbInstId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private EnableInstanceRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.clientToken = builder.clientToken;
        this.dbInstanceClass = builder.dbInstanceClass;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.engineVersion = builder.engineVersion;
        this.restoreTime = builder.restoreTime;
        this.sourceDbInstId = builder.sourceDbInstId;
        this.switchId = builder.switchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInstanceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbInstanceClass
     */
    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return sourceDbInstId
     */
    public String getSourceDbInstId() {
        return this.sourceDbInstId;
    }

    /**
     * @return switchId
     */
    public String getSwitchId() {
        return this.switchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<EnableInstanceRequest, Builder> {
        private String backupId; 
        private String clientToken; 
        private String dbInstanceClass; 
        private String drdsInstanceId; 
        private String engineVersion; 
        private String restoreTime; 
        private String sourceDbInstId; 
        private String switchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(EnableInstanceRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.clientToken = request.clientToken;
            this.dbInstanceClass = request.dbInstanceClass;
            this.drdsInstanceId = request.drdsInstanceId;
            this.engineVersion = request.engineVersion;
            this.restoreTime = request.restoreTime;
            this.sourceDbInstId = request.sourceDbInstId;
            this.switchId = request.switchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DbInstanceClass.
         */
        public Builder dbInstanceClass(String dbInstanceClass) {
            this.putQueryParameter("DbInstanceClass", dbInstanceClass);
            this.dbInstanceClass = dbInstanceClass;
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

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * RestoreTime.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * SourceDbInstId.
         */
        public Builder sourceDbInstId(String sourceDbInstId) {
            this.putQueryParameter("SourceDbInstId", sourceDbInstId);
            this.sourceDbInstId = sourceDbInstId;
            return this;
        }

        /**
         * SwitchId.
         */
        public Builder switchId(String switchId) {
            this.putQueryParameter("SwitchId", switchId);
            this.switchId = switchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public EnableInstanceRequest build() {
            return new EnableInstanceRequest(this);
        } 

    } 

}
