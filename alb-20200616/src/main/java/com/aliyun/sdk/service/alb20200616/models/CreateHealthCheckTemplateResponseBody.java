// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHealthCheckTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHealthCheckTemplateResponseBody</p>
 */
public class CreateHealthCheckTemplateResponseBody extends TeaModel {
    @NameInMap("HealthCheckTemplateId")
    private String healthCheckTemplateId;

    @NameInMap("RequestId")
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
         * The ID of the health check template.
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * The request ID.
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
