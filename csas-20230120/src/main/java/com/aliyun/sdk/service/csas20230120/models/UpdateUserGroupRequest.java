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
 * {@link UpdateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserGroupRequest</p>
 */
public class UpdateUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.List<Attributes> attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private UpdateUserGroupRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.description = builder.description;
        this.modifyType = builder.modifyType;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserGroupRequest create() {
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
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateUserGroupRequest, Builder> {
        private java.util.List<Attributes> attributes; 
        private String description; 
        private String modifyType; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGroupRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.description = request.description;
            this.modifyType = request.modifyType;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The set of user group attributes. The maximum total number is 3000. Multiple user group attributes have an OR relationship and take effect as a union.</p>
         */
        public Builder attributes(java.util.List<Attributes> attributes) {
            this.putBodyParameter("Attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>The description of the user group. The description must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
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
         * <p>The modification type of the user group. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong> (default): overwrites the original user group attribute set with the value of the <strong>Attributes</strong> parameter.</li>
         * <li><strong>Append</strong>: separately appends the values entered in the <strong>Attributes</strong> parameter to the user group attribute set.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The ID of the user group. Value sources:</p>
         * <ul>
         * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: queries user groups in batches.</li>
         * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: creates a user group.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public UpdateUserGroupRequest build() {
            return new UpdateUserGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserGroupRequest</p>
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
             * <p>The identity provider ID of the user group. This value exists when the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relation of the user group. Valid values:</p>
             * <ul>
             * <li><strong>Equal</strong>: equal to.</li>
             * <li><strong>Unequal</strong>: not equal to.</li>
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
             * <li><strong>username</strong>: username.</li>
             * <li><strong>department</strong>: department.</li>
             * <li><strong>email</strong>: email.</li>
             * <li><strong>telephone</strong>: mobile phone.</li>
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
             * <li>If the user group type is <strong>username</strong>, this parameter indicates the username value. The value must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (*), at signs (@), and spaces.</li>
             * <li>If the user group type is <strong>department</strong>, this parameter indicates the department value. Example: OU=Department1,OU=SASEDingTalk.</li>
             * <li>If the user group type is <strong>email</strong>, this parameter indicates the email value. Example: <a href="mailto:username@example.com">username@example.com</a>.</li>
             * <li>If the user group type is <strong>telephone</strong>, this parameter indicates the mobile phone value. Example: 13900001234.</li>
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
