// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceDataByConditionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceDataByConditionsRequest</p>
 */
public class DeleteServiceDataByConditionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Conditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > conditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("X-DashScope-OpenAPISource")
    private String xDashScopeOpenAPISource;

    private DeleteServiceDataByConditionsRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.serviceId = builder.serviceId;
        this.xDashScopeOpenAPISource = builder.xDashScopeOpenAPISource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceDataByConditionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.Map < String, ? > getConditions() {
        return this.conditions;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return xDashScopeOpenAPISource
     */
    public String getXDashScopeOpenAPISource() {
        return this.xDashScopeOpenAPISource;
    }

    public static final class Builder extends Request.Builder<DeleteServiceDataByConditionsRequest, Builder> {
        private java.util.Map < String, ? > conditions; 
        private Long serviceId; 
        private String xDashScopeOpenAPISource; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceDataByConditionsRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.serviceId = request.serviceId;
            this.xDashScopeOpenAPISource = request.xDashScopeOpenAPISource;
        } 

        /**
         * Conditions.
         */
        public Builder conditions(java.util.Map < String, ? > conditions) {
            String conditionsShrink = shrink(conditions, "Conditions", "json");
            this.putBodyParameter("Conditions", conditionsShrink);
            this.conditions = conditions;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * X-DashScope-OpenAPISource.
         */
        public Builder xDashScopeOpenAPISource(String xDashScopeOpenAPISource) {
            this.putBodyParameter("X-DashScope-OpenAPISource", xDashScopeOpenAPISource);
            this.xDashScopeOpenAPISource = xDashScopeOpenAPISource;
            return this;
        }

        @Override
        public DeleteServiceDataByConditionsRequest build() {
            return new DeleteServiceDataByConditionsRequest(this);
        } 

    } 

}
