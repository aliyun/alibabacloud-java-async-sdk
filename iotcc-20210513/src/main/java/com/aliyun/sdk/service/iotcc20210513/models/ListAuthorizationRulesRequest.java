// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizationRulesRequest</p>
 */
public class ListAuthorizationRulesRequest extends Request {
    @Query
    @NameInMap("AuthorizationRuleIds")
    private java.util.List < String > authorizationRuleIds;

    @Query
    @NameInMap("AuthorizationRuleName")
    private java.util.List < String > authorizationRuleName;

    @Query
    @NameInMap("AuthorizationRuleStatus")
    private java.util.List < String > authorizationRuleStatus;

    @Query
    @NameInMap("AuthorizationRuleType")
    private String authorizationRuleType;

    @Query
    @NameInMap("Destination")
    private java.util.List < String > destination;

    @Query
    @NameInMap("DestinationPort")
    private java.util.List < String > destinationPort;

    @Query
    @NameInMap("DestinationType")
    private java.util.List < String > destinationType;

    @Query
    @NameInMap("FuzzyAuthorizationRuleName")
    private String fuzzyAuthorizationRuleName;

    @Query
    @NameInMap("FuzzyDestination")
    private String fuzzyDestination;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Policy")
    private java.util.List < String > policy;

    @Query
    @NameInMap("Protocol")
    private java.util.List < String > protocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.authorizationRuleIds = builder.authorizationRuleIds;
        this.authorizationRuleName = builder.authorizationRuleName;
        this.authorizationRuleStatus = builder.authorizationRuleStatus;
        this.authorizationRuleType = builder.authorizationRuleType;
        this.destination = builder.destination;
        this.destinationPort = builder.destinationPort;
        this.destinationType = builder.destinationType;
        this.fuzzyAuthorizationRuleName = builder.fuzzyAuthorizationRuleName;
        this.fuzzyDestination = builder.fuzzyDestination;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policy = builder.policy;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
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
     * @return authorizationRuleName
     */
    public java.util.List < String > getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * @return authorizationRuleStatus
     */
    public java.util.List < String > getAuthorizationRuleStatus() {
        return this.authorizationRuleStatus;
    }

    /**
     * @return authorizationRuleType
     */
    public String getAuthorizationRuleType() {
        return this.authorizationRuleType;
    }

    /**
     * @return destination
     */
    public java.util.List < String > getDestination() {
        return this.destination;
    }

    /**
     * @return destinationPort
     */
    public java.util.List < String > getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * @return destinationType
     */
    public java.util.List < String > getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return fuzzyAuthorizationRuleName
     */
    public String getFuzzyAuthorizationRuleName() {
        return this.fuzzyAuthorizationRuleName;
    }

    /**
     * @return fuzzyDestination
     */
    public String getFuzzyDestination() {
        return this.fuzzyDestination;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
    public java.util.List < String > getPolicy() {
        return this.policy;
    }

    /**
     * @return protocol
     */
    public java.util.List < String > getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAuthorizationRulesRequest, Builder> {
        private java.util.List < String > authorizationRuleIds; 
        private java.util.List < String > authorizationRuleName; 
        private java.util.List < String > authorizationRuleStatus; 
        private String authorizationRuleType; 
        private java.util.List < String > destination; 
        private java.util.List < String > destinationPort; 
        private java.util.List < String > destinationType; 
        private String fuzzyAuthorizationRuleName; 
        private String fuzzyDestination; 
        private String ioTCloudConnectorId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > policy; 
        private java.util.List < String > protocol; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizationRulesRequest request) {
            super(request);
            this.authorizationRuleIds = request.authorizationRuleIds;
            this.authorizationRuleName = request.authorizationRuleName;
            this.authorizationRuleStatus = request.authorizationRuleStatus;
            this.authorizationRuleType = request.authorizationRuleType;
            this.destination = request.destination;
            this.destinationPort = request.destinationPort;
            this.destinationType = request.destinationType;
            this.fuzzyAuthorizationRuleName = request.fuzzyAuthorizationRuleName;
            this.fuzzyDestination = request.fuzzyDestination;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policy = request.policy;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
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
         * AuthorizationRuleName.
         */
        public Builder authorizationRuleName(java.util.List < String > authorizationRuleName) {
            this.putQueryParameter("AuthorizationRuleName", authorizationRuleName);
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * AuthorizationRuleStatus.
         */
        public Builder authorizationRuleStatus(java.util.List < String > authorizationRuleStatus) {
            this.putQueryParameter("AuthorizationRuleStatus", authorizationRuleStatus);
            this.authorizationRuleStatus = authorizationRuleStatus;
            return this;
        }

        /**
         * AuthorizationRuleType.
         */
        public Builder authorizationRuleType(String authorizationRuleType) {
            this.putQueryParameter("AuthorizationRuleType", authorizationRuleType);
            this.authorizationRuleType = authorizationRuleType;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(java.util.List < String > destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * DestinationPort.
         */
        public Builder destinationPort(java.util.List < String > destinationPort) {
            this.putQueryParameter("DestinationPort", destinationPort);
            this.destinationPort = destinationPort;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(java.util.List < String > destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * FuzzyAuthorizationRuleName.
         */
        public Builder fuzzyAuthorizationRuleName(String fuzzyAuthorizationRuleName) {
            this.putQueryParameter("FuzzyAuthorizationRuleName", fuzzyAuthorizationRuleName);
            this.fuzzyAuthorizationRuleName = fuzzyAuthorizationRuleName;
            return this;
        }

        /**
         * FuzzyDestination.
         */
        public Builder fuzzyDestination(String fuzzyDestination) {
            this.putQueryParameter("FuzzyDestination", fuzzyDestination);
            this.fuzzyDestination = fuzzyDestination;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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
        public Builder policy(java.util.List < String > policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(java.util.List < String > protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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
        public ListAuthorizationRulesRequest build() {
            return new ListAuthorizationRulesRequest(this);
        } 

    } 

}
