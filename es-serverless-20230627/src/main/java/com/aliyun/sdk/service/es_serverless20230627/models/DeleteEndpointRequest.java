// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link DeleteEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteEndpointRequest</p>
 */
public class DeleteEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("endpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    private DeleteEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    public static final class Builder extends Request.Builder<DeleteEndpointRequest, Builder> {
        private String endpointId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEndpointRequest request) {
            super(request);
            this.endpointId = request.endpointId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>essep-2f46b743f60****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putPathParameter("endpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        @Override
        public DeleteEndpointRequest build() {
            return new DeleteEndpointRequest(this);
        } 

    } 

}
