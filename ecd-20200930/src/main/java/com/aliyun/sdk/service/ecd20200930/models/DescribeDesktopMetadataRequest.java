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
 * {@link DescribeDesktopMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopMetadataRequest</p>
 */
public class DescribeDesktopMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationTimeStart")
    private String creationTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIds")
    private java.util.List<String> desktopIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDesktopGroup")
    private Boolean includeDesktopGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTimeStart")
    private String operationTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    private DescribeDesktopMetadataRequest(Builder builder) {
        super(builder);
        this.creationTimeStart = builder.creationTimeStart;
        this.desktopIds = builder.desktopIds;
        this.groupId = builder.groupId;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.includeDesktopGroup = builder.includeDesktopGroup;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.operationTimeStart = builder.operationTimeStart;
        this.regionId = builder.regionId;
        this.searchRegionId = builder.searchRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopMetadataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationTimeStart
     */
    public String getCreationTimeStart() {
        return this.creationTimeStart;
    }

    /**
     * @return desktopIds
     */
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return includeDesktopGroup
     */
    public Boolean getIncludeDesktopGroup() {
        return this.includeDesktopGroup;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return operationTimeStart
     */
    public String getOperationTimeStart() {
        return this.operationTimeStart;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopMetadataRequest, Builder> {
        private String creationTimeStart; 
        private java.util.List<String> desktopIds; 
        private String groupId; 
        private String hostName; 
        private String imageId; 
        private Boolean includeDesktopGroup; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String operationTimeStart; 
        private String regionId; 
        private String searchRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopMetadataRequest request) {
            super(request);
            this.creationTimeStart = request.creationTimeStart;
            this.desktopIds = request.desktopIds;
            this.groupId = request.groupId;
            this.hostName = request.hostName;
            this.imageId = request.imageId;
            this.includeDesktopGroup = request.includeDesktopGroup;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.operationTimeStart = request.operationTimeStart;
            this.regionId = request.regionId;
            this.searchRegionId = request.searchRegionId;
        } 

        /**
         * CreationTimeStart.
         */
        public Builder creationTimeStart(String creationTimeStart) {
            this.putQueryParameter("CreationTimeStart", creationTimeStart);
            this.creationTimeStart = creationTimeStart;
            return this;
        }

        /**
         * DesktopIds.
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * IncludeDesktopGroup.
         */
        public Builder includeDesktopGroup(Boolean includeDesktopGroup) {
            this.putQueryParameter("IncludeDesktopGroup", includeDesktopGroup);
            this.includeDesktopGroup = includeDesktopGroup;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * OperationTimeStart.
         */
        public Builder operationTimeStart(String operationTimeStart) {
            this.putQueryParameter("OperationTimeStart", operationTimeStart);
            this.operationTimeStart = operationTimeStart;
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
         * SearchRegionId.
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        @Override
        public DescribeDesktopMetadataRequest build() {
            return new DescribeDesktopMetadataRequest(this);
        } 

    } 

}
