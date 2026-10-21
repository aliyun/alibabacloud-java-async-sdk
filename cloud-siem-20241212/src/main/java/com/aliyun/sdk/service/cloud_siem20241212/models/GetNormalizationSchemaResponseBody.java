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
 * {@link GetNormalizationSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetNormalizationSchemaResponseBody</p>
 */
public class GetNormalizationSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NormalizationSchema")
    private NormalizationSchema normalizationSchema;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNormalizationSchemaResponseBody(Builder builder) {
        this.normalizationSchema = builder.normalizationSchema;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNormalizationSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return normalizationSchema
     */
    public NormalizationSchema getNormalizationSchema() {
        return this.normalizationSchema;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NormalizationSchema normalizationSchema; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNormalizationSchemaResponseBody model) {
            this.normalizationSchema = model.normalizationSchema;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The normalization schema.</p>
         */
        public Builder normalizationSchema(NormalizationSchema normalizationSchema) {
            this.normalizationSchema = normalizationSchema;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNormalizationSchemaResponseBody build() {
            return new GetNormalizationSchemaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNormalizationSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetNormalizationSchemaResponseBody</p>
     */
    public static class NormalizationFieldJsonKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldDescription")
        private String normalizationFieldDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldExample")
        private String normalizationFieldExample;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldFrom")
        private String normalizationFieldFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldReserved")
        private Boolean normalizationFieldReserved;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldTokenize")
        private Boolean normalizationFieldTokenize;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        private String normalizationFieldType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private NormalizationFieldJsonKeys(Builder builder) {
            this.createTime = builder.createTime;
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldFrom = builder.normalizationFieldFrom;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.normalizationFieldReserved = builder.normalizationFieldReserved;
            this.normalizationFieldTokenize = builder.normalizationFieldTokenize;
            this.normalizationFieldType = builder.normalizationFieldType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFieldJsonKeys create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldFrom; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Boolean normalizationFieldReserved; 
            private Boolean normalizationFieldTokenize; 
            private String normalizationFieldType; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(NormalizationFieldJsonKeys model) {
                this.createTime = model.createTime;
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldFrom = model.normalizationFieldFrom;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.normalizationFieldReserved = model.normalizationFieldReserved;
                this.normalizationFieldTokenize = model.normalizationFieldTokenize;
                this.normalizationFieldType = model.normalizationFieldType;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1736386610000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the key for a JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud Provider Code</p>
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * <p>The example of the key for a JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * <p>The source of the key for a JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * <p>The name of the key for a JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_code</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * <p>Specifies whether the key of a JSON normalization field is required.</p>
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * <p>Specifies whether the normalization field name is a system built-in name.</p>
             */
            public Builder normalizationFieldReserved(Boolean normalizationFieldReserved) {
                this.normalizationFieldReserved = normalizationFieldReserved;
                return this;
            }

            /**
             * <p>Specifies whether the key of a JSON normalization field is tokenized.</p>
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * <p>The type of the key for a JSON normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1736386610000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public NormalizationFieldJsonKeys build() {
                return new NormalizationFieldJsonKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNormalizationSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetNormalizationSchemaResponseBody</p>
     */
    public static class NormalizationFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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
        private String normalizationFieldType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private NormalizationFields(Builder builder) {
            this.createTime = builder.createTime;
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
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFields create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
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
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(NormalizationFields model) {
                this.createTime = model.createTime;
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
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1736386610000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
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
             * <p>The source of the normalization field. Valid values:</p>
             * <ul>
             * <li>preset: built-in.</li>
             * <li>custom: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * <p>Specifies whether indexes are created for all keys of a JSON normalization field.</p>
             */
            public Builder normalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
                this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
                return this;
            }

            /**
             * <p>The list of keys for a JSON normalization field.</p>
             */
            public Builder normalizationFieldJsonKeys(java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
                this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
                return this;
            }

            /**
             * <p>The name of the normalization field.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_user</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * <p>Specifies whether the field is required.</p>
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
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * <p>The type of the normalization field. Valid values:</p>
             * <ul>
             * <li>varchar</li>
             * <li>bigint</li>
             * <li>double</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1736386610000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public NormalizationFields build() {
                return new NormalizationFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNormalizationSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetNormalizationSchemaResponseBody</p>
     */
    public static class NormalizationSchemaReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
        private String normalizationRuleId;

        private NormalizationSchemaReferences(Builder builder) {
            this.normalizationRuleId = builder.normalizationRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationSchemaReferences create() {
            return builder().build();
        }

        /**
         * @return normalizationRuleId
         */
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public static final class Builder {
            private String normalizationRuleId; 

            private Builder() {
            } 

            private Builder(NormalizationSchemaReferences model) {
                this.normalizationRuleId = model.normalizationRuleId;
            } 

            /**
             * <p>The ID of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_cfw_flow_rule</p>
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            public NormalizationSchemaReferences build() {
                return new NormalizationSchemaReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNormalizationSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetNormalizationSchemaResponseBody</p>
     */
    public static class NormalizationSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldSource")
        private String normalizationFieldSource;

        @com.aliyun.core.annotation.NameInMap("NormalizationFields")
        private java.util.List<NormalizationFields> normalizationFields;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaDescription")
        private String normalizationSchemaDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaFrom")
        private String normalizationSchemaFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaName")
        private String normalizationSchemaName;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaReferences")
        private java.util.List<NormalizationSchemaReferences> normalizationSchemaReferences;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaType")
        private String normalizationSchemaType;

        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
        private String normalizationSecurityDomainId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RecommendEntities")
        private java.util.List<String> recommendEntities;

        @com.aliyun.core.annotation.NameInMap("TargetLogStore")
        private String targetLogStore;

        @com.aliyun.core.annotation.NameInMap("TargetStoreView")
        private String targetStoreView;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private NormalizationSchema(Builder builder) {
            this.createTime = builder.createTime;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationFieldSource = builder.normalizationFieldSource;
            this.normalizationFields = builder.normalizationFields;
            this.normalizationSchemaDescription = builder.normalizationSchemaDescription;
            this.normalizationSchemaFrom = builder.normalizationSchemaFrom;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.normalizationSchemaName = builder.normalizationSchemaName;
            this.normalizationSchemaReferences = builder.normalizationSchemaReferences;
            this.normalizationSchemaType = builder.normalizationSchemaType;
            this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
            this.productId = builder.productId;
            this.recommendEntities = builder.recommendEntities;
            this.targetLogStore = builder.targetLogStore;
            this.targetStoreView = builder.targetStoreView;
            this.updateTime = builder.updateTime;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationSchema create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return normalizationSchemaFrom
         */
        public String getNormalizationSchemaFrom() {
            return this.normalizationSchemaFrom;
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
         * @return normalizationSchemaReferences
         */
        public java.util.List<NormalizationSchemaReferences> getNormalizationSchemaReferences() {
            return this.normalizationSchemaReferences;
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
         * @return recommendEntities
         */
        public java.util.List<String> getRecommendEntities() {
            return this.recommendEntities;
        }

        /**
         * @return targetLogStore
         */
        public String getTargetLogStore() {
            return this.targetLogStore;
        }

        /**
         * @return targetStoreView
         */
        public String getTargetStoreView() {
            return this.targetStoreView;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        public static final class Builder {
            private Long createTime; 
            private String normalizationCategoryId; 
            private String normalizationFieldSource; 
            private java.util.List<NormalizationFields> normalizationFields; 
            private String normalizationSchemaDescription; 
            private String normalizationSchemaFrom; 
            private String normalizationSchemaId; 
            private String normalizationSchemaName; 
            private java.util.List<NormalizationSchemaReferences> normalizationSchemaReferences; 
            private String normalizationSchemaType; 
            private String normalizationSecurityDomainId; 
            private String productId; 
            private java.util.List<String> recommendEntities; 
            private String targetLogStore; 
            private String targetStoreView; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationSchema model) {
                this.createTime = model.createTime;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationFieldSource = model.normalizationFieldSource;
                this.normalizationFields = model.normalizationFields;
                this.normalizationSchemaDescription = model.normalizationSchemaDescription;
                this.normalizationSchemaFrom = model.normalizationSchemaFrom;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.normalizationSchemaName = model.normalizationSchemaName;
                this.normalizationSchemaReferences = model.normalizationSchemaReferences;
                this.normalizationSchemaType = model.normalizationSchemaType;
                this.normalizationSecurityDomainId = model.normalizationSecurityDomainId;
                this.productId = model.productId;
                this.recommendEntities = model.recommendEntities;
                this.targetLogStore = model.targetLogStore;
                this.targetStoreView = model.targetStoreView;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the normalized rule category.</p>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_CATEGORY</p>
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
                return this;
            }

            /**
             * <p>The source of the field. Valid values: normalized: normalized field, native: native field.</p>
             * 
             * <strong>example:</strong>
             * <p>native</p>
             */
            public Builder normalizationFieldSource(String normalizationFieldSource) {
                this.normalizationFieldSource = normalizationFieldSource;
                return this;
            }

            /**
             * <p>The list of normalization fields.</p>
             */
            public Builder normalizationFields(java.util.List<NormalizationFields> normalizationFields) {
                this.normalizationFields = normalizationFields;
                return this;
            }

            /**
             * <p>The description of the normalization schema.</p>
             * 
             * <strong>example:</strong>
             * <p>Network 5-Tuple Logs</p>
             */
            public Builder normalizationSchemaDescription(String normalizationSchemaDescription) {
                this.normalizationSchemaDescription = normalizationSchemaDescription;
                return this;
            }

            /**
             * <p>The source of the normalization schema. Valid values:</p>
             * <ul>
             * <li>preset: predefined.</li>
             * <li>custom: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationSchemaFrom(String normalizationSchemaFrom) {
                this.normalizationSchemaFrom = normalizationSchemaFrom;
                return this;
            }

            /**
             * <p>The ID of the normalization schema.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP_ACTIVITY</p>
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            /**
             * <p>The name of the normalization schema.</p>
             * 
             * <strong>example:</strong>
             * <p>normalization_rule_Z57np</p>
             */
            public Builder normalizationSchemaName(String normalizationSchemaName) {
                this.normalizationSchemaName = normalizationSchemaName;
                return this;
            }

            /**
             * <p>The list of normalization schema references.</p>
             */
            public Builder normalizationSchemaReferences(java.util.List<NormalizationSchemaReferences> normalizationSchemaReferences) {
                this.normalizationSchemaReferences = normalizationSchemaReferences;
                return this;
            }

            /**
             * <p>The type of the normalization schema. Valid values:</p>
             * <ul>
             * <li>log</li>
             * <li>entity</li>
             * <li>incident</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>log</p>
             */
            public Builder normalizationSchemaType(String normalizationSchemaType) {
                this.normalizationSchemaType = normalizationSchemaType;
                return this;
            }

            /**
             * <p>The security domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_SECURITY</p>
             */
            public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
                this.normalizationSecurityDomainId = normalizationSecurityDomainId;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_bastionhost</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The list of recommended entities.</p>
             */
            public Builder recommendEntities(java.util.List<String> recommendEntities) {
                this.recommendEntities = recommendEntities;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>network-activity</p>
             */
            public Builder targetLogStore(String targetLogStore) {
                this.targetLogStore = targetLogStore;
                return this;
            }

            /**
             * <p>The Simple Log Service StoreView.</p>
             * 
             * <strong>example:</strong>
             * <p>network_activity</p>
             */
            public Builder targetStoreView(String targetStoreView) {
                this.targetStoreView = targetStoreView;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The vendor ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public NormalizationSchema build() {
                return new NormalizationSchema(this);
            } 

        } 

    }
}
