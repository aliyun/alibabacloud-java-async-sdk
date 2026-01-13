// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ListMeteringDailyDetailRequest} extends {@link RequestModel}
 *
 * <p>ListMeteringDailyDetailRequest</p>
 */
public class ListMeteringDailyDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("billPeriod")
    private String billPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("billingItem")
    private String billingItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subAccountId")
    private String subAccountId;

    private ListMeteringDailyDetailRequest(Builder builder) {
        super(builder);
        this.billPeriod = builder.billPeriod;
        this.billingItem = builder.billingItem;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMeteringDailyDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billPeriod
     */
    public String getBillPeriod() {
        return this.billPeriod;
    }

    /**
     * @return billingItem
     */
    public String getBillingItem() {
        return this.billingItem;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static final class Builder extends Request.Builder<ListMeteringDailyDetailRequest, Builder> {
        private String billPeriod; 
        private String billingItem; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private String subAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ListMeteringDailyDetailRequest request) {
            super(request);
            this.billPeriod = request.billPeriod;
            this.billingItem = request.billingItem;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.subAccountId = request.subAccountId;
        } 

        /**
         * billPeriod.
         */
        public Builder billPeriod(String billPeriod) {
            this.putQueryParameter("billPeriod", billPeriod);
            this.billPeriod = billPeriod;
            return this;
        }

        /**
         * billingItem.
         */
        public Builder billingItem(String billingItem) {
            this.putQueryParameter("billingItem", billingItem);
            this.billingItem = billingItem;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.putQueryParameter("subAccountId", subAccountId);
            this.subAccountId = subAccountId;
            return this;
        }

        @Override
        public ListMeteringDailyDetailRequest build() {
            return new ListMeteringDailyDetailRequest(this);
        } 

    } 

}
