// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountTargetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mountTargetName;

    private DeleteMountTargetRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.fileSystemId = builder.fileSystemId;
        this.mountTargetName = builder.mountTargetName;
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
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return mountTargetName
     */
    public String getMountTargetName() {
        return this.mountTargetName;
    }

    public static final class Builder extends Request.Builder<DeleteMountTargetRequest, Builder> {
        private String ensRegionId; 
        private String fileSystemId; 
        private String mountTargetName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMountTargetRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.fileSystemId = request.fileSystemId;
            this.mountTargetName = request.mountTargetName;
        } 

        /**
         * The ID of the region.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The name of the mount target.
         */
        public Builder mountTargetName(String mountTargetName) {
            this.putQueryParameter("MountTargetName", mountTargetName);
            this.mountTargetName = mountTargetName;
            return this;
        }

        @Override
        public DeleteMountTargetRequest build() {
            return new DeleteMountTargetRequest(this);
        } 

    } 

}
