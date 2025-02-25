// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceRequest</p>
 */
public class DeleteServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    private DeleteServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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

    public static final class Builder extends Request.Builder<DeleteServiceRequest, Builder> {
        private String clientToken; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceRequest request) {
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
        public DeleteServiceRequest build() {
            return new DeleteServiceRequest(this);
        } 

    } 

}
