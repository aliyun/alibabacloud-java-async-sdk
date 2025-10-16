// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteAckClusterConnectorRequest} extends {@link RequestModel}
 *
 * <p>DeleteAckClusterConnectorRequest</p>
 */
public class DeleteAckClusterConnectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    private DeleteAckClusterConnectorRequest(Builder builder) {
        super(builder);
        this.connectorId = builder.connectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAckClusterConnectorRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAckClusterConnectorRequest, Builder> {
        private String connectorId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAckClusterConnectorRequest request) {
            super(request);
            this.connectorId = request.connectorId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-7c1bad6c3cc84c33baab</p>
         */
        public Builder connectorId(String connectorId) {
            this.putQueryParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        @Override
        public DeleteAckClusterConnectorRequest build() {
            return new DeleteAckClusterConnectorRequest(this);
        } 

    } 

}
