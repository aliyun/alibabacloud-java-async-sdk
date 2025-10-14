// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link UpgradeCDCVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeCDCVersionRequest</p>
 */
public class UpgradeCDCVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdcDbVersion")
    private String cdcDbVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdcMinorVersion")
    private String cdcMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchMode")
    private String switchMode;

    private UpgradeCDCVersionRequest(Builder builder) {
        super(builder);
        this.cdcDbVersion = builder.cdcDbVersion;
        this.cdcMinorVersion = builder.cdcMinorVersion;
        this.DBInstanceName = builder.DBInstanceName;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.switchMode = builder.switchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeCDCVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdcDbVersion
     */
    public String getCdcDbVersion() {
        return this.cdcDbVersion;
    }

    /**
     * @return cdcMinorVersion
     */
    public String getCdcMinorVersion() {
        return this.cdcMinorVersion;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return switchMode
     */
    public String getSwitchMode() {
        return this.switchMode;
    }

    public static final class Builder extends Request.Builder<UpgradeCDCVersionRequest, Builder> {
        private String cdcDbVersion; 
        private String cdcMinorVersion; 
        private String DBInstanceName; 
        private String instanceName; 
        private String regionId; 
        private String switchMode; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeCDCVersionRequest request) {
            super(request);
            this.cdcDbVersion = request.cdcDbVersion;
            this.cdcMinorVersion = request.cdcMinorVersion;
            this.DBInstanceName = request.DBInstanceName;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.switchMode = request.switchMode;
        } 

        /**
         * CdcDbVersion.
         */
        public Builder cdcDbVersion(String cdcDbVersion) {
            this.putQueryParameter("CdcDbVersion", cdcDbVersion);
            this.cdcDbVersion = cdcDbVersion;
            return this;
        }

        /**
         * CdcMinorVersion.
         */
        public Builder cdcMinorVersion(String cdcMinorVersion) {
            this.putQueryParameter("CdcMinorVersion", cdcMinorVersion);
            this.cdcMinorVersion = cdcMinorVersion;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
         * SwitchMode.
         */
        public Builder switchMode(String switchMode) {
            this.putQueryParameter("SwitchMode", switchMode);
            this.switchMode = switchMode;
            return this;
        }

        @Override
        public UpgradeCDCVersionRequest build() {
            return new UpgradeCDCVersionRequest(this);
        } 

    } 

}
