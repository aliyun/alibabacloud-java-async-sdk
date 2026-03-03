// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link OperateSupabaseForAdminRequest} extends {@link RequestModel}
 *
 * <p>OperateSupabaseForAdminRequest</p>
 */
public class OperateSupabaseForAdminRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteSql")
    private String executeSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByClause")
    private String orderByClause;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhereClause")
    private String whereClause;

    private OperateSupabaseForAdminRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.executeSql = builder.executeSql;
        this.operateType = builder.operateType;
        this.orderByClause = builder.orderByClause;
        this.orderColumn = builder.orderColumn;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.tableName = builder.tableName;
        this.userId = builder.userId;
        this.whereClause = builder.whereClause;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSupabaseForAdminRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return executeSql
     */
    public String getExecuteSql() {
        return this.executeSql;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return orderByClause
     */
    public String getOrderByClause() {
        return this.orderByClause;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return whereClause
     */
    public String getWhereClause() {
        return this.whereClause;
    }

    public static final class Builder extends Request.Builder<OperateSupabaseForAdminRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String executeSql; 
        private String operateType; 
        private String orderByClause; 
        private String orderColumn; 
        private String orderType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String tableName; 
        private String userId; 
        private String whereClause; 

        private Builder() {
            super();
        } 

        private Builder(OperateSupabaseForAdminRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.executeSql = request.executeSql;
            this.operateType = request.operateType;
            this.orderByClause = request.orderByClause;
            this.orderColumn = request.orderColumn;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.tableName = request.tableName;
            this.userId = request.userId;
            this.whereClause = request.whereClause;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801154628000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExecuteSql.
         */
        public Builder executeSql(String executeSql) {
            this.putQueryParameter("ExecuteSql", executeSql);
            this.executeSql = executeSql;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * OrderByClause.
         */
        public Builder orderByClause(String orderByClause) {
            this.putQueryParameter("OrderByClause", orderByClause);
            this.orderByClause = orderByClause;
            return this;
        }

        /**
         * OrderColumn.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WhereClause.
         */
        public Builder whereClause(String whereClause) {
            this.putQueryParameter("WhereClause", whereClause);
            this.whereClause = whereClause;
            return this;
        }

        @Override
        public OperateSupabaseForAdminRequest build() {
            return new OperateSupabaseForAdminRequest(this);
        } 

    } 

}
