// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link UpdateEgressProxyGatewayAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEgressProxyGatewayAttributeRequest</p>
 */
public class UpdateEgressProxyGatewayAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddListenerProperties")
    private java.util.List<AddListenerProperties> addListenerProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultEgressProxyIpPoolId")
    private String defaultEgressProxyIpPoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyGatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayName")
    private String egressProxyGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveListenerProperties")
    private java.util.List<RemoveListenerProperties> removeListenerProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TlsInterceptProperties")
    private TlsInterceptProperties tlsInterceptProperties;

    private UpdateEgressProxyGatewayAttributeRequest(Builder builder) {
        super(builder);
        this.addListenerProperties = builder.addListenerProperties;
        this.clientToken = builder.clientToken;
        this.defaultEgressProxyIpPoolId = builder.defaultEgressProxyIpPoolId;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
        this.egressProxyGatewayName = builder.egressProxyGatewayName;
        this.removeListenerProperties = builder.removeListenerProperties;
        this.tlsInterceptProperties = builder.tlsInterceptProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEgressProxyGatewayAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addListenerProperties
     */
    public java.util.List<AddListenerProperties> getAddListenerProperties() {
        return this.addListenerProperties;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return defaultEgressProxyIpPoolId
     */
    public String getDefaultEgressProxyIpPoolId() {
        return this.defaultEgressProxyIpPoolId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    /**
     * @return egressProxyGatewayName
     */
    public String getEgressProxyGatewayName() {
        return this.egressProxyGatewayName;
    }

    /**
     * @return removeListenerProperties
     */
    public java.util.List<RemoveListenerProperties> getRemoveListenerProperties() {
        return this.removeListenerProperties;
    }

    /**
     * @return tlsInterceptProperties
     */
    public TlsInterceptProperties getTlsInterceptProperties() {
        return this.tlsInterceptProperties;
    }

    public static final class Builder extends Request.Builder<UpdateEgressProxyGatewayAttributeRequest, Builder> {
        private java.util.List<AddListenerProperties> addListenerProperties; 
        private String clientToken; 
        private String defaultEgressProxyIpPoolId; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyGatewayId; 
        private String egressProxyGatewayName; 
        private java.util.List<RemoveListenerProperties> removeListenerProperties; 
        private TlsInterceptProperties tlsInterceptProperties; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEgressProxyGatewayAttributeRequest request) {
            super(request);
            this.addListenerProperties = request.addListenerProperties;
            this.clientToken = request.clientToken;
            this.defaultEgressProxyIpPoolId = request.defaultEgressProxyIpPoolId;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyGatewayId = request.egressProxyGatewayId;
            this.egressProxyGatewayName = request.egressProxyGatewayName;
            this.removeListenerProperties = request.removeListenerProperties;
            this.tlsInterceptProperties = request.tlsInterceptProperties;
        } 

        /**
         * AddListenerProperties.
         */
        public Builder addListenerProperties(java.util.List<AddListenerProperties> addListenerProperties) {
            this.putBodyParameter("AddListenerProperties", addListenerProperties);
            this.addListenerProperties = addListenerProperties;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DefaultEgressProxyIpPoolId.
         */
        public Builder defaultEgressProxyIpPoolId(String defaultEgressProxyIpPoolId) {
            this.putBodyParameter("DefaultEgressProxyIpPoolId", defaultEgressProxyIpPoolId);
            this.defaultEgressProxyIpPoolId = defaultEgressProxyIpPoolId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.putBodyParameter("EgressProxyGatewayId", egressProxyGatewayId);
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        /**
         * EgressProxyGatewayName.
         */
        public Builder egressProxyGatewayName(String egressProxyGatewayName) {
            this.putBodyParameter("EgressProxyGatewayName", egressProxyGatewayName);
            this.egressProxyGatewayName = egressProxyGatewayName;
            return this;
        }

        /**
         * RemoveListenerProperties.
         */
        public Builder removeListenerProperties(java.util.List<RemoveListenerProperties> removeListenerProperties) {
            this.putBodyParameter("RemoveListenerProperties", removeListenerProperties);
            this.removeListenerProperties = removeListenerProperties;
            return this;
        }

        /**
         * TlsInterceptProperties.
         */
        public Builder tlsInterceptProperties(TlsInterceptProperties tlsInterceptProperties) {
            this.putBodyParameter("TlsInterceptProperties", tlsInterceptProperties);
            this.tlsInterceptProperties = tlsInterceptProperties;
            return this;
        }

        @Override
        public UpdateEgressProxyGatewayAttributeRequest build() {
            return new UpdateEgressProxyGatewayAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEgressProxyGatewayAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyGatewayAttributeRequest</p>
     */
    public static class AddListenerProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocol;

        private AddListenerProperties(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddListenerProperties create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(AddListenerProperties model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>17486</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public AddListenerProperties build() {
                return new AddListenerProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEgressProxyGatewayAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyGatewayAttributeRequest</p>
     */
    public static class RemoveListenerProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocol;

        private RemoveListenerProperties(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveListenerProperties create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(RemoveListenerProperties model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>32720</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public RemoveListenerProperties build() {
                return new RemoveListenerProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEgressProxyGatewayAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyGatewayAttributeRequest</p>
     */
    public static class TlsInterceptProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateCaCertificateId")
        private String privateCaCertificateId;

        @com.aliyun.core.annotation.NameInMap("TlsInterceptMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tlsInterceptMode;

        private TlsInterceptProperties(Builder builder) {
            this.privateCaCertificateId = builder.privateCaCertificateId;
            this.tlsInterceptMode = builder.tlsInterceptMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TlsInterceptProperties create() {
            return builder().build();
        }

        /**
         * @return privateCaCertificateId
         */
        public String getPrivateCaCertificateId() {
            return this.privateCaCertificateId;
        }

        /**
         * @return tlsInterceptMode
         */
        public String getTlsInterceptMode() {
            return this.tlsInterceptMode;
        }

        public static final class Builder {
            private String privateCaCertificateId; 
            private String tlsInterceptMode; 

            private Builder() {
            } 

            private Builder(TlsInterceptProperties model) {
                this.privateCaCertificateId = model.privateCaCertificateId;
                this.tlsInterceptMode = model.tlsInterceptMode;
            } 

            /**
             * PrivateCaCertificateId.
             */
            public Builder privateCaCertificateId(String privateCaCertificateId) {
                this.privateCaCertificateId = privateCaCertificateId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder tlsInterceptMode(String tlsInterceptMode) {
                this.tlsInterceptMode = tlsInterceptMode;
                return this;
            }

            public TlsInterceptProperties build() {
                return new TlsInterceptProperties(this);
            } 

        } 

    }
}
