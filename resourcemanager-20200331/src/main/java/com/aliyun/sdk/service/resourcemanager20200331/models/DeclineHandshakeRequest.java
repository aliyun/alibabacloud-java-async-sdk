// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DeclineHandshakeRequest} extends {@link RequestModel}
 *
 * <p>DeclineHandshakeRequest</p>
 */
public class DeclineHandshakeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandshakeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String handshakeId;

    private DeclineHandshakeRequest(Builder builder) {
        super(builder);
        this.handshakeId = builder.handshakeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeclineHandshakeRequest create() {
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

    public static final class Builder extends Request.Builder<DeclineHandshakeRequest, Builder> {
        private String handshakeId; 

        private Builder() {
            super();
        } 

        private Builder(DeclineHandshakeRequest request) {
            super(request);
            this.handshakeId = request.handshakeId;
        } 

        /**
         * <p>The ID of the invitation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>h-ycm4rp****</p>
         */
        public Builder handshakeId(String handshakeId) {
            this.putQueryParameter("HandshakeId", handshakeId);
            this.handshakeId = handshakeId;
            return this;
        }

        @Override
        public DeclineHandshakeRequest build() {
            return new DeclineHandshakeRequest(this);
        } 

    } 

}
