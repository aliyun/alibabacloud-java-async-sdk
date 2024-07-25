// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceUsageRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceUsageRequest</p>
 */
public class UpdateServiceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInformation")
    private java.util.Map < String, String > userInformation;

    private UpdateServiceUsageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceId = builder.serviceId;
        this.userInformation = builder.userInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceUsageRequest create() {
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
    public java.util.Map < String, String > getUserInformation() {
        return this.userInformation;
    }

    public static final class Builder extends Request.Builder<UpdateServiceUsageRequest, Builder> {
        private String clientToken; 
        private String serviceId; 
        private java.util.Map < String, String > userInformation; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceUsageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.serviceId = request.serviceId;
            this.userInformation = request.userInformation;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * UserInformation.
         */
        public Builder userInformation(java.util.Map < String, String > userInformation) {
            String userInformationShrink = shrink(userInformation, "UserInformation", "json");
            this.putQueryParameter("UserInformation", userInformationShrink);
            this.userInformation = userInformation;
            return this;
        }

        @Override
        public UpdateServiceUsageRequest build() {
            return new UpdateServiceUsageRequest(this);
        } 

    } 

}
