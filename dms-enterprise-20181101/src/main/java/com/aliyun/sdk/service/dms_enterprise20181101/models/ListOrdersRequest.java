// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListOrdersRequest</p>
 */
public class ListOrdersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderResultType")
    private String orderResultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginType")
    private String pluginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchContent")
    private String searchContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchDateType")
    private String searchDateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ListOrdersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.orderResultType = builder.orderResultType;
        this.orderStatus = builder.orderStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pluginType = builder.pluginType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String endTime; 
        private String orderResultType; 
        private String orderStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pluginType; 
        private String searchContent; 
        private String searchDateType; 
        private String startTime; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListOrdersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.orderResultType = request.orderResultType;
            this.orderStatus = request.orderStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pluginType = request.pluginType;
            this.searchContent = request.searchContent;
            this.searchDateType = request.searchDateType;
            this.startTime = request.startTime;
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
         * The end of the time range to query.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The scope of the tickets that you want to query. Valid values:
         * <p>
         * 
         * *   **AS_ADMIN**: all tickets.
         * *   **AS_COMMITTER**: the tickets that are submitted by the current user.
         * *   **AS_HANDLER**: the tickets to be processed by the current user.
         * *   **AS_OWNER**: the tickets that are processed by the current user.
         * *   **AS_Related**: the tickets that are related to the current user.
         */
        public Builder orderResultType(String orderResultType) {
            this.putQueryParameter("OrderResultType", orderResultType);
            this.orderResultType = orderResultType;
            return this;
        }

        /**
         * The status of the tickets that you want to query. Valid values:
         * <p>
         * 
         * *   **ALL**: queries the tickets of all statuses.
         * *   **FINISHED**: queries the tickets that are completed.
         * *   **RUNNING**: queries the tickets that are being processed.
         */
        public Builder orderStatus(String orderStatus) {
            this.putQueryParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
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
         * The type of the tickets that you want to query. For more information, see [PluginType parameter](~~429109~~).
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
        }

        /**
         * The keyword that is used to query tickets.
         */
        public Builder searchContent(String searchContent) {
            this.putQueryParameter("SearchContent", searchContent);
            this.searchContent = searchContent;
            return this;
        }

        /**
         * The time condition based on which you want to query tickets. Valid values:
         * <p>
         * 
         * *   **CREATE_TIME**: the time when a ticket was created.
         * *   **MODIFY_TIME**: the time when a ticket was last modified.
         */
        public Builder searchDateType(String searchDateType) {
            this.putQueryParameter("SearchDateType", searchDateType);
            this.searchDateType = searchDateType;
            return this;
        }

        /**
         * The beginning of the time range to query.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
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
