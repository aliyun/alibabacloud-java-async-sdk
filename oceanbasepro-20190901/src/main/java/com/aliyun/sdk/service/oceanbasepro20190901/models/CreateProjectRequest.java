// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommonTransferConfig")
    private CommonTransferConfig commonTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableFullTransfer")
    private Boolean enableFullTransfer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableFullVerify")
    private Boolean enableFullVerify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableIncrTransfer")
    private Boolean enableIncrTransfer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableReverseIncrTransfer")
    private Boolean enableReverseIncrTransfer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableStructTransfer")
    private Boolean enableStructTransfer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FullTransferConfig")
    private FullTransferConfig fullTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncrTransferConfig")
    private IncrTransferConfig incrTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelIds")
    private java.util.List<String> labelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReverseIncrTransferConfig")
    private ReverseIncrTransferConfig reverseIncrTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SinkEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sinkEndpointId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceEndpointId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StructTransferConfig")
    private StructTransferConfig structTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransferMapping")
    @com.aliyun.core.annotation.Validation(required = true)
    private TransferMapping transferMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseOss")
    private Boolean useOss;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkerGradeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workerGradeId;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.commonTransferConfig = builder.commonTransferConfig;
        this.enableFullTransfer = builder.enableFullTransfer;
        this.enableFullVerify = builder.enableFullVerify;
        this.enableIncrTransfer = builder.enableIncrTransfer;
        this.enableReverseIncrTransfer = builder.enableReverseIncrTransfer;
        this.enableStructTransfer = builder.enableStructTransfer;
        this.fullTransferConfig = builder.fullTransferConfig;
        this.id = builder.id;
        this.incrTransferConfig = builder.incrTransferConfig;
        this.labelIds = builder.labelIds;
        this.name = builder.name;
        this.ossKey = builder.ossKey;
        this.reverseIncrTransferConfig = builder.reverseIncrTransferConfig;
        this.sinkEndpointId = builder.sinkEndpointId;
        this.sourceEndpointId = builder.sourceEndpointId;
        this.structTransferConfig = builder.structTransferConfig;
        this.transferMapping = builder.transferMapping;
        this.type = builder.type;
        this.useOss = builder.useOss;
        this.workerGradeId = builder.workerGradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
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
     * @return commonTransferConfig
     */
    public CommonTransferConfig getCommonTransferConfig() {
        return this.commonTransferConfig;
    }

    /**
     * @return enableFullTransfer
     */
    public Boolean getEnableFullTransfer() {
        return this.enableFullTransfer;
    }

    /**
     * @return enableFullVerify
     */
    public Boolean getEnableFullVerify() {
        return this.enableFullVerify;
    }

    /**
     * @return enableIncrTransfer
     */
    public Boolean getEnableIncrTransfer() {
        return this.enableIncrTransfer;
    }

    /**
     * @return enableReverseIncrTransfer
     */
    public Boolean getEnableReverseIncrTransfer() {
        return this.enableReverseIncrTransfer;
    }

    /**
     * @return enableStructTransfer
     */
    public Boolean getEnableStructTransfer() {
        return this.enableStructTransfer;
    }

    /**
     * @return fullTransferConfig
     */
    public FullTransferConfig getFullTransferConfig() {
        return this.fullTransferConfig;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return incrTransferConfig
     */
    public IncrTransferConfig getIncrTransferConfig() {
        return this.incrTransferConfig;
    }

    /**
     * @return labelIds
     */
    public java.util.List<String> getLabelIds() {
        return this.labelIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return reverseIncrTransferConfig
     */
    public ReverseIncrTransferConfig getReverseIncrTransferConfig() {
        return this.reverseIncrTransferConfig;
    }

    /**
     * @return sinkEndpointId
     */
    public String getSinkEndpointId() {
        return this.sinkEndpointId;
    }

    /**
     * @return sourceEndpointId
     */
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    /**
     * @return structTransferConfig
     */
    public StructTransferConfig getStructTransferConfig() {
        return this.structTransferConfig;
    }

    /**
     * @return transferMapping
     */
    public TransferMapping getTransferMapping() {
        return this.transferMapping;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return useOss
     */
    public Boolean getUseOss() {
        return this.useOss;
    }

    /**
     * @return workerGradeId
     */
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String regionId; 
        private CommonTransferConfig commonTransferConfig; 
        private Boolean enableFullTransfer; 
        private Boolean enableFullVerify; 
        private Boolean enableIncrTransfer; 
        private Boolean enableReverseIncrTransfer; 
        private Boolean enableStructTransfer; 
        private FullTransferConfig fullTransferConfig; 
        private String id; 
        private IncrTransferConfig incrTransferConfig; 
        private java.util.List<String> labelIds; 
        private String name; 
        private String ossKey; 
        private ReverseIncrTransferConfig reverseIncrTransferConfig; 
        private String sinkEndpointId; 
        private String sourceEndpointId; 
        private StructTransferConfig structTransferConfig; 
        private TransferMapping transferMapping; 
        private String type; 
        private Boolean useOss; 
        private String workerGradeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.commonTransferConfig = request.commonTransferConfig;
            this.enableFullTransfer = request.enableFullTransfer;
            this.enableFullVerify = request.enableFullVerify;
            this.enableIncrTransfer = request.enableIncrTransfer;
            this.enableReverseIncrTransfer = request.enableReverseIncrTransfer;
            this.enableStructTransfer = request.enableStructTransfer;
            this.fullTransferConfig = request.fullTransferConfig;
            this.id = request.id;
            this.incrTransferConfig = request.incrTransferConfig;
            this.labelIds = request.labelIds;
            this.name = request.name;
            this.ossKey = request.ossKey;
            this.reverseIncrTransferConfig = request.reverseIncrTransferConfig;
            this.sinkEndpointId = request.sinkEndpointId;
            this.sourceEndpointId = request.sourceEndpointId;
            this.structTransferConfig = request.structTransferConfig;
            this.transferMapping = request.transferMapping;
            this.type = request.type;
            this.useOss = request.useOss;
            this.workerGradeId = request.workerGradeId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CommonTransferConfig.
         */
        public Builder commonTransferConfig(CommonTransferConfig commonTransferConfig) {
            String commonTransferConfigShrink = shrink(commonTransferConfig, "CommonTransferConfig", "json");
            this.putBodyParameter("CommonTransferConfig", commonTransferConfigShrink);
            this.commonTransferConfig = commonTransferConfig;
            return this;
        }

        /**
         * EnableFullTransfer.
         */
        public Builder enableFullTransfer(Boolean enableFullTransfer) {
            this.putBodyParameter("EnableFullTransfer", enableFullTransfer);
            this.enableFullTransfer = enableFullTransfer;
            return this;
        }

        /**
         * EnableFullVerify.
         */
        public Builder enableFullVerify(Boolean enableFullVerify) {
            this.putBodyParameter("EnableFullVerify", enableFullVerify);
            this.enableFullVerify = enableFullVerify;
            return this;
        }

        /**
         * EnableIncrTransfer.
         */
        public Builder enableIncrTransfer(Boolean enableIncrTransfer) {
            this.putBodyParameter("EnableIncrTransfer", enableIncrTransfer);
            this.enableIncrTransfer = enableIncrTransfer;
            return this;
        }

        /**
         * EnableReverseIncrTransfer.
         */
        public Builder enableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
            this.putBodyParameter("EnableReverseIncrTransfer", enableReverseIncrTransfer);
            this.enableReverseIncrTransfer = enableReverseIncrTransfer;
            return this;
        }

        /**
         * EnableStructTransfer.
         */
        public Builder enableStructTransfer(Boolean enableStructTransfer) {
            this.putBodyParameter("EnableStructTransfer", enableStructTransfer);
            this.enableStructTransfer = enableStructTransfer;
            return this;
        }

        /**
         * FullTransferConfig.
         */
        public Builder fullTransferConfig(FullTransferConfig fullTransferConfig) {
            String fullTransferConfigShrink = shrink(fullTransferConfig, "FullTransferConfig", "json");
            this.putBodyParameter("FullTransferConfig", fullTransferConfigShrink);
            this.fullTransferConfig = fullTransferConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IncrTransferConfig.
         */
        public Builder incrTransferConfig(IncrTransferConfig incrTransferConfig) {
            String incrTransferConfigShrink = shrink(incrTransferConfig, "IncrTransferConfig", "json");
            this.putBodyParameter("IncrTransferConfig", incrTransferConfigShrink);
            this.incrTransferConfig = incrTransferConfig;
            return this;
        }

        /**
         * LabelIds.
         */
        public Builder labelIds(java.util.List<String> labelIds) {
            String labelIdsShrink = shrink(labelIds, "LabelIds", "json");
            this.putBodyParameter("LabelIds", labelIdsShrink);
            this.labelIds = labelIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putBodyParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * ReverseIncrTransferConfig.
         */
        public Builder reverseIncrTransferConfig(ReverseIncrTransferConfig reverseIncrTransferConfig) {
            String reverseIncrTransferConfigShrink = shrink(reverseIncrTransferConfig, "ReverseIncrTransferConfig", "json");
            this.putBodyParameter("ReverseIncrTransferConfig", reverseIncrTransferConfigShrink);
            this.reverseIncrTransferConfig = reverseIncrTransferConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e_4j0cz****</p>
         */
        public Builder sinkEndpointId(String sinkEndpointId) {
            this.putBodyParameter("SinkEndpointId", sinkEndpointId);
            this.sinkEndpointId = sinkEndpointId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e_4j0c12z****</p>
         */
        public Builder sourceEndpointId(String sourceEndpointId) {
            this.putBodyParameter("SourceEndpointId", sourceEndpointId);
            this.sourceEndpointId = sourceEndpointId;
            return this;
        }

        /**
         * StructTransferConfig.
         */
        public Builder structTransferConfig(StructTransferConfig structTransferConfig) {
            String structTransferConfigShrink = shrink(structTransferConfig, "StructTransferConfig", "json");
            this.putBodyParameter("StructTransferConfig", structTransferConfigShrink);
            this.structTransferConfig = structTransferConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder transferMapping(TransferMapping transferMapping) {
            String transferMappingShrink = shrink(transferMapping, "TransferMapping", "json");
            this.putBodyParameter("TransferMapping", transferMappingShrink);
            this.transferMapping = transferMapping;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MIGRATION</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UseOss.
         */
        public Builder useOss(Boolean useOss) {
            this.putBodyParameter("UseOss", useOss);
            this.useOss = useOss;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>g_abcdefj***</p>
         */
        public Builder workerGradeId(String workerGradeId) {
            this.putBodyParameter("WorkerGradeId", workerGradeId);
            this.workerGradeId = workerGradeId;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class CustomColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        private CustomColumns(Builder builder) {
            this.columnName = builder.columnName;
            this.expression = builder.expression;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomColumns create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        public static final class Builder {
            private String columnName; 
            private String expression; 

            private Builder() {
            } 

            private Builder(CustomColumns model) {
                this.columnName = model.columnName;
                this.expression = model.expression;
            } 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            public CustomColumns build() {
                return new CustomColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class CommonTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveActive")
        private Boolean activeActive;

        @com.aliyun.core.annotation.NameInMap("CustomColumns")
        private java.util.List<CustomColumns> customColumns;

        @com.aliyun.core.annotation.NameInMap("DataWorksBusinessName")
        private String dataWorksBusinessName;

        @com.aliyun.core.annotation.NameInMap("DatahubTopicType")
        private String datahubTopicType;

        @com.aliyun.core.annotation.NameInMap("MqPartition")
        private Integer mqPartition;

        @com.aliyun.core.annotation.NameInMap("MqPartitionMode")
        private String mqPartitionMode;

        @com.aliyun.core.annotation.NameInMap("MqSerializerType")
        private String mqSerializerType;

        @com.aliyun.core.annotation.NameInMap("RocketMqEnableMsgTrace")
        private Boolean rocketMqEnableMsgTrace;

        @com.aliyun.core.annotation.NameInMap("RocketMqMsgTags")
        private String rocketMqMsgTags;

        @com.aliyun.core.annotation.NameInMap("RocketMqProducerGroup")
        private String rocketMqProducerGroup;

        @com.aliyun.core.annotation.NameInMap("RocketMqSendMsgTimeout")
        private Long rocketMqSendMsgTimeout;

        @com.aliyun.core.annotation.NameInMap("SinkStoreFormat")
        private String sinkStoreFormat;

        @com.aliyun.core.annotation.NameInMap("SourceStoreFormat")
        private String sourceStoreFormat;

        @com.aliyun.core.annotation.NameInMap("SyncSchema")
        private Boolean syncSchema;

        @com.aliyun.core.annotation.NameInMap("SyncSchemaColumnName")
        private String syncSchemaColumnName;

        @com.aliyun.core.annotation.NameInMap("TableCategory")
        private String tableCategory;

        private CommonTransferConfig(Builder builder) {
            this.activeActive = builder.activeActive;
            this.customColumns = builder.customColumns;
            this.dataWorksBusinessName = builder.dataWorksBusinessName;
            this.datahubTopicType = builder.datahubTopicType;
            this.mqPartition = builder.mqPartition;
            this.mqPartitionMode = builder.mqPartitionMode;
            this.mqSerializerType = builder.mqSerializerType;
            this.rocketMqEnableMsgTrace = builder.rocketMqEnableMsgTrace;
            this.rocketMqMsgTags = builder.rocketMqMsgTags;
            this.rocketMqProducerGroup = builder.rocketMqProducerGroup;
            this.rocketMqSendMsgTimeout = builder.rocketMqSendMsgTimeout;
            this.sinkStoreFormat = builder.sinkStoreFormat;
            this.sourceStoreFormat = builder.sourceStoreFormat;
            this.syncSchema = builder.syncSchema;
            this.syncSchemaColumnName = builder.syncSchemaColumnName;
            this.tableCategory = builder.tableCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonTransferConfig create() {
            return builder().build();
        }

        /**
         * @return activeActive
         */
        public Boolean getActiveActive() {
            return this.activeActive;
        }

        /**
         * @return customColumns
         */
        public java.util.List<CustomColumns> getCustomColumns() {
            return this.customColumns;
        }

        /**
         * @return dataWorksBusinessName
         */
        public String getDataWorksBusinessName() {
            return this.dataWorksBusinessName;
        }

        /**
         * @return datahubTopicType
         */
        public String getDatahubTopicType() {
            return this.datahubTopicType;
        }

        /**
         * @return mqPartition
         */
        public Integer getMqPartition() {
            return this.mqPartition;
        }

        /**
         * @return mqPartitionMode
         */
        public String getMqPartitionMode() {
            return this.mqPartitionMode;
        }

        /**
         * @return mqSerializerType
         */
        public String getMqSerializerType() {
            return this.mqSerializerType;
        }

        /**
         * @return rocketMqEnableMsgTrace
         */
        public Boolean getRocketMqEnableMsgTrace() {
            return this.rocketMqEnableMsgTrace;
        }

        /**
         * @return rocketMqMsgTags
         */
        public String getRocketMqMsgTags() {
            return this.rocketMqMsgTags;
        }

        /**
         * @return rocketMqProducerGroup
         */
        public String getRocketMqProducerGroup() {
            return this.rocketMqProducerGroup;
        }

        /**
         * @return rocketMqSendMsgTimeout
         */
        public Long getRocketMqSendMsgTimeout() {
            return this.rocketMqSendMsgTimeout;
        }

        /**
         * @return sinkStoreFormat
         */
        public String getSinkStoreFormat() {
            return this.sinkStoreFormat;
        }

        /**
         * @return sourceStoreFormat
         */
        public String getSourceStoreFormat() {
            return this.sourceStoreFormat;
        }

        /**
         * @return syncSchema
         */
        public Boolean getSyncSchema() {
            return this.syncSchema;
        }

        /**
         * @return syncSchemaColumnName
         */
        public String getSyncSchemaColumnName() {
            return this.syncSchemaColumnName;
        }

        /**
         * @return tableCategory
         */
        public String getTableCategory() {
            return this.tableCategory;
        }

        public static final class Builder {
            private Boolean activeActive; 
            private java.util.List<CustomColumns> customColumns; 
            private String dataWorksBusinessName; 
            private String datahubTopicType; 
            private Integer mqPartition; 
            private String mqPartitionMode; 
            private String mqSerializerType; 
            private Boolean rocketMqEnableMsgTrace; 
            private String rocketMqMsgTags; 
            private String rocketMqProducerGroup; 
            private Long rocketMqSendMsgTimeout; 
            private String sinkStoreFormat; 
            private String sourceStoreFormat; 
            private Boolean syncSchema; 
            private String syncSchemaColumnName; 
            private String tableCategory; 

            private Builder() {
            } 

            private Builder(CommonTransferConfig model) {
                this.activeActive = model.activeActive;
                this.customColumns = model.customColumns;
                this.dataWorksBusinessName = model.dataWorksBusinessName;
                this.datahubTopicType = model.datahubTopicType;
                this.mqPartition = model.mqPartition;
                this.mqPartitionMode = model.mqPartitionMode;
                this.mqSerializerType = model.mqSerializerType;
                this.rocketMqEnableMsgTrace = model.rocketMqEnableMsgTrace;
                this.rocketMqMsgTags = model.rocketMqMsgTags;
                this.rocketMqProducerGroup = model.rocketMqProducerGroup;
                this.rocketMqSendMsgTimeout = model.rocketMqSendMsgTimeout;
                this.sinkStoreFormat = model.sinkStoreFormat;
                this.sourceStoreFormat = model.sourceStoreFormat;
                this.syncSchema = model.syncSchema;
                this.syncSchemaColumnName = model.syncSchemaColumnName;
                this.tableCategory = model.tableCategory;
            } 

            /**
             * ActiveActive.
             */
            public Builder activeActive(Boolean activeActive) {
                this.activeActive = activeActive;
                return this;
            }

            /**
             * CustomColumns.
             */
            public Builder customColumns(java.util.List<CustomColumns> customColumns) {
                this.customColumns = customColumns;
                return this;
            }

            /**
             * DataWorksBusinessName.
             */
            public Builder dataWorksBusinessName(String dataWorksBusinessName) {
                this.dataWorksBusinessName = dataWorksBusinessName;
                return this;
            }

            /**
             * DatahubTopicType.
             */
            public Builder datahubTopicType(String datahubTopicType) {
                this.datahubTopicType = datahubTopicType;
                return this;
            }

            /**
             * MqPartition.
             */
            public Builder mqPartition(Integer mqPartition) {
                this.mqPartition = mqPartition;
                return this;
            }

            /**
             * MqPartitionMode.
             */
            public Builder mqPartitionMode(String mqPartitionMode) {
                this.mqPartitionMode = mqPartitionMode;
                return this;
            }

            /**
             * MqSerializerType.
             */
            public Builder mqSerializerType(String mqSerializerType) {
                this.mqSerializerType = mqSerializerType;
                return this;
            }

            /**
             * RocketMqEnableMsgTrace.
             */
            public Builder rocketMqEnableMsgTrace(Boolean rocketMqEnableMsgTrace) {
                this.rocketMqEnableMsgTrace = rocketMqEnableMsgTrace;
                return this;
            }

            /**
             * RocketMqMsgTags.
             */
            public Builder rocketMqMsgTags(String rocketMqMsgTags) {
                this.rocketMqMsgTags = rocketMqMsgTags;
                return this;
            }

            /**
             * RocketMqProducerGroup.
             */
            public Builder rocketMqProducerGroup(String rocketMqProducerGroup) {
                this.rocketMqProducerGroup = rocketMqProducerGroup;
                return this;
            }

            /**
             * RocketMqSendMsgTimeout.
             */
            public Builder rocketMqSendMsgTimeout(Long rocketMqSendMsgTimeout) {
                this.rocketMqSendMsgTimeout = rocketMqSendMsgTimeout;
                return this;
            }

            /**
             * SinkStoreFormat.
             */
            public Builder sinkStoreFormat(String sinkStoreFormat) {
                this.sinkStoreFormat = sinkStoreFormat;
                return this;
            }

            /**
             * SourceStoreFormat.
             */
            public Builder sourceStoreFormat(String sourceStoreFormat) {
                this.sourceStoreFormat = sourceStoreFormat;
                return this;
            }

            /**
             * SyncSchema.
             */
            public Builder syncSchema(Boolean syncSchema) {
                this.syncSchema = syncSchema;
                return this;
            }

            /**
             * SyncSchemaColumnName.
             */
            public Builder syncSchemaColumnName(String syncSchemaColumnName) {
                this.syncSchemaColumnName = syncSchemaColumnName;
                return this;
            }

            /**
             * TableCategory.
             */
            public Builder tableCategory(String tableCategory) {
                this.tableCategory = tableCategory;
                return this;
            }

            public CommonTransferConfig build() {
                return new CommonTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class FullTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowDestTableNotEmpty")
        private Boolean allowDestTableNotEmpty;

        @com.aliyun.core.annotation.NameInMap("FullTransferSpeedMode")
        private String fullTransferSpeedMode;

        @com.aliyun.core.annotation.NameInMap("FullVerifySpeedMode")
        private String fullVerifySpeedMode;

        @com.aliyun.core.annotation.NameInMap("HbaseObjCheckMode")
        private String hbaseObjCheckMode;

        @com.aliyun.core.annotation.NameInMap("HbaseObjMigMode")
        private String hbaseObjMigMode;

        @com.aliyun.core.annotation.NameInMap("IndexDDLConcurrencyLimit")
        private Integer indexDDLConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrentIndexDDLs")
        private Integer maxConcurrentIndexDDLs;

        @com.aliyun.core.annotation.NameInMap("NonePkUkTruncateDstTable")
        private Boolean nonePkUkTruncateDstTable;

        @com.aliyun.core.annotation.NameInMap("ReadWorkerNum")
        private Integer readWorkerNum;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        @com.aliyun.core.annotation.NameInMap("WriteWorkerNum")
        private Integer writeWorkerNum;

        private FullTransferConfig(Builder builder) {
            this.allowDestTableNotEmpty = builder.allowDestTableNotEmpty;
            this.fullTransferSpeedMode = builder.fullTransferSpeedMode;
            this.fullVerifySpeedMode = builder.fullVerifySpeedMode;
            this.hbaseObjCheckMode = builder.hbaseObjCheckMode;
            this.hbaseObjMigMode = builder.hbaseObjMigMode;
            this.indexDDLConcurrencyLimit = builder.indexDDLConcurrencyLimit;
            this.maxConcurrentIndexDDLs = builder.maxConcurrentIndexDDLs;
            this.nonePkUkTruncateDstTable = builder.nonePkUkTruncateDstTable;
            this.readWorkerNum = builder.readWorkerNum;
            this.throttleIOPS = builder.throttleIOPS;
            this.throttleRps = builder.throttleRps;
            this.writeWorkerNum = builder.writeWorkerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullTransferConfig create() {
            return builder().build();
        }

        /**
         * @return allowDestTableNotEmpty
         */
        public Boolean getAllowDestTableNotEmpty() {
            return this.allowDestTableNotEmpty;
        }

        /**
         * @return fullTransferSpeedMode
         */
        public String getFullTransferSpeedMode() {
            return this.fullTransferSpeedMode;
        }

        /**
         * @return fullVerifySpeedMode
         */
        public String getFullVerifySpeedMode() {
            return this.fullVerifySpeedMode;
        }

        /**
         * @return hbaseObjCheckMode
         */
        public String getHbaseObjCheckMode() {
            return this.hbaseObjCheckMode;
        }

        /**
         * @return hbaseObjMigMode
         */
        public String getHbaseObjMigMode() {
            return this.hbaseObjMigMode;
        }

        /**
         * @return indexDDLConcurrencyLimit
         */
        public Integer getIndexDDLConcurrencyLimit() {
            return this.indexDDLConcurrencyLimit;
        }

        /**
         * @return maxConcurrentIndexDDLs
         */
        public Integer getMaxConcurrentIndexDDLs() {
            return this.maxConcurrentIndexDDLs;
        }

        /**
         * @return nonePkUkTruncateDstTable
         */
        public Boolean getNonePkUkTruncateDstTable() {
            return this.nonePkUkTruncateDstTable;
        }

        /**
         * @return readWorkerNum
         */
        public Integer getReadWorkerNum() {
            return this.readWorkerNum;
        }

        /**
         * @return throttleIOPS
         */
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        /**
         * @return throttleRps
         */
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        /**
         * @return writeWorkerNum
         */
        public Integer getWriteWorkerNum() {
            return this.writeWorkerNum;
        }

        public static final class Builder {
            private Boolean allowDestTableNotEmpty; 
            private String fullTransferSpeedMode; 
            private String fullVerifySpeedMode; 
            private String hbaseObjCheckMode; 
            private String hbaseObjMigMode; 
            private Integer indexDDLConcurrencyLimit; 
            private Integer maxConcurrentIndexDDLs; 
            private Boolean nonePkUkTruncateDstTable; 
            private Integer readWorkerNum; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 
            private Integer writeWorkerNum; 

            private Builder() {
            } 

            private Builder(FullTransferConfig model) {
                this.allowDestTableNotEmpty = model.allowDestTableNotEmpty;
                this.fullTransferSpeedMode = model.fullTransferSpeedMode;
                this.fullVerifySpeedMode = model.fullVerifySpeedMode;
                this.hbaseObjCheckMode = model.hbaseObjCheckMode;
                this.hbaseObjMigMode = model.hbaseObjMigMode;
                this.indexDDLConcurrencyLimit = model.indexDDLConcurrencyLimit;
                this.maxConcurrentIndexDDLs = model.maxConcurrentIndexDDLs;
                this.nonePkUkTruncateDstTable = model.nonePkUkTruncateDstTable;
                this.readWorkerNum = model.readWorkerNum;
                this.throttleIOPS = model.throttleIOPS;
                this.throttleRps = model.throttleRps;
                this.writeWorkerNum = model.writeWorkerNum;
            } 

            /**
             * AllowDestTableNotEmpty.
             */
            public Builder allowDestTableNotEmpty(Boolean allowDestTableNotEmpty) {
                this.allowDestTableNotEmpty = allowDestTableNotEmpty;
                return this;
            }

            /**
             * FullTransferSpeedMode.
             */
            public Builder fullTransferSpeedMode(String fullTransferSpeedMode) {
                this.fullTransferSpeedMode = fullTransferSpeedMode;
                return this;
            }

            /**
             * FullVerifySpeedMode.
             */
            public Builder fullVerifySpeedMode(String fullVerifySpeedMode) {
                this.fullVerifySpeedMode = fullVerifySpeedMode;
                return this;
            }

            /**
             * HbaseObjCheckMode.
             */
            public Builder hbaseObjCheckMode(String hbaseObjCheckMode) {
                this.hbaseObjCheckMode = hbaseObjCheckMode;
                return this;
            }

            /**
             * HbaseObjMigMode.
             */
            public Builder hbaseObjMigMode(String hbaseObjMigMode) {
                this.hbaseObjMigMode = hbaseObjMigMode;
                return this;
            }

            /**
             * IndexDDLConcurrencyLimit.
             */
            public Builder indexDDLConcurrencyLimit(Integer indexDDLConcurrencyLimit) {
                this.indexDDLConcurrencyLimit = indexDDLConcurrencyLimit;
                return this;
            }

            /**
             * MaxConcurrentIndexDDLs.
             */
            public Builder maxConcurrentIndexDDLs(Integer maxConcurrentIndexDDLs) {
                this.maxConcurrentIndexDDLs = maxConcurrentIndexDDLs;
                return this;
            }

            /**
             * NonePkUkTruncateDstTable.
             */
            public Builder nonePkUkTruncateDstTable(Boolean nonePkUkTruncateDstTable) {
                this.nonePkUkTruncateDstTable = nonePkUkTruncateDstTable;
                return this;
            }

            /**
             * ReadWorkerNum.
             */
            public Builder readWorkerNum(Integer readWorkerNum) {
                this.readWorkerNum = readWorkerNum;
                return this;
            }

            /**
             * ThrottleIOPS.
             */
            public Builder throttleIOPS(Integer throttleIOPS) {
                this.throttleIOPS = throttleIOPS;
                return this;
            }

            /**
             * ThrottleRps.
             */
            public Builder throttleRps(Integer throttleRps) {
                this.throttleRps = throttleRps;
                return this;
            }

            /**
             * WriteWorkerNum.
             */
            public Builder writeWorkerNum(Integer writeWorkerNum) {
                this.writeWorkerNum = writeWorkerNum;
                return this;
            }

            public FullTransferConfig build() {
                return new FullTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class IncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableIncrSyncStatistics")
        private Boolean enableIncrSyncStatistics;

        @com.aliyun.core.annotation.NameInMap("EnableSequencingWithinTxn")
        private Boolean enableSequencingWithinTxn;

        @com.aliyun.core.annotation.NameInMap("IncrSyncConcurrency")
        @com.aliyun.core.annotation.Validation(maximum = 1024, minimum = 1)
        private Integer incrSyncConcurrency;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List<String> recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("StartTimestamp")
        private String startTimestamp;

        @com.aliyun.core.annotation.NameInMap("StoreLogKeptHour")
        private Integer storeLogKeptHour;

        @com.aliyun.core.annotation.NameInMap("SupportDDLTypes")
        private java.util.List<String> supportDDLTypes;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        private IncrTransferConfig(Builder builder) {
            this.enableIncrSyncStatistics = builder.enableIncrSyncStatistics;
            this.enableSequencingWithinTxn = builder.enableSequencingWithinTxn;
            this.incrSyncConcurrency = builder.incrSyncConcurrency;
            this.recordTypeWhiteList = builder.recordTypeWhiteList;
            this.startTimestamp = builder.startTimestamp;
            this.storeLogKeptHour = builder.storeLogKeptHour;
            this.supportDDLTypes = builder.supportDDLTypes;
            this.throttleIOPS = builder.throttleIOPS;
            this.throttleRps = builder.throttleRps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrTransferConfig create() {
            return builder().build();
        }

        /**
         * @return enableIncrSyncStatistics
         */
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        /**
         * @return enableSequencingWithinTxn
         */
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        /**
         * @return incrSyncConcurrency
         */
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        /**
         * @return recordTypeWhiteList
         */
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return startTimestamp
         */
        public String getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return storeLogKeptHour
         */
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        /**
         * @return supportDDLTypes
         */
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        /**
         * @return throttleIOPS
         */
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        /**
         * @return throttleRps
         */
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public static final class Builder {
            private Boolean enableIncrSyncStatistics; 
            private Boolean enableSequencingWithinTxn; 
            private Integer incrSyncConcurrency; 
            private java.util.List<String> recordTypeWhiteList; 
            private String startTimestamp; 
            private Integer storeLogKeptHour; 
            private java.util.List<String> supportDDLTypes; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 

            private Builder() {
            } 

            private Builder(IncrTransferConfig model) {
                this.enableIncrSyncStatistics = model.enableIncrSyncStatistics;
                this.enableSequencingWithinTxn = model.enableSequencingWithinTxn;
                this.incrSyncConcurrency = model.incrSyncConcurrency;
                this.recordTypeWhiteList = model.recordTypeWhiteList;
                this.startTimestamp = model.startTimestamp;
                this.storeLogKeptHour = model.storeLogKeptHour;
                this.supportDDLTypes = model.supportDDLTypes;
                this.throttleIOPS = model.throttleIOPS;
                this.throttleRps = model.throttleRps;
            } 

            /**
             * EnableIncrSyncStatistics.
             */
            public Builder enableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
                this.enableIncrSyncStatistics = enableIncrSyncStatistics;
                return this;
            }

            /**
             * EnableSequencingWithinTxn.
             */
            public Builder enableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
                this.enableSequencingWithinTxn = enableSequencingWithinTxn;
                return this;
            }

            /**
             * IncrSyncConcurrency.
             */
            public Builder incrSyncConcurrency(Integer incrSyncConcurrency) {
                this.incrSyncConcurrency = incrSyncConcurrency;
                return this;
            }

            /**
             * RecordTypeWhiteList.
             */
            public Builder recordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * StartTimestamp.
             */
            public Builder startTimestamp(String startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * StoreLogKeptHour.
             */
            public Builder storeLogKeptHour(Integer storeLogKeptHour) {
                this.storeLogKeptHour = storeLogKeptHour;
                return this;
            }

            /**
             * SupportDDLTypes.
             */
            public Builder supportDDLTypes(java.util.List<String> supportDDLTypes) {
                this.supportDDLTypes = supportDDLTypes;
                return this;
            }

            /**
             * ThrottleIOPS.
             */
            public Builder throttleIOPS(Integer throttleIOPS) {
                this.throttleIOPS = throttleIOPS;
                return this;
            }

            /**
             * ThrottleRps.
             */
            public Builder throttleRps(Integer throttleRps) {
                this.throttleRps = throttleRps;
                return this;
            }

            public IncrTransferConfig build() {
                return new IncrTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class ReverseIncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableIncrSyncStatistics")
        private Boolean enableIncrSyncStatistics;

        @com.aliyun.core.annotation.NameInMap("EnableSequencingWithinTxn")
        private Boolean enableSequencingWithinTxn;

        @com.aliyun.core.annotation.NameInMap("IncrSyncConcurrency")
        @com.aliyun.core.annotation.Validation(maximum = 1024, minimum = 1)
        private Integer incrSyncConcurrency;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List<String> recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("StartTimestamp")
        private String startTimestamp;

        @com.aliyun.core.annotation.NameInMap("StoreLogKeptHour")
        private Integer storeLogKeptHour;

        @com.aliyun.core.annotation.NameInMap("SupportDDLTypes")
        private java.util.List<String> supportDDLTypes;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        private ReverseIncrTransferConfig(Builder builder) {
            this.enableIncrSyncStatistics = builder.enableIncrSyncStatistics;
            this.enableSequencingWithinTxn = builder.enableSequencingWithinTxn;
            this.incrSyncConcurrency = builder.incrSyncConcurrency;
            this.recordTypeWhiteList = builder.recordTypeWhiteList;
            this.startTimestamp = builder.startTimestamp;
            this.storeLogKeptHour = builder.storeLogKeptHour;
            this.supportDDLTypes = builder.supportDDLTypes;
            this.throttleIOPS = builder.throttleIOPS;
            this.throttleRps = builder.throttleRps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseIncrTransferConfig create() {
            return builder().build();
        }

        /**
         * @return enableIncrSyncStatistics
         */
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        /**
         * @return enableSequencingWithinTxn
         */
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        /**
         * @return incrSyncConcurrency
         */
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        /**
         * @return recordTypeWhiteList
         */
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return startTimestamp
         */
        public String getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return storeLogKeptHour
         */
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        /**
         * @return supportDDLTypes
         */
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        /**
         * @return throttleIOPS
         */
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        /**
         * @return throttleRps
         */
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public static final class Builder {
            private Boolean enableIncrSyncStatistics; 
            private Boolean enableSequencingWithinTxn; 
            private Integer incrSyncConcurrency; 
            private java.util.List<String> recordTypeWhiteList; 
            private String startTimestamp; 
            private Integer storeLogKeptHour; 
            private java.util.List<String> supportDDLTypes; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 

            private Builder() {
            } 

            private Builder(ReverseIncrTransferConfig model) {
                this.enableIncrSyncStatistics = model.enableIncrSyncStatistics;
                this.enableSequencingWithinTxn = model.enableSequencingWithinTxn;
                this.incrSyncConcurrency = model.incrSyncConcurrency;
                this.recordTypeWhiteList = model.recordTypeWhiteList;
                this.startTimestamp = model.startTimestamp;
                this.storeLogKeptHour = model.storeLogKeptHour;
                this.supportDDLTypes = model.supportDDLTypes;
                this.throttleIOPS = model.throttleIOPS;
                this.throttleRps = model.throttleRps;
            } 

            /**
             * EnableIncrSyncStatistics.
             */
            public Builder enableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
                this.enableIncrSyncStatistics = enableIncrSyncStatistics;
                return this;
            }

            /**
             * EnableSequencingWithinTxn.
             */
            public Builder enableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
                this.enableSequencingWithinTxn = enableSequencingWithinTxn;
                return this;
            }

            /**
             * IncrSyncConcurrency.
             */
            public Builder incrSyncConcurrency(Integer incrSyncConcurrency) {
                this.incrSyncConcurrency = incrSyncConcurrency;
                return this;
            }

            /**
             * RecordTypeWhiteList.
             */
            public Builder recordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * StartTimestamp.
             */
            public Builder startTimestamp(String startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * StoreLogKeptHour.
             */
            public Builder storeLogKeptHour(Integer storeLogKeptHour) {
                this.storeLogKeptHour = storeLogKeptHour;
                return this;
            }

            /**
             * SupportDDLTypes.
             */
            public Builder supportDDLTypes(java.util.List<String> supportDDLTypes) {
                this.supportDDLTypes = supportDDLTypes;
                return this;
            }

            /**
             * ThrottleIOPS.
             */
            public Builder throttleIOPS(Integer throttleIOPS) {
                this.throttleIOPS = throttleIOPS;
                return this;
            }

            /**
             * ThrottleRps.
             */
            public Builder throttleRps(Integer throttleRps) {
                this.throttleRps = throttleRps;
                return this;
            }

            public ReverseIncrTransferConfig build() {
                return new ReverseIncrTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class StructTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ByteCharConvertStrategy")
        private String byteCharConvertStrategy;

        @com.aliyun.core.annotation.NameInMap("DeferIndexCreation")
        private Boolean deferIndexCreation;

        private StructTransferConfig(Builder builder) {
            this.byteCharConvertStrategy = builder.byteCharConvertStrategy;
            this.deferIndexCreation = builder.deferIndexCreation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructTransferConfig create() {
            return builder().build();
        }

        /**
         * @return byteCharConvertStrategy
         */
        public String getByteCharConvertStrategy() {
            return this.byteCharConvertStrategy;
        }

        /**
         * @return deferIndexCreation
         */
        public Boolean getDeferIndexCreation() {
            return this.deferIndexCreation;
        }

        public static final class Builder {
            private String byteCharConvertStrategy; 
            private Boolean deferIndexCreation; 

            private Builder() {
            } 

            private Builder(StructTransferConfig model) {
                this.byteCharConvertStrategy = model.byteCharConvertStrategy;
                this.deferIndexCreation = model.deferIndexCreation;
            } 

            /**
             * ByteCharConvertStrategy.
             */
            public Builder byteCharConvertStrategy(String byteCharConvertStrategy) {
                this.byteCharConvertStrategy = byteCharConvertStrategy;
                return this;
            }

            /**
             * DeferIndexCreation.
             */
            public Builder deferIndexCreation(Boolean deferIndexCreation) {
                this.deferIndexCreation = deferIndexCreation;
                return this;
            }

            public StructTransferConfig build() {
                return new StructTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class AdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

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
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(AdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public AdbTableSchema build() {
                return new AdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class SpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private AdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificTables create() {
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
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private AdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SpecificTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(AdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SpecificTables build() {
                return new SpecificTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class SpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SpecificViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SpecificViewsAdbTableSchema build() {
                return new SpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class SpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SpecificViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SpecificViews build() {
                return new SpecificViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class TablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private TablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(TablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public TablesAdbTableSchema build() {
                return new TablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class ObkvPartitionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartitionSize")
        @com.aliyun.core.annotation.Validation(maximum = 1024, minimum = 1)
        private Integer partitionSize;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("VirtualColumn")
        private String virtualColumn;

        private ObkvPartitionConfig(Builder builder) {
            this.partitionSize = builder.partitionSize;
            this.partitionType = builder.partitionType;
            this.virtualColumn = builder.virtualColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObkvPartitionConfig create() {
            return builder().build();
        }

        /**
         * @return partitionSize
         */
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return virtualColumn
         */
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

        public static final class Builder {
            private Integer partitionSize; 
            private String partitionType; 
            private String virtualColumn; 

            private Builder() {
            } 

            private Builder(ObkvPartitionConfig model) {
                this.partitionSize = model.partitionSize;
                this.partitionType = model.partitionType;
                this.virtualColumn = model.virtualColumn;
            } 

            /**
             * PartitionSize.
             */
            public Builder partitionSize(Integer partitionSize) {
                this.partitionSize = partitionSize;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * VirtualColumn.
             */
            public Builder virtualColumn(String virtualColumn) {
                this.virtualColumn = virtualColumn;
                return this;
            }

            public ObkvPartitionConfig build() {
                return new ObkvPartitionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private TablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObkvPartitionConfig")
        private ObkvPartitionConfig obkvPartitionConfig;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private Tables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.obkvPartitionConfig = builder.obkvPartitionConfig;
            this.shardColumns = builder.shardColumns;
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
        public TablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return obkvPartitionConfig
         */
        public ObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private TablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private ObkvPartitionConfig obkvPartitionConfig; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.obkvPartitionConfig = model.obkvPartitionConfig;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(TablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObkvPartitionConfig.
             */
            public Builder obkvPartitionConfig(ObkvPartitionConfig obkvPartitionConfig) {
                this.obkvPartitionConfig = obkvPartitionConfig;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
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
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class ViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private ViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(ViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public ViewsAdbTableSchema build() {
                return new ViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class Views extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private ViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private Views(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Views create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public ViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private ViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(Views model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(ViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Views build() {
                return new Views(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List<SpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List<SpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List<Views> views;

        private Databases(Builder builder) {
            this.clusterName = builder.clusterName;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List<SpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List<SpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return views
         */
        public java.util.List<Views> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String clusterName; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<SpecificTables> specificTables; 
            private java.util.List<SpecificViews> specificViews; 
            private java.util.List<Tables> tables; 
            private String tenantName; 
            private java.util.List<Views> views; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.clusterName = model.clusterName;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.specificTables = model.specificTables;
                this.specificViews = model.specificViews;
                this.tables = model.tables;
                this.tenantName = model.tenantName;
                this.views = model.views;
            } 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SpecificTables.
             */
            public Builder specificTables(java.util.List<SpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List<SpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List<Views> views) {
                this.views = views;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class SpecificTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SpecificTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SpecificTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SpecificTablesAdbTableSchema build() {
                return new SpecificTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackSpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SpecificTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackSpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SpecificTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SpecificTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackSpecificTables build() {
                return new DatabasesBlackSpecificTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackSpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackSpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackSpecificViewsAdbTableSchema build() {
                return new DatabasesBlackSpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackSpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackSpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackSpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackSpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackSpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackSpecificViews build() {
                return new DatabasesBlackSpecificViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackTablesAdbTableSchema build() {
                return new DatabasesBlackTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackTables build() {
                return new DatabasesBlackTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
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
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackViewsAdbTableSchema build() {
                return new DatabasesBlackViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlackViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackViews build() {
                return new DatabasesBlackViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class DatabasesBlack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List<DatabasesBlackSpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List<DatabasesBlackSpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<DatabasesBlackTables> tables;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List<DatabasesBlackViews> views;

        private DatabasesBlack(Builder builder) {
            this.clusterName = builder.clusterName;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlack create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List<DatabasesBlackSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List<DatabasesBlackSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List<DatabasesBlackTables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return views
         */
        public java.util.List<DatabasesBlackViews> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String clusterName; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<DatabasesBlackSpecificTables> specificTables; 
            private java.util.List<DatabasesBlackSpecificViews> specificViews; 
            private java.util.List<DatabasesBlackTables> tables; 
            private String tenantName; 
            private java.util.List<DatabasesBlackViews> views; 

            private Builder() {
            } 

            private Builder(DatabasesBlack model) {
                this.clusterName = model.clusterName;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.specificTables = model.specificTables;
                this.specificViews = model.specificViews;
                this.tables = model.tables;
                this.tenantName = model.tenantName;
                this.views = model.views;
            } 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SpecificTables.
             */
            public Builder specificTables(java.util.List<DatabasesBlackSpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List<DatabasesBlackSpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<DatabasesBlackTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List<DatabasesBlackViews> views) {
                this.views = views;
                return this;
            }

            public DatabasesBlack build() {
                return new DatabasesBlack(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class TransferMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List<Databases> databases;

        @com.aliyun.core.annotation.NameInMap("DatabasesBlack")
        private java.util.List<DatabasesBlack> databasesBlack;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("TableAndViewBlackList")
        private java.util.List<String> tableAndViewBlackList;

        @com.aliyun.core.annotation.NameInMap("TableAndViewWhiteList")
        private java.util.List<String> tableAndViewWhiteList;

        private TransferMapping(Builder builder) {
            this.databases = builder.databases;
            this.databasesBlack = builder.databasesBlack;
            this.mode = builder.mode;
            this.tableAndViewBlackList = builder.tableAndViewBlackList;
            this.tableAndViewWhiteList = builder.tableAndViewWhiteList;
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
        public java.util.List<Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return databasesBlack
         */
        public java.util.List<DatabasesBlack> getDatabasesBlack() {
            return this.databasesBlack;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return tableAndViewBlackList
         */
        public java.util.List<String> getTableAndViewBlackList() {
            return this.tableAndViewBlackList;
        }

        /**
         * @return tableAndViewWhiteList
         */
        public java.util.List<String> getTableAndViewWhiteList() {
            return this.tableAndViewWhiteList;
        }

        public static final class Builder {
            private java.util.List<Databases> databases; 
            private java.util.List<DatabasesBlack> databasesBlack; 
            private String mode; 
            private java.util.List<String> tableAndViewBlackList; 
            private java.util.List<String> tableAndViewWhiteList; 

            private Builder() {
            } 

            private Builder(TransferMapping model) {
                this.databases = model.databases;
                this.databasesBlack = model.databasesBlack;
                this.mode = model.mode;
                this.tableAndViewBlackList = model.tableAndViewBlackList;
                this.tableAndViewWhiteList = model.tableAndViewWhiteList;
            } 

            /**
             * Databases.
             */
            public Builder databases(java.util.List<Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * DatabasesBlack.
             */
            public Builder databasesBlack(java.util.List<DatabasesBlack> databasesBlack) {
                this.databasesBlack = databasesBlack;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * TableAndViewBlackList.
             */
            public Builder tableAndViewBlackList(java.util.List<String> tableAndViewBlackList) {
                this.tableAndViewBlackList = tableAndViewBlackList;
                return this;
            }

            /**
             * TableAndViewWhiteList.
             */
            public Builder tableAndViewWhiteList(java.util.List<String> tableAndViewWhiteList) {
                this.tableAndViewWhiteList = tableAndViewWhiteList;
                return this;
            }

            public TransferMapping build() {
                return new TransferMapping(this);
            } 

        } 

    }
}
