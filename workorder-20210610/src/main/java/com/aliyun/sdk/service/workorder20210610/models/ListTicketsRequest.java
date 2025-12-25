// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link ListTicketsRequest} extends {@link RequestModel}
 *
 * <p>ListTicketsRequest</p>
 */
public class ListTicketsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketIdList")
    private java.util.List<String> ticketIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

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
        this.uid = builder.uid;
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
    public java.util.List<String> getStatusList() {
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
    public java.util.List<String> getTicketIdList() {
        return this.ticketIdList;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ListTicketsRequest, Builder> {
        private Long endDate; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startDate; 
        private java.util.List<String> statusList; 
        private String ticketId; 
        private java.util.List<String> ticketIdList; 
        private String uid; 

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
            this.uid = request.uid;
        } 

        /**
         * <p>The deadline for ticket creation. This parameter is used in conjunction with StartDate to query tickets submitted within the specified start and end time ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>1623396736000</p>
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The ticket keyword, which is used for fuzzy search to match the content of the Description field when a ticket is created.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>Paging query page number parameters</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries queried by page parameter</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The time when the ticket was created. This parameter is used with EndDate to query tickets that are created within the specified start and end time ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>1623396736000</p>
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Multiple ticket statuses</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putBodyParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>Work Order Number</p>
         * 
         * <strong>example:</strong>
         * <p>0005PYGCW</p>
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>Multiple job numbers</p>
         */
        public Builder ticketIdList(java.util.List<String> ticketIdList) {
            String ticketIdListShrink = shrink(ticketIdList, "TicketIdList", "simple");
            this.putBodyParameter("TicketIdList", ticketIdListShrink);
            this.ticketIdList = ticketIdList;
            return this;
        }

        /**
         * <p>UID</p>
         * 
         * <strong>example:</strong>
         * <p>1902070573958003</p>
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ListTicketsRequest build() {
            return new ListTicketsRequest(this);
        } 

    } 

}
