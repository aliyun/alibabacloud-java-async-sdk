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
 * {@link UpgradeColumnarVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeColumnarVersionRequest</p>
 */
public class UpgradeColumnarVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnarVersion")
    private String columnarVersion;

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

    private UpgradeColumnarVersionRequest(Builder builder) {
        super(builder);
        this.columnarVersion = builder.columnarVersion;
        this.DBInstanceName = builder.DBInstanceName;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.switchMode = builder.switchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeColumnarVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnarVersion
     */
    public String getColumnarVersion() {
        return this.columnarVersion;
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

    public static final class Builder extends Request.Builder<UpgradeColumnarVersionRequest, Builder> {
        private String columnarVersion; 
        private String DBInstanceName; 
        private String instanceName; 
        private String regionId; 
        private String switchMode; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeColumnarVersionRequest request) {
            super(request);
            this.columnarVersion = request.columnarVersion;
            this.DBInstanceName = request.DBInstanceName;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.switchMode = request.switchMode;
        } 

        /**
         * <p>The column store version.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
         */
        public Builder columnarVersion(String columnarVersion) {
            this.putQueryParameter("ColumnarVersion", columnarVersion);
            this.columnarVersion = columnarVersion;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxx</p>
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
         * <p>pxc-hzrh51fze****pon-cdc</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
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
         * <p>The switch mode.</p>
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
        public UpgradeColumnarVersionRequest build() {
            return new UpgradeColumnarVersionRequest(this);
        } 

    } 

}
