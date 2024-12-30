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
 * {@link FilePermissionMember} extends {@link TeaModel}
 *
 * <p>FilePermissionMember</p>
 */
public class FilePermissionMember extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action_list")
    private java.util.List<String> actionList;

    @com.aliyun.core.annotation.NameInMap("disinherit_sub_group")
    private Boolean disinheritSubGroup;

    @com.aliyun.core.annotation.NameInMap("expire_time")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("identity")
    private Identity identity;

    @com.aliyun.core.annotation.NameInMap("role_id")
    private String roleId;

    private FilePermissionMember(Builder builder) {
        this.actionList = builder.actionList;
        this.disinheritSubGroup = builder.disinheritSubGroup;
        this.expireTime = builder.expireTime;
        this.identity = builder.identity;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilePermissionMember create() {
        return builder().build();
    }

    /**
     * @return actionList
     */
    public java.util.List<String> getActionList() {
        return this.actionList;
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

    public static final class Builder {
        private java.util.List<String> actionList; 
        private Boolean disinheritSubGroup; 
        private Long expireTime; 
        private Identity identity; 
        private String roleId; 

        /**
         * action_list.
         */
        public Builder actionList(java.util.List<String> actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * disinherit_sub_group.
         */
        public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }

        /**
         * expire_time.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * identity.
         */
        public Builder identity(Identity identity) {
            this.identity = identity;
            return this;
        }

        /**
         * role_id.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public FilePermissionMember build() {
            return new FilePermissionMember(this);
        } 

    } 

}
