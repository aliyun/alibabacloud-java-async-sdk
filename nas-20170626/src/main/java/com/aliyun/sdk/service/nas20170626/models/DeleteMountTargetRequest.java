// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMountTargetRequest} extends {@link RequestModel}
 *
 * <p>DeleteMountTargetRequest</p>
 */
public class DeleteMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mountTargetDomain;

    private DeleteMountTargetRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.mountTargetDomain = builder.mountTargetDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMountTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteMountTargetRequest, Builder> {
        private String fileSystemId; 
        private String mountTargetDomain; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMountTargetRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.mountTargetDomain = request.mountTargetDomain;
        } 

        /**
         * The ID of the file system.
         * <p>
         * 
         * *   Sample ID of a General-purpose NAS file system: 31a8e4\*\*\*\*.
         * *   The IDs of Extreme NAS file systems must start with `extreme-`, for example, extreme-0015\*\*\*\*.
         * *   The IDs of Cloud Parallel File Storage (CPFS) file systems must start with `cpfs-`, for example, cpfs-125487\*\*\*\*.
         * 
         * > CPFS file systems are available only on the China site (aliyun.com).
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The domain name of the mount target.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putQueryParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        @Override
        public DeleteMountTargetRequest build() {
            return new DeleteMountTargetRequest(this);
        } 

    } 

}
