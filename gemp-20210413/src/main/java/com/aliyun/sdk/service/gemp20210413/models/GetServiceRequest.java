// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRequest</p>
 */
public class GetServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    private GetServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRequest create() {
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
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<GetServiceRequest, Builder> {
        private String clientToken; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.serviceId = request.serviceId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public GetServiceRequest build() {
            return new GetServiceRequest(this);
        } 

    } 

}
