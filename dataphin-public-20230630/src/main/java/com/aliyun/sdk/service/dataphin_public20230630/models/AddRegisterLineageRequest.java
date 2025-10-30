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

    private AddRegisterLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addRegisterLineageCommand = builder.addRegisterLineageCommand;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<AddRegisterLineageRequest, Builder> {
        private String regionId; 
        private AddRegisterLineageCommand addRegisterLineageCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(AddRegisterLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addRegisterLineageCommand = request.addRegisterLineageCommand;
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
        public Builder addRegisterLineageCommand(AddRegisterLineageCommand addRegisterLineageCommand) {
            String addRegisterLineageCommandShrink = shrink(addRegisterLineageCommand, "AddRegisterLineageCommand", "json");
            this.putBodyParameter("AddRegisterLineageCommand", addRegisterLineageCommandShrink);
            this.addRegisterLineageCommand = addRegisterLineageCommand;
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
             * CheckAssetExist.
             */
            public Builder checkAssetExist(Boolean checkAssetExist) {
                this.checkAssetExist = checkAssetExist;
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
             * RelationProperties.
             */
            public Builder relationProperties(java.util.Map<String, ?> relationProperties) {
                this.relationProperties = relationProperties;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder source(AddRegisterLineageCommandSource source) {
                this.source = source;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder target(AddRegisterLineageCommandTarget target) {
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

            public AddRegisterLineageCommand build() {
                return new AddRegisterLineageCommand(this);
            } 

        } 

    }
}
