// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketsRequest} extends {@link RequestModel}
 *
 * <p>ListTicketsRequest</p>
 */
public class ListTicketsRequest extends Request {
    @Body
    @NameInMap("EndDate")
    private Long endDate;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 9999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 10)
    private Integer pageSize;

    @Body
    @NameInMap("StartDate")
    private Long startDate;

    @Body
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Body
    @NameInMap("TicketId")
    private String ticketId;

    @Body
    @NameInMap("TicketIdList")
    private java.util.List < String > ticketIdList;

    private ListTicketsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.statusList = builder.statusList;
        this.ticketId = builder.ticketId;
        this.ticketIdList = builder.ticketIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return ticketIdList
     */
    public java.util.List < String > getTicketIdList() {
        return this.ticketIdList;
    }

    public static final class Builder extends Request.Builder<ListTicketsRequest, Builder> {
        private Long endDate; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startDate; 
        private java.util.List < String > statusList; 
        private String ticketId; 
        private java.util.List < String > ticketIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketsRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.statusList = request.statusList;
            this.ticketId = request.ticketId;
            this.ticketIdList = request.ticketIdList;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putBodyParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * TicketIdList.
         */
        public Builder ticketIdList(java.util.List < String > ticketIdList) {
            String ticketIdListShrink = shrink(ticketIdList, "TicketIdList", "simple");
            this.putBodyParameter("TicketIdList", ticketIdListShrink);
            this.ticketIdList = ticketIdList;
            return this;
        }

        @Override
        public ListTicketsRequest build() {
            return new ListTicketsRequest(this);
        } 

    } 

}
