// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessAssignmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessAssignmentRequest</p>
 */
public class DeleteAccessAssignmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeprovisionStrategy")
    private String deprovisionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

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

    private DeleteAccessAssignmentRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.deprovisionStrategy = builder.deprovisionStrategy;
        this.directoryId = builder.directoryId;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessAssignmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return deprovisionStrategy
     */
    public String getDeprovisionStrategy() {
        return this.deprovisionStrategy;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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

    public static final class Builder extends Request.Builder<DeleteAccessAssignmentRequest, Builder> {
        private String accessConfigurationId; 
        private String deprovisionStrategy; 
        private String directoryId; 
        private String principalId; 
        private String principalType; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessAssignmentRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.deprovisionStrategy = request.deprovisionStrategy;
            this.directoryId = request.directoryId;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * The ID of the access configuration.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * Specifies whether to de-provision the access configuration when you remove the access permissions from the CloudSSO identity. The access configuration is used to assign the access permissions, and the identity is the only one that uses the access configuration and is associated with the account. Valid values:
         * <p>
         * 
         * *   DeprovisionForLastAccessAssignmentOnAccount: de-provisions the access configuration.
         * *   None: does not de-provision the access configuration. This is the default value.
         */
        public Builder deprovisionStrategy(String deprovisionStrategy) {
            this.putQueryParameter("DeprovisionStrategy", deprovisionStrategy);
            this.deprovisionStrategy = deprovisionStrategy;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the CloudSSO identity.
         * <p>
         * 
         * *   If you set `PrincipalType` to `User`, set `PrincipalId` to the ID of the CloudSSO user.
         * *   If you set `PrincipalType` to `Group`, set `PrincipalId` to the ID of the CloudSSO group.
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * The type of the CloudSSO identity. Valid values:
         * <p>
         * 
         * *   User
         * *   Group
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * The ID of the task object.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The type of the task object. Set the value to RD-Account, which specifies the accounts in the resource directory.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public DeleteAccessAssignmentRequest build() {
            return new DeleteAccessAssignmentRequest(this);
        } 

    } 

}
