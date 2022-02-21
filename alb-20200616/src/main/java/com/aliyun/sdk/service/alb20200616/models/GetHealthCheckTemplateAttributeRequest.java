// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHealthCheckTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetHealthCheckTemplateAttributeRequest</p>
 */
public class GetHealthCheckTemplateAttributeRequest extends Request {
    @Query
    @NameInMap("HealthCheckTemplateId")
    private String healthCheckTemplateId;

    private GetHealthCheckTemplateAttributeRequest(Builder builder) {
        super(builder);
        this.healthCheckTemplateId = builder.healthCheckTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHealthCheckTemplateAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckTemplateId
     */
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public static final class Builder extends Request.Builder<GetHealthCheckTemplateAttributeRequest, Builder> {
        private String healthCheckTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(GetHealthCheckTemplateAttributeRequest response) {
            super(response);
            this.healthCheckTemplateId = response.healthCheckTemplateId;
        } 

        /**
         * 健康检查模板Id
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        @Override
        public GetHealthCheckTemplateAttributeRequest build() {
            return new GetHealthCheckTemplateAttributeRequest(this);
        } 

    } 

}
