// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOmsOpenAPIProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateOmsOpenAPIProjectRequest</p>
 */
public class CreateOmsOpenAPIProjectRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BusinessName")
    private String businessName;

    @Body
    @NameInMap("DestConfig")
    private DestConfig destConfig;

    @Body
    @NameInMap("LabelIds")
    private java.util.List < String > labelIds;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectName")
    private String projectName;

    @Body
    @NameInMap("SourceConfig")
    private SourceConfig sourceConfig;

    @Body
    @NameInMap("TransferMapping")
    private TransferMapping transferMapping;

    @Body
    @NameInMap("TransferStepConfig")
    private TransferStepConfig transferStepConfig;

    @Body
    @NameInMap("WorkerGradeId")
    private String workerGradeId;

    private CreateOmsOpenAPIProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessName = builder.businessName;
        this.destConfig = builder.destConfig;
        this.labelIds = builder.labelIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectName = builder.projectName;
        this.sourceConfig = builder.sourceConfig;
        this.transferMapping = builder.transferMapping;
        this.transferStepConfig = builder.transferStepConfig;
        this.workerGradeId = builder.workerGradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOmsOpenAPIProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * @return destConfig
     */
    public DestConfig getDestConfig() {
        return this.destConfig;
    }

    /**
     * @return labelIds
     */
    public java.util.List < String > getLabelIds() {
        return this.labelIds;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceConfig
     */
    public SourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    /**
     * @return transferMapping
     */
    public TransferMapping getTransferMapping() {
        return this.transferMapping;
    }

    /**
     * @return transferStepConfig
     */
    public TransferStepConfig getTransferStepConfig() {
        return this.transferStepConfig;
    }

    /**
     * @return workerGradeId
     */
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static final class Builder extends Request.Builder<CreateOmsOpenAPIProjectRequest, Builder> {
        private String regionId; 
        private String businessName; 
        private DestConfig destConfig; 
        private java.util.List < String > labelIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectName; 
        private SourceConfig sourceConfig; 
        private TransferMapping transferMapping; 
        private TransferStepConfig transferStepConfig; 
        private String workerGradeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOmsOpenAPIProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessName = request.businessName;
            this.destConfig = request.destConfig;
            this.labelIds = request.labelIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectName = request.projectName;
            this.sourceConfig = request.sourceConfig;
            this.transferMapping = request.transferMapping;
            this.transferStepConfig = request.transferStepConfig;
            this.workerGradeId = request.workerGradeId;
        } 

        /**
         * 实例所属的地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The business system identifier, which is optional and is a specific field of the Post message.
         */
        public Builder businessName(String businessName) {
            this.putBodyParameter("BusinessName", businessName);
            this.businessName = businessName;
            return this;
        }

        /**
         * The settings of the destination data source.
         */
        public Builder destConfig(DestConfig destConfig) {
            String destConfigShrink = shrink(destConfig, "DestConfig", "json");
            this.putBodyParameter("DestConfig", destConfigShrink);
            this.destConfig = destConfig;
            return this;
        }

        /**
         * A collection of label IDs.
         */
        public Builder labelIds(java.util.List < String > labelIds) {
            String labelIdsShrink = shrink(labelIds, "LabelIds", "json");
            this.putBodyParameter("LabelIds", labelIdsShrink);
            this.labelIds = labelIds;
            return this;
        }

        /**
         * The page number, which takes effect in a pagination query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page size, which takes effect in a pagination query.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the project.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The settings of the source data source.
         */
        public Builder sourceConfig(SourceConfig sourceConfig) {
            String sourceConfigShrink = shrink(sourceConfig, "SourceConfig", "json");
            this.putBodyParameter("SourceConfig", sourceConfigShrink);
            this.sourceConfig = sourceConfig;
            return this;
        }

        /**
         * The mappings for the synchronization objects.
         */
        public Builder transferMapping(TransferMapping transferMapping) {
            String transferMappingShrink = shrink(transferMapping, "TransferMapping", "json");
            this.putBodyParameter("TransferMapping", transferMappingShrink);
            this.transferMapping = transferMapping;
            return this;
        }

        /**
         * The settings of synchronization steps.
         */
        public Builder transferStepConfig(TransferStepConfig transferStepConfig) {
            String transferStepConfigShrink = shrink(transferStepConfig, "TransferStepConfig", "json");
            this.putBodyParameter("TransferStepConfig", transferStepConfigShrink);
            this.transferStepConfig = transferStepConfig;
            return this;
        }

        /**
         * The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.
         */
        public Builder workerGradeId(String workerGradeId) {
            this.putBodyParameter("WorkerGradeId", workerGradeId);
            this.workerGradeId = workerGradeId;
            return this;
        }

        @Override
        public CreateOmsOpenAPIProjectRequest build() {
            return new CreateOmsOpenAPIProjectRequest(this);
        } 

    } 

    public static class DestConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        private Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("MsgTags")
        private String msgTags;

        @NameInMap("Partition")
        private Integer partition;

        @NameInMap("PartitionMode")
        private String partitionMode;

        @NameInMap("ProducerGroup")
        private String producerGroup;

        @NameInMap("SendMsgTimeout")
        private Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        private Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        private Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        private String serializerType;

        @NameInMap("TopicType")
        private String topicType;

        private DestConfig(Builder builder) {
            this.enableMsgTrace = builder.enableMsgTrace;
            this.endpointId = builder.endpointId;
            this.endpointType = builder.endpointType;
            this.msgTags = builder.msgTags;
            this.partition = builder.partition;
            this.partitionMode = builder.partitionMode;
            this.producerGroup = builder.producerGroup;
            this.sendMsgTimeout = builder.sendMsgTimeout;
            this.sequenceEnable = builder.sequenceEnable;
            this.sequenceStartTimestamp = builder.sequenceStartTimestamp;
            this.serializerType = builder.serializerType;
            this.topicType = builder.topicType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestConfig create() {
            return builder().build();
        }

        /**
         * @return enableMsgTrace
         */
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return msgTags
         */
        public String getMsgTags() {
            return this.msgTags;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return partitionMode
         */
        public String getPartitionMode() {
            return this.partitionMode;
        }

        /**
         * @return producerGroup
         */
        public String getProducerGroup() {
            return this.producerGroup;
        }

        /**
         * @return sendMsgTimeout
         */
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        /**
         * @return sequenceEnable
         */
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        /**
         * @return sequenceStartTimestamp
         */
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        /**
         * @return serializerType
         */
        public String getSerializerType() {
            return this.serializerType;
        }

        /**
         * @return topicType
         */
        public String getTopicType() {
            return this.topicType;
        }

        public static final class Builder {
            private Boolean enableMsgTrace; 
            private String endpointId; 
            private String endpointType; 
            private String msgTags; 
            private Integer partition; 
            private String partitionMode; 
            private String producerGroup; 
            private Long sendMsgTimeout; 
            private Boolean sequenceEnable; 
            private Long sequenceStartTimestamp; 
            private String serializerType; 
            private String topicType; 

            /**
             * Specifies whether to enable message tracing when the destination data source is RocketMQ.
             */
            public Builder enableMsgTrace(Boolean enableMsgTrace) {
                this.enableMsgTrace = enableMsgTrace;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The tag of the Post message when the destination data source is RocketMQ.
             */
            public Builder msgTags(String msgTags) {
                this.msgTags = msgTags;
                return this;
            }

            /**
             * The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.
             */
            public Builder partitionMode(String partitionMode) {
                this.partitionMode = partitionMode;
                return this;
            }

            /**
             * The producer group of the Post message when the destination data source is RocketMQ.
             */
            public Builder producerGroup(String producerGroup) {
                this.producerGroup = producerGroup;
                return this;
            }

            /**
             * The timeout period for a single Post message when the destination data source is RocketMQ.
             */
            public Builder sendMsgTimeout(Long sendMsgTimeout) {
                this.sendMsgTimeout = sendMsgTimeout;
                return this;
            }

            /**
             * Specifies whether to enable message sequencing when the destination data source is DataHub.
             */
            public Builder sequenceEnable(Boolean sequenceEnable) {
                this.sequenceEnable = sequenceEnable;
                return this;
            }

            /**
             * The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.
             */
            public Builder sequenceStartTimestamp(Long sequenceStartTimestamp) {
                this.sequenceStartTimestamp = sequenceStartTimestamp;
                return this;
            }

            /**
             * The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, Canal, Dataworks, SharePlex, and DefaultExtendColumnType.
             */
            public Builder serializerType(String serializerType) {
                this.serializerType = serializerType;
                return this;
            }

            /**
             * The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.
             */
            public Builder topicType(String topicType) {
                this.topicType = topicType;
                return this;
            }

            public DestConfig build() {
                return new DestConfig(this);
            } 

        } 

    }
    public static class SourceConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        private Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("MsgTags")
        private String msgTags;

        @NameInMap("Partition")
        private Integer partition;

        @NameInMap("PartitionMode")
        private String partitionMode;

        @NameInMap("ProducerGroup")
        private String producerGroup;

        @NameInMap("SendMsgTimeout")
        private Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        private Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        private Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        private String serializerType;

        @NameInMap("TopicType")
        private String topicType;

        private SourceConfig(Builder builder) {
            this.enableMsgTrace = builder.enableMsgTrace;
            this.endpointId = builder.endpointId;
            this.endpointType = builder.endpointType;
            this.msgTags = builder.msgTags;
            this.partition = builder.partition;
            this.partitionMode = builder.partitionMode;
            this.producerGroup = builder.producerGroup;
            this.sendMsgTimeout = builder.sendMsgTimeout;
            this.sequenceEnable = builder.sequenceEnable;
            this.sequenceStartTimestamp = builder.sequenceStartTimestamp;
            this.serializerType = builder.serializerType;
            this.topicType = builder.topicType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceConfig create() {
            return builder().build();
        }

        /**
         * @return enableMsgTrace
         */
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return msgTags
         */
        public String getMsgTags() {
            return this.msgTags;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return partitionMode
         */
        public String getPartitionMode() {
            return this.partitionMode;
        }

        /**
         * @return producerGroup
         */
        public String getProducerGroup() {
            return this.producerGroup;
        }

        /**
         * @return sendMsgTimeout
         */
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        /**
         * @return sequenceEnable
         */
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        /**
         * @return sequenceStartTimestamp
         */
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        /**
         * @return serializerType
         */
        public String getSerializerType() {
            return this.serializerType;
        }

        /**
         * @return topicType
         */
        public String getTopicType() {
            return this.topicType;
        }

        public static final class Builder {
            private Boolean enableMsgTrace; 
            private String endpointId; 
            private String endpointType; 
            private String msgTags; 
            private Integer partition; 
            private String partitionMode; 
            private String producerGroup; 
            private Long sendMsgTimeout; 
            private Boolean sequenceEnable; 
            private Long sequenceStartTimestamp; 
            private String serializerType; 
            private String topicType; 

            /**
             * Specifies whether to enable message tracing when the destination data source is RocketMQ.
             */
            public Builder enableMsgTrace(Boolean enableMsgTrace) {
                this.enableMsgTrace = enableMsgTrace;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The tag of the Post message when the destination data source is RocketMQ.
             */
            public Builder msgTags(String msgTags) {
                this.msgTags = msgTags;
                return this;
            }

            /**
             * The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.
             */
            public Builder partitionMode(String partitionMode) {
                this.partitionMode = partitionMode;
                return this;
            }

            /**
             * The producer group of the Post message when the destination data source is RocketMQ.
             */
            public Builder producerGroup(String producerGroup) {
                this.producerGroup = producerGroup;
                return this;
            }

            /**
             * The timeout period for a single Post message when the destination data source is RocketMQ.
             */
            public Builder sendMsgTimeout(Long sendMsgTimeout) {
                this.sendMsgTimeout = sendMsgTimeout;
                return this;
            }

            /**
             * Specifies whether to enable message sequencing when the destination data source is DataHub.
             */
            public Builder sequenceEnable(Boolean sequenceEnable) {
                this.sequenceEnable = sequenceEnable;
                return this;
            }

            /**
             * The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.
             */
            public Builder sequenceStartTimestamp(Long sequenceStartTimestamp) {
                this.sequenceStartTimestamp = sequenceStartTimestamp;
                return this;
            }

            /**
             * The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, Canal, Dataworks, SharePlex, and DefaultExtendColumnType.
             */
            public Builder serializerType(String serializerType) {
                this.serializerType = serializerType;
                return this;
            }

            /**
             * The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.
             */
            public Builder topicType(String topicType) {
                this.topicType = topicType;
                return this;
            }

            public SourceConfig build() {
                return new SourceConfig(this);
            } 

        } 

    }
    public static class AdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @NameInMap("PartitionLifeCycle")
        private Integer partitionLifeCycle;

        @NameInMap("PartitionStatement")
        private String partitionStatement;

        @NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

        private AdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List < String > getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private Integer partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * The list of distribution key columns.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * The lifecycle of the table.
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * The partitioning expression.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * The list of primary key columns.
             */
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public AdbTableSchema build() {
                return new AdbTableSchema(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @NameInMap("AdbTableSchema")
        private AdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @NameInMap("TableId")
        private String tableId;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("Type")
        private String type;

        @NameInMap("WhereClause")
        private String whereClause;

        private Tables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.mappedName = builder.mappedName;
            this.shardColumns = builder.shardColumns;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.type = builder.type;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public AdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private AdbTableSchema adbTableSchema; 
            private java.util.List < String > filterColumns; 
            private String mappedName; 
            private java.util.List < String > shardColumns; 
            private String tableId; 
            private String tableName; 
            private String type; 
            private String whereClause; 

            /**
             * The schema of the ADB table. If the destination data source is ADB, you need to configure additional information for schema synchronization.
             */
            public Builder adbTableSchema(AdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * The list of filter columns, which are the columns to be synchronized.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * The name of the mapped-to table or topic. If the destination data source is a database, this parameter specifies the name of the mapped-to table. If the destination data source is a message queue system, this parameter specifies the name of the mapped-to topic.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * The list of sharding key columns. This parameter applies to scenarios where the destination data source is a message queue system.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * The ID of the table. This parameter takes effect when the source data source is IDB.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Valid values: DATABASE and TABLE.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The row filter conditions.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Tables")
        private java.util.List < Tables> tables;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("Type")
        private String type;

        private Databases(Builder builder) {
            this.databaseId = builder.databaseId;
            this.databaseName = builder.databaseName;
            this.mappedName = builder.mappedName;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String databaseId; 
            private String databaseName; 
            private String mappedName; 
            private java.util.List < Tables> tables; 
            private String tenantName; 
            private String type; 

            /**
             * The ID of the database. This parameter takes effect when the source data source is IDB.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The mapped-to database. This parameter takes effect when the destination data source is a database.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * The settings for the target table objects in the current database.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * The mapped-to tenant. This parameter takes effect when the source data source is OceanBase Database.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Valid values: DATABASE and TABLE.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    public static class TransferMapping extends TeaModel {
        @NameInMap("Databases")
        private java.util.List < Databases> databases;

        @NameInMap("Mode")
        private String mode;

        private TransferMapping(Builder builder) {
            this.databases = builder.databases;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferMapping create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 
            private String mode; 

            /**
             * The table mapping in the source data source, which is a conventional mapping scheme and takes effect only when Mode is set to NORMAL.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * The mapping type. Valid values: \"NORMAL\" and \"WHITE_AND_BLACK_LIST\".
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public TransferMapping build() {
                return new TransferMapping(this);
            } 

        } 

    }
    public static class IncrSyncStepTransferConfig extends TeaModel {
        @NameInMap("RecordTypeList")
        private java.util.List < String > recordTypeList;

        @NameInMap("StartTimestamp")
        private Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        private Long storeLogKeptHour;

        @NameInMap("StoreTransactionEnabled")
        private Boolean storeTransactionEnabled;

        @NameInMap("TransferStepType")
        private String transferStepType;

        private IncrSyncStepTransferConfig(Builder builder) {
            this.recordTypeList = builder.recordTypeList;
            this.startTimestamp = builder.startTimestamp;
            this.storeLogKeptHour = builder.storeLogKeptHour;
            this.storeTransactionEnabled = builder.storeTransactionEnabled;
            this.transferStepType = builder.transferStepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrSyncStepTransferConfig create() {
            return builder().build();
        }

        /**
         * @return recordTypeList
         */
        public java.util.List < String > getRecordTypeList() {
            return this.recordTypeList;
        }

        /**
         * @return startTimestamp
         */
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return storeLogKeptHour
         */
        public Long getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        /**
         * @return storeTransactionEnabled
         */
        public Boolean getStoreTransactionEnabled() {
            return this.storeTransactionEnabled;
        }

        /**
         * @return transferStepType
         */
        public String getTransferStepType() {
            return this.transferStepType;
        }

        public static final class Builder {
            private java.util.List < String > recordTypeList; 
            private Long startTimestamp; 
            private Long storeLogKeptHour; 
            private Boolean storeTransactionEnabled; 
            private String transferStepType; 

            /**
             * The list of data types of incremental data synchronized in incremental synchronization.
             */
            public Builder recordTypeList(java.util.List < String > recordTypeList) {
                this.recordTypeList = recordTypeList;
                return this;
            }

            /**
             * The start time for incremental synchronization. The value is a timestamp in seconds.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * The retention time of logs when incremental synchronization is enabled and the incremental log pull component is Store.
             */
            public Builder storeLogKeptHour(Long storeLogKeptHour) {
                this.storeLogKeptHour = storeLogKeptHour;
                return this;
            }

            /**
             * Specifies whether to enable intra-transaction sequencing when incremental synchronization is enabled and the incremental log pull component is Store.
             */
            public Builder storeTransactionEnabled(Boolean storeTransactionEnabled) {
                this.storeTransactionEnabled = storeTransactionEnabled;
                return this;
            }

            /**
             * Valid values: STRUCT, FULL, and INCR.
             */
            public Builder transferStepType(String transferStepType) {
                this.transferStepType = transferStepType;
                return this;
            }

            public IncrSyncStepTransferConfig build() {
                return new IncrSyncStepTransferConfig(this);
            } 

        } 

    }
    public static class TransferStepConfig extends TeaModel {
        @NameInMap("EnableFullSync")
        private Boolean enableFullSync;

        @NameInMap("EnableIncrSync")
        private Boolean enableIncrSync;

        @NameInMap("EnableStructSync")
        private Boolean enableStructSync;

        @NameInMap("IncrSyncStepTransferConfig")
        private IncrSyncStepTransferConfig incrSyncStepTransferConfig;

        private TransferStepConfig(Builder builder) {
            this.enableFullSync = builder.enableFullSync;
            this.enableIncrSync = builder.enableIncrSync;
            this.enableStructSync = builder.enableStructSync;
            this.incrSyncStepTransferConfig = builder.incrSyncStepTransferConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferStepConfig create() {
            return builder().build();
        }

        /**
         * @return enableFullSync
         */
        public Boolean getEnableFullSync() {
            return this.enableFullSync;
        }

        /**
         * @return enableIncrSync
         */
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        /**
         * @return enableStructSync
         */
        public Boolean getEnableStructSync() {
            return this.enableStructSync;
        }

        /**
         * @return incrSyncStepTransferConfig
         */
        public IncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
            return this.incrSyncStepTransferConfig;
        }

        public static final class Builder {
            private Boolean enableFullSync; 
            private Boolean enableIncrSync; 
            private Boolean enableStructSync; 
            private IncrSyncStepTransferConfig incrSyncStepTransferConfig; 

            /**
             * Specifies whether to enable full migration.
             */
            public Builder enableFullSync(Boolean enableFullSync) {
                this.enableFullSync = enableFullSync;
                return this;
            }

            /**
             * Specifies whether to enable incremental synchronization.
             */
            public Builder enableIncrSync(Boolean enableIncrSync) {
                this.enableIncrSync = enableIncrSync;
                return this;
            }

            /**
             * Specifies whether to enable schema synchronization.
             */
            public Builder enableStructSync(Boolean enableStructSync) {
                this.enableStructSync = enableStructSync;
                return this;
            }

            /**
             * The settings of incremental synchronization steps.
             */
            public Builder incrSyncStepTransferConfig(IncrSyncStepTransferConfig incrSyncStepTransferConfig) {
                this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
                return this;
            }

            public TransferStepConfig build() {
                return new TransferStepConfig(this);
            } 

        } 

    }
}
