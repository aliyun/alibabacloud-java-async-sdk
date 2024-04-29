// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDriveGroupsRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudDriveGroupsRequest</p>
 */
public class ModifyCloudDriveGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private java.util.List < String > groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Long totalSize;

    private ModifyCloudDriveGroupsRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudDriveGroupsRequest create() {
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
    public java.util.List < String > getGroupId() {
        return this.groupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder extends Request.Builder<ModifyCloudDriveGroupsRequest, Builder> {
        private String cdsId; 
        private java.util.List < String > groupId; 
        private String regionId; 
        private String status; 
        private Long totalSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudDriveGroupsRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.groupId = request.groupId;
            this.regionId = request.regionId;
            this.status = request.status;
            this.totalSize = request.totalSize;
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
         * The IDs of the teams.
         */
        public Builder groupId(java.util.List < String > groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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

        /**
         * The status of the team space. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         * 
         * Default value: enabled.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The total capacity of the team space.
         */
        public Builder totalSize(Long totalSize) {
            this.putQueryParameter("TotalSize", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        @Override
        public ModifyCloudDriveGroupsRequest build() {
            return new ModifyCloudDriveGroupsRequest(this);
        } 

    } 

}
