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
 * {@link GetUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGroupResponseBody</p>
 */
public class GetUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserGroup")
    private UserGroup userGroup;

    private GetUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGroupResponseBody create() {
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
     * @return userGroup
     */
    public UserGroup getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private String requestId; 
        private UserGroup userGroup; 

        private Builder() {
        } 

        private Builder(GetUserGroupResponseBody model) {
            this.requestId = model.requestId;
            this.userGroup = model.userGroup;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1310DBC7-7E1F-55D3-B4B4-E4BE912517FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user group.</p>
         */
        public Builder userGroup(UserGroup userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public GetUserGroupResponseBody build() {
            return new GetUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserGroupResponseBody</p>
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
             * <p>The ID of the identity provider (IdP) for the user group. This parameter is returned when UserGroupType is set to <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relationship of the user group. Valid values:</p>
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
             * <li><p><strong>username</strong>: The username.</p>
             * </li>
             * <li><p><strong>department</strong>: The department.</p>
             * </li>
             * <li><p><strong>email</strong>: The email address.</p>
             * </li>
             * <li><p><strong>telephone</strong>: The mobile phone number.</p>
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
             * <li><p>If UserGroupType is set to <strong>username</strong>, this parameter specifies the value of the username. The value can be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * </li>
             * <li><p>If UserGroupType is set to <strong>department</strong>, this parameter specifies the value of the department. Example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If UserGroupType is set to <strong>email</strong>, this parameter specifies the value of the email address. Example: username\@example.com.</p>
             * </li>
             * <li><p>If UserGroupType is set to <strong>telephone</strong>, this parameter specifies the value of the mobile phone number. Example: 13900001234.</p>
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
     * {@link GetUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserGroupResponseBody</p>
     */
    public static class UserGroup extends TeaModel {
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

        private UserGroup(Builder builder) {
            this.attributes = builder.attributes;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroup create() {
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

            private Builder(UserGroup model) {
                this.attributes = model.attributes;
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.userGroupId = model.userGroupId;
            } 

            /**
             * <p>The collection of user group properties. The properties are evaluated with a logical OR operator.</p>
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
             * <p>The description of the user group.</p>
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

            public UserGroup build() {
                return new UserGroup(this);
            } 

        } 

    }
}
