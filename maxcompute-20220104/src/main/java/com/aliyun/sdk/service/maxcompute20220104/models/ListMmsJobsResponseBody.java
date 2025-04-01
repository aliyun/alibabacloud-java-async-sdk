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
 * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsJobsResponseBody</p>
 */
public class ListMmsJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsJobsResponseBody create() {
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

        private Builder(ListMmsJobsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsJobsResponseBody build() {
            return new ListMmsJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsJobsResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columnMapping")
        private java.util.Map<String, String> columnMapping;

        @com.aliyun.core.annotation.NameInMap("enableVerification")
        private Boolean enableVerification;

        @com.aliyun.core.annotation.NameInMap("increment")
        private Boolean increment;

        @com.aliyun.core.annotation.NameInMap("others")
        private java.util.Map<String, ?> others;

        @com.aliyun.core.annotation.NameInMap("partitionFilters")
        private java.util.Map<String, String> partitionFilters;

        @com.aliyun.core.annotation.NameInMap("partitions")
        private java.util.List<Long> partitions;

        @com.aliyun.core.annotation.NameInMap("schemaOnly")
        private Boolean schemaOnly;

        @com.aliyun.core.annotation.NameInMap("tableBlackList")
        private java.util.List<String> tableBlackList;

        @com.aliyun.core.annotation.NameInMap("tableMapping")
        private java.util.Map<String, String> tableMapping;

        @com.aliyun.core.annotation.NameInMap("tableWhiteList")
        private java.util.List<String> tableWhiteList;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List<String> tables;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("tunnelQuota")
        private String tunnelQuota;

        private Config(Builder builder) {
            this.columnMapping = builder.columnMapping;
            this.enableVerification = builder.enableVerification;
            this.increment = builder.increment;
            this.others = builder.others;
            this.partitionFilters = builder.partitionFilters;
            this.partitions = builder.partitions;
            this.schemaOnly = builder.schemaOnly;
            this.tableBlackList = builder.tableBlackList;
            this.tableMapping = builder.tableMapping;
            this.tableWhiteList = builder.tableWhiteList;
            this.tables = builder.tables;
            this.taskType = builder.taskType;
            this.tunnelQuota = builder.tunnelQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return columnMapping
         */
        public java.util.Map<String, String> getColumnMapping() {
            return this.columnMapping;
        }

        /**
         * @return enableVerification
         */
        public Boolean getEnableVerification() {
            return this.enableVerification;
        }

        /**
         * @return increment
         */
        public Boolean getIncrement() {
            return this.increment;
        }

        /**
         * @return others
         */
        public java.util.Map<String, ?> getOthers() {
            return this.others;
        }

        /**
         * @return partitionFilters
         */
        public java.util.Map<String, String> getPartitionFilters() {
            return this.partitionFilters;
        }

        /**
         * @return partitions
         */
        public java.util.List<Long> getPartitions() {
            return this.partitions;
        }

        /**
         * @return schemaOnly
         */
        public Boolean getSchemaOnly() {
            return this.schemaOnly;
        }

        /**
         * @return tableBlackList
         */
        public java.util.List<String> getTableBlackList() {
            return this.tableBlackList;
        }

        /**
         * @return tableMapping
         */
        public java.util.Map<String, String> getTableMapping() {
            return this.tableMapping;
        }

        /**
         * @return tableWhiteList
         */
        public java.util.List<String> getTableWhiteList() {
            return this.tableWhiteList;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return tunnelQuota
         */
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        public static final class Builder {
            private java.util.Map<String, String> columnMapping; 
            private Boolean enableVerification; 
            private Boolean increment; 
            private java.util.Map<String, ?> others; 
            private java.util.Map<String, String> partitionFilters; 
            private java.util.List<Long> partitions; 
            private Boolean schemaOnly; 
            private java.util.List<String> tableBlackList; 
            private java.util.Map<String, String> tableMapping; 
            private java.util.List<String> tableWhiteList; 
            private java.util.List<String> tables; 
            private String taskType; 
            private String tunnelQuota; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.columnMapping = model.columnMapping;
                this.enableVerification = model.enableVerification;
                this.increment = model.increment;
                this.others = model.others;
                this.partitionFilters = model.partitionFilters;
                this.partitions = model.partitions;
                this.schemaOnly = model.schemaOnly;
                this.tableBlackList = model.tableBlackList;
                this.tableMapping = model.tableMapping;
                this.tableWhiteList = model.tableWhiteList;
                this.tables = model.tables;
                this.taskType = model.taskType;
                this.tunnelQuota = model.tunnelQuota;
            } 

            /**
             * columnMapping.
             */
            public Builder columnMapping(java.util.Map<String, String> columnMapping) {
                this.columnMapping = columnMapping;
                return this;
            }

            /**
             * enableVerification.
             */
            public Builder enableVerification(Boolean enableVerification) {
                this.enableVerification = enableVerification;
                return this;
            }

            /**
             * increment.
             */
            public Builder increment(Boolean increment) {
                this.increment = increment;
                return this;
            }

            /**
             * others.
             */
            public Builder others(java.util.Map<String, ?> others) {
                this.others = others;
                return this;
            }

            /**
             * partitionFilters.
             */
            public Builder partitionFilters(java.util.Map<String, String> partitionFilters) {
                this.partitionFilters = partitionFilters;
                return this;
            }

            /**
             * partitions.
             */
            public Builder partitions(java.util.List<Long> partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * schemaOnly.
             */
            public Builder schemaOnly(Boolean schemaOnly) {
                this.schemaOnly = schemaOnly;
                return this;
            }

            /**
             * tableBlackList.
             */
            public Builder tableBlackList(java.util.List<String> tableBlackList) {
                this.tableBlackList = tableBlackList;
                return this;
            }

            /**
             * tableMapping.
             */
            public Builder tableMapping(java.util.Map<String, String> tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * tableWhiteList.
             */
            public Builder tableWhiteList(java.util.List<String> tableWhiteList) {
                this.tableWhiteList = tableWhiteList;
                return this;
            }

            /**
             * tables.
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * tunnelQuota.
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsJobsResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dstDbName")
        private String dstDbName;

        @com.aliyun.core.annotation.NameInMap("dstSchemaName")
        private String dstSchemaName;

        @com.aliyun.core.annotation.NameInMap("eta")
        private String eta;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("srcDbName")
        private String srcDbName;

        @com.aliyun.core.annotation.NameInMap("srcSchemaName")
        private String srcSchemaName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("stopped")
        private Boolean stopped;

        @com.aliyun.core.annotation.NameInMap("taskDone")
        private Integer taskDone;

        @com.aliyun.core.annotation.NameInMap("taskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ObjectList(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dbId = builder.dbId;
            this.dstDbName = builder.dstDbName;
            this.dstSchemaName = builder.dstSchemaName;
            this.eta = builder.eta;
            this.id = builder.id;
            this.name = builder.name;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.srcDbName = builder.srcDbName;
            this.srcSchemaName = builder.srcSchemaName;
            this.status = builder.status;
            this.stopped = builder.stopped;
            this.taskDone = builder.taskDone;
            this.taskNum = builder.taskNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dstDbName
         */
        public String getDstDbName() {
            return this.dstDbName;
        }

        /**
         * @return dstSchemaName
         */
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        /**
         * @return eta
         */
        public String getEta() {
            return this.eta;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return srcDbName
         */
        public String getSrcDbName() {
            return this.srcDbName;
        }

        /**
         * @return srcSchemaName
         */
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopped
         */
        public Boolean getStopped() {
            return this.stopped;
        }

        /**
         * @return taskDone
         */
        public Integer getTaskDone() {
            return this.taskDone;
        }

        /**
         * @return taskNum
         */
        public Integer getTaskNum() {
            return this.taskNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Config config; 
            private String createTime; 
            private Long dbId; 
            private String dstDbName; 
            private String dstSchemaName; 
            private String eta; 
            private Long id; 
            private String name; 
            private Long sourceId; 
            private String sourceName; 
            private String srcDbName; 
            private String srcSchemaName; 
            private String status; 
            private Boolean stopped; 
            private Integer taskDone; 
            private Integer taskNum; 
            private String type; 

            private Builder() {
            } 

            private Builder(ObjectList model) {
                this.config = model.config;
                this.createTime = model.createTime;
                this.dbId = model.dbId;
                this.dstDbName = model.dstDbName;
                this.dstSchemaName = model.dstSchemaName;
                this.eta = model.eta;
                this.id = model.id;
                this.name = model.name;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.srcDbName = model.srcDbName;
                this.srcSchemaName = model.srcSchemaName;
                this.status = model.status;
                this.stopped = model.stopped;
                this.taskDone = model.taskDone;
                this.taskNum = model.taskNum;
                this.type = model.type;
            } 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * dstDbName.
             */
            public Builder dstDbName(String dstDbName) {
                this.dstDbName = dstDbName;
                return this;
            }

            /**
             * dstSchemaName.
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * eta.
             */
            public Builder eta(String eta) {
                this.eta = eta;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * srcDbName.
             */
            public Builder srcDbName(String srcDbName) {
                this.srcDbName = srcDbName;
                return this;
            }

            /**
             * srcSchemaName.
             */
            public Builder srcSchemaName(String srcSchemaName) {
                this.srcSchemaName = srcSchemaName;
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
             * stopped.
             */
            public Builder stopped(Boolean stopped) {
                this.stopped = stopped;
                return this;
            }

            /**
             * taskDone.
             */
            public Builder taskDone(Integer taskDone) {
                this.taskDone = taskDone;
                return this;
            }

            /**
             * taskNum.
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * type.
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
     * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsJobsResponseBody</p>
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
             * objectList.
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
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
