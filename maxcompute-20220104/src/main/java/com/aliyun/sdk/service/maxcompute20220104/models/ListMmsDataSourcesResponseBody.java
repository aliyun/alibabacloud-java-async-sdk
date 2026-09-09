// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListMmsDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsDataSourcesResponseBody</p>
 */
public class ListMmsDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsDataSourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsDataSourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMmsDataSourcesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response payload.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1F7715F-D316-5AB6-BD02-5241083F4003</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsDataSourcesResponseBody build() {
            return new ListMmsDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsDataSourcesResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enums")
        private java.util.List<String> enums;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("placeHolder")
        private String placeHolder;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("subType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Config(Builder builder) {
            this.desc = builder.desc;
            this.enums = builder.enums;
            this.group = builder.group;
            this.key = builder.key;
            this.name = builder.name;
            this.placeHolder = builder.placeHolder;
            this.required = builder.required;
            this.subType = builder.subType;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enums
         */
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return placeHolder
         */
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<String> enums; 
            private String group; 
            private String key; 
            private String name; 
            private String placeHolder; 
            private Boolean required; 
            private String subType; 
            private String type; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.desc = model.desc;
                this.enums = model.enums;
                this.group = model.group;
                this.key = model.key;
                this.name = model.name;
                this.placeHolder = model.placeHolder;
                this.required = model.required;
                this.subType = model.subType;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The description of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Range partition table migration method</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>A list of valid values for the configuration.</p>
             */
            public Builder enums(java.util.List<String> enums) {
                this.enums = enums;
                return this;
            }

            /**
             * <p>The configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>basic_group</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The unique key for the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>bigquery.range.partition.migrate.type</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The configuration name.</p>
             * 
             * <strong>example:</strong>
             * <p>Range partition table migration method</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A placeholder for the configuration value.</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster or Partition</p>
             */
            public Builder placeHolder(String placeHolder) {
                this.placeHolder = placeHolder;
                return this;
            }

            /**
             * <p>Indicates whether the configuration is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The required file extension (for example, <code>.keytab</code>) when <code>type</code> is <code>file</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>.keytab</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The configuration type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The configuration value.</p>
             * 
             * <strong>example:</strong>
             * <p>Partition</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsDataSourcesResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentIsOnline")
        private Boolean agentIsOnline;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.List<Config> config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbNum")
        private Integer dbNum;

        @com.aliyun.core.annotation.NameInMap("dstProject")
        private String dstProject;

        @com.aliyun.core.annotation.NameInMap("dstProjects")
        private java.util.List<String> dstProjects;

        @com.aliyun.core.annotation.NameInMap("errMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastUpdateTime")
        private String lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networklink")
        private String networklink;

        @com.aliyun.core.annotation.NameInMap("partitionNum")
        private Integer partitionNum;

        @com.aliyun.core.annotation.NameInMap("partitionsDoingNum")
        private Integer partitionsDoingNum;

        @com.aliyun.core.annotation.NameInMap("partitionsDoneNum")
        private Integer partitionsDoneNum;

        @com.aliyun.core.annotation.NameInMap("partitionsFailedNum")
        private Integer partitionsFailedNum;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("scanErrMsg")
        private String scanErrMsg;

        @com.aliyun.core.annotation.NameInMap("scanId")
        private Long scanId;

        @com.aliyun.core.annotation.NameInMap("scanStatus")
        private String scanStatus;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tableNum")
        private Integer tableNum;

        @com.aliyun.core.annotation.NameInMap("tablesDoingNum")
        private Integer tablesDoingNum;

        @com.aliyun.core.annotation.NameInMap("tablesDoneNum")
        private Integer tablesDoneNum;

        @com.aliyun.core.annotation.NameInMap("tablesFailedNum")
        private Integer tablesFailedNum;

        @com.aliyun.core.annotation.NameInMap("tablesPartDoneNum")
        private Integer tablesPartDoneNum;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ObjectList(Builder builder) {
            this.agentIsOnline = builder.agentIsOnline;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dbNum = builder.dbNum;
            this.dstProject = builder.dstProject;
            this.dstProjects = builder.dstProjects;
            this.errMsg = builder.errMsg;
            this.id = builder.id;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.name = builder.name;
            this.networklink = builder.networklink;
            this.partitionNum = builder.partitionNum;
            this.partitionsDoingNum = builder.partitionsDoingNum;
            this.partitionsDoneNum = builder.partitionsDoneNum;
            this.partitionsFailedNum = builder.partitionsFailedNum;
            this.region = builder.region;
            this.scanErrMsg = builder.scanErrMsg;
            this.scanId = builder.scanId;
            this.scanStatus = builder.scanStatus;
            this.status = builder.status;
            this.tableNum = builder.tableNum;
            this.tablesDoingNum = builder.tablesDoingNum;
            this.tablesDoneNum = builder.tablesDoneNum;
            this.tablesFailedNum = builder.tablesFailedNum;
            this.tablesPartDoneNum = builder.tablesPartDoneNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
            return builder().build();
        }

        /**
         * @return agentIsOnline
         */
        public Boolean getAgentIsOnline() {
            return this.agentIsOnline;
        }

        /**
         * @return config
         */
        public java.util.List<Config> getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbNum
         */
        public Integer getDbNum() {
            return this.dbNum;
        }

        /**
         * @return dstProject
         */
        public String getDstProject() {
            return this.dstProject;
        }

        /**
         * @return dstProjects
         */
        public java.util.List<String> getDstProjects() {
            return this.dstProjects;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastUpdateTime
         */
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networklink
         */
        public String getNetworklink() {
            return this.networklink;
        }

        /**
         * @return partitionNum
         */
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        /**
         * @return partitionsDoingNum
         */
        public Integer getPartitionsDoingNum() {
            return this.partitionsDoingNum;
        }

        /**
         * @return partitionsDoneNum
         */
        public Integer getPartitionsDoneNum() {
            return this.partitionsDoneNum;
        }

        /**
         * @return partitionsFailedNum
         */
        public Integer getPartitionsFailedNum() {
            return this.partitionsFailedNum;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return scanErrMsg
         */
        public String getScanErrMsg() {
            return this.scanErrMsg;
        }

        /**
         * @return scanId
         */
        public Long getScanId() {
            return this.scanId;
        }

        /**
         * @return scanStatus
         */
        public String getScanStatus() {
            return this.scanStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableNum
         */
        public Integer getTableNum() {
            return this.tableNum;
        }

        /**
         * @return tablesDoingNum
         */
        public Integer getTablesDoingNum() {
            return this.tablesDoingNum;
        }

        /**
         * @return tablesDoneNum
         */
        public Integer getTablesDoneNum() {
            return this.tablesDoneNum;
        }

        /**
         * @return tablesFailedNum
         */
        public Integer getTablesFailedNum() {
            return this.tablesFailedNum;
        }

        /**
         * @return tablesPartDoneNum
         */
        public Integer getTablesPartDoneNum() {
            return this.tablesPartDoneNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean agentIsOnline; 
            private java.util.List<Config> config; 
            private String createTime; 
            private Integer dbNum; 
            private String dstProject; 
            private java.util.List<String> dstProjects; 
            private String errMsg; 
            private Long id; 
            private String lastUpdateTime; 
            private String name; 
            private String networklink; 
            private Integer partitionNum; 
            private Integer partitionsDoingNum; 
            private Integer partitionsDoneNum; 
            private Integer partitionsFailedNum; 
            private String region; 
            private String scanErrMsg; 
            private Long scanId; 
            private String scanStatus; 
            private String status; 
            private Integer tableNum; 
            private Integer tablesDoingNum; 
            private Integer tablesDoneNum; 
            private Integer tablesFailedNum; 
            private Integer tablesPartDoneNum; 
            private String type; 

            private Builder() {
            } 

            private Builder(ObjectList model) {
                this.agentIsOnline = model.agentIsOnline;
                this.config = model.config;
                this.createTime = model.createTime;
                this.dbNum = model.dbNum;
                this.dstProject = model.dstProject;
                this.dstProjects = model.dstProjects;
                this.errMsg = model.errMsg;
                this.id = model.id;
                this.lastUpdateTime = model.lastUpdateTime;
                this.name = model.name;
                this.networklink = model.networklink;
                this.partitionNum = model.partitionNum;
                this.partitionsDoingNum = model.partitionsDoingNum;
                this.partitionsDoneNum = model.partitionsDoneNum;
                this.partitionsFailedNum = model.partitionsFailedNum;
                this.region = model.region;
                this.scanErrMsg = model.scanErrMsg;
                this.scanId = model.scanId;
                this.scanStatus = model.scanStatus;
                this.status = model.status;
                this.tableNum = model.tableNum;
                this.tablesDoingNum = model.tablesDoingNum;
                this.tablesDoneNum = model.tablesDoneNum;
                this.tablesFailedNum = model.tablesFailedNum;
                this.tablesPartDoneNum = model.tablesPartDoneNum;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the agent for the data source instance is online.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder agentIsOnline(Boolean agentIsOnline) {
                this.agentIsOnline = agentIsOnline;
                return this;
            }

            /**
             * <p>A list of data source configurations.</p>
             */
            public Builder config(java.util.List<Config> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time the data source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 09:29:58</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of databases in the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dbNum(Integer dbNum) {
                this.dbNum = dbNum;
                return this;
            }

            /**
             * <p>The default destination MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>mms_test</p>
             */
            public Builder dstProject(String dstProject) {
                this.dstProject = dstProject;
                return this;
            }

            /**
             * <p>A list of destination MaxCompute projects.</p>
             */
            public Builder dstProjects(java.util.List<String> dstProjects) {
                this.dstProjects = dstProjects;
                return this;
            }

            /**
             * <p>The reason the data source instance failed to start or stop. This parameter is returned only if the <code>status</code> is <code>START_FAILED</code> or <code>STOP_FAILED</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>unexpected exception</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2000015</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last metadata synchronization time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:17</p>
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network connection, specified in the <code>VpcId:RegionId</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zebqp6uojhdla46677tl:cn-beijing</p>
             */
            public Builder networklink(String networklink) {
                this.networklink = networklink;
                return this;
            }

            /**
             * <p>The number of partitions in the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>10000000</p>
             */
            public Builder partitionNum(Integer partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * <p>The number of partitions currently being migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>2332</p>
             */
            public Builder partitionsDoingNum(Integer partitionsDoingNum) {
                this.partitionsDoingNum = partitionsDoingNum;
                return this;
            }

            /**
             * <p>The number of successfully migrated partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder partitionsDoneNum(Integer partitionsDoneNum) {
                this.partitionsDoneNum = partitionsDoneNum;
                return this;
            }

            /**
             * <p>The number of partitions that failed to migrate.</p>
             * 
             * <strong>example:</strong>
             * <p>2323</p>
             */
            public Builder partitionsFailedNum(Integer partitionsFailedNum) {
                this.partitionsFailedNum = partitionsFailedNum;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * scanErrMsg.
             */
            public Builder scanErrMsg(String scanErrMsg) {
                this.scanErrMsg = scanErrMsg;
                return this;
            }

            /**
             * <p>The ID of the metadata synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000253</p>
             */
            public Builder scanId(Long scanId) {
                this.scanId = scanId;
                return this;
            }

            /**
             * scanStatus.
             */
            public Builder scanStatus(String scanStatus) {
                this.scanStatus = scanStatus;
                return this;
            }

            /**
             * <p>The data source status.</p>
             * 
             * <strong>example:</strong>
             * <p>STARTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of tables in the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder tableNum(Integer tableNum) {
                this.tableNum = tableNum;
                return this;
            }

            /**
             * <p>The number of tables currently being migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder tablesDoingNum(Integer tablesDoingNum) {
                this.tablesDoingNum = tablesDoingNum;
                return this;
            }

            /**
             * <p>The number of successfully migrated tables.</p>
             * 
             * <strong>example:</strong>
             * <p>2323</p>
             */
            public Builder tablesDoneNum(Integer tablesDoneNum) {
                this.tablesDoneNum = tablesDoneNum;
                return this;
            }

            /**
             * <p>The number of tables that failed to migrate.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder tablesFailedNum(Integer tablesFailedNum) {
                this.tablesFailedNum = tablesFailedNum;
                return this;
            }

            /**
             * <p>The number of partially migrated tables.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder tablesPartDoneNum(Integer tablesPartDoneNum) {
                this.tablesPartDoneNum = tablesPartDoneNum;
                return this;
            }

            /**
             * <p>The data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGQUERY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ObjectList build() {
                return new ObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsDataSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objectList")
        private java.util.List<ObjectList> objectList;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.objectList = builder.objectList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return objectList
         */
        public java.util.List<ObjectList> getObjectList() {
            return this.objectList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ObjectList> objectList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.objectList = model.objectList;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The list of data sources.</p>
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of data sources.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
