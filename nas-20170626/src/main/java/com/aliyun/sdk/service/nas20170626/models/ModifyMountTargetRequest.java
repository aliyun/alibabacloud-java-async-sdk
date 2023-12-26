// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMountTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyMountTargetRequest</p>
 */
public class ModifyMountTargetRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    private String accessGroupName;

    @Query
    @NameInMap("DualStackMountTargetDomain")
    private String dualStackMountTargetDomain;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @Query
    @NameInMap("Status")
    private String status;

    private ModifyMountTargetRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.dualStackMountTargetDomain = builder.dualStackMountTargetDomain;
        this.fileSystemId = builder.fileSystemId;
        this.mountTargetDomain = builder.mountTargetDomain;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMountTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return dualStackMountTargetDomain
     */
    public String getDualStackMountTargetDomain() {
        return this.dualStackMountTargetDomain;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyMountTargetRequest, Builder> {
        private String accessGroupName; 
        private String dualStackMountTargetDomain; 
        private String fileSystemId; 
        private String mountTargetDomain; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMountTargetRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.dualStackMountTargetDomain = request.dualStackMountTargetDomain;
            this.fileSystemId = request.fileSystemId;
            this.mountTargetDomain = request.mountTargetDomain;
            this.status = request.status;
        } 

        /**
         * The name of the permission group that is attached to the mount target.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * The dual-stack (IPv4 and IPv6) domain name of the mount target.
         * <p>
         * 
         * >  Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.
         */
        public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.putQueryParameter("DualStackMountTargetDomain", dualStackMountTargetDomain);
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }

        /**
         * The ID of the file system.
         * <p>
         * 
         * *   Sample ID of a General-purpose NAS file system: `31a8e4****`.
         * *   The IDs of Extreme NAS file systems must start with `extreme-`, for example, `extreme-0015****`.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The IPv4 domain name of the mount target.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putQueryParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * The status of the mount target.
         * <p>
         * 
         * Valid values:
         * 
         * *   Active: The mount target is available.
         * *   Inactive: The mount target is unavailable.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyMountTargetRequest build() {
            return new ModifyMountTargetRequest(this);
        } 

    } 

}
