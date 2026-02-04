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
         * NormalizationSchema.
         */
        public Builder normalizationSchema(NormalizationSchema normalizationSchema) {
            this.normalizationSchema = normalizationSchema;
            return this;
        }

        /**
         * RequestId.
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NormalizationFieldDescription.
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * NormalizationFieldExample.
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * NormalizationFieldFrom.
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * NormalizationFieldName.
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * NormalizationFieldRequired.
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * NormalizationFieldReserved.
             */
            public Builder normalizationFieldReserved(Boolean normalizationFieldReserved) {
                this.normalizationFieldReserved = normalizationFieldReserved;
                return this;
            }

            /**
             * NormalizationFieldTokenize.
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * NormalizationFieldType.
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            /**
             * UpdateTime.
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NormalizationFieldDescription.
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * NormalizationFieldExample.
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * NormalizationFieldFrom.
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * NormalizationFieldJsonIndexAll.
             */
            public Builder normalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
                this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
                return this;
            }

            /**
             * NormalizationFieldJsonKeys.
             */
            public Builder normalizationFieldJsonKeys(java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
                this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
                return this;
            }

            /**
             * NormalizationFieldName.
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * NormalizationFieldRequired.
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * NormalizationFieldRequirement.
             */
            public Builder normalizationFieldRequirement(Boolean normalizationFieldRequirement) {
                this.normalizationFieldRequirement = normalizationFieldRequirement;
                return this;
            }

            /**
             * NormalizationFieldReserved.
             */
            public Builder normalizationFieldReserved(Boolean normalizationFieldReserved) {
                this.normalizationFieldReserved = normalizationFieldReserved;
                return this;
            }

            /**
             * NormalizationFieldTokenize.
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * NormalizationFieldType.
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            /**
             * UpdateTime.
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
             * NormalizationRuleId.
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

        @com.aliyun.core.annotation.NameInMap("TargetLogStore")
        private String targetLogStore;

        @com.aliyun.core.annotation.NameInMap("TargetStoreView")
        private String targetStoreView;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private NormalizationSchema(Builder builder) {
            this.createTime = builder.createTime;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationFields = builder.normalizationFields;
            this.normalizationSchemaDescription = builder.normalizationSchemaDescription;
            this.normalizationSchemaFrom = builder.normalizationSchemaFrom;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.normalizationSchemaName = builder.normalizationSchemaName;
            this.normalizationSchemaReferences = builder.normalizationSchemaReferences;
            this.normalizationSchemaType = builder.normalizationSchemaType;
            this.targetLogStore = builder.targetLogStore;
            this.targetStoreView = builder.targetStoreView;
            this.updateTime = builder.updateTime;
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

        public static final class Builder {
            private Long createTime; 
            private String normalizationCategoryId; 
            private java.util.List<NormalizationFields> normalizationFields; 
            private String normalizationSchemaDescription; 
            private String normalizationSchemaFrom; 
            private String normalizationSchemaId; 
            private String normalizationSchemaName; 
            private java.util.List<NormalizationSchemaReferences> normalizationSchemaReferences; 
            private String normalizationSchemaType; 
            private String targetLogStore; 
            private String targetStoreView; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(NormalizationSchema model) {
                this.createTime = model.createTime;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationFields = model.normalizationFields;
                this.normalizationSchemaDescription = model.normalizationSchemaDescription;
                this.normalizationSchemaFrom = model.normalizationSchemaFrom;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.normalizationSchemaName = model.normalizationSchemaName;
                this.normalizationSchemaReferences = model.normalizationSchemaReferences;
                this.normalizationSchemaType = model.normalizationSchemaType;
                this.targetLogStore = model.targetLogStore;
                this.targetStoreView = model.targetStoreView;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NormalizationCategoryId.
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
                return this;
            }

            /**
             * NormalizationFields.
             */
            public Builder normalizationFields(java.util.List<NormalizationFields> normalizationFields) {
                this.normalizationFields = normalizationFields;
                return this;
            }

            /**
             * NormalizationSchemaDescription.
             */
            public Builder normalizationSchemaDescription(String normalizationSchemaDescription) {
                this.normalizationSchemaDescription = normalizationSchemaDescription;
                return this;
            }

            /**
             * NormalizationSchemaFrom.
             */
            public Builder normalizationSchemaFrom(String normalizationSchemaFrom) {
                this.normalizationSchemaFrom = normalizationSchemaFrom;
                return this;
            }

            /**
             * NormalizationSchemaId.
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            /**
             * NormalizationSchemaName.
             */
            public Builder normalizationSchemaName(String normalizationSchemaName) {
                this.normalizationSchemaName = normalizationSchemaName;
                return this;
            }

            /**
             * NormalizationSchemaReferences.
             */
            public Builder normalizationSchemaReferences(java.util.List<NormalizationSchemaReferences> normalizationSchemaReferences) {
                this.normalizationSchemaReferences = normalizationSchemaReferences;
                return this;
            }

            /**
             * NormalizationSchemaType.
             */
            public Builder normalizationSchemaType(String normalizationSchemaType) {
                this.normalizationSchemaType = normalizationSchemaType;
                return this;
            }

            /**
             * TargetLogStore.
             */
            public Builder targetLogStore(String targetLogStore) {
                this.targetLogStore = targetLogStore;
                return this;
            }

            /**
             * TargetStoreView.
             */
            public Builder targetStoreView(String targetStoreView) {
                this.targetStoreView = targetStoreView;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public NormalizationSchema build() {
                return new NormalizationSchema(this);
            } 

        } 

    }
}
