// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link CreateAtiAgentRegisterInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateAtiAgentRegisterInfoRequest</p>
 */
public class CreateAtiAgentRegisterInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentDescription")
    private String agentDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentDisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentSubHost")
    private String agentSubHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainMode")
    private String domainMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registrantId;

    private CreateAtiAgentRegisterInfoRequest(Builder builder) {
        super(builder);
        this.agentDescription = builder.agentDescription;
        this.agentDisplayName = builder.agentDisplayName;
        this.agentHost = builder.agentHost;
        this.agentSubHost = builder.agentSubHost;
        this.agentVersion = builder.agentVersion;
        this.clientToken = builder.clientToken;
        this.domainMode = builder.domainMode;
        this.endpoints = builder.endpoints;
        this.registrantId = builder.registrantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAtiAgentRegisterInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentDescription
     */
    public String getAgentDescription() {
        return this.agentDescription;
    }

    /**
     * @return agentDisplayName
     */
    public String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    /**
     * @return agentHost
     */
    public String getAgentHost() {
        return this.agentHost;
    }

    /**
     * @return agentSubHost
     */
    public String getAgentSubHost() {
        return this.agentSubHost;
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return domainMode
     */
    public String getDomainMode() {
        return this.domainMode;
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return registrantId
     */
    public String getRegistrantId() {
        return this.registrantId;
    }

    public static final class Builder extends Request.Builder<CreateAtiAgentRegisterInfoRequest, Builder> {
        private String agentDescription; 
        private String agentDisplayName; 
        private String agentHost; 
        private String agentSubHost; 
        private String agentVersion; 
        private String clientToken; 
        private String domainMode; 
        private java.util.List<Endpoints> endpoints; 
        private String registrantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAtiAgentRegisterInfoRequest request) {
            super(request);
            this.agentDescription = request.agentDescription;
            this.agentDisplayName = request.agentDisplayName;
            this.agentHost = request.agentHost;
            this.agentSubHost = request.agentSubHost;
            this.agentVersion = request.agentVersion;
            this.clientToken = request.clientToken;
            this.domainMode = request.domainMode;
            this.endpoints = request.endpoints;
            this.registrantId = request.registrantId;
        } 

        /**
         * AgentDescription.
         */
        public Builder agentDescription(String agentDescription) {
            this.putQueryParameter("AgentDescription", agentDescription);
            this.agentDescription = agentDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agentDisplayName(String agentDisplayName) {
            this.putQueryParameter("AgentDisplayName", agentDisplayName);
            this.agentDisplayName = agentDisplayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder agentHost(String agentHost) {
            this.putQueryParameter("AgentHost", agentHost);
            this.agentHost = agentHost;
            return this;
        }

        /**
         * AgentSubHost.
         */
        public Builder agentSubHost(String agentSubHost) {
            this.putQueryParameter("AgentSubHost", agentSubHost);
            this.agentSubHost = agentSubHost;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DomainMode.
         */
        public Builder domainMode(String domainMode) {
            this.putQueryParameter("DomainMode", domainMode);
            this.domainMode = domainMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;EndpointValue&quot;:&quot;<a href="http://www.baidu.com%5C%22,%5C%22EndpointType%5C%22:%5C%22http%5C%22%7D%5D">http://www.baidu.com\&quot;,\&quot;EndpointType\&quot;:\&quot;http\&quot;}]</a></p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            String endpointsShrink = shrink(endpoints, "Endpoints", "json");
            this.putQueryParameter("Endpoints", endpointsShrink);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2072277378616354816</p>
         */
        public Builder registrantId(String registrantId) {
            this.putQueryParameter("RegistrantId", registrantId);
            this.registrantId = registrantId;
            return this;
        }

        @Override
        public CreateAtiAgentRegisterInfoRequest build() {
            return new CreateAtiAgentRegisterInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAtiAgentRegisterInfoRequest} extends {@link TeaModel}
     *
     * <p>CreateAtiAgentRegisterInfoRequest</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentUrl")
        private String agentUrl;

        @com.aliyun.core.annotation.NameInMap("MetadataUrl")
        private String metadataUrl;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Transports")
        private java.util.List<String> transports;

        private Endpoints(Builder builder) {
            this.agentUrl = builder.agentUrl;
            this.metadataUrl = builder.metadataUrl;
            this.protocol = builder.protocol;
            this.transports = builder.transports;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return agentUrl
         */
        public String getAgentUrl() {
            return this.agentUrl;
        }

        /**
         * @return metadataUrl
         */
        public String getMetadataUrl() {
            return this.metadataUrl;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return transports
         */
        public java.util.List<String> getTransports() {
            return this.transports;
        }

        public static final class Builder {
            private String agentUrl; 
            private String metadataUrl; 
            private String protocol; 
            private java.util.List<String> transports; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.agentUrl = model.agentUrl;
                this.metadataUrl = model.metadataUrl;
                this.protocol = model.protocol;
                this.transports = model.transports;
            } 

            /**
             * AgentUrl.
             */
            public Builder agentUrl(String agentUrl) {
                this.agentUrl = agentUrl;
                return this;
            }

            /**
             * MetadataUrl.
             */
            public Builder metadataUrl(String metadataUrl) {
                this.metadataUrl = metadataUrl;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Transports.
             */
            public Builder transports(java.util.List<String> transports) {
                this.transports = transports;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
