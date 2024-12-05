// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The clusters.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
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
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
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
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
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
             * <p>The configuration information.</p>
             */
            public Builder config(java.util.Map < String, java.util.Map<String, ?>> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the cluster was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-09 00:01:02</p>
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
             * <p>test_yyds_data1</p>
             */
            public Builder currentAdvanceConfigVersion(String currentAdvanceConfigVersion) {
                this.currentAdvanceConfigVersion = currentAdvanceConfigVersion;
                return this;
            }

            /**
             * <p>The effective online configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>test_yyds_data1</p>
             */
            public Builder currentOnlineConfigVersion(String currentOnlineConfigVersion) {
                this.currentOnlineConfigVersion = currentOnlineConfigVersion;
                return this;
            }

            /**
             * <p>The specifications of Searcher workers.</p>
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
             * <p>test_yyds_data1</p>
             */
            public Builder latestAdvanceConfigVersion(String latestAdvanceConfigVersion) {
                this.latestAdvanceConfigVersion = latestAdvanceConfigVersion;
                return this;
            }

            /**
             * <p>The latest online configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>test_yyds_data1</p>
             */
            public Builder latestOnlineConfigVersion(String latestOnlineConfigVersion) {
                this.latestOnlineConfigVersion = latestOnlineConfigVersion;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The specifications of Query Result Searcher (QRS) workers.</p>
             */
            public Builder queryNode(QueryNode queryNode) {
                this.queryNode = queryNode;
                return this;
            }

            /**
             * <p>The creation status of the cluster. Valid values: NEW and PUBLISH. NEW indicates that the cluster is being created. PUBLISH indicates that the cluster is created.</p>
             * 
             * <strong>example:</strong>
             * <p>NEW</p>
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
