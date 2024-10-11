// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGatewayFlowRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewayFlowRuleResponseBody</p>
 */
public class CreateGatewayFlowRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGatewayFlowRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayFlowRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>608</p>
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>72FC625E-9629-591B-9C01-3F0BFDAB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGatewayFlowRuleResponseBody build() {
            return new CreateGatewayFlowRuleResponseBody(this);
        } 

    } 

}
