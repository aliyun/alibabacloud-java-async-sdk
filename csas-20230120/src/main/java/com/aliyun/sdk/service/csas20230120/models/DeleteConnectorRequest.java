// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteConnectorRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectorRequest</p>
 */
public class DeleteConnectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    private DeleteConnectorRequest(Builder builder) {
        super(builder);
        this.connectorId = builder.connectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    public static final class Builder extends Request.Builder<DeleteConnectorRequest, Builder> {
        private String connectorId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectorRequest request) {
            super(request);
            this.connectorId = request.connectorId;
        } 

        /**
         * <p>ConnectorID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-d02b62911b2fb2d4</p>
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        @Override
        public DeleteConnectorRequest build() {
            return new DeleteConnectorRequest(this);
        } 

    } 

}
