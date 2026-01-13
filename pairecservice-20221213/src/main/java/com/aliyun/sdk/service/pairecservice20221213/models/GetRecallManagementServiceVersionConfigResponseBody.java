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
 * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
 */
public class GetRecallManagementServiceVersionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("MergeConfig")
    private MergeConfig mergeConfig;

    @com.aliyun.core.annotation.NameInMap("RecallConfig")
    private RecallConfig recallConfig;

    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionConfigId")
    private String recallManagementServiceVersionConfigId;

    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
    private String recallManagementServiceVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRecallManagementServiceVersionConfigResponseBody(Builder builder) {
        this.configType = builder.configType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.mergeConfig = builder.mergeConfig;
        this.recallConfig = builder.recallConfig;
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.recallManagementServiceVersionConfigId = builder.recallManagementServiceVersionConfigId;
        this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecallManagementServiceVersionConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return mergeConfig
     */
    public MergeConfig getMergeConfig() {
        return this.mergeConfig;
    }

    /**
     * @return recallConfig
     */
    public RecallConfig getRecallConfig() {
        return this.recallConfig;
    }

    /**
     * @return recallManagementServiceId
     */
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    /**
     * @return recallManagementServiceVersionConfigId
     */
    public String getRecallManagementServiceVersionConfigId() {
        return this.recallManagementServiceVersionConfigId;
    }

    /**
     * @return recallManagementServiceVersionId
     */
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configType; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private MergeConfig mergeConfig; 
        private RecallConfig recallConfig; 
        private String recallManagementServiceId; 
        private String recallManagementServiceVersionConfigId; 
        private String recallManagementServiceVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRecallManagementServiceVersionConfigResponseBody model) {
            this.configType = model.configType;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.mergeConfig = model.mergeConfig;
            this.recallConfig = model.recallConfig;
            this.recallManagementServiceId = model.recallManagementServiceId;
            this.recallManagementServiceVersionConfigId = model.recallManagementServiceVersionConfigId;
            this.recallManagementServiceVersionId = model.recallManagementServiceVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * MergeConfig.
         */
        public Builder mergeConfig(MergeConfig mergeConfig) {
            this.mergeConfig = mergeConfig;
            return this;
        }

        /**
         * RecallConfig.
         */
        public Builder recallConfig(RecallConfig recallConfig) {
            this.recallConfig = recallConfig;
            return this;
        }

        /**
         * RecallManagementServiceId.
         */
        public Builder recallManagementServiceId(String recallManagementServiceId) {
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
        }

        /**
         * RecallManagementServiceVersionConfigId.
         */
        public Builder recallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }

        /**
         * RecallManagementServiceVersionId.
         */
        public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
            this.recallManagementServiceVersionId = recallManagementServiceVersionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRecallManagementServiceVersionConfigResponseBody build() {
            return new GetRecallManagementServiceVersionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
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
             * ExtendedConfig.
             */
            public Builder extendedConfig(String extendedConfig) {
                this.extendedConfig = extendedConfig;
                return this;
            }

            /**
             * FilterExpression.
             */
            public Builder filterExpression(String filterExpression) {
                this.filterExpression = filterExpression;
                return this;
            }

            /**
             * FilterRecallManagementTableIds.
             */
            public Builder filterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
                this.filterRecallManagementTableIds = filterRecallManagementTableIds;
                return this;
            }

            /**
             * ItemRecallManagementTableId.
             */
            public Builder itemRecallManagementTableId(String itemRecallManagementTableId) {
                this.itemRecallManagementTableId = itemRecallManagementTableId;
                return this;
            }

            /**
             * ItemTableFields.
             */
            public Builder itemTableFields(java.util.List<String> itemTableFields) {
                this.itemTableFields = itemTableFields;
                return this;
            }

            /**
             * MergeType.
             */
            public Builder mergeType(String mergeType) {
                this.mergeType = mergeType;
                return this;
            }

            /**
             * RecallManagementServiceVersionConfigId.
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
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
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
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
     */
    public static class FilterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        private FilterConfig(Builder builder) {
            this.expression = builder.expression;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterConfig create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        public static final class Builder {
            private String expression; 

            private Builder() {
            } 

            private Builder(FilterConfig model) {
                this.expression = model.expression;
            } 

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            public FilterConfig build() {
                return new FilterConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
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
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * OutputFields.
             */
            public Builder outputFields(java.util.List<String> outputFields) {
                this.outputFields = outputFields;
                return this;
            }

            /**
             * RecallManagementTableId.
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
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
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
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * FieldQuantityLimit.
             */
            public Builder fieldQuantityLimit(Integer fieldQuantityLimit) {
                this.fieldQuantityLimit = fieldQuantityLimit;
                return this;
            }

            /**
             * IsRandSort.
             */
            public Builder isRandSort(Boolean isRandSort) {
                this.isRandSort = isRandSort;
                return this;
            }

            /**
             * SortField.
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
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
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
             * FeatureConfig.
             */
            public Builder featureConfig(FeatureConfig featureConfig) {
                this.featureConfig = featureConfig;
                return this;
            }

            /**
             * FilterConfig.
             */
            public Builder filterConfig(FilterConfig filterConfig) {
                this.filterConfig = filterConfig;
                return this;
            }

            /**
             * JoinConfig.
             */
            public Builder joinConfig(JoinConfig joinConfig) {
                this.joinConfig = joinConfig;
                return this;
            }

            /**
             * OperatorType.
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * TriggerConfig.
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
     * {@link GetRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementServiceVersionConfigResponseBody</p>
     */
    public static class RecallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
        private String extendedConfig;

        @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
        private String itemConditionArray;

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

        @com.aliyun.core.annotation.NameInMap("UserVectorField")
        private String userVectorField;

        @com.aliyun.core.annotation.NameInMap("UserVectorRecallManagementTableId")
        private String userVectorRecallManagementTableId;

        private RecallConfig(Builder builder) {
            this.description = builder.description;
            this.extendedConfig = builder.extendedConfig;
            this.itemConditionArray = builder.itemConditionArray;
            this.itemVectorField = builder.itemVectorField;
            this.itemVectorRecallManagementTableId = builder.itemVectorRecallManagementTableId;
            this.name = builder.name;
            this.operators = builder.operators;
            this.priority = builder.priority;
            this.recallManagementTableId = builder.recallManagementTableId;
            this.recallType = builder.recallType;
            this.userVectorField = builder.userVectorField;
            this.userVectorRecallManagementTableId = builder.userVectorRecallManagementTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallConfig create() {
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
            private String itemVectorField; 
            private String itemVectorRecallManagementTableId; 
            private String name; 
            private java.util.List<Operators> operators; 
            private Long priority; 
            private String recallManagementTableId; 
            private String recallType; 
            private String userVectorField; 
            private String userVectorRecallManagementTableId; 

            private Builder() {
            } 

            private Builder(RecallConfig model) {
                this.description = model.description;
                this.extendedConfig = model.extendedConfig;
                this.itemConditionArray = model.itemConditionArray;
                this.itemVectorField = model.itemVectorField;
                this.itemVectorRecallManagementTableId = model.itemVectorRecallManagementTableId;
                this.name = model.name;
                this.operators = model.operators;
                this.priority = model.priority;
                this.recallManagementTableId = model.recallManagementTableId;
                this.recallType = model.recallType;
                this.userVectorField = model.userVectorField;
                this.userVectorRecallManagementTableId = model.userVectorRecallManagementTableId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExtendedConfig.
             */
            public Builder extendedConfig(String extendedConfig) {
                this.extendedConfig = extendedConfig;
                return this;
            }

            /**
             * ItemConditionArray.
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * ItemVectorField.
             */
            public Builder itemVectorField(String itemVectorField) {
                this.itemVectorField = itemVectorField;
                return this;
            }

            /**
             * ItemVectorRecallManagementTableId.
             */
            public Builder itemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
                this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operators.
             */
            public Builder operators(java.util.List<Operators> operators) {
                this.operators = operators;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RecallManagementTableId.
             */
            public Builder recallManagementTableId(String recallManagementTableId) {
                this.recallManagementTableId = recallManagementTableId;
                return this;
            }

            /**
             * RecallType.
             */
            public Builder recallType(String recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * UserVectorField.
             */
            public Builder userVectorField(String userVectorField) {
                this.userVectorField = userVectorField;
                return this;
            }

            /**
             * UserVectorRecallManagementTableId.
             */
            public Builder userVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
                this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
                return this;
            }

            public RecallConfig build() {
                return new RecallConfig(this);
            } 

        } 

    }
}
