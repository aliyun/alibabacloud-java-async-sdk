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
 * {@link DescribeCloudDiskGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDiskGroupsRequest</p>
 */
public class DescribeCloudDiskGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private java.util.List<String> groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentOrgId")
    private String parentOrgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeCloudDiskGroupsRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.parentOrgId = builder.parentOrgId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDiskGroupsRequest create() {
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
     * @return parentOrgId
     */
    public String getParentOrgId() {
        return this.parentOrgId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCloudDiskGroupsRequest, Builder> {
        private String cdsId; 
        private java.util.List<String> groupId; 
        private String groupName; 
        private String parentOrgId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudDiskGroupsRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.parentOrgId = request.parentOrgId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-0456357992</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(java.util.List<String> groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * ParentOrgId.
         */
        public Builder parentOrgId(String parentOrgId) {
            this.putQueryParameter("ParentOrgId", parentOrgId);
            this.parentOrgId = parentOrgId;
            return this;
        }

        /**
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
        public DescribeCloudDiskGroupsRequest build() {
            return new DescribeCloudDiskGroupsRequest(this);
        } 

    } 

}
