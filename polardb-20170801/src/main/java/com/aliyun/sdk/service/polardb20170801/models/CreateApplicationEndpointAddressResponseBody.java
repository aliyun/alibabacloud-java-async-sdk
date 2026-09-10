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
 * {@link CreateApplicationEndpointAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationEndpointAddressResponseBody</p>
 */
public class CreateApplicationEndpointAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationEndpointAddressResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.endpointId = builder.endpointId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationEndpointAddressResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private String endpointId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApplicationEndpointAddressResponseBody model) {
            this.applicationId = model.applicationId;
            this.endpointId = model.endpointId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The service endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationEndpointAddressResponseBody build() {
            return new CreateApplicationEndpointAddressResponseBody(this);
        } 

    } 

}
