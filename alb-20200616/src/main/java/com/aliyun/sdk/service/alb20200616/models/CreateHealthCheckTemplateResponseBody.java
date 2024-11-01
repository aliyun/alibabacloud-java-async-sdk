// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHealthCheckTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHealthCheckTemplateResponseBody</p>
 */
public class CreateHealthCheckTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateId")
    private String healthCheckTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHealthCheckTemplateResponseBody(Builder builder) {
        this.healthCheckTemplateId = builder.healthCheckTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHealthCheckTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthCheckTemplateId
     */
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String healthCheckTemplateId; 
        private String requestId; 

        /**
         * <p>The ID of the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>hct-1224334</p>
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHealthCheckTemplateResponseBody build() {
            return new CreateHealthCheckTemplateResponseBody(this);
        } 

    } 

}
