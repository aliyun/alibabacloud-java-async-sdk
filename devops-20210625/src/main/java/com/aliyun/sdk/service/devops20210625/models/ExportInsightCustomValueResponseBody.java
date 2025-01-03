// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ExportInsightCustomValueResponseBody} extends {@link TeaModel}
 *
 * <p>ExportInsightCustomValueResponseBody</p>
 */
public class ExportInsightCustomValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ExportInsightCustomValueResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportInsightCustomValueResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private java.util.List<Result> result; 
        private Long totalCount; 

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ExportInsightCustomValueResponseBody build() {
            return new ExportInsightCustomValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportInsightCustomValueResponseBody} extends {@link TeaModel}
     *
     * <p>ExportInsightCustomValueResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("doubleValue")
        private Double doubleValue;

        @com.aliyun.core.annotation.NameInMap("fieldId")
        private String fieldId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("isDeleted")
        private String isDeleted;

        @com.aliyun.core.annotation.NameInMap("longValue")
        private Long longValue;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("targetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Result(Builder builder) {
            this.doubleValue = builder.doubleValue;
            this.fieldId = builder.fieldId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.isDeleted = builder.isDeleted;
            this.longValue = builder.longValue;
            this.organizationId = builder.organizationId;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return doubleValue
         */
        public Double getDoubleValue() {
            return this.doubleValue;
        }

        /**
         * @return fieldId
         */
        public String getFieldId() {
            return this.fieldId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return isDeleted
         */
        public String getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return longValue
         */
        public Long getLongValue() {
            return this.longValue;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Double doubleValue; 
            private String fieldId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String identifier; 
            private String isDeleted; 
            private Long longValue; 
            private String organizationId; 
            private String targetId; 
            private String targetType; 
            private String type; 
            private String value; 

            /**
             * doubleValue.
             */
            public Builder doubleValue(Double doubleValue) {
                this.doubleValue = doubleValue;
                return this;
            }

            /**
             * fieldId.
             */
            public Builder fieldId(String fieldId) {
                this.fieldId = fieldId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * isDeleted.
             */
            public Builder isDeleted(String isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * longValue.
             */
            public Builder longValue(Long longValue) {
                this.longValue = longValue;
                return this;
            }

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * targetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * targetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
