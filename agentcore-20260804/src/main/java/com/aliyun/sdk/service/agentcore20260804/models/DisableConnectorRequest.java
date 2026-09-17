// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DisableConnectorRequest} extends {@link RequestModel}
 *
 * <p>DisableConnectorRequest</p>
 */
public class DisableConnectorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    private DisableConnectorRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectorName = builder.connectorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableConnectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    public static final class Builder extends Request.Builder<DisableConnectorRequest, Builder> {
        private String workspaceId; 
        private String connectorName; 

        private Builder() {
            super();
        } 

        private Builder(DisableConnectorRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectorName = request.connectorName;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The Connector name. Currently, only qodercli is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        public Builder connectorName(String connectorName) {
            this.putPathParameter("connectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        @Override
        public DisableConnectorRequest build() {
            return new DisableConnectorRequest(this);
        } 

    } 

}
