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
 * {@link UpdateAckClusterConnectorRequest} extends {@link RequestModel}
 *
 * <p>UpdateAckClusterConnectorRequest</p>
 */
public class UpdateAckClusterConnectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorName")
    private String connectorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private String ttl;

    private UpdateAckClusterConnectorRequest(Builder builder) {
        super(builder);
        this.connectorId = builder.connectorId;
        this.connectorName = builder.connectorName;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAckClusterConnectorRequest create() {
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

    /**
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return ttl
     */
    public String getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateAckClusterConnectorRequest, Builder> {
        private String connectorId; 
        private String connectorName; 
        private String ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAckClusterConnectorRequest request) {
            super(request);
            this.connectorId = request.connectorId;
            this.connectorName = request.connectorName;
            this.ttl = request.ttl;
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

        /**
         * ConnectorName.
         */
        public Builder connectorName(String connectorName) {
            this.putQueryParameter("ConnectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(String ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateAckClusterConnectorRequest build() {
            return new UpdateAckClusterConnectorRequest(this);
        } 

    } 

}
