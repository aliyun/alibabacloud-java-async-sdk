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
 * {@link ExportInsightExpectedWorkTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ExportInsightExpectedWorkTimeResponseBody</p>
 */
public class ExportInsightExpectedWorkTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ExportInsightExpectedWorkTimeResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportInsightExpectedWorkTimeResponseBody create() {
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

        public ExportInsightExpectedWorkTimeResponseBody build() {
            return new ExportInsightExpectedWorkTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportInsightExpectedWorkTimeResponseBody} extends {@link TeaModel}
     *
     * <p>ExportInsightExpectedWorkTimeResponseBody</p>
     */
    public static class Result extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("recorderId")
        private String recorderId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Double value;

        @com.aliyun.core.annotation.NameInMap("workitemId")
        private String workitemId;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.isDeleted = builder.isDeleted;
            this.organizationId = builder.organizationId;
            this.projectId = builder.projectId;
            this.recorderId = builder.recorderId;
            this.source = builder.source;
            this.type = builder.type;
            this.value = builder.value;
            this.workitemId = builder.workitemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return recorderId
         */
        public String getRecorderId() {
            return this.recorderId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
        public Double getValue() {
            return this.value;
        }

        /**
         * @return workitemId
         */
        public String getWorkitemId() {
            return this.workitemId;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String identifier; 
            private String isDeleted; 
            private String organizationId; 
            private String projectId; 
            private String recorderId; 
            private String source; 
            private String type; 
            private Double value; 
            private String workitemId; 

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
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * recorderId.
             */
            public Builder recorderId(String recorderId) {
                this.recorderId = recorderId;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
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
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            /**
             * workitemId.
             */
            public Builder workitemId(String workitemId) {
                this.workitemId = workitemId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
