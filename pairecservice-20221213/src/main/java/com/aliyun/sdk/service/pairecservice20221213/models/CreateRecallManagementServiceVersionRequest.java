// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateRecallManagementServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateRecallManagementServiceVersionRequest</p>
 */
public class CreateRecallManagementServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    private Configs configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRecallManagementServiceVersionId")
    private String sourceRecallManagementServiceVersionId;

    private CreateRecallManagementServiceVersionRequest(Builder builder) {
        super(builder);
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.regionId = builder.regionId;
        this.configs = builder.configs;
        this.instanceId = builder.instanceId;
        this.sourceRecallManagementServiceVersionId = builder.sourceRecallManagementServiceVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementServiceVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceId
     */
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return configs
     */
    public Configs getConfigs() {
        return this.configs;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sourceRecallManagementServiceVersionId
     */
    public String getSourceRecallManagementServiceVersionId() {
        return this.sourceRecallManagementServiceVersionId;
    }

    public static final class Builder extends Request.Builder<CreateRecallManagementServiceVersionRequest, Builder> {
        private String recallManagementServiceId; 
        private String regionId; 
        private Configs configs; 
        private String instanceId; 
        private String sourceRecallManagementServiceVersionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecallManagementServiceVersionRequest request) {
            super(request);
            this.recallManagementServiceId = request.recallManagementServiceId;
            this.regionId = request.regionId;
            this.configs = request.configs;
            this.instanceId = request.instanceId;
            this.sourceRecallManagementServiceVersionId = request.sourceRecallManagementServiceVersionId;
        } 

        /**
         * <p>The ID of the recall management service.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recallManagementServiceId(String recallManagementServiceId) {
            this.putPathParameter("RecallManagementServiceId", recallManagementServiceId);
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
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
         * <p>The configuration details.</p>
         */
        public Builder configs(Configs configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The source recall management service version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder sourceRecallManagementServiceVersionId(String sourceRecallManagementServiceVersionId) {
            this.putBodyParameter("SourceRecallManagementServiceVersionId", sourceRecallManagementServiceVersionId);
            this.sourceRecallManagementServiceVersionId = sourceRecallManagementServiceVersionId;
            return this;
        }

        @Override
        public CreateRecallManagementServiceVersionRequest build() {
            return new CreateRecallManagementServiceVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class MergeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
        private String extendedConfig;

        @com.aliyun.core.annotation.NameInMap("FilterExpression")
        private String filterExpression;

        @com.aliyun.core.annotation.NameInMap("FilterRecallManagementTableIds")
        private java.util.List<String> filterRecallManagementTableIds;

        @com.aliyun.core.annotation.NameInMap("ItemRecallManagementTableId")
        private String itemRecallManagementTableId;

        @com.aliyun.core.annotation.NameInMap("ItemTableFields")
        private java.util.List<String> itemTableFields;

        @com.aliyun.core.annotation.NameInMap("MergeType")
        private String mergeType;

        @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionConfigId")
        private String recallManagementServiceVersionConfigId;

        private MergeConfig(Builder builder) {
            this.extendedConfig = builder.extendedConfig;
            this.filterExpression = builder.filterExpression;
            this.filterRecallManagementTableIds = builder.filterRecallManagementTableIds;
            this.itemRecallManagementTableId = builder.itemRecallManagementTableId;
            this.itemTableFields = builder.itemTableFields;
            this.mergeType = builder.mergeType;
            this.recallManagementServiceVersionConfigId = builder.recallManagementServiceVersionConfigId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeConfig create() {
            return builder().build();
        }

        /**
         * @return extendedConfig
         */
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        /**
         * @return filterExpression
         */
        public String getFilterExpression() {
            return this.filterExpression;
        }

        /**
         * @return filterRecallManagementTableIds
         */
        public java.util.List<String> getFilterRecallManagementTableIds() {
            return this.filterRecallManagementTableIds;
        }

        /**
         * @return itemRecallManagementTableId
         */
        public String getItemRecallManagementTableId() {
            return this.itemRecallManagementTableId;
        }

        /**
         * @return itemTableFields
         */
        public java.util.List<String> getItemTableFields() {
            return this.itemTableFields;
        }

        /**
         * @return mergeType
         */
        public String getMergeType() {
            return this.mergeType;
        }

        /**
         * @return recallManagementServiceVersionConfigId
         */
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

        public static final class Builder {
            private String extendedConfig; 
            private String filterExpression; 
            private java.util.List<String> filterRecallManagementTableIds; 
            private String itemRecallManagementTableId; 
            private java.util.List<String> itemTableFields; 
            private String mergeType; 
            private String recallManagementServiceVersionConfigId; 

            private Builder() {
            } 

            private Builder(MergeConfig model) {
                this.extendedConfig = model.extendedConfig;
                this.filterExpression = model.filterExpression;
                this.filterRecallManagementTableIds = model.filterRecallManagementTableIds;
                this.itemRecallManagementTableId = model.itemRecallManagementTableId;
                this.itemTableFields = model.itemTableFields;
                this.mergeType = model.mergeType;
                this.recallManagementServiceVersionConfigId = model.recallManagementServiceVersionConfigId;
            } 

            /**
             * <p>This parameter is reserved for future use.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;&quot;:&quot;&quot;}</p>
             */
            public Builder extendedConfig(String extendedConfig) {
                this.extendedConfig = extendedConfig;
                return this;
            }

            /**
             * <p>The filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>age&gt;10</p>
             */
            public Builder filterExpression(String filterExpression) {
                this.filterExpression = filterExpression;
                return this;
            }

            /**
             * <p>The IDs of tables to use for filtering results.</p>
             */
            public Builder filterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
                this.filterRecallManagementTableIds = filterRecallManagementTableIds;
                return this;
            }

            /**
             * <p>The item recall management table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder itemRecallManagementTableId(String itemRecallManagementTableId) {
                this.itemRecallManagementTableId = itemRecallManagementTableId;
                return this;
            }

            /**
             * <p>The fields to return from the item table.</p>
             */
            public Builder itemTableFields(java.util.List<String> itemTableFields) {
                this.itemTableFields = itemTableFields;
                return this;
            }

            /**
             * <p>The merge type. Valid values: <code>Weight</code> and <code>Alternate</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Weight</p>
             */
            public Builder mergeType(String mergeType) {
                this.mergeType = mergeType;
                return this;
            }

            /**
             * <p>The recall management service version configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
                this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
                return this;
            }

            public MergeConfig build() {
                return new MergeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class FeatureConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FeatureConfig(Builder builder) {
            this.expression = builder.expression;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureConfig create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
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
            private String expression; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(FeatureConfig model) {
                this.expression = model.expression;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The feature expression.</p>
             * 
             * <strong>example:</strong>
             * <p>category=3</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The feature name.</p>
             * 
             * <strong>example:</strong>
             * <p>city</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The feature type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FeatureConfig build() {
                return new FeatureConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class FilterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Experession")
        private String experession;

        private FilterConfig(Builder builder) {
            this.experession = builder.experession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterConfig create() {
            return builder().build();
        }

        /**
         * @return experession
         */
        public String getExperession() {
            return this.experession;
        }

        public static final class Builder {
            private String experession; 

            private Builder() {
            } 

            private Builder(FilterConfig model) {
                this.experession = model.experession;
            } 

            /**
             * <p>The filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>age&gt;20</p>
             */
            public Builder experession(String experession) {
                this.experession = experession;
                return this;
            }

            public FilterConfig build() {
                return new FilterConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class JoinConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("OutputFields")
        private java.util.List<String> outputFields;

        @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
        private String recallManagementTableId;

        private JoinConfig(Builder builder) {
            this.field = builder.field;
            this.outputFields = builder.outputFields;
            this.recallManagementTableId = builder.recallManagementTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinConfig create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return outputFields
         */
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

        /**
         * @return recallManagementTableId
         */
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public static final class Builder {
            private String field; 
            private java.util.List<String> outputFields; 
            private String recallManagementTableId; 

            private Builder() {
            } 

            private Builder(JoinConfig model) {
                this.field = model.field;
                this.outputFields = model.outputFields;
                this.recallManagementTableId = model.recallManagementTableId;
            } 

            /**
             * <p><strong>The field to join on.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p><strong>The fields to include from the joined table.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder outputFields(java.util.List<String> outputFields) {
                this.outputFields = outputFields;
                return this;
            }

            /**
             * <p><strong>The ID of the table to join with.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder recallManagementTableId(String recallManagementTableId) {
                this.recallManagementTableId = recallManagementTableId;
                return this;
            }

            public JoinConfig build() {
                return new JoinConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class TriggerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("FieldQuantityLimit")
        private Integer fieldQuantityLimit;

        @com.aliyun.core.annotation.NameInMap("IsRandSort")
        private Boolean isRandSort;

        @com.aliyun.core.annotation.NameInMap("SortField")
        private String sortField;

        private TriggerConfig(Builder builder) {
            this.field = builder.field;
            this.fieldQuantityLimit = builder.fieldQuantityLimit;
            this.isRandSort = builder.isRandSort;
            this.sortField = builder.sortField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConfig create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return fieldQuantityLimit
         */
        public Integer getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        /**
         * @return isRandSort
         */
        public Boolean getIsRandSort() {
            return this.isRandSort;
        }

        /**
         * @return sortField
         */
        public String getSortField() {
            return this.sortField;
        }

        public static final class Builder {
            private String field; 
            private Integer fieldQuantityLimit; 
            private Boolean isRandSort; 
            private String sortField; 

            private Builder() {
            } 

            private Builder(TriggerConfig model) {
                this.field = model.field;
                this.fieldQuantityLimit = model.fieldQuantityLimit;
                this.isRandSort = model.isRandSort;
                this.sortField = model.sortField;
            } 

            /**
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>user_id</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The limit on the number of fields.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder fieldQuantityLimit(Integer fieldQuantityLimit) {
                this.fieldQuantityLimit = fieldQuantityLimit;
                return this;
            }

            /**
             * <p>Specifies whether to sort randomly.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRandSort(Boolean isRandSort) {
                this.isRandSort = isRandSort;
                return this;
            }

            /**
             * <p>The sort field.</p>
             * 
             * <strong>example:</strong>
             * <p>create_time</p>
             */
            public Builder sortField(String sortField) {
                this.sortField = sortField;
                return this;
            }

            public TriggerConfig build() {
                return new TriggerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureConfig")
        private FeatureConfig featureConfig;

        @com.aliyun.core.annotation.NameInMap("FilterConfig")
        private FilterConfig filterConfig;

        @com.aliyun.core.annotation.NameInMap("JoinConfig")
        private JoinConfig joinConfig;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("TriggerConfig")
        private TriggerConfig triggerConfig;

        private Operators(Builder builder) {
            this.featureConfig = builder.featureConfig;
            this.filterConfig = builder.filterConfig;
            this.joinConfig = builder.joinConfig;
            this.operatorType = builder.operatorType;
            this.triggerConfig = builder.triggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operators create() {
            return builder().build();
        }

        /**
         * @return featureConfig
         */
        public FeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        /**
         * @return filterConfig
         */
        public FilterConfig getFilterConfig() {
            return this.filterConfig;
        }

        /**
         * @return joinConfig
         */
        public JoinConfig getJoinConfig() {
            return this.joinConfig;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return triggerConfig
         */
        public TriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

        public static final class Builder {
            private FeatureConfig featureConfig; 
            private FilterConfig filterConfig; 
            private JoinConfig joinConfig; 
            private String operatorType; 
            private TriggerConfig triggerConfig; 

            private Builder() {
            } 

            private Builder(Operators model) {
                this.featureConfig = model.featureConfig;
                this.filterConfig = model.filterConfig;
                this.joinConfig = model.joinConfig;
                this.operatorType = model.operatorType;
                this.triggerConfig = model.triggerConfig;
            } 

            /**
             * <p>The configuration for the feature operator.</p>
             */
            public Builder featureConfig(FeatureConfig featureConfig) {
                this.featureConfig = featureConfig;
                return this;
            }

            /**
             * <p>The configuration for the filter operator.</p>
             */
            public Builder filterConfig(FilterConfig filterConfig) {
                this.filterConfig = filterConfig;
                return this;
            }

            /**
             * <p>The configuration for the Join operator.</p>
             */
            public Builder joinConfig(JoinConfig joinConfig) {
                this.joinConfig = joinConfig;
                return this;
            }

            /**
             * <p>The operator type.</p>
             * 
             * <strong>example:</strong>
             * <p>Filter</p>
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>The configuration for the Trigger operator.</p>
             */
            public Builder triggerConfig(TriggerConfig triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            public Operators build() {
                return new Operators(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class RecallConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
        private String extendedConfig;

        @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
        private String itemConditionArray;

        @com.aliyun.core.annotation.NameInMap("ItemConditionExpression")
        private String itemConditionExpression;

        @com.aliyun.core.annotation.NameInMap("ItemVectorField")
        private String itemVectorField;

        @com.aliyun.core.annotation.NameInMap("ItemVectorRecallManagementTableId")
        private String itemVectorRecallManagementTableId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operators")
        private java.util.List<Operators> operators;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
        private String recallManagementTableId;

        @com.aliyun.core.annotation.NameInMap("RecallType")
        private String recallType;

        @com.aliyun.core.annotation.NameInMap("SortFields")
        private String sortFields;

        @com.aliyun.core.annotation.NameInMap("UserVectorField")
        private String userVectorField;

        @com.aliyun.core.annotation.NameInMap("UserVectorRecallManagementTableId")
        private String userVectorRecallManagementTableId;

        private RecallConfigs(Builder builder) {
            this.description = builder.description;
            this.extendedConfig = builder.extendedConfig;
            this.itemConditionArray = builder.itemConditionArray;
            this.itemConditionExpression = builder.itemConditionExpression;
            this.itemVectorField = builder.itemVectorField;
            this.itemVectorRecallManagementTableId = builder.itemVectorRecallManagementTableId;
            this.name = builder.name;
            this.operators = builder.operators;
            this.priority = builder.priority;
            this.recallManagementTableId = builder.recallManagementTableId;
            this.recallType = builder.recallType;
            this.sortFields = builder.sortFields;
            this.userVectorField = builder.userVectorField;
            this.userVectorRecallManagementTableId = builder.userVectorRecallManagementTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallConfigs create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extendedConfig
         */
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        /**
         * @return itemConditionArray
         */
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        /**
         * @return itemConditionExpression
         */
        public String getItemConditionExpression() {
            return this.itemConditionExpression;
        }

        /**
         * @return itemVectorField
         */
        public String getItemVectorField() {
            return this.itemVectorField;
        }

        /**
         * @return itemVectorRecallManagementTableId
         */
        public String getItemVectorRecallManagementTableId() {
            return this.itemVectorRecallManagementTableId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operators
         */
        public java.util.List<Operators> getOperators() {
            return this.operators;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return recallManagementTableId
         */
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        /**
         * @return recallType
         */
        public String getRecallType() {
            return this.recallType;
        }

        /**
         * @return sortFields
         */
        public String getSortFields() {
            return this.sortFields;
        }

        /**
         * @return userVectorField
         */
        public String getUserVectorField() {
            return this.userVectorField;
        }

        /**
         * @return userVectorRecallManagementTableId
         */
        public String getUserVectorRecallManagementTableId() {
            return this.userVectorRecallManagementTableId;
        }

        public static final class Builder {
            private String description; 
            private String extendedConfig; 
            private String itemConditionArray; 
            private String itemConditionExpression; 
            private String itemVectorField; 
            private String itemVectorRecallManagementTableId; 
            private String name; 
            private java.util.List<Operators> operators; 
            private Long priority; 
            private String recallManagementTableId; 
            private String recallType; 
            private String sortFields; 
            private String userVectorField; 
            private String userVectorRecallManagementTableId; 

            private Builder() {
            } 

            private Builder(RecallConfigs model) {
                this.description = model.description;
                this.extendedConfig = model.extendedConfig;
                this.itemConditionArray = model.itemConditionArray;
                this.itemConditionExpression = model.itemConditionExpression;
                this.itemVectorField = model.itemVectorField;
                this.itemVectorRecallManagementTableId = model.itemVectorRecallManagementTableId;
                this.name = model.name;
                this.operators = model.operators;
                this.priority = model.priority;
                this.recallManagementTableId = model.recallManagementTableId;
                this.recallType = model.recallType;
                this.sortFields = model.sortFields;
                this.userVectorField = model.userVectorField;
                this.userVectorRecallManagementTableId = model.userVectorRecallManagementTableId;
            } 

            /**
             * <p>The recall description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is etrec recall</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p><strong>This parameter is reserved for future use.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder extendedConfig(String extendedConfig) {
                this.extendedConfig = extendedConfig;
                return this;
            }

            /**
             * <p>The conditions for an item, formatted as an array.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;option&quot;:&quot;&lt;&quot;,&quot;field&quot;:&quot;category&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;10&quot;}]</p>
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * <p>The item condition expression.</p>
             * 
             * <strong>example:</strong>
             * <p>age&gt;20</p>
             */
            public Builder itemConditionExpression(String itemConditionExpression) {
                this.itemConditionExpression = itemConditionExpression;
                return this;
            }

            /**
             * <p>The item vector field.</p>
             * 
             * <strong>example:</strong>
             * <p>item_embedding</p>
             */
            public Builder itemVectorField(String itemVectorField) {
                this.itemVectorField = itemVectorField;
                return this;
            }

            /**
             * <p>The item vector recall management table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder itemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
                this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
                return this;
            }

            /**
             * <p>The recall name.</p>
             * 
             * <strong>example:</strong>
             * <p>etrec</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A list of operators.</p>
             */
            public Builder operators(java.util.List<Operators> operators) {
                this.operators = operators;
                return this;
            }

            /**
             * <p>The priority. A lower value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The recall management table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallManagementTableId(String recallManagementTableId) {
                this.recallManagementTableId = recallManagementTableId;
                return this;
            }

            /**
             * <p>The recall type.</p>
             * 
             * <strong>example:</strong>
             * <p>X2I</p>
             */
            public Builder recallType(String recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * <p>The sort fields.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder sortFields(String sortFields) {
                this.sortFields = sortFields;
                return this;
            }

            /**
             * <p>The user vector field.</p>
             * 
             * <strong>example:</strong>
             * <p>user_embedding</p>
             */
            public Builder userVectorField(String userVectorField) {
                this.userVectorField = userVectorField;
                return this;
            }

            /**
             * <p>The user vector recall management table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder userVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
                this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
                return this;
            }

            public RecallConfigs build() {
                return new RecallConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRecallManagementServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementServiceVersionRequest</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MergeConfig")
        private MergeConfig mergeConfig;

        @com.aliyun.core.annotation.NameInMap("RecallConfigs")
        private java.util.List<RecallConfigs> recallConfigs;

        private Configs(Builder builder) {
            this.mergeConfig = builder.mergeConfig;
            this.recallConfigs = builder.recallConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return mergeConfig
         */
        public MergeConfig getMergeConfig() {
            return this.mergeConfig;
        }

        /**
         * @return recallConfigs
         */
        public java.util.List<RecallConfigs> getRecallConfigs() {
            return this.recallConfigs;
        }

        public static final class Builder {
            private MergeConfig mergeConfig; 
            private java.util.List<RecallConfigs> recallConfigs; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.mergeConfig = model.mergeConfig;
                this.recallConfigs = model.recallConfigs;
            } 

            /**
             * <p><strong>Specifies how to merge recall results.</strong></p>
             */
            public Builder mergeConfig(MergeConfig mergeConfig) {
                this.mergeConfig = mergeConfig;
                return this;
            }

            /**
             * <p>A list of recall configurations.</p>
             */
            public Builder recallConfigs(java.util.List<RecallConfigs> recallConfigs) {
                this.recallConfigs = recallConfigs;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
