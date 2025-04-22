// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceResponseBody</p>
 */
public class GetWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdminNames")
    private java.util.List<String> adminNames;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("EnvTypes")
    private java.util.List<String> envTypes;

    @com.aliyun.core.annotation.NameInMap("ExtraInfos")
    private java.util.Map<String, ?> extraInfos;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private Owner owner;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private GetWorkspaceResponseBody(Builder builder) {
        this.adminNames = builder.adminNames;
        this.creator = builder.creator;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.envTypes = builder.envTypes;
        this.extraInfos = builder.extraInfos;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.isDefault = builder.isDefault;
        this.owner = builder.owner;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminNames
     */
    public java.util.List<String> getAdminNames() {
        return this.adminNames;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return envTypes
     */
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    /**
     * @return extraInfos
     */
    public java.util.Map<String, ?> getExtraInfos() {
        return this.extraInfos;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private java.util.List<String> adminNames; 
        private String creator; 
        private String description; 
        private String displayName; 
        private java.util.List<String> envTypes; 
        private java.util.Map<String, ?> extraInfos; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Boolean isDefault; 
        private Owner owner; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(GetWorkspaceResponseBody model) {
            this.adminNames = model.adminNames;
            this.creator = model.creator;
            this.description = model.description;
            this.displayName = model.displayName;
            this.envTypes = model.envTypes;
            this.extraInfos = model.extraInfos;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.isDefault = model.isDefault;
            this.owner = model.owner;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The names of the administrator accounts.</p>
         */
        public Builder adminNames(java.util.List<String> adminNames) {
            this.adminNames = adminNames;
            return this;
        }

        /**
         * <p>The ID of the user who creates the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1157******94123</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace description example</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-example</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The environment information of the workspace.</p>
         * <ul>
         * <li>Workspaces in basic mode can run only in the production environment.</li>
         * <li>Workspaces in standard mode can run in both the development and production environments.</li>
         * </ul>
         */
        public Builder envTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }

        /**
         * <p>The additional information, which only contains the TenantId field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TenantId&quot;: &quot;4286******98&quot;}</p>
         */
        public Builder extraInfos(java.util.Map<String, ?> extraInfos) {
            this.extraInfos = extraInfos;
            return this;
        }

        /**
         * <p>The time when the workspace is created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the workspace is modified, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>Indicates whether the workspace is the default workspace. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The information about the workspace owner. This parameter is valid only when Verbose is set to true.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A0F049F0-8D69-5BAC-8F10-B4DED1B5A34C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwp7rkyq****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The workspace state. Valid values:</p>
         * <ul>
         * <li>ENABLED</li>
         * <li>INITIALIZING</li>
         * <li>FAILURE:</li>
         * <li>DISABLED</li>
         * <li>FROZEN</li>
         * <li>UPDATING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-example</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public GetWorkspaceResponseBody build() {
            return new GetWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserKp")
        private String userKp;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Owner(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
            this.userKp = builder.userKp;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userKp
         */
        public String getUserKp() {
            return this.userKp;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 
            private String userKp; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Owner model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
                this.userKp = model.userKp;
                this.userName = model.userName;
            } 

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>mings****t</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1157******94123</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1157******94123</p>
             */
            public Builder userKp(String userKp) {
                this.userKp = userKp;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>mings****t</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
}
