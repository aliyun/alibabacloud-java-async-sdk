// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabasesRequest} extends {@link RequestModel}
 *
 * <p>ListDatabasesRequest</p>
 */
public class ListDatabasesRequest extends Request {
    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("NamePattern")
    private String namePattern;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000000)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListDatabasesRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.namePattern = builder.namePattern;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesRequest create() {
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
     * @return namePattern
     */
    public String getNamePattern() {
        return this.namePattern;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDatabasesRequest, Builder> {
        private String catalogId; 
        private String namePattern; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabasesRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.namePattern = response.namePattern;
            this.nextPageToken = response.nextPageToken;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * catalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * namePattern
         */
        public Builder namePattern(String namePattern) {
            this.putQueryParameter("NamePattern", namePattern);
            this.namePattern = namePattern;
            return this;
        }

        /**
         * namePattern
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListDatabasesRequest build() {
            return new ListDatabasesRequest(this);
        } 

    } 

}
