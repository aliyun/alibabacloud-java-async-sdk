// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link UpgradeMinorVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMinorVersionRequest</p>
 */
public class UpgradeMinorVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    private UpgradeMinorVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.targetMinorVersion = builder.targetMinorVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMinorVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    /**
     * @return targetMinorVersion
     */
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeMinorVersionRequest, Builder> {
        private String DBInstanceId; 
        private String regionId; 
        private String switchTime; 
        private String switchTimeMode; 
        private String targetMinorVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMinorVersionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.targetMinorVersion = request.targetMinorVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1jyis8p15we****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SwitchTime.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>Specifies whether to update the minor engine version of the cluster immediately. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: The system immediately performs the update.</li>
         * <li><strong>MaintainTime</strong>: The system performs the update during the specified maintenance window.</li>
         * <li><strong>SpecifyTime</strong>: The system performs the update at a specified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * TargetMinorVersion.
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        @Override
        public UpgradeMinorVersionRequest build() {
            return new UpgradeMinorVersionRequest(this);
        } 

    } 

}
