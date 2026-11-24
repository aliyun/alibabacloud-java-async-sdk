// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateNormalizationSchemaRequest} extends {@link RequestModel}
 *
 * <p>CreateNormalizationSchemaRequest</p>
 */
public class CreateNormalizationSchemaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
    private String normalizationCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationFieldSource")
    private String normalizationFieldSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationFields")
    private java.util.List<NormalizationFields> normalizationFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaDescription")
    private String normalizationSchemaDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String normalizationSchemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String normalizationSchemaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
    private String normalizationSecurityDomainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLogStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLogStore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorId")
    private String vendorId;

    private CreateNormalizationSchemaRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.normalizationCategoryId = builder.normalizationCategoryId;
        this.normalizationFieldSource = builder.normalizationFieldSource;
        this.normalizationFields = builder.normalizationFields;
        this.normalizationSchemaDescription = builder.normalizationSchemaDescription;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.normalizationSchemaName = builder.normalizationSchemaName;
        this.normalizationSchemaType = builder.normalizationSchemaType;
        this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.targetLogStore = builder.targetLogStore;
        this.vendorId = builder.vendorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNormalizationSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return normalizationCategoryId
     */
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    /**
     * @return normalizationFieldSource
     */
    public String getNormalizationFieldSource() {
        return this.normalizationFieldSource;
    }

    /**
     * @return normalizationFields
     */
    public java.util.List<NormalizationFields> getNormalizationFields() {
        return this.normalizationFields;
    }

    /**
     * @return normalizationSchemaDescription
     */
    public String getNormalizationSchemaDescription() {
        return this.normalizationSchemaDescription;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    /**
     * @return normalizationSchemaName
     */
    public String getNormalizationSchemaName() {
        return this.normalizationSchemaName;
    }

    /**
     * @return normalizationSchemaType
     */
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    /**
     * @return normalizationSecurityDomainId
     */
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return targetLogStore
     */
    public String getTargetLogStore() {
        return this.targetLogStore;
    }

    /**
     * @return vendorId
     */
    public String getVendorId() {
        return this.vendorId;
    }

    public static final class Builder extends Request.Builder<CreateNormalizationSchemaRequest, Builder> {
        private String lang; 
        private String normalizationCategoryId; 
        private String normalizationFieldSource; 
        private java.util.List<NormalizationFields> normalizationFields; 
        private String normalizationSchemaDescription; 
        private String normalizationSchemaId; 
        private String normalizationSchemaName; 
        private String normalizationSchemaType; 
        private String normalizationSecurityDomainId; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 
        private String targetLogStore; 
        private String vendorId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNormalizationSchemaRequest request) {
            super(request);
            this.lang = request.lang;
            this.normalizationCategoryId = request.normalizationCategoryId;
            this.normalizationFieldSource = request.normalizationFieldSource;
            this.normalizationFields = request.normalizationFields;
            this.normalizationSchemaDescription = request.normalizationSchemaDescription;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.normalizationSchemaName = request.normalizationSchemaName;
            this.normalizationSchemaType = request.normalizationSchemaType;
            this.normalizationSecurityDomainId = request.normalizationSecurityDomainId;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.targetLogStore = request.targetLogStore;
            this.vendorId = request.vendorId;
        } 

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error &quot;The specified Lang can not be empty.&quot;. Explicitly pass the language code.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the normalization category.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        public Builder normalizationCategoryId(String normalizationCategoryId) {
            this.putBodyParameter("NormalizationCategoryId", normalizationCategoryId);
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }

        /**
         * <p>The source of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>native</p>
         */
        public Builder normalizationFieldSource(String normalizationFieldSource) {
            this.putBodyParameter("NormalizationFieldSource", normalizationFieldSource);
            this.normalizationFieldSource = normalizationFieldSource;
            return this;
        }

        /**
         * <p>The normalization fields.</p>
         */
        public Builder normalizationFields(java.util.List<NormalizationFields> normalizationFields) {
            this.putBodyParameter("NormalizationFields", normalizationFields);
            this.normalizationFields = normalizationFields;
            return this;
        }

        /**
         * <p>The description of the normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>ProcessQuery</p>
         */
        public Builder normalizationSchemaDescription(String normalizationSchemaDescription) {
            this.putBodyParameter("NormalizationSchemaDescription", normalizationSchemaDescription);
            this.normalizationSchemaDescription = normalizationSchemaDescription;
            return this;
        }

        /**
         * <p>The ID of the normalization schema. When you create a custom schema, the ID must start with custom- and can contain only lowercase letters, digits, and hyphens. Example: custom-my-log-schema.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESS_QUERY_DNS_ACTIVITY</p>
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * <p>The name of the normalization schema.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProcessQuery</p>
         */
        public Builder normalizationSchemaName(String normalizationSchemaName) {
            this.putBodyParameter("NormalizationSchemaName", normalizationSchemaName);
            this.normalizationSchemaName = normalizationSchemaName;
            return this;
        }

        /**
         * <p>The type of the normalization schema. Valid values:</p>
         * <ul>
         * <li>log: Log.</li>
         * <li>entity: Entity.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        public Builder normalizationSchemaType(String normalizationSchemaType) {
            this.putBodyParameter("NormalizationSchemaType", normalizationSchemaType);
            this.normalizationSchemaType = normalizationSchemaType;
            return this;
        }

        /**
         * <p>The ID of the security domain.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_AND_WEB_SECURITY</p>
         */
        public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.putBodyParameter("NormalizationSecurityDomainId", normalizationSecurityDomainId);
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }

        /**
         * <p>The ID of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region where the data management center of Threat Analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland and Hong Kong (China).</li>
         * <li>ap-southeast-1: Assets are located in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user whose perspective the administrator switches to.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The Logstore of Simple Log Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-activity</p>
         */
        public Builder targetLogStore(String targetLogStore) {
            this.putBodyParameter("TargetLogStore", targetLogStore);
            this.targetLogStore = targetLogStore;
            return this;
        }

        /**
         * <p>The ID of the vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        public Builder vendorId(String vendorId) {
            this.putBodyParameter("VendorId", vendorId);
            this.vendorId = vendorId;
            return this;
        }

        @Override
        public CreateNormalizationSchemaRequest build() {
            return new CreateNormalizationSchemaRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNormalizationSchemaRequest} extends {@link TeaModel}
     *
     * <p>CreateNormalizationSchemaRequest</p>
     */
    public static class NormalizationFieldJsonKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationFieldDescription")
        private String normalizationFieldDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldExample")
        private String normalizationFieldExample;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldFrom")
        private String normalizationFieldFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldTokenize")
        private Boolean normalizationFieldTokenize;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldType;

        private NormalizationFieldJsonKeys(Builder builder) {
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldFrom = builder.normalizationFieldFrom;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.normalizationFieldTokenize = builder.normalizationFieldTokenize;
            this.normalizationFieldType = builder.normalizationFieldType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFieldJsonKeys create() {
            return builder().build();
        }

        /**
         * @return normalizationFieldDescription
         */
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        /**
         * @return normalizationFieldExample
         */
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        /**
         * @return normalizationFieldFrom
         */
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        /**
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        /**
         * @return normalizationFieldRequired
         */
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        /**
         * @return normalizationFieldTokenize
         */
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        /**
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public static final class Builder {
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldFrom; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Boolean normalizationFieldTokenize; 
            private String normalizationFieldType; 

            private Builder() {
            } 

            private Builder(NormalizationFieldJsonKeys model) {
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldFrom = model.normalizationFieldFrom;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.normalizationFieldTokenize = model.normalizationFieldTokenize;
                this.normalizationFieldType = model.normalizationFieldType;
            } 

            /**
             * <p>The description of the key for the JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>The alert severity levels are represented by the values 1, 2, 3, and 4.</p>
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * <p>The example of the key for the JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>1, 2, 3, 4</p>
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * <p>The source of the key for the JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * <p>The name of the key for the JSON normalization field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>alert_level</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * <p>Specifies whether the key for the JSON normalization field is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * <p>Specifies whether the key for the JSON normalization field is tokenized.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * <p>The type of the key for the JSON normalization field. Valid values: text, long, double, and json.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            public NormalizationFieldJsonKeys build() {
                return new NormalizationFieldJsonKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNormalizationSchemaRequest} extends {@link TeaModel}
     *
     * <p>CreateNormalizationSchemaRequest</p>
     */
    public static class NormalizationFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationFieldDescription")
        private String normalizationFieldDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldExample")
        private String normalizationFieldExample;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldFrom")
        private String normalizationFieldFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldJsonIndexAll")
        private Boolean normalizationFieldJsonIndexAll;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldJsonKeys")
        private java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequirement")
        private Boolean normalizationFieldRequirement;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldReserved")
        private Boolean normalizationFieldReserved;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldTokenize")
        private Boolean normalizationFieldTokenize;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldType;

        private NormalizationFields(Builder builder) {
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldFrom = builder.normalizationFieldFrom;
            this.normalizationFieldJsonIndexAll = builder.normalizationFieldJsonIndexAll;
            this.normalizationFieldJsonKeys = builder.normalizationFieldJsonKeys;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.normalizationFieldRequirement = builder.normalizationFieldRequirement;
            this.normalizationFieldReserved = builder.normalizationFieldReserved;
            this.normalizationFieldTokenize = builder.normalizationFieldTokenize;
            this.normalizationFieldType = builder.normalizationFieldType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFields create() {
            return builder().build();
        }

        /**
         * @return normalizationFieldDescription
         */
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        /**
         * @return normalizationFieldExample
         */
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        /**
         * @return normalizationFieldFrom
         */
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        /**
         * @return normalizationFieldJsonIndexAll
         */
        public Boolean getNormalizationFieldJsonIndexAll() {
            return this.normalizationFieldJsonIndexAll;
        }

        /**
         * @return normalizationFieldJsonKeys
         */
        public java.util.List<NormalizationFieldJsonKeys> getNormalizationFieldJsonKeys() {
            return this.normalizationFieldJsonKeys;
        }

        /**
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        /**
         * @return normalizationFieldRequired
         */
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        /**
         * @return normalizationFieldRequirement
         */
        public Boolean getNormalizationFieldRequirement() {
            return this.normalizationFieldRequirement;
        }

        /**
         * @return normalizationFieldReserved
         */
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        /**
         * @return normalizationFieldTokenize
         */
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        /**
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public static final class Builder {
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldFrom; 
            private Boolean normalizationFieldJsonIndexAll; 
            private java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Boolean normalizationFieldRequirement; 
            private Boolean normalizationFieldReserved; 
            private Boolean normalizationFieldTokenize; 
            private String normalizationFieldType; 

            private Builder() {
            } 

            private Builder(NormalizationFields model) {
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldFrom = model.normalizationFieldFrom;
                this.normalizationFieldJsonIndexAll = model.normalizationFieldJsonIndexAll;
                this.normalizationFieldJsonKeys = model.normalizationFieldJsonKeys;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.normalizationFieldRequirement = model.normalizationFieldRequirement;
                this.normalizationFieldReserved = model.normalizationFieldReserved;
                this.normalizationFieldTokenize = model.normalizationFieldTokenize;
                this.normalizationFieldType = model.normalizationFieldType;
            } 

            /**
             * <p>The description of the normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_user</p>
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * <p>The example of the normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>173326*******</p>
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * <p>The source of the key for the JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * <p>Specifies whether to create indexes for all keys of the JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
                this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
                return this;
            }

            /**
             * <p>The list of keys for the JSON normalization field.</p>
             */
            public Builder normalizationFieldJsonKeys(java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
                this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
                return this;
            }

            /**
             * <p>The name of the normalization field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_user</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * <p>Specifies whether the normalization field is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * <p>Specifies whether the normalization field is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldRequirement(Boolean normalizationFieldRequirement) {
                this.normalizationFieldRequirement = normalizationFieldRequirement;
                return this;
            }

            /**
             * <p>Specifies whether the normalization field is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldReserved(Boolean normalizationFieldReserved) {
                this.normalizationFieldReserved = normalizationFieldReserved;
                return this;
            }

            /**
             * <p>Specifies whether the normalization field is tokenized.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * <p>The type of the normalization field. Valid values: text, long, double, and json.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            public NormalizationFields build() {
                return new NormalizationFields(this);
            } 

        } 

    }
}
