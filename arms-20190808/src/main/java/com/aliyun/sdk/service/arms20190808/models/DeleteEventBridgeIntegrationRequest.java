// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventBridgeIntegrationRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventBridgeIntegrationRequest</p>
 */
public class DeleteEventBridgeIntegrationRequest extends Request {
    @Body
    @NameInMap("Id")
    private Long id;

    private DeleteEventBridgeIntegrationRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventBridgeIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteEventBridgeIntegrationRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventBridgeIntegrationRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the EventBridge integration. You can call the **ListEventBridgeIntegrations** operation to query the ID.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteEventBridgeIntegrationRequest build() {
            return new DeleteEventBridgeIntegrationRequest(this);
        } 

    } 

}
