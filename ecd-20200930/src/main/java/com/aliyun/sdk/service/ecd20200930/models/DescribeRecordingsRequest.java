// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
            this.startTime = request.startTime;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * NeedSignedUrl.
         */
        public Builder needSignedUrl(Boolean needSignedUrl) {
            this.putQueryParameter("NeedSignedUrl", needSignedUrl);
            this.needSignedUrl = needSignedUrl;
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
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
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
         * SignedUrlExpireMinutes.
         */
        public Builder signedUrlExpireMinutes(Integer signedUrlExpireMinutes) {
            this.putQueryParameter("SignedUrlExpireMinutes", signedUrlExpireMinutes);
            this.signedUrlExpireMinutes = signedUrlExpireMinutes;
            return this;
        }

        /**
         * StartTime.
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
