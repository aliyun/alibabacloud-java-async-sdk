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
 * {@link CreateApsKafkaHudiJobRequest} extends {@link RequestModel}
 *
 * <p>CreateApsKafkaHudiJobRequest</p>
 */
public class CreateApsKafkaHudiJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DataFormatType")
    private String dataFormatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataOutputFormat")
    private String dataOutputFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    private Long datasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FullComputeUnit")
    private String fullComputeUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HudiAdvancedConfig")
    private String hudiAdvancedConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncrementalComputeUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incrementalComputeUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JsonParseLevel")
    private Integer jsonParseLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KafkaClusterId")
    private String kafkaClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KafkaTopic")
    private String kafkaTopic;

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
    @com.aliyun.core.annotation.NameInMap("PrimaryKeyDefinition")
    private String primaryKeyDefinition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartingOffsets")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startingOffsets;

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
    @com.aliyun.core.annotation.NameInMap("WorkloadName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workloadName;

    private CreateApsKafkaHudiJobRequest(Builder builder) {
        super(builder);
        this.acrossRole = builder.acrossRole;
        this.acrossUid = builder.acrossUid;
        this.advancedConfig = builder.advancedConfig;
        this.columns = builder.columns;
        this.DBClusterId = builder.DBClusterId;
        this.dataFormatType = builder.dataFormatType;
        this.dataOutputFormat = builder.dataOutputFormat;
        this.datasourceId = builder.datasourceId;
        this.dbName = builder.dbName;
        this.fullComputeUnit = builder.fullComputeUnit;
        this.hudiAdvancedConfig = builder.hudiAdvancedConfig;
        this.incrementalComputeUnit = builder.incrementalComputeUnit;
        this.jsonParseLevel = builder.jsonParseLevel;
        this.kafkaClusterId = builder.kafkaClusterId;
        this.kafkaTopic = builder.kafkaTopic;
        this.lakehouseId = builder.lakehouseId;
        this.maxOffsetsPerTrigger = builder.maxOffsetsPerTrigger;
        this.ossLocation = builder.ossLocation;
        this.outputFormat = builder.outputFormat;
        this.partitionSpecs = builder.partitionSpecs;
        this.primaryKeyDefinition = builder.primaryKeyDefinition;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.sourceRegionId = builder.sourceRegionId;
        this.startingOffsets = builder.startingOffsets;
        this.tableName = builder.tableName;
        this.targetGenerateRule = builder.targetGenerateRule;
        this.targetType = builder.targetType;
        this.workloadName = builder.workloadName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApsKafkaHudiJobRequest create() {
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
     * @return dataFormatType
     */
    public String getDataFormatType() {
        return this.dataFormatType;
    }

    /**
     * @return dataOutputFormat
     */
    public String getDataOutputFormat() {
        return this.dataOutputFormat;
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
     * @return jsonParseLevel
     */
    public Integer getJsonParseLevel() {
        return this.jsonParseLevel;
    }

    /**
     * @return kafkaClusterId
     */
    public String getKafkaClusterId() {
        return this.kafkaClusterId;
    }

    /**
     * @return kafkaTopic
     */
    public String getKafkaTopic() {
        return this.kafkaTopic;
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
     * @return primaryKeyDefinition
     */
    public String getPrimaryKeyDefinition() {
        return this.primaryKeyDefinition;
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
     * @return workloadName
     */
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static final class Builder extends Request.Builder<CreateApsKafkaHudiJobRequest, Builder> {
        private String acrossRole; 
        private String acrossUid; 
        private String advancedConfig; 
        private java.util.List<Columns> columns; 
        private String DBClusterId; 
        private String dataFormatType; 
        private String dataOutputFormat; 
        private Long datasourceId; 
        private String dbName; 
        private String fullComputeUnit; 
        private String hudiAdvancedConfig; 
        private String incrementalComputeUnit; 
        private Integer jsonParseLevel; 
        private String kafkaClusterId; 
        private String kafkaTopic; 
        private Long lakehouseId; 
        private Long maxOffsetsPerTrigger; 
        private String ossLocation; 
        private String outputFormat; 
        private java.util.List<java.util.Map<String, ?>> partitionSpecs; 
        private String primaryKeyDefinition; 
        private String regionId; 
        private String resourceGroup; 
        private String sourceRegionId; 
        private String startingOffsets; 
        private String tableName; 
        private String targetGenerateRule; 
        private String targetType; 
        private String workloadName; 

        private Builder() {
            super();
        } 

        private Builder(CreateApsKafkaHudiJobRequest request) {
            super(request);
            this.acrossRole = request.acrossRole;
            this.acrossUid = request.acrossUid;
            this.advancedConfig = request.advancedConfig;
            this.columns = request.columns;
            this.DBClusterId = request.DBClusterId;
            this.dataFormatType = request.dataFormatType;
            this.dataOutputFormat = request.dataOutputFormat;
            this.datasourceId = request.datasourceId;
            this.dbName = request.dbName;
            this.fullComputeUnit = request.fullComputeUnit;
            this.hudiAdvancedConfig = request.hudiAdvancedConfig;
            this.incrementalComputeUnit = request.incrementalComputeUnit;
            this.jsonParseLevel = request.jsonParseLevel;
            this.kafkaClusterId = request.kafkaClusterId;
            this.kafkaTopic = request.kafkaTopic;
            this.lakehouseId = request.lakehouseId;
            this.maxOffsetsPerTrigger = request.maxOffsetsPerTrigger;
            this.ossLocation = request.ossLocation;
            this.outputFormat = request.outputFormat;
            this.partitionSpecs = request.partitionSpecs;
            this.primaryKeyDefinition = request.primaryKeyDefinition;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
            this.sourceRegionId = request.sourceRegionId;
            this.startingOffsets = request.startingOffsets;
            this.tableName = request.tableName;
            this.targetGenerateRule = request.targetGenerateRule;
            this.targetType = request.targetType;
            this.workloadName = request.workloadName;
        } 

        /**
         * <p>The RAM role of a trusted entity that is an Alibaba Cloud account. For more information about how to create a RAM role, see Create a RAM role for a trusted Alibaba Cloud account.
         * The Alibaba Cloud account that owns the AnalyticDB for MySQL cluster must be added as a trusted account to the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>aps</p>
         */
        public Builder acrossRole(String acrossRole) {
            this.putBodyParameter("AcrossRole", acrossRole);
            this.acrossRole = acrossRole;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the source Kafka instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123************</p>
         */
        public Builder acrossUid(String acrossUid) {
            this.putBodyParameter("AcrossUid", acrossUid);
            this.acrossUid = acrossUid;
            return this;
        }

        /**
         * <p>The advanced configuration.</p>
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
         * <p>The column information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putBodyParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to view the cluster IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters in the destination region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The Kafka message type. Valid values: json, general_canal_json, mongo_canal_json, dataworks_json, and shareplex_json.</p>
         * 
         * <strong>example:</strong>
         * <p>json</p>
         */
        public Builder dataFormatType(String dataFormatType) {
            this.putBodyParameter("DataFormatType", dataFormatType);
            this.dataFormatType = dataFormatType;
            return this;
        }

        /**
         * <p>The valid values and their descriptions are as follows:
         * Single: The source is a single-line JSON record.
         * Multi: The source is a JSON array. A single JSON record is returned as the output.</p>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        public Builder dataOutputFormat(String dataOutputFormat) {
            this.putBodyParameter("DataOutputFormat", dataOutputFormat);
            this.dataOutputFormat = dataOutputFormat;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder datasourceId(Long datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * <p>The user-defined name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The configuration for full synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2ACU</p>
         */
        public Builder fullComputeUnit(String fullComputeUnit) {
            this.putBodyParameter("FullComputeUnit", fullComputeUnit);
            this.fullComputeUnit = fullComputeUnit;
            return this;
        }

        /**
         * <p>The Hudi configuration for the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>hoodie.keep.min.commits=20</p>
         */
        public Builder hudiAdvancedConfig(String hudiAdvancedConfig) {
            this.putBodyParameter("HudiAdvancedConfig", hudiAdvancedConfig);
            this.hudiAdvancedConfig = hudiAdvancedConfig;
            return this;
        }

        /**
         * <p>The configuration for incremental synchronization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2ACU</p>
         */
        public Builder incrementalComputeUnit(String incrementalComputeUnit) {
            this.putBodyParameter("IncrementalComputeUnit", incrementalComputeUnit);
            this.incrementalComputeUnit = incrementalComputeUnit;
            return this;
        }

        /**
         * <p>The number of nested JSON layers to parse. Valid values:
         * 0: No parsing is performed.
         * 1: One layer is parsed.
         * 2: Two layers are parsed.
         * 3: Three layers are parsed.
         * 4: Four layers are parsed.
         * By default, one layer is parsed. For more information about the JSON parsing policy for nested data, see JSON parsing levels and schema field inference examples.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder jsonParseLevel(Integer jsonParseLevel) {
            this.putBodyParameter("JsonParseLevel", jsonParseLevel);
            this.jsonParseLevel = jsonParseLevel;
            return this;
        }

        /**
         * <p>The ID of the Kafka instance. Obtain the ID from the Kafka console.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder kafkaClusterId(String kafkaClusterId) {
            this.putBodyParameter("KafkaClusterId", kafkaClusterId);
            this.kafkaClusterId = kafkaClusterId;
            return this;
        }

        /**
         * <p>The ID of the Kafka topic. Obtain the ID from the Kafka console.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder kafkaTopic(String kafkaTopic) {
            this.putBodyParameter("KafkaTopic", kafkaTopic);
            this.kafkaTopic = kafkaTopic;
            return this;
        }

        /**
         * <p>The ID of the lakehouse.</p>
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
         * <p>The number of entries to consume in a single batch.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        public Builder maxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
            this.putBodyParameter("MaxOffsetsPerTrigger", maxOffsetsPerTrigger);
            this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
            return this;
        }

        /**
         * <p>The destination lakehouse address. This must be a complete OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-xx-zzz/yyy/</p>
         */
        public Builder ossLocation(String ossLocation) {
            this.putBodyParameter("OssLocation", ossLocation);
            this.ossLocation = ossLocation;
            return this;
        }

        /**
         * <p>The output data format.</p>
         * 
         * <strong>example:</strong>
         * <p>HUDI</p>
         */
        public Builder outputFormat(String outputFormat) {
            this.putBodyParameter("OutputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * <p>The partition information.</p>
         */
        public Builder partitionSpecs(java.util.List<java.util.Map<String, ?>> partitionSpecs) {
            String partitionSpecsShrink = shrink(partitionSpecs, "PartitionSpecs", "json");
            this.putBodyParameter("PartitionSpecs", partitionSpecsShrink);
            this.partitionSpecs = partitionSpecs;
            return this;
        }

        /**
         * <p>The primary key settings. This parameter supports the UUID policy and the mapping policy. The policies are described as follows.
         * UUID policy: &quot;Strategy&quot;: &quot;uuid&quot;.
         * Mapping policy:
         * &quot;Strategy&quot;: &quot;mapping&quot;,
         * &quot;Values&quot;:[
         * &quot;f1&quot;,
         * &quot;f2&quot;
         * ],
         * &quot;RecordVersionField&quot;,&quot;xxx&quot;
         * \<code>RecordVersionField\\</code> specifies the Hudi record version.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Strategy&quot;: &quot;mapping&quot;</p>
         */
        public Builder primaryKeyDefinition(String primaryKeyDefinition) {
            this.putBodyParameter("PrimaryKeyDefinition", primaryKeyDefinition);
            this.primaryKeyDefinition = primaryKeyDefinition;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aps</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putBodyParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putBodyParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The initial consumer offset for Kafka.
         * Valid values:
         * begin_cursor, end_cursor, and timestamp.
         * These values correspond to the earliest offset, the latest offset, and a specified time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>begincursor</p>
         */
        public Builder startingOffsets(String startingOffsets) {
            this.putBodyParameter("StartingOffsets", startingOffsets);
            this.startingOffsets = startingOffsets;
            return this;
        }

        /**
         * <p>The user-defined name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testTB</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The generation rule for the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder targetGenerateRule(String targetGenerateRule) {
            this.putBodyParameter("TargetGenerateRule", targetGenerateRule);
            this.targetGenerateRule = targetGenerateRule;
            return this;
        }

        /**
         * <p>The type of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The name of the workload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder workloadName(String workloadName) {
            this.putBodyParameter("WorkloadName", workloadName);
            this.workloadName = workloadName;
            return this;
        }

        @Override
        public CreateApsKafkaHudiJobRequest build() {
            return new CreateApsKafkaHudiJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApsKafkaHudiJobRequest} extends {@link TeaModel}
     *
     * <p>CreateApsKafkaHudiJobRequest</p>
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
             * <p>The name of the destination field.</p>
             * 
             * <strong>example:</strong>
             * <p>b</p>
             */
            public Builder mapName(String mapName) {
                this.mapName = mapName;
                return this;
            }

            /**
             * <p>The type of the destination field.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder mapType(String mapType) {
                this.mapType = mapType;
                return this;
            }

            /**
             * <p>The name of the source field.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the source field.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
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
}
