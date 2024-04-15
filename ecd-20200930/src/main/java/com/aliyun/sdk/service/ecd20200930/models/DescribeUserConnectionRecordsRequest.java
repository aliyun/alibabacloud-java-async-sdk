// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserConnectionRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserConnectionRecordsRequest</p>
 */
public class DescribeUserConnectionRecordsRequest extends Request {
    @Query
    @NameInMap("ConnectDurationFrom")
    private Long connectDurationFrom;

    @Query
    @NameInMap("ConnectDurationTo")
    private Long connectDurationTo;

    @Query
    @NameInMap("ConnectEndTimeFrom")
    private Long connectEndTimeFrom;

    @Query
    @NameInMap("ConnectEndTimeTo")
    private Long connectEndTimeTo;

    @Query
    @NameInMap("ConnectStartTimeFrom")
    private Long connectStartTimeFrom;

    @Query
    @NameInMap("ConnectStartTimeTo")
    private Long connectStartTimeTo;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("EndUserType")
    private String endUserType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeUserConnectionRecordsRequest(Builder builder) {
        super(builder);
        this.connectDurationFrom = builder.connectDurationFrom;
        this.connectDurationTo = builder.connectDurationTo;
        this.connectEndTimeFrom = builder.connectEndTimeFrom;
        this.connectEndTimeTo = builder.connectEndTimeTo;
        this.connectStartTimeFrom = builder.connectStartTimeFrom;
        this.connectStartTimeTo = builder.connectStartTimeTo;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopId = builder.desktopId;
        this.endUserId = builder.endUserId;
        this.endUserType = builder.endUserType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserConnectionRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectDurationFrom
     */
    public Long getConnectDurationFrom() {
        return this.connectDurationFrom;
    }

    /**
     * @return connectDurationTo
     */
    public Long getConnectDurationTo() {
        return this.connectDurationTo;
    }

    /**
     * @return connectEndTimeFrom
     */
    public Long getConnectEndTimeFrom() {
        return this.connectEndTimeFrom;
    }

    /**
     * @return connectEndTimeTo
     */
    public Long getConnectEndTimeTo() {
        return this.connectEndTimeTo;
    }

    /**
     * @return connectStartTimeFrom
     */
    public Long getConnectStartTimeFrom() {
        return this.connectStartTimeFrom;
    }

    /**
     * @return connectStartTimeTo
     */
    public Long getConnectStartTimeTo() {
        return this.connectStartTimeTo;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return endUserType
     */
    public String getEndUserType() {
        return this.endUserType;
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

    public static final class Builder extends Request.Builder<DescribeUserConnectionRecordsRequest, Builder> {
        private Long connectDurationFrom; 
        private Long connectDurationTo; 
        private Long connectEndTimeFrom; 
        private Long connectEndTimeTo; 
        private Long connectStartTimeFrom; 
        private Long connectStartTimeTo; 
        private String desktopGroupId; 
        private String desktopId; 
        private String endUserId; 
        private String endUserType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserConnectionRecordsRequest request) {
            super(request);
            this.connectDurationFrom = request.connectDurationFrom;
            this.connectDurationTo = request.connectDurationTo;
            this.connectEndTimeFrom = request.connectEndTimeFrom;
            this.connectEndTimeTo = request.connectEndTimeTo;
            this.connectStartTimeFrom = request.connectStartTimeFrom;
            this.connectStartTimeTo = request.connectStartTimeTo;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopId = request.desktopId;
            this.endUserId = request.endUserId;
            this.endUserType = request.endUserType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * The duration when the cloud desktop is connected, which is the minimum value for condition filtering.
         */
        public Builder connectDurationFrom(Long connectDurationFrom) {
            this.putQueryParameter("ConnectDurationFrom", connectDurationFrom);
            this.connectDurationFrom = connectDurationFrom;
            return this;
        }

        /**
         * The duration when the cloud desktop is connected, which is the maximum value for condition filtering.
         */
        public Builder connectDurationTo(Long connectDurationTo) {
            this.putQueryParameter("ConnectDurationTo", connectDurationTo);
            this.connectDurationTo = connectDurationTo;
            return this;
        }

        /**
         * The time when the cloud desktop stops to be connected, which is the minimum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder connectEndTimeFrom(Long connectEndTimeFrom) {
            this.putQueryParameter("ConnectEndTimeFrom", connectEndTimeFrom);
            this.connectEndTimeFrom = connectEndTimeFrom;
            return this;
        }

        /**
         * The time when the cloud desktop stops to be connected, which is the maximum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder connectEndTimeTo(Long connectEndTimeTo) {
            this.putQueryParameter("ConnectEndTimeTo", connectEndTimeTo);
            this.connectEndTimeTo = connectEndTimeTo;
            return this;
        }

        /**
         * The time when the cloud desktop starts to be connected, which is the minimum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder connectStartTimeFrom(Long connectStartTimeFrom) {
            this.putQueryParameter("ConnectStartTimeFrom", connectStartTimeFrom);
            this.connectStartTimeFrom = connectStartTimeFrom;
            return this;
        }

        /**
         * The time when the cloud desktop starts to be connected, which is the maximum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder connectStartTimeTo(Long connectStartTimeTo) {
            this.putQueryParameter("ConnectStartTimeTo", connectStartTimeTo);
            this.connectStartTimeTo = connectStartTimeTo;
            return this;
        }

        /**
         * The ID of the cloud computer pool.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The ID of the cloud computer.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the authorized user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The type of the user account.
         * <p>
         * 
         * Valid values:
         * 
         * *   SIMPLE: convenience account
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   AD_CONNECTOR: enterprise AD account
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder endUserType(String endUserType) {
            this.putQueryParameter("EndUserType", endUserType);
            this.endUserType = endUserType;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100. Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeUserConnectionRecordsRequest build() {
            return new DescribeUserConnectionRecordsRequest(this);
        } 

    } 

}
