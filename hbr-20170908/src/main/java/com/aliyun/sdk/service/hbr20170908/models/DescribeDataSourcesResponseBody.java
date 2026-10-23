// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourcesResponseBody</p>
 */
public class DescribeDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDataSourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataSources = builder.dataSources;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DataSources> dataSources; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDataSourcesResponseBody model) {
            this.code = model.code;
            this.dataSources = model.dataSources;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The HTTP status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data sources.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>The response message. The value is &quot;successful&quot; if the request was successful, or an error message if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36A5CD24-<strong><strong>-</strong></strong>-****-5F30C3F1753F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The request was successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataSourcesResponseBody build() {
            return new DescribeDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourcesResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
        private String connectionInfo;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("IndexAvailable")
        private Boolean indexAvailable;

        @com.aliyun.core.annotation.NameInMap("IndexLevel")
        private String indexLevel;

        @com.aliyun.core.annotation.NameInMap("IndexUpdateTime")
        private Boolean indexUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Indexing")
        private Boolean indexing;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("SpeedLimit")
        private String speedLimit;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private DataSources(Builder builder) {
            this.clusterId = builder.clusterId;
            this.connectionInfo = builder.connectionInfo;
            this.createdTime = builder.createdTime;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceType = builder.dataSourceType;
            this.exclude = builder.exclude;
            this.include = builder.include;
            this.indexAvailable = builder.indexAvailable;
            this.indexLevel = builder.indexLevel;
            this.indexUpdateTime = builder.indexUpdateTime;
            this.indexing = builder.indexing;
            this.options = builder.options;
            this.paths = builder.paths;
            this.planId = builder.planId;
            this.schedule = builder.schedule;
            this.speedLimit = builder.speedLimit;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return connectionInfo
         */
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
        }

        /**
         * @return indexAvailable
         */
        public Boolean getIndexAvailable() {
            return this.indexAvailable;
        }

        /**
         * @return indexLevel
         */
        public String getIndexLevel() {
            return this.indexLevel;
        }

        /**
         * @return indexUpdateTime
         */
        public Boolean getIndexUpdateTime() {
            return this.indexUpdateTime;
        }

        /**
         * @return indexing
         */
        public Boolean getIndexing() {
            return this.indexing;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return speedLimit
         */
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String clusterId; 
            private String connectionInfo; 
            private Long createdTime; 
            private String dataSourceId; 
            private String dataSourceName; 
            private String dataSourceType; 
            private String exclude; 
            private String include; 
            private Boolean indexAvailable; 
            private String indexLevel; 
            private Boolean indexUpdateTime; 
            private Boolean indexing; 
            private String options; 
            private java.util.List<String> paths; 
            private String planId; 
            private String schedule; 
            private String speedLimit; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.clusterId = model.clusterId;
                this.connectionInfo = model.connectionInfo;
                this.createdTime = model.createdTime;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceName = model.dataSourceName;
                this.dataSourceType = model.dataSourceType;
                this.exclude = model.exclude;
                this.include = model.include;
                this.indexAvailable = model.indexAvailable;
                this.indexLevel = model.indexLevel;
                this.indexUpdateTime = model.indexUpdateTime;
                this.indexing = model.indexing;
                this.options = model.options;
                this.paths = model.paths;
                this.planId = model.planId;
                this.schedule = model.schedule;
                this.speedLimit = model.speedLimit;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The client group ID used to access the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-0003jyv******fsku5m</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The connection information of the data source, which describes how to access the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;dataServerAddresses&quot;: [
             *         {
             *             &quot;host&quot;: &quot;123.123.123.123&quot;,
             *             &quot;port&quot;: &quot;8080&quot;
             *         }
             *     ],
             *     &quot;sharePath&quot;: &quot;/share&quot;,
             *     &quot;mountOptions&quot;: &quot;vers=3&quot;,
             *     &quot;fileSystemType&quot;: &quot;nfs&quot;
             * }</p>
             */
            public Builder connectionInfo(String connectionInfo) {
                this.connectionInfo = connectionInfo;
                return this;
            }

            /**
             * <p>The time when the data source was created. UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1770257653</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-000******2nqeo</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMON_NAS</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMON_NAS</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The paths excluded from analysis. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *       &quot;/home/alice/log&quot;
             * ]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The paths included in the analysis. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *       &quot;/home/alice&quot;,
             *       &quot;/home/bob&quot;
             * ]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>Whether the index is available. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder indexAvailable(Boolean indexAvailable) {
                this.indexAvailable = indexAvailable;
                return this;
            }

            /**
             * <p>The index level. Valid values:</p>
             * <ul>
             * <li><p>OFF: No index is created.</p>
             * </li>
             * <li><p>META: A metadata index is created.</p>
             * </li>
             * <li><p>ALL: A full-text index is created. This value is deprecated.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>META</p>
             */
            public Builder indexLevel(String indexLevel) {
                this.indexLevel = indexLevel;
                return this;
            }

            /**
             * <p>The time when the index was last updated. UNIX timestamp in seconds. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>1745454604</p>
             */
            public Builder indexUpdateTime(Boolean indexUpdateTime) {
                this.indexUpdateTime = indexUpdateTime;
                return this;
            }

            /**
             * <p>Whether an index is being built. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder indexing(Boolean indexing) {
                this.indexing = indexing;
                return this;
            }

            /**
             * <p>The analysis options. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The analysis paths. Archiving feature only.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The analysis plan ID. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-123***7890</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The analysis schedule. Archiving feature only. Format: <code>I|{startTime}|{interval}</code>. <code>{startTime}</code> is the start time as a UNIX timestamp in seconds. <code>{interval}</code> is the execution interval in ISO 8601 format. Example: PT1H for one hour, P1D for one day.</p>
             * 
             * <strong>example:</strong>
             * <p>I|1729493847|P1D</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The rate limit configuration. Archiving feature only.</p>
             * 
             * <strong>example:</strong>
             * <p>6:21:10240</p>
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * <p>The time when the data source was last updated. UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1745454604</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
}
