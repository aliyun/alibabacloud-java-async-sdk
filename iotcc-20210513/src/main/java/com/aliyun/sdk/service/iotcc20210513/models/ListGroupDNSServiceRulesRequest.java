// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupDNSServiceRulesRequest} extends {@link RequestModel}
 *
 * <p>ListGroupDNSServiceRulesRequest</p>
 */
public class ListGroupDNSServiceRulesRequest extends Request {
    @Query
    @NameInMap("DNSServiceRuleIds")
    private java.util.List < String > DNSServiceRuleIds;

    @Query
    @NameInMap("DNSServiceRuleName")
    private java.util.List < String > DNSServiceRuleName;

    @Query
    @NameInMap("DNSServiceRuleStatus")
    private java.util.List < String > DNSServiceRuleStatus;

    @Query
    @NameInMap("Destination")
    private java.util.List < String > destination;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceType")
    private String serviceType;

    @Query
    @NameInMap("Source")
    private java.util.List < String > source;

    private ListGroupDNSServiceRulesRequest(Builder builder) {
        super(builder);
        this.DNSServiceRuleIds = builder.DNSServiceRuleIds;
        this.DNSServiceRuleName = builder.DNSServiceRuleName;
        this.DNSServiceRuleStatus = builder.DNSServiceRuleStatus;
        this.destination = builder.destination;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.serviceType = builder.serviceType;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupDNSServiceRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DNSServiceRuleIds
     */
    public java.util.List < String > getDNSServiceRuleIds() {
        return this.DNSServiceRuleIds;
    }

    /**
     * @return DNSServiceRuleName
     */
    public java.util.List < String > getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    /**
     * @return DNSServiceRuleStatus
     */
    public java.util.List < String > getDNSServiceRuleStatus() {
        return this.DNSServiceRuleStatus;
    }

    /**
     * @return destination
     */
    public java.util.List < String > getDestination() {
        return this.destination;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return source
     */
    public java.util.List < String > getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListGroupDNSServiceRulesRequest, Builder> {
        private java.util.List < String > DNSServiceRuleIds; 
        private java.util.List < String > DNSServiceRuleName; 
        private java.util.List < String > DNSServiceRuleStatus; 
        private java.util.List < String > destination; 
        private String ioTCloudConnectorGroupId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String serviceType; 
        private java.util.List < String > source; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupDNSServiceRulesRequest request) {
            super(request);
            this.DNSServiceRuleIds = request.DNSServiceRuleIds;
            this.DNSServiceRuleName = request.DNSServiceRuleName;
            this.DNSServiceRuleStatus = request.DNSServiceRuleStatus;
            this.destination = request.destination;
            this.ioTCloudConnectorGroupId = request.ioTCloudConnectorGroupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.serviceType = request.serviceType;
            this.source = request.source;
        } 

        /**
         * DNSServiceRuleIds.
         */
        public Builder DNSServiceRuleIds(java.util.List < String > DNSServiceRuleIds) {
            this.putQueryParameter("DNSServiceRuleIds", DNSServiceRuleIds);
            this.DNSServiceRuleIds = DNSServiceRuleIds;
            return this;
        }

        /**
         * DNSServiceRuleName.
         */
        public Builder DNSServiceRuleName(java.util.List < String > DNSServiceRuleName) {
            this.putQueryParameter("DNSServiceRuleName", DNSServiceRuleName);
            this.DNSServiceRuleName = DNSServiceRuleName;
            return this;
        }

        /**
         * DNSServiceRuleStatus.
         */
        public Builder DNSServiceRuleStatus(java.util.List < String > DNSServiceRuleStatus) {
            this.putQueryParameter("DNSServiceRuleStatus", DNSServiceRuleStatus);
            this.DNSServiceRuleStatus = DNSServiceRuleStatus;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(java.util.List < String > source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListGroupDNSServiceRulesRequest build() {
            return new ListGroupDNSServiceRulesRequest(this);
        } 

    } 

}
