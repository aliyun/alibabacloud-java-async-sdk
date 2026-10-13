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
 * {@link ListMetaProfilingResultUdfPageRequest} extends {@link RequestModel}
 *
 * <p>ListMetaProfilingResultUdfPageRequest</p>
 */
public class ListMetaProfilingResultUdfPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("catalogName")
    private String catalogName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentType")
    private Integer componentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("funcName")
    private String funcName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isSummary")
    private Boolean isSummary;

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
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private ListMetaProfilingResultUdfPageRequest(Builder builder) {
        super(builder);
        this.catalogName = builder.catalogName;
        this.componentType = builder.componentType;
        this.dbName = builder.dbName;
        this.funcName = builder.funcName;
        this.groupBy = builder.groupBy;
        this.isSummary = builder.isSummary;
        this.needTotalCount = builder.needTotalCount;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingResultUdfPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return componentType
     */
    public Integer getComponentType() {
        return this.componentType;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return funcName
     */
    public String getFuncName() {
        return this.funcName;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return isSummary
     */
    public Boolean getIsSummary() {
        return this.isSummary;
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListMetaProfilingResultUdfPageRequest, Builder> {
        private String catalogName; 
        private Integer componentType; 
        private String dbName; 
        private String funcName; 
        private String groupBy; 
        private Boolean isSummary; 
        private Boolean needTotalCount; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaProfilingResultUdfPageRequest request) {
            super(request);
            this.catalogName = request.catalogName;
            this.componentType = request.componentType;
            this.dbName = request.dbName;
            this.funcName = request.funcName;
            this.groupBy = request.groupBy;
            this.isSummary = request.isSummary;
            this.needTotalCount = request.needTotalCount;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
        } 

        /**
         * catalogName.
         */
        public Builder catalogName(String catalogName) {
            this.putBodyParameter("catalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * componentType.
         */
        public Builder componentType(Integer componentType) {
            this.putBodyParameter("componentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * funcName.
         */
        public Builder funcName(String funcName) {
            this.putBodyParameter("funcName", funcName);
            this.funcName = funcName;
            return this;
        }

        /**
         * groupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putBodyParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * isSummary.
         */
        public Builder isSummary(Boolean isSummary) {
            this.putBodyParameter("isSummary", isSummary);
            this.isSummary = isSummary;
            return this;
        }

        /**
         * needTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putBodyParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100256</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListMetaProfilingResultUdfPageRequest build() {
            return new ListMetaProfilingResultUdfPageRequest(this);
        } 

    } 

}
