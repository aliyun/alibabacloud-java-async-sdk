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
 * {@link DeleteFaceUserGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserGroupRequest</p>
 */
public class DeleteFaceUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. This value must be the same as the <strong>IsolationId</strong> specified when you call the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to add a user.</p>
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
         * <p>The ID of the user group. Specify the user group ID that you obtained and saved locally after calling the <a href="https://help.aliyun.com/document_detail/288341.html">AddFaceUserGroup</a> operation to add the user group.</p>
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

        @Override
        public DeleteFaceUserGroupRequest build() {
            return new DeleteFaceUserGroupRequest(this);
        } 

    } 

}
