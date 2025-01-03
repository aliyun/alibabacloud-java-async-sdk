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
 * {@link ExportInsightSprintResponseBody} extends {@link TeaModel}
 *
 * <p>ExportInsightSprintResponseBody</p>
 */
public class ExportInsightSprintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ExportInsightSprintResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportInsightSprintResponseBody create() {
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

        public ExportInsightSprintResponseBody build() {
            return new ExportInsightSprintResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportInsightSprintResponseBody} extends {@link TeaModel}
     *
     * <p>ExportInsightSprintResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualEnd")
        private Long actualEnd;

        @com.aliyun.core.annotation.NameInMap("actualStart")
        private Long actualStart;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtEnd")
        private Long gmtEnd;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private Long gmtStart;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("isDeleted")
        private String isDeleted;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("workTimeCapacity")
        private Double workTimeCapacity;

        private Result(Builder builder) {
            this.actualEnd = builder.actualEnd;
            this.actualStart = builder.actualStart;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtModified = builder.gmtModified;
            this.gmtStart = builder.gmtStart;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.isDeleted = builder.isDeleted;
            this.name = builder.name;
            this.organizationId = builder.organizationId;
            this.projectId = builder.projectId;
            this.source = builder.source;
            this.status = builder.status;
            this.workTimeCapacity = builder.workTimeCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return actualEnd
         */
        public Long getActualEnd() {
            return this.actualEnd;
        }

        /**
         * @return actualStart
         */
        public Long getActualStart() {
            return this.actualStart;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtEnd
         */
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtStart
         */
        public Long getGmtStart() {
            return this.gmtStart;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return workTimeCapacity
         */
        public Double getWorkTimeCapacity() {
            return this.workTimeCapacity;
        }

        public static final class Builder {
            private Long actualEnd; 
            private Long actualStart; 
            private Long gmtCreate; 
            private Long gmtEnd; 
            private Long gmtModified; 
            private Long gmtStart; 
            private Long id; 
            private String identifier; 
            private String isDeleted; 
            private String name; 
            private String organizationId; 
            private String projectId; 
            private String source; 
            private Integer status; 
            private Double workTimeCapacity; 

            /**
             * actualEnd.
             */
            public Builder actualEnd(Long actualEnd) {
                this.actualEnd = actualEnd;
                return this;
            }

            /**
             * actualStart.
             */
            public Builder actualStart(Long actualStart) {
                this.actualStart = actualStart;
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
             * gmtEnd.
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
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
             * gmtStart.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * workTimeCapacity.
             */
            public Builder workTimeCapacity(Double workTimeCapacity) {
                this.workTimeCapacity = workTimeCapacity;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
