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
 * {@link ListMmsDbsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsDbsResponseBody</p>
 */
public class ListMmsDbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsDbsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsDbsResponseBody create() {
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

        private Builder(ListMmsDbsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF3F9978-260F-5204-94BE-30A4E6B54443</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsDbsResponseBody build() {
            return new ListMmsDbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsDbsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsDbsResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("dstName")
        private String dstName;

        @com.aliyun.core.annotation.NameInMap("dstProjectName")
        private String dstProjectName;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("numRows")
        private Long numRows;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("partitions")
        private Integer partitions;

        @com.aliyun.core.annotation.NameInMap("partitionsDoing")
        private Integer partitionsDoing;

        @com.aliyun.core.annotation.NameInMap("partitionsDone")
        private Integer partitionsDone;

        @com.aliyun.core.annotation.NameInMap("partitionsFailed")
        private Integer partitionsFailed;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tables")
        private Integer tables;

        @com.aliyun.core.annotation.NameInMap("tablesDoing")
        private Integer tablesDoing;

        @com.aliyun.core.annotation.NameInMap("tablesDone")
        private Integer tablesDone;

        @com.aliyun.core.annotation.NameInMap("tablesFailed")
        private Integer tablesFailed;

        @com.aliyun.core.annotation.NameInMap("tablesPartDone")
        private Integer tablesPartDone;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Boolean updated;

        private ObjectList(Builder builder) {
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.dstName = builder.dstName;
            this.dstProjectName = builder.dstProjectName;
            this.extra = builder.extra;
            this.id = builder.id;
            this.lastDdlTime = builder.lastDdlTime;
            this.location = builder.location;
            this.name = builder.name;
            this.numRows = builder.numRows;
            this.owner = builder.owner;
            this.partitions = builder.partitions;
            this.partitionsDoing = builder.partitionsDoing;
            this.partitionsDone = builder.partitionsDone;
            this.partitionsFailed = builder.partitionsFailed;
            this.size = builder.size;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.status = builder.status;
            this.tables = builder.tables;
            this.tablesDoing = builder.tablesDoing;
            this.tablesDone = builder.tablesDone;
            this.tablesFailed = builder.tablesFailed;
            this.tablesPartDone = builder.tablesPartDone;
            this.updateTime = builder.updateTime;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dstName
         */
        public String getDstName() {
            return this.dstName;
        }

        /**
         * @return dstProjectName
         */
        public String getDstProjectName() {
            return this.dstProjectName;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numRows
         */
        public Long getNumRows() {
            return this.numRows;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return partitions
         */
        public Integer getPartitions() {
            return this.partitions;
        }

        /**
         * @return partitionsDoing
         */
        public Integer getPartitionsDoing() {
            return this.partitionsDoing;
        }

        /**
         * @return partitionsDone
         */
        public Integer getPartitionsDone() {
            return this.partitionsDone;
        }

        /**
         * @return partitionsFailed
         */
        public Integer getPartitionsFailed() {
            return this.partitionsFailed;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tables
         */
        public Integer getTables() {
            return this.tables;
        }

        /**
         * @return tablesDoing
         */
        public Integer getTablesDoing() {
            return this.tablesDoing;
        }

        /**
         * @return tablesDone
         */
        public Integer getTablesDone() {
            return this.tablesDone;
        }

        /**
         * @return tablesFailed
         */
        public Integer getTablesFailed() {
            return this.tablesFailed;
        }

        /**
         * @return tablesPartDone
         */
        public Integer getTablesPartDone() {
            return this.tablesPartDone;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updated
         */
        public Boolean getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean deleted; 
            private String description; 
            private String dstName; 
            private String dstProjectName; 
            private String extra; 
            private Long id; 
            private String lastDdlTime; 
            private String location; 
            private String name; 
            private Long numRows; 
            private String owner; 
            private Integer partitions; 
            private Integer partitionsDoing; 
            private Integer partitionsDone; 
            private Integer partitionsFailed; 
            private Long size; 
            private Long sourceId; 
            private String sourceName; 
            private String status; 
            private Integer tables; 
            private Integer tablesDoing; 
            private Integer tablesDone; 
            private Integer tablesFailed; 
            private Integer tablesPartDone; 
            private String updateTime; 
            private Boolean updated; 

            private Builder() {
            } 

            private Builder(ObjectList model) {
                this.createTime = model.createTime;
                this.deleted = model.deleted;
                this.description = model.description;
                this.dstName = model.dstName;
                this.dstProjectName = model.dstProjectName;
                this.extra = model.extra;
                this.id = model.id;
                this.lastDdlTime = model.lastDdlTime;
                this.location = model.location;
                this.name = model.name;
                this.numRows = model.numRows;
                this.owner = model.owner;
                this.partitions = model.partitions;
                this.partitionsDoing = model.partitionsDoing;
                this.partitionsDone = model.partitionsDone;
                this.partitionsFailed = model.partitionsFailed;
                this.size = model.size;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.status = model.status;
                this.tables = model.tables;
                this.tablesDoing = model.tablesDoing;
                this.tablesDone = model.tablesDone;
                this.tablesFailed = model.tablesFailed;
                this.tablesPartDone = model.tablesPartDone;
                this.updateTime = model.updateTime;
                this.updated = model.updated;
            } 

            /**
             * <p>Time created in MMS</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Whether deleted</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>Database description</p>
             * 
             * <strong>example:</strong>
             * <p>for mms test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The MaxCompute schema corresponding to the source database. If the target MaxCompute project does not have a schema layer enabled, this value is null. By default, it is consistent with the source database name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dstName(String dstName) {
                this.dstName = dstName;
                return this;
            }

            /**
             * <p>Target MaxCompute project name</p>
             * 
             * <strong>example:</strong>
             * <p>mms_test</p>
             */
            public Builder dstProjectName(String dstProjectName) {
                this.dstProjectName = dstProjectName;
                return this;
            }

            /**
             * <p>Other information stored in JSON format</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>Database ID</p>
             * 
             * <strong>example:</strong>
             * <p>1530</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Last DDL Time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * <p>Database storage location</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs://master-1-1.c-6fc187819ed6bae0.cn-shanghai.emr.aliyuncs.com:9000/user/hive/warehouse</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>Database name</p>
             * 
             * <strong>example:</strong>
             * <p>mms_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of database data rows</p>
             * 
             * <strong>example:</strong>
             * <p>23232</p>
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * <p>Database owner</p>
             * 
             * <strong>example:</strong>
             * <p>System user</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Number of partitions</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder partitions(Integer partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * <p>Partitions being migrated</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder partitionsDoing(Integer partitionsDoing) {
                this.partitionsDoing = partitionsDoing;
                return this;
            }

            /**
             * <p>Partitions migrated</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder partitionsDone(Integer partitionsDone) {
                this.partitionsDone = partitionsDone;
                return this;
            }

            /**
             * <p>Failed partitions</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder partitionsFailed(Integer partitionsFailed) {
                this.partitionsFailed = partitionsFailed;
                return this;
            }

            /**
             * <p>Database data size in bytes</p>
             * 
             * <strong>example:</strong>
             * <p>2342342</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2000015</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>Data source name</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>Migration status: INIT, DOING, FAILED, DONE, PART_DONE</p>
             * 
             * <strong>example:</strong>
             * <p>DOING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Number of tables</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder tables(Integer tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>Tables being migrated</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder tablesDoing(Integer tablesDoing) {
                this.tablesDoing = tablesDoing;
                return this;
            }

            /**
             * <p>Tables migrated</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder tablesDone(Integer tablesDone) {
                this.tablesDone = tablesDone;
                return this;
            }

            /**
             * <p>Failed tables</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder tablesFailed(Integer tablesFailed) {
                this.tablesFailed = tablesFailed;
                return this;
            }

            /**
             * <p>Partially migrated tables</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder tablesPartDone(Integer tablesPartDone) {
                this.tablesPartDone = tablesPartDone;
                return this;
            }

            /**
             * <p>Latest data update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Whether data is updated</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder updated(Boolean updated) {
                this.updated = updated;
                return this;
            }

            public ObjectList build() {
                return new ObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsDbsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsDbsResponseBody</p>
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
             * <p>Database list</p>
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
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
