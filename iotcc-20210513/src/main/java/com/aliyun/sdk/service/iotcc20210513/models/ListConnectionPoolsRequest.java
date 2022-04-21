// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectionPoolsRequest</p>
 */
public class ListConnectionPoolsRequest extends Request {
    @Query
    @NameInMap("ConnectionPoolIds")
    private java.util.List < String > connectionPoolIds;

    @Query
    @NameInMap("ConnectionPoolName")
    private java.util.List < String > connectionPoolName;

    @Query
    @NameInMap("ConnectionPoolStatus")
    private java.util.List < String > connectionPoolStatus;

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

    private ListConnectionPoolsRequest(Builder builder) {
        super(builder);
        this.connectionPoolIds = builder.connectionPoolIds;
        this.connectionPoolName = builder.connectionPoolName;
        this.connectionPoolStatus = builder.connectionPoolStatus;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionPoolsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionPoolIds
     */
    public java.util.List < String > getConnectionPoolIds() {
        return this.connectionPoolIds;
    }

    /**
     * @return connectionPoolName
     */
    public java.util.List < String > getConnectionPoolName() {
        return this.connectionPoolName;
    }

    /**
     * @return connectionPoolStatus
     */
    public java.util.List < String > getConnectionPoolStatus() {
        return this.connectionPoolStatus;
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

    public static final class Builder extends Request.Builder<ListConnectionPoolsRequest, Builder> {
        private java.util.List < String > connectionPoolIds; 
        private java.util.List < String > connectionPoolName; 
        private java.util.List < String > connectionPoolStatus; 
        private String ioTCloudConnectorId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectionPoolsRequest request) {
            super(request);
            this.connectionPoolIds = request.connectionPoolIds;
            this.connectionPoolName = request.connectionPoolName;
            this.connectionPoolStatus = request.connectionPoolStatus;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * ConnectionPoolIds.
         */
        public Builder connectionPoolIds(java.util.List < String > connectionPoolIds) {
            this.putQueryParameter("ConnectionPoolIds", connectionPoolIds);
            this.connectionPoolIds = connectionPoolIds;
            return this;
        }

        /**
         * ConnectionPoolName.
         */
        public Builder connectionPoolName(java.util.List < String > connectionPoolName) {
            this.putQueryParameter("ConnectionPoolName", connectionPoolName);
            this.connectionPoolName = connectionPoolName;
            return this;
        }

        /**
         * ConnectionPoolStatus.
         */
        public Builder connectionPoolStatus(java.util.List < String > connectionPoolStatus) {
            this.putQueryParameter("ConnectionPoolStatus", connectionPoolStatus);
            this.connectionPoolStatus = connectionPoolStatus;
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

        @Override
        public ListConnectionPoolsRequest build() {
            return new ListConnectionPoolsRequest(this);
        } 

    } 

}
