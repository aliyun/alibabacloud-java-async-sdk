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
 * {@link CreateUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>CreateUserProvisioningRequest</p>
 */
public class CreateUserProvisioningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionStrategy")
    private String deletionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicationStrategy")
    private String duplicationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    private String principalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private CreateUserProvisioningRequest(Builder builder) {
        super(builder);
        this.deletionStrategy = builder.deletionStrategy;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.duplicationStrategy = builder.duplicationStrategy;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserProvisioningRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return duplicationStrategy
     */
    public String getDuplicationStrategy() {
        return this.duplicationStrategy;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateUserProvisioningRequest, Builder> {
        private String deletionStrategy; 
        private String description; 
        private String directoryId; 
        private String duplicationStrategy; 
        private String principalId; 
        private String principalType; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserProvisioningRequest request) {
            super(request);
            this.deletionStrategy = request.deletionStrategy;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.duplicationStrategy = request.duplicationStrategy;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The deletion policy. Specifies the action to take for synchronized Resource Access Management (RAM) users when a Resource Access Management (RAM) user synchronization is deleted. Valid values:</p>
         * <ul>
         * <li>Delete: Delete. When a Resource Access Management (RAM) user synchronization is deleted, the system deletes the Resource Access Management (RAM) users that have been synchronized from CloudSSO to RAM.</li>
         * <li>Keep: Keep. When a Resource Access Management (RAM) user synchronization is deleted, the system retains the Resource Access Management (RAM) users that have been synchronized from CloudSSO to RAM.</li>
         * </ul>
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a user provisioning.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
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
         * <p>The conflict resolution policy. Specifies the action to take when a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists. Valid values:</p>
         * <ul>
         * <li>KeepBoth: Keep both. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system adds the <code>_sso</code> suffix to the username of the CloudSSO user and attempts to create a RAM user with the suffixed username.</li>
         * <li>TakeOver: Take over. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system replaces the existing RAM user with the synchronized CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepBoth</p>
         */
        public Builder duplicationStrategy(String duplicationStrategy) {
            this.putQueryParameter("DuplicationStrategy", duplicationStrategy);
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }

        /**
         * <p>The ID of the identity for the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>When <code>PrincipalType</code> is set to <code>Group</code>, the value is the ID of the CloudSSO group (g-********).</li>
         * <li>When <code>PrincipalType</code> is set to <code>User</code>, the value is the ID of the CloudSSO user (u-********).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>g-02ha881d*****</p>
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>The type of the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>User: The Resource Access Management (RAM) user synchronization is a CloudSSO user.</li>
         * <li>Group: The Resource Access Management (RAM) user synchronization is a CloudSSO group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Group</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>The ID of the destination for the Resource Access Management (RAM) user synchronization. Currently, the value is the ID of the account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1743382******</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the destination for the Resource Access Management (RAM) user synchronization. Currently, the only valid value is <code>RD-Account</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateUserProvisioningRequest build() {
            return new CreateUserProvisioningRequest(this);
        } 

    } 

}
