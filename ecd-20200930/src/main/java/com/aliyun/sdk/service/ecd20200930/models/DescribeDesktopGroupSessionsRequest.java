// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopGroupSessionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopGroupSessionsRequest</p>
 */
public class DescribeDesktopGroupSessionsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnType")
    private Integer ownType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SessionStatus")
    private String sessionStatus;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDesktopGroupSessionsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownType = builder.ownType;
        this.regionId = builder.regionId;
        this.sessionStatus = builder.sessionStatus;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopGroupSessionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
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
     * @return ownType
     */
    public Integer getOwnType() {
        return this.ownType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopGroupSessionsRequest, Builder> {
        private String endTime; 
        private String endUserId; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer ownType; 
        private String regionId; 
        private String sessionStatus; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopGroupSessionsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownType = request.ownType;
            this.regionId = request.regionId;
            this.sessionStatus = request.sessionStatus;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the end user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The type of the session.
         * <p>
         * 
         * Valid values:
         * 
         * *   0
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     single-session
         * 
         *     <!-- -->
         * 
         * *   1
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     multi-session
         * 
         *     <!-- -->
         */
        public Builder ownType(Integer ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The status of the session.
         * <p>
         * 
         * Valid values:
         * 
         * *   Connected
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Disconnected
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder sessionStatus(String sessionStatus) {
            this.putQueryParameter("SessionStatus", sessionStatus);
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * The beginning of the time range to query.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDesktopGroupSessionsRequest build() {
            return new DescribeDesktopGroupSessionsRequest(this);
        } 

    } 

}
