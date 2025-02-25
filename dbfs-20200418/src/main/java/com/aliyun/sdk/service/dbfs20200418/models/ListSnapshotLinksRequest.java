// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSnapshotLinksRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotLinksRequest</p>
 */
public class ListSnapshotLinksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterKey")
    private String filterKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterValue")
    private String filterValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsIds")
    private String fsIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkIds")
    private String linkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 999999, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListSnapshotLinksRequest(Builder builder) {
        super(builder);
        this.filterKey = builder.filterKey;
        this.filterValue = builder.filterValue;
        this.fsIds = builder.fsIds;
        this.linkIds = builder.linkIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotLinksRequest create() {
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
     * @return fsIds
     */
    public String getFsIds() {
        return this.fsIds;
    }

    /**
     * @return linkIds
     */
    public String getLinkIds() {
        return this.linkIds;
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

    public static final class Builder extends Request.Builder<ListSnapshotLinksRequest, Builder> {
        private String filterKey; 
        private String filterValue; 
        private String fsIds; 
        private String linkIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotLinksRequest request) {
            super(request);
            this.filterKey = request.filterKey;
            this.filterValue = request.filterValue;
            this.fsIds = request.fsIds;
            this.linkIds = request.linkIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
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
         * FsIds.
         */
        public Builder fsIds(String fsIds) {
            this.putQueryParameter("FsIds", fsIds);
            this.fsIds = fsIds;
            return this;
        }

        /**
         * LinkIds.
         */
        public Builder linkIds(String linkIds) {
            this.putQueryParameter("LinkIds", linkIds);
            this.linkIds = linkIds;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSnapshotLinksRequest build() {
            return new ListSnapshotLinksRequest(this);
        } 

    } 

}
