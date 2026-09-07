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
 * {@link DescribeNASFileSystemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNASFileSystemsRequest</p>
 */
public class DescribeNASFileSystemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private java.util.List<String> fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchCompatibleProfile")
    private Boolean matchCompatibleProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeNASFileSystemsRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.matchCompatibleProfile = builder.matchCompatibleProfile;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNASFileSystemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public java.util.List<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return matchCompatibleProfile
     */
    public Boolean getMatchCompatibleProfile() {
        return this.matchCompatibleProfile;
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeNASFileSystemsRequest, Builder> {
        private java.util.List<String> fileSystemId; 
        private Boolean matchCompatibleProfile; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNASFileSystemsRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.matchCompatibleProfile = request.matchCompatibleProfile;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The list of NAS file system IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>04f314****</p>
         */
        public Builder fileSystemId(java.util.List<String> fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>Specifies whether to include only NAS file systems that support UPM in the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder matchCompatibleProfile(Boolean matchCompatibleProfile) {
            this.putQueryParameter("MatchCompatibleProfile", matchCompatibleProfile);
            this.matchCompatibleProfile = matchCompatibleProfile;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query.    </p>
         * <ul>
         * <li>Maximum value: 100.    </li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the value of NextToken that was returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeNASFileSystemsRequest build() {
            return new DescribeNASFileSystemsRequest(this);
        } 

    } 

}
