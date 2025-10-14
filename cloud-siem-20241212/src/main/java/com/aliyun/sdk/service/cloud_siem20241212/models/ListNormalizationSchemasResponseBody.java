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
 * {@link ListNormalizationSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationSchemasResponseBody</p>
 */
public class ListNormalizationSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationSchemas")
    private java.util.List<NormalizationSchemas> normalizationSchemas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNormalizationSchemasResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationSchemas = builder.normalizationSchemas;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationSchemasResponseBody create() {
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
     * @return normalizationSchemas
     */
    public java.util.List<NormalizationSchemas> getNormalizationSchemas() {
        return this.normalizationSchemas;
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
        private java.util.List<NormalizationSchemas> normalizationSchemas; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNormalizationSchemasResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationSchemas = model.normalizationSchemas;
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
         * NormalizationSchemas.
         */
        public Builder normalizationSchemas(java.util.List<NormalizationSchemas> normalizationSchemas) {
            this.normalizationSchemas = normalizationSchemas;
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

        public ListNormalizationSchemasResponseBody build() {
            return new ListNormalizationSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationSchemasResponseBody</p>
     */
    public static class NormalizationSchemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaName")
        private String normalizationSchemaName;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaTargetLogStore")
        private String normalizationSchemaTargetLogStore;

        private NormalizationSchemas(Builder builder) {
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.normalizationSchemaName = builder.normalizationSchemaName;
            this.normalizationSchemaTargetLogStore = builder.normalizationSchemaTargetLogStore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationSchemas create() {
            return builder().build();
        }

        /**
         * @return normalizationCategoryId
         */
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
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
         * @return normalizationSchemaTargetLogStore
         */
        public String getNormalizationSchemaTargetLogStore() {
            return this.normalizationSchemaTargetLogStore;
        }

        public static final class Builder {
            private String normalizationCategoryId; 
            private String normalizationSchemaId; 
            private String normalizationSchemaName; 
            private String normalizationSchemaTargetLogStore; 

            private Builder() {
            } 

            private Builder(NormalizationSchemas model) {
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.normalizationSchemaName = model.normalizationSchemaName;
                this.normalizationSchemaTargetLogStore = model.normalizationSchemaTargetLogStore;
            } 

            /**
             * NormalizationCategoryId.
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
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
             * NormalizationSchemaTargetLogStore.
             */
            public Builder normalizationSchemaTargetLogStore(String normalizationSchemaTargetLogStore) {
                this.normalizationSchemaTargetLogStore = normalizationSchemaTargetLogStore;
                return this;
            }

            public NormalizationSchemas build() {
                return new NormalizationSchemas(this);
            } 

        } 

    }
}
