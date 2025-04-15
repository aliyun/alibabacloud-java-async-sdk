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
 * {@link AttachApplication2ConnectorRequest} extends {@link RequestModel}
 *
 * <p>AttachApplication2ConnectorRequest</p>
 */
public class AttachApplication2ConnectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    private AttachApplication2ConnectorRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.connectorId = builder.connectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachApplication2ConnectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    public static final class Builder extends Request.Builder<AttachApplication2ConnectorRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private String connectorId; 

        private Builder() {
            super();
        } 

        private Builder(AttachApplication2ConnectorRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.connectorId = request.connectorId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            String applicationIdsShrink = shrink(applicationIds, "ApplicationIds", "json");
            this.putBodyParameter("ApplicationIds", applicationIdsShrink);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>ConnectorID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        @Override
        public AttachApplication2ConnectorRequest build() {
            return new AttachApplication2ConnectorRequest(this);
        } 

    } 

}
