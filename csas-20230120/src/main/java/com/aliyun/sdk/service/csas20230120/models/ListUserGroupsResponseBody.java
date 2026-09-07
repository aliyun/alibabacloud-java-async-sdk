// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListUserGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsResponseBody</p>
 */
public class ListUserGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("UserGroups")
    private java.util.List<UserGroups> userGroups;

    private ListUserGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.userGroups = builder.userGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return userGroups
     */
    public java.util.List<UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalNum; 
        private java.util.List<UserGroups> userGroups; 

        private Builder() {
        } 

        private Builder(ListUserGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.userGroups = model.userGroups;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4AB972E2-D702-5464-B132-B1911498B8BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>A list of user groups.</p>
         */
        public Builder userGroups(java.util.List<UserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public ListUserGroupsResponseBody build() {
            return new ListUserGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdpId")
        private Integer idpId;

        @com.aliyun.core.annotation.NameInMap("Relation")
        private String relation;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        private String userGroupType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Attributes(Builder builder) {
            this.idpId = builder.idpId;
            this.relation = builder.relation;
            this.userGroupType = builder.userGroupType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return idpId
         */
        public Integer getIdpId() {
            return this.idpId;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        /**
         * @return userGroupType
         */
        public String getUserGroupType() {
            return this.userGroupType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer idpId; 
            private String relation; 
            private String userGroupType; 
            private String value; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.idpId = model.idpId;
                this.relation = model.relation;
                this.userGroupType = model.userGroupType;
                this.value = model.value;
            } 

            /**
             * <p>The identity provider ID for the user group. This parameter appears only when the user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relation for the user group. Valid values:</p>
             * <ul>
             * <li><p><strong>Equal</strong>: Equal to.</p>
             * </li>
             * <li><p><strong>Unequal</strong>: Not equal to.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Equal</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * <p>The type of the user group. Valid values:</p>
             * <ul>
             * <li><p><strong>username</strong>: Username.</p>
             * </li>
             * <li><p><strong>department</strong>: Department.</p>
             * </li>
             * <li><p><strong>email</strong>: Email address.</p>
             * </li>
             * <li><p><strong>telephone</strong>: Phone number.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * <p>The value of the user group property.</p>
             * <ul>
             * <li><p>If the user group type is <strong>username</strong>, this is the username. The value must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), and hyphens (-). It supports both uppercase and lowercase letters and Chinese characters.</p>
             * </li>
             * <li><p>If the user group type is <strong>department</strong>, this is the department name. Example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If the user group type is <strong>email</strong>, this is the email address. Example: username\@example.com.</p>
             * </li>
             * <li><p>If the user group type is <strong>telephone</strong>, this is the phone number. Example: 13900001234.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OU=部门1,OU=SASE钉钉</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private UserGroups(Builder builder) {
            this.attributes = builder.attributes;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private String createTime; 
            private String description; 
            private String name; 
            private String userGroupId; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.attributes = model.attributes;
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.userGroupId = model.userGroupId;
            } 

            /**
             * <p>A collection of user group properties. Multiple properties are combined with OR logic.</p>
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The time when the user group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-10 11:39:22</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>A description of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条用户组</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>user_group_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>usergroup-6f1ef2fc56b6****</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}
