// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetPdpServiceRequest} extends {@link RequestModel}
 *
 * <p>GetPdpServiceRequest</p>
 */
public class GetPdpServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    private GetPdpServiceRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPdpServiceRequest create() {
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

    public static final class Builder extends Request.Builder<GetPdpServiceRequest, Builder> {
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(GetPdpServiceRequest request) {
            super(request);
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(Long serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public GetPdpServiceRequest build() {
            return new GetPdpServiceRequest(this);
        } 

    } 

}
