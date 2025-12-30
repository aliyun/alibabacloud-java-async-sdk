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
 * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetBizMetricByNameResponseBody</p>
 */
public class GetBizMetricByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBizMetricByNameResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBizMetricByNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetBizMetricByNameResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBizMetricByNameResponseBody build() {
            return new GetBizMetricByNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameResponseBody</p>
     */
    public static class AssociatedTechMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private AssociatedTechMetrics(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.guid = builder.guid;
            this.name = builder.name;
            this.subType = builder.subType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedTechMetrics create() {
            return builder().build();
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String guid; 
            private String name; 
            private String subType; 

            private Builder() {
            } 

            private Builder(AssociatedTechMetrics model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.guid = model.guid;
                this.name = model.name;
                this.subType = model.subType;
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
             * <p>guid</p>
             * 
             * <strong>example:</strong>
             * <p>table1.a.b</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
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
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            public AssociatedTechMetrics build() {
                return new AssociatedTechMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameResponseBody</p>
     */
    public static class Catalogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogDesc")
        private String catalogDesc;

        @com.aliyun.core.annotation.NameInMap("CatalogId")
        private Long catalogId;

        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("ParentCatalogId")
        private Long parentCatalogId;

        @com.aliyun.core.annotation.NameInMap("ParentPath")
        private String parentPath;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Catalogs(Builder builder) {
            this.catalogDesc = builder.catalogDesc;
            this.catalogId = builder.catalogId;
            this.catalogName = builder.catalogName;
            this.parentCatalogId = builder.parentCatalogId;
            this.parentPath = builder.parentPath;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Catalogs create() {
            return builder().build();
        }

        /**
         * @return catalogDesc
         */
        public String getCatalogDesc() {
            return this.catalogDesc;
        }

        /**
         * @return catalogId
         */
        public Long getCatalogId() {
            return this.catalogId;
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return parentCatalogId
         */
        public Long getParentCatalogId() {
            return this.parentCatalogId;
        }

        /**
         * @return parentPath
         */
        public String getParentPath() {
            return this.parentPath;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String catalogDesc; 
            private Long catalogId; 
            private String catalogName; 
            private Long parentCatalogId; 
            private String parentPath; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Catalogs model) {
                this.catalogDesc = model.catalogDesc;
                this.catalogId = model.catalogId;
                this.catalogName = model.catalogName;
                this.parentCatalogId = model.parentCatalogId;
                this.parentPath = model.parentPath;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
            } 

            /**
             * CatalogDesc.
             */
            public Builder catalogDesc(String catalogDesc) {
                this.catalogDesc = catalogDesc;
                return this;
            }

            /**
             * CatalogId.
             */
            public Builder catalogId(Long catalogId) {
                this.catalogId = catalogId;
                return this;
            }

            /**
             * CatalogName.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * ParentCatalogId.
             */
            public Builder parentCatalogId(Long parentCatalogId) {
                this.parentCatalogId = parentCatalogId;
                return this;
            }

            /**
             * ParentPath.
             */
            public Builder parentPath(String parentPath) {
                this.parentPath = parentPath;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Catalogs build() {
                return new Catalogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameResponseBody</p>
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
     * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameResponseBody</p>
     */
    public static class RelatedBizMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        private RelatedBizMetrics(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.guid = builder.guid;
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
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
            private String description; 
            private String displayName; 
            private String guid; 
            private String name; 
            private String relationType; 

            private Builder() {
            } 

            private Builder(RelatedBizMetrics model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.guid = model.guid;
                this.name = model.name;
                this.relationType = model.relationType;
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
             * <p>guid</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
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
     * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameResponseBody</p>
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
     * {@link GetBizMetricByNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedTechMetrics")
        private java.util.List<AssociatedTechMetrics> associatedTechMetrics;

        @com.aliyun.core.annotation.NameInMap("BizOwnerName")
        private String bizOwnerName;

        @com.aliyun.core.annotation.NameInMap("Catalogs")
        private java.util.List<Catalogs> catalogs;

        @com.aliyun.core.annotation.NameInMap("CustomAttribute")
        private java.util.List<CustomAttribute> customAttribute;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("MetricDefinition")
        private String metricDefinition;

        @com.aliyun.core.annotation.NameInMap("MetricRelationDiagramExpression")
        private String metricRelationDiagramExpression;

        @com.aliyun.core.annotation.NameInMap("MetricRelationDiagramSwitchOpen")
        private Boolean metricRelationDiagramSwitchOpen;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperateInstructionContent")
        private String operateInstructionContent;

        @com.aliyun.core.annotation.NameInMap("OperateInstructionEnabled")
        private Boolean operateInstructionEnabled;

        @com.aliyun.core.annotation.NameInMap("RelatedBizMetrics")
        private java.util.List<RelatedBizMetrics> relatedBizMetrics;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("ViewScope")
        private ViewScope viewScope;

        private Data(Builder builder) {
            this.associatedTechMetrics = builder.associatedTechMetrics;
            this.bizOwnerName = builder.bizOwnerName;
            this.catalogs = builder.catalogs;
            this.customAttribute = builder.customAttribute;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.guid = builder.guid;
            this.labels = builder.labels;
            this.metricDefinition = builder.metricDefinition;
            this.metricRelationDiagramExpression = builder.metricRelationDiagramExpression;
            this.metricRelationDiagramSwitchOpen = builder.metricRelationDiagramSwitchOpen;
            this.name = builder.name;
            this.operateInstructionContent = builder.operateInstructionContent;
            this.operateInstructionEnabled = builder.operateInstructionEnabled;
            this.relatedBizMetrics = builder.relatedBizMetrics;
            this.tenantId = builder.tenantId;
            this.viewScope = builder.viewScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return associatedTechMetrics
         */
        public java.util.List<AssociatedTechMetrics> getAssociatedTechMetrics() {
            return this.associatedTechMetrics;
        }

        /**
         * @return bizOwnerName
         */
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        /**
         * @return catalogs
         */
        public java.util.List<Catalogs> getCatalogs() {
            return this.catalogs;
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
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
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return viewScope
         */
        public ViewScope getViewScope() {
            return this.viewScope;
        }

        public static final class Builder {
            private java.util.List<AssociatedTechMetrics> associatedTechMetrics; 
            private String bizOwnerName; 
            private java.util.List<Catalogs> catalogs; 
            private java.util.List<CustomAttribute> customAttribute; 
            private String description; 
            private String displayName; 
            private String guid; 
            private java.util.List<String> labels; 
            private String metricDefinition; 
            private String metricRelationDiagramExpression; 
            private Boolean metricRelationDiagramSwitchOpen; 
            private String name; 
            private String operateInstructionContent; 
            private Boolean operateInstructionEnabled; 
            private java.util.List<RelatedBizMetrics> relatedBizMetrics; 
            private Long tenantId; 
            private ViewScope viewScope; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.associatedTechMetrics = model.associatedTechMetrics;
                this.bizOwnerName = model.bizOwnerName;
                this.catalogs = model.catalogs;
                this.customAttribute = model.customAttribute;
                this.description = model.description;
                this.displayName = model.displayName;
                this.guid = model.guid;
                this.labels = model.labels;
                this.metricDefinition = model.metricDefinition;
                this.metricRelationDiagramExpression = model.metricRelationDiagramExpression;
                this.metricRelationDiagramSwitchOpen = model.metricRelationDiagramSwitchOpen;
                this.name = model.name;
                this.operateInstructionContent = model.operateInstructionContent;
                this.operateInstructionEnabled = model.operateInstructionEnabled;
                this.relatedBizMetrics = model.relatedBizMetrics;
                this.tenantId = model.tenantId;
                this.viewScope = model.viewScope;
            } 

            /**
             * AssociatedTechMetrics.
             */
            public Builder associatedTechMetrics(java.util.List<AssociatedTechMetrics> associatedTechMetrics) {
                this.associatedTechMetrics = associatedTechMetrics;
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
             * Catalogs.
             */
            public Builder catalogs(java.util.List<Catalogs> catalogs) {
                this.catalogs = catalogs;
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
             * <p>guid</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * ViewScope.
             */
            public Builder viewScope(ViewScope viewScope) {
                this.viewScope = viewScope;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
