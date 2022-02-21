// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTableRequest} extends {@link RequestModel}
 *
 * <p>SearchTableRequest</p>
 */
public class SearchTableRequest extends Request {
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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReturnGuid")
    private Boolean returnGuid;

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

    private SearchTableRequest(Builder builder) {
        super(builder);
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.returnGuid = builder.returnGuid;
        this.searchKey = builder.searchKey;
        this.searchRange = builder.searchRange;
        this.searchTarget = builder.searchTarget;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<SearchTableRequest, Builder> {
        private String dbType; 
        private String envType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean returnGuid; 
        private String searchKey; 
        private String searchRange; 
        private String searchTarget; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SearchTableRequest response) {
            super(response);
            this.dbType = response.dbType;
            this.envType = response.envType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.returnGuid = response.returnGuid;
            this.searchKey = response.searchKey;
            this.searchRange = response.searchRange;
            this.searchTarget = response.searchTarget;
            this.tid = response.tid;
        } 

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
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
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SearchRange.
         */
        public Builder searchRange(String searchRange) {
            this.putQueryParameter("SearchRange", searchRange);
            this.searchRange = searchRange;
            return this;
        }

        /**
         * SearchTarget.
         */
        public Builder searchTarget(String searchTarget) {
            this.putQueryParameter("SearchTarget", searchTarget);
            this.searchTarget = searchTarget;
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
        public SearchTableRequest build() {
            return new SearchTableRequest(this);
        } 

    } 

}
