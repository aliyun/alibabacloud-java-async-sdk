// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationRuleRequest</p>
 */
public class UpdateAuthorizationRuleRequest extends Request {
    @Query
    @NameInMap("AuthorizationRuleId")
    @Validation(required = true)
    private String authorizationRuleId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Destination")
    private String destination;

    @Query
    @NameInMap("DestinationPort")
    private String destinationPort;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("SourceCidr")
    private String sourceCidr;

    @Query
    @NameInMap("WirelessCloudConnectorId")
    @Validation(required = true)
    private String wirelessCloudConnectorId;

    private UpdateAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.authorizationRuleId = builder.authorizationRuleId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destination = builder.destination;
        this.destinationPort = builder.destinationPort;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.policy = builder.policy;
        this.protocol = builder.protocol;
        this.sourceCidr = builder.sourceCidr;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationRuleRequest, Builder> {
        private String authorizationRuleId; 
        private String clientToken; 
        private String description; 
        private String destination; 
        private String destinationPort; 
        private Boolean dryRun; 
        private String name; 
        private String policy; 
        private String protocol; 
        private String sourceCidr; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationRuleRequest request) {
            super(request);
            this.authorizationRuleId = request.authorizationRuleId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destination = request.destination;
            this.destinationPort = request.destinationPort;
            this.dryRun = request.dryRun;
            this.name = request.name;
            this.policy = request.policy;
            this.protocol = request.protocol;
            this.sourceCidr = request.sourceCidr;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * AuthorizationRuleId.
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.putQueryParameter("AuthorizationRuleId", authorizationRuleId);
            this.authorizationRuleId = authorizationRuleId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * DestinationPort.
         */
        public Builder destinationPort(String destinationPort) {
            this.putQueryParameter("DestinationPort", destinationPort);
            this.destinationPort = destinationPort;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * SourceCidr.
         */
        public Builder sourceCidr(String sourceCidr) {
            this.putQueryParameter("SourceCidr", sourceCidr);
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public UpdateAuthorizationRuleRequest build() {
            return new UpdateAuthorizationRuleRequest(this);
        } 

    } 

}
