// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableLineageRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableLineageRequest</p>
 */
public class GetMetaTableLineageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("NextPrimaryKey")
    private String nextPrimaryKey;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TableGuid")
    private String tableGuid;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private GetMetaTableLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.direction = builder.direction;
        this.nextPrimaryKey = builder.nextPrimaryKey;
        this.pageSize = builder.pageSize;
        this.tableGuid = builder.tableGuid;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableLineageRequest create() {
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
     * @return nextPrimaryKey
     */
    public String getNextPrimaryKey() {
        return this.nextPrimaryKey;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<GetMetaTableLineageRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String dataSourceType; 
        private String databaseName; 
        private String direction; 
        private String nextPrimaryKey; 
        private Integer pageSize; 
        private String tableGuid; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.dataSourceType = request.dataSourceType;
            this.databaseName = request.databaseName;
            this.direction = request.direction;
            this.nextPrimaryKey = request.nextPrimaryKey;
            this.pageSize = request.pageSize;
            this.tableGuid = request.tableGuid;
            this.tableName = request.tableName;
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
         * The ID of the E-MapReduce (EMR) cluster. Set this parameter only when you query data in an EMR compute engine instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the data source. Valid values: odps and emr.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The name of the metadatabase.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Specifies whether to query the ancestor or descendant lineage of the field. The value up indicates the ancestor lineage. The value down indicates the descendant lineage.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The logic of paging. Set this parameter based on the value of the response parameter NextPrimaryKey when the value of the response parameter HasNext is true in the last query.
         */
        public Builder nextPrimaryKey(String nextPrimaryKey) {
            this.putQueryParameter("NextPrimaryKey", nextPrimaryKey);
            this.nextPrimaryKey = nextPrimaryKey;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The GUID of the metatable.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * The name of the metatable.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetMetaTableLineageRequest build() {
            return new GetMetaTableLineageRequest(this);
        } 

    } 

}
