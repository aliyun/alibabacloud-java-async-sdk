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
    @com.aliyun.core.annotation.NameInMap("DesktopGroupIds")
    private java.util.List<String> desktopGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillTerminalInfo")
    private Boolean fillTerminalInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

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
        this.desktopGroupIds = builder.desktopGroupIds;
        this.desktopGroupName = builder.desktopGroupName;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.fillTerminalInfo = builder.fillTerminalInfo;
        this.language = builder.language;
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
     * @return desktopGroupIds
     */
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    /**
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return this.desktopGroupName;
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
     * @return fillTerminalInfo
     */
    public Boolean getFillTerminalInfo() {
        return this.fillTerminalInfo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
        private java.util.List<String> desktopGroupIds; 
        private String desktopGroupName; 
        private String endTime; 
        private String endUserId; 
        private Boolean fillTerminalInfo; 
        private String language; 
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
            this.desktopGroupIds = request.desktopGroupIds;
            this.desktopGroupName = request.desktopGroupName;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.fillTerminalInfo = request.fillTerminalInfo;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownType = request.ownType;
            this.regionId = request.regionId;
            this.sessionStatus = request.sessionStatus;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The list of shared desktop group IDs.</p>
         */
        public Builder desktopGroupIds(java.util.List<String> desktopGroupIds) {
            this.putQueryParameter("DesktopGroupIds", desktopGroupIds);
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * <p>The name of the shared desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-4oyi32wmrctgx****</p>
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * <p>The end time of the query. The time is in the ISO 8601 standard (UTC).</p>
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
         * <p>The ID of the end user connected to the session.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>Specifies whether to include terminal information.</p>
         */
        public Builder fillTerminalInfo(Boolean fillTerminalInfo) {
            this.putQueryParameter("FillTerminalInfo", fillTerminalInfo);
            this.fillTerminalInfo = fillTerminalInfo;
            return this;
        }

        /**
         * <p>The language type of the returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
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
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6ljnKKgSRjo8yXAIT5QSvkU</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The session type.</p>
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
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
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
         * <p>The connection status.</p>
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
         * <p>The start time of the query. The time is in the ISO 8601 standard (UTC).</p>
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
