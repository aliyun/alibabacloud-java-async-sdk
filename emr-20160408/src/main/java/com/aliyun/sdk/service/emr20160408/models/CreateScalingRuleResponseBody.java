// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScalingRuleResponseBody</p>
 */
public class CreateScalingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingRuleId")
    private String scalingRuleId;

    private CreateScalingRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingRuleId = builder.scalingRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private String scalingRuleId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingRuleId.
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        public CreateScalingRuleResponseBody build() {
            return new CreateScalingRuleResponseBody(this);
        } 

    } 

}
