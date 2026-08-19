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
 * {@link GetConnectorRequest} extends {@link RequestModel}
 *
 * <p>GetConnectorRequest</p>
 */
public class GetConnectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    private GetConnectorRequest(Builder builder) {
        super(builder);
        this.connectorId = builder.connectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectorRequest create() {
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

    public static final class Builder extends Request.Builder<GetConnectorRequest, Builder> {
        private String connectorId; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectorRequest request) {
            super(request);
            this.connectorId = request.connectorId;
        } 

        /**
         * <p>ConnectorID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-fcd9c35583087b2f</p>
         */
        public Builder connectorId(String connectorId) {
            this.putQueryParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        @Override
        public GetConnectorRequest build() {
            return new GetConnectorRequest(this);
        } 

    } 

}
