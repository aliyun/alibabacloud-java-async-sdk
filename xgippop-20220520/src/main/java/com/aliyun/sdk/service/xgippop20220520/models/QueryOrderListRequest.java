// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderListRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderListRequest</p>
 */
public class QueryOrderListRequest extends Request {
    @Query
    @NameInMap("Current")
    @Validation(required = true)
    private Integer current;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ItemCode")
    @Validation(required = true)
    private String itemCode;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("OrderTime")
    private String orderTime;

    @Query
    @NameInMap("OutBizNo")
    private String outBizNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("UId")
    private Long uId;

    private QueryOrderListRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.instanceId = builder.instanceId;
        this.itemCode = builder.itemCode;
        this.mobile = builder.mobile;
        this.orderTime = builder.orderTime;
        this.outBizNo = builder.outBizNo;
        this.pageSize = builder.pageSize;
        this.uId = builder.uId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemCode
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return orderTime
     */
    public String getOrderTime() {
        return this.orderTime;
    }

    /**
     * @return outBizNo
     */
    public String getOutBizNo() {
        return this.outBizNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uId
     */
    public Long getUId() {
        return this.uId;
    }

    public static final class Builder extends Request.Builder<QueryOrderListRequest, Builder> {
        private Integer current; 
        private String instanceId; 
        private String itemCode; 
        private String mobile; 
        private String orderTime; 
        private String outBizNo; 
        private Integer pageSize; 
        private Long uId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderListRequest request) {
            super(request);
            this.current = request.current;
            this.instanceId = request.instanceId;
            this.itemCode = request.itemCode;
            this.mobile = request.mobile;
            this.orderTime = request.orderTime;
            this.outBizNo = request.outBizNo;
            this.pageSize = request.pageSize;
            this.uId = request.uId;
        } 

        /**
         * 当前页码，从1开始
         */
        public Builder current(Integer current) {
            this.putQueryParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * 实例编号
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 商品code
         */
        public Builder itemCode(String itemCode) {
            this.putQueryParameter("ItemCode", itemCode);
            this.itemCode = itemCode;
            return this;
        }

        /**
         * 流量充值号码
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * OrderTime.
         */
        public Builder orderTime(String orderTime) {
            this.putQueryParameter("OrderTime", orderTime);
            this.orderTime = orderTime;
            return this;
        }

        /**
         * OutBizNo.
         */
        public Builder outBizNo(String outBizNo) {
            this.putQueryParameter("OutBizNo", outBizNo);
            this.outBizNo = outBizNo;
            return this;
        }

        /**
         * 每页多少条
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UId.
         */
        public Builder uId(Long uId) {
            this.putQueryParameter("UId", uId);
            this.uId = uId;
            return this;
        }

        @Override
        public QueryOrderListRequest build() {
            return new QueryOrderListRequest(this);
        } 

    } 

}
