// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryTicketListRequest} extends {@link RequestModel}
 *
 * <p>QueryTicketListRequest</p>
 */
public class QueryTicketListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    private java.util.List<String> shopIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketIdList")
    private java.util.List<String> ticketIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketTypeList")
    private java.util.List<String> ticketTypeList;

    private QueryTicketListRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shopIdList = builder.shopIdList;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.ticketIdList = builder.ticketIdList;
        this.ticketTypeList = builder.ticketTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTicketListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return shopIdList
     */
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return ticketIdList
     */
    public java.util.List<String> getTicketIdList() {
        return this.ticketIdList;
    }

    /**
     * @return ticketTypeList
     */
    public java.util.List<String> getTicketTypeList() {
        return this.ticketTypeList;
    }

    public static final class Builder extends Request.Builder<QueryTicketListRequest, Builder> {
        private String country; 
        private Long endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> shopIdList; 
        private Long startTime; 
        private Integer status; 
        private java.util.List<String> ticketIdList; 
        private java.util.List<String> ticketTypeList; 

        private Builder() {
            super();
        } 

        private Builder(QueryTicketListRequest request) {
            super(request);
            this.country = request.country;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shopIdList = request.shopIdList;
            this.startTime = request.startTime;
            this.status = request.status;
            this.ticketIdList = request.ticketIdList;
            this.ticketTypeList = request.ticketTypeList;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ShopIdList.
         */
        public Builder shopIdList(java.util.List<String> shopIdList) {
            String shopIdListShrink = shrink(shopIdList, "ShopIdList", "json");
            this.putBodyParameter("ShopIdList", shopIdListShrink);
            this.shopIdList = shopIdList;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TicketIdList.
         */
        public Builder ticketIdList(java.util.List<String> ticketIdList) {
            String ticketIdListShrink = shrink(ticketIdList, "TicketIdList", "json");
            this.putBodyParameter("TicketIdList", ticketIdListShrink);
            this.ticketIdList = ticketIdList;
            return this;
        }

        /**
         * TicketTypeList.
         */
        public Builder ticketTypeList(java.util.List<String> ticketTypeList) {
            String ticketTypeListShrink = shrink(ticketTypeList, "TicketTypeList", "json");
            this.putBodyParameter("TicketTypeList", ticketTypeListShrink);
            this.ticketTypeList = ticketTypeList;
            return this;
        }

        @Override
        public QueryTicketListRequest build() {
            return new QueryTicketListRequest(this);
        } 

    } 

}
