// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableBasicInfoRequest</p>
 */
public class GetMetaTableBasicInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
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
    @NameInMap("Extension")
    private Boolean extension;

    @Query
    @NameInMap("TableGuid")
    private String tableGuid;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private GetMetaTableBasicInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.extension = builder.extension;
        this.tableGuid = builder.tableGuid;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableBasicInfoRequest create() {
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
     * @return extension
     */
    public Boolean getExtension() {
        return this.extension;
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

    public static final class Builder extends Request.Builder<GetMetaTableBasicInfoRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String dataSourceType; 
        private String databaseName; 
        private Boolean extension; 
        private String tableGuid; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableBasicInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.dataSourceType = request.dataSourceType;
            this.databaseName = request.databaseName;
            this.extension = request.extension;
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
         * The name of the metatable in the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can call the [GetMetaDBTableList](~~173916~~) operation to query the name of the metatable.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The type of the data source. Valid values: odps and emr.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder extension(Boolean extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can call the [ListMetaDB](~~185662~~) operation to query the name of the metadatabase.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * Specifies whether to include extended fields in query results.
         * <p>
         * 
         * The extended fields include ReadCount, FavoriteCount, and ViewCount.
         * 
         * This parameter takes effect only if you set the DataSourceType parameter to odps.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetMetaTableBasicInfoRequest build() {
            return new GetMetaTableBasicInfoRequest(this);
        } 

    } 

}
