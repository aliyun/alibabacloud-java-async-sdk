// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateRatePlanSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateRatePlanSpecRequest</p>
 */
public class UpdateRatePlanSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPlanCode")
    private String targetPlanCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPlanName")
    private String targetPlanName;

    private UpdateRatePlanSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.chargeType = builder.chargeType;
        this.instanceId = builder.instanceId;
        this.orderType = builder.orderType;
        this.targetPlanCode = builder.targetPlanCode;
        this.targetPlanName = builder.targetPlanName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRatePlanSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return targetPlanCode
     */
    public String getTargetPlanCode() {
        return this.targetPlanCode;
    }

    /**
     * @return targetPlanName
     */
    public String getTargetPlanName() {
        return this.targetPlanName;
    }

    public static final class Builder extends Request.Builder<UpdateRatePlanSpecRequest, Builder> {
        private Boolean autoPay; 
        private String chargeType; 
        private String instanceId; 
        private String orderType; 
        private String targetPlanCode; 
        private String targetPlanName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRatePlanSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.chargeType = request.chargeType;
            this.instanceId = request.instanceId;
            this.orderType = request.orderType;
            this.targetPlanCode = request.targetPlanCode;
            this.targetPlanName = request.targetPlanName;
        } 

        /**
         * <p>Specifies whether to enable auto payment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The specification update type. Valid values:</p>
         * <ul>
         * <li>DOWNGRADE</li>
         * <li>UPGRADE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * TargetPlanCode.
         */
        public Builder targetPlanCode(String targetPlanCode) {
            this.putQueryParameter("TargetPlanCode", targetPlanCode);
            this.targetPlanCode = targetPlanCode;
            return this;
        }

        /**
         * TargetPlanName.
         */
        public Builder targetPlanName(String targetPlanName) {
            this.putQueryParameter("TargetPlanName", targetPlanName);
            this.targetPlanName = targetPlanName;
            return this;
        }

        @Override
        public UpdateRatePlanSpecRequest build() {
            return new UpdateRatePlanSpecRequest(this);
        } 

    } 

}
