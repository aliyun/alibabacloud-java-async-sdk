// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenImmServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenImmServiceRequest</p>
 */
public class OpenImmServiceRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private OpenImmServiceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenImmServiceRequest create() {
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

    public static final class Builder extends Request.Builder<OpenImmServiceRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(OpenImmServiceRequest response) {
            super(response);
            this.ownerId = response.ownerId;
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
        public OpenImmServiceRequest build() {
            return new OpenImmServiceRequest(this);
        } 

    } 

}
