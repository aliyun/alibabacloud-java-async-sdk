// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryActivityItemsRequest} extends {@link RequestModel}
 *
 * <p>QueryActivityItemsRequest</p>
 */
public class QueryActivityItemsRequest extends Request {
    @Query
    @NameInMap("ActivityId")
    private Integer activityId;

    @Query
    @NameInMap("ExtendInfo")
    private String extendInfo;

    @Query
    @NameInMap("FloorIndex")
    private Integer floorIndex;

    @Query
    @NameInMap("Mock")
    private Boolean mock;

    @Query
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 30, minimum = 3)
    private Integer pageSize;

    @Query
    @NameInMap("Refresh")
    private Boolean refresh;

    @Query
    @NameInMap("UmId")
    private String umId;

    private QueryActivityItemsRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.extendInfo = builder.extendInfo;
        this.floorIndex = builder.floorIndex;
        this.mock = builder.mock;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.refresh = builder.refresh;
        this.umId = builder.umId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActivityItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public Integer getActivityId() {
        return this.activityId;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return floorIndex
     */
    public Integer getFloorIndex() {
        return this.floorIndex;
    }

    /**
     * @return mock
     */
    public Boolean getMock() {
        return this.mock;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return refresh
     */
    public Boolean getRefresh() {
        return this.refresh;
    }

    /**
     * @return umId
     */
    public String getUmId() {
        return this.umId;
    }

    public static final class Builder extends Request.Builder<QueryActivityItemsRequest, Builder> {
        private Integer activityId; 
        private String extendInfo; 
        private Integer floorIndex; 
        private Boolean mock; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Boolean refresh; 
        private String umId; 

        private Builder() {
            super();
        } 

        private Builder(QueryActivityItemsRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.extendInfo = request.extendInfo;
            this.floorIndex = request.floorIndex;
            this.mock = request.mock;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.refresh = request.refresh;
            this.umId = request.umId;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(Integer activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * FloorIndex.
         */
        public Builder floorIndex(Integer floorIndex) {
            this.putQueryParameter("FloorIndex", floorIndex);
            this.floorIndex = floorIndex;
            return this;
        }

        /**
         * Mock.
         */
        public Builder mock(Boolean mock) {
            this.putQueryParameter("Mock", mock);
            this.mock = mock;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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
         * Refresh.
         */
        public Builder refresh(Boolean refresh) {
            this.putQueryParameter("Refresh", refresh);
            this.refresh = refresh;
            return this;
        }

        /**
         * UmId.
         */
        public Builder umId(String umId) {
            this.putQueryParameter("UmId", umId);
            this.umId = umId;
            return this;
        }

        @Override
        public QueryActivityItemsRequest build() {
            return new QueryActivityItemsRequest(this);
        } 

    } 

}
