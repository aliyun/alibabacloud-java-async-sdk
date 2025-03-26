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
 * {@link CreateEciScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEciScalingConfigurationResponseBody</p>
 */
public class CreateEciScalingConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
    private String scalingConfigurationId;

    private CreateEciScalingConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingConfigurationId = builder.scalingConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEciScalingConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateEciScalingConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.scalingConfigurationId = model.scalingConfigurationId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89945DD3-9072-47D0-A318-353284CF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the elastic container instance (container group).</p>
         * 
         * <strong>example:</strong>
         * <p>eci-uf6fonnghi50u374****</p>
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }

        public CreateEciScalingConfigurationResponseBody build() {
            return new CreateEciScalingConfigurationResponseBody(this);
        } 

    } 

}
