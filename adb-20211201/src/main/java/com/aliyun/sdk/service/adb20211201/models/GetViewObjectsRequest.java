// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetViewObjectsRequest} extends {@link RequestModel}
 *
 * <p>GetViewObjectsRequest</p>
 */
public class GetViewObjectsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("FilterOwner")
    private String filterOwner;

    @Query
    @NameInMap("FilterViewName")
    private String filterViewName;

    @Query
    @NameInMap("FilterViewType")
    private String filterViewType;

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

    @Query
    @NameInMap("SchemaName")
    @Validation(required = true)
    private String schemaName;

    private GetViewObjectsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.filterOwner = builder.filterOwner;
        this.filterViewName = builder.filterViewName;
        this.filterViewType = builder.filterViewType;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.schemaName = builder.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetViewObjectsRequest create() {
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
     * @return filterViewName
     */
    public String getFilterViewName() {
        return this.filterViewName;
    }

    /**
     * @return filterViewType
     */
    public String getFilterViewType() {
        return this.filterViewType;
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

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    public static final class Builder extends Request.Builder<GetViewObjectsRequest, Builder> {
        private String DBClusterId; 
        private String filterOwner; 
        private String filterViewName; 
        private String filterViewType; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String schemaName; 

        private Builder() {
            super();
        } 

        private Builder(GetViewObjectsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.filterOwner = request.filterOwner;
            this.filterViewName = request.filterViewName;
            this.filterViewType = request.filterViewType;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.schemaName = request.schemaName;
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
         * The owner of the view.
         */
        public Builder filterOwner(String filterOwner) {
            this.putQueryParameter("FilterOwner", filterOwner);
            this.filterOwner = filterOwner;
            return this;
        }

        /**
         * The name of the view.
         */
        public Builder filterViewName(String filterViewName) {
            this.putQueryParameter("FilterViewName", filterViewName);
            this.filterViewName = filterViewName;
            return this;
        }

        /**
         * The type of the view.
         * <p>
         * 
         * Valid values:
         * 
         * \-VIRTUAL_VIEW
         * 
         * \-MATERIALIZED_VIEW
         * 
         * Default value: null.
         */
        public Builder filterViewType(String filterViewType) {
            this.putQueryParameter("FilterViewType", filterViewType);
            this.filterViewType = filterViewType;
            return this;
        }

        /**
         * The order in which you want to sort the query results. Valid values for Type:
         * <p>
         * 
         * *   Asc
         * *   Desc
         * 
         * Valid values for Field: -ViewName
         * 
         * \-CreateTime
         * 
         * \-UpdateTime
         * 
         * Default value: {"Type": "Desc","Field": "ViewName"}.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The page number.
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
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        @Override
        public GetViewObjectsRequest build() {
            return new GetViewObjectsRequest(this);
        } 

    } 

}
