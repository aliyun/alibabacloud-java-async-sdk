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
 * {@link DescribeCloudDriveGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDriveGroupsRequest</p>
 */
public class DescribeCloudDriveGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryName")
    private String directoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriveStatus")
    private String driveStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriveType")
    private String driveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private java.util.List<String> groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentGroupId")
    private String parentGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getGroupId() {
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
        private java.util.List<String> groupId; 
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
         * <p>The ID of the enterprise cloud drive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+cds-135515****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The name of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>testDirectoryName</p>
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        /**
         * <p>The status of the team workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder driveStatus(String driveStatus) {
            this.putQueryParameter("DriveStatus", driveStatus);
            this.driveStatus = driveStatus;
            return this;
        }

        /**
         * <p>Specifies whether a workspace is added. By default, this parameter is left empty, which indicates that all workspaces are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>binding</p>
         */
        public Builder driveType(String driveType) {
            this.putQueryParameter("DriveType", driveType);
            this.driveType = driveType;
            return this;
        }

        /**
         * <p>The IDs of the team workspaces.</p>
         */
        public Builder groupId(java.util.List<String> groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the team workspace. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTeam1</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The team type. By default, this parameter is left empty, which indicates that all types are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>org</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The number of entries to return on each page during paging in a paged query.</p>
         * <ul>
         * <li>Maximum value: 100</li>
         * <li>Default value: 20</li>
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
         * <p>The pagination token. Set the value to the <code>NextToken</code> value returned from the last call. You do not need to specify this parameter for the first call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lY3I2VNHLwy+nIoSXh****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the parent node of the object to be queried. To query the root node, set this parameter to <code>root</code>. By default, this parameter is left empty, which indicates that all objects are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-e70ga4ixp30ur****</p>
         */
        public Builder parentGroupId(String parentGroupId) {
            this.putQueryParameter("ParentGroupId", parentGroupId);
            this.parentGroupId = parentGroupId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
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
        public DescribeCloudDriveGroupsRequest build() {
            return new DescribeCloudDriveGroupsRequest(this);
        } 

    } 

}
