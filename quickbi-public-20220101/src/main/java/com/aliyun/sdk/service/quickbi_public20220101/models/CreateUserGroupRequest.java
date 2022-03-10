// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateUserGroupRequest</p>
 */
public class CreateUserGroupRequest extends Request {
    @Query
    @NameInMap("ParentUserGroupId")
    @Validation(required = true)
    private String parentUserGroupId;

    @Query
    @NameInMap("UserGroupDescription")
    private String userGroupDescription;

    @Query
    @NameInMap("UserGroupId")
    private String userGroupId;

    @Query
    @NameInMap("UserGroupName")
    @Validation(required = true)
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
         * ParentUserGroupId.
         */
        public Builder parentUserGroupId(String parentUserGroupId) {
            this.putQueryParameter("ParentUserGroupId", parentUserGroupId);
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }

        /**
         * UserGroupDescription.
         */
        public Builder userGroupDescription(String userGroupDescription) {
            this.putQueryParameter("UserGroupDescription", userGroupDescription);
            this.userGroupDescription = userGroupDescription;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * UserGroupName.
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
