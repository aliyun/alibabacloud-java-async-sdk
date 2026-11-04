// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link AddFaceUserToUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserToUserGroupRequest</p>
 */
public class AddFaceUserToUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account.</p>
         * <blockquote>
         * <p>Notice: 
         * The user and the user group must be under the same isolation ID. Make sure that this parameter is consistent with the <strong>IsolationId</strong> parameter that you specified when you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user and the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to create the user group.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The user group ID. Set this parameter to the user group ID that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to create the user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kvjy****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>The user ID. Set this parameter to the user ID that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3mtjaqebeq4d****</p>
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
