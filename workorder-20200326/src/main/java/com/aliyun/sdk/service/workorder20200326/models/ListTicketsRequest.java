// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedAfterTime")
    private Long createdAfterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedBeforeTime")
    private Long createdBeforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageStart")
    private Integer pageStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private String subUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketStatus")
    private String ticketStatus;

    private ListTicketsRequest(Builder builder) {
        super(builder);
        this.createdAfterTime = builder.createdAfterTime;
        this.createdBeforeTime = builder.createdBeforeTime;
        this.ids = builder.ids;
        this.language = builder.language;
        this.pageSize = builder.pageSize;
        this.pageStart = builder.pageStart;
        this.productCode = builder.productCode;
        this.subUserId = builder.subUserId;
        this.ticketStatus = builder.ticketStatus;
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
     * @return createdAfterTime
     */
    public Long getCreatedAfterTime() {
        return this.createdAfterTime;
    }

    /**
     * @return createdBeforeTime
     */
    public Long getCreatedBeforeTime() {
        return this.createdBeforeTime;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageStart
     */
    public Integer getPageStart() {
        return this.pageStart;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return subUserId
     */
    public String getSubUserId() {
        return this.subUserId;
    }

    /**
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public static final class Builder extends Request.Builder<ListTicketsRequest, Builder> {
        private Long createdAfterTime; 
        private Long createdBeforeTime; 
        private String ids; 
        private String language; 
        private Integer pageSize; 
        private Integer pageStart; 
        private String productCode; 
        private String subUserId; 
        private String ticketStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketsRequest request) {
            super(request);
            this.createdAfterTime = request.createdAfterTime;
            this.createdBeforeTime = request.createdBeforeTime;
            this.ids = request.ids;
            this.language = request.language;
            this.pageSize = request.pageSize;
            this.pageStart = request.pageStart;
            this.productCode = request.productCode;
            this.subUserId = request.subUserId;
            this.ticketStatus = request.ticketStatus;
        } 

        /**
         * CreatedAfterTime.
         */
        public Builder createdAfterTime(Long createdAfterTime) {
            this.putQueryParameter("CreatedAfterTime", createdAfterTime);
            this.createdAfterTime = createdAfterTime;
            return this;
        }

        /**
         * CreatedBeforeTime.
         */
        public Builder createdBeforeTime(Long createdBeforeTime) {
            this.putQueryParameter("CreatedBeforeTime", createdBeforeTime);
            this.createdBeforeTime = createdBeforeTime;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
         * PageStart.
         */
        public Builder pageStart(Integer pageStart) {
            this.putQueryParameter("PageStart", pageStart);
            this.pageStart = pageStart;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * SubUserId.
         */
        public Builder subUserId(String subUserId) {
            this.putQueryParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        /**
         * TicketStatus.
         */
        public Builder ticketStatus(String ticketStatus) {
            this.putQueryParameter("TicketStatus", ticketStatus);
            this.ticketStatus = ticketStatus;
            return this;
        }

        @Override
        public ListTicketsRequest build() {
            return new ListTicketsRequest(this);
        } 

    } 

}
