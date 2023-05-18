// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptHandshakeRequest} extends {@link RequestModel}
 *
 * <p>AcceptHandshakeRequest</p>
 */
public class AcceptHandshakeRequest extends Request {
    @Query
    @NameInMap("HandshakeId")
    @Validation(required = true)
    private String handshakeId;

    private AcceptHandshakeRequest(Builder builder) {
        super(builder);
        this.handshakeId = builder.handshakeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptHandshakeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return handshakeId
     */
    public String getHandshakeId() {
        return this.handshakeId;
    }

    public static final class Builder extends Request.Builder<AcceptHandshakeRequest, Builder> {
        private String handshakeId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptHandshakeRequest request) {
            super(request);
            this.handshakeId = request.handshakeId;
        } 

        /**
         * The ID of the invitation.
         * <p>
         * 
         * You can call the [ListHandshakesForAccount](~~160006~~) operation to obtain the ID.
         */
        public Builder handshakeId(String handshakeId) {
            this.putQueryParameter("HandshakeId", handshakeId);
            this.handshakeId = handshakeId;
            return this;
        }

        @Override
        public AcceptHandshakeRequest build() {
            return new AcceptHandshakeRequest(this);
        } 

    } 

}
