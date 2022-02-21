// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyScalingRuleResponseBody</p>
 */
public class ModifyScalingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingRuleId")
    private String scalingRuleId;

    private ModifyScalingRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingRuleId = builder.scalingRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingRuleResponseBody create() {
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

        public ModifyScalingRuleResponseBody build() {
            return new ModifyScalingRuleResponseBody(this);
        } 

    } 

}
