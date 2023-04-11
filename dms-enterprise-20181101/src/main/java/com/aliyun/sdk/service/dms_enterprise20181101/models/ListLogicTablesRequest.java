// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicTablesRequest} extends {@link RequestModel}
 *
 * <p>ListLogicTablesRequest</p>
 */
public class ListLogicTablesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DatabaseId")
    @Validation(required = true)
    private String databaseId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ReturnGuid")
    private Boolean returnGuid;

    @Query
    @NameInMap("SearchName")
    private String searchName;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListLogicTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseId = builder.databaseId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.returnGuid = builder.returnGuid;
        this.searchName = builder.searchName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogicTablesRequest create() {
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
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
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
     * @return returnGuid
     */
    public Boolean getReturnGuid() {
        return this.returnGuid;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListLogicTablesRequest, Builder> {
        private String regionId; 
        private String databaseId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean returnGuid; 
        private String searchName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListLogicTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseId = request.databaseId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.returnGuid = request.returnGuid;
            this.searchName = request.searchName;
            this.tid = request.tid;
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
         * The ID of the logical database.
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
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
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether to return the GUID of the table.
         */
        public Builder returnGuid(Boolean returnGuid) {
            this.putQueryParameter("ReturnGuid", returnGuid);
            this.returnGuid = returnGuid;
            return this;
        }

        /**
         * The keyword that is used to search for the logical tables. Prefix match is supported.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListLogicTablesRequest build() {
            return new ListLogicTablesRequest(this);
        } 

    } 

}
