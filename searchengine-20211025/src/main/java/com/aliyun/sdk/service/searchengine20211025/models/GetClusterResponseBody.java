// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The clusters.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    public static class DataNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("partition")
        private Integer partition;

        private DataNode(Builder builder) {
            this.name = builder.name;
            this.number = builder.number;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataNode create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private String name; 
            private Integer number; 
            private Integer partition; 

            /**
             * The name of the Searcher worker.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of replicas.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * The number of partitions.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            public DataNode build() {
                return new DataNode(this);
            } 

        } 

    }
    public static class QueryNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("partition")
        private Integer partition;

        private QueryNode(Builder builder) {
            this.name = builder.name;
            this.number = builder.number;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryNode create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private String name; 
            private Integer number; 
            private Integer partition; 

            /**
             * The name of the QRS worker.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of nodes.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * The number of replicas.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            public QueryNode build() {
                return new QueryNode(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map < String, java.util.Map<String, ?>> config;

        @com.aliyun.core.annotation.NameInMap("configUpdateTime")
        private String configUpdateTime;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentAdvanceConfigVersion")
        private String currentAdvanceConfigVersion;

        @com.aliyun.core.annotation.NameInMap("currentOnlineConfigVersion")
        private String currentOnlineConfigVersion;

        @com.aliyun.core.annotation.NameInMap("dataNode")
        private DataNode dataNode;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("latestAdvanceConfigVersion")
        private String latestAdvanceConfigVersion;

        @com.aliyun.core.annotation.NameInMap("latestOnlineConfigVersion")
        private String latestOnlineConfigVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("queryNode")
        private QueryNode queryNode;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.config = builder.config;
            this.configUpdateTime = builder.configUpdateTime;
            this.createTime = builder.createTime;
            this.currentAdvanceConfigVersion = builder.currentAdvanceConfigVersion;
            this.currentOnlineConfigVersion = builder.currentOnlineConfigVersion;
            this.dataNode = builder.dataNode;
            this.description = builder.description;
            this.latestAdvanceConfigVersion = builder.latestAdvanceConfigVersion;
            this.latestOnlineConfigVersion = builder.latestOnlineConfigVersion;
            this.name = builder.name;
            this.queryNode = builder.queryNode;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map < String, java.util.Map<String, ?>> getConfig() {
            return this.config;
        }

        /**
         * @return configUpdateTime
         */
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentAdvanceConfigVersion
         */
        public String getCurrentAdvanceConfigVersion() {
            return this.currentAdvanceConfigVersion;
        }

        /**
         * @return currentOnlineConfigVersion
         */
        public String getCurrentOnlineConfigVersion() {
            return this.currentOnlineConfigVersion;
        }

        /**
         * @return dataNode
         */
        public DataNode getDataNode() {
            return this.dataNode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return latestAdvanceConfigVersion
         */
        public String getLatestAdvanceConfigVersion() {
            return this.latestAdvanceConfigVersion;
        }

        /**
         * @return latestOnlineConfigVersion
         */
        public String getLatestOnlineConfigVersion() {
            return this.latestOnlineConfigVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queryNode
         */
        public QueryNode getQueryNode() {
            return this.queryNode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map < String, java.util.Map<String, ?>> config; 
            private String configUpdateTime; 
            private String createTime; 
            private String currentAdvanceConfigVersion; 
            private String currentOnlineConfigVersion; 
            private DataNode dataNode; 
            private String description; 
            private String latestAdvanceConfigVersion; 
            private String latestOnlineConfigVersion; 
            private String name; 
            private QueryNode queryNode; 
            private String status; 

            /**
             * The configuration information.
             */
            public Builder config(java.util.Map < String, java.util.Map<String, ?>> config) {
                this.config = config;
                return this;
            }

            /**
             * The time when the cluster was updated.
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * The time when the cluster was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The effective advanced configuration version.
             */
            public Builder currentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
                this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
                return this;
            }

            /**
             * The effective online configuration version.
             */
            public Builder currentOnlineConfigVersion(String currentOnlineConfigVersion) {
                this.currentOnlineConfigVersion = currentOnlineConfigVersion;
                return this;
            }

            /**
             * The specifications of Searcher workers.
             */
            public Builder dataNode(DataNode dataNode) {
                this.dataNode = dataNode;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The latest advanced configuration version.
             */
            public Builder latestAdvanceConfigVersion(String latestAdvanceConfigVersion) {
                this.latestAdvanceConfigVersion = latestAdvanceConfigVersion;
                return this;
            }

            /**
             * The latest online configuration version.
             */
            public Builder latestOnlineConfigVersion(String latestOnlineConfigVersion) {
                this.latestOnlineConfigVersion = latestOnlineConfigVersion;
                return this;
            }

            /**
             * The cluster name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The specifications of Query Result Searcher (QRS) workers.
             */
            public Builder queryNode(QueryNode queryNode) {
                this.queryNode = queryNode;
                return this;
            }

            /**
             * The creation status of the cluster. Valid values: NEW and PUBLISH. NEW indicates that the cluster is being created. PUBLISH indicates that the cluster is created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
