// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMetaColumnLineageRequest} extends {@link RequestModel}
 *
 * <p>GetMetaColumnLineageRequest</p>
 */
public class GetMetaColumnLineageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnGuid")
    private String columnGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private GetMetaColumnLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.columnGuid = builder.columnGuid;
        this.columnName = builder.columnName;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.direction = builder.direction;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaColumnLineageRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return columnGuid
     */
    public String getColumnGuid() {
        return this.columnGuid;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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

    public static final class Builder extends Request.Builder<GetMetaColumnLineageRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String columnGuid; 
        private String columnName; 
        private String dataSourceType; 
        private String databaseName; 
        private String direction; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaColumnLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.columnGuid = request.columnGuid;
            this.columnName = request.columnName;
            this.dataSourceType = request.dataSourceType;
            this.databaseName = request.databaseName;
            this.direction = request.direction;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.tableName = request.tableName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the E-MapReduce (EMR) cluster. Configure this parameter only when you query data in an EMR compute engine instance.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The unique identifier of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name.column_name</p>
         */
        public Builder columnGuid(String columnGuid) {
            this.putQueryParameter("ColumnGuid", columnGuid);
            this.columnGuid = columnGuid;
            return this;
        }

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values: odps and emr.</p>
         * 
         * <strong>example:</strong>
         * <p>emr</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>Specifies whether to query the ancestor or descendant lineage of the field. The value up indicates the ancestor lineage. The value down indicates the descendant lineage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetMetaColumnLineageRequest build() {
            return new GetMetaColumnLineageRequest(this);
        } 

    } 

}
