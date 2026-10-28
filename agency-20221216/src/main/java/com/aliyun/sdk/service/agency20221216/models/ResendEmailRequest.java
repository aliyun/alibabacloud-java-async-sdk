// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResendEmailRequest} extends {@link RequestModel}
 *
 * <p>ResendEmailRequest</p>
 */
public class ResendEmailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InviteId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The invitation ID, obtained from the InviteSbuAccount operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>176</p>
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
