// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeleteServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceRequest</p>
 */
public class DeleteServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

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
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceRequest, Builder> {
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceRequest request) {
            super(request);
            this.serviceId = request.serviceId;
        } 

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DeleteServiceRequest build() {
            return new DeleteServiceRequest(this);
        } 

    } 

}
