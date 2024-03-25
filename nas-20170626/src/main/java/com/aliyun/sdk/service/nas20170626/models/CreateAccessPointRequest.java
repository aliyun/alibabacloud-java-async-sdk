// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessPointRequest</p>
 */
public class CreateAccessPointRequest extends Request {
    @Query
    @NameInMap("AccessGroup")
    @Validation(required = true)
    private String accessGroup;

    @Query
    @NameInMap("AccessPointName")
    private String accessPointName;

    @Query
    @NameInMap("EnabledRam")
    private Boolean enabledRam;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("OwnerGroupId")
    private Integer ownerGroupId;

    @Query
    @NameInMap("OwnerUserId")
    private Integer ownerUserId;

    @Query
    @NameInMap("Permission")
    private String permission;

    @Query
    @NameInMap("PosixGroupId")
    private Integer posixGroupId;

    @Query
    @NameInMap("PosixSecondaryGroupIds")
    private String posixSecondaryGroupIds;

    @Query
    @NameInMap("PosixUserId")
    private Integer posixUserId;

    @Query
    @NameInMap("RootDirectory")
    private String rootDirectory;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("VswId")
    @Validation(required = true)
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
         * AccessGroup.
         */
        public Builder accessGroup(String accessGroup) {
            this.putQueryParameter("AccessGroup", accessGroup);
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * AccessPointName.
         */
        public Builder accessPointName(String accessPointName) {
            this.putQueryParameter("AccessPointName", accessPointName);
            this.accessPointName = accessPointName;
            return this;
        }

        /**
         * EnabledRam.
         */
        public Builder enabledRam(Boolean enabledRam) {
            this.putQueryParameter("EnabledRam", enabledRam);
            this.enabledRam = enabledRam;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * OwnerGroupId.
         */
        public Builder ownerGroupId(Integer ownerGroupId) {
            this.putQueryParameter("OwnerGroupId", ownerGroupId);
            this.ownerGroupId = ownerGroupId;
            return this;
        }

        /**
         * OwnerUserId.
         */
        public Builder ownerUserId(Integer ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * Permission.
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * PosixGroupId.
         */
        public Builder posixGroupId(Integer posixGroupId) {
            this.putQueryParameter("PosixGroupId", posixGroupId);
            this.posixGroupId = posixGroupId;
            return this;
        }

        /**
         * PosixSecondaryGroupIds.
         */
        public Builder posixSecondaryGroupIds(String posixSecondaryGroupIds) {
            this.putQueryParameter("PosixSecondaryGroupIds", posixSecondaryGroupIds);
            this.posixSecondaryGroupIds = posixSecondaryGroupIds;
            return this;
        }

        /**
         * PosixUserId.
         */
        public Builder posixUserId(Integer posixUserId) {
            this.putQueryParameter("PosixUserId", posixUserId);
            this.posixUserId = posixUserId;
            return this;
        }

        /**
         * RootDirectory.
         */
        public Builder rootDirectory(String rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VswId.
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
