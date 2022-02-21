// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteListenerRequest} extends {@link RequestModel}
 *
 * <p>DeleteListenerRequest</p>
 */
public class DeleteListenerRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    private DeleteListenerRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<DeleteListenerRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteListenerRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.listenerId = response.listenerId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public DeleteListenerRequest build() {
            return new DeleteListenerRequest(this);
        } 

    } 

}
