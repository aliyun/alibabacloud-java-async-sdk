// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
         * <p>The ID of the request.</p>
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
         * <p>asc-bp1ffogfdauy0nu5****</p>
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
