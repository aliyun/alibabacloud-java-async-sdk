// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceDataByConditionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceDataByConditionsRequest</p>
 */
public class DeleteServiceDataByConditionsRequest extends Request {
    @Body
    @NameInMap("Conditions")
    @Validation(required = true)
    private java.util.Map < String, ? > conditions;

    @Body
    @NameInMap("ServiceId")
    @Validation(required = true)
    private Long serviceId;

    private DeleteServiceDataByConditionsRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.serviceId = builder.serviceId;
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

    public static final class Builder extends Request.Builder<DeleteServiceDataByConditionsRequest, Builder> {
        private java.util.Map < String, ? > conditions; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceDataByConditionsRequest request) {
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
        public DeleteServiceDataByConditionsRequest build() {
            return new DeleteServiceDataByConditionsRequest(this);
        } 

    } 

}
