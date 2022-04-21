// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceRequest} extends {@link RequestModel}
 *
 * <p>ListServiceRequest</p>
 */
public class ListServiceRequest extends Request {
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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceStatuses")
    private java.util.List < String > resourceStatuses;

    @Query
    @NameInMap("ServiceIds")
    private java.util.List < String > serviceIds;

    @Query
    @NameInMap("ServiceNames")
    private java.util.List < String > serviceNames;

    private ListServiceRequest(Builder builder) {
        super(builder);
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceStatuses = builder.resourceStatuses;
        this.serviceIds = builder.serviceIds;
        this.serviceNames = builder.serviceNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceStatuses
     */
    public java.util.List < String > getResourceStatuses() {
        return this.resourceStatuses;
    }

    /**
     * @return serviceIds
     */
    public java.util.List < String > getServiceIds() {
        return this.serviceIds;
    }

    /**
     * @return serviceNames
     */
    public java.util.List < String > getServiceNames() {
        return this.serviceNames;
    }

    public static final class Builder extends Request.Builder<ListServiceRequest, Builder> {
        private String ioTCloudConnectorId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > resourceStatuses; 
        private java.util.List < String > serviceIds; 
        private java.util.List < String > serviceNames; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceRequest request) {
            super(request);
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceStatuses = request.resourceStatuses;
            this.serviceIds = request.serviceIds;
            this.serviceNames = request.serviceNames;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceStatuses.
         */
        public Builder resourceStatuses(java.util.List < String > resourceStatuses) {
            this.putQueryParameter("ResourceStatuses", resourceStatuses);
            this.resourceStatuses = resourceStatuses;
            return this;
        }

        /**
         * ServiceIds.
         */
        public Builder serviceIds(java.util.List < String > serviceIds) {
            this.putQueryParameter("ServiceIds", serviceIds);
            this.serviceIds = serviceIds;
            return this;
        }

        /**
         * ServiceNames.
         */
        public Builder serviceNames(java.util.List < String > serviceNames) {
            this.putQueryParameter("ServiceNames", serviceNames);
            this.serviceNames = serviceNames;
            return this;
        }

        @Override
        public ListServiceRequest build() {
            return new ListServiceRequest(this);
        } 

    } 

}
