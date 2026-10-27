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
 * {@link UpgradeDBInstanceKernelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceKernelVersionRequest</p>
 */
public class UpgradeDBInstanceKernelVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchMode")
    private String switchMode;

    private UpgradeDBInstanceKernelVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.minorVersion = builder.minorVersion;
        this.regionId = builder.regionId;
        this.switchMode = builder.switchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceKernelVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
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

    public static final class Builder extends Request.Builder<UpgradeDBInstanceKernelVersionRequest, Builder> {
        private String DBInstanceName; 
        private String minorVersion; 
        private String regionId; 
        private String switchMode; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceKernelVersionRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.minorVersion = request.minorVersion;
            this.regionId = request.regionId;
            this.switchMode = request.switchMode;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The kernel version.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.12-16349923_xcluster-20210926</p>
         */
        public Builder minorVersion(String minorVersion) {
            this.putQueryParameter("MinorVersion", minorVersion);
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <li>1: switches during the O&amp;M window.</li>
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
        public UpgradeDBInstanceKernelVersionRequest build() {
            return new UpgradeDBInstanceKernelVersionRequest(this);
        } 

    } 

}
