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
         * <p>The ID of the ACK cluster connector. You can call the <a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a> operation to query the list of ACK cluster connectors.</p>
         * <ul>
         * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: Queries a list of ACK cluster connectors.</li>
         * </ul>
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
         * <p>The name of the ACK cluster connector. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-connector-name</p>
         */
        public Builder connectorName(String connectorName) {
            this.putQueryParameter("ConnectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        /**
         * <p>The synchronization interval for the ACK cluster connector. Valid values: 2 to 60. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
