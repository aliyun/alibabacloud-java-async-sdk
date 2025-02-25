// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserProvisioningResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserProvisioningResponseBody</p>
 */
public class GetUserProvisioningResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserProvisioning")
    private UserProvisioning userProvisioning;

    private GetUserProvisioningResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioning = builder.userProvisioning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userProvisioning
     */
    public UserProvisioning getUserProvisioning() {
        return this.userProvisioning;
    }

    public static final class Builder {
        private String requestId; 
        private UserProvisioning userProvisioning; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the RAM user provisioning.</p>
         */
        public Builder userProvisioning(UserProvisioning userProvisioning) {
            this.userProvisioning = userProvisioning;
            return this;
        }

        public GetUserProvisioningResponseBody build() {
            return new GetUserProvisioningResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserProvisioningResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserProvisioningResponseBody</p>
     */
    public static class UserProvisioning extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletionStrategy")
        private String deletionStrategy;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DuplicationStrategy")
        private String duplicationStrategy;

        @com.aliyun.core.annotation.NameInMap("OwnerPk")
        private String ownerPk;

        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
        private String userProvisioningId;

        private UserProvisioning(Builder builder) {
            this.createTime = builder.createTime;
            this.deletionStrategy = builder.deletionStrategy;
            this.description = builder.description;
            this.directoryId = builder.directoryId;
            this.duplicationStrategy = builder.duplicationStrategy;
            this.ownerPk = builder.ownerPk;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetPath = builder.targetPath;
            this.targetType = builder.targetType;
            this.updateTime = builder.updateTime;
            this.userProvisioningId = builder.userProvisioningId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProvisioning create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return ownerPk
         */
        public String getOwnerPk() {
            return this.ownerPk;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userProvisioningId
         */
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

        public static final class Builder {
            private String createTime; 
            private String deletionStrategy; 
            private String description; 
            private String directoryId; 
            private String duplicationStrategy; 
            private String ownerPk; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String status; 
            private String targetId; 
            private String targetName; 
            private String targetPath; 
            private String targetType; 
            private String updateTime; 
            private String userProvisioningId; 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</li>
             * <li>Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Delete</p>
             */
            public Builder deletionStrategy(String deletionStrategy) {
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
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-003qew84****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
             * <ul>
             * <li>KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix <code>_sso</code>.</li>
             * <li>TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KeepBoth</p>
             */
            public Builder duplicationStrategy(String duplicationStrategy) {
                this.duplicationStrategy = duplicationStrategy;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource directory belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1639738******</p>
             */
            public Builder ownerPk(String ownerPk) {
                this.ownerPk = ownerPk;
                return this;
            }

            /**
             * <p>The identity ID of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user group (g-********).</li>
             * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user (u-********).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>g-02ha881d*****</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The identity name of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the name of a CloudSSO user group.</li>
             * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the name of a CloudSSO user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testGroupName</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The identity type of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>User: indicates that the identity of the RAM user provisioning is a CloudSSO user.</li>
             * <li>Group: indicates that the identity of the RAM user provisioning is a CloudSSO user group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Group</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>The status of the RAM user provisioning. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>1743382******</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the object for which you create the RAM user provisioning. The value is fixed as the name of the member in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>testRdMember</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The path of the resource directory in which you create the RAM user provisioning for the member.</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The object for which you create the RAM user provisioning. The value is fixed as <code>RD-Account</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>RD-Account</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the RAM user provisioning.</p>
             * 
             * <strong>example:</strong>
             * <p>up-002axzhapcbz6e63****</p>
             */
            public Builder userProvisioningId(String userProvisioningId) {
                this.userProvisioningId = userProvisioningId;
                return this;
            }

            public UserProvisioning build() {
                return new UserProvisioning(this);
            } 

        } 

    }
}
