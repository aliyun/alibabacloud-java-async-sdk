// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpMappingRulesRequest} extends {@link RequestModel}
 *
 * <p>ListIpMappingRulesRequest</p>
 */
public class ListIpMappingRulesRequest extends Request {
    @Query
    @NameInMap("DestinationIps")
    private java.util.List < String > destinationIps;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("IpMappingRuleIds")
    private java.util.List < String > ipMappingRuleIds;

    @Query
    @NameInMap("IpMappingRuleNames")
    private java.util.List < String > ipMappingRuleNames;

    @Query
    @NameInMap("IpMappingRuleStatuses")
    private java.util.List < String > ipMappingRuleStatuses;

    @Query
    @NameInMap("MappingIps")
    private java.util.List < String > mappingIps;

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

    private ListIpMappingRulesRequest(Builder builder) {
        super(builder);
        this.destinationIps = builder.destinationIps;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.ipMappingRuleIds = builder.ipMappingRuleIds;
        this.ipMappingRuleNames = builder.ipMappingRuleNames;
        this.ipMappingRuleStatuses = builder.ipMappingRuleStatuses;
        this.mappingIps = builder.mappingIps;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpMappingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationIps
     */
    public java.util.List < String > getDestinationIps() {
        return this.destinationIps;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return ipMappingRuleIds
     */
    public java.util.List < String > getIpMappingRuleIds() {
        return this.ipMappingRuleIds;
    }

    /**
     * @return ipMappingRuleNames
     */
    public java.util.List < String > getIpMappingRuleNames() {
        return this.ipMappingRuleNames;
    }

    /**
     * @return ipMappingRuleStatuses
     */
    public java.util.List < String > getIpMappingRuleStatuses() {
        return this.ipMappingRuleStatuses;
    }

    /**
     * @return mappingIps
     */
    public java.util.List < String > getMappingIps() {
        return this.mappingIps;
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

    public static final class Builder extends Request.Builder<ListIpMappingRulesRequest, Builder> {
        private java.util.List < String > destinationIps; 
        private String ioTCloudConnectorId; 
        private java.util.List < String > ipMappingRuleIds; 
        private java.util.List < String > ipMappingRuleNames; 
        private java.util.List < String > ipMappingRuleStatuses; 
        private java.util.List < String > mappingIps; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListIpMappingRulesRequest request) {
            super(request);
            this.destinationIps = request.destinationIps;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.ipMappingRuleIds = request.ipMappingRuleIds;
            this.ipMappingRuleNames = request.ipMappingRuleNames;
            this.ipMappingRuleStatuses = request.ipMappingRuleStatuses;
            this.mappingIps = request.mappingIps;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * DestinationIps.
         */
        public Builder destinationIps(java.util.List < String > destinationIps) {
            this.putQueryParameter("DestinationIps", destinationIps);
            this.destinationIps = destinationIps;
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
         * IpMappingRuleIds.
         */
        public Builder ipMappingRuleIds(java.util.List < String > ipMappingRuleIds) {
            this.putQueryParameter("IpMappingRuleIds", ipMappingRuleIds);
            this.ipMappingRuleIds = ipMappingRuleIds;
            return this;
        }

        /**
         * IpMappingRuleNames.
         */
        public Builder ipMappingRuleNames(java.util.List < String > ipMappingRuleNames) {
            this.putQueryParameter("IpMappingRuleNames", ipMappingRuleNames);
            this.ipMappingRuleNames = ipMappingRuleNames;
            return this;
        }

        /**
         * IpMappingRuleStatuses.
         */
        public Builder ipMappingRuleStatuses(java.util.List < String > ipMappingRuleStatuses) {
            this.putQueryParameter("IpMappingRuleStatuses", ipMappingRuleStatuses);
            this.ipMappingRuleStatuses = ipMappingRuleStatuses;
            return this;
        }

        /**
         * MappingIps.
         */
        public Builder mappingIps(java.util.List < String > mappingIps) {
            this.putQueryParameter("MappingIps", mappingIps);
            this.mappingIps = mappingIps;
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

        @Override
        public ListIpMappingRulesRequest build() {
            return new ListIpMappingRulesRequest(this);
        } 

    } 

}
