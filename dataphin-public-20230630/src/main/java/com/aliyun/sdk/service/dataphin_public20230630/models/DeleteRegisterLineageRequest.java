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
 * {@link DeleteRegisterLineageRequest} extends {@link RequestModel}
 *
 * <p>DeleteRegisterLineageRequest</p>
 */
public class DeleteRegisterLineageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteRegisterLineageCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteRegisterLineageCommand deleteRegisterLineageCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private DeleteRegisterLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteRegisterLineageCommand = builder.deleteRegisterLineageCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRegisterLineageRequest create() {
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
     * @return deleteRegisterLineageCommand
     */
    public DeleteRegisterLineageCommand getDeleteRegisterLineageCommand() {
        return this.deleteRegisterLineageCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<DeleteRegisterLineageRequest, Builder> {
        private String regionId; 
        private DeleteRegisterLineageCommand deleteRegisterLineageCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRegisterLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteRegisterLineageCommand = request.deleteRegisterLineageCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder deleteRegisterLineageCommand(DeleteRegisterLineageCommand deleteRegisterLineageCommand) {
            String deleteRegisterLineageCommandShrink = shrink(deleteRegisterLineageCommand, "DeleteRegisterLineageCommand", "json");
            this.putBodyParameter("DeleteRegisterLineageCommand", deleteRegisterLineageCommandShrink);
            this.deleteRegisterLineageCommand = deleteRegisterLineageCommand;
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

        @Override
        public DeleteRegisterLineageRequest build() {
            return new DeleteRegisterLineageRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>DeleteRegisterLineageRequest</p>
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * ExtProperties.
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * MetadataType.
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
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
             * ParentGuid.
             */
            public Builder parentGuid(String parentGuid) {
                this.parentGuid = parentGuid;
                return this;
            }

            /**
             * ReferenceType.
             */
            public Builder referenceType(String referenceType) {
                this.referenceType = referenceType;
                return this;
            }

            /**
             * Schema.
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
     * {@link DeleteRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>DeleteRegisterLineageRequest</p>
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * ExtProperties.
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * MetadataType.
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
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
             * ParentGuid.
             */
            public Builder parentGuid(String parentGuid) {
                this.parentGuid = parentGuid;
                return this;
            }

            /**
             * ReferenceType.
             */
            public Builder referenceType(String referenceType) {
                this.referenceType = referenceType;
                return this;
            }

            /**
             * Schema.
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
     * {@link DeleteRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>DeleteRegisterLineageRequest</p>
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
             * IsDirect.
             */
            public Builder isDirect(Boolean isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
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
     * {@link DeleteRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>DeleteRegisterLineageRequest</p>
     */
    public static class DeleteRegisterLineageCommandSource extends TeaModel {
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

        private DeleteRegisterLineageCommandSource(Builder builder) {
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

        public static DeleteRegisterLineageCommandSource create() {
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

            private Builder(DeleteRegisterLineageCommandSource model) {
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * ExtProperties.
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * MetadataSubType.
             */
            public Builder metadataSubType(String metadataSubType) {
                this.metadataSubType = metadataSubType;
                return this;
            }

            /**
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
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
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public DeleteRegisterLineageCommandSource build() {
                return new DeleteRegisterLineageCommandSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>DeleteRegisterLineageRequest</p>
     */
    public static class DeleteRegisterLineageCommandTarget extends TeaModel {
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

        private DeleteRegisterLineageCommandTarget(Builder builder) {
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

        public static DeleteRegisterLineageCommandTarget create() {
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

            private Builder(DeleteRegisterLineageCommandTarget model) {
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * ExtProperties.
             */
            public Builder extProperties(java.util.Map<String, ?> extProperties) {
                this.extProperties = extProperties;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * MetadataSubType.
             */
            public Builder metadataSubType(String metadataSubType) {
                this.metadataSubType = metadataSubType;
                return this;
            }

            /**
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
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
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public DeleteRegisterLineageCommandTarget build() {
                return new DeleteRegisterLineageCommandTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteRegisterLineageRequest} extends {@link TeaModel}
     *
     * <p>DeleteRegisterLineageRequest</p>
     */
    public static class DeleteRegisterLineageCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CascadeDeleteLineage")
        private Boolean cascadeDeleteLineage;

        @com.aliyun.core.annotation.NameInMap("DetailedLineages")
        private java.util.List<DetailedLineages> detailedLineages;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private DeleteRegisterLineageCommandSource source;

        @com.aliyun.core.annotation.NameInMap("Target")
        @com.aliyun.core.annotation.Validation(required = true)
        private DeleteRegisterLineageCommandTarget target;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private DeleteRegisterLineageCommand(Builder builder) {
            this.cascadeDeleteLineage = builder.cascadeDeleteLineage;
            this.detailedLineages = builder.detailedLineages;
            this.source = builder.source;
            this.target = builder.target;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteRegisterLineageCommand create() {
            return builder().build();
        }

        /**
         * @return cascadeDeleteLineage
         */
        public Boolean getCascadeDeleteLineage() {
            return this.cascadeDeleteLineage;
        }

        /**
         * @return detailedLineages
         */
        public java.util.List<DetailedLineages> getDetailedLineages() {
            return this.detailedLineages;
        }

        /**
         * @return source
         */
        public DeleteRegisterLineageCommandSource getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public DeleteRegisterLineageCommandTarget getTarget() {
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
            private Boolean cascadeDeleteLineage; 
            private java.util.List<DetailedLineages> detailedLineages; 
            private DeleteRegisterLineageCommandSource source; 
            private DeleteRegisterLineageCommandTarget target; 
            private Long tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DeleteRegisterLineageCommand model) {
                this.cascadeDeleteLineage = model.cascadeDeleteLineage;
                this.detailedLineages = model.detailedLineages;
                this.source = model.source;
                this.target = model.target;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * CascadeDeleteLineage.
             */
            public Builder cascadeDeleteLineage(Boolean cascadeDeleteLineage) {
                this.cascadeDeleteLineage = cascadeDeleteLineage;
                return this;
            }

            /**
             * DetailedLineages.
             */
            public Builder detailedLineages(java.util.List<DetailedLineages> detailedLineages) {
                this.detailedLineages = detailedLineages;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder source(DeleteRegisterLineageCommandSource source) {
                this.source = source;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder target(DeleteRegisterLineageCommandTarget target) {
                this.target = target;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DeleteRegisterLineageCommand build() {
                return new DeleteRegisterLineageCommand(this);
            } 

        } 

    }
}
