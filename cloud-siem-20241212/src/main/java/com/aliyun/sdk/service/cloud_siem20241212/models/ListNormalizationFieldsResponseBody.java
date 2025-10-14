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
 * {@link ListNormalizationFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationFieldsResponseBody</p>
 */
public class ListNormalizationFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationFields")
    private java.util.List<NormalizationFields> normalizationFields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNormalizationFieldsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationFields = builder.normalizationFields;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationFieldsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return normalizationFields
     */
    public java.util.List<NormalizationFields> getNormalizationFields() {
        return this.normalizationFields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NormalizationFields> normalizationFields; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNormalizationFieldsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationFields = model.normalizationFields;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNormalizationFieldsResponseBody build() {
            return new ListNormalizationFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationFieldsResponseBody</p>
     */
    public static class NormalizationFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

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

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        private NormalizationFields(Builder builder) {
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequirement = builder.normalizationFieldRequirement;
            this.normalizationFieldReserved = builder.normalizationFieldReserved;
            this.normalizationFieldType = builder.normalizationFieldType;
            this.normalizationSchemaId = builder.normalizationSchemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFields create() {
            return builder().build();
        }

        /**
         * @return normalizationCategoryId
         */
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
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

        /**
         * @return normalizationSchemaId
         */
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public static final class Builder {
            private String normalizationCategoryId; 
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequirement; 
            private Boolean normalizationFieldReserved; 
            private String normalizationFieldType; 
            private String normalizationSchemaId; 

            private Builder() {
            } 

            private Builder(NormalizationFields model) {
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequirement = model.normalizationFieldRequirement;
                this.normalizationFieldReserved = model.normalizationFieldReserved;
                this.normalizationFieldType = model.normalizationFieldType;
                this.normalizationSchemaId = model.normalizationSchemaId;
            } 

            /**
             * NormalizationCategoryId.
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
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

            /**
             * NormalizationSchemaId.
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            public NormalizationFields build() {
                return new NormalizationFields(this);
            } 

        } 

    }
}
