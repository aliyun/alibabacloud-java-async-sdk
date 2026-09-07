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
 * {@link CreateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateUserGroupRequest</p>
 */
public class CreateUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attributes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Attributes> attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateUserGroupRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public java.util.List<Attributes> getAttributes() {
        return this.attributes;
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

    public static final class Builder extends Request.Builder<CreateUserGroupRequest, Builder> {
        private java.util.List<Attributes> attributes; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserGroupRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The collection of user group attributes. You can specify a maximum of 3,000 attributes. The attributes are combined using a logical OR.</p>
         * <p>This parameter is required.</p>
         */
        public Builder attributes(java.util.List<Attributes> attributes) {
            this.putBodyParameter("Attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>The user group description. The description must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条用户组</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The user group name. The name must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateUserGroupRequest build() {
            return new CreateUserGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateUserGroupRequest</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdpId")
        private Integer idpId;

        @com.aliyun.core.annotation.NameInMap("Relation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relation;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userGroupType;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The ID of the identity provider (IdP) for the user group. This parameter is used when UserGroupType is set to <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relationship for the user group. Valid values:</p>
             * <ul>
             * <li><p><strong>Equal</strong>: Equal to.</p>
             * </li>
             * <li><p><strong>Unequal</strong>: Not equal to.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
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
             * <li><p><strong>email</strong>: Email.</p>
             * </li>
             * <li><p><strong>telephone</strong>: Mobile phone.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * <p>The value of the user group attribute.</p>
             * <ul>
             * <li><p>If UserGroupType is set to <strong>username</strong>, this parameter specifies the username value. The value must be 1 to 128 characters long. It can contain Chinese characters, letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
             * </li>
             * <li><p>If UserGroupType is set to <strong>department</strong>, this parameter specifies the department value. For example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If UserGroupType is set to <strong>email</strong>, this parameter specifies the email address. For example: username\@example.com.</p>
             * </li>
             * <li><p>If UserGroupType is set to <strong>telephone</strong>, this parameter specifies the mobile phone number. For example: 13900001234.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
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
}
