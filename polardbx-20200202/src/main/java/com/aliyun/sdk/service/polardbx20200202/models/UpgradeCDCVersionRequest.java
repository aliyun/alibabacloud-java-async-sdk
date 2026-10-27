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
         * <p>The target database version to which you want to upgrade. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBClusterVersion</a> operation to query the upgrade instructions for all database versions in the specified region.</p>
         * 
         * <strong>example:</strong>
         * <p>2.343</p>
         */
        public Builder cdcDbVersion(String cdcDbVersion) {
            this.putQueryParameter("CdcDbVersion", cdcDbVersion);
            this.cdcDbVersion = cdcDbVersion;
            return this;
        }

        /**
         * <p>The target version number to which you want to upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-cdc-kernel-5.4.19-20240928_17274884</p>
         */
        public Builder cdcMinorVersion(String cdcMinorVersion) {
            this.putQueryParameter("CdcMinorVersion", cdcMinorVersion);
            this.cdcMinorVersion = cdcMinorVersion;
            return this;
        }

        /**
         * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrp****3p72fi</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-shrvdc****wtf5uk-cdc</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The region in which the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The switch mode. Valid values:</p>
         * <ul>
         * <li>0: immediately switches.</li>
         * <li>1: switches within the O&amp;M window.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
