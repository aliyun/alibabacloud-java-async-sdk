// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotRequest</p>
 */
public class ListSnapshotRequest extends Request {
    @Query
    @NameInMap("FilterKey")
    private String filterKey;

    @Query
    @NameInMap("FilterValue")
    private String filterValue;

    @Query
    @NameInMap("FsId")
    private String fsId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 10240, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotIds")
    private String snapshotIds;

    @Query
    @NameInMap("SnapshotName")
    private String snapshotName;

    @Query
    @NameInMap("SnapshotType")
    private String snapshotType;

    @Query
    @NameInMap("SortKey")
    private String sortKey;

    @Query
    @NameInMap("SortType")
    private String sortType;

    @Query
    @NameInMap("Status")
    private String status;

    private ListSnapshotRequest(Builder builder) {
        super(builder);
        this.filterKey = builder.filterKey;
        this.filterValue = builder.filterValue;
        this.fsId = builder.fsId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.snapshotIds = builder.snapshotIds;
        this.snapshotName = builder.snapshotName;
        this.snapshotType = builder.snapshotType;
        this.sortKey = builder.sortKey;
        this.sortType = builder.sortType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterKey
     */
    public String getFilterKey() {
        return this.filterKey;
    }

    /**
     * @return filterValue
     */
    public String getFilterValue() {
        return this.filterValue;
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
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
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return sortKey
     */
    public String getSortKey() {
        return this.sortKey;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListSnapshotRequest, Builder> {
        private String filterKey; 
        private String filterValue; 
        private String fsId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String snapshotIds; 
        private String snapshotName; 
        private String snapshotType; 
        private String sortKey; 
        private String sortType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotRequest response) {
            super(response);
            this.filterKey = response.filterKey;
            this.filterValue = response.filterValue;
            this.fsId = response.fsId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.snapshotIds = response.snapshotIds;
            this.snapshotName = response.snapshotName;
            this.snapshotType = response.snapshotType;
            this.sortKey = response.sortKey;
            this.sortType = response.sortType;
            this.status = response.status;
        } 

        /**
         * FilterKey.
         */
        public Builder filterKey(String filterKey) {
            this.putQueryParameter("FilterKey", filterKey);
            this.filterKey = filterKey;
            return this;
        }

        /**
         * FilterValue.
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
            return this;
        }

        /**
         * FsId.
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SnapshotIds.
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * SnapshotName.
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * SnapshotType.
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * SortKey.
         */
        public Builder sortKey(String sortKey) {
            this.putQueryParameter("SortKey", sortKey);
            this.sortKey = sortKey;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListSnapshotRequest build() {
            return new ListSnapshotRequest(this);
        } 

    } 

}
