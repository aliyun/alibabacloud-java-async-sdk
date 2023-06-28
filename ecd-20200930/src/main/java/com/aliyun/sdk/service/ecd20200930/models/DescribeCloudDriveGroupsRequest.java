// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDriveGroupsRequest</p>
 */
public class DescribeCloudDriveGroupsRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("DirectoryName")
    private String directoryName;

    @Query
    @NameInMap("DriveStatus")
    private String driveStatus;

    @Query
    @NameInMap("DriveType")
    private String driveType;

    @Query
    @NameInMap("GroupId")
    private java.util.List < String > groupId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ParentGroupId")
    private String parentGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCloudDriveGroupsRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.directoryId = builder.directoryId;
        this.directoryName = builder.directoryName;
        this.driveStatus = builder.driveStatus;
        this.driveType = builder.driveType;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentGroupId = builder.parentGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDriveGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * @return driveStatus
     */
    public String getDriveStatus() {
        return this.driveStatus;
    }

    /**
     * @return driveType
     */
    public String getDriveType() {
        return this.driveType;
    }

    /**
     * @return groupId
     */
    public java.util.List < String > getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
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
     * @return parentGroupId
     */
    public String getParentGroupId() {
        return this.parentGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCloudDriveGroupsRequest, Builder> {
        private String cdsId; 
        private String directoryId; 
        private String directoryName; 
        private String driveStatus; 
        private String driveType; 
        private java.util.List < String > groupId; 
        private String groupName; 
        private String groupType; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudDriveGroupsRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.directoryId = request.directoryId;
            this.directoryName = request.directoryName;
            this.driveStatus = request.driveStatus;
            this.driveType = request.driveType;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentGroupId = request.parentGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud disk in Cloud Drive Service.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The workspace name.
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        /**
         * The team space status. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         * 
         * Default value: enabled.
         */
        public Builder driveStatus(String driveStatus) {
            this.putQueryParameter("DriveStatus", driveStatus);
            this.driveStatus = driveStatus;
            return this;
        }

        /**
         * Specifies whether the space is increased.
         * <p>
         * 
         * *   binding: increased
         * *   unbound: not increased
         * 
         * Default value: null. The default value indicates that all spaces are queried.
         */
        public Builder driveType(String driveType) {
            this.putQueryParameter("DriveType", driveType);
            this.driveType = driveType;
            return this;
        }

        /**
         * The team ID.
         */
        public Builder groupId(java.util.List < String > groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The team name for fuzzy search.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The team type.
         * <p>
         * 
         * *   org: organizational structure
         * *   directory: workspace
         * 
         * Default value: null. The default value indicates that all types of teams are queried.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Valid values: 1 to 100
         * *   Default value: 20
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
         * The ID of the parent node. If a parent node ID is specified, the subnodes are queried. If you set the value of this parameter to root, the root node is queried.
         * <p>
         * 
         * Default value: null. The default value indicates that all nodes are queried.
         */
        public Builder parentGroupId(String parentGroupId) {
            this.putQueryParameter("ParentGroupId", parentGroupId);
            this.parentGroupId = parentGroupId;
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

        @Override
        public DescribeCloudDriveGroupsRequest build() {
            return new DescribeCloudDriveGroupsRequest(this);
        } 

    } 

}
