// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataPackagesRequest} extends {@link RequestModel}
 *
 * <p>ListDataPackagesRequest</p>
 */
public class ListDataPackagesRequest extends Request {
    @Query
    @NameInMap("DataPackageIds")
    private java.util.List < String > dataPackageIds;

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
    @NameInMap("Statuses")
    private java.util.List < String > statuses;

    @Query
    @NameInMap("WirelessCloudConnectorId")
    @Validation(required = true)
    private String wirelessCloudConnectorId;

    private ListDataPackagesRequest(Builder builder) {
        super(builder);
        this.dataPackageIds = builder.dataPackageIds;
        this.maxResults = builder.maxResults;
        this.names = builder.names;
        this.nextToken = builder.nextToken;
        this.statuses = builder.statuses;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPackageIds
     */
    public java.util.List < String > getDataPackageIds() {
        return this.dataPackageIds;
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
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ListDataPackagesRequest, Builder> {
        private java.util.List < String > dataPackageIds; 
        private Long maxResults; 
        private java.util.List < String > names; 
        private String nextToken; 
        private java.util.List < String > statuses; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataPackagesRequest request) {
            super(request);
            this.dataPackageIds = request.dataPackageIds;
            this.maxResults = request.maxResults;
            this.names = request.names;
            this.nextToken = request.nextToken;
            this.statuses = request.statuses;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * DataPackageIds.
         */
        public Builder dataPackageIds(java.util.List < String > dataPackageIds) {
            this.putQueryParameter("DataPackageIds", dataPackageIds);
            this.dataPackageIds = dataPackageIds;
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
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
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
        public ListDataPackagesRequest build() {
            return new ListDataPackagesRequest(this);
        } 

    } 

}
