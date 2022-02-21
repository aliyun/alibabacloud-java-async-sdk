// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAhasServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenAhasServiceRequest</p>
 */
public class OpenAhasServiceRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private OpenAhasServiceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAhasServiceRequest create() {
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

    public static final class Builder extends Request.Builder<OpenAhasServiceRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(OpenAhasServiceRequest response) {
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
        public OpenAhasServiceRequest build() {
            return new OpenAhasServiceRequest(this);
        } 

    } 

}
