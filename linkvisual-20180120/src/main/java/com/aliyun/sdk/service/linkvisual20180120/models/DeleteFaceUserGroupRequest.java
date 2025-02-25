// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceUserGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserGroupRequest</p>
 */
public class DeleteFaceUserGroupRequest extends Request {
    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    private DeleteFaceUserGroupRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceUserGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFaceUserGroupRequest, Builder> {
        private String isolationId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceUserGroupRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.userGroupId = request.userGroupId;
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

        @Override
        public DeleteFaceUserGroupRequest build() {
            return new DeleteFaceUserGroupRequest(this);
        } 

    } 

}
