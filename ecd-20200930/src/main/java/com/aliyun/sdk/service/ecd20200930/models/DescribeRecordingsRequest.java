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
 * {@link DescribeRecordingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordingsRequest</p>
 */
public class DescribeRecordingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedSignedUrl")
    private Boolean needSignedUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignedUrlExpireMinutes")
    private Integer signedUrlExpireMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandardEndTime")
    private String standardEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandardStartTime")
    private String standardStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeRecordingsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.needSignedUrl = builder.needSignedUrl;
        this.nextToken = builder.nextToken;
        this.policyGroupId = builder.policyGroupId;
        this.regionId = builder.regionId;
        this.signedUrlExpireMinutes = builder.signedUrlExpireMinutes;
        this.standardEndTime = builder.standardEndTime;
        this.standardStartTime = builder.standardStartTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return needSignedUrl
     */
    public Boolean getNeedSignedUrl() {
        return this.needSignedUrl;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return signedUrlExpireMinutes
     */
    public Integer getSignedUrlExpireMinutes() {
        return this.signedUrlExpireMinutes;
    }

    /**
     * @return standardEndTime
     */
    public String getStandardEndTime() {
        return this.standardEndTime;
    }

    /**
     * @return standardStartTime
     */
    public String getStandardStartTime() {
        return this.standardStartTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRecordingsRequest, Builder> {
        private String desktopId; 
        private String endTime; 
        private Integer maxResults; 
        private Boolean needSignedUrl; 
        private String nextToken; 
        private String policyGroupId; 
        private String regionId; 
        private Integer signedUrlExpireMinutes; 
        private String standardEndTime; 
        private String standardStartTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordingsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.needSignedUrl = request.needSignedUrl;
            this.nextToken = request.nextToken;
            this.policyGroupId = request.policyGroupId;
            this.regionId = request.regionId;
            this.signedUrlExpireMinutes = request.signedUrlExpireMinutes;
            this.standardEndTime = request.standardEndTime;
            this.standardStartTime = request.standardStartTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cloud computer ID. If this parameter is not specified, the screen recording files on all cloud computers in the designated region will be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-hlh41mk78dugw****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the <code>YYYYMMDDhhmmss</code> format. The time must be in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>20230424004441</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
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
         * <p>Specifies whether to return a URL.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needSignedUrl(Boolean needSignedUrl) {
            this.putQueryParameter("NeedSignedUrl", needSignedUrl);
            this.needSignedUrl = needSignedUrl;
            return this;
        }

        /**
         * <p>The pagination token that is used in the request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aGN4YzAxQGNuLWhhbmd6aG91LjExNzU5NTMyNjgzMTQ1****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The validity period of the returned URL. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder signedUrlExpireMinutes(Integer signedUrlExpireMinutes) {
            this.putQueryParameter("SignedUrlExpireMinutes", signedUrlExpireMinutes);
            this.signedUrlExpireMinutes = signedUrlExpireMinutes;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the ISO 8601 standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time must be in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-27T02:30:10Z</p>
         */
        public Builder standardEndTime(String standardEndTime) {
            this.putQueryParameter("StandardEndTime", standardEndTime);
            this.standardEndTime = standardEndTime;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the ISO 8601 standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time must be in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-27T02:20:10Z</p>
         */
        public Builder standardStartTime(String standardStartTime) {
            this.putQueryParameter("StandardStartTime", standardStartTime);
            this.standardStartTime = standardStartTime;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the <code>YYYYMMDDhhmmss</code> format. The time must be in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>20230424000000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRecordingsRequest build() {
            return new DescribeRecordingsRequest(this);
        } 

    } 

}
