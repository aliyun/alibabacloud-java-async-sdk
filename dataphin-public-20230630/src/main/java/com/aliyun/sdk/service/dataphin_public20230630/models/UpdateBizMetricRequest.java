// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateBizMetricRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizMetricRequest</p>
 */
public class UpdateBizMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateBizMetricCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateBizMetricCommand updateBizMetricCommand;

    private UpdateBizMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateBizMetricCommand = builder.updateBizMetricCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizMetricRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateBizMetricCommand
     */
    public UpdateBizMetricCommand getUpdateBizMetricCommand() {
        return this.updateBizMetricCommand;
    }

    public static final class Builder extends Request.Builder<UpdateBizMetricRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateBizMetricCommand updateBizMetricCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateBizMetricCommand = request.updateBizMetricCommand;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateBizMetricCommand(UpdateBizMetricCommand updateBizMetricCommand) {
            String updateBizMetricCommandShrink = shrink(updateBizMetricCommand, "UpdateBizMetricCommand", "json");
            this.putBodyParameter("UpdateBizMetricCommand", updateBizMetricCommandShrink);
            this.updateBizMetricCommand = updateBizMetricCommand;
            return this;
        }

        @Override
        public UpdateBizMetricRequest build() {
            return new UpdateBizMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBizMetricRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizMetricRequest</p>
     */
    public static class CustomAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private CustomAttribute(Builder builder) {
            this.code = builder.code;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomAttribute create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(CustomAttribute model) {
                this.code = model.code;
                this.values = model.values;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public CustomAttribute build() {
                return new CustomAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBizMetricRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizMetricRequest</p>
     */
    public static class RelatedBizMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        private RelatedBizMetrics(Builder builder) {
            this.name = builder.name;
            this.relationType = builder.relationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedBizMetrics create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        public static final class Builder {
            private String name; 
            private String relationType; 

            private Builder() {
            } 

            private Builder(RelatedBizMetrics model) {
                this.name = model.name;
                this.relationType = model.relationType;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            public RelatedBizMetrics build() {
                return new RelatedBizMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBizMetricRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizMetricRequest</p>
     */
    public static class ViewScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("UserGroupNames")
        private java.util.List<String> userGroupNames;

        @com.aliyun.core.annotation.NameInMap("UserNames")
        private java.util.List<String> userNames;

        private ViewScope(Builder builder) {
            this.scopeType = builder.scopeType;
            this.userGroupNames = builder.userGroupNames;
            this.userNames = builder.userNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewScope create() {
            return builder().build();
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return userGroupNames
         */
        public java.util.List<String> getUserGroupNames() {
            return this.userGroupNames;
        }

        /**
         * @return userNames
         */
        public java.util.List<String> getUserNames() {
            return this.userNames;
        }

        public static final class Builder {
            private String scopeType; 
            private java.util.List<String> userGroupNames; 
            private java.util.List<String> userNames; 

            private Builder() {
            } 

            private Builder(ViewScope model) {
                this.scopeType = model.scopeType;
                this.userGroupNames = model.userGroupNames;
                this.userNames = model.userNames;
            } 

            /**
             * ScopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * UserGroupNames.
             */
            public Builder userGroupNames(java.util.List<String> userGroupNames) {
                this.userGroupNames = userGroupNames;
                return this;
            }

            /**
             * UserNames.
             */
            public Builder userNames(java.util.List<String> userNames) {
                this.userNames = userNames;
                return this;
            }

            public ViewScope build() {
                return new ViewScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBizMetricRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizMetricRequest</p>
     */
    public static class UpdateBizMetricCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedTechMetricFullNames")
        private java.util.List<String> associatedTechMetricFullNames;

        @com.aliyun.core.annotation.NameInMap("BizOwnerName")
        private String bizOwnerName;

        @com.aliyun.core.annotation.NameInMap("CatalogIds")
        private java.util.List<Long> catalogIds;

        @com.aliyun.core.annotation.NameInMap("CustomAttribute")
        private java.util.List<CustomAttribute> customAttribute;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 1000)
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("MetricDefinition")
        @com.aliyun.core.annotation.Validation(maxLength = 2000)
        private String metricDefinition;

        @com.aliyun.core.annotation.NameInMap("MetricRelationDiagramExpression")
        private String metricRelationDiagramExpression;

        @com.aliyun.core.annotation.NameInMap("MetricRelationDiagramSwitchOpen")
        private Boolean metricRelationDiagramSwitchOpen;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewName")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String newName;

        @com.aliyun.core.annotation.NameInMap("OperateInstructionContent")
        private String operateInstructionContent;

        @com.aliyun.core.annotation.NameInMap("OperateInstructionEnabled")
        private Boolean operateInstructionEnabled;

        @com.aliyun.core.annotation.NameInMap("RelatedBizMetrics")
        private java.util.List<RelatedBizMetrics> relatedBizMetrics;

        @com.aliyun.core.annotation.NameInMap("ViewScope")
        private ViewScope viewScope;

        private UpdateBizMetricCommand(Builder builder) {
            this.associatedTechMetricFullNames = builder.associatedTechMetricFullNames;
            this.bizOwnerName = builder.bizOwnerName;
            this.catalogIds = builder.catalogIds;
            this.customAttribute = builder.customAttribute;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.labels = builder.labels;
            this.metricDefinition = builder.metricDefinition;
            this.metricRelationDiagramExpression = builder.metricRelationDiagramExpression;
            this.metricRelationDiagramSwitchOpen = builder.metricRelationDiagramSwitchOpen;
            this.name = builder.name;
            this.newName = builder.newName;
            this.operateInstructionContent = builder.operateInstructionContent;
            this.operateInstructionEnabled = builder.operateInstructionEnabled;
            this.relatedBizMetrics = builder.relatedBizMetrics;
            this.viewScope = builder.viewScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateBizMetricCommand create() {
            return builder().build();
        }

        /**
         * @return associatedTechMetricFullNames
         */
        public java.util.List<String> getAssociatedTechMetricFullNames() {
            return this.associatedTechMetricFullNames;
        }

        /**
         * @return bizOwnerName
         */
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        /**
         * @return catalogIds
         */
        public java.util.List<Long> getCatalogIds() {
            return this.catalogIds;
        }

        /**
         * @return customAttribute
         */
        public java.util.List<CustomAttribute> getCustomAttribute() {
            return this.customAttribute;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return labels
         */
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return metricDefinition
         */
        public String getMetricDefinition() {
            return this.metricDefinition;
        }

        /**
         * @return metricRelationDiagramExpression
         */
        public String getMetricRelationDiagramExpression() {
            return this.metricRelationDiagramExpression;
        }

        /**
         * @return metricRelationDiagramSwitchOpen
         */
        public Boolean getMetricRelationDiagramSwitchOpen() {
            return this.metricRelationDiagramSwitchOpen;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newName
         */
        public String getNewName() {
            return this.newName;
        }

        /**
         * @return operateInstructionContent
         */
        public String getOperateInstructionContent() {
            return this.operateInstructionContent;
        }

        /**
         * @return operateInstructionEnabled
         */
        public Boolean getOperateInstructionEnabled() {
            return this.operateInstructionEnabled;
        }

        /**
         * @return relatedBizMetrics
         */
        public java.util.List<RelatedBizMetrics> getRelatedBizMetrics() {
            return this.relatedBizMetrics;
        }

        /**
         * @return viewScope
         */
        public ViewScope getViewScope() {
            return this.viewScope;
        }

        public static final class Builder {
            private java.util.List<String> associatedTechMetricFullNames; 
            private String bizOwnerName; 
            private java.util.List<Long> catalogIds; 
            private java.util.List<CustomAttribute> customAttribute; 
            private String description; 
            private String displayName; 
            private java.util.List<String> labels; 
            private String metricDefinition; 
            private String metricRelationDiagramExpression; 
            private Boolean metricRelationDiagramSwitchOpen; 
            private String name; 
            private String newName; 
            private String operateInstructionContent; 
            private Boolean operateInstructionEnabled; 
            private java.util.List<RelatedBizMetrics> relatedBizMetrics; 
            private ViewScope viewScope; 

            private Builder() {
            } 

            private Builder(UpdateBizMetricCommand model) {
                this.associatedTechMetricFullNames = model.associatedTechMetricFullNames;
                this.bizOwnerName = model.bizOwnerName;
                this.catalogIds = model.catalogIds;
                this.customAttribute = model.customAttribute;
                this.description = model.description;
                this.displayName = model.displayName;
                this.labels = model.labels;
                this.metricDefinition = model.metricDefinition;
                this.metricRelationDiagramExpression = model.metricRelationDiagramExpression;
                this.metricRelationDiagramSwitchOpen = model.metricRelationDiagramSwitchOpen;
                this.name = model.name;
                this.newName = model.newName;
                this.operateInstructionContent = model.operateInstructionContent;
                this.operateInstructionEnabled = model.operateInstructionEnabled;
                this.relatedBizMetrics = model.relatedBizMetrics;
                this.viewScope = model.viewScope;
            } 

            /**
             * AssociatedTechMetricFullNames.
             */
            public Builder associatedTechMetricFullNames(java.util.List<String> associatedTechMetricFullNames) {
                this.associatedTechMetricFullNames = associatedTechMetricFullNames;
                return this;
            }

            /**
             * BizOwnerName.
             */
            public Builder bizOwnerName(String bizOwnerName) {
                this.bizOwnerName = bizOwnerName;
                return this;
            }

            /**
             * CatalogIds.
             */
            public Builder catalogIds(java.util.List<Long> catalogIds) {
                this.catalogIds = catalogIds;
                return this;
            }

            /**
             * CustomAttribute.
             */
            public Builder customAttribute(java.util.List<CustomAttribute> customAttribute) {
                this.customAttribute = customAttribute;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * MetricDefinition.
             */
            public Builder metricDefinition(String metricDefinition) {
                this.metricDefinition = metricDefinition;
                return this;
            }

            /**
             * MetricRelationDiagramExpression.
             */
            public Builder metricRelationDiagramExpression(String metricRelationDiagramExpression) {
                this.metricRelationDiagramExpression = metricRelationDiagramExpression;
                return this;
            }

            /**
             * MetricRelationDiagramSwitchOpen.
             */
            public Builder metricRelationDiagramSwitchOpen(Boolean metricRelationDiagramSwitchOpen) {
                this.metricRelationDiagramSwitchOpen = metricRelationDiagramSwitchOpen;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewName.
             */
            public Builder newName(String newName) {
                this.newName = newName;
                return this;
            }

            /**
             * OperateInstructionContent.
             */
            public Builder operateInstructionContent(String operateInstructionContent) {
                this.operateInstructionContent = operateInstructionContent;
                return this;
            }

            /**
             * OperateInstructionEnabled.
             */
            public Builder operateInstructionEnabled(Boolean operateInstructionEnabled) {
                this.operateInstructionEnabled = operateInstructionEnabled;
                return this;
            }

            /**
             * RelatedBizMetrics.
             */
            public Builder relatedBizMetrics(java.util.List<RelatedBizMetrics> relatedBizMetrics) {
                this.relatedBizMetrics = relatedBizMetrics;
                return this;
            }

            /**
             * ViewScope.
             */
            public Builder viewScope(ViewScope viewScope) {
                this.viewScope = viewScope;
                return this;
            }

            public UpdateBizMetricCommand build() {
                return new UpdateBizMetricCommand(this);
            } 

        } 

    }
}
