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
 * {@link CheckMetaPartitionRequest} extends {@link RequestModel}
 *
 * <p>CheckMetaPartitionRequest</p>
 */
public class CheckMetaPartitionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Partition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    private String tableGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private CheckMetaPartitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.partition = builder.partition;
        this.tableGuid = builder.tableGuid;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMetaPartitionRequest create() {
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
     * @return partition
     */
    public String getPartition() {
        return this.partition;
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

    public static final class Builder extends Request.Builder<CheckMetaPartitionRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String dataSourceType; 
        private String databaseName; 
        private String partition; 
        private String tableGuid; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CheckMetaPartitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.dataSourceType = request.dataSourceType;
            this.databaseName = request.databaseName;
            this.partition = request.partition;
            this.tableGuid = request.tableGuid;
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
         * <p>This parameter is deprecated.</p>
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
         * <p>The type of the data source. Set the value to odps.</p>
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
         * <p>The name of the metadatabase.</p>
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
         * <p>The name of the partition in the MaxCompute metatable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=202005</p>
         */
        public Builder partition(String partition) {
            this.putQueryParameter("Partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>The GUID of the MaxCompute metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
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
        public CheckMetaPartitionRequest build() {
            return new CheckMetaPartitionRequest(this);
        } 

    } 

}
