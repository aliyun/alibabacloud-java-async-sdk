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
    public static class NormalizationFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationFieldDescription")
        private String normalizationFieldDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldExample")
        private String normalizationFieldExample;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequirement")
        private Boolean normalizationFieldRequirement;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldReserved")
        private Boolean normalizationFieldReserved;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        private String normalizationFieldType;

        private NormalizationFields(Builder builder) {
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequirement = builder.normalizationFieldRequirement;
            this.normalizationFieldReserved = builder.normalizationFieldReserved;
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
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
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
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public static final class Builder {
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequirement; 
            private Boolean normalizationFieldReserved; 
            private String normalizationFieldType; 

            private Builder() {
            } 

            private Builder(NormalizationFields model) {
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequirement = model.normalizationFieldRequirement;
                this.normalizationFieldReserved = model.normalizationFieldReserved;
                this.normalizationFieldType = model.normalizationFieldType;
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
             * NormalizationFieldName.
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
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
             * NormalizationFieldType.
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

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaName")
        private String normalizationSchemaName;

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
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.normalizationSchemaName = builder.normalizationSchemaName;
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
            private String normalizationSchemaId; 
            private String normalizationSchemaName; 
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
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.normalizationSchemaName = model.normalizationSchemaName;
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
