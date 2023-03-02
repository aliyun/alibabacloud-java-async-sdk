// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTablePartitionRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTablePartitionRequest</p>
 */
public class GetMetaTablePartitionRequest extends Request {
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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortCriterion")
    private SortCriterion sortCriterion;

    @Query
    @NameInMap("TableGuid")
    private String tableGuid;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private GetMetaTablePartitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortCriterion = builder.sortCriterion;
        this.tableGuid = builder.tableGuid;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTablePartitionRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortCriterion
     */
    public SortCriterion getSortCriterion() {
        return this.sortCriterion;
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

    public static final class Builder extends Request.Builder<GetMetaTablePartitionRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String dataSourceType; 
        private String databaseName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private SortCriterion sortCriterion; 
        private String tableGuid; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTablePartitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.dataSourceType = request.dataSourceType;
            this.databaseName = request.databaseName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortCriterion = request.sortCriterion;
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
         * The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.
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
         * The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can call the [ListMetaDB](~~185662~~) operation to query the name of the metadatabase.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * The logic for sorting partitions in the metatable.
         */
        public Builder sortCriterion(SortCriterion sortCriterion) {
            String sortCriterionShrink = shrink(sortCriterion, "SortCriterion", "json");
            this.putQueryParameter("SortCriterion", sortCriterionShrink);
            this.sortCriterion = sortCriterion;
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
         * The name of the metatable in the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
         * <p>
         * 
         * You can call the [GetMetaDBTableList](~~173916~~) operation to query the name of the metatable.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetMetaTablePartitionRequest build() {
            return new GetMetaTablePartitionRequest(this);
        } 

    } 

    public static class SortCriterion extends TeaModel {
        @NameInMap("Order")
        private String order;

        @NameInMap("SortField")
        private String sortField;

        private SortCriterion(Builder builder) {
            this.order = builder.order;
            this.sortField = builder.sortField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortCriterion create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return sortField
         */
        public String getSortField() {
            return this.sortField;
        }

        public static final class Builder {
            private String order; 
            private String sortField; 

            /**
             * The order in which partitions in the metatable are sorted. Valid values: asc and desc. Default value: desc.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * The field that is used to sort partitions in the metatable. Valid values: name and modify_time.
             * <p>
             * 
             * By default, partitions in the metatable are sorted based on their creation time.
             */
            public Builder sortField(String sortField) {
                this.sortField = sortField;
                return this;
            }

            public SortCriterion build() {
                return new SortCriterion(this);
            } 

        } 

    }
}
