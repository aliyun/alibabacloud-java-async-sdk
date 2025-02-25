// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Role} extends {@link TeaModel}
 *
 * <p>Role</p>
 */
public class Role extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("IsPredefined")
    private Integer isPredefined;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PrincipalArn")
    private String principalArn;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    @com.aliyun.core.annotation.NameInMap("Users")
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
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * IsPredefined.
         */
        public Builder isPredefined(Integer isPredefined) {
            this.isPredefined = isPredefined;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PrincipalArn.
         */
        public Builder principalArn(String principalArn) {
            this.principalArn = principalArn;
            return this;
        }

        /**
         * UpdateTime.
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
