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
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploySchema")
    private String deploySchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiZone")
    private java.util.List<MultiZone> multiZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private String scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private String scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBInstanceId")
    private String sourceDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.deploySchema = builder.deploySchema;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.multiZone = builder.multiZone;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.sourceDBInstanceId = builder.sourceDBInstanceId;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return deploySchema
     */
    public String getDeploySchema() {
        return this.deploySchema;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return multiZone
     */
    public java.util.List<MultiZone> getMultiZone() {
        return this.multiZone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return sourceDBInstanceId
     */
    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String backupSetId; 
        private String clientToken; 
        private String DBInstanceDescription; 
        private String deploySchema; 
        private String engine; 
        private String engineVersion; 
        private java.util.List<MultiZone> multiZone; 
        private String regionId; 
        private String resourceGroupId; 
        private String scaleMax; 
        private String scaleMin; 
        private String sourceDBInstanceId; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.clientToken = request.clientToken;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.deploySchema = request.deploySchema;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.multiZone = request.multiZone;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.sourceDBInstanceId = request.sourceDBInstanceId;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token. Make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>AB</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for test</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The deployment status of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>multi_az</p>
         */
        public Builder deploySchema(String deploySchema) {
            this.putQueryParameter("DeploySchema", deploySchema);
            this.deploySchema = deploySchema;
            return this;
        }

        /**
         * <p>The engine type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>clickhouse</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clickhouse</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>23.8</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The configurations of multi-zone deployment.</p>
         */
        public Builder multiZone(java.util.List<MultiZone> multiZone) {
            String multiZoneShrink = shrink(multiZone, "MultiZone", "json");
            this.putQueryParameter("MultiZone", multiZoneShrink);
            this.multiZone = multiZone;
            return this;
        }

        /**
         * <p>The region ID</p>
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The maximum capacity for auto scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum capacity for auto scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-2ze1*********</p>
         */
        public Builder sourceDBInstanceId(String sourceDBInstanceId) {
            this.putQueryParameter("SourceDBInstanceId", sourceDBInstanceId);
            this.sourceDBInstanceId = sourceDBInstanceId;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6xmupdn7v6ui9f****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf632qye9oqt4x4sr****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class MultiZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MultiZone(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZone create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MultiZone model) {
                this.vSwitchIds = model.vSwitchIds;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MultiZone build() {
                return new MultiZone(this);
            } 

        } 

    }
}
