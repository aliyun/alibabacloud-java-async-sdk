// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link DeleteUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserRequest</p>
 */
public class DeleteUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferUserId")
    private String transferUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DeleteUserRequest(Builder builder) {
        super(builder);
        this.transferUserId = builder.transferUserId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transferUserId
     */
    public String getTransferUserId() {
        return this.transferUserId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteUserRequest, Builder> {
        private String transferUserId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserRequest request) {
            super(request);
            this.transferUserId = request.transferUserId;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the successor. If not empty, the report resources in the workspace of the deleted user will be transferred to the successor; otherwise, they will be transferred to the space owner.</p>
         * <ul>
         * <li>The successor cannot be an organization visitor</li>
         * <li>The permissions of the successor in the workspace must not be less than those of the deleted user, with management permissions &gt; development permissions &gt; sharing permissions &gt; viewing permissions</li>
         * <li>If the successor is not in the workspace, they will be automatically added to the workspace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>f5****afccd9e434a274</p>
         */
        public Builder transferUserId(String transferUserId) {
            this.putQueryParameter("TransferUserId", transferUserId);
            this.transferUserId = transferUserId;
            return this;
        }

        /**
         * <p>The ID of the user to be deleted. This user ID is the Quick BI UserID, not the Alibaba Cloud UID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteUserRequest build() {
            return new DeleteUserRequest(this);
        } 

    } 

}
