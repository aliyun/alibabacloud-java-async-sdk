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
 * {@link GetQualityTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityTemplateResponseBody</p>
 */
public class GetQualityTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QualityTemplateInfo")
    private QualityTemplateInfo qualityTemplateInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.qualityTemplateInfo = builder.qualityTemplateInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityTemplateResponseBody create() {
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
     * @return qualityTemplateInfo
     */
    public QualityTemplateInfo getQualityTemplateInfo() {
        return this.qualityTemplateInfo;
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
        private Integer httpStatusCode; 
        private String message; 
        private QualityTemplateInfo qualityTemplateInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityTemplateResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.qualityTemplateInfo = model.qualityTemplateInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The template object details.</p>
         */
        public Builder qualityTemplateInfo(QualityTemplateInfo qualityTemplateInfo) {
            this.qualityTemplateInfo = qualityTemplateInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityTemplateResponseBody build() {
            return new GetQualityTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityTemplateResponseBody</p>
     */
    public static class FormPropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private FormPropertyList(Builder builder) {
            this.componentType = builder.componentType;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FormPropertyList create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String componentType; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(FormPropertyList model) {
                this.componentType = model.componentType;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The component type.</p>
             * 
             * <strong>example:</strong>
             * <p>expression</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>col</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The property value.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FormPropertyList build() {
                return new FormPropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityTemplateResponseBody</p>
     */
    public static class QualityTemplateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FormPropertyList")
        private java.util.List<FormPropertyList> formPropertyList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsSystemTemplate")
        private Boolean isSystemTemplate;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("SupportAllDataSourceType")
        private Boolean supportAllDataSourceType;

        @com.aliyun.core.annotation.NameInMap("SupportDataSourceTypeList")
        private java.util.List<String> supportDataSourceTypeList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private QualityTemplateInfo(Builder builder) {
            this.catalog = builder.catalog;
            this.catalogName = builder.catalogName;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.formPropertyList = builder.formPropertyList;
            this.id = builder.id;
            this.isSystemTemplate = builder.isSystemTemplate;
            this.modifier = builder.modifier;
            this.modifierName = builder.modifierName;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.supportAllDataSourceType = builder.supportAllDataSourceType;
            this.supportDataSourceTypeList = builder.supportDataSourceTypeList;
            this.type = builder.type;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityTemplateInfo create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return formPropertyList
         */
        public java.util.List<FormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isSystemTemplate
         */
        public Boolean getIsSystemTemplate() {
            return this.isSystemTemplate;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return supportAllDataSourceType
         */
        public Boolean getSupportAllDataSourceType() {
            return this.supportAllDataSourceType;
        }

        /**
         * @return supportDataSourceTypeList
         */
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String catalog; 
            private String catalogName; 
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private java.util.List<FormPropertyList> formPropertyList; 
            private Long id; 
            private Boolean isSystemTemplate; 
            private String modifier; 
            private String modifierName; 
            private String modifyTime; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private Boolean supportAllDataSourceType; 
            private java.util.List<String> supportDataSourceTypeList; 
            private String type; 
            private String typeName; 

            private Builder() {
            } 

            private Builder(QualityTemplateInfo model) {
                this.catalog = model.catalog;
                this.catalogName = model.catalogName;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.formPropertyList = model.formPropertyList;
                this.id = model.id;
                this.isSystemTemplate = model.isSystemTemplate;
                this.modifier = model.modifier;
                this.modifierName = model.modifierName;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.supportAllDataSourceType = model.supportAllDataSourceType;
                this.supportDataSourceTypeList = model.supportDataSourceTypeList;
                this.type = model.type;
                this.typeName = model.typeName;
            } 

            /**
             * <p>The template category. Valid values:</p>
             * <ul>
             * <li>CONSISTENT: Consistency.</li>
             * <li>EFFECTIVE: Effectiveness.</li>
             * <li>TIMELINESE: Timeliness.</li>
             * <li>ACCURATE: Accuracy.</li>
             * <li>UNIQUENESS: Uniqueness.</li>
             * <li>COMPLETENESS: Completeness.</li>
             * <li>STABILITY: Stability.</li>
             * <li>CUSTOM: Custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONSISTENT</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The display name of the template category.</p>
             * 
             * <strong>example:</strong>
             * <p>Consistency</p>
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The key-value pairs for rule configuration.</p>
             */
            public Builder formPropertyList(java.util.List<FormPropertyList> formPropertyList) {
                this.formPropertyList = formPropertyList;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Specifies whether the template is a system template.</p>
             */
            public Builder isSystemTemplate(Boolean isSystemTemplate) {
                this.isSystemTemplate = isSystemTemplate;
                return this;
            }

            /**
             * <p>The user ID of the last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The name of the last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>The update time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>Specifies whether all data source types are supported.</p>
             */
            public Builder supportAllDataSourceType(Boolean supportAllDataSourceType) {
                this.supportAllDataSourceType = supportAllDataSourceType;
                return this;
            }

            /**
             * <p>The specific data source types that are supported, such as MySQL, Oracle, Microsoft SQL Server, MaxCompute, and Hive.</p>
             */
            public Builder supportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
                this.supportDataSourceTypeList = supportDataSourceTypeList;
                return this;
            }

            /**
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li>FIELD_NULL_VALUE_VALIDATE: Field null value check.</li>
             * <li>FIELD_EMPTY_STRING_VALIDATE: Field empty character check.</li>
             * <li>FIELD_UNIQUE_VALIDATE: Field uniqueness check.</li>
             * <li>FIELD_GROUP_COUNT_VALIDATE: Field unique value count check.</li>
             * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: Field duplicate value count check.</li>
             * <li>FUNCTION_TIME_COMPARE: Time function comparison.</li>
             * <li>SINGLE_TABLE_TIME_COMPARE: Non-partitioned table time field comparison.</li>
             * <li>DOUBLE_TABLE_TIME_COMPARE: Double-table time field comparison.</li>
             * <li>FIELD_FORMAT_VALIDATE: Field format check.</li>
             * <li>FIELD_LENGTH_VALIDATE: Field length check.</li>
             * <li>FIELD_VALUE_RANGE_VALIDATE: Field value range check.</li>
             * <li>CODE_TABLE_COMPARE: Lookup table reference comparison.</li>
             * <li>STANDARD_CODE_TABLE_COMPARE: Data standard lookup table reference comparison.</li>
             * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: Non-partitioned table field value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: Non-partitioned table field statistical value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: Non-partitioned table field business logic consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: Double-table field value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Double-table field statistical value consistency comparison.</li>
             * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Cross-source double-table field statistical value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: Double-table field business logic consistency comparison.</li>
             * <li>TABLE_STABILITY_VALIDATE: Table stability check.</li>
             * <li>TABLE_FLUCTUATION_VALIDATE: Table fluctuation check.</li>
             * <li>FIELD_STABILITY_VALIDATE: Field stability check.</li>
             * <li>FIELD_FLUCTUATION_VALIDATE: Field fluctuation check.</li>
             * <li>CUSTOM_STATISTICAL_VALIDATE: Custom statistical metric check.</li>
             * <li>CUSTOM_DATA_DETAILS_VALIDATE: Custom data details check.</li>
             * <li>DATASOURCE_AVAILABLE_CHECK: Data source connectivity check.</li>
             * <li>TABLE_SCHEMA_CHECK: Table schema change check.</li>
             * <li>REAL_TIME_OFFLINE_COMPARE: Real-time and offline comparison.</li>
             * <li>REAL_TIME_STATISTICAL_VALIDATE: Real-time statistical value check.</li>
             * <li>REAL_TIME_MULTI_CHAIN_COMPARE: Real-time multi-link comparison.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIELD_NULL_VALUE_VALIDATE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The display name of the templatetype.</p>
             * 
             * <strong>example:</strong>
             * <p>Field null value check</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public QualityTemplateInfo build() {
                return new QualityTemplateInfo(this);
            } 

        } 

    }
}
