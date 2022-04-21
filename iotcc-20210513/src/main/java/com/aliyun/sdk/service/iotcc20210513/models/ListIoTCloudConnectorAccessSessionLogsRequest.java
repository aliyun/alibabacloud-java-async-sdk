// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorAccessSessionLogsRequest} extends {@link RequestModel}
 *
 * <p>ListIoTCloudConnectorAccessSessionLogsRequest</p>
 */
public class ListIoTCloudConnectorAccessSessionLogsRequest extends Request {
    @Query
    @NameInMap("Destinations")
    private java.util.List < String > destinations;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

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
    @NameInMap("SourceIps")
    private java.util.List < String > sourceIps;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private ListIoTCloudConnectorAccessSessionLogsRequest(Builder builder) {
        super(builder);
        this.destinations = builder.destinations;
        this.endTime = builder.endTime;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.sourceIps = builder.sourceIps;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorAccessSessionLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinations
     */
    public java.util.List < String > getDestinations() {
        return this.destinations;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return sourceIps
     */
    public java.util.List < String > getSourceIps() {
        return this.sourceIps;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListIoTCloudConnectorAccessSessionLogsRequest, Builder> {
        private java.util.List < String > destinations; 
        private Long endTime; 
        private String ioTCloudConnectorId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > sourceIps; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListIoTCloudConnectorAccessSessionLogsRequest request) {
            super(request);
            this.destinations = request.destinations;
            this.endTime = request.endTime;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.sourceIps = request.sourceIps;
            this.startTime = request.startTime;
        } 

        /**
         * Destinations.
         */
        public Builder destinations(java.util.List < String > destinations) {
            this.putQueryParameter("Destinations", destinations);
            this.destinations = destinations;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceIps.
         */
        public Builder sourceIps(java.util.List < String > sourceIps) {
            this.putQueryParameter("SourceIps", sourceIps);
            this.sourceIps = sourceIps;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListIoTCloudConnectorAccessSessionLogsRequest build() {
            return new ListIoTCloudConnectorAccessSessionLogsRequest(this);
        } 

    } 

}
