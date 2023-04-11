// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDatabaseRequest} extends {@link RequestModel}
 *
 * <p>SearchDatabaseRequest</p>
 */
public class SearchDatabaseRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DbType")
    private String dbType;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SearchKey")
    private String searchKey;

    @Query
    @NameInMap("SearchRange")
    private String searchRange;

    @Query
    @NameInMap("SearchTarget")
    private String searchTarget;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private SearchDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.searchRange = builder.searchRange;
        this.searchTarget = builder.searchTarget;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDatabaseRequest create() {
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
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return searchRange
     */
    public String getSearchRange() {
        return this.searchRange;
    }

    /**
     * @return searchTarget
     */
    public String getSearchTarget() {
        return this.searchTarget;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SearchDatabaseRequest, Builder> {
        private String regionId; 
        private String dbType; 
        private String envType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private String searchRange; 
        private String searchTarget; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SearchDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.searchRange = request.searchRange;
            this.searchTarget = request.searchTarget;
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
         * The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * The environment type of the database. For more information, see [Change the environment type of an instance](~~163309~~).
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
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
         * The keyword that is used to search for databases.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * The query range based on permissions. Valid values:
         * <p>
         * 
         * *   **HAS_PERMSSION**: searches for databases on which the current user has permissions.
         * *   **OWNER**: searches for databases owned by the current user.
         * *   **MY_FOCUS**: searches for databases that the current user follows.
         * *   **UNKNOWN**: searches for all databases.
         */
        public Builder searchRange(String searchRange) {
            this.putQueryParameter("SearchRange", searchRange);
            this.searchRange = searchRange;
            return this;
        }

        /**
         * The category of the database. Valid values:
         * <p>
         * 
         * *   **DB**: single database or logical database.
         * *   **SINGLE_DB**: single database.
         * *   **LOGIC_DB**: logical database.
         */
        public Builder searchTarget(String searchTarget) {
            this.putQueryParameter("SearchTarget", searchTarget);
            this.searchTarget = searchTarget;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SearchDatabaseRequest build() {
            return new SearchDatabaseRequest(this);
        } 

    } 

}
