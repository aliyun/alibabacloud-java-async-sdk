// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugResourceRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DebugResourceRuleResponseBody</p>
 */
public class DebugResourceRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentValues")
    private java.util.Map < String, ? > currentValues;

    @com.aliyun.core.annotation.NameInMap("OutputValues")
    private java.util.Map < String, ? > outputValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DebugResourceRuleResponseBody(Builder builder) {
        this.currentValues = builder.currentValues;
        this.outputValues = builder.outputValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugResourceRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentValues
     */
    public java.util.Map < String, ? > getCurrentValues() {
        return this.currentValues;
    }

    /**
     * @return outputValues
     */
    public java.util.Map < String, ? > getOutputValues() {
        return this.outputValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > currentValues; 
        private java.util.Map < String, ? > outputValues; 
        private String requestId; 

        /**
         * CurrentValues.
         */
        public Builder currentValues(java.util.Map < String, ? > currentValues) {
            this.currentValues = currentValues;
            return this;
        }

        /**
         * OutputValues.
         */
        public Builder outputValues(java.util.Map < String, ? > outputValues) {
            this.outputValues = outputValues;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DebugResourceRuleResponseBody build() {
            return new DebugResourceRuleResponseBody(this);
        } 

    } 

}
