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
 * {@link ListMmsPartitionsRequest} extends {@link RequestModel}
 *
 * <p>ListMmsPartitionsRequest</p>
 */
public class ListMmsPartitionsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("lastDdlTimeEnd")
    private String lastDdlTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lastDdlTimeStart")
    private String lastDdlTimeStart;

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
    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updated")
    private Boolean updated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ListMmsPartitionsRequest(Builder builder) {
        super(builder);
        this.sorter = builder.sorter;
        this.sourceId = builder.sourceId;
        this.dbId = builder.dbId;
        this.dbName = builder.dbName;
        this.lastDdlTimeEnd = builder.lastDdlTimeEnd;
        this.lastDdlTimeStart = builder.lastDdlTimeStart;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.tableName = builder.tableName;
        this.updated = builder.updated;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsPartitionsRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return updated
     */
    public Boolean getUpdated() {
        return this.updated;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<ListMmsPartitionsRequest, Builder> {
        private Sorter sorter; 
        private Long sourceId; 
        private Long dbId; 
        private String dbName; 
        private String lastDdlTimeEnd; 
        private String lastDdlTimeStart; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<String> status; 
        private String tableName; 
        private Boolean updated; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsPartitionsRequest request) {
            super(request);
            this.sorter = request.sorter;
            this.sourceId = request.sourceId;
            this.dbId = request.dbId;
            this.dbName = request.dbName;
            this.lastDdlTimeEnd = request.lastDdlTimeEnd;
            this.lastDdlTimeStart = request.lastDdlTimeStart;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.tableName = request.tableName;
            this.updated = request.updated;
            this.value = request.value;
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
         * <p>200018</p>
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
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * updated.
         */
        public Builder updated(Boolean updated) {
            this.putQueryParameter("updated", updated);
            this.updated = updated;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.putQueryParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public ListMmsPartitionsRequest build() {
            return new ListMmsPartitionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsPartitionsRequest} extends {@link TeaModel}
     *
     * <p>ListMmsPartitionsRequest</p>
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
