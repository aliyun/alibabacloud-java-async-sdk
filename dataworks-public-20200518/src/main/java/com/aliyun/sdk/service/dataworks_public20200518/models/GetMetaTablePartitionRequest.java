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
 * {@link GetMetaTablePartitionRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTablePartitionRequest</p>
 */
public class GetMetaTablePartitionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortCriterion")
    private SortCriterion sortCriterion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    private String tableGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the EMR cluster. Required only if <strong>DataSourceType</strong> is <strong>EMR</strong>.</p>
         * <p>Log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the cluster ID.</p>
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
         * <p>The data source type. Valid values: ODPS and EMR.</p>
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
         * <p>The name of the database. Required only if <strong>DataSourceType</strong> is <strong>EMR</strong>.</p>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2780105.html">ListMetaDB</a> operation to query the database name.</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
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
         * <p>The partition sorting logic.</p>
         */
        public Builder sortCriterion(SortCriterion sortCriterion) {
            String sortCriterionShrink = shrink(sortCriterion, "SortCriterion", "json");
            this.putQueryParameter("SortCriterion", sortCriterionShrink);
            this.sortCriterion = sortCriterion;
            return this;
        }

        /**
         * <p>The unique identifier of the table.</p>
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
         * <p>The name of the EMR table. Required only if <strong>DataSourceType</strong> is <strong>EMR</strong>.</p>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2780086.html">GetMetaDBTableList</a> operation to query the table name.</p>
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
        public GetMetaTablePartitionRequest build() {
            return new GetMetaTablePartitionRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTablePartitionRequest} extends {@link TeaModel}
     *
     * <p>GetMetaTablePartitionRequest</p>
     */
    public static class SortCriterion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private String order;

        @com.aliyun.core.annotation.NameInMap("SortField")
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

            private Builder() {
            } 

            private Builder(SortCriterion model) {
                this.order = model.order;
                this.sortField = model.sortField;
            } 

            /**
             * <p>The sort order. Valid values: <strong>asc</strong> and <strong>desc</strong>. Default value: <strong>desc</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The field used to sort the partitions. Valid values: <strong>name</strong> and <strong>modify_time</strong>. Default value: the creation time of the partition.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
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
