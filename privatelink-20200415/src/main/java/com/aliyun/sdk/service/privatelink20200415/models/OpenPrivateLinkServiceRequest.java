// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenPrivateLinkServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenPrivateLinkServiceRequest</p>
 */
public class OpenPrivateLinkServiceRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private OpenPrivateLinkServiceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenPrivateLinkServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<OpenPrivateLinkServiceRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(OpenPrivateLinkServiceRequest request) {
            super(request);
            this.ownerId = request.ownerId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public OpenPrivateLinkServiceRequest build() {
            return new OpenPrivateLinkServiceRequest(this);
        } 

    } 

}
