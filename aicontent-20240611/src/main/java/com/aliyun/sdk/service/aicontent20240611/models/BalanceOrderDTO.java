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
 * {@link BalanceOrderDTO} extends {@link TeaModel}
 *
 * <p>BalanceOrderDTO</p>
 */
public class BalanceOrderDTO extends TeaModel {
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

    private BalanceOrderDTO(Builder builder) {
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

    public static BalanceOrderDTO create() {
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

        private Builder(BalanceOrderDTO model) {
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
         * <p>The change amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The pool balance after the change.</p>
         * 
         * <strong>example:</strong>
         * <p>600.00</p>
         */
        public Builder balanceAfter(Double balanceAfter) {
            this.balanceAfter = balanceAfter;
            return this;
        }

        /**
         * <p>The pool balance before the change.</p>
         * 
         * <strong>example:</strong>
         * <p>500.00</p>
         */
        public Builder balanceBefore(Double balanceBefore) {
            this.balanceBefore = balanceBefore;
            return this;
        }

        /**
         * <p>The balance type (permanent: Permanent / monthly: Monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        public Builder balanceType(String balanceType) {
            this.balanceType = balanceType;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-15T10:30:00+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The direction (in: Income / out: Expense).</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * <p>The associated model code (available for deduction types).</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * <p>The unique identifier of the change record.</p>
         * 
         * <strong>example:</strong>
         * <p>ord_20240715_abc123</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The change type (recharge: Recharge / periodic_recharge: Periodic recharge / deduct: Deduction / manual_deduct: Manual deduction / transfer_out: Transfer out / transfer_in: Transfer in / return_out: Refund out / return_in: Refund in / write_off: Write-off / monthly_expire: Monthly expiration / deficit_writeoff: Deficit write-off).</p>
         * 
         * <strong>example:</strong>
         * <p>recharge</p>
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual recharge by administrator</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The source identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The total balance after the change (permanent + monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>1600.00</p>
         */
        public Builder totalAfter(Double totalAfter) {
            this.totalAfter = totalAfter;
            return this;
        }

        /**
         * <p>The total balance before the change (permanent + monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>1500.00</p>
         */
        public Builder totalBefore(Double totalBefore) {
            this.totalBefore = totalBefore;
            return this;
        }

        public BalanceOrderDTO build() {
            return new BalanceOrderDTO(this);
        } 

    } 

}
