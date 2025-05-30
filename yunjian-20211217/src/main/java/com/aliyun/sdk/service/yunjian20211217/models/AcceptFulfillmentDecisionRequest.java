// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link AcceptFulfillmentDecisionRequest} extends {@link RequestModel}
 *
 * <p>AcceptFulfillmentDecisionRequest</p>
 */
public class AcceptFulfillmentDecisionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DecisionConclusion")
    private String decisionConclusion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DecisionType")
    private String decisionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    private AcceptFulfillmentDecisionRequest(Builder builder) {
        super(builder);
        this.decisionConclusion = builder.decisionConclusion;
        this.decisionType = builder.decisionType;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptFulfillmentDecisionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return decisionConclusion
     */
    public String getDecisionConclusion() {
        return this.decisionConclusion;
    }

    /**
     * @return decisionType
     */
    public String getDecisionType() {
        return this.decisionType;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<AcceptFulfillmentDecisionRequest, Builder> {
        private String decisionConclusion; 
        private String decisionType; 
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptFulfillmentDecisionRequest request) {
            super(request);
            this.decisionConclusion = request.decisionConclusion;
            this.decisionType = request.decisionType;
            this.orderId = request.orderId;
        } 

        /**
         * DecisionConclusion.
         */
        public Builder decisionConclusion(String decisionConclusion) {
            this.putBodyParameter("DecisionConclusion", decisionConclusion);
            this.decisionConclusion = decisionConclusion;
            return this;
        }

        /**
         * DecisionType.
         */
        public Builder decisionType(String decisionType) {
            this.putBodyParameter("DecisionType", decisionType);
            this.decisionType = decisionType;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public AcceptFulfillmentDecisionRequest build() {
            return new AcceptFulfillmentDecisionRequest(this);
        } 

    } 

}
