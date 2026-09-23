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
 * {@link UpsertQualityTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpsertQualityTemplateRequest</p>
 */
public class UpsertQualityTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.upsertCommand = builder.upsertCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertQualityTemplateRequest create() {
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return upsertCommand
     */
    public UpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static final class Builder extends Request.Builder<UpsertQualityTemplateRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.upsertCommand = request.upsertCommand;
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
         * <p>Tenant ID.</p>
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>Upsert command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder upsertCommand(UpsertCommand upsertCommand) {
            String upsertCommandShrink = shrink(upsertCommand, "UpsertCommand", "json");
            this.putBodyParameter("UpsertCommand", upsertCommandShrink);
            this.upsertCommand = upsertCommand;
            return this;
        }

        @Override
        public UpsertQualityTemplateRequest build() {
            return new UpsertQualityTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertQualityTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityTemplateRequest</p>
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
             * <p>Component type.</p>
             * 
             * <strong>example:</strong>
             * <p>expression</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>Property name.</p>
             * 
             * <strong>example:</strong>
             * <p>col</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Property value.</p>
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
     * {@link UpsertQualityTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityTemplateRequest</p>
     */
    public static class UpsertCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        @com.aliyun.core.annotation.Validation(required = true)
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FormPropertyList")
        private java.util.List<FormPropertyList> formPropertyList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String owner;

        @com.aliyun.core.annotation.NameInMap("SupportDataSourceTypeList")
        private java.util.List<String> supportDataSourceTypeList;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private UpsertCommand(Builder builder) {
            this.catalog = builder.catalog;
            this.description = builder.description;
            this.formPropertyList = builder.formPropertyList;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.supportDataSourceTypeList = builder.supportDataSourceTypeList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpsertCommand create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
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

        public static final class Builder {
            private String catalog; 
            private String description; 
            private java.util.List<FormPropertyList> formPropertyList; 
            private Long id; 
            private String name; 
            private String owner; 
            private java.util.List<String> supportDataSourceTypeList; 
            private String type; 

            private Builder() {
            } 

            private Builder(UpsertCommand model) {
                this.catalog = model.catalog;
                this.description = model.description;
                this.formPropertyList = model.formPropertyList;
                this.id = model.id;
                this.name = model.name;
                this.owner = model.owner;
                this.supportDataSourceTypeList = model.supportDataSourceTypeList;
                this.type = model.type;
            } 

            /**
             * <p>Template category. Valid values: CONSISTENT: consistency. EFFECTIVE: validity. TIMELINESE: timeliness. ACCURATE: accuracy. UNIQUENESS: uniqueness. COMPLETENESS: completeness. STABILITY: stability. CUSTOM: custom.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSISTENT</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>Template description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Rule configuration key-value pairs.</p>
             */
            public Builder formPropertyList(java.util.List<FormPropertyList> formPropertyList) {
                this.formPropertyList = formPropertyList;
                return this;
            }

            /**
             * <p>Template ID. If specified, it indicates an update operation. If not specified, it indicates a creation operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Template name.</p>
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
             * <p>Template owner ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Supported data source types, such as MySQL, Oracle, Microsoft SQL Server, MaxCompute, and Hive.</p>
             */
            public Builder supportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
                this.supportDataSourceTypeList = supportDataSourceTypeList;
                return this;
            }

            /**
             * <p>Template type. Valid values: FIELD_NULL_VALUE_VALIDATE: field null value validation. FIELD_EMPTY_STRING_VALIDATE: field empty string validation. FIELD_UNIQUE_VALIDATE: field uniqueness validation. FIELD_GROUP_COUNT_VALIDATE: field unique value count validation. FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count validation. FUNCTION_TIME_COMPARE: time function comparison. SINGLE_TABLE_TIME_COMPARE: single-table time field comparison. DOUBLE_TABLE_TIME_COMPARE: cross-table time field comparison. FIELD_FORMAT_VALIDATE: field format validation. FIELD_LENGTH_VALIDATE: field length validation. FIELD_VALUE_RANGE_VALIDATE: field value range validation. CODE_TABLE_COMPARE: code table reference comparison. STANDARD_CODE_TABLE_COMPARE: data standard code table reference comparison. SINGLE_TABLE_FIELD_VALUE_COMPARE: single-table field value consistency comparison. SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: single-table field statistical value consistency comparison. SINGLE_TABLE_FIELD_EXP_COMPARE: single-table field business logic consistency comparison. DOUBLE_TABLE_FIELD_VALUE_COMPARE: cross-table field value consistency comparison. DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-table field statistical value consistency comparison. CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source cross-table field statistical value consistency comparison. DOUBLE_TABLE_FIELD_EXP_COMPARE: cross-table field business logic consistency comparison. TABLE_STABILITY_VALIDATE: table stability validation. TABLE_FLUCTUATION_VALIDATE: table fluctuation validation. FIELD_STABILITY_VALIDATE: field stability validation. FIELD_FLUCTUATION_VALIDATE: field fluctuation validation. CUSTOM_STATISTICAL_VALIDATE: custom statistical metric validation. CUSTOM_DATA_DETAILS_VALIDATE: custom data details validation. DATASOURCE_AVAILABLE_CHECK: data source connectivity check. TABLE_SCHEMA_CHECK: table schema change detection. REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison. REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring. REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-chain comparison.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FIELD_NULL_VALUE_VALIDATE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UpsertCommand build() {
                return new UpsertCommand(this);
            } 

        } 

    }
}
