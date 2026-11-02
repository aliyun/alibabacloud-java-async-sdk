// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link DeleteUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserProvisioningRequest</p>
 */
public class DeleteUserProvisioningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionStrategy")
    private String deletionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private DeleteUserProvisioningRequest(Builder builder) {
        super(builder);
        this.deletionStrategy = builder.deletionStrategy;
        this.directoryId = builder.directoryId;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserProvisioningRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionStrategy
     */
    public String getDeletionStrategy() {
        return this.deletionStrategy;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<DeleteUserProvisioningRequest, Builder> {
        private String deletionStrategy; 
        private String directoryId; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserProvisioningRequest request) {
            super(request);
            this.deletionStrategy = request.deletionStrategy;
            this.directoryId = request.directoryId;
            this.userProvisioningId = request.userProvisioningId;
        } 

        /**
         * <p>The deletion strategy. The processing strategy for synchronized RAM users when a RAM user synchronization is deleted. Valid values:</p>
         * <ul>
         * <li>Delete: Deletes the RAM users that have been synchronized from CloudSSO to Resource Access Management (RAM) user synchronization is deleted.</li>
         * <li>Keep: Retains the RAM users that have been synchronized from CloudSSO to Resource Access Management (RAM) user synchronization is deleted.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is left empty, the deletion strategy specified when the RAM user synchronization was created is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Delete</p>
         */
        public Builder deletionStrategy(String deletionStrategy) {
            this.putQueryParameter("DeletionStrategy", deletionStrategy);
            this.deletionStrategy = deletionStrategy;
            return this;
        }

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the Resource Access Management (RAM) user synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>up-002axzhapcbz6e63****</p>
         */
        public Builder userProvisioningId(String userProvisioningId) {
            this.putQueryParameter("UserProvisioningId", userProvisioningId);
            this.userProvisioningId = userProvisioningId;
            return this;
        }

        @Override
        public DeleteUserProvisioningRequest build() {
            return new DeleteUserProvisioningRequest(this);
        } 

    } 

}
