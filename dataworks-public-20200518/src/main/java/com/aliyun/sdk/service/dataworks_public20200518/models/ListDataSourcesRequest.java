// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourcesRequest</p>
 */
public class ListDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    private ListDataSourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceType = builder.dataSourceType;
        this.envType = builder.envType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.status = builder.status;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesRequest create() {
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
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<ListDataSourcesRequest, Builder> {
        private String regionId; 
        private String dataSourceType; 
        private Integer envType; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String status; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceType = request.dataSourceType;
            this.envType = request.envType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.status = request.status;
            this.subType = request.subType;
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
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   odps
         * *   mysql
         * *   rds
         * *   oss
         * *   sqlserver
         * *   polardb
         * *   oracle
         * *   mongodb
         * *   emr
         * *   postgresql
         * *   analyticdb_for_mysql
         * *   hybriddb_for_postgresql
         * *   holo
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The environment in which the data source is used. Valid values: 0 and 1. The value 0 indicates development environment. The value 1 indicates production environment.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The name of the data source that you want to query.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the DataWorks workspace to which the data sources belong. You can call the [ListProjects](~~2780068~~) operation to query the ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The status of the data source. Valid values:
         * <p>
         * 
         * *   ENABLED
         * *   DISABLED
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.
         * <p>
         * 
         * If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public ListDataSourcesRequest build() {
            return new ListDataSourcesRequest(this);
        } 

    } 

}
