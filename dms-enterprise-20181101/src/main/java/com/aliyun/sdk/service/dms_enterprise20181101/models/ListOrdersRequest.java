// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListOrdersRequest</p>
 */
public class ListOrdersRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("OrderResultType")
    private String orderResultType;

    @Query
    @NameInMap("OrderStatus")
    private String orderStatus;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PluginType")
    private String pluginType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SearchContent")
    private String searchContent;

    @Query
    @NameInMap("SearchDateType")
    private String searchDateType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListOrdersRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.orderResultType = builder.orderResultType;
        this.orderStatus = builder.orderStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pluginType = builder.pluginType;
        this.regionId = builder.regionId;
        this.searchContent = builder.searchContent;
        this.searchDateType = builder.searchDateType;
        this.startTime = builder.startTime;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return orderResultType
     */
    public String getOrderResultType() {
        return this.orderResultType;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
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
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchContent
     */
    public String getSearchContent() {
        return this.searchContent;
    }

    /**
     * @return searchDateType
     */
    public String getSearchDateType() {
        return this.searchDateType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListOrdersRequest, Builder> {
        private String endTime; 
        private String orderResultType; 
        private String orderStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pluginType; 
        private String regionId; 
        private String searchContent; 
        private String searchDateType; 
        private String startTime; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListOrdersRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.orderResultType = response.orderResultType;
            this.orderStatus = response.orderStatus;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.pluginType = response.pluginType;
            this.regionId = response.regionId;
            this.searchContent = response.searchContent;
            this.searchDateType = response.searchDateType;
            this.startTime = response.startTime;
            this.tid = response.tid;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OrderResultType.
         */
        public Builder orderResultType(String orderResultType) {
            this.putQueryParameter("OrderResultType", orderResultType);
            this.orderResultType = orderResultType;
            return this;
        }

        /**
         * OrderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.putQueryParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
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
         * PluginType.
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
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
         * SearchContent.
         */
        public Builder searchContent(String searchContent) {
            this.putQueryParameter("SearchContent", searchContent);
            this.searchContent = searchContent;
            return this;
        }

        /**
         * SearchDateType.
         */
        public Builder searchDateType(String searchDateType) {
            this.putQueryParameter("SearchDateType", searchDateType);
            this.searchDateType = searchDateType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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
        public ListOrdersRequest build() {
            return new ListOrdersRequest(this);
        } 

    } 

}
