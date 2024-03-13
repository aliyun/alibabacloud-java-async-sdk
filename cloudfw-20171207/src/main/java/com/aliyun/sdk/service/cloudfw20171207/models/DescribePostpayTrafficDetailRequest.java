// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostpayTrafficDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePostpayTrafficDetailRequest</p>
 */
public class DescribePostpayTrafficDetailRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SearchItem")
    private String searchItem;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TrafficType")
    @Validation(required = true)
    private String trafficType;

    private DescribePostpayTrafficDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.searchItem = builder.searchItem;
        this.startTime = builder.startTime;
        this.trafficType = builder.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayTrafficDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchItem
     */
    public String getSearchItem() {
        return this.searchItem;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficType
     */
    public String getTrafficType() {
        return this.trafficType;
    }

    public static final class Builder extends Request.Builder<DescribePostpayTrafficDetailRequest, Builder> {
        private Long currentPage; 
        private String endTime; 
        private String lang; 
        private String order; 
        private Long pageSize; 
        private String searchItem; 
        private String startTime; 
        private String trafficType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePostpayTrafficDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.searchItem = request.searchItem;
            this.startTime = request.startTime;
            this.trafficType = request.trafficType;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchItem.
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
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
         * TrafficType.
         */
        public Builder trafficType(String trafficType) {
            this.putQueryParameter("TrafficType", trafficType);
            this.trafficType = trafficType;
            return this;
        }

        @Override
        public DescribePostpayTrafficDetailRequest build() {
            return new DescribePostpayTrafficDetailRequest(this);
        } 

    } 

}
