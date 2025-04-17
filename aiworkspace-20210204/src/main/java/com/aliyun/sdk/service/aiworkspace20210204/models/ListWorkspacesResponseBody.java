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
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceLimits")
    private java.util.Map<String, ?> resourceLimits;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Workspaces")
    private java.util.List<Workspaces> workspaces;

    private ListWorkspacesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceLimits = builder.resourceLimits;
        this.totalCount = builder.totalCount;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceLimits
     */
    public java.util.Map<String, ?> getResourceLimits() {
        return this.resourceLimits;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaces
     */
    public java.util.List<Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> resourceLimits; 
        private Long totalCount; 
        private java.util.List<Workspaces> workspaces; 

        private Builder() {
        } 

        private Builder(ListWorkspacesResponseBody model) {
            this.requestId = model.requestId;
            this.resourceLimits = model.resourceLimits;
            this.totalCount = model.totalCount;
            this.workspaces = model.workspaces;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D7B2E70-F770-505B-A672-09F1D8F2EC1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type and quantity of resources that can be activated in a workspace. This list is returned when the Option is set to GetResourceLimits. Valid values:</p>
         * <ul>
         * <li>MaxCompute_share: pay-as-you-go MaxCompute</li>
         * <li>MaxCompute_isolate: subscription MaxCompute</li>
         * <li>DLC_share: pay-as-you-go DLC</li>
         * <li>PAI_Isolate: subscription PAI</li>
         * <li>PAI_share: pay-as-you-go PAI</li>
         * <li>DataWorks_isolate: subscription DataWorks</li>
         * <li>DataWorks_share: pay-as-you-go DataWorks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;MaxCompute_share&quot;: 1,
         *    &quot;MaxCompute_isolate&quot;: 1,
         *    &quot;DLC_share&quot;: 1
         * }</p>
         */
        public Builder resourceLimits(java.util.Map<String, ?> resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }

        /**
         * <p>The number of workspaces that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of workspace details. This list is returned when Option is set to GetWorkspaces.</p>
         */
        public Builder workspaces(java.util.List<Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Workspaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminNames")
        private java.util.List<String> adminNames;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        private Workspaces(Builder builder) {
            this.adminNames = builder.adminNames;
            this.creator = builder.creator;
            this.description = builder.description;
            this.envTypes = builder.envTypes;
            this.extraInfos = builder.extraInfos;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.isDefault = builder.isDefault;
            this.status = builder.status;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
            return builder().build();
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

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private java.util.List<String> adminNames; 
            private String creator; 
            private String description; 
            private java.util.List<String> envTypes; 
            private java.util.Map<String, ?> extraInfos; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private Boolean isDefault; 
            private String status; 
            private String workspaceId; 
            private String workspaceName; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(Workspaces model) {
                this.adminNames = model.adminNames;
                this.creator = model.creator;
                this.description = model.description;
                this.envTypes = model.envTypes;
                this.extraInfos = model.extraInfos;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.isDefault = model.isDefault;
                this.status = model.status;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The names of the administrator accounts.</p>
             */
            public Builder adminNames(java.util.List<String> adminNames) {
                this.adminNames = adminNames;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>122424353535</p>
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
             * <p>The environment types of the workspace.</p>
             */
            public Builder envTypes(java.util.List<String> envTypes) {
                this.envTypes = envTypes;
                return this;
            }

            /**
             * <p>the additional information. Only contains TenantId.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;TenantId&quot;: &quot;4286******98&quot;}</p>
             */
            public Builder extraInfos(java.util.Map<String, ?> extraInfos) {
                this.extraInfos = extraInfos;
                return this;
            }

            /**
             * <p>The time when the workspace was created. The time (UTC+0) follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ss.SSSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-21T17:12:35.232Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the workspace was modified. The time (UTC+0) follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ss.SSSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-21T17:12:35.232Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>Indicates whether the workspace is the default workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The status of the workspace.</p>
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
             * <p>123</p>
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

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmwp7rky****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
