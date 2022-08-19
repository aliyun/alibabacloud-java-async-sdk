// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficMirrorServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetTrafficMirrorServiceStatusRequest</p>
 */
public class GetTrafficMirrorServiceStatusRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private GetTrafficMirrorServiceStatusRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficMirrorServiceStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetTrafficMirrorServiceStatusRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(GetTrafficMirrorServiceStatusRequest request) {
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
        public GetTrafficMirrorServiceStatusRequest build() {
            return new GetTrafficMirrorServiceStatusRequest(this);
        } 

    } 

}
