// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link BaseFileUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>BaseFileUserPermissionResponse</p>
 */
public class BaseFileUserPermissionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("can_access")
    private Boolean canAccess;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("disinherit_sub_group")
    private Boolean disinheritSubGroup;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("expire_time")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("file_full_path")
    private String fileFullPath;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("identity")
    private Identity identity;

    @com.aliyun.core.annotation.NameInMap("role_id")
    private String roleId;

    private BaseFileUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.canAccess = builder.canAccess;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.disinheritSubGroup = builder.disinheritSubGroup;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.expireTime = builder.expireTime;
        this.fileFullPath = builder.fileFullPath;
        this.fileId = builder.fileId;
        this.identity = builder.identity;
        this.roleId = builder.roleId;
    }

    public static BaseFileUserPermissionResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return canAccess
     */
    public Boolean getCanAccess() {
        return this.canAccess;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return disinheritSubGroup
     */
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return fileFullPath
     */
    public String getFileFullPath() {
        return this.fileFullPath;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return identity
     */
    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public interface Builder extends Response.Builder<BaseFileUserPermissionResponse, Builder> {

        Builder canAccess(Boolean canAccess);

        Builder createdAt(Long createdAt);

        Builder creator(String creator);

        Builder disinheritSubGroup(Boolean disinheritSubGroup);

        Builder domainId(String domainId);

        Builder driveId(String driveId);

        Builder expireTime(Long expireTime);

        Builder fileFullPath(String fileFullPath);

        Builder fileId(String fileId);

        Builder identity(Identity identity);

        Builder roleId(String roleId);

        @Override
        BaseFileUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseFileUserPermissionResponse, Builder>
            implements Builder {
        private Boolean canAccess; 
        private Long createdAt; 
        private String creator; 
        private Boolean disinheritSubGroup; 
        private String domainId; 
        private String driveId; 
        private Long expireTime; 
        private String fileFullPath; 
        private String fileId; 
        private Identity identity; 
        private String roleId; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseFileUserPermissionResponse response) {
            super(response);
            this.canAccess = response.canAccess;
            this.createdAt = response.createdAt;
            this.creator = response.creator;
            this.disinheritSubGroup = response.disinheritSubGroup;
            this.domainId = response.domainId;
            this.driveId = response.driveId;
            this.expireTime = response.expireTime;
            this.fileFullPath = response.fileFullPath;
            this.fileId = response.fileId;
            this.identity = response.identity;
            this.roleId = response.roleId;
        } 

        /**
         * can_access.
         */
        @Override
        public Builder canAccess(Boolean canAccess) {
            this.canAccess = canAccess;
            return this;
        }

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        @Override
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * disinherit_sub_group.
         */
        @Override
        public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_id.
         */
        @Override
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * expire_time.
         */
        @Override
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * file_full_path.
         */
        @Override
        public Builder fileFullPath(String fileFullPath) {
            this.fileFullPath = fileFullPath;
            return this;
        }

        /**
         * file_id.
         */
        @Override
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * identity.
         */
        @Override
        public Builder identity(Identity identity) {
            this.identity = identity;
            return this;
        }

        /**
         * role_id.
         */
        @Override
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        @Override
        public BaseFileUserPermissionResponse build() {
            return new BaseFileUserPermissionResponse(this);
        } 

    } 

}
