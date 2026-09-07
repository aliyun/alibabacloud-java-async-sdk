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
 * {@link UpdateConnectorRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectorRequest</p>
 */
public class UpdateConnectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccelerateStatus")
    private String accelerateStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwitchStatus")
    private String switchStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VipCidr")
    private String vipCidr;

    private UpdateConnectorRequest(Builder builder) {
        super(builder);
        this.accelerateStatus = builder.accelerateStatus;
        this.connectorId = builder.connectorId;
        this.name = builder.name;
        this.switchStatus = builder.switchStatus;
        this.vipCidr = builder.vipCidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateStatus
     */
    public String getAccelerateStatus() {
        return this.accelerateStatus;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return this.switchStatus;
    }

    /**
     * @return vipCidr
     */
    public String getVipCidr() {
        return this.vipCidr;
    }

    public static final class Builder extends Request.Builder<UpdateConnectorRequest, Builder> {
        private String accelerateStatus; 
        private String connectorId; 
        private String name; 
        private String switchStatus; 
        private String vipCidr; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectorRequest request) {
            super(request);
            this.accelerateStatus = request.accelerateStatus;
            this.connectorId = request.connectorId;
            this.name = request.name;
            this.switchStatus = request.switchStatus;
            this.vipCidr = request.vipCidr;
        } 

        /**
         * <p>Specifies whether to enable Global Accelerator. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder accelerateStatus(String accelerateStatus) {
            this.putBodyParameter("AccelerateStatus", accelerateStatus);
            this.accelerateStatus = accelerateStatus;
            return this;
        }

        /**
         * <p>The Connector ID. You can obtain the value by calling <a href="~~ListConnectors~~">ListConnectors</a>.</p>
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

        /**
         * <p>The Connector name. The name must be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>connector_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The instance status of the Connector. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder switchStatus(String switchStatus) {
            this.putBodyParameter("SwitchStatus", switchStatus);
            this.switchStatus = switchStatus;
            return this;
        }

        /**
         * <p>The CIDR block of the virtual IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder vipCidr(String vipCidr) {
            this.putBodyParameter("VipCidr", vipCidr);
            this.vipCidr = vipCidr;
            return this;
        }

        @Override
        public UpdateConnectorRequest build() {
            return new UpdateConnectorRequest(this);
        } 

    } 

}
