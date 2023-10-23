// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOtsServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetOtsServiceStatusRequest</p>
 */
public class GetOtsServiceStatusRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private GetOtsServiceStatusRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOtsServiceStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetOtsServiceStatusRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(GetOtsServiceStatusRequest request) {
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
        public GetOtsServiceStatusRequest build() {
            return new GetOtsServiceStatusRequest(this);
        } 

    } 

}
