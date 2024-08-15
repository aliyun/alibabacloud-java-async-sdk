// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableServiceGroupWebhookRequest} extends {@link RequestModel}
 *
 * <p>DisableServiceGroupWebhookRequest</p>
 */
public class DisableServiceGroupWebhookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    private DisableServiceGroupWebhookRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableServiceGroupWebhookRequest create() {
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
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<DisableServiceGroupWebhookRequest, Builder> {
        private String clientToken; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DisableServiceGroupWebhookRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.serviceGroupId = request.serviceGroupId;
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
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public DisableServiceGroupWebhookRequest build() {
            return new DisableServiceGroupWebhookRequest(this);
        } 

    } 

}
