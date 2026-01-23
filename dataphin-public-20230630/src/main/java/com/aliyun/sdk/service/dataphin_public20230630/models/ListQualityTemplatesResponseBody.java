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
 * {@link ListQualityTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityTemplatesResponseBody</p>
 */
public class ListQualityTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQualityTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityTemplatesResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListQualityTemplatesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
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
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityTemplatesResponseBody build() {
            return new ListQualityTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityTemplatesResponseBody</p>
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
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
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
             * Value.
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
     * {@link ListQualityTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityTemplatesResponseBody</p>
     */
    public static class QualityTemplateList extends TeaModel {
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

        private QualityTemplateList(Builder builder) {
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

        public static QualityTemplateList create() {
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

            private Builder(QualityTemplateList model) {
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * FormPropertyList.
             */
            public Builder formPropertyList(java.util.List<FormPropertyList> formPropertyList) {
                this.formPropertyList = formPropertyList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsSystemTemplate.
             */
            public Builder isSystemTemplate(Boolean isSystemTemplate) {
                this.isSystemTemplate = isSystemTemplate;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifierName.
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * SupportAllDataSourceType.
             */
            public Builder supportAllDataSourceType(Boolean supportAllDataSourceType) {
                this.supportAllDataSourceType = supportAllDataSourceType;
                return this;
            }

            /**
             * SupportDataSourceTypeList.
             */
            public Builder supportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
                this.supportDataSourceTypeList = supportDataSourceTypeList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public QualityTemplateList build() {
                return new QualityTemplateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityTemplatesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QualityTemplateList")
        private java.util.List<QualityTemplateList> qualityTemplateList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.qualityTemplateList = builder.qualityTemplateList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return qualityTemplateList
         */
        public java.util.List<QualityTemplateList> getQualityTemplateList() {
            return this.qualityTemplateList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<QualityTemplateList> qualityTemplateList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.qualityTemplateList = model.qualityTemplateList;
                this.totalCount = model.totalCount;
            } 

            /**
             * QualityTemplateList.
             */
            public Builder qualityTemplateList(java.util.List<QualityTemplateList> qualityTemplateList) {
                this.qualityTemplateList = qualityTemplateList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
