// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListIoTCloudConnectorGroupsRequest</p>
 */
public class ListIoTCloudConnectorGroupsRequest extends Request {
    @Query
    @NameInMap("IoTCloudConnectorGroupIds")
    private java.util.List < String > ioTCloudConnectorGroupIds;

    @Query
    @NameInMap("IoTCloudConnectorGroupName")
    private java.util.List < String > ioTCloudConnectorGroupName;

    @Query
    @NameInMap("IoTCloudConnectorGroupStatus")
    private java.util.List < String > ioTCloudConnectorGroupStatus;

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
    @NameInMap("Type")
    private String type;

    private ListIoTCloudConnectorGroupsRequest(Builder builder) {
        super(builder);
        this.ioTCloudConnectorGroupIds = builder.ioTCloudConnectorGroupIds;
        this.ioTCloudConnectorGroupName = builder.ioTCloudConnectorGroupName;
        this.ioTCloudConnectorGroupStatus = builder.ioTCloudConnectorGroupStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ioTCloudConnectorGroupIds
     */
    public java.util.List < String > getIoTCloudConnectorGroupIds() {
        return this.ioTCloudConnectorGroupIds;
    }

    /**
     * @return ioTCloudConnectorGroupName
     */
    public java.util.List < String > getIoTCloudConnectorGroupName() {
        return this.ioTCloudConnectorGroupName;
    }

    /**
     * @return ioTCloudConnectorGroupStatus
     */
    public java.util.List < String > getIoTCloudConnectorGroupStatus() {
        return this.ioTCloudConnectorGroupStatus;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListIoTCloudConnectorGroupsRequest, Builder> {
        private java.util.List < String > ioTCloudConnectorGroupIds; 
        private java.util.List < String > ioTCloudConnectorGroupName; 
        private java.util.List < String > ioTCloudConnectorGroupStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListIoTCloudConnectorGroupsRequest request) {
            super(request);
            this.ioTCloudConnectorGroupIds = request.ioTCloudConnectorGroupIds;
            this.ioTCloudConnectorGroupName = request.ioTCloudConnectorGroupName;
            this.ioTCloudConnectorGroupStatus = request.ioTCloudConnectorGroupStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * IoTCloudConnectorGroupIds.
         */
        public Builder ioTCloudConnectorGroupIds(java.util.List < String > ioTCloudConnectorGroupIds) {
            this.putQueryParameter("IoTCloudConnectorGroupIds", ioTCloudConnectorGroupIds);
            this.ioTCloudConnectorGroupIds = ioTCloudConnectorGroupIds;
            return this;
        }

        /**
         * IoTCloudConnectorGroupName.
         */
        public Builder ioTCloudConnectorGroupName(java.util.List < String > ioTCloudConnectorGroupName) {
            this.putQueryParameter("IoTCloudConnectorGroupName", ioTCloudConnectorGroupName);
            this.ioTCloudConnectorGroupName = ioTCloudConnectorGroupName;
            return this;
        }

        /**
         * IoTCloudConnectorGroupStatus.
         */
        public Builder ioTCloudConnectorGroupStatus(java.util.List < String > ioTCloudConnectorGroupStatus) {
            this.putQueryParameter("IoTCloudConnectorGroupStatus", ioTCloudConnectorGroupStatus);
            this.ioTCloudConnectorGroupStatus = ioTCloudConnectorGroupStatus;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListIoTCloudConnectorGroupsRequest build() {
            return new ListIoTCloudConnectorGroupsRequest(this);
        } 

    } 

}
