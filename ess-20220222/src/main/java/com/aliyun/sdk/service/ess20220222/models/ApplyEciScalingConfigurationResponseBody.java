// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyEciScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyEciScalingConfigurationResponseBody</p>
 */
public class ApplyEciScalingConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
    private String scalingConfigurationId;

    private ApplyEciScalingConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingConfigurationId = builder.scalingConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyEciScalingConfigurationResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp16har3jpj6fjbx****</p>
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }

        public ApplyEciScalingConfigurationResponseBody build() {
            return new ApplyEciScalingConfigurationResponseBody(this);
        } 

    } 

}
