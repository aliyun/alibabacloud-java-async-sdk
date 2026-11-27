// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DeleteMountTargetRequest} extends {@link RequestModel}
 *
 * <p>DeleteMountTargetRequest</p>
 */
public class DeleteMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private Boolean dryRun; 
        private String fileSystemId; 
        private String mountTargetDomain; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMountTargetRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.mountTargetDomain = request.mountTargetDomain;
        } 

        /**
         * <p>Specifies whether to perform a dry run on the request.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li><p>General-purpose NAS: 31a8e4****.</p>
         * </li>
         * <li><p>Extreme NAS: must start with <code>extreme-</code>, such as extreme-0015****.</p>
         * </li>
         * <li><p>CPFS: must start with <code>cpfs-</code>, such as cpfs-125487****.</p>
         * </li>
         * </ul>
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
         * <p>The mount target.</p>
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
