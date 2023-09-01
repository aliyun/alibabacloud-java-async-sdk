// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceResponseBody</p>
 */
public class GetWorkspaceResponseBody extends TeaModel {
    @NameInMap("AdminNames")
    private java.util.List < String > adminNames;

    @NameInMap("Creator")
    private String creator;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisplayName")
    private String displayName;

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

    @NameInMap("Owner")
    private Owner owner;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    @NameInMap("WorkspaceName")
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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
        private String displayName; 
        private java.util.List < String > envTypes; 
        private java.util.Map < String, ? > extraInfos; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Boolean isDefault; 
        private Owner owner; 
        private String requestId; 
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
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * Owner.
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetWorkspaceResponseBody build() {
            return new GetWorkspaceResponseBody(this);
        } 

    } 

    public static class Owner extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserKp")
        private String userKp;

        @NameInMap("UserName")
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

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserKp.
             */
            public Builder userKp(String userKp) {
                this.userKp = userKp;
                return this;
            }

            /**
             * UserName.
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
