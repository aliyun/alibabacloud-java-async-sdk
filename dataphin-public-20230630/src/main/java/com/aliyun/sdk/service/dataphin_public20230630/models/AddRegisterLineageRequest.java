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
 * {@link AddRegisterLineageRequest} extends {@link RequestModel}
 *
 * <p>AddRegisterLineageRequest</p>
 */
public class AddRegisterLineageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddRegisterLineageCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddRegisterLineageCommand addRegisterLineageCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private AddRegisterLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addRegisterLineageCommand = builder.addRegisterLineageCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRegisterLineageRequest create() {
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
     * @return addRegisterLineageCommand
     */
    public AddRegisterLineageCommand getAddRegisterLineageCommand() {
        return this.addRegisterLineageCommand;
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

    public static final class Builder extends Request.Builder<AddRegisterLineageRequest, Builder> {
        private String regionId; 
        private AddRegisterLineageCommand addRegisterLineageCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(AddRegisterLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addRegisterLineageCommand = request.addRegisterLineageCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The command for registering and adding data lineage.</p>
         * <p>This parameter is required.</p>
         */
        public Builder addRegisterLineageCommand(AddRegisterLineageCommand addRegisterLineageCommand) {
            String addRegisterLineageCommandShrink = shrink(addRegisterLineageCommand, "AddRegisterLineageCommand", "json");
            this.putBodyParameter("AddRegisterLineageCommand", addRegisterLineageCommandShrink);
            this.addRegisterLineageCommand = addRegisterLineageCommand;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
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

        @Override
        public AddRegisterLineageRequest build() {
            return new AddRegisterLineageRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>AddRegisterLineageRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ExtProperties")
        private java.util.Map<String, ?> extProperties;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("MetadataType")
        private String metadataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentGuid")
        private String parentGuid;

        @com.aliyun.core.annotation.NameInMap("ReferenceType")
        private String referenceType;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private Source(Builder builder) {
            this.catalog = builder.catalog;
            this.env = builder.env;
            this.extProperties = builder.extProperties;
            this.guid = builder.guid;
            this.metadataType = builder.metadataType;
            this.name = builder.name;
            this.parentGuid = builder.parentGuid;
            this.referenceType = builder.referenceType;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return extProperties
         */
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return metadataType
         */
        public String getMetadataType() {
            return this.metadataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentGuid
         */
        public String getParentGuid() {
            return this.parentGuid;
        }

        /**
         * @return referenceType
         */
        public String getReferenceType() {
            return this.referenceType;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String catalog; 
            private String env; 
            private java.util.Map<String, ?> extProperties; 
            private String guid; 
            private String metadataType; 
            private String name; 
            private String parentGuid; 
            private String referenceType; 
            private String schema; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.catalog = model.catalog;
                this.env = model.env;
                this.extProperties = model.extProperties;
                this.guid = model.guid;
                this.metadataType = model.metadataType;
                this.name = model.name;
                this.parentGuid = model.parentGuid;
                this.referenceType = model.referenceType;
                this.schema = model.schema;
            } 

            /**
             * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV, PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The extended properties.</p>
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300000001.project1.table1.column1</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The asset type. Set this parameter based on the actual scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>COLUMN</p>
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
                return this;
            }

            /**
             * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The GUID of the parent asset. If the current object is a field, parentGuid is the GUID of the table to which the field belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300000001.project1.table1</p>
             */
            public Builder parentGuid(String parentGuid) {
                this.parentGuid = parentGuid;
                return this;
            }

            /**
             * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_GUID, BY_PROPERTY</p>
             */
            public Builder referenceType(String referenceType) {
                this.referenceType = referenceType;
                return this;
            }

            /**
             * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>project1, bizUnit1</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>AddRegisterLineageRequest</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ExtProperties")
        private java.util.Map<String, ?> extProperties;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("MetadataType")
        private String metadataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentGuid")
        private String parentGuid;

        @com.aliyun.core.annotation.NameInMap("ReferenceType")
        private String referenceType;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private Target(Builder builder) {
            this.catalog = builder.catalog;
            this.env = builder.env;
            this.extProperties = builder.extProperties;
            this.guid = builder.guid;
            this.metadataType = builder.metadataType;
            this.name = builder.name;
            this.parentGuid = builder.parentGuid;
            this.referenceType = builder.referenceType;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return extProperties
         */
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return metadataType
         */
        public String getMetadataType() {
            return this.metadataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentGuid
         */
        public String getParentGuid() {
            return this.parentGuid;
        }

        /**
         * @return referenceType
         */
        public String getReferenceType() {
            return this.referenceType;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String catalog; 
            private String env; 
            private java.util.Map<String, ?> extProperties; 
            private String guid; 
            private String metadataType; 
            private String name; 
            private String parentGuid; 
            private String referenceType; 
            private String schema; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.catalog = model.catalog;
                this.env = model.env;
                this.extProperties = model.extProperties;
                this.guid = model.guid;
                this.metadataType = model.metadataType;
                this.name = model.name;
                this.parentGuid = model.parentGuid;
                this.referenceType = model.referenceType;
                this.schema = model.schema;
            } 

            /**
             * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV, PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The extended properties.</p>
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300000001.project1.table1.column1</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The asset type. Set this parameter based on the actual scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>COLUMN</p>
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
                return this;
            }

            /**
             * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The GUID of the parent asset. If the current object is a field, parentGuid is the GUID of the table to which the field belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300000001.project1.table1</p>
             */
            public Builder parentGuid(String parentGuid) {
                this.parentGuid = parentGuid;
                return this;
            }

            /**
             * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_GUID, BY_PROPERTY</p>
             */
            public Builder referenceType(String referenceType) {
                this.referenceType = referenceType;
                return this;
            }

            /**
             * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>project1, bizUnit1</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>AddRegisterLineageRequest</p>
     */
    public static class DetailedLineages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDirect")
        private Boolean isDirect;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private Source source;

        @com.aliyun.core.annotation.NameInMap("Target")
        @com.aliyun.core.annotation.Validation(required = true)
        private Target target;

        private DetailedLineages(Builder builder) {
            this.isDirect = builder.isDirect;
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailedLineages create() {
            return builder().build();
        }

        /**
         * @return isDirect
         */
        public Boolean getIsDirect() {
            return this.isDirect;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Boolean isDirect; 
            private Source source; 
            private Target target; 

            private Builder() {
            } 

            private Builder(DetailedLineages model) {
                this.isDirect = model.isDirect;
                this.source = model.source;
                this.target = model.target;
            } 

            /**
             * <p>Specifies whether this is a direct lineage relationship. Default value: true.</p>
             */
            public Builder isDirect(Boolean isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * <p>The source asset reference.</p>
             * <p>This parameter is required.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The target asset reference.</p>
             * <p>This parameter is required.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public DetailedLineages build() {
                return new DetailedLineages(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>AddRegisterLineageRequest</p>
     */
    public static class AddRegisterLineageCommandSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ExtProperties")
        private java.util.Map<String, ?> extProperties;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("MetadataSubType")
        private String metadataSubType;

        @com.aliyun.core.annotation.NameInMap("MetadataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metadataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReferenceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String referenceType;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private AddRegisterLineageCommandSource(Builder builder) {
            this.catalog = builder.catalog;
            this.env = builder.env;
            this.extProperties = builder.extProperties;
            this.guid = builder.guid;
            this.metadataSubType = builder.metadataSubType;
            this.metadataType = builder.metadataType;
            this.name = builder.name;
            this.referenceType = builder.referenceType;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddRegisterLineageCommandSource create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return extProperties
         */
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return metadataSubType
         */
        public String getMetadataSubType() {
            return this.metadataSubType;
        }

        /**
         * @return metadataType
         */
        public String getMetadataType() {
            return this.metadataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return referenceType
         */
        public String getReferenceType() {
            return this.referenceType;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String catalog; 
            private String env; 
            private java.util.Map<String, ?> extProperties; 
            private String guid; 
            private String metadataSubType; 
            private String metadataType; 
            private String name; 
            private String referenceType; 
            private String schema; 

            private Builder() {
            } 

            private Builder(AddRegisterLineageCommandSource model) {
                this.catalog = model.catalog;
                this.env = model.env;
                this.extProperties = model.extProperties;
                this.guid = model.guid;
                this.metadataSubType = model.metadataSubType;
                this.metadataType = model.metadataType;
                this.name = model.name;
                this.referenceType = model.referenceType;
                this.schema = model.schema;
            } 

            /**
             * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV, PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The extended properties.</p>
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300000001.project1.table1</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The asset subtype. Specify this parameter only when metadataType is set to TABLE and referenceType is not set to BY_GUID.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT, SUM_BIZ_UNIT</p>
             */
            public Builder metadataSubType(String metadataSubType) {
                this.metadataSubType = metadataSubType;
                return this;
            }

            /**
             * <p>The asset type. Set this parameter based on the actual scenario.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
                return this;
            }

            /**
             * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>table1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_GUID, BY_PROPERTY</p>
             */
            public Builder referenceType(String referenceType) {
                this.referenceType = referenceType;
                return this;
            }

            /**
             * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>project1, bizUnit1</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public AddRegisterLineageCommandSource build() {
                return new AddRegisterLineageCommandSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>AddRegisterLineageRequest</p>
     */
    public static class AddRegisterLineageCommandTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ExtProperties")
        private java.util.Map<String, ?> extProperties;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("MetadataSubType")
        private String metadataSubType;

        @com.aliyun.core.annotation.NameInMap("MetadataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metadataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReferenceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String referenceType;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private AddRegisterLineageCommandTarget(Builder builder) {
            this.catalog = builder.catalog;
            this.env = builder.env;
            this.extProperties = builder.extProperties;
            this.guid = builder.guid;
            this.metadataSubType = builder.metadataSubType;
            this.metadataType = builder.metadataType;
            this.name = builder.name;
            this.referenceType = builder.referenceType;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddRegisterLineageCommandTarget create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return extProperties
         */
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return metadataSubType
         */
        public String getMetadataSubType() {
            return this.metadataSubType;
        }

        /**
         * @return metadataType
         */
        public String getMetadataType() {
            return this.metadataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return referenceType
         */
        public String getReferenceType() {
            return this.referenceType;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String catalog; 
            private String env; 
            private java.util.Map<String, ?> extProperties; 
            private String guid; 
            private String metadataSubType; 
            private String metadataType; 
            private String name; 
            private String referenceType; 
            private String schema; 

            private Builder() {
            } 

            private Builder(AddRegisterLineageCommandTarget model) {
                this.catalog = model.catalog;
                this.env = model.env;
                this.extProperties = model.extProperties;
                this.guid = model.guid;
                this.metadataSubType = model.metadataSubType;
                this.metadataType = model.metadataType;
                this.name = model.name;
                this.referenceType = model.referenceType;
                this.schema = model.schema;
            } 

            /**
             * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV, PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The extended properties.</p>
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300000001.project1.table1</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The asset subtype. Specify this parameter only when metadataType is set to TABLE and referenceType is not set to BY_GUID.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT, SUM_BIZ_UNIT</p>
             */
            public Builder metadataSubType(String metadataSubType) {
                this.metadataSubType = metadataSubType;
                return this;
            }

            /**
             * <p>The asset type. Set this parameter based on the actual scenario.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
                return this;
            }

            /**
             * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>table1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BY_GUID, BY_PROPERTY</p>
             */
            public Builder referenceType(String referenceType) {
                this.referenceType = referenceType;
                return this;
            }

            /**
             * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>project1, bizUnit1</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public AddRegisterLineageCommandTarget build() {
                return new AddRegisterLineageCommandTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>AddRegisterLineageRequest</p>
     */
    public static class AddRegisterLineageCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckAssetExist")
        private Boolean checkAssetExist;

        @com.aliyun.core.annotation.NameInMap("DetailedLineages")
        private java.util.List<DetailedLineages> detailedLineages;

        @com.aliyun.core.annotation.NameInMap("RelationProperties")
        private java.util.Map<String, ?> relationProperties;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private AddRegisterLineageCommandSource source;

        @com.aliyun.core.annotation.NameInMap("Target")
        @com.aliyun.core.annotation.Validation(required = true)
        private AddRegisterLineageCommandTarget target;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AddRegisterLineageCommand(Builder builder) {
            this.checkAssetExist = builder.checkAssetExist;
            this.detailedLineages = builder.detailedLineages;
            this.relationProperties = builder.relationProperties;
            this.source = builder.source;
            this.target = builder.target;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddRegisterLineageCommand create() {
            return builder().build();
        }

        /**
         * @return checkAssetExist
         */
        public Boolean getCheckAssetExist() {
            return this.checkAssetExist;
        }

        /**
         * @return detailedLineages
         */
        public java.util.List<DetailedLineages> getDetailedLineages() {
            return this.detailedLineages;
        }

        /**
         * @return relationProperties
         */
        public java.util.Map<String, ?> getRelationProperties() {
            return this.relationProperties;
        }

        /**
         * @return source
         */
        public AddRegisterLineageCommandSource getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public AddRegisterLineageCommandTarget getTarget() {
            return this.target;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean checkAssetExist; 
            private java.util.List<DetailedLineages> detailedLineages; 
            private java.util.Map<String, ?> relationProperties; 
            private AddRegisterLineageCommandSource source; 
            private AddRegisterLineageCommandTarget target; 
            private Long tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AddRegisterLineageCommand model) {
                this.checkAssetExist = model.checkAssetExist;
                this.detailedLineages = model.detailedLineages;
                this.relationProperties = model.relationProperties;
                this.source = model.source;
                this.target = model.target;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * <p>Specifies whether to check the existence of the asset. By default, the existence is not checked.</p>
             */
            public Builder checkAssetExist(Boolean checkAssetExist) {
                this.checkAssetExist = checkAssetExist;
                return this;
            }

            /**
             * <p>The detailed lineage relationships. For tables, these are field-level lineage relationships. If you do not want to add field-level lineage, leave this parameter empty.</p>
             */
            public Builder detailedLineages(java.util.List<DetailedLineages> detailedLineages) {
                this.detailedLineages = detailedLineages;
                return this;
            }

            /**
             * <p>The lineage relationship properties.</p>
             */
            public Builder relationProperties(java.util.Map<String, ?> relationProperties) {
                this.relationProperties = relationProperties;
                return this;
            }

            /**
             * <p>The source asset.</p>
             * <p>This parameter is required.</p>
             */
            public Builder source(AddRegisterLineageCommandSource source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The target asset.</p>
             * <p>This parameter is required.</p>
             */
            public Builder target(AddRegisterLineageCommandTarget target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300001234</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the current user.</p>
             * 
             * <strong>example:</strong>
             * <p>300004567</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AddRegisterLineageCommand build() {
                return new AddRegisterLineageCommand(this);
            } 

        } 

    }
}
