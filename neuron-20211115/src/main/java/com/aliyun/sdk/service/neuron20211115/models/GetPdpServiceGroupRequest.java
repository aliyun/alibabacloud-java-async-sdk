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
 * {@link GetPdpServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>GetPdpServiceGroupRequest</p>
 */
public class GetPdpServiceGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    private GetPdpServiceGroupRequest(Builder builder) {
        super(builder);
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPdpServiceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<GetPdpServiceGroupRequest, Builder> {
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetPdpServiceGroupRequest request) {
            super(request);
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putPathParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public GetPdpServiceGroupRequest build() {
            return new GetPdpServiceGroupRequest(this);
        } 

    } 

}
