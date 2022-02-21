// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelHandshakeRequest} extends {@link RequestModel}
 *
 * <p>CancelHandshakeRequest</p>
 */
public class CancelHandshakeRequest extends Request {
    @Query
    @NameInMap("HandshakeId")
    @Validation(required = true)
    private String handshakeId;

    private CancelHandshakeRequest(Builder builder) {
        super(builder);
        this.handshakeId = builder.handshakeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelHandshakeRequest create() {
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

    public static final class Builder extends Request.Builder<CancelHandshakeRequest, Builder> {
        private String handshakeId; 

        private Builder() {
            super();
        } 

        private Builder(CancelHandshakeRequest response) {
            super(response);
            this.handshakeId = response.handshakeId;
        } 

        /**
         * HandshakeId.
         */
        public Builder handshakeId(String handshakeId) {
            this.putQueryParameter("HandshakeId", handshakeId);
            this.handshakeId = handshakeId;
            return this;
        }

        @Override
        public CancelHandshakeRequest build() {
            return new CancelHandshakeRequest(this);
        } 

    } 

}
