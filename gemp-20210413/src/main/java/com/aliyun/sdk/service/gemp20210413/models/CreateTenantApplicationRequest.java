// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantApplicationRequest</p>
 */
public class CreateTenantApplicationRequest extends Request {
    @Body
    @NameInMap("channel")
    @Validation(required = true)
    private String channel;

    @Body
    @NameInMap("clientToken")
    @Validation(required = true)
    private String clientToken;

    private CreateTenantApplicationRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateTenantApplicationRequest, Builder> {
        private String channel; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantApplicationRequest request) {
            super(request);
            this.channel = request.channel;
            this.clientToken = request.clientToken;
        } 

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateTenantApplicationRequest build() {
            return new CreateTenantApplicationRequest(this);
        } 

    } 

}
