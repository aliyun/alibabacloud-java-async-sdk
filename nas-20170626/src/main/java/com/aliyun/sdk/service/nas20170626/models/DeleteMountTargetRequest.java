// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>Sample ID of a General-purpose NAS file system: 31a8e4****.</li>
         * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>, for example, extreme-0015****.</li>
         * <li>The IDs of Cloud Parallel File Storage (CPFS) file systems must start with <code>cpfs-</code>, for example, cpfs-125487****.</li>
         * </ul>
         * <blockquote>
         * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174494****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The domain name of the mount target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174494b666-x****.cn-hangzhou.nas.aliyuncs.com</p>
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
