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
 * {@link DescribeRatePlanPriceGapRequest} extends {@link RequestModel}
 *
 * <p>DescribeRatePlanPriceGapRequest</p>
 */
public class DescribeRatePlanPriceGapRequest extends Request {
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

    private DescribeRatePlanPriceGapRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.orderType = builder.orderType;
        this.targetPlanCode = builder.targetPlanCode;
        this.targetPlanName = builder.targetPlanName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRatePlanPriceGapRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeRatePlanPriceGapRequest, Builder> {
        private String instanceId; 
        private String orderType; 
        private String targetPlanCode; 
        private String targetPlanName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRatePlanPriceGapRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.orderType = request.orderType;
            this.targetPlanCode = request.targetPlanCode;
            this.targetPlanName = request.targetPlanName;
        } 

        /**
         * <p>The target plan name. You can obtain this value from the <a href="~~DescribeRatePlanPrice~~">DescribeRatePlanPrice</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>entranceplan</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The specification change type. Valid values:</p>
         * <ul>
         * <li>DOWNGRADE: downgrade.</li>
         * <li>UPGRADE: upgrade.</li>
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
         * <p>The code of the target plan for the specification change.</p>
         * 
         * <strong>example:</strong>
         * <p>standardplan</p>
         */
        public Builder targetPlanCode(String targetPlanCode) {
            this.putQueryParameter("TargetPlanCode", targetPlanCode);
            this.targetPlanCode = targetPlanCode;
            return this;
        }

        /**
         * <p>The name of the target plan for the specification change.</p>
         * 
         * <strong>example:</strong>
         * <p>entranceplan</p>
         */
        public Builder targetPlanName(String targetPlanName) {
            this.putQueryParameter("TargetPlanName", targetPlanName);
            this.targetPlanName = targetPlanName;
            return this;
        }

        @Override
        public DescribeRatePlanPriceGapRequest build() {
            return new DescribeRatePlanPriceGapRequest(this);
        } 

    } 

}
