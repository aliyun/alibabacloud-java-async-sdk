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
 * {@link ExportWorkitemActivityResponseBody} extends {@link TeaModel}
 *
 * <p>ExportWorkitemActivityResponseBody</p>
 */
public class ExportWorkitemActivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ExportWorkitemActivityResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportWorkitemActivityResponseBody create() {
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

        public ExportWorkitemActivityResponseBody build() {
            return new ExportWorkitemActivityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportWorkitemActivityResponseBody} extends {@link TeaModel}
     *
     * <p>ExportWorkitemActivityResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtEvent")
        private Long gmtEvent;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("newValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("oldValue")
        private String oldValue;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("workitemId")
        private String workitemId;

        private Result(Builder builder) {
            this.gmtEvent = builder.gmtEvent;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.organizationId = builder.organizationId;
            this.projectId = builder.projectId;
            this.source = builder.source;
            this.type = builder.type;
            this.workitemId = builder.workitemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtEvent
         */
        public Long getGmtEvent() {
            return this.gmtEvent;
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
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workitemId
         */
        public String getWorkitemId() {
            return this.workitemId;
        }

        public static final class Builder {
            private Long gmtEvent; 
            private Long id; 
            private String identifier; 
            private String newValue; 
            private String oldValue; 
            private String organizationId; 
            private String projectId; 
            private String source; 
            private String type; 
            private String workitemId; 

            /**
             * gmtEvent.
             */
            public Builder gmtEvent(Long gmtEvent) {
                this.gmtEvent = gmtEvent;
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
             * newValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * oldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
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
