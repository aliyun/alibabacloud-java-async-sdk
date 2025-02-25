// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeleteEventBridgeIntegrationRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventBridgeIntegrationRequest</p>
 */
public class DeleteEventBridgeIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Required. The ID of the EventBridge notification integration. You can call the <strong>ListEventBridgeIntegrations</strong> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
