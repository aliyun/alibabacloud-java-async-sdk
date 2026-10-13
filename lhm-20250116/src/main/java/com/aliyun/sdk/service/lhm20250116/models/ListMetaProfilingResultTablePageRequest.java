// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaProfilingResultTablePageRequest} extends {@link RequestModel}
 *
 * <p>ListMetaProfilingResultTablePageRequest</p>
 */
public class ListMetaProfilingResultTablePageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentType")
    private Integer componentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataRange")
    private String dataRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSize")
    private Double dataSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataUnit")
    private String dataUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isPartitioned")
    private Integer isPartitioned;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isSummary")
    private Boolean isSummary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("migrationStatus")
    private String migrationStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("needTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListMetaProfilingResultTablePageRequest(Builder builder) {
        super(builder);
        this.componentType = builder.componentType;
        this.dataRange = builder.dataRange;
        this.dataSize = builder.dataSize;
        this.dataUnit = builder.dataUnit;
        this.dbName = builder.dbName;
        this.groupBy = builder.groupBy;
        this.isPartitioned = builder.isPartitioned;
        this.isSummary = builder.isSummary;
        this.migrationStatus = builder.migrationStatus;
        this.needTotalCount = builder.needTotalCount;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.tableName = builder.tableName;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingResultTablePageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentType
     */
    public Integer getComponentType() {
        return this.componentType;
    }

    /**
     * @return dataRange
     */
    public String getDataRange() {
        return this.dataRange;
    }

    /**
     * @return dataSize
     */
    public Double getDataSize() {
        return this.dataSize;
    }

    /**
     * @return dataUnit
     */
    public String getDataUnit() {
        return this.dataUnit;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return isPartitioned
     */
    public Integer getIsPartitioned() {
        return this.isPartitioned;
    }

    /**
     * @return isSummary
     */
    public Boolean getIsSummary() {
        return this.isSummary;
    }

    /**
     * @return migrationStatus
     */
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListMetaProfilingResultTablePageRequest, Builder> {
        private Integer componentType; 
        private String dataRange; 
        private Double dataSize; 
        private String dataUnit; 
        private String dbName; 
        private String groupBy; 
        private Integer isPartitioned; 
        private Boolean isSummary; 
        private String migrationStatus; 
        private Boolean needTotalCount; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String tableName; 
        private Long taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaProfilingResultTablePageRequest request) {
            super(request);
            this.componentType = request.componentType;
            this.dataRange = request.dataRange;
            this.dataSize = request.dataSize;
            this.dataUnit = request.dataUnit;
            this.dbName = request.dbName;
            this.groupBy = request.groupBy;
            this.isPartitioned = request.isPartitioned;
            this.isSummary = request.isSummary;
            this.migrationStatus = request.migrationStatus;
            this.needTotalCount = request.needTotalCount;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.tableName = request.tableName;
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * <p>The identifier of the component (data source) type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder componentType(Integer componentType) {
            this.putBodyParameter("componentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>The filter condition for the data range.</p>
         * 
         * <strong>example:</strong>
         * <p>LAST_7_DAYS</p>
         */
        public Builder dataRange(String dataRange) {
            this.putBodyParameter("dataRange", dataRange);
            this.dataRange = dataRange;
            return this;
        }

        /**
         * <p>The threshold for filtering by data size. This parameter must be used together with dataUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1024.0</p>
         */
        public Builder dataSize(Double dataSize) {
            this.putBodyParameter("dataSize", dataSize);
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The unit of data size, such as GB or TB. This parameter must be used together with dataSize.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        public Builder dataUnit(String dataUnit) {
            this.putBodyParameter("dataUnit", dataUnit);
            this.dataUnit = dataUnit;
            return this;
        }

        /**
         * <p>The name of the database, which is used to filter results by database.</p>
         * 
         * <strong>example:</strong>
         * <p>ods</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The name of the group-by field, which is used for aggregate statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>dbName</p>
         */
        public Builder groupBy(String groupBy) {
            this.putBodyParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>Specifies whether to filter only partitioned tables.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isPartitioned(Integer isPartitioned) {
            this.putBodyParameter("isPartitioned", isPartitioned);
            this.isPartitioned = isPartitioned;
            return this;
        }

        /**
         * <p>Specifies whether to return only summary statistics.</p>
         */
        public Builder isSummary(Boolean isSummary) {
            this.putBodyParameter("isSummary", isSummary);
            this.isSummary = isSummary;
            return this;
        }

        /**
         * <p>The migration status, which is used to filter by migration progress or indicate the migration status of an object.</p>
         * 
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        public Builder migrationStatus(String migrationStatus) {
            this.putBodyParameter("migrationStatus", migrationStatus);
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of records.</p>
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putBodyParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * <p>The name of the order-by field.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort direction, such as ascending (ASC) or descending (DESC).</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of records to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the table, which is used to filter results by table name.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_order_detail</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the metadata profiling task, which is used to locate the profiling task to which this query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100256</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The identifier of the object type.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListMetaProfilingResultTablePageRequest build() {
            return new ListMetaProfilingResultTablePageRequest(this);
        } 

    } 

}
