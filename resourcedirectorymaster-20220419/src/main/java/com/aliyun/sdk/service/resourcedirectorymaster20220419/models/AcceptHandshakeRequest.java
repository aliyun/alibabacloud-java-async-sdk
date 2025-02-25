// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link AcceptHandshakeRequest} extends {@link RequestModel}
 *
 * <p>AcceptHandshakeRequest</p>
 */
public class AcceptHandshakeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandshakeId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the invitation.</p>
         * <p>You can call the <a href="~~ListHandshakesForAccount~~">ListHandshakesForAccount</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>h-Ih8IuPfvV0t0****</p>
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
