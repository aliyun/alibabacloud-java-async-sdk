// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>CreateUserProvisioningRequest</p>
 */
public class CreateUserProvisioningRequest extends Request {
    @Query
    @NameInMap("DeletionStrategy")
    private String deletionStrategy;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("DuplicationStrategy")
    private String duplicationStrategy;

    @Query
    @NameInMap("PrincipalId")
    private String principalId;

    @Query
    @NameInMap("PrincipalType")
    private String principalType;

    @Query
    @NameInMap("TargetId")
    private String targetId;

    @Query
    @NameInMap("TargetType")
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
         * The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:
         * <p>
         * 
         * *   Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.
         * *   Keep: When you delete the RAM user provisioning, the system retains the synchronized users.
         */
        public Builder deletionStrategy(String deletionStrategy) {
            this.putQueryParameter("DeletionStrategy", deletionStrategy);
            this.deletionStrategy = deletionStrategy;
            return this;
        }

        /**
         * The description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the resource directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:
         * <p>
         * 
         * *   KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix `_sso`.
         * *   TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.
         */
        public Builder duplicationStrategy(String duplicationStrategy) {
            this.putQueryParameter("DuplicationStrategy", duplicationStrategy);
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }

        /**
         * The identity ID of the RAM user provisioning. Valid values:
         * <p>
         * 
         * *   If you set the `PrincipalType` parameter to `Group`, the value of this parameter is the ID of a CloudSSO user group (g-\*\*\*\*\*\*\*\*).
         * *   If you set the `PrincipalType` parameter to `User`, the value of this parameter is the ID of a CloudSSO user (u-\*\*\*\*\*\*\*\*).
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * The identity type of the RAM user provisioning. Valid values:
         * <p>
         * 
         * *   User: The identity of the RAM user provisioning is a CloudSSO user.
         * *   Group: The identity of the RAM user provisioning is a CloudSSO user group.
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The object for which you create the RAM user provisioning. The value is fixed as `RD-Account`.
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
