// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ExportDataSourcesRequest</p>
 */
public class ExportDataSourcesRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    private ExportDataSourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceType = builder.dataSourceType;
        this.envType = builder.envType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDataSourcesRequest create() {
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
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<ExportDataSourcesRequest, Builder> {
        private String regionId; 
        private String dataSourceType; 
        private Integer envType; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(ExportDataSourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceType = request.dataSourceType;
            this.envType = request.envType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.subType = request.subType;
        } 

        /**
         * The ID of the region in which the data sources reside. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The data source type. Valid values:
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
         * The environment to which the data sources belong. Valid values:
         * <p>
         * 
         * *   0: development environment
         * *   1: production environment
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The keyword contained in the names of the data sources to be exported.
         * <p>
         * 
         * You can specify only one keyword. For example, if you set this parameter to test, all the data sources whose names contain test in the specified workspace are exported.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of the page to return. The value of this parameter must be a positive integer greater than or equal to 1.
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
         * The ID of the DataWorks workspace to which the data sources belong. You can call the [ListProjects](~~178393~~) operation to query the ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The data source subtype. This parameter takes effect only if the DataSourceType parameter is set to rds.
         * <p>
         * 
         * If the DataSourceType parameter is set to rds, this parameter can be set to mysql, sqlserver, or postgresql.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public ExportDataSourcesRequest build() {
            return new ExportDataSourcesRequest(this);
        } 

    } 

}
