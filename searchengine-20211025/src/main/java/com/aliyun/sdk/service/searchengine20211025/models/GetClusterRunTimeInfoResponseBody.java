// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterRunTimeInfoResponseBody</p>
 */
public class GetClusterRunTimeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private GetClusterRunTimeInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterRunTimeInfoResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result set.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public GetClusterRunTimeInfoResponseBody build() {
            return new GetClusterRunTimeInfoResponseBody(this);
        } 

    } 

    public static class ConfigStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configUpdateTime")
        private String configUpdateTime;

        @com.aliyun.core.annotation.NameInMap("donePercent")
        private Integer donePercent;

        @com.aliyun.core.annotation.NameInMap("doneSize")
        private Integer doneSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private ConfigStatusList(Builder builder) {
            this.configUpdateTime = builder.configUpdateTime;
            this.donePercent = builder.donePercent;
            this.doneSize = builder.doneSize;
            this.name = builder.name;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigStatusList create() {
            return builder().build();
        }

        /**
         * @return configUpdateTime
         */
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        /**
         * @return donePercent
         */
        public Integer getDonePercent() {
            return this.donePercent;
        }

        /**
         * @return doneSize
         */
        public Integer getDoneSize() {
            return this.doneSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String configUpdateTime; 
            private Integer donePercent; 
            private Integer doneSize; 
            private String name; 
            private Integer totalSize; 

            /**
             * The time when the cluster was updated.
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * The overall progress.
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * The number of nodes that are configured.
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
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
             * The total number of nodes that you specify when you create the cluster.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public ConfigStatusList build() {
                return new ConfigStatusList(this);
            } 

        } 

    }
    public static class AdvanceConfigInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configMetaName")
        private String configMetaName;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private AdvanceConfigInfo(Builder builder) {
            this.configMetaName = builder.configMetaName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceConfigInfo create() {
            return builder().build();
        }

        /**
         * @return configMetaName
         */
        public String getConfigMetaName() {
            return this.configMetaName;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String configMetaName; 
            private Long version; 

            /**
             * The name of the index configuration.
             */
            public Builder configMetaName(String configMetaName) {
                this.configMetaName = configMetaName;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public AdvanceConfigInfo build() {
                return new AdvanceConfigInfo(this);
            } 

        } 

    }
    public static class IndexConfigInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configMetaName")
        private String configMetaName;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private IndexConfigInfo(Builder builder) {
            this.configMetaName = builder.configMetaName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexConfigInfo create() {
            return builder().build();
        }

        /**
         * @return configMetaName
         */
        public String getConfigMetaName() {
            return this.configMetaName;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String configMetaName; 
            private Long version; 

            /**
             * The name of the index configuration.
             */
            public Builder configMetaName(String configMetaName) {
                this.configMetaName = configMetaName;
                return this;
            }

            /**
             * The version of the index template.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public IndexConfigInfo build() {
                return new IndexConfigInfo(this);
            } 

        } 

    }
    public static class DataStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("advanceConfigInfo")
        private AdvanceConfigInfo advanceConfigInfo;

        @com.aliyun.core.annotation.NameInMap("deployFailedWorker")
        private java.util.List < String > deployFailedWorker;

        @com.aliyun.core.annotation.NameInMap("docSize")
        private Integer docSize;

        @com.aliyun.core.annotation.NameInMap("donePercent")
        private Integer donePercent;

        @com.aliyun.core.annotation.NameInMap("doneSize")
        private Integer doneSize;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("fullUpdateTime")
        private String fullUpdateTime;

        @com.aliyun.core.annotation.NameInMap("fullVersion")
        private Long fullVersion;

        @com.aliyun.core.annotation.NameInMap("incUpdateTime")
        private String incUpdateTime;

        @com.aliyun.core.annotation.NameInMap("incVersion")
        private Long incVersion;

        @com.aliyun.core.annotation.NameInMap("indexConfigInfo")
        private IndexConfigInfo indexConfigInfo;

        @com.aliyun.core.annotation.NameInMap("indexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("lackDiskWorker")
        private java.util.List < String > lackDiskWorker;

        @com.aliyun.core.annotation.NameInMap("lackMemWorker")
        private java.util.List < String > lackMemWorker;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private DataStatusList(Builder builder) {
            this.advanceConfigInfo = builder.advanceConfigInfo;
            this.deployFailedWorker = builder.deployFailedWorker;
            this.docSize = builder.docSize;
            this.donePercent = builder.donePercent;
            this.doneSize = builder.doneSize;
            this.errorMsg = builder.errorMsg;
            this.fullUpdateTime = builder.fullUpdateTime;
            this.fullVersion = builder.fullVersion;
            this.incUpdateTime = builder.incUpdateTime;
            this.incVersion = builder.incVersion;
            this.indexConfigInfo = builder.indexConfigInfo;
            this.indexSize = builder.indexSize;
            this.lackDiskWorker = builder.lackDiskWorker;
            this.lackMemWorker = builder.lackMemWorker;
            this.name = builder.name;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataStatusList create() {
            return builder().build();
        }

        /**
         * @return advanceConfigInfo
         */
        public AdvanceConfigInfo getAdvanceConfigInfo() {
            return this.advanceConfigInfo;
        }

        /**
         * @return deployFailedWorker
         */
        public java.util.List < String > getDeployFailedWorker() {
            return this.deployFailedWorker;
        }

        /**
         * @return docSize
         */
        public Integer getDocSize() {
            return this.docSize;
        }

        /**
         * @return donePercent
         */
        public Integer getDonePercent() {
            return this.donePercent;
        }

        /**
         * @return doneSize
         */
        public Integer getDoneSize() {
            return this.doneSize;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return fullUpdateTime
         */
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        /**
         * @return fullVersion
         */
        public Long getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return incUpdateTime
         */
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        /**
         * @return incVersion
         */
        public Long getIncVersion() {
            return this.incVersion;
        }

        /**
         * @return indexConfigInfo
         */
        public IndexConfigInfo getIndexConfigInfo() {
            return this.indexConfigInfo;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return lackDiskWorker
         */
        public java.util.List < String > getLackDiskWorker() {
            return this.lackDiskWorker;
        }

        /**
         * @return lackMemWorker
         */
        public java.util.List < String > getLackMemWorker() {
            return this.lackMemWorker;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private AdvanceConfigInfo advanceConfigInfo; 
            private java.util.List < String > deployFailedWorker; 
            private Integer docSize; 
            private Integer donePercent; 
            private Integer doneSize; 
            private String errorMsg; 
            private String fullUpdateTime; 
            private Long fullVersion; 
            private String incUpdateTime; 
            private Long incVersion; 
            private IndexConfigInfo indexConfigInfo; 
            private Long indexSize; 
            private java.util.List < String > lackDiskWorker; 
            private java.util.List < String > lackMemWorker; 
            private String name; 
            private Integer totalSize; 

            /**
             * The information about advanced configurations.
             */
            public Builder advanceConfigInfo(AdvanceConfigInfo advanceConfigInfo) {
                this.advanceConfigInfo = advanceConfigInfo;
                return this;
            }

            /**
             * The name of the worker that failed because of a deployment failure.
             */
            public Builder deployFailedWorker(java.util.List < String > deployFailedWorker) {
                this.deployFailedWorker = deployFailedWorker;
                return this;
            }

            /**
             * The storage capacity. Unit: GB.
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * The overall progress.
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * The number of nodes that are configured.
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The time when the full data was updated.
             */
            public Builder fullUpdateTime(String fullUpdateTime) {
                this.fullUpdateTime = fullUpdateTime;
                return this;
            }

            /**
             * The full version.
             */
            public Builder fullVersion(Long fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * The time when the incremental data was updated.
             */
            public Builder incUpdateTime(String incUpdateTime) {
                this.incUpdateTime = incUpdateTime;
                return this;
            }

            /**
             * The incremental version.
             */
            public Builder incVersion(Long incVersion) {
                this.incVersion = incVersion;
                return this;
            }

            /**
             * The configuration information of the index.
             */
            public Builder indexConfigInfo(IndexConfigInfo indexConfigInfo) {
                this.indexConfigInfo = indexConfigInfo;
                return this;
            }

            /**
             * The size of the index.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * The name of the worker that failed because of insufficient disk space.
             */
            public Builder lackDiskWorker(java.util.List < String > lackDiskWorker) {
                this.lackDiskWorker = lackDiskWorker;
                return this;
            }

            /**
             * The name of the worker that failed because of insufficient memory.
             */
            public Builder lackMemWorker(java.util.List < String > lackMemWorker) {
                this.lackMemWorker = lackMemWorker;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The total number of nodes that you specify when you create the cluster.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public DataStatusList build() {
                return new DataStatusList(this);
            } 

        } 

    }
    public static class ServiceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("donePercent")
        private Integer donePercent;

        @com.aliyun.core.annotation.NameInMap("doneSize")
        private Integer doneSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private ServiceStatus(Builder builder) {
            this.donePercent = builder.donePercent;
            this.doneSize = builder.doneSize;
            this.name = builder.name;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceStatus create() {
            return builder().build();
        }

        /**
         * @return donePercent
         */
        public Integer getDonePercent() {
            return this.donePercent;
        }

        /**
         * @return doneSize
         */
        public Integer getDoneSize() {
            return this.doneSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer donePercent; 
            private Integer doneSize; 
            private String name; 
            private Integer totalSize; 

            /**
             * The overall progress.
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * The number of nodes being processed in the cluster.
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The total number of nodes in the cluster.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public ServiceStatus build() {
                return new ServiceStatus(this);
            } 

        } 

    }
    public static class DataNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configStatusList")
        private java.util.List < ConfigStatusList> configStatusList;

        @com.aliyun.core.annotation.NameInMap("dataStatusList")
        private java.util.List < DataStatusList> dataStatusList;

        @com.aliyun.core.annotation.NameInMap("serviceStatus")
        private ServiceStatus serviceStatus;

        private DataNodes(Builder builder) {
            this.configStatusList = builder.configStatusList;
            this.dataStatusList = builder.dataStatusList;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataNodes create() {
            return builder().build();
        }

        /**
         * @return configStatusList
         */
        public java.util.List < ConfigStatusList> getConfigStatusList() {
            return this.configStatusList;
        }

        /**
         * @return dataStatusList
         */
        public java.util.List < DataStatusList> getDataStatusList() {
            return this.dataStatusList;
        }

        /**
         * @return serviceStatus
         */
        public ServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private java.util.List < ConfigStatusList> configStatusList; 
            private java.util.List < DataStatusList> dataStatusList; 
            private ServiceStatus serviceStatus; 

            /**
             * The configuration status list.
             */
            public Builder configStatusList(java.util.List < ConfigStatusList> configStatusList) {
                this.configStatusList = configStatusList;
                return this;
            }

            /**
             * The dataStatusList.
             */
            public Builder dataStatusList(java.util.List < DataStatusList> dataStatusList) {
                this.dataStatusList = dataStatusList;
                return this;
            }

            /**
             * The service status.
             */
            public Builder serviceStatus(ServiceStatus serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public DataNodes build() {
                return new DataNodes(this);
            } 

        } 

    }
    public static class QueryNodeConfigStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configUpdateTime")
        private String configUpdateTime;

        @com.aliyun.core.annotation.NameInMap("donePercent")
        private Integer donePercent;

        @com.aliyun.core.annotation.NameInMap("doneSize")
        private Integer doneSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private QueryNodeConfigStatusList(Builder builder) {
            this.configUpdateTime = builder.configUpdateTime;
            this.donePercent = builder.donePercent;
            this.doneSize = builder.doneSize;
            this.name = builder.name;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryNodeConfigStatusList create() {
            return builder().build();
        }

        /**
         * @return configUpdateTime
         */
        public String getConfigUpdateTime() {
            return this.configUpdateTime;
        }

        /**
         * @return donePercent
         */
        public Integer getDonePercent() {
            return this.donePercent;
        }

        /**
         * @return doneSize
         */
        public Integer getDoneSize() {
            return this.doneSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String configUpdateTime; 
            private Integer donePercent; 
            private Integer doneSize; 
            private String name; 
            private Integer totalSize; 

            /**
             * The time when the cluster was updated.
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * The progress.
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * The number of nodes that are configured.
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
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
             * The total number of nodes that you specify when you create the cluster.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public QueryNodeConfigStatusList build() {
                return new QueryNodeConfigStatusList(this);
            } 

        } 

    }
    public static class QueryNodeServiceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("donePercent")
        private Integer donePercent;

        @com.aliyun.core.annotation.NameInMap("doneSize")
        private Integer doneSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private QueryNodeServiceStatus(Builder builder) {
            this.donePercent = builder.donePercent;
            this.doneSize = builder.doneSize;
            this.name = builder.name;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryNodeServiceStatus create() {
            return builder().build();
        }

        /**
         * @return donePercent
         */
        public Integer getDonePercent() {
            return this.donePercent;
        }

        /**
         * @return doneSize
         */
        public Integer getDoneSize() {
            return this.doneSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer donePercent; 
            private Integer doneSize; 
            private String name; 
            private Integer totalSize; 

            /**
             * The progress.
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * The number of nodes that are configured.
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
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
             * The total number of nodes that you specify when you create the cluster.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public QueryNodeServiceStatus build() {
                return new QueryNodeServiceStatus(this);
            } 

        } 

    }
    public static class QueryNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configStatusList")
        private java.util.List < QueryNodeConfigStatusList> configStatusList;

        @com.aliyun.core.annotation.NameInMap("serviceStatus")
        private QueryNodeServiceStatus serviceStatus;

        private QueryNode(Builder builder) {
            this.configStatusList = builder.configStatusList;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryNode create() {
            return builder().build();
        }

        /**
         * @return configStatusList
         */
        public java.util.List < QueryNodeConfigStatusList> getConfigStatusList() {
            return this.configStatusList;
        }

        /**
         * @return serviceStatus
         */
        public QueryNodeServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private java.util.List < QueryNodeConfigStatusList> configStatusList; 
            private QueryNodeServiceStatus serviceStatus; 

            /**
             * The dataStatusList.
             */
            public Builder configStatusList(java.util.List < QueryNodeConfigStatusList> configStatusList) {
                this.configStatusList = configStatusList;
                return this;
            }

            /**
             * The service status.
             */
            public Builder serviceStatus(QueryNodeServiceStatus serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public QueryNode build() {
                return new QueryNode(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("dataNodes")
        private java.util.List < DataNodes> dataNodes;

        @com.aliyun.core.annotation.NameInMap("queryNode")
        private QueryNode queryNode;

        private Result(Builder builder) {
            this.clusterName = builder.clusterName;
            this.dataNodes = builder.dataNodes;
            this.queryNode = builder.queryNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return dataNodes
         */
        public java.util.List < DataNodes> getDataNodes() {
            return this.dataNodes;
        }

        /**
         * @return queryNode
         */
        public QueryNode getQueryNode() {
            return this.queryNode;
        }

        public static final class Builder {
            private String clusterName; 
            private java.util.List < DataNodes> dataNodes; 
            private QueryNode queryNode; 

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The information about the data node.
             */
            public Builder dataNodes(java.util.List < DataNodes> dataNodes) {
                this.dataNodes = dataNodes;
                return this;
            }

            /**
             * The information about the query node.
             */
            public Builder queryNode(QueryNode queryNode) {
                this.queryNode = queryNode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
