// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterRunTimeInfoResponseBody</p>
 */
public class GetClusterRunTimeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(GetClusterRunTimeInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public GetClusterRunTimeInfoResponseBody build() {
            return new GetClusterRunTimeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ConfigStatusList model) {
                this.configUpdateTime = model.configUpdateTime;
                this.donePercent = model.donePercent;
                this.doneSize = model.doneSize;
                this.name = model.name;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The time when the configuration was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * <p>The configuration progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * <p>The number of processed Searcher workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_0704</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total number of Searcher workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AdvanceConfigInfo model) {
                this.configMetaName = model.configMetaName;
                this.version = model.version;
            } 

            /**
             * <p>The name of the index configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>index_meta_name</p>
             */
            public Builder configMetaName(String configMetaName) {
                this.configMetaName = configMetaName;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IndexConfigInfo model) {
                this.configMetaName = model.configMetaName;
                this.version = model.version;
            } 

            /**
             * <p>The name of the index configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>index_meta_name</p>
             */
            public Builder configMetaName(String configMetaName) {
                this.configMetaName = configMetaName;
                return this;
            }

            /**
             * <p>The version of the index template.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
    public static class DataStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("advanceConfigInfo")
        private AdvanceConfigInfo advanceConfigInfo;

        @com.aliyun.core.annotation.NameInMap("deployFailedWorker")
        private java.util.List<String> deployFailedWorker;

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
        private java.util.List<String> lackDiskWorker;

        @com.aliyun.core.annotation.NameInMap("lackMemWorker")
        private java.util.List<String> lackMemWorker;

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
        public java.util.List<String> getDeployFailedWorker() {
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
        public java.util.List<String> getLackDiskWorker() {
            return this.lackDiskWorker;
        }

        /**
         * @return lackMemWorker
         */
        public java.util.List<String> getLackMemWorker() {
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
            private java.util.List<String> deployFailedWorker; 
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
            private java.util.List<String> lackDiskWorker; 
            private java.util.List<String> lackMemWorker; 
            private String name; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(DataStatusList model) {
                this.advanceConfigInfo = model.advanceConfigInfo;
                this.deployFailedWorker = model.deployFailedWorker;
                this.docSize = model.docSize;
                this.donePercent = model.donePercent;
                this.doneSize = model.doneSize;
                this.errorMsg = model.errorMsg;
                this.fullUpdateTime = model.fullUpdateTime;
                this.fullVersion = model.fullVersion;
                this.incUpdateTime = model.incUpdateTime;
                this.incVersion = model.incVersion;
                this.indexConfigInfo = model.indexConfigInfo;
                this.indexSize = model.indexSize;
                this.lackDiskWorker = model.lackDiskWorker;
                this.lackMemWorker = model.lackMemWorker;
                this.name = model.name;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The information about the advanced configuration.</p>
             */
            public Builder advanceConfigInfo(AdvanceConfigInfo advanceConfigInfo) {
                this.advanceConfigInfo = advanceConfigInfo;
                return this;
            }

            /**
             * <p>The name of the worker that failed due to a deployment failure.</p>
             */
            public Builder deployFailedWorker(java.util.List<String> deployFailedWorker) {
                this.deployFailedWorker = deployFailedWorker;
                return this;
            }

            /**
             * <p>The storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * <p>The configuration progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * <p>The number of processed QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>0A3B1C48006A6C0905F6375F4821EB50</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The time when full data in the index was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder fullUpdateTime(String fullUpdateTime) {
                this.fullUpdateTime = fullUpdateTime;
                return this;
            }

            /**
             * <p>The time when the full index version was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>123423</p>
             */
            public Builder fullVersion(Long fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * <p>The time when incremental data in the index was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder incUpdateTime(String incUpdateTime) {
                this.incUpdateTime = incUpdateTime;
                return this;
            }

            /**
             * <p>The time when the incremental index version was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>123423</p>
             */
            public Builder incVersion(Long incVersion) {
                this.incVersion = incVersion;
                return this;
            }

            /**
             * <p>The information about the index configuration.</p>
             */
            public Builder indexConfigInfo(IndexConfigInfo indexConfigInfo) {
                this.indexConfigInfo = indexConfigInfo;
                return this;
            }

            /**
             * <p>The index size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * <p>The name of the worker that failed due to insufficient disks.</p>
             */
            public Builder lackDiskWorker(java.util.List<String> lackDiskWorker) {
                this.lackDiskWorker = lackDiskWorker;
                return this;
            }

            /**
             * <p>The name of the worker that failed due to insufficient memory.</p>
             */
            public Builder lackMemWorker(java.util.List<String> lackMemWorker) {
                this.lackMemWorker = lackMemWorker;
                return this;
            }

            /**
             * <p>The name of the QRS worker.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-c4d2rq7nt04_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total number of QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ServiceStatus model) {
                this.donePercent = model.donePercent;
                this.doneSize = model.doneSize;
                this.name = model.name;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The process progress of QRS workers in the cluster. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * <p>The number of processed QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * <p>The name of the QRS worker.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-0ju2s170b03_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total number of QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
    public static class DataNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configStatusList")
        private java.util.List<ConfigStatusList> configStatusList;

        @com.aliyun.core.annotation.NameInMap("dataStatusList")
        private java.util.List<DataStatusList> dataStatusList;

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
        public java.util.List<ConfigStatusList> getConfigStatusList() {
            return this.configStatusList;
        }

        /**
         * @return dataStatusList
         */
        public java.util.List<DataStatusList> getDataStatusList() {
            return this.dataStatusList;
        }

        /**
         * @return serviceStatus
         */
        public ServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private java.util.List<ConfigStatusList> configStatusList; 
            private java.util.List<DataStatusList> dataStatusList; 
            private ServiceStatus serviceStatus; 

            private Builder() {
            } 

            private Builder(DataNodes model) {
                this.configStatusList = model.configStatusList;
                this.dataStatusList = model.dataStatusList;
                this.serviceStatus = model.serviceStatus;
            } 

            /**
             * <p>The configuration status.</p>
             */
            public Builder configStatusList(java.util.List<ConfigStatusList> configStatusList) {
                this.configStatusList = configStatusList;
                return this;
            }

            /**
             * <p>The data of the Searcher worker.</p>
             */
            public Builder dataStatusList(java.util.List<DataStatusList> dataStatusList) {
                this.dataStatusList = dataStatusList;
                return this;
            }

            /**
             * <p>The service status of the QRS worker.</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(QueryNodeConfigStatusList model) {
                this.configUpdateTime = model.configUpdateTime;
                this.donePercent = model.donePercent;
                this.doneSize = model.doneSize;
                this.name = model.name;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The time when the configuration was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder configUpdateTime(String configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
                return this;
            }

            /**
             * <p>The process progress of QRS workers in the cluster. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * <p>The number of processed QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-zvp2qr1sk01_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total number of QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(QueryNodeServiceStatus model) {
                this.donePercent = model.donePercent;
                this.doneSize = model.doneSize;
                this.name = model.name;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The process progress of QRS workers in the cluster. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder donePercent(Integer donePercent) {
                this.donePercent = donePercent;
                return this;
            }

            /**
             * <p>The number of processed QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder doneSize(Integer doneSize) {
                this.doneSize = doneSize;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-c4d2rq7nt04_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total number of QRS workers in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
    public static class QueryNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configStatusList")
        private java.util.List<QueryNodeConfigStatusList> configStatusList;

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
        public java.util.List<QueryNodeConfigStatusList> getConfigStatusList() {
            return this.configStatusList;
        }

        /**
         * @return serviceStatus
         */
        public QueryNodeServiceStatus getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private java.util.List<QueryNodeConfigStatusList> configStatusList; 
            private QueryNodeServiceStatus serviceStatus; 

            private Builder() {
            } 

            private Builder(QueryNode model) {
                this.configStatusList = model.configStatusList;
                this.serviceStatus = model.serviceStatus;
            } 

            /**
             * <p>The configuration status.</p>
             */
            public Builder configStatusList(java.util.List<QueryNodeConfigStatusList> configStatusList) {
                this.configStatusList = configStatusList;
                return this;
            }

            /**
             * <p>The service status of the QRS worker.</p>
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
    /**
     * 
     * {@link GetClusterRunTimeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterRunTimeInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("dataNodes")
        private java.util.List<DataNodes> dataNodes;

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
        public java.util.List<DataNodes> getDataNodes() {
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
            private java.util.List<DataNodes> dataNodes; 
            private QueryNode queryNode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.clusterName = model.clusterName;
                this.dataNodes = model.dataNodes;
                this.queryNode = model.queryNode;
            } 

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_hz_domain_1</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The information about the Searcher workers.</p>
             */
            public Builder dataNodes(java.util.List<DataNodes> dataNodes) {
                this.dataNodes = dataNodes;
                return this;
            }

            /**
             * <p>The information about the Query Result Searcher (QRS) workers.</p>
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
