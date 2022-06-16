// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceRequest</p>
 */
public class DeleteServiceRequest extends Request {
    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private Long serviceId;

    private DeleteServiceRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceRequest, Builder> {
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceRequest request) {
            super(request);
            this.serviceId = request.serviceId;
        } 

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DeleteServiceRequest build() {
            return new DeleteServiceRequest(this);
        } 

    } 

}
