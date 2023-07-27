// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseObjectsRequest} extends {@link RequestModel}
 *
 * <p>GetDatabaseObjectsRequest</p>
 */
public class GetDatabaseObjectsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("FilterOwner")
    private String filterOwner;

    @Query
    @NameInMap("FilterSchemaName")
    private String filterSchemaName;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetDatabaseObjectsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.filterOwner = builder.filterOwner;
        this.filterSchemaName = builder.filterSchemaName;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return filterOwner
     */
    public String getFilterOwner() {
        return this.filterOwner;
    }

    /**
     * @return filterSchemaName
     */
    public String getFilterSchemaName() {
        return this.filterSchemaName;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDatabaseObjectsRequest, Builder> {
        private String DBClusterId; 
        private String filterOwner; 
        private String filterSchemaName; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDatabaseObjectsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.filterOwner = request.filterOwner;
            this.filterSchemaName = request.filterSchemaName;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The owner of the database.
         */
        public Builder filterOwner(String filterOwner) {
            this.putQueryParameter("FilterOwner", filterOwner);
            this.filterOwner = filterOwner;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder filterSchemaName(String filterSchemaName) {
            this.putQueryParameter("FilterSchemaName", filterSchemaName);
            this.filterSchemaName = filterSchemaName;
            return this;
        }

        /**
         * The order in which you want to sort the query results. Valid values:
         * <p>
         * 
         * *   Asc
         * *   Desc
         * 
         * Valid values for Field: DatabaseName, CreateTime, and UpdateTime.
         * 
         * Default value: {"Type": "Desc","Field": "DatabaseName"}.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   30
         * *   50
         * *   100
         * 
         * Default value: 30.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the database.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDatabaseObjectsRequest build() {
            return new GetDatabaseObjectsRequest(this);
        } 

    } 

}
