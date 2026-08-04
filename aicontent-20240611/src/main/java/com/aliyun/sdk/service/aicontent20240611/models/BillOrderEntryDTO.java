// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BillOrderEntryDTO} extends {@link TeaModel}
 *
 * <p>BillOrderEntryDTO</p>
 */
public class BillOrderEntryDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    private Double amount;

    @com.aliyun.core.annotation.NameInMap("balanceAfter")
    private Double balanceAfter;

    @com.aliyun.core.annotation.NameInMap("balanceBefore")
    private Double balanceBefore;

    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("operatorId")
    private String operatorId;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("orderType")
    private String orderType;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("totalAfter")
    private Double totalAfter;

    @com.aliyun.core.annotation.NameInMap("totalBefore")
    private Double totalBefore;

    private BillOrderEntryDTO(Builder builder) {
        this.amount = builder.amount;
        this.balanceAfter = builder.balanceAfter;
        this.balanceBefore = builder.balanceBefore;
        this.balanceType = builder.balanceType;
        this.createTime = builder.createTime;
        this.direction = builder.direction;
        this.modelCode = builder.modelCode;
        this.operatorId = builder.operatorId;
        this.orderId = builder.orderId;
        this.orderType = builder.orderType;
        this.remark = builder.remark;
        this.source = builder.source;
        this.totalAfter = builder.totalAfter;
        this.totalBefore = builder.totalBefore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillOrderEntryDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return this.amount;
    }

    /**
     * @return balanceAfter
     */
    public Double getBalanceAfter() {
        return this.balanceAfter;
    }

    /**
     * @return balanceBefore
     */
    public Double getBalanceBefore() {
        return this.balanceBefore;
    }

    /**
     * @return balanceType
     */
    public String getBalanceType() {
        return this.balanceType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return totalAfter
     */
    public Double getTotalAfter() {
        return this.totalAfter;
    }

    /**
     * @return totalBefore
     */
    public Double getTotalBefore() {
        return this.totalBefore;
    }

    public static final class Builder {
        private Double amount; 
        private Double balanceAfter; 
        private Double balanceBefore; 
        private String balanceType; 
        private String createTime; 
        private String direction; 
        private String modelCode; 
        private String operatorId; 
        private String orderId; 
        private String orderType; 
        private String remark; 
        private String source; 
        private Double totalAfter; 
        private Double totalBefore; 

        private Builder() {
        } 

        private Builder(BillOrderEntryDTO model) {
            this.amount = model.amount;
            this.balanceAfter = model.balanceAfter;
            this.balanceBefore = model.balanceBefore;
            this.balanceType = model.balanceType;
            this.createTime = model.createTime;
            this.direction = model.direction;
            this.modelCode = model.modelCode;
            this.operatorId = model.operatorId;
            this.orderId = model.orderId;
            this.orderType = model.orderType;
            this.remark = model.remark;
            this.source = model.source;
            this.totalAfter = model.totalAfter;
            this.totalBefore = model.totalBefore;
        } 

        /**
         * amount.
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * balanceAfter.
         */
        public Builder balanceAfter(Double balanceAfter) {
            this.balanceAfter = balanceAfter;
            return this;
        }

        /**
         * balanceBefore.
         */
        public Builder balanceBefore(Double balanceBefore) {
            this.balanceBefore = balanceBefore;
            return this;
        }

        /**
         * balanceType.
         */
        public Builder balanceType(String balanceType) {
            this.balanceType = balanceType;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * modelCode.
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * operatorId.
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * orderType.
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * totalAfter.
         */
        public Builder totalAfter(Double totalAfter) {
            this.totalAfter = totalAfter;
            return this;
        }

        /**
         * totalBefore.
         */
        public Builder totalBefore(Double totalBefore) {
            this.totalBefore = totalBefore;
            return this;
        }

        public BillOrderEntryDTO build() {
            return new BillOrderEntryDTO(this);
        } 

    } 

}
