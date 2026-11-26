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
 * {@link UpdateUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserProvisioningRequest</p>
 */
public class UpdateUserProvisioningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDeletionStrategy")
    private String newDeletionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDuplicationStrategy")
    private String newDuplicationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private UpdateUserProvisioningRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newDeletionStrategy = builder.newDeletionStrategy;
        this.newDescription = builder.newDescription;
        this.newDuplicationStrategy = builder.newDuplicationStrategy;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserProvisioningRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return newDeletionStrategy
     */
    public String getNewDeletionStrategy() {
        return this.newDeletionStrategy;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return newDuplicationStrategy
     */
    public String getNewDuplicationStrategy() {
        return this.newDuplicationStrategy;
    }

    /**
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<UpdateUserProvisioningRequest, Builder> {
        private String directoryId; 
        private String newDeletionStrategy; 
        private String newDescription; 
        private String newDuplicationStrategy; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserProvisioningRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.newDeletionStrategy = request.newDeletionStrategy;
            this.newDescription = request.newDescription;
            this.newDuplicationStrategy = request.newDuplicationStrategy;
            this.userProvisioningId = request.userProvisioningId;
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
         * <p>The new deletion policy. This policy specifies how to handle synchronized Resource Access Management (RAM) users when the Resource Access Management (RAM) user synchronization is deleted. Valid values:</p>
         * <ul>
         * <li>Delete: Delete the users. When the Resource Access Management (RAM) user synchronization is deleted, the system deletes the Resource Access Management (RAM) users that have been synchronized from CloudSSO to Resource Access Management (RAM).</li>
         * <li>Keep: Keep the users. When the Resource Access Management (RAM) user synchronization is deleted, the system retains the Resource Access Management (RAM) users that have been synchronized from CloudSSO to Resource Access Management (RAM).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Delete</p>
         */
        public Builder newDeletionStrategy(String newDeletionStrategy) {
            this.putQueryParameter("NewDeletionStrategy", newDeletionStrategy);
            this.newDeletionStrategy = newDeletionStrategy;
            return this;
        }

        /**
         * <p>The new description of the Resource Access Management (RAM) user synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>description*****</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The new duplication strategy. This strategy specifies how to handle name conflicts when a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists. Valid values:</p>
         * <ul>
         * <li>KeepBoth: Keep both users. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system appends the <code>_sso</code> suffix to the CloudSSO username and attempts to create a RAM user with the new username.</li>
         * <li>TakeOver: Replace the existing user. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system directly replaces the existing RAM user with the synchronized CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepBoth</p>
         */
        public Builder newDuplicationStrategy(String newDuplicationStrategy) {
            this.putQueryParameter("NewDuplicationStrategy", newDuplicationStrategy);
            this.newDuplicationStrategy = newDuplicationStrategy;
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
        public UpdateUserProvisioningRequest build() {
            return new UpdateUserProvisioningRequest(this);
        } 

    } 

}
