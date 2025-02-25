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
 * {@link QueryFaultDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QueryFaultDeviceListRequest</p>
 */
public class QueryFaultDeviceListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DailyOnlineTime")
    private Integer dailyOnlineTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaultType")
    private String faultType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    private java.util.List<String> shopIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private QueryFaultDeviceListRequest(Builder builder) {
        super(builder);
        this.dailyOnlineTime = builder.dailyOnlineTime;
        this.endDate = builder.endDate;
        this.faultType = builder.faultType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shopIdList = builder.shopIdList;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaultDeviceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyOnlineTime
     */
    public Integer getDailyOnlineTime() {
        return this.dailyOnlineTime;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return faultType
     */
    public String getFaultType() {
        return this.faultType;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryFaultDeviceListRequest, Builder> {
        private Integer dailyOnlineTime; 
        private String endDate; 
        private String faultType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> shopIdList; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaultDeviceListRequest request) {
            super(request);
            this.dailyOnlineTime = request.dailyOnlineTime;
            this.endDate = request.endDate;
            this.faultType = request.faultType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shopIdList = request.shopIdList;
            this.startDate = request.startDate;
        } 

        /**
         * DailyOnlineTime.
         */
        public Builder dailyOnlineTime(Integer dailyOnlineTime) {
            this.putBodyParameter("DailyOnlineTime", dailyOnlineTime);
            this.dailyOnlineTime = dailyOnlineTime;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * FaultType.
         */
        public Builder faultType(String faultType) {
            this.putBodyParameter("FaultType", faultType);
            this.faultType = faultType;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryFaultDeviceListRequest build() {
            return new QueryFaultDeviceListRequest(this);
        } 

    } 

}
