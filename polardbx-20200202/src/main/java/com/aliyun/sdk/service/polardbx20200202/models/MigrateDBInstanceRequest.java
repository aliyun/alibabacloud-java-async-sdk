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
 * {@link MigrateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>MigrateDBInstanceRequest</p>
 */
public class MigrateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchMode")
    private String switchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TertiaryZoneId")
    private String tertiaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopologyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topologyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    private MigrateDBInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.primaryZoneId = builder.primaryZoneId;
        this.regionId = builder.regionId;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.switchMode = builder.switchMode;
        this.tertiaryZoneId = builder.tertiaryZoneId;
        this.topologyType = builder.topologyType;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateDBInstanceRequest create() {
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
     * @return primaryZoneId
     */
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    /**
     * @return switchMode
     */
    public String getSwitchMode() {
        return this.switchMode;
    }

    /**
     * @return tertiaryZoneId
     */
    public String getTertiaryZoneId() {
        return this.tertiaryZoneId;
    }

    /**
     * @return topologyType
     */
    public String getTopologyType() {
        return this.topologyType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<MigrateDBInstanceRequest, Builder> {
        private String DBInstanceName; 
        private String primaryZoneId; 
        private String regionId; 
        private String secondaryZoneId; 
        private String switchMode; 
        private String tertiaryZoneId; 
        private String topologyType; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateDBInstanceRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.primaryZoneId = request.primaryZoneId;
            this.regionId = request.regionId;
            this.secondaryZoneId = request.secondaryZoneId;
            this.switchMode = request.switchMode;
            this.tertiaryZoneId = request.tertiaryZoneId;
            this.topologyType = request.topologyType;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The zone ID of the primary zone for a multi-zone instance. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-b</p>
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.putQueryParameter("PrimaryZoneId", primaryZoneId);
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
         * <p>The secondary zone ID.</p>
         * <blockquote>
         * <p>This parameter cannot be the same as the ZoneId property.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-l</p>
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * <p>The switch mode. Valid values:</p>
         * <ul>
         * <li>0: Immediate switchover.</li>
         * <li>1: Switchover within the O&amp;M window.</li>
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

        /**
         * <p>The third active zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        public Builder tertiaryZoneId(String tertiaryZoneId) {
            this.putQueryParameter("TertiaryZoneId", tertiaryZoneId);
            this.tertiaryZoneId = tertiaryZoneId;
            return this;
        }

        /**
         * <p>The topology type. Valid values:</p>
         * <ul>
         * <li><strong>3azones</strong>: Three-zone deployment.</li>
         * <li><strong>1azone</strong>: Single-zone deployment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3azones</p>
         */
        public Builder topologyType(String topologyType) {
            this.putQueryParameter("TopologyType", topologyType);
            this.topologyType = topologyType;
            return this;
        }

        /**
         * <p>The ID of the VPC where the access endpoint resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID. This parameter is required when you create a DRDS instance of the VPC network type.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public MigrateDBInstanceRequest build() {
            return new MigrateDBInstanceRequest(this);
        } 

    } 

}
