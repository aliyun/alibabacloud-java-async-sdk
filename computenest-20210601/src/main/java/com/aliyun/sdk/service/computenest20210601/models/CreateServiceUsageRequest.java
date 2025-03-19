// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateServiceUsageRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceUsageRequest</p>
 */
public class CreateServiceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInformation")
    private java.util.Map<String, String> userInformation;

    private CreateServiceUsageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceId = builder.serviceId;
        this.userInformation = builder.userInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return userInformation
     */
    public java.util.Map<String, String> getUserInformation() {
        return this.userInformation;
    }

    public static final class Builder extends Request.Builder<CreateServiceUsageRequest, Builder> {
        private String clientToken; 
        private String serviceId; 
        private java.util.Map<String, String> userInformation; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceUsageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.serviceId = request.serviceId;
            this.userInformation = request.userInformation;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-d6fc5f949a9246xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The application information.</p>
         */
        public Builder userInformation(java.util.Map<String, String> userInformation) {
            String userInformationShrink = shrink(userInformation, "UserInformation", "json");
            this.putQueryParameter("UserInformation", userInformationShrink);
            this.userInformation = userInformation;
            return this;
        }

        @Override
        public CreateServiceUsageRequest build() {
            return new CreateServiceUsageRequest(this);
        } 

    } 

}
