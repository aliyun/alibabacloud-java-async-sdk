// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceDataRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceDataRequest</p>
 */
public class UpdateServiceDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Conditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > conditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    private UpdateServiceDataRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceDataRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateServiceDataRequest, Builder> {
        private java.util.Map < String, ? > conditions; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceDataRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.serviceId = request.serviceId;
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

        @Override
        public UpdateServiceDataRequest build() {
            return new UpdateServiceDataRequest(this);
        } 

    } 

}
