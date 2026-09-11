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
 * {@link ModifyMountTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyMountTargetRequest</p>
 */
public class ModifyMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointAccessOnly")
    private Boolean accessPointAccessOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DualStackMountTargetDomain")
    private String dualStackMountTargetDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyMountTargetRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.accessPointAccessOnly = builder.accessPointAccessOnly;
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
     * @return accessPointAccessOnly
     */
    public Boolean getAccessPointAccessOnly() {
        return this.accessPointAccessOnly;
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
        private Boolean accessPointAccessOnly; 
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
            this.accessPointAccessOnly = request.accessPointAccessOnly;
            this.dualStackMountTargetDomain = request.dualStackMountTargetDomain;
            this.fileSystemId = request.fileSystemId;
            this.mountTargetDomain = request.mountTargetDomain;
            this.status = request.status;
        } 

        /**
         * <p>The permission group attached to the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>classic-test</p>
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * <p>Specifies whether the VPC mount target supports access only through access points. This parameter applies only to CPFS for Lingjun file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder accessPointAccessOnly(Boolean accessPointAccessOnly) {
            this.putQueryParameter("AccessPointAccessOnly", accessPointAccessOnly);
            this.accessPointAccessOnly = accessPointAccessOnly;
            return this;
        }

        /**
         * <p>The IPv4/IPv6 dual-stack mount target.</p>
         * <blockquote>
         * <p>Currently, only Extreme NAS in regions in the Chinese mainland supports IPv6.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.putQueryParameter("DualStackMountTargetDomain", dualStackMountTargetDomain);
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li>General-purpose NAS: <code>31a8e4****</code>.</li>
         * <li>Extreme NAS: Must start with <code>extreme-</code>, such as <code>extreme-0015****</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The IPv4 mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404a666-w****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putQueryParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * <p>The mount target status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active: active</li>
         * <li>Inactive: inactive</li>
         * </ul>
         * <blockquote>
         * <p>Only General-purpose NAS supports changing the mount target status.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
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
