// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResendEmailRequest} extends {@link RequestModel}
 *
 * <p>ResendEmailRequest</p>
 */
public class ResendEmailRequest extends Request {
    @Query
    @NameInMap("InviteId")
    @Validation(required = true)
    private Long inviteId;

    private ResendEmailRequest(Builder builder) {
        super(builder);
        this.inviteId = builder.inviteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResendEmailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inviteId
     */
    public Long getInviteId() {
        return this.inviteId;
    }

    public static final class Builder extends Request.Builder<ResendEmailRequest, Builder> {
        private Long inviteId; 

        private Builder() {
            super();
        } 

        private Builder(ResendEmailRequest request) {
            super(request);
            this.inviteId = request.inviteId;
        } 

        /**
         * InviteId.
         */
        public Builder inviteId(Long inviteId) {
            this.putQueryParameter("InviteId", inviteId);
            this.inviteId = inviteId;
            return this;
        }

        @Override
        public ResendEmailRequest build() {
            return new ResendEmailRequest(this);
        } 

    } 

}
