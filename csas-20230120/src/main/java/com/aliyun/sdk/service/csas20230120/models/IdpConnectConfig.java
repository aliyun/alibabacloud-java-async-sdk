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
 * {@link IdpConnectConfig} extends {@link TeaModel}
 *
 * <p>IdpConnectConfig</p>
 */
public class IdpConnectConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    private String connectorId;

    @com.aliyun.core.annotation.NameInMap("UseConnector")
    private Boolean useConnector;

    private IdpConnectConfig(Builder builder) {
        this.connectorId = builder.connectorId;
        this.useConnector = builder.useConnector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpConnectConfig create() {
        return builder().build();
    }

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
     * @return useConnector
     */
    public Boolean getUseConnector() {
        return this.useConnector;
    }

    public static final class Builder {
        private String connectorId; 
        private Boolean useConnector; 

        private Builder() {
        } 

        private Builder(IdpConnectConfig model) {
            this.connectorId = model.connectorId;
            this.useConnector = model.useConnector;
        } 

        /**
         * ConnectorId.
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }

        /**
         * UseConnector.
         */
        public Builder useConnector(Boolean useConnector) {
            this.useConnector = useConnector;
            return this;
        }

        public IdpConnectConfig build() {
            return new IdpConnectConfig(this);
        } 

    } 

}
