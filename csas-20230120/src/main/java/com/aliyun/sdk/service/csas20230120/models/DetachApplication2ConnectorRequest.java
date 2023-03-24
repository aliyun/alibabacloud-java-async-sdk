// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachApplication2ConnectorRequest} extends {@link RequestModel}
 *
 * <p>DetachApplication2ConnectorRequest</p>
 */
public class DetachApplication2ConnectorRequest extends Request {
    @Body
    @NameInMap("ApplicationIds")
    @Validation(required = true)
    private java.util.List < String > applicationIds;

    @Body
    @NameInMap("ConnectorId")
    @Validation(required = true)
    private String connectorId;

    private DetachApplication2ConnectorRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.connectorId = builder.connectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachApplication2ConnectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    public static final class Builder extends Request.Builder<DetachApplication2ConnectorRequest, Builder> {
        private java.util.List < String > applicationIds; 
        private String connectorId; 

        private Builder() {
            super();
        } 

        private Builder(DetachApplication2ConnectorRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.connectorId = request.connectorId;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            String applicationIdsShrink = shrink(applicationIds, "ApplicationIds", "json");
            this.putBodyParameter("ApplicationIds", applicationIdsShrink);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * ConnectorID。
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        @Override
        public DetachApplication2ConnectorRequest build() {
            return new DetachApplication2ConnectorRequest(this);
        } 

    } 

}
