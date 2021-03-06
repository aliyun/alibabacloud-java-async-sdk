// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTablesRequest</p>
 */
public class ListTablesRequest extends Request {
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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReturnGuid")
    private Boolean returnGuid;

    @Query
    @NameInMap("SearchName")
    private String searchName;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListTablesRequest(Builder builder) {
        super(builder);
        this.databaseId = builder.databaseId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.returnGuid = builder.returnGuid;
        this.searchName = builder.searchName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ListTablesRequest, Builder> {
        private String databaseId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean returnGuid; 
        private String searchName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListTablesRequest response) {
            super(response);
            this.databaseId = response.databaseId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.returnGuid = response.returnGuid;
            this.searchName = response.searchName;
            this.tid = response.tid;
        } 

        /**
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
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
         * ReturnGuid.
         */
        public Builder returnGuid(Boolean returnGuid) {
            this.putQueryParameter("ReturnGuid", returnGuid);
            this.returnGuid = returnGuid;
            return this;
        }

        /**
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListTablesRequest build() {
            return new ListTablesRequest(this);
        } 

    } 

}
