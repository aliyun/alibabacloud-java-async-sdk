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
 * {@link Membership} extends {@link TeaModel}
 *
 * <p>Membership</p>
 */
public class Membership extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("group_id")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("member_role")
    private String memberRole;

    @com.aliyun.core.annotation.NameInMap("member_type")
    private String memberType;

    @com.aliyun.core.annotation.NameInMap("sub_group_id")
    private String subGroupId;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private Membership(Builder builder) {
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.groupId = builder.groupId;
        this.memberRole = builder.memberRole;
        this.memberType = builder.memberType;
        this.subGroupId = builder.subGroupId;
        this.updatedAt = builder.updatedAt;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Membership create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return memberRole
     */
    public String getMemberRole() {
        return this.memberRole;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    /**
     * @return subGroupId
     */
    public String getSubGroupId() {
        return this.subGroupId;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Long createdAt; 
        private String creator; 
        private String description; 
        private String domainId; 
        private String groupId; 
        private String memberRole; 
        private String memberType; 
        private String subGroupId; 
        private Long updatedAt; 
        private String userId; 

        private Builder() {
        } 

        private Builder(Membership model) {
            this.createdAt = model.createdAt;
            this.creator = model.creator;
            this.description = model.description;
            this.domainId = model.domainId;
            this.groupId = model.groupId;
            this.memberRole = model.memberRole;
            this.memberType = model.memberType;
            this.subGroupId = model.subGroupId;
            this.updatedAt = model.updatedAt;
            this.userId = model.userId;
        } 

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * group_id.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * member_role.
         */
        public Builder memberRole(String memberRole) {
            this.memberRole = memberRole;
            return this;
        }

        /**
         * member_type.
         */
        public Builder memberType(String memberType) {
            this.memberType = memberType;
            return this;
        }

        /**
         * sub_group_id.
         */
        public Builder subGroupId(String subGroupId) {
            this.subGroupId = subGroupId;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Membership build() {
            return new Membership(this);
        } 

    } 

}
