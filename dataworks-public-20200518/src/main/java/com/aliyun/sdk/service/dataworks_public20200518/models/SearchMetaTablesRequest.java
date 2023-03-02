// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMetaTablesRequest} extends {@link RequestModel}
 *
 * <p>SearchMetaTablesRequest</p>
 */
public class SearchMetaTablesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AppGuid")
    private String appGuid;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Query
    @NameInMap("EntityType")
    private Integer entityType;

    @Query
    @NameInMap("Keyword")
    @Validation(required = true)
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Schema")
    private String schema;

    private SearchMetaTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGuid = builder.appGuid;
        this.clusterId = builder.clusterId;
        this.dataSourceType = builder.dataSourceType;
        this.entityType = builder.entityType;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMetaTablesRequest create() {
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
     * @return appGuid
     */
    public String getAppGuid() {
        return this.appGuid;
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
     * @return entityType
     */
    public Integer getEntityType() {
        return this.entityType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<SearchMetaTablesRequest, Builder> {
        private String regionId; 
        private String appGuid; 
        private String clusterId; 
        private String dataSourceType; 
        private Integer entityType; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(SearchMetaTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGuid = request.appGuid;
            this.clusterId = request.clusterId;
            this.dataSourceType = request.dataSourceType;
            this.entityType = request.entityType;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.schema = request.schema;
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
         * The GUID of the workspace where the metatables reside.
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
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
         * The type of the metatables. Valid values: 0 and 1. The value 0 indicates that tables are queried. The value 1 indicates that views are queried. If you do not configure this parameter, all types of metatables are queried.
         */
        public Builder entityType(Integer entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The keyword based on which metatables are queried. During the query, the system tokenizes the names of metatables and matches the names with the keyword. If no name is matched, an empty result is returned. By default, the system uses underscores (\_) to tokenize the names.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * The schema information of the table. You need to configure this parameter if you enable the table schema in MaxCompute.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public SearchMetaTablesRequest build() {
            return new SearchMetaTablesRequest(this);
        } 

    } 

}
