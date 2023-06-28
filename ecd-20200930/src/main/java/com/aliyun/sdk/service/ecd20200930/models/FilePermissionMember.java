// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FilePermissionMember} extends {@link TeaModel}
 *
 * <p>FilePermissionMember</p>
 */
public class FilePermissionMember extends TeaModel {
    @NameInMap("CdsIdentity")
    @Validation(required = true)
    private CdsIdentity cdsIdentity;

    @NameInMap("DisinheritSubGroup")
    private Boolean disinheritSubGroup;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("RoleId")
    @Validation(required = true)
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

        /**
         * CdsIdentity.
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
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public FilePermissionMember build() {
            return new FilePermissionMember(this);
        } 

    } 

    public static class CdsIdentity extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("Type")
        @Validation(required = true)
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

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Type.
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
