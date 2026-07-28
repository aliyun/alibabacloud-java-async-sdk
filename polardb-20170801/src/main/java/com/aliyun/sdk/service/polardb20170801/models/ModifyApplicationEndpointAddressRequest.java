// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyApplicationEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationEndpointAddressRequest</p>
 */
public class ModifyApplicationEndpointAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewConnectionStringPrefix")
    private String newConnectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPorts")
    private java.util.List<NewPorts> newPorts;

    private ModifyApplicationEndpointAddressRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.endpointId = builder.endpointId;
        this.netType = builder.netType;
        this.newConnectionStringPrefix = builder.newConnectionStringPrefix;
        this.newPorts = builder.newPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationEndpointAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return newConnectionStringPrefix
     */
    public String getNewConnectionStringPrefix() {
        return this.newConnectionStringPrefix;
    }

    /**
     * @return newPorts
     */
    public java.util.List<NewPorts> getNewPorts() {
        return this.newPorts;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationEndpointAddressRequest, Builder> {
        private String applicationId; 
        private String endpointId; 
        private String netType; 
        private String newConnectionStringPrefix; 
        private java.util.List<NewPorts> newPorts; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationEndpointAddressRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.endpointId = request.endpointId;
            this.netType = request.netType;
            this.newConnectionStringPrefix = request.newConnectionStringPrefix;
            this.newPorts = request.newPorts;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * NewConnectionStringPrefix.
         */
        public Builder newConnectionStringPrefix(String newConnectionStringPrefix) {
            this.putQueryParameter("NewConnectionStringPrefix", newConnectionStringPrefix);
            this.newConnectionStringPrefix = newConnectionStringPrefix;
            return this;
        }

        /**
         * NewPorts.
         */
        public Builder newPorts(java.util.List<NewPorts> newPorts) {
            String newPortsShrink = shrink(newPorts, "NewPorts", "json");
            this.putQueryParameter("NewPorts", newPortsShrink);
            this.newPorts = newPorts;
            return this;
        }

        @Override
        public ModifyApplicationEndpointAddressRequest build() {
            return new ModifyApplicationEndpointAddressRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyApplicationEndpointAddressRequest} extends {@link TeaModel}
     *
     * <p>ModifyApplicationEndpointAddressRequest</p>
     */
    public static class NewPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewPort")
        private Integer newPort;

        @com.aliyun.core.annotation.NameInMap("OldPort")
        private Integer oldPort;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        private NewPorts(Builder builder) {
            this.newPort = builder.newPort;
            this.oldPort = builder.oldPort;
            this.portName = builder.portName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewPorts create() {
            return builder().build();
        }

        /**
         * @return newPort
         */
        public Integer getNewPort() {
            return this.newPort;
        }

        /**
         * @return oldPort
         */
        public Integer getOldPort() {
            return this.oldPort;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        public static final class Builder {
            private Integer newPort; 
            private Integer oldPort; 
            private String portName; 

            private Builder() {
            } 

            private Builder(NewPorts model) {
                this.newPort = model.newPort;
                this.oldPort = model.oldPort;
                this.portName = model.portName;
            } 

            /**
             * NewPort.
             */
            public Builder newPort(Integer newPort) {
                this.newPort = newPort;
                return this;
            }

            /**
             * OldPort.
             */
            public Builder oldPort(Integer oldPort) {
                this.oldPort = oldPort;
                return this;
            }

            /**
             * PortName.
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            public NewPorts build() {
                return new NewPorts(this);
            } 

        } 

    }
}
