// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListThreadsResponseBody} extends {@link TeaModel}
 *
 * <p>ListThreadsResponseBody</p>
 */
public class ListThreadsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("threads")
    private java.util.List<Threads> threads;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListThreadsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.threadId = builder.threadId;
        this.threads = builder.threads;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListThreadsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return threads
     */
    public java.util.List<Threads> getThreads() {
        return this.threads;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private String threadId; 
        private java.util.List<Threads> threads; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListThreadsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.threadId = model.threadId;
            this.threads = model.threads;
            this.total = model.total;
        } 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * threads.
         */
        public Builder threads(java.util.List<Threads> threads) {
            this.threads = threads;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListThreadsResponseBody build() {
            return new ListThreadsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListThreadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListThreadsResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Variables(Builder builder) {
            this.project = builder.project;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String project; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.project = model.project;
                this.workspace = model.workspace;
            } 

            /**
             * <p>SLS project。</p>
             * 
             * <strong>example:</strong>
             * <p>ciec_rl_ads</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListThreadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListThreadsResponseBody</p>
     */
    public static class Threads extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
        private String digitalEmployeeName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("threadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("variables")
        private Variables variables;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private Threads(Builder builder) {
            this.createTime = builder.createTime;
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.status = builder.status;
            this.threadId = builder.threadId;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.variables = builder.variables;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Threads create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return digitalEmployeeName
         */
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return variables
         */
        public Variables getVariables() {
            return this.variables;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String digitalEmployeeName; 
            private String status; 
            private String threadId; 
            private String title; 
            private String updateTime; 
            private Variables variables; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Threads model) {
                this.createTime = model.createTime;
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.status = model.status;
                this.threadId = model.threadId;
                this.title = model.title;
                this.updateTime = model.updateTime;
                this.variables = model.variables;
                this.version = model.version;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * digitalEmployeeName.
             */
            public Builder digitalEmployeeName(String digitalEmployeeName) {
                this.digitalEmployeeName = digitalEmployeeName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * threadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(Variables variables) {
                this.variables = variables;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Threads build() {
                return new Threads(this);
            } 

        } 

    }
}
