// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListClustersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of clusters.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    public static class DataNode extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("number")
        private Integer number;

        @NameInMap("partition")
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
             * The name of the node.
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
             * The partition ID of the node.
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
        @NameInMap("name")
        private String name;

        @NameInMap("number")
        private Integer number;

        @NameInMap("partition")
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
             * The name of the node.
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
             * The number o replicas.
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
        @NameInMap("configUpdateTime")
        private String configUpdateTime;

        @NameInMap("currentAdvanceConfigVersion")
        private String currentAdvanceConfigVersion;

        @NameInMap("currentOfflineDictConfigVersion")
        private String currentOfflineDictConfigVersion;

        @NameInMap("currentOnlineConfigVersion")
        private String currentOnlineConfigVersion;

        @NameInMap("currentOnlineQueryConfigVersion")
        private String currentOnlineQueryConfigVersion;

        @NameInMap("dataNode")
        private DataNode dataNode;

        @NameInMap("description")
        private String description;

        @NameInMap("latestAdvanceConfigVersion")
        private String latestAdvanceConfigVersion;

        @NameInMap("latestOfflineDictConfigVersion")
        private String latestOfflineDictConfigVersion;

        @NameInMap("latestOnlineConfigVersion")
        private String latestOnlineConfigVersion;

        @NameInMap("latestOnlineQueryConfigVersion")
        private String latestOnlineQueryConfigVersion;

        @NameInMap("name")
        private String name;

        @NameInMap("queryNode")
        private QueryNode queryNode;

        @NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.configUpdateTime = builder.configUpdateTime;
            this.currentAdvanceConfigVersion = builder.currentAdvanceConfigVersion;
            this.currentOfflineDictConfigVersion = builder.currentOfflineDictConfigVersion;
            this.currentOnlineConfigVersion = builder.currentOnlineConfigVersion;
            this.currentOnlineQueryConfigVersion = builder.currentOnlineQueryConfigVersion;
            this.dataNode = builder.dataNode;
            this.description = builder.description;
            this.latestAdvanceConfigVersion = builder.latestAdvanceConfigVersion;
            this.latestOfflineDictConfigVersion = builder.latestOfflineDictConfigVersion;
            this.latestOnlineConfigVersion = builder.latestOnlineConfigVersion;
            this.latestOnlineQueryConfigVersion = builder.latestOnlineQueryConfigVersion;
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
         * @return configUpdateTime
         */
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        /**
         * @return currentAdvanceConfigVersion
         */
        public String getCurrentAdvanceConfigVersion() {
            return this.currentAdvanceConfigVersion;
        }

        /**
         * @return currentOfflineDictConfigVersion
         */
        public String getCurrentOfflineDictConfigVersion() {
            return this.currentOfflineDictConfigVersion;
        }

        /**
         * @return currentOnlineConfigVersion
         */
        public String getCurrentOnlineConfigVersion() {
            return this.currentOnlineConfigVersion;
        }

        /**
         * @return currentOnlineQueryConfigVersion
         */
        public String getCurrentOnlineQueryConfigVersion() {
            return this.currentOnlineQueryConfigVersion;
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
         * @return latestOfflineDictConfigVersion
         */
        public String getLatestOfflineDictConfigVersion() {
            return this.latestOfflineDictConfigVersion;
        }

        /**
         * @return latestOnlineConfigVersion
         */
        public String getLatestOnlineConfigVersion() {
            return this.latestOnlineConfigVersion;
        }

        /**
         * @return latestOnlineQueryConfigVersion
         */
        public String getLatestOnlineQueryConfigVersion() {
            return this.latestOnlineQueryConfigVersion;
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
            private String configUpdateTime; 
            private String currentAdvanceConfigVersion; 
            private String currentOfflineDictConfigVersion; 
            private String currentOnlineConfigVersion; 
            private String currentOnlineQueryConfigVersion; 
            private DataNode dataNode; 
            private String description; 
            private String latestAdvanceConfigVersion; 
            private String latestOfflineDictConfigVersion; 
            private String latestOnlineConfigVersion; 
            private String latestOnlineQueryConfigVersion; 
            private String name; 
            private QueryNode queryNode; 
            private String status; 

            /**
             * The time when the configuration was updated.
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * The effective advanced version.
             */
            public Builder currentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
                this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
                return this;
            }

            /**
             * 词典配置生效版本
             */
            public Builder currentOfflineDictConfigVersion(String currentOfflineDictConfigVersion) {
                this.currentOfflineDictConfigVersion = currentOfflineDictConfigVersion;
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
             * 查询配置生效版本
             */
            public Builder currentOnlineQueryConfigVersion(String currentOnlineQueryConfigVersion) {
                this.currentOnlineQueryConfigVersion = currentOnlineQueryConfigVersion;
                return this;
            }

            /**
             * The information about the node in the cluster.
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
             * 词典配置最新版本
             */
            public Builder latestOfflineDictConfigVersion(String latestOfflineDictConfigVersion) {
                this.latestOfflineDictConfigVersion = latestOfflineDictConfigVersion;
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
             * 查询配置最新版本
             */
            public Builder latestOnlineQueryConfigVersion(String latestOnlineQueryConfigVersion) {
                this.latestOnlineQueryConfigVersion = latestOnlineQueryConfigVersion;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The query node of the cluster.
             */
            public Builder queryNode(QueryNode queryNode) {
                this.queryNode = queryNode;
                return this;
            }

            /**
             * The status of the cluster. Valid values: running, starting, stopping, and stopped. running indicates the cluster is running, starting indicates the cluster is starting, stopping indicates the cluster is stopping, and stopped indicates the cluster has stopped.
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
