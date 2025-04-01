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
 * {@link GetMmsDbResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsDbResponseBody</p>
 */
public class GetMmsDbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsDbResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsDbResponseBody create() {
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

        private Builder(GetMmsDbResponseBody model) {
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

        public GetMmsDbResponseBody build() {
            return new GetMmsDbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsDbResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsDbResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("updated")
        private Boolean updated;

        private Data(Builder builder) {
            this.description = builder.description;
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
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return updated
         */
        public Boolean getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String description; 
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
            private Boolean updated; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
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
                this.updated = model.updated;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
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
             * <p>last ddl time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * numRows.
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * partitions.
             */
            public Builder partitions(Integer partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * partitionsDoing.
             */
            public Builder partitionsDoing(Integer partitionsDoing) {
                this.partitionsDoing = partitionsDoing;
                return this;
            }

            /**
             * partitionsDone.
             */
            public Builder partitionsDone(Integer partitionsDone) {
                this.partitionsDone = partitionsDone;
                return this;
            }

            /**
             * partitionsFailed.
             */
            public Builder partitionsFailed(Integer partitionsFailed) {
                this.partitionsFailed = partitionsFailed;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tables.
             */
            public Builder tables(Integer tables) {
                this.tables = tables;
                return this;
            }

            /**
             * tablesDoing.
             */
            public Builder tablesDoing(Integer tablesDoing) {
                this.tablesDoing = tablesDoing;
                return this;
            }

            /**
             * tablesDone.
             */
            public Builder tablesDone(Integer tablesDone) {
                this.tablesDone = tablesDone;
                return this;
            }

            /**
             * tablesFailed.
             */
            public Builder tablesFailed(Integer tablesFailed) {
                this.tablesFailed = tablesFailed;
                return this;
            }

            /**
             * tablesPartDone.
             */
            public Builder tablesPartDone(Integer tablesPartDone) {
                this.tablesPartDone = tablesPartDone;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Boolean updated) {
                this.updated = updated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
