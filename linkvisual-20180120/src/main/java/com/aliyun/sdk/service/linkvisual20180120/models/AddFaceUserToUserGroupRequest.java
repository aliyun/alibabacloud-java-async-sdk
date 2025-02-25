// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserToUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserToUserGroupRequest</p>
 */
public class AddFaceUserToUserGroupRequest extends Request {
    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private AddFaceUserToUserGroupRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userGroupId = builder.userGroupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceUserToUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddFaceUserToUserGroupRequest, Builder> {
        private String isolationId; 
        private String userGroupId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceUserToUserGroupRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.userGroupId = request.userGroupId;
            this.userId = request.userId;
        } 

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddFaceUserToUserGroupRequest build() {
            return new AddFaceUserToUserGroupRequest(this);
        } 

    } 

}
