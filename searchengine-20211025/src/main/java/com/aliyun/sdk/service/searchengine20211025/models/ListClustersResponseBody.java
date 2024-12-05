// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>F43E8AB4-419C-5F4C-90D6-615590DFAA3C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The clusters.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The name of the Searcher worker.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-8ed2k7brm05_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of Searcher workers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The ID of the partition that is stored on the Searcher worker.</p>
             * 
             * <strong>example:</strong>
             * <p>dt=20220216</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The name of the QRS worker.</p>
             * 
             * <strong>example:</strong>
             * <p>test_0704</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of QRS workers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The ID of the partition that is stored on the QRS worker.</p>
             * 
             * <strong>example:</strong>
             * <p>dt=20211216</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map < String, java.util.Map<String, ?>> config;

        @com.aliyun.core.annotation.NameInMap("configUpdateTime")
        private String configUpdateTime;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentAdvanceConfigVersion")
        private String currentAdvanceConfigVersion;

        @com.aliyun.core.annotation.NameInMap("currentOfflineDictConfigVersion")
        private String currentOfflineDictConfigVersion;

        @com.aliyun.core.annotation.NameInMap("currentOnlineConfigVersion")
        private String currentOnlineConfigVersion;

        @com.aliyun.core.annotation.NameInMap("currentOnlineQueryConfigVersion")
        private String currentOnlineQueryConfigVersion;

        @com.aliyun.core.annotation.NameInMap("dataNode")
        private DataNode dataNode;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("latestAdvanceConfigVersion")
        private String latestAdvanceConfigVersion;

        @com.aliyun.core.annotation.NameInMap("latestOfflineDictConfigVersion")
        private String latestOfflineDictConfigVersion;

        @com.aliyun.core.annotation.NameInMap("latestOnlineConfigVersion")
        private String latestOnlineConfigVersion;

        @com.aliyun.core.annotation.NameInMap("latestOnlineQueryConfigVersion")
        private String latestOnlineQueryConfigVersion;

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
            private java.util.Map < String, java.util.Map<String, ?>> config; 
            private String configUpdateTime; 
            private String createTime; 
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
             * <p>The configuration information.</p>
             */
            public Builder config(java.util.Map < String, java.util.Map<String, ?>> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the configuration was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-21 16:05:26</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The effective advanced configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder currentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
                this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
                return this;
            }

            /**
             * <p>The effective dictionary configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_offline_adv_v1</p>
             */
            public Builder currentOfflineDictConfigVersion(String currentOfflineDictConfigVersion) {
                this.currentOfflineDictConfigVersion = currentOfflineDictConfigVersion;
                return this;
            }

            /**
             * <p>The effective online configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder currentOnlineConfigVersion(String currentOnlineConfigVersion) {
                this.currentOnlineConfigVersion = currentOnlineConfigVersion;
                return this;
            }

            /**
             * <p>The effective query configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_offline_adv_v1</p>
             */
            public Builder currentOnlineQueryConfigVersion(String currentOnlineQueryConfigVersion) {
                this.currentOnlineQueryConfigVersion = currentOnlineQueryConfigVersion;
                return this;
            }

            /**
             * <p>The information about Searcher workers.</p>
             */
            public Builder dataNode(DataNode dataNode) {
                this.dataNode = dataNode;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>fzz_test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The latest advanced configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder latestAdvanceConfigVersion(String latestAdvanceConfigVersion) {
                this.latestAdvanceConfigVersion = latestAdvanceConfigVersion;
                return this;
            }

            /**
             * <p>The latest dictionary configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_offline_adv_v1</p>
             */
            public Builder latestOfflineDictConfigVersion(String latestOfflineDictConfigVersion) {
                this.latestOfflineDictConfigVersion = latestOfflineDictConfigVersion;
                return this;
            }

            /**
             * <p>The latest online configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder latestOnlineConfigVersion(String latestOnlineConfigVersion) {
                this.latestOnlineConfigVersion = latestOnlineConfigVersion;
                return this;
            }

            /**
             * <p>The latest query configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_offline_adv_v1</p>
             */
            public Builder latestOnlineQueryConfigVersion(String latestOnlineQueryConfigVersion) {
                this.latestOnlineQueryConfigVersion = latestOnlineQueryConfigVersion;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-7pp2pcna701_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information about Query Result Searcher (QRS) workers.</p>
             */
            public Builder queryNode(QueryNode queryNode) {
                this.queryNode = queryNode;
                return this;
            }

            /**
             * <p>The cluster status. Valid values: running: The cluster is running. starting: The cluster is being started. stopping: The cluster is being stopped. stopped: The cluster is stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;starting&quot;</p>
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
