// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessPointRequest</p>
 */
public class CreateAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointName")
    private String accessPointName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnabledRam")
    private Boolean enabledRam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerGroupId")
    private Integer ownerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private Integer ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    private String permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixGroupId")
    private Integer posixGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixSecondaryGroupIds")
    private String posixSecondaryGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixUserId")
    private Integer posixUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    private String rootDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vswId;

    private CreateAccessPointRequest(Builder builder) {
        super(builder);
        this.accessGroup = builder.accessGroup;
        this.accessPointName = builder.accessPointName;
        this.enabledRam = builder.enabledRam;
        this.fileSystemId = builder.fileSystemId;
        this.ownerGroupId = builder.ownerGroupId;
        this.ownerUserId = builder.ownerUserId;
        this.permission = builder.permission;
        this.posixGroupId = builder.posixGroupId;
        this.posixSecondaryGroupIds = builder.posixSecondaryGroupIds;
        this.posixUserId = builder.posixUserId;
        this.rootDirectory = builder.rootDirectory;
        this.vpcId = builder.vpcId;
        this.vswId = builder.vswId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroup
     */
    public String getAccessGroup() {
        return this.accessGroup;
    }

    /**
     * @return accessPointName
     */
    public String getAccessPointName() {
        return this.accessPointName;
    }

    /**
     * @return enabledRam
     */
    public Boolean getEnabledRam() {
        return this.enabledRam;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return ownerGroupId
     */
    public Integer getOwnerGroupId() {
        return this.ownerGroupId;
    }

    /**
     * @return ownerUserId
     */
    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return posixGroupId
     */
    public Integer getPosixGroupId() {
        return this.posixGroupId;
    }

    /**
     * @return posixSecondaryGroupIds
     */
    public String getPosixSecondaryGroupIds() {
        return this.posixSecondaryGroupIds;
    }

    /**
     * @return posixUserId
     */
    public Integer getPosixUserId() {
        return this.posixUserId;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswId
     */
    public String getVswId() {
        return this.vswId;
    }

    public static final class Builder extends Request.Builder<CreateAccessPointRequest, Builder> {
        private String accessGroup; 
        private String accessPointName; 
        private Boolean enabledRam; 
        private String fileSystemId; 
        private Integer ownerGroupId; 
        private Integer ownerUserId; 
        private String permission; 
        private Integer posixGroupId; 
        private String posixSecondaryGroupIds; 
        private Integer posixUserId; 
        private String rootDirectory; 
        private String vpcId; 
        private String vswId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessPointRequest request) {
            super(request);
            this.accessGroup = request.accessGroup;
            this.accessPointName = request.accessPointName;
            this.enabledRam = request.enabledRam;
            this.fileSystemId = request.fileSystemId;
            this.ownerGroupId = request.ownerGroupId;
            this.ownerUserId = request.ownerUserId;
            this.permission = request.permission;
            this.posixGroupId = request.posixGroupId;
            this.posixSecondaryGroupIds = request.posixSecondaryGroupIds;
            this.posixUserId = request.posixUserId;
            this.rootDirectory = request.rootDirectory;
            this.vpcId = request.vpcId;
            this.vswId = request.vswId;
        } 

        /**
         * <p>The name of the permission group.</p>
         * <p>This parameter is required for a General-purpose Apsara File Storage NAS (NAS) file system.</p>
         * <p>The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        public Builder accessGroup(String accessGroup) {
            this.putQueryParameter("AccessGroup", accessGroup);
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * <p>The name of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accessPointName(String accessPointName) {
            this.putQueryParameter("AccessPointName", accessPointName);
            this.accessPointName = accessPointName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the RAM policy. Valid values:</p>
         * <ul>
         * <li>true: The RAM policy is enabled.</li>
         * <li>false (default): The RAM policy is disabled.</li>
         * </ul>
         * <blockquote>
         * <p> After the RAM policy is enabled for access points, no RAM user is allowed to use access points to mount and access data by default. To use access points to mount and access data as a RAM user, you must grant the related access permissions to the RAM user. If the RAM policy is disabled, access points can be anonymously mounted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabledRam(Boolean enabledRam) {
            this.putQueryParameter("EnabledRam", enabledRam);
            this.enabledRam = enabledRam;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the owner group.</p>
         * <p>This parameter is required if the RootDirectory directory does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownerGroupId(Integer ownerGroupId) {
            this.putQueryParameter("OwnerGroupId", ownerGroupId);
            this.ownerGroupId = ownerGroupId;
            return this;
        }

        /**
         * <p>The owner ID.</p>
         * <p>This parameter is required if the RootDirectory directory does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownerUserId(Integer ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>The Portable Operating System Interface for UNIX (POSIX) permission. Default value: 0777.</p>
         * <p>This field takes effect only if you specify the OwnerUserId and OwnerGroupId parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>0777</p>
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>The ID of the POSIX user group.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder posixGroupId(Integer posixGroupId) {
            this.putQueryParameter("PosixGroupId", posixGroupId);
            this.posixGroupId = posixGroupId;
            return this;
        }

        /**
         * <p>The secondary user group. Separate multiple user group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>123,345</p>
         */
        public Builder posixSecondaryGroupIds(String posixSecondaryGroupIds) {
            this.putQueryParameter("PosixSecondaryGroupIds", posixSecondaryGroupIds);
            this.posixSecondaryGroupIds = posixSecondaryGroupIds;
            return this;
        }

        /**
         * <p>The ID of the POSIX user.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder posixUserId(Integer posixUserId) {
            this.putQueryParameter("PosixUserId", posixUserId);
            this.posixUserId = posixUserId;
            return this;
        }

        /**
         * <p>The root directory of the access point. The default value is /. If the directory does not exist, you must also specify the OwnerUserId and OwnerGroupId parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder rootDirectory(String rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
         */
        public Builder vswId(String vswId) {
            this.putQueryParameter("VswId", vswId);
            this.vswId = vswId;
            return this;
        }

        @Override
        public CreateAccessPointRequest build() {
            return new CreateAccessPointRequest(this);
        } 

    } 

}
