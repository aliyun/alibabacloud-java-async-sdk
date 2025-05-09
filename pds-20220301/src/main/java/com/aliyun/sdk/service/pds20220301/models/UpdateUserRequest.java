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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_info_list")
    private java.util.List<GroupInfoList> groupInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nick_name")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nickName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_data")
    private java.util.Map<String, String> userData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String userId;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.avatar = builder.avatar;
        this.description = builder.description;
        this.email = builder.email;
        this.groupInfoList = builder.groupInfoList;
        this.nickName = builder.nickName;
        this.phone = builder.phone;
        this.role = builder.role;
        this.status = builder.status;
        this.userData = builder.userData;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return groupInfoList
     */
    public java.util.List<GroupInfoList> getGroupInfoList() {
        return this.groupInfoList;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userData
     */
    public java.util.Map<String, String> getUserData() {
        return this.userData;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String domainId; 
        private String avatar; 
        private String description; 
        private String email; 
        private java.util.List<GroupInfoList> groupInfoList; 
        private String nickName; 
        private String phone; 
        private String role; 
        private String status; 
        private java.util.Map<String, String> userData; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.avatar = request.avatar;
            this.description = request.description;
            this.email = request.email;
            this.groupInfoList = request.groupInfoList;
            this.nickName = request.nickName;
            this.phone = request.phone;
            this.role = request.role;
            this.status = request.status;
            this.userData = request.userData;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The URL of the profile picture.</p>
         * <p>If you specify the parameter in the HTTP URL format, the URL must start with http:// or https:// and can be up to 4 KB in size.</p>
         * <p>If you specify the parameter in the DATA URL format, the URL must start with data:// and be encoded in Base64. The URL can be up to 300 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://a.b.c/pds.jpg">http://a.b.c/pds.jpg</a></p>
         */
        public Builder avatar(String avatar) {
            this.putBodyParameter("avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>The description of the user. The description can be up to 1,024 characters in length.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:a@aliyunpds.com">a@aliyunpds.com</a></p>
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The information about the group.</p>
         */
        public Builder groupInfoList(java.util.List<GroupInfoList> groupInfoList) {
            this.putBodyParameter("group_info_list", groupInfoList);
            this.groupInfoList = groupInfoList;
            return this;
        }

        /**
         * <p>The nickname of the user. The nickname can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>pdsuer</p>
         */
        public Builder nickName(String nickName) {
            this.putBodyParameter("nick_name", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The mobile number of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>13900001111</p>
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>The role of the user. Valid values:</p>
         * <ul>
         * <li>superadmin</li>
         * <li>admin</li>
         * <li>user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder role(String role) {
            this.putBodyParameter("role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The state of the user. Valid values:</p>
         * <ul>
         * <li>disabled: The user is prohibited from logon.</li>
         * <li>enabled: The user is in a normal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The custom data. The data can be up to 1,024 characters in length.</p>
         */
        public Builder userData(java.util.Map<String, String> userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The user ID. The ID can be up to 64 characters in length and cannot contain a number sign (#).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserRequest</p>
     */
    public static class GroupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("group_id")
        private String groupId;

        private GroupInfoList(Builder builder) {
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfoList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private String groupId; 

            private Builder() {
            } 

            private Builder(GroupInfoList model) {
                this.groupId = model.groupId;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g123</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public GroupInfoList build() {
                return new GroupInfoList(this);
            } 

        } 

    }
}
