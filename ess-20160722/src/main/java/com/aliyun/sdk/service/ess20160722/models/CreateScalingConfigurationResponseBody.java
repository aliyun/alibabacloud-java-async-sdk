// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScalingConfigurationResponseBody</p>
 */
public class CreateScalingConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
    private String scalingConfigurationId;

    private CreateScalingConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingConfigurationId = builder.scalingConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public static final class Builder {
        private String requestId; 
        private String scalingConfigurationId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingConfigurationId.
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }

        public CreateScalingConfigurationResponseBody build() {
            return new CreateScalingConfigurationResponseBody(this);
        } 

    } 

}
