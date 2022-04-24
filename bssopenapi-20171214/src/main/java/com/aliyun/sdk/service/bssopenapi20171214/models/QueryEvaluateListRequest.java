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
         * BillCycle.
         */
        public Builder billCycle(String billCycle) {
            this.putQueryParameter("BillCycle", billCycle);
            this.billCycle = billCycle;
            return this;
        }

        /**
         * BizTypeList.
         */
        public Builder bizTypeList(java.util.List < String > bizTypeList) {
            this.putQueryParameter("BizTypeList", bizTypeList);
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * EndAmount.
         */
        public Builder endAmount(Long endAmount) {
            this.putQueryParameter("EndAmount", endAmount);
            this.endAmount = endAmount;
            return this;
        }

        /**
         * EndBizTime.
         */
        public Builder endBizTime(String endBizTime) {
            this.putQueryParameter("EndBizTime", endBizTime);
            this.endBizTime = endBizTime;
            return this;
        }

        /**
         * EndSearchTime.
         */
        public Builder endSearchTime(String endSearchTime) {
            this.putQueryParameter("EndSearchTime", endSearchTime);
            this.endSearchTime = endSearchTime;
            return this;
        }

        /**
         * OutBizId.
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * SortType.
         */
        public Builder sortType(Integer sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * StartAmount.
         */
        public Builder startAmount(Long startAmount) {
            this.putQueryParameter("StartAmount", startAmount);
            this.startAmount = startAmount;
            return this;
        }

        /**
         * StartBizTime.
         */
        public Builder startBizTime(String startBizTime) {
            this.putQueryParameter("StartBizTime", startBizTime);
            this.startBizTime = startBizTime;
            return this;
        }

        /**
         * StartSearchTime.
         */
        public Builder startSearchTime(String startSearchTime) {
            this.putQueryParameter("StartSearchTime", startSearchTime);
            this.startSearchTime = startSearchTime;
            return this;
        }

        /**
         * Type.
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
