// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionTargetDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionTargetDetailRequest</p>
 */
public class GetInterceptionTargetDetailRequest extends Request {
    @Query
    @NameInMap("TargetId")
    @Validation(required = true)
    private Long targetId;

    private GetInterceptionTargetDetailRequest(Builder builder) {
        super(builder);
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionTargetDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetId
     */
    public Long getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<GetInterceptionTargetDetailRequest, Builder> {
        private Long targetId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionTargetDetailRequest request) {
            super(request);
            this.targetId = request.targetId;
        } 

        /**
         * The ID of the network object.
         * <p>
         * 
         * > You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the IDs of network objects.
         */
        public Builder targetId(Long targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public GetInterceptionTargetDetailRequest build() {
            return new GetInterceptionTargetDetailRequest(this);
        } 

    } 

}
