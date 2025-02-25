// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizationRulesRequest</p>
 */
public class ListAuthorizationRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleIds")
    private java.util.List < String > authorizationRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationPort")
    private String destinationPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dns")
    private Boolean dns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List < String > names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < String > statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private ListAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.authorizationRuleIds = builder.authorizationRuleIds;
        this.destination = builder.destination;
        this.destinationPort = builder.destinationPort;
        this.destinationType = builder.destinationType;
        this.dns = builder.dns;
        this.maxResults = builder.maxResults;
        this.names = builder.names;
        this.nextToken = builder.nextToken;
        this.policy = builder.policy;
        this.protocol = builder.protocol;
        this.statuses = builder.statuses;
        this.type = builder.type;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRuleIds
     */
    public java.util.List < String > getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
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
     * @return dns
     */
    public Boolean getDns() {
        return this.dns;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return names
     */
    public java.util.List < String > getNames() {
        return this.names;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ListAuthorizationRulesRequest, Builder> {
        private java.util.List < String > authorizationRuleIds; 
        private String destination; 
        private String destinationPort; 
        private String destinationType; 
        private Boolean dns; 
        private Long maxResults; 
        private java.util.List < String > names; 
        private String nextToken; 
        private String policy; 
        private String protocol; 
        private java.util.List < String > statuses; 
        private String type; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizationRulesRequest request) {
            super(request);
            this.authorizationRuleIds = request.authorizationRuleIds;
            this.destination = request.destination;
            this.destinationPort = request.destinationPort;
            this.destinationType = request.destinationType;
            this.dns = request.dns;
            this.maxResults = request.maxResults;
            this.names = request.names;
            this.nextToken = request.nextToken;
            this.policy = request.policy;
            this.protocol = request.protocol;
            this.statuses = request.statuses;
            this.type = request.type;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * AuthorizationRuleIds.
         */
        public Builder authorizationRuleIds(java.util.List < String > authorizationRuleIds) {
            this.putQueryParameter("AuthorizationRuleIds", authorizationRuleIds);
            this.authorizationRuleIds = authorizationRuleIds;
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
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * Dns.
         */
        public Builder dns(Boolean dns) {
            this.putQueryParameter("Dns", dns);
            this.dns = dns;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Names.
         */
        public Builder names(java.util.List < String > names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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
        public ListAuthorizationRulesRequest build() {
            return new ListAuthorizationRulesRequest(this);
        } 

    } 

}
