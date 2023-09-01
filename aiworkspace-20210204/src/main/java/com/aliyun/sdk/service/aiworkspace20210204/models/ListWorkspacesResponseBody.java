// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceLimits")
    private java.util.Map < String, ? > resourceLimits;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Workspaces")
    private java.util.List < Workspaces> workspaces;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceLimits
     */
    public java.util.Map < String, ? > getResourceLimits() {
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
    public java.util.List < Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > resourceLimits; 
        private Long totalCount; 
        private java.util.List < Workspaces> workspaces; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceLimits.
         */
        public Builder resourceLimits(java.util.Map < String, ? > resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Workspaces.
         */
        public Builder workspaces(java.util.List < Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    public static class Workspaces extends TeaModel {
        @NameInMap("AdminNames")
        private java.util.List < String > adminNames;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnvTypes")
        private java.util.List < String > envTypes;

        @NameInMap("ExtraInfos")
        private java.util.Map < String, ? > extraInfos;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Status")
        private String status;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
        private String workspaceName;

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
        public java.util.List < String > getAdminNames() {
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
        public java.util.List < String > getEnvTypes() {
            return this.envTypes;
        }

        /**
         * @return extraInfos
         */
        public java.util.Map < String, ? > getExtraInfos() {
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

        public static final class Builder {
            private java.util.List < String > adminNames; 
            private String creator; 
            private String description; 
            private java.util.List < String > envTypes; 
            private java.util.Map < String, ? > extraInfos; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private Boolean isDefault; 
            private String status; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * AdminNames.
             */
            public Builder adminNames(java.util.List < String > adminNames) {
                this.adminNames = adminNames;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnvTypes.
             */
            public Builder envTypes(java.util.List < String > envTypes) {
                this.envTypes = envTypes;
                return this;
            }

            /**
             * ExtraInfos.
             */
            public Builder extraInfos(java.util.Map < String, ? > extraInfos) {
                this.extraInfos = extraInfos;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
