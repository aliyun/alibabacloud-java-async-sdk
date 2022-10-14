// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableNamesRequest} extends {@link RequestModel}
 *
 * <p>ListTableNamesRequest</p>
 */
public class ListTableNamesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000000)
    private Integer pageSize;

    @Query
    @NameInMap("TableNamePattern")
    private String tableNamePattern;

    @Query
    @NameInMap("TableType")
    private String tableType;

    private ListTableNamesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.tableNamePattern = builder.tableNamePattern;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableNamesRequest create() {
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
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tableNamePattern
     */
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    public static final class Builder extends Request.Builder<ListTableNamesRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String tableNamePattern; 
        private String tableType; 

        private Builder() {
            super();
        } 

        private Builder(ListTableNamesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.tableNamePattern = request.tableNamePattern;
            this.tableType = request.tableType;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * NextPageToken
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TableNamePattern
         */
        public Builder tableNamePattern(String tableNamePattern) {
            this.putQueryParameter("TableNamePattern", tableNamePattern);
            this.tableNamePattern = tableNamePattern;
            return this;
        }

        /**
         * TableType filter
         */
        public Builder tableType(String tableType) {
            this.putQueryParameter("TableType", tableType);
            this.tableType = tableType;
            return this;
        }

        @Override
        public ListTableNamesRequest build() {
            return new ListTableNamesRequest(this);
        } 

    } 

}
