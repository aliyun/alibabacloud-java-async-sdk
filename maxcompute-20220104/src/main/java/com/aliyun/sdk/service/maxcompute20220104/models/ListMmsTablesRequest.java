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
 * {@link ListMmsTablesRequest} extends {@link RequestModel}
 *
 * <p>ListMmsTablesRequest</p>
 */
public class ListMmsTablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sorter")
    private Sorter sorter;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dbId")
    private Long dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hasPartitions")
    private Boolean hasPartitions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lastDdlTimeEnd")
    private String lastDdlTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lastDdlTimeStart")
    private String lastDdlTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("onlyName")
    private Boolean onlyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private java.util.List<String> status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListMmsTablesRequest(Builder builder) {
        super(builder);
        this.sorter = builder.sorter;
        this.sourceId = builder.sourceId;
        this.dbId = builder.dbId;
        this.dbName = builder.dbName;
        this.hasPartitions = builder.hasPartitions;
        this.lastDdlTimeEnd = builder.lastDdlTimeEnd;
        this.lastDdlTimeStart = builder.lastDdlTimeStart;
        this.name = builder.name;
        this.onlyName = builder.onlyName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsTablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sorter
     */
    public Sorter getSorter() {
        return this.sorter;
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return hasPartitions
     */
    public Boolean getHasPartitions() {
        return this.hasPartitions;
    }

    /**
     * @return lastDdlTimeEnd
     */
    public String getLastDdlTimeEnd() {
        return this.lastDdlTimeEnd;
    }

    /**
     * @return lastDdlTimeStart
     */
    public String getLastDdlTimeStart() {
        return this.lastDdlTimeStart;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return onlyName
     */
    public Boolean getOnlyName() {
        return this.onlyName;
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
     * @return status
     */
    public java.util.List<String> getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListMmsTablesRequest, Builder> {
        private Sorter sorter; 
        private Long sourceId; 
        private Long dbId; 
        private String dbName; 
        private Boolean hasPartitions; 
        private String lastDdlTimeEnd; 
        private String lastDdlTimeStart; 
        private String name; 
        private Boolean onlyName; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<String> status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsTablesRequest request) {
            super(request);
            this.sorter = request.sorter;
            this.sourceId = request.sourceId;
            this.dbId = request.dbId;
            this.dbName = request.dbName;
            this.hasPartitions = request.hasPartitions;
            this.lastDdlTimeEnd = request.lastDdlTimeEnd;
            this.lastDdlTimeStart = request.lastDdlTimeStart;
            this.name = request.name;
            this.onlyName = request.onlyName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * sorter.
         */
        public Builder sorter(Sorter sorter) {
            this.putQueryParameter("sorter", sorter);
            this.sorter = sorter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * dbId.
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("dbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * hasPartitions.
         */
        public Builder hasPartitions(Boolean hasPartitions) {
            this.putQueryParameter("hasPartitions", hasPartitions);
            this.hasPartitions = hasPartitions;
            return this;
        }

        /**
         * lastDdlTimeEnd.
         */
        public Builder lastDdlTimeEnd(String lastDdlTimeEnd) {
            this.putQueryParameter("lastDdlTimeEnd", lastDdlTimeEnd);
            this.lastDdlTimeEnd = lastDdlTimeEnd;
            return this;
        }

        /**
         * lastDdlTimeStart.
         */
        public Builder lastDdlTimeStart(String lastDdlTimeStart) {
            this.putQueryParameter("lastDdlTimeStart", lastDdlTimeStart);
            this.lastDdlTimeStart = lastDdlTimeStart;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * onlyName.
         */
        public Builder onlyName(Boolean onlyName) {
            this.putQueryParameter("onlyName", onlyName);
            this.onlyName = onlyName;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(java.util.List<String> status) {
            String statusShrink = shrink(status, "status", "json");
            this.putQueryParameter("status", statusShrink);
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListMmsTablesRequest build() {
            return new ListMmsTablesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsTablesRequest} extends {@link TeaModel}
     *
     * <p>ListMmsTablesRequest</p>
     */
    public static class Sorter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("lastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("numRows")
        private String numRows;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        private Sorter(Builder builder) {
            this.lastDdlTime = builder.lastDdlTime;
            this.numRows = builder.numRows;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sorter create() {
            return builder().build();
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return numRows
         */
        public String getNumRows() {
            return this.numRows;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String lastDdlTime; 
            private String numRows; 
            private String size; 

            private Builder() {
            } 

            private Builder(Sorter model) {
                this.lastDdlTime = model.lastDdlTime;
                this.numRows = model.numRows;
                this.size = model.size;
            } 

            /**
             * lastDdlTime.
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * numRows.
             */
            public Builder numRows(String numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public Sorter build() {
                return new Sorter(this);
            } 

        } 

    }
}
