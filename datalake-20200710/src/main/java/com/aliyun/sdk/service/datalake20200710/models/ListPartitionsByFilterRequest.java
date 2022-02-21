// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPartitionsByFilterRequest} extends {@link RequestModel}
 *
 * <p>ListPartitionsByFilterRequest</p>
 */
public class ListPartitionsByFilterRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("Filter")
    private String filter;

    @Body
    @NameInMap("IsShareSd")
    private Boolean isShareSd;

    @Body
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListPartitionsByFilterRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.filter = builder.filter;
        this.isShareSd = builder.isShareSd;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionsByFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return isShareSd
     */
    public Boolean getIsShareSd() {
        return this.isShareSd;
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListPartitionsByFilterRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private String filter; 
        private Boolean isShareSd; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListPartitionsByFilterRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.filter = response.filter;
            this.isShareSd = response.isShareSd;
            this.nextPageToken = response.nextPageToken;
            this.pageSize = response.pageSize;
            this.tableName = response.tableName;
            this.regionId = response.regionId;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Filter
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * IsShareSd
         */
        public Builder isShareSd(Boolean isShareSd) {
            this.putBodyParameter("IsShareSd", isShareSd);
            this.isShareSd = isShareSd;
            return this;
        }

        /**
         * NextPageToken
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putBodyParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListPartitionsByFilterRequest build() {
            return new ListPartitionsByFilterRequest(this);
        } 

    } 

}
