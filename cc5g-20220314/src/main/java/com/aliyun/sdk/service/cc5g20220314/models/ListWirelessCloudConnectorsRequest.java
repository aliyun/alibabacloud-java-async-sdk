// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWirelessCloudConnectorsRequest} extends {@link RequestModel}
 *
 * <p>ListWirelessCloudConnectorsRequest</p>
 */
public class ListWirelessCloudConnectorsRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("IsInGroup")
    private String isInGroup;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("Names")
    private java.util.List < String > names;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Statuses")
    private java.util.List < String > statuses;

    @Query
    @NameInMap("WirelessCloudConnectorGroupId")
    private String wirelessCloudConnectorGroupId;

    @Query
    @NameInMap("WirelessCloudConnectorIds")
    private java.util.List < String > wirelessCloudConnectorIds;

    private ListWirelessCloudConnectorsRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.isInGroup = builder.isInGroup;
        this.maxResults = builder.maxResults;
        this.names = builder.names;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.statuses = builder.statuses;
        this.wirelessCloudConnectorGroupId = builder.wirelessCloudConnectorGroupId;
        this.wirelessCloudConnectorIds = builder.wirelessCloudConnectorIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWirelessCloudConnectorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return isInGroup
     */
    public String getIsInGroup() {
        return this.isInGroup;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return wirelessCloudConnectorGroupId
     */
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    /**
     * @return wirelessCloudConnectorIds
     */
    public java.util.List < String > getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

    public static final class Builder extends Request.Builder<ListWirelessCloudConnectorsRequest, Builder> {
        private String businessType; 
        private String isInGroup; 
        private Long maxResults; 
        private java.util.List < String > names; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > statuses; 
        private String wirelessCloudConnectorGroupId; 
        private java.util.List < String > wirelessCloudConnectorIds; 

        private Builder() {
            super();
        } 

        private Builder(ListWirelessCloudConnectorsRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.isInGroup = request.isInGroup;
            this.maxResults = request.maxResults;
            this.names = request.names;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.statuses = request.statuses;
            this.wirelessCloudConnectorGroupId = request.wirelessCloudConnectorGroupId;
            this.wirelessCloudConnectorIds = request.wirelessCloudConnectorIds;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * IsInGroup.
         */
        public Builder isInGroup(String isInGroup) {
            this.putQueryParameter("IsInGroup", isInGroup);
            this.isInGroup = isInGroup;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * WirelessCloudConnectorGroupId.
         */
        public Builder wirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }

        /**
         * WirelessCloudConnectorIds.
         */
        public Builder wirelessCloudConnectorIds(java.util.List < String > wirelessCloudConnectorIds) {
            this.putQueryParameter("WirelessCloudConnectorIds", wirelessCloudConnectorIds);
            this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
            return this;
        }

        @Override
        public ListWirelessCloudConnectorsRequest build() {
            return new ListWirelessCloudConnectorsRequest(this);
        } 

    } 

}
