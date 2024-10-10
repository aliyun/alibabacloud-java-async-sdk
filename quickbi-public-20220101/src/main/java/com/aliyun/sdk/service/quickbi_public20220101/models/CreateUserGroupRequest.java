// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentUserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentUserGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupDescription")
    private String userGroupDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupName;

    private CreateUserGroupRequest(Builder builder) {
        super(builder);
        this.parentUserGroupId = builder.parentUserGroupId;
        this.userGroupDescription = builder.userGroupDescription;
        this.userGroupId = builder.userGroupId;
        this.userGroupName = builder.userGroupName;
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
     * @return parentUserGroupId
     */
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    /**
     * @return userGroupDescription
     */
    public String getUserGroupDescription() {
        return this.userGroupDescription;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public static final class Builder extends Request.Builder<CreateUserGroupRequest, Builder> {
        private String parentUserGroupId; 
        private String userGroupDescription; 
        private String userGroupId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserGroupRequest request) {
            super(request);
            this.parentUserGroupId = request.parentUserGroupId;
            this.userGroupDescription = request.userGroupDescription;
            this.userGroupId = request.userGroupId;
            this.userGroupName = request.userGroupName;
        } 

        /**
         * <p>The ID of the parent user group. You can add new user groups to this group:</p>
         * <ul>
         * <li>If you enter the ID of a parent user group, the new user group is added to the user group with the ID.</li>
         * <li>If you enter -1, the new user group is added to the root directory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
         */
        public Builder parentUserGroupId(String parentUserGroupId) {
            this.putQueryParameter("ParentUserGroupId", parentUserGroupId);
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }

        /**
         * <p>The description of the user group.</p>
         * <ul>
         * <li>Format verification: Maximum length 255</li>
         * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User group description</p>
         */
        public Builder userGroupDescription(String userGroupDescription) {
            this.putQueryParameter("UserGroupDescription", userGroupDescription);
            this.userGroupDescription = userGroupDescription;
            return this;
        }

        /**
         * <p>The unique ID of the user group.</p>
         * <ul>
         * <li>If you specify the UserGroupId parameter, the system automatically generates the UserGroupId parameter. If you specify the UserGroupId parameter, the user ID is used as the user group ID. You must ensure that the user ID is unique within the organization.</li>
         * <li>Format verification: Maximum length 64, cannot be -1,</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pop0001</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>The name of the RAM user group.</p>
         * <ul>
         * <li>Format verification: Maximum length 255</li>
         * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Financial Report</p>
         */
        public Builder userGroupName(String userGroupName) {
            this.putQueryParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        @Override
        public CreateUserGroupRequest build() {
            return new CreateUserGroupRequest(this);
        } 

    } 

}
