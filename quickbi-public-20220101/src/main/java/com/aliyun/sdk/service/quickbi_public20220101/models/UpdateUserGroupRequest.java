// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserGroupRequest</p>
 */
public class UpdateUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupDescription")
    private String userGroupDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupName")
    private String userGroupName;

    private UpdateUserGroupRequest(Builder builder) {
        super(builder);
        this.userGroupDescription = builder.userGroupDescription;
        this.userGroupId = builder.userGroupId;
        this.userGroupName = builder.userGroupName;
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

    public static final class Builder extends Request.Builder<UpdateUserGroupRequest, Builder> {
        private String userGroupDescription; 
        private String userGroupId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGroupRequest request) {
            super(request);
            this.userGroupDescription = request.userGroupDescription;
            this.userGroupId = request.userGroupId;
            this.userGroupName = request.userGroupName;
        } 

        /**
         * The description of the user group.
         * <p>
         * 
         * *   Format verification: Maximum length 255
         * *   Special format verification: Chinese and English digits\_ \ / | () ] \[
         */
        public Builder userGroupDescription(String userGroupDescription) {
            this.putQueryParameter("UserGroupDescription", userGroupDescription);
            this.userGroupDescription = userGroupDescription;
            return this;
        }

        /**
         * The ID of the user group.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * The name of the user group.
         * <p>
         * 
         * *   Format verification: Maximum length 255
         * *   Special format verification: Chinese and English digits\_ \ / | () ] \[
         */
        public Builder userGroupName(String userGroupName) {
            this.putQueryParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        @Override
        public UpdateUserGroupRequest build() {
            return new UpdateUserGroupRequest(this);
        } 

    } 

}
