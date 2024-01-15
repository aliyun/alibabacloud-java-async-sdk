// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNASFileSystemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNASFileSystemsRequest</p>
 */
public class DescribeNASFileSystemsRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    private java.util.List < String > fileSystemId;

    @Query
    @NameInMap("MatchCompatibleProfile")
    private Boolean matchCompatibleProfile;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
    public java.util.List < String > getFileSystemId() {
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
        private java.util.List < String > fileSystemId; 
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
         * The IDs of the NAS file system.
         */
        public Builder fileSystemId(java.util.List < String > fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * Specifies whether to filter NAS file systems that only support the user profile management (UPM) feature.
         */
        public Builder matchCompatibleProfile(Boolean matchCompatibleProfile) {
            this.putQueryParameter("MatchCompatibleProfile", matchCompatibleProfile);
            this.matchCompatibleProfile = matchCompatibleProfile;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum value: 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The ID of the region.
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
