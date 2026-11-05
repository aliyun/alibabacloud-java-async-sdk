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
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBTimeZone")
    private String DBTimeZone;

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
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 2)
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeScaleMax")
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 4)
    private Integer nodeScaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeScaleMin")
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 4)
    private Integer nodeScaleMin;

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
    @com.aliyun.core.annotation.NameInMap("StorageQuota")
    private Long storageQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

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
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBTimeZone = builder.DBTimeZone;
        this.deploySchema = builder.deploySchema;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.multiZone = builder.multiZone;
        this.nodeCount = builder.nodeCount;
        this.nodeScaleMax = builder.nodeScaleMax;
        this.nodeScaleMin = builder.nodeScaleMin;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.sourceDBInstanceId = builder.sourceDBInstanceId;
        this.storageQuota = builder.storageQuota;
        this.storageType = builder.storageType;
        this.tags = builder.tags;
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
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return DBTimeZone
     */
    public String getDBTimeZone() {
        return this.DBTimeZone;
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
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeScaleMax
     */
    public Integer getNodeScaleMax() {
        return this.nodeScaleMax;
    }

    /**
     * @return nodeScaleMin
     */
    public Integer getNodeScaleMin() {
        return this.nodeScaleMin;
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
     * @return storageQuota
     */
    public Long getStorageQuota() {
        return this.storageQuota;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
        private String category; 
        private String clientToken; 
        private String DBInstanceDescription; 
        private String DBTimeZone; 
        private String deploySchema; 
        private String engine; 
        private String engineVersion; 
        private java.util.List<MultiZone> multiZone; 
        private Integer nodeCount; 
        private Integer nodeScaleMax; 
        private Integer nodeScaleMin; 
        private String regionId; 
        private String resourceGroupId; 
        private String scaleMax; 
        private String scaleMin; 
        private String sourceDBInstanceId; 
        private Long storageQuota; 
        private String storageType; 
        private java.util.List<Tags> tags; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBTimeZone = request.DBTimeZone;
            this.deploySchema = request.deploySchema;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.multiZone = request.multiZone;
            this.nodeCount = request.nodeCount;
            this.nodeScaleMax = request.nodeScaleMax;
            this.nodeScaleMin = request.nodeScaleMin;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.sourceDBInstanceId = request.sourceDBInstanceId;
            this.storageQuota = request.storageQuota;
            this.storageType = request.storageType;
            this.tags = request.tags;
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
         * <p>The cluster edition. Valid values:</p>
         * <ul>
         * <li>enterprise: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request and prevents duplicate submissions. The value is generated by the client and must be unique across different requests. The value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
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
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster test</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The time zone setting for the database kernel. The value must be an IANA time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder DBTimeZone(String DBTimeZone) {
            this.putQueryParameter("DBTimeZone", DBTimeZone);
            this.DBTimeZone = DBTimeZone;
            return this;
        }

        /**
         * <p>The cluster zone deployment status.</p>
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
         * <p>The database engine version.</p>
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
         * <p>The multi-zone configuration.</p>
         */
        public Builder multiZone(java.util.List<MultiZone> multiZone) {
            String multiZoneShrink = shrink(multiZone, "MultiZone", "json");
            this.putQueryParameter("MultiZone", multiZoneShrink);
            this.multiZone = multiZone;
            return this;
        }

        /**
         * <p>The number of nodes. Valid values: 2 to 16. This parameter is required when you use NodeScaleMin and NodeScaleMax to configure the scaling range.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>The maximum number of serverless nodes for elastic scaling. Valid values: 4 to 32. The value must be greater than the minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder nodeScaleMax(Integer nodeScaleMax) {
            this.putQueryParameter("NodeScaleMax", nodeScaleMax);
            this.nodeScaleMax = nodeScaleMax;
            return this;
        }

        /**
         * <p>The minimum number of serverless nodes for elastic scaling. Valid values: 4 to 32.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder nodeScaleMin(Integer nodeScaleMin) {
            this.putQueryParameter("NodeScaleMin", nodeScaleMin);
            this.nodeScaleMin = nodeScaleMin;
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
         * <p>The ID of the resource group to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The maximum value for serverless elastic scaling. This parameter is deprecated. Use NodeCount, NodeScaleMin, and NodeScaleMax to configure the scaling capabilities instead.</p>
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
         * <p>The minimum value for serverless elastic scaling. This parameter is deprecated. Use NodeCount, NodeScaleMin, and NodeScaleMax to configure the scaling capabilities instead.</p>
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
         * <p>The source cluster instance ID. This parameter is required when you recover from a backup.</p>
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
         * StorageQuota.
         */
        public Builder storageQuota(Long storageQuota) {
            this.putQueryParameter("StorageQuota", storageQuota);
            this.storageQuota = storageQuota;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
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
             * <p>The vSwitch ID.</p>
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
    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the instance tag label.</p>
             * 
             * <strong>example:</strong>
             * <p>user_123</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the instance tag label.</p>
             * 
             * <strong>example:</strong>
             * <p>example string</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
