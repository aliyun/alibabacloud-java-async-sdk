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
 * {@link CreateCloudDriveGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudDriveGroupRequest</p>
 */
public class CreateCloudDriveGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminUserIds")
    private java.util.List<String> adminUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalSize")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long totalSize;

    private CreateCloudDriveGroupRequest(Builder builder) {
        super(builder);
        this.adminUserIds = builder.adminUserIds;
        this.cdsId = builder.cdsId;
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudDriveGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminUserIds
     */
    public java.util.List<String> getAdminUserIds() {
        return this.adminUserIds;
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
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder extends Request.Builder<CreateCloudDriveGroupRequest, Builder> {
        private java.util.List<String> adminUserIds; 
        private String cdsId; 
        private String groupId; 
        private String regionId; 
        private Long totalSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudDriveGroupRequest request) {
            super(request);
            this.adminUserIds = request.adminUserIds;
            this.cdsId = request.cdsId;
            this.groupId = request.groupId;
            this.regionId = request.regionId;
            this.totalSize = request.totalSize;
        } 

        /**
         * AdminUserIds.
         */
        public Builder adminUserIds(java.util.List<String> adminUserIds) {
            this.putQueryParameter("AdminUserIds", adminUserIds);
            this.adminUserIds = adminUserIds;
            return this;
        }

        /**
         * <p>The ID of the cloud disk in Cloud Drive Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-532033****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The ID of the team.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7f4bbccda0cf40bb85981b65fb5e****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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

        /**
         * <p>The size of the cloud disk in Cloud Drive Service. Unit: bytes. The size is unlimited.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        public Builder totalSize(Long totalSize) {
            this.putQueryParameter("TotalSize", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        @Override
        public CreateCloudDriveGroupRequest build() {
            return new CreateCloudDriveGroupRequest(this);
        } 

    } 

}
