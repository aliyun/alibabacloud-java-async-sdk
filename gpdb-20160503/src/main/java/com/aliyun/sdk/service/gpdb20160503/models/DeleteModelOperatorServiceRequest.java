// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteModelOperatorServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelOperatorServiceRequest</p>
 */
public class DeleteModelOperatorServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    private DeleteModelOperatorServiceRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelOperatorServiceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteModelOperatorServiceRequest, Builder> {
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelOperatorServiceRequest request) {
            super(request);
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>The ID of the model operator service to be released. You can obtain the ID by calling ListModelOperatorServices. The service must belong to the current account and the requested region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg-mo-123456789abc</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DeleteModelOperatorServiceRequest build() {
            return new DeleteModelOperatorServiceRequest(this);
        } 

    } 

}
