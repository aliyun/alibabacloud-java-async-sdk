// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryEvaluateListRequest} extends {@link RequestModel}
 *
 * <p>QueryEvaluateListRequest</p>
 */
public class QueryEvaluateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillCycle")
    private String billCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTypeList")
    private java.util.List<String> bizTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndAmount")
    private Long endAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndBizTime")
    private String endBizTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndSearchTime")
    private String endSearchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutBizId")
    private String outBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private Integer sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartAmount")
    private Long startAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartBizTime")
    private String startBizTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartSearchTime")
    private String startSearchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
    public java.util.List<String> getBizTypeList() {
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
        private java.util.List<String> bizTypeList; 
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
         * <p>The billing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>202003</p>
         */
        public Builder billCycle(String billCycle) {
            this.putQueryParameter("BillCycle", billCycle);
            this.billCycle = billCycle;
            return this;
        }

        /**
         * <p>The market types in invoices.</p>
         * <blockquote>
         * <p> By default, this parameter is left empty. If this parameter is left empty, all market types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder bizTypeList(java.util.List<String> bizTypeList) {
            this.putQueryParameter("BizTypeList", bizTypeList);
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * <p>The maximum amount to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder endAmount(Long endAmount) {
            this.putQueryParameter("EndAmount", endAmount);
            this.endAmount = endAmount;
            return this;
        }

        /**
         * <p>The latest time when an order is paid Specify the time in the yyyy-mm-dd hh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02 15:00:00</p>
         */
        public Builder endBizTime(String endBizTime) {
            this.putQueryParameter("EndBizTime", endBizTime);
            this.endBizTime = endBizTime;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-02 12:00:00</p>
         */
        public Builder endSearchTime(String endSearchTime) {
            this.putQueryParameter("EndSearchTime", endSearchTime);
            this.endSearchTime = endSearchTime;
            return this;
        }

        /**
         * <p>The ID of the external order.</p>
         * 
         * <strong>example:</strong>
         * <p>2387432832696</p>
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
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>The type of the sort. Valid values:</p>
         * <ul>
         * <li>1: Sort invoices by ID in descending order.</li>
         * <li>2: Sort invoices by invoice type in descending order, and then sort invoices of the same type by ID in descending order.</li>
         * <li>3: Sort invoices by invoice type in ascending order, and then sort invoices of the same type by ID in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sortType(Integer sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * <p>The minimum amount to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder startAmount(Long startAmount) {
            this.putQueryParameter("StartAmount", startAmount);
            this.startAmount = startAmount;
            return this;
        }

        /**
         * <p>The earliest time when an order is paid. Specify the time in the yyyy-mm-dd hh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02 12:00:00</p>
         */
        public Builder startBizTime(String startBizTime) {
            this.putQueryParameter("StartBizTime", startBizTime);
            this.startBizTime = startBizTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02 12:00:00</p>
         */
        public Builder startSearchTime(String startSearchTime) {
            this.putQueryParameter("StartSearchTime", startSearchTime);
            this.startSearchTime = startSearchTime;
            return this;
        }

        /**
         * <p>The type of orders to be queried. Valid values:</p>
         * <ul>
         * <li>1: the orders in which the invoiceable amount is negative.</li>
         * <li>2: the orders in which the invoiceable amount is positive.</li>
         * <li>3: the orders in which the invoiceable amount is not 0.</li>
         * <li>4: the orders in which the amount that has been invoiced is greater than 0.</li>
         * </ul>
         * <blockquote>
         * <p> By default, this parameter is left empty. If this parameter is left empty, all orders are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
