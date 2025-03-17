// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link FilePermissionMember} extends {@link TeaModel}
 *
 * <p>FilePermissionMember</p>
 */
public class FilePermissionMember extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CdsIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private CdsIdentity cdsIdentity;

    @com.aliyun.core.annotation.NameInMap("DisinheritSubGroup")
    private Boolean disinheritSubGroup;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    private FilePermissionMember(Builder builder) {
        this.cdsIdentity = builder.cdsIdentity;
        this.disinheritSubGroup = builder.disinheritSubGroup;
        this.expireTime = builder.expireTime;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilePermissionMember create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsIdentity
     */
    public CdsIdentity getCdsIdentity() {
        return this.cdsIdentity;
    }

    /**
     * @return disinheritSubGroup
     */
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static final class Builder {
        private CdsIdentity cdsIdentity; 
        private Boolean disinheritSubGroup; 
        private Long expireTime; 
        private String roleId; 

        private Builder() {
        } 

        private Builder(FilePermissionMember model) {
            this.cdsIdentity = model.cdsIdentity;
            this.disinheritSubGroup = model.disinheritSubGroup;
            this.expireTime = model.expireTime;
            this.roleId = model.roleId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cdsIdentity(CdsIdentity cdsIdentity) {
            this.cdsIdentity = cdsIdentity;
            return this;
        }

        /**
         * DisinheritSubGroup.
         */
        public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public FilePermissionMember build() {
            return new FilePermissionMember(this);
        } 

    } 

    /**
     * 
     * {@link FilePermissionMember} extends {@link TeaModel}
     *
     * <p>FilePermissionMember</p>
     */
    public static class CdsIdentity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private CdsIdentity(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdsIdentity create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(CdsIdentity model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CdsIdentity build() {
                return new CdsIdentity(this);
            } 

        } 

    }
}
