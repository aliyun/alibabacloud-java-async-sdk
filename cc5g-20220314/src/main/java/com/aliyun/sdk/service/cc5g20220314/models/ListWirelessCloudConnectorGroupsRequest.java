// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWirelessCloudConnectorGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListWirelessCloudConnectorGroupsRequest</p>
 */
public class ListWirelessCloudConnectorGroupsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("WirelessCloudConnectorGroupIds")
    private java.util.List < String > wirelessCloudConnectorGroupIds;

    @Query
    @NameInMap("WirelessCloudConnectorGroupNames")
    private java.util.List < String > wirelessCloudConnectorGroupNames;

    @Query
    @NameInMap("WirelessCloudConnectorGroupStatus")
    private java.util.List < String > wirelessCloudConnectorGroupStatus;

    private ListWirelessCloudConnectorGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.wirelessCloudConnectorGroupIds = builder.wirelessCloudConnectorGroupIds;
        this.wirelessCloudConnectorGroupNames = builder.wirelessCloudConnectorGroupNames;
        this.wirelessCloudConnectorGroupStatus = builder.wirelessCloudConnectorGroupStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWirelessCloudConnectorGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
     * @return wirelessCloudConnectorGroupIds
     */
    public java.util.List < String > getWirelessCloudConnectorGroupIds() {
        return this.wirelessCloudConnectorGroupIds;
    }

    /**
     * @return wirelessCloudConnectorGroupNames
     */
    public java.util.List < String > getWirelessCloudConnectorGroupNames() {
        return this.wirelessCloudConnectorGroupNames;
    }

    /**
     * @return wirelessCloudConnectorGroupStatus
     */
    public java.util.List < String > getWirelessCloudConnectorGroupStatus() {
        return this.wirelessCloudConnectorGroupStatus;
    }

    public static final class Builder extends Request.Builder<ListWirelessCloudConnectorGroupsRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > wirelessCloudConnectorGroupIds; 
        private java.util.List < String > wirelessCloudConnectorGroupNames; 
        private java.util.List < String > wirelessCloudConnectorGroupStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListWirelessCloudConnectorGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.wirelessCloudConnectorGroupIds = request.wirelessCloudConnectorGroupIds;
            this.wirelessCloudConnectorGroupNames = request.wirelessCloudConnectorGroupNames;
            this.wirelessCloudConnectorGroupStatus = request.wirelessCloudConnectorGroupStatus;
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
         * WirelessCloudConnectorGroupIds.
         */
        public Builder wirelessCloudConnectorGroupIds(java.util.List < String > wirelessCloudConnectorGroupIds) {
            this.putQueryParameter("WirelessCloudConnectorGroupIds", wirelessCloudConnectorGroupIds);
            this.wirelessCloudConnectorGroupIds = wirelessCloudConnectorGroupIds;
            return this;
        }

        /**
         * WirelessCloudConnectorGroupNames.
         */
        public Builder wirelessCloudConnectorGroupNames(java.util.List < String > wirelessCloudConnectorGroupNames) {
            this.putQueryParameter("WirelessCloudConnectorGroupNames", wirelessCloudConnectorGroupNames);
            this.wirelessCloudConnectorGroupNames = wirelessCloudConnectorGroupNames;
            return this;
        }

        /**
         * WirelessCloudConnectorGroupStatus.
         */
        public Builder wirelessCloudConnectorGroupStatus(java.util.List < String > wirelessCloudConnectorGroupStatus) {
            this.putQueryParameter("WirelessCloudConnectorGroupStatus", wirelessCloudConnectorGroupStatus);
            this.wirelessCloudConnectorGroupStatus = wirelessCloudConnectorGroupStatus;
            return this;
        }

        @Override
        public ListWirelessCloudConnectorGroupsRequest build() {
            return new ListWirelessCloudConnectorGroupsRequest(this);
        } 

    } 

}
