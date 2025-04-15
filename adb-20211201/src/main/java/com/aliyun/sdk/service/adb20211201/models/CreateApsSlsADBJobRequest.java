// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateApsSlsADBJobRequest} extends {@link RequestModel}
 *
 * <p>CreateApsSlsADBJobRequest</p>
 */
public class CreateApsSlsADBJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcrossRole")
    private String acrossRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcrossUid")
    private String acrossUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdvancedConfig")
    private String advancedConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Columns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    private Long datasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DirtyDataHandleMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dirtyDataHandleMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DirtyDataProcessPattern")
    private String dirtyDataProcessPattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExactlyOnce")
    private String exactlyOnce;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FullComputeUnit")
    private String fullComputeUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HudiAdvancedConfig")
    private String hudiAdvancedConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncrementalComputeUnit")
    private String incrementalComputeUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LakehouseId")
    private Long lakehouseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxOffsetsPerTrigger")
    private Long maxOffsetsPerTrigger;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssLocation")
    private String ossLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionSpecs")
    private java.util.List<java.util.Map<String, ?>> partitionSpecs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrimaryKeyDefinition")
    private String primaryKeyDefinition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartingOffsets")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startingOffsets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Store")
    private String store;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetGenerateRule")
    private String targetGenerateRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnixTimestampConvert")
    private UnixTimestampConvert unixTimestampConvert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workloadName;

    private CreateApsSlsADBJobRequest(Builder builder) {
        super(builder);
        this.acrossRole = builder.acrossRole;
        this.acrossUid = builder.acrossUid;
        this.advancedConfig = builder.advancedConfig;
        this.columns = builder.columns;
        this.DBClusterId = builder.DBClusterId;
        this.datasourceId = builder.datasourceId;
        this.dbName = builder.dbName;
        this.dirtyDataHandleMode = builder.dirtyDataHandleMode;
        this.dirtyDataProcessPattern = builder.dirtyDataProcessPattern;
        this.exactlyOnce = builder.exactlyOnce;
        this.fullComputeUnit = builder.fullComputeUnit;
        this.hudiAdvancedConfig = builder.hudiAdvancedConfig;
        this.incrementalComputeUnit = builder.incrementalComputeUnit;
        this.lakehouseId = builder.lakehouseId;
        this.maxOffsetsPerTrigger = builder.maxOffsetsPerTrigger;
        this.ossLocation = builder.ossLocation;
        this.outputFormat = builder.outputFormat;
        this.partitionSpecs = builder.partitionSpecs;
        this.password = builder.password;
        this.primaryKeyDefinition = builder.primaryKeyDefinition;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.sourceRegionId = builder.sourceRegionId;
        this.startingOffsets = builder.startingOffsets;
        this.store = builder.store;
        this.tableName = builder.tableName;
        this.targetGenerateRule = builder.targetGenerateRule;
        this.targetType = builder.targetType;
        this.unixTimestampConvert = builder.unixTimestampConvert;
        this.userName = builder.userName;
        this.workloadName = builder.workloadName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApsSlsADBJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrossRole
     */
    public String getAcrossRole() {
        return this.acrossRole;
    }

    /**
     * @return acrossUid
     */
    public String getAcrossUid() {
        return this.acrossUid;
    }

    /**
     * @return advancedConfig
     */
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return datasourceId
     */
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dirtyDataHandleMode
     */
    public String getDirtyDataHandleMode() {
        return this.dirtyDataHandleMode;
    }

    /**
     * @return dirtyDataProcessPattern
     */
    public String getDirtyDataProcessPattern() {
        return this.dirtyDataProcessPattern;
    }

    /**
     * @return exactlyOnce
     */
    public String getExactlyOnce() {
        return this.exactlyOnce;
    }

    /**
     * @return fullComputeUnit
     */
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
    }

    /**
     * @return hudiAdvancedConfig
     */
    public String getHudiAdvancedConfig() {
        return this.hudiAdvancedConfig;
    }

    /**
     * @return incrementalComputeUnit
     */
    public String getIncrementalComputeUnit() {
        return this.incrementalComputeUnit;
    }

    /**
     * @return lakehouseId
     */
    public Long getLakehouseId() {
        return this.lakehouseId;
    }

    /**
     * @return maxOffsetsPerTrigger
     */
    public Long getMaxOffsetsPerTrigger() {
        return this.maxOffsetsPerTrigger;
    }

    /**
     * @return ossLocation
     */
    public String getOssLocation() {
        return this.ossLocation;
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return partitionSpecs
     */
    public java.util.List<java.util.Map<String, ?>> getPartitionSpecs() {
        return this.partitionSpecs;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return primaryKeyDefinition
     */
    public String getPrimaryKeyDefinition() {
        return this.primaryKeyDefinition;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return startingOffsets
     */
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    /**
     * @return store
     */
    public String getStore() {
        return this.store;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return targetGenerateRule
     */
    public String getTargetGenerateRule() {
        return this.targetGenerateRule;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return unixTimestampConvert
     */
    public UnixTimestampConvert getUnixTimestampConvert() {
        return this.unixTimestampConvert;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return workloadName
     */
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static final class Builder extends Request.Builder<CreateApsSlsADBJobRequest, Builder> {
        private String acrossRole; 
        private String acrossUid; 
        private String advancedConfig; 
        private java.util.List<Columns> columns; 
        private String DBClusterId; 
        private Long datasourceId; 
        private String dbName; 
        private String dirtyDataHandleMode; 
        private String dirtyDataProcessPattern; 
        private String exactlyOnce; 
        private String fullComputeUnit; 
        private String hudiAdvancedConfig; 
        private String incrementalComputeUnit; 
        private Long lakehouseId; 
        private Long maxOffsetsPerTrigger; 
        private String ossLocation; 
        private String outputFormat; 
        private java.util.List<java.util.Map<String, ?>> partitionSpecs; 
        private String password; 
        private String primaryKeyDefinition; 
        private String project; 
        private String regionId; 
        private String resourceGroup; 
        private String sourceRegionId; 
        private String startingOffsets; 
        private String store; 
        private String tableName; 
        private String targetGenerateRule; 
        private String targetType; 
        private UnixTimestampConvert unixTimestampConvert; 
        private String userName; 
        private String workloadName; 

        private Builder() {
            super();
        } 

        private Builder(CreateApsSlsADBJobRequest request) {
            super(request);
            this.acrossRole = request.acrossRole;
            this.acrossUid = request.acrossUid;
            this.advancedConfig = request.advancedConfig;
            this.columns = request.columns;
            this.DBClusterId = request.DBClusterId;
            this.datasourceId = request.datasourceId;
            this.dbName = request.dbName;
            this.dirtyDataHandleMode = request.dirtyDataHandleMode;
            this.dirtyDataProcessPattern = request.dirtyDataProcessPattern;
            this.exactlyOnce = request.exactlyOnce;
            this.fullComputeUnit = request.fullComputeUnit;
            this.hudiAdvancedConfig = request.hudiAdvancedConfig;
            this.incrementalComputeUnit = request.incrementalComputeUnit;
            this.lakehouseId = request.lakehouseId;
            this.maxOffsetsPerTrigger = request.maxOffsetsPerTrigger;
            this.ossLocation = request.ossLocation;
            this.outputFormat = request.outputFormat;
            this.partitionSpecs = request.partitionSpecs;
            this.password = request.password;
            this.primaryKeyDefinition = request.primaryKeyDefinition;
            this.project = request.project;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
            this.sourceRegionId = request.sourceRegionId;
            this.startingOffsets = request.startingOffsets;
            this.store = request.store;
            this.tableName = request.tableName;
            this.targetGenerateRule = request.targetGenerateRule;
            this.targetType = request.targetType;
            this.unixTimestampConvert = request.unixTimestampConvert;
            this.userName = request.userName;
            this.workloadName = request.workloadName;
        } 

        /**
         * <p>The name of the cross-account role.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        public Builder acrossRole(String acrossRole) {
            this.putBodyParameter("AcrossRole", acrossRole);
            this.acrossRole = acrossRole;
            return this;
        }

        /**
         * <p>The cross-account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder acrossUid(String acrossUid) {
            this.putBodyParameter("AcrossUid", acrossUid);
            this.acrossUid = acrossUid;
            return this;
        }

        /**
         * <p>The advanced configurations.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder advancedConfig(String advancedConfig) {
            this.putBodyParameter("AdvancedConfig", advancedConfig);
            this.advancedConfig = advancedConfig;
            return this;
        }

        /**
         * <p>The information about columns.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putBodyParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*********</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>327</p>
         */
        public Builder datasourceId(Long datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbName</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The dirty data processing mode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dirtyDataHandleMode(String dirtyDataHandleMode) {
            this.putBodyParameter("DirtyDataHandleMode", dirtyDataHandleMode);
            this.dirtyDataHandleMode = dirtyDataHandleMode;
            return this;
        }

        /**
         * <p>The dirty data processing mode.</p>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        public Builder dirtyDataProcessPattern(String dirtyDataProcessPattern) {
            this.putBodyParameter("DirtyDataProcessPattern", dirtyDataProcessPattern);
            this.dirtyDataProcessPattern = dirtyDataProcessPattern;
            return this;
        }

        /**
         * <p>Specifies whether to enable the consistency check.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder exactlyOnce(String exactlyOnce) {
            this.putBodyParameter("ExactlyOnce", exactlyOnce);
            this.exactlyOnce = exactlyOnce;
            return this;
        }

        /**
         * <p>The number of full AnalyticDB compute units (ACUs).</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder fullComputeUnit(String fullComputeUnit) {
            this.putBodyParameter("FullComputeUnit", fullComputeUnit);
            this.fullComputeUnit = fullComputeUnit;
            return this;
        }

        /**
         * <p>The advanced configurations of Hudi.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder hudiAdvancedConfig(String hudiAdvancedConfig) {
            this.putBodyParameter("HudiAdvancedConfig", hudiAdvancedConfig);
            this.hudiAdvancedConfig = hudiAdvancedConfig;
            return this;
        }

        /**
         * <p>The number of increment ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>168</p>
         */
        public Builder incrementalComputeUnit(String incrementalComputeUnit) {
            this.putBodyParameter("IncrementalComputeUnit", incrementalComputeUnit);
            this.incrementalComputeUnit = incrementalComputeUnit;
            return this;
        }

        /**
         * <p>The lakehouse ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder lakehouseId(Long lakehouseId) {
            this.putBodyParameter("LakehouseId", lakehouseId);
            this.lakehouseId = lakehouseId;
            return this;
        }

        /**
         * <p>The latest offset.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder maxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
            this.putBodyParameter("MaxOffsetsPerTrigger", maxOffsetsPerTrigger);
            this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) URL.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test*</p>
         */
        public Builder ossLocation(String ossLocation) {
            this.putBodyParameter("OssLocation", ossLocation);
            this.ossLocation = ossLocation;
            return this;
        }

        /**
         * <p>The format of the output file.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder outputFormat(String outputFormat) {
            this.putBodyParameter("OutputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * <p>The information about partition.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder partitionSpecs(java.util.List<java.util.Map<String, ?>> partitionSpecs) {
            String partitionSpecsShrink = shrink(partitionSpecs, "PartitionSpecs", "json");
            this.putBodyParameter("PartitionSpecs", partitionSpecsShrink);
            this.partitionSpecs = partitionSpecs;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The definition of the primary key.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder primaryKeyDefinition(String primaryKeyDefinition) {
            this.putBodyParameter("PrimaryKeyDefinition", primaryKeyDefinition);
            this.primaryKeyDefinition = primaryKeyDefinition;
            return this;
        }

        /**
         * <p>The name of the SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder project(String project) {
            this.putBodyParameter("Project", project);
            this.project = project;
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
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putBodyParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The region ID of the source cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putBodyParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The start offset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder startingOffsets(String startingOffsets) {
            this.putBodyParameter("StartingOffsets", startingOffsets);
            this.startingOffsets = startingOffsets;
            return this;
        }

        /**
         * <p>The SLS Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder store(String store) {
            this.putBodyParameter("Store", store);
            this.store = store;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The rules for generating the destination database.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder targetGenerateRule(String targetGenerateRule) {
            this.putBodyParameter("TargetGenerateRule", targetGenerateRule);
            this.targetGenerateRule = targetGenerateRule;
            return this;
        }

        /**
         * <p>The destination type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The timestamp conversion.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder unixTimestampConvert(UnixTimestampConvert unixTimestampConvert) {
            String unixTimestampConvertShrink = shrink(unixTimestampConvert, "UnixTimestampConvert", "json");
            this.putBodyParameter("UnixTimestampConvert", unixTimestampConvertShrink);
            this.unixTimestampConvert = unixTimestampConvert;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_test</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The name of the workload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-******</p>
         */
        public Builder workloadName(String workloadName) {
            this.putBodyParameter("WorkloadName", workloadName);
            this.workloadName = workloadName;
            return this;
        }

        @Override
        public CreateApsSlsADBJobRequest build() {
            return new CreateApsSlsADBJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApsSlsADBJobRequest} extends {@link TeaModel}
     *
     * <p>CreateApsSlsADBJobRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MapName")
        private String mapName;

        @com.aliyun.core.annotation.NameInMap("MapType")
        private String mapType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.mapName = builder.mapName;
            this.mapType = builder.mapType;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return mapName
         */
        public String getMapName() {
            return this.mapName;
        }

        /**
         * @return mapType
         */
        public String getMapType() {
            return this.mapType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mapName; 
            private String mapType; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.mapName = model.mapName;
                this.mapType = model.mapType;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the mapping.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mapName(String mapName) {
                this.mapName = mapName;
                return this;
            }

            /**
             * <p>The type of the mapping.</p>
             * 
             * <strong>example:</strong>
             * <p>int</p>
             */
            public Builder mapType(String mapType) {
                this.mapType = mapType;
                return this;
            }

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>bigint</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApsSlsADBJobRequest} extends {@link TeaModel}
     *
     * <p>CreateApsSlsADBJobRequest</p>
     */
    public static class UnixTimestampConvert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Convert")
        private String convert;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Transform")
        private Boolean transform;

        private UnixTimestampConvert(Builder builder) {
            this.convert = builder.convert;
            this.format = builder.format;
            this.transform = builder.transform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnixTimestampConvert create() {
            return builder().build();
        }

        /**
         * @return convert
         */
        public String getConvert() {
            return this.convert;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return transform
         */
        public Boolean getTransform() {
            return this.transform;
        }

        public static final class Builder {
            private String convert; 
            private String format; 
            private Boolean transform; 

            private Builder() {
            } 

            private Builder(UnixTimestampConvert model) {
                this.convert = model.convert;
                this.format = model.format;
                this.transform = model.transform;
            } 

            /**
             * <p>Specifies whether to enable the conversion of timestamps.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder convert(String convert) {
                this.convert = convert;
                return this;
            }

            /**
             * <p>The format of the timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>yyyyMMdd</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>Specifies whether to enable the timestamp conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder transform(Boolean transform) {
                this.transform = transform;
                return this;
            }

            public UnixTimestampConvert build() {
                return new UnixTimestampConvert(this);
            } 

        } 

    }
}
