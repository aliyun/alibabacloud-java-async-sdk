// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>ListGroupAuthorizationRulesRequest</p>
 */
public class ListGroupAuthorizationRulesRequest extends Request {
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
    @NameInMap("Destination")
    private java.util.List < String > destination;

    @Query
    @NameInMap("DestinationType")
    private java.util.List < String > destinationType;

    @Query
    @NameInMap("IoTCloudConnectorGroupId")
    @Validation(required = true)
    private String ioTCloudConnectorGroupId;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListGroupAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.authorizationRuleIds = builder.authorizationRuleIds;
        this.authorizationRuleName = builder.authorizationRuleName;
        this.authorizationRuleStatus = builder.authorizationRuleStatus;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policy = builder.policy;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupAuthorizationRulesRequest create() {
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
     * @return destination
     */
    public java.util.List < String > getDestination() {
        return this.destination;
    }

    /**
     * @return destinationType
     */
    public java.util.List < String > getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListGroupAuthorizationRulesRequest, Builder> {
        private java.util.List < String > authorizationRuleIds; 
        private java.util.List < String > authorizationRuleName; 
        private java.util.List < String > authorizationRuleStatus; 
        private java.util.List < String > destination; 
        private java.util.List < String > destinationType; 
        private String ioTCloudConnectorGroupId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > policy; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupAuthorizationRulesRequest request) {
            super(request);
            this.authorizationRuleIds = request.authorizationRuleIds;
            this.authorizationRuleName = request.authorizationRuleName;
            this.authorizationRuleStatus = request.authorizationRuleStatus;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.ioTCloudConnectorGroupId = request.ioTCloudConnectorGroupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policy = request.policy;
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
         * Destination.
         */
        public Builder destination(java.util.List < String > destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
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
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListGroupAuthorizationRulesRequest build() {
            return new ListGroupAuthorizationRulesRequest(this);
        } 

    } 

}
