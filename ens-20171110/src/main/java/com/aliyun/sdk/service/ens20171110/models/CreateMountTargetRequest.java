// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateMountTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateMountTargetRequest</p>
 */
public class CreateMountTargetRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetWorkId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c50f8*****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The name of the mount target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestMountPath</p>
         */
        public Builder mountTargetName(String mountTargetName) {
            this.putQueryParameter("MountTargetName", mountTargetName);
            this.mountTargetName = mountTargetName;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-*****</p>
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
