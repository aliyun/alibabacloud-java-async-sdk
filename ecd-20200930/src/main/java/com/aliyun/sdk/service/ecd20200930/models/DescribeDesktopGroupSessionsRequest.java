// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDesktopGroupSessionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopGroupSessionsRequest</p>
 */
public class DescribeDesktopGroupSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnType")
    private Integer ownType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionStatus")
    private String sessionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2022-08-31T06:56:45Z&quot;</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>xianqiu</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;asdfdfsdfsdfds&quot;</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The type of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: single-session</li>
         * <li>1: multi-session</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownType(Integer ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Connected</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Disconnected</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        public Builder sessionStatus(String sessionStatus) {
            this.putQueryParameter("SessionStatus", sessionStatus);
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2022-08-31T06:56:45Z&quot;</p>
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
