// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
    private String createdAfterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedBeforeTime")
    private String createdBeforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraConditionList")
    private java.util.List<ExtraConditionList> extraConditionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageStart")
    private Integer pageStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketStatus")
    private String ticketStatus;

    private ListTicketsRequest(Builder builder) {
        super(builder);
        this.createdAfterTime = builder.createdAfterTime;
        this.createdBeforeTime = builder.createdBeforeTime;
        this.extraConditionList = builder.extraConditionList;
        this.ids = builder.ids;
        this.pageSize = builder.pageSize;
        this.pageStart = builder.pageStart;
        this.productCode = builder.productCode;
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
    public String getCreatedAfterTime() {
        return this.createdAfterTime;
    }

    /**
     * @return createdBeforeTime
     */
    public String getCreatedBeforeTime() {
        return this.createdBeforeTime;
    }

    /**
     * @return extraConditionList
     */
    public java.util.List<ExtraConditionList> getExtraConditionList() {
        return this.extraConditionList;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
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
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public static final class Builder extends Request.Builder<ListTicketsRequest, Builder> {
        private String createdAfterTime; 
        private String createdBeforeTime; 
        private java.util.List<ExtraConditionList> extraConditionList; 
        private String ids; 
        private Integer pageSize; 
        private Integer pageStart; 
        private String productCode; 
        private String ticketStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketsRequest request) {
            super(request);
            this.createdAfterTime = request.createdAfterTime;
            this.createdBeforeTime = request.createdBeforeTime;
            this.extraConditionList = request.extraConditionList;
            this.ids = request.ids;
            this.pageSize = request.pageSize;
            this.pageStart = request.pageStart;
            this.productCode = request.productCode;
            this.ticketStatus = request.ticketStatus;
        } 

        /**
         * CreatedAfterTime.
         */
        public Builder createdAfterTime(String createdAfterTime) {
            this.putQueryParameter("CreatedAfterTime", createdAfterTime);
            this.createdAfterTime = createdAfterTime;
            return this;
        }

        /**
         * CreatedBeforeTime.
         */
        public Builder createdBeforeTime(String createdBeforeTime) {
            this.putQueryParameter("CreatedBeforeTime", createdBeforeTime);
            this.createdBeforeTime = createdBeforeTime;
            return this;
        }

        /**
         * ExtraConditionList.
         */
        public Builder extraConditionList(java.util.List<ExtraConditionList> extraConditionList) {
            this.putQueryParameter("ExtraConditionList", extraConditionList);
            this.extraConditionList = extraConditionList;
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

    /**
     * 
     * {@link ListTicketsRequest} extends {@link TeaModel}
     *
     * <p>ListTicketsRequest</p>
     */
    public static class ExtraConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ExtraConditionList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraConditionList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(ExtraConditionList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExtraConditionList build() {
                return new ExtraConditionList(this);
            } 

        } 

    }
}
