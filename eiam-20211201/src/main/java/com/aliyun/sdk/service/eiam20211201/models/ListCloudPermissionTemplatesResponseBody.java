// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListCloudPermissionTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudPermissionTemplatesResponseBody</p>
 */
public class ListCloudPermissionTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplates")
    private java.util.List<CloudPermissionTemplates> cloudPermissionTemplates;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCloudPermissionTemplatesResponseBody(Builder builder) {
        this.cloudPermissionTemplates = builder.cloudPermissionTemplates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudPermissionTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudPermissionTemplates
     */
    public java.util.List<CloudPermissionTemplates> getCloudPermissionTemplates() {
        return this.cloudPermissionTemplates;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CloudPermissionTemplates> cloudPermissionTemplates; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudPermissionTemplatesResponseBody model) {
            this.cloudPermissionTemplates = model.cloudPermissionTemplates;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of cloud permission templates.</p>
         */
        public Builder cloudPermissionTemplates(java.util.List<CloudPermissionTemplates> cloudPermissionTemplates) {
            this.cloudPermissionTemplates = cloudPermissionTemplates;
            return this;
        }

        /**
         * <p>The maximum number of items per page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned by the current call for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudPermissionTemplatesResponseBody build() {
            return new ListCloudPermissionTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudPermissionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudPermissionTemplatesResponseBody</p>
     */
    public static class ApplicableScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List<String> groupIds;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
        private java.util.List<String> organizationalUnitIds;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private ApplicableScope(Builder builder) {
            this.groupIds = builder.groupIds;
            this.organizationalUnitIds = builder.organizationalUnitIds;
            this.scopeType = builder.scopeType;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicableScope create() {
            return builder().build();
        }

        /**
         * @return groupIds
         */
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        /**
         * @return organizationalUnitIds
         */
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> groupIds; 
            private java.util.List<String> organizationalUnitIds; 
            private String scopeType; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(ApplicableScope model) {
                this.groupIds = model.groupIds;
                this.organizationalUnitIds = model.organizationalUnitIds;
                this.scopeType = model.scopeType;
                this.userIds = model.userIds;
            } 

            /**
             * <p>The list of specified group IDs. This parameter has a value only when ScopeType is set to custom.</p>
             */
            public Builder groupIds(java.util.List<String> groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * <p>The list of specified organizational unit IDs. This parameter has a value only when ScopeType is set to custom.</p>
             */
            public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
                this.organizationalUnitIds = organizationalUnitIds;
                return this;
            }

            /**
             * <p>The type of the applicable scope. Valid values: global and custom.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The list of specified user IDs. This parameter has a value only when ScopeType is set to custom.</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public ApplicableScope build() {
                return new ApplicableScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudPermissionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudPermissionTemplatesResponseBody</p>
     */
    public static class CloudPermissionTemplateCreator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CreatorType")
        private String creatorType;

        private CloudPermissionTemplateCreator(Builder builder) {
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.creatorType = builder.creatorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudPermissionTemplateCreator create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return creatorType
         */
        public String getCreatorType() {
            return this.creatorType;
        }

        public static final class Builder {
            private String creatorId; 
            private String creatorName; 
            private String creatorType; 

            private Builder() {
            } 

            private Builder(CloudPermissionTemplateCreator model) {
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.creatorType = model.creatorType;
            } 

            /**
             * <p>The identity identifier of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>user_01kmek49aq4r8gxxxx</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The type of the creator. Valid values: idaas_admin and idaas_user.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_user</p>
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            public CloudPermissionTemplateCreator build() {
                return new CloudPermissionTemplateCreator(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudPermissionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudPermissionTemplatesResponseBody</p>
     */
    public static class CloudPermissionTemplateInitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private CloudPermissionTemplateInitResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudPermissionTemplateInitResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String result; 

            private Builder() {
            } 

            private Builder(CloudPermissionTemplateInitResult model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.result = model.result;
            } 

            /**
             * <p>The error code returned when initialization fails.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudPermissionTemplate.AsyncInitError</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when initialization fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Permission template initialization failed. Try again later</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The initialization result. Valid values: success and failed.</p>
             * 
             * <strong>example:</strong>
             * <p>failed</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public CloudPermissionTemplateInitResult build() {
                return new CloudPermissionTemplateInitResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudPermissionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudPermissionTemplatesResponseBody</p>
     */
    public static class CloudPermissionTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowRequest")
        private Boolean allowRequest;

        @com.aliyun.core.annotation.NameInMap("ApplicableScope")
        private ApplicableScope applicableScope;

        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateCreator")
        private CloudPermissionTemplateCreator cloudPermissionTemplateCreator;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateId")
        private String cloudPermissionTemplateId;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateInitResult")
        private CloudPermissionTemplateInitResult cloudPermissionTemplateInitResult;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateName")
        private String cloudPermissionTemplateName;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateOwnerId")
        private String cloudPermissionTemplateOwnerId;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateOwnerType")
        private String cloudPermissionTemplateOwnerType;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateSharingMode")
        private String cloudPermissionTemplateSharingMode;

        @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateUsageType")
        private String cloudPermissionTemplateUsageType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PermissionEntityExternalId")
        private String permissionEntityExternalId;

        @com.aliyun.core.annotation.NameInMap("PermissionEntityId")
        private String permissionEntityId;

        @com.aliyun.core.annotation.NameInMap("PermissionEntityType")
        private String permissionEntityType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private CloudPermissionTemplates(Builder builder) {
            this.allowRequest = builder.allowRequest;
            this.applicableScope = builder.applicableScope;
            this.cloudAccountId = builder.cloudAccountId;
            this.cloudPermissionTemplateCreator = builder.cloudPermissionTemplateCreator;
            this.cloudPermissionTemplateId = builder.cloudPermissionTemplateId;
            this.cloudPermissionTemplateInitResult = builder.cloudPermissionTemplateInitResult;
            this.cloudPermissionTemplateName = builder.cloudPermissionTemplateName;
            this.cloudPermissionTemplateOwnerId = builder.cloudPermissionTemplateOwnerId;
            this.cloudPermissionTemplateOwnerType = builder.cloudPermissionTemplateOwnerType;
            this.cloudPermissionTemplateSharingMode = builder.cloudPermissionTemplateSharingMode;
            this.cloudPermissionTemplateUsageType = builder.cloudPermissionTemplateUsageType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.permissionEntityExternalId = builder.permissionEntityExternalId;
            this.permissionEntityId = builder.permissionEntityId;
            this.permissionEntityType = builder.permissionEntityType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudPermissionTemplates create() {
            return builder().build();
        }

        /**
         * @return allowRequest
         */
        public Boolean getAllowRequest() {
            return this.allowRequest;
        }

        /**
         * @return applicableScope
         */
        public ApplicableScope getApplicableScope() {
            return this.applicableScope;
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return cloudPermissionTemplateCreator
         */
        public CloudPermissionTemplateCreator getCloudPermissionTemplateCreator() {
            return this.cloudPermissionTemplateCreator;
        }

        /**
         * @return cloudPermissionTemplateId
         */
        public String getCloudPermissionTemplateId() {
            return this.cloudPermissionTemplateId;
        }

        /**
         * @return cloudPermissionTemplateInitResult
         */
        public CloudPermissionTemplateInitResult getCloudPermissionTemplateInitResult() {
            return this.cloudPermissionTemplateInitResult;
        }

        /**
         * @return cloudPermissionTemplateName
         */
        public String getCloudPermissionTemplateName() {
            return this.cloudPermissionTemplateName;
        }

        /**
         * @return cloudPermissionTemplateOwnerId
         */
        public String getCloudPermissionTemplateOwnerId() {
            return this.cloudPermissionTemplateOwnerId;
        }

        /**
         * @return cloudPermissionTemplateOwnerType
         */
        public String getCloudPermissionTemplateOwnerType() {
            return this.cloudPermissionTemplateOwnerType;
        }

        /**
         * @return cloudPermissionTemplateSharingMode
         */
        public String getCloudPermissionTemplateSharingMode() {
            return this.cloudPermissionTemplateSharingMode;
        }

        /**
         * @return cloudPermissionTemplateUsageType
         */
        public String getCloudPermissionTemplateUsageType() {
            return this.cloudPermissionTemplateUsageType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return permissionEntityExternalId
         */
        public String getPermissionEntityExternalId() {
            return this.permissionEntityExternalId;
        }

        /**
         * @return permissionEntityId
         */
        public String getPermissionEntityId() {
            return this.permissionEntityId;
        }

        /**
         * @return permissionEntityType
         */
        public String getPermissionEntityType() {
            return this.permissionEntityType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean allowRequest; 
            private ApplicableScope applicableScope; 
            private String cloudAccountId; 
            private CloudPermissionTemplateCreator cloudPermissionTemplateCreator; 
            private String cloudPermissionTemplateId; 
            private CloudPermissionTemplateInitResult cloudPermissionTemplateInitResult; 
            private String cloudPermissionTemplateName; 
            private String cloudPermissionTemplateOwnerId; 
            private String cloudPermissionTemplateOwnerType; 
            private String cloudPermissionTemplateSharingMode; 
            private String cloudPermissionTemplateUsageType; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private String permissionEntityExternalId; 
            private String permissionEntityId; 
            private String permissionEntityType; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(CloudPermissionTemplates model) {
                this.allowRequest = model.allowRequest;
                this.applicableScope = model.applicableScope;
                this.cloudAccountId = model.cloudAccountId;
                this.cloudPermissionTemplateCreator = model.cloudPermissionTemplateCreator;
                this.cloudPermissionTemplateId = model.cloudPermissionTemplateId;
                this.cloudPermissionTemplateInitResult = model.cloudPermissionTemplateInitResult;
                this.cloudPermissionTemplateName = model.cloudPermissionTemplateName;
                this.cloudPermissionTemplateOwnerId = model.cloudPermissionTemplateOwnerId;
                this.cloudPermissionTemplateOwnerType = model.cloudPermissionTemplateOwnerType;
                this.cloudPermissionTemplateSharingMode = model.cloudPermissionTemplateSharingMode;
                this.cloudPermissionTemplateUsageType = model.cloudPermissionTemplateUsageType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.permissionEntityExternalId = model.permissionEntityExternalId;
                this.permissionEntityId = model.permissionEntityId;
                this.permissionEntityType = model.permissionEntityType;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Specifies whether users are allowed to apply for the permission template.</p>
             */
            public Builder allowRequest(Boolean allowRequest) {
                this.allowRequest = allowRequest;
                return this;
            }

            /**
             * <p>The applicable scope of the permission template.</p>
             */
            public Builder applicableScope(ApplicableScope applicableScope) {
                this.applicableScope = applicableScope;
                return this;
            }

            /**
             * <p>The ID of the cloud account to which the template belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>The creator information of the permission template.</p>
             */
            public Builder cloudPermissionTemplateCreator(CloudPermissionTemplateCreator cloudPermissionTemplateCreator) {
                this.cloudPermissionTemplateCreator = cloudPermissionTemplateCreator;
                return this;
            }

            /**
             * <p>The unique identifier of the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>cpt_01l8dagf2iablhigj75l1n99xxxxx</p>
             */
            public Builder cloudPermissionTemplateId(String cloudPermissionTemplateId) {
                this.cloudPermissionTemplateId = cloudPermissionTemplateId;
                return this;
            }

            /**
             * <p>The initialization result. This parameter is returned only when the status is init_failed.</p>
             */
            public Builder cloudPermissionTemplateInitResult(CloudPermissionTemplateInitResult cloudPermissionTemplateInitResult) {
                this.cloudPermissionTemplateInitResult = cloudPermissionTemplateInitResult;
                return this;
            }

            /**
             * <p>The name of the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>AdminAccessTemplate</p>
             */
            public Builder cloudPermissionTemplateName(String cloudPermissionTemplateName) {
                this.cloudPermissionTemplateName = cloudPermissionTemplateName;
                return this;
            }

            /**
             * <p>The ID of the application to which the exclusive template belongs. This parameter is empty for shared templates.</p>
             * 
             * <strong>example:</strong>
             * <p>user_01kexamplexxxx</p>
             */
            public Builder cloudPermissionTemplateOwnerId(String cloudPermissionTemplateOwnerId) {
                this.cloudPermissionTemplateOwnerId = cloudPermissionTemplateOwnerId;
                return this;
            }

            /**
             * <p>The owner type of the exclusive template. Valid values: application (M2M applications) and user (human users). This parameter is empty for shared templates.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder cloudPermissionTemplateOwnerType(String cloudPermissionTemplateOwnerType) {
                this.cloudPermissionTemplateOwnerType = cloudPermissionTemplateOwnerType;
                return this;
            }

            /**
             * <p>The sharing mode of the permission template. Valid values: shared and exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>shared</p>
             */
            public Builder cloudPermissionTemplateSharingMode(String cloudPermissionTemplateSharingMode) {
                this.cloudPermissionTemplateSharingMode = cloudPermissionTemplateSharingMode;
                return this;
            }

            /**
             * <p>The usage type of the permission template. Valid values: user (privilege escalation for human users) and application (privilege escalation for M2M applications).</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder cloudPermissionTemplateUsageType(String cloudPermissionTemplateUsageType) {
                this.cloudPermissionTemplateUsageType = cloudPermissionTemplateUsageType;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>Administrator permission template for managing cloud accounts</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The external unique identifier of the associated cloud role, which is the role ARN on the cloud provider side.</p>
             * 
             * <strong>example:</strong>
             * <p>ReadOnlyAccess</p>
             */
            public Builder permissionEntityExternalId(String permissionEntityExternalId) {
                this.permissionEntityExternalId = permissionEntityExternalId;
                return this;
            }

            /**
             * <p>The ID of the associated CloudAccountRole.</p>
             * 
             * <strong>example:</strong>
             * <p>carole_01kmek49aq4r8gxxxx</p>
             */
            public Builder permissionEntityId(String permissionEntityId) {
                this.permissionEntityId = permissionEntityId;
                return this;
            }

            /**
             * <p>The type of the permission entity. Fixed value: cloud_account_role.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_account_role</p>
             */
            public Builder permissionEntityType(String permissionEntityType) {
                this.permissionEntityType = permissionEntityType;
                return this;
            }

            /**
             * <p>The status of the permission template. Valid values: initializing, init_failed, enabled, and disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830227000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CloudPermissionTemplates build() {
                return new CloudPermissionTemplates(this);
            } 

        } 

    }
}
