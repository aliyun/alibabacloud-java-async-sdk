// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthorizationRulesRequest</p>
 */
public class CreateAuthorizationRulesRequest extends Request {
    @Query
    @NameInMap("AuthorizationRules")
    @Validation(required = true)
    private java.util.List < AuthorizationRules> authorizationRules;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.authorizationRules = builder.authorizationRules;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRules
     */
    public java.util.List < AuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAuthorizationRulesRequest, Builder> {
        private java.util.List < AuthorizationRules> authorizationRules; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthorizationRulesRequest request) {
            super(request);
            this.authorizationRules = request.authorizationRules;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
        } 

        /**
         * AuthorizationRules.
         */
        public Builder authorizationRules(java.util.List < AuthorizationRules> authorizationRules) {
            this.putQueryParameter("AuthorizationRules", authorizationRules);
            this.authorizationRules = authorizationRules;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAuthorizationRulesRequest build() {
            return new CreateAuthorizationRulesRequest(this);
        } 

    } 

    public static class AuthorizationRules extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Destination")
        @Validation(required = true)
        private String destination;

        @NameInMap("DestinationPort")
        private String destinationPort;

        @NameInMap("DestinationType")
        @Validation(required = true)
        private String destinationType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Policy")
        @Validation(required = true)
        private String policy;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidr")
        @Validation(required = true)
        private String sourceCidr;

        private AuthorizationRules(Builder builder) {
            this.description = builder.description;
            this.destination = builder.destination;
            this.destinationPort = builder.destinationPort;
            this.destinationType = builder.destinationType;
            this.name = builder.name;
            this.policy = builder.policy;
            this.protocol = builder.protocol;
            this.sourceCidr = builder.sourceCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationRules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationPort
         */
        public String getDestinationPort() {
            return this.destinationPort;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidr
         */
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public static final class Builder {
            private String description; 
            private String destination; 
            private String destinationPort; 
            private String destinationType; 
            private String name; 
            private String policy; 
            private String protocol; 
            private String sourceCidr; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * DestinationPort.
             */
            public Builder destinationPort(String destinationPort) {
                this.destinationPort = destinationPort;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
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
             * SourceCidr.
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            public AuthorizationRules build() {
                return new AuthorizationRules(this);
            } 

        } 

    }
}
