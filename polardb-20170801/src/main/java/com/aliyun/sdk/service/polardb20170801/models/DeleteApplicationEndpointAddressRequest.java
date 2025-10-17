// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteApplicationEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationEndpointAddressRequest</p>
 */
public class DeleteApplicationEndpointAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netType;

    private DeleteApplicationEndpointAddressRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.endpointId = builder.endpointId;
        this.netType = builder.netType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationEndpointAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationEndpointAddressRequest, Builder> {
        private String applicationId; 
        private String endpointId; 
        private String netType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationEndpointAddressRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.endpointId = request.endpointId;
            this.netType = request.netType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        @Override
        public DeleteApplicationEndpointAddressRequest build() {
            return new DeleteApplicationEndpointAddressRequest(this);
        } 

    } 

}
