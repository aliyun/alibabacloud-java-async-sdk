// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Role} extends {@link TeaModel}
 *
 * <p>Role</p>
 */
public class Role extends TeaModel {
    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("IsPredefined")
    private Integer isPredefined;

    @NameInMap("Name")
    private String name;

    @NameInMap("PrincipalArn")
    private String principalArn;

    @NameInMap("UpdateTime")
    private Long updateTime;

    @NameInMap("Users")
    private java.util.List < Principal > users;

    private Role(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.isPredefined = builder.isPredefined;
        this.name = builder.name;
        this.principalArn = builder.principalArn;
        this.updateTime = builder.updateTime;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Role create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return isPredefined
     */
    public Integer getIsPredefined() {
        return this.isPredefined;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return principalArn
     */
    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return users
     */
    public java.util.List < Principal > getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String displayName; 
        private Integer isPredefined; 
        private String name; 
        private String principalArn; 
        private Long updateTime; 
        private java.util.List < Principal > users; 

        /**
         * CreateTime
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 角色描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * IsPredefined
         */
        public Builder isPredefined(Integer isPredefined) {
            this.isPredefined = isPredefined;
            return this;
        }

        /**
         * name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PrincipalArn
         */
        public Builder principalArn(String principalArn) {
            this.principalArn = principalArn;
            return this;
        }

        /**
         * UpdateTime
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < Principal > users) {
            this.users = users;
            return this;
        }

        public Role build() {
            return new Role(this);
        } 

    } 

}
