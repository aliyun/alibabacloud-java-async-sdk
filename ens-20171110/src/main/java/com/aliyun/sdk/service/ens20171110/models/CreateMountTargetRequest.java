// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMountTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateMountTargetRequest</p>
 */
public class CreateMountTargetRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MountTargetName")
    @Validation(required = true)
    private String mountTargetName;

    @Query
    @NameInMap("NetWorkId")
    @Validation(required = true)
    private String netWorkId;

    private CreateMountTargetRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.fileSystemId = builder.fileSystemId;
        this.mountTargetName = builder.mountTargetName;
        this.netWorkId = builder.netWorkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMountTargetRequest create() {
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

    /**
     * @return netWorkId
     */
    public String getNetWorkId() {
        return this.netWorkId;
    }

    public static final class Builder extends Request.Builder<CreateMountTargetRequest, Builder> {
        private String ensRegionId; 
        private String fileSystemId; 
        private String mountTargetName; 
        private String netWorkId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMountTargetRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.fileSystemId = request.fileSystemId;
            this.mountTargetName = request.mountTargetName;
            this.netWorkId = request.netWorkId;
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

        /**
         * The ID of the network.
         */
        public Builder netWorkId(String netWorkId) {
            this.putQueryParameter("NetWorkId", netWorkId);
            this.netWorkId = netWorkId;
            return this;
        }

        @Override
        public CreateMountTargetRequest build() {
            return new CreateMountTargetRequest(this);
        } 

    } 

}
