// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEvaluateListRequest} extends {@link RequestModel}
 *
 * <p>QueryEvaluateListRequest</p>
 */
public class QueryEvaluateListRequest extends Request {
    @Query
    @NameInMap("BillCycle")
    private String billCycle;

    @Query
    @NameInMap("BizTypeList")
    private java.util.List < String > bizTypeList;

    @Query
    @NameInMap("EndAmount")
    private Long endAmount;

    @Query
    @NameInMap("EndBizTime")
    private String endBizTime;

    @Query
    @NameInMap("EndSearchTime")
    private String endSearchTime;

    @Query
    @NameInMap("OutBizId")
    private String outBizId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortType")
    private Integer sortType;

    @Query
    @NameInMap("StartAmount")
    private Long startAmount;

    @Query
    @NameInMap("StartBizTime")
    private String startBizTime;

    @Query
    @NameInMap("StartSearchTime")
    private String startSearchTime;

    @Query
    @NameInMap("Type")
    private Integer type;

    private QueryEvaluateListRequest(Builder builder) {
        super(builder);
        this.billCycle = builder.billCycle;
        this.bizTypeList = builder.bizTypeList;
        this.endAmount = builder.endAmount;
        this.endBizTime = builder.endBizTime;
        this.endSearchTime = builder.endSearchTime;
        this.outBizId = builder.outBizId;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
        this.startAmount = builder.startAmount;
        this.startBizTime = builder.startBizTime;
        this.startSearchTime = builder.startSearchTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEvaluateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billCycle
     */
    public String getBillCycle() {
        return this.billCycle;
    }

    /**
     * @return bizTypeList
     */
    public java.util.List < String > getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return endAmount
     */
    public Long getEndAmount() {
        return this.endAmount;
    }

    /**
     * @return endBizTime
     */
    public String getEndBizTime() {
        return this.endBizTime;
    }

    /**
     * @return endSearchTime
     */
    public String getEndSearchTime() {
        return this.endSearchTime;
    }

    /**
     * @return outBizId
     */
    public String getOutBizId() {
        return this.outBizId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortType
     */
    public Integer getSortType() {
        return this.sortType;
    }

    /**
     * @return startAmount
     */
    public Long getStartAmount() {
        return this.startAmount;
    }

    /**
     * @return startBizTime
     */
    public String getStartBizTime() {
        return this.startBizTime;
    }

    /**
     * @return startSearchTime
     */
    public String getStartSearchTime() {
        return this.startSearchTime;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryEvaluateListRequest, Builder> {
        private String billCycle; 
        private java.util.List < String > bizTypeList; 
        private Long endAmount; 
        private String endBizTime; 
        private String endSearchTime; 
        private String outBizId; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer sortType; 
        private Long startAmount; 
        private String startBizTime; 
        private String startSearchTime; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(QueryEvaluateListRequest request) {
            super(request);
            this.billCycle = request.billCycle;
            this.bizTypeList = request.bizTypeList;
            this.endAmount = request.endAmount;
            this.endBizTime = request.endBizTime;
            this.endSearchTime = request.endSearchTime;
            this.outBizId = request.outBizId;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
            this.startAmount = request.startAmount;
            this.startBizTime = request.startBizTime;
            this.startSearchTime = request.startSearchTime;
            this.type = request.type;
        } 

        /**
         * The billing cycle.
         */
        public Builder billCycle(String billCycle) {
            this.putQueryParameter("BillCycle", billCycle);
            this.billCycle = billCycle;
            return this;
        }

        /**
         * The market types in invoices.
         * <p>
         * 
         * >  By default, this parameter is left empty. If this parameter is left empty, all market types are queried.
         */
        public Builder bizTypeList(java.util.List < String > bizTypeList) {
            this.putQueryParameter("BizTypeList", bizTypeList);
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * The maximum amount to be queried.
         */
        public Builder endAmount(Long endAmount) {
            this.putQueryParameter("EndAmount", endAmount);
            this.endAmount = endAmount;
            return this;
        }

        /**
         * The latest time when an order is paid Specify the time in the yyyy-mm-dd hh:mm:ss format.
         */
        public Builder endBizTime(String endBizTime) {
            this.putQueryParameter("EndBizTime", endBizTime);
            this.endBizTime = endBizTime;
            return this;
        }

        /**
         * The end of the time range to query.
         */
        public Builder endSearchTime(String endSearchTime) {
            this.putQueryParameter("EndSearchTime", endSearchTime);
            this.endSearchTime = endSearchTime;
            return this;
        }

        /**
         * The ID of the external order.
         */
        public Builder outBizId(String outBizId) {
            this.putQueryParameter("OutBizId", outBizId);
            this.outBizId = outBizId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * The type of the sort. Valid values:
         * <p>
         * 
         * *   1: Sort invoices by ID in descending order.
         * *   2: Sort invoices by invoice type in descending order, and then sort invoices of the same type by ID in descending order.
         * *   3: Sort invoices by invoice type in ascending order, and then sort invoices of the same type by ID in descending order.
         */
        public Builder sortType(Integer sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * The minimum amount to be queried.
         */
        public Builder startAmount(Long startAmount) {
            this.putQueryParameter("StartAmount", startAmount);
            this.startAmount = startAmount;
            return this;
        }

        /**
         * The earliest time when an order is paid. Specify the time in the yyyy-mm-dd hh:mm:ss format.
         */
        public Builder startBizTime(String startBizTime) {
            this.putQueryParameter("StartBizTime", startBizTime);
            this.startBizTime = startBizTime;
            return this;
        }

        /**
         * The beginning of the time range to query.
         */
        public Builder startSearchTime(String startSearchTime) {
            this.putQueryParameter("StartSearchTime", startSearchTime);
            this.startSearchTime = startSearchTime;
            return this;
        }

        /**
         * The type of orders to be queried. Valid values:
         * <p>
         * 
         * *   1: the orders in which the invoiceable amount is negative.
         * *   2: the orders in which the invoiceable amount is positive.
         * *   3: the orders in which the invoiceable amount is not 0.
         * *   4: the orders in which the amount that has been invoiced is greater than 0.
         * 
         * >  By default, this parameter is left empty. If this parameter is left empty, all orders are queried.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryEvaluateListRequest build() {
            return new QueryEvaluateListRequest(this);
        } 

    } 

}
