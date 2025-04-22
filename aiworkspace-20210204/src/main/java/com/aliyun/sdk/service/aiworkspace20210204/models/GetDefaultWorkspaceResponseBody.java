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
 * {@link GetDefaultWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDefaultWorkspaceResponseBody</p>
 */
public class GetDefaultWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<Conditions> conditions;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("EnvTypes")
    private java.util.List<String> envTypes;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private Owner owner;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private GetDefaultWorkspaceResponseBody(Builder builder) {
        this.conditions = builder.conditions;
        this.creator = builder.creator;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.envTypes = builder.envTypes;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.owner = builder.owner;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<Conditions> getConditions() {
        return this.conditions;
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
        private java.util.List<Conditions> conditions; 
        private String creator; 
        private String description; 
        private String displayName; 
        private java.util.List<String> envTypes; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Owner owner; 
        private String requestId; 
        private String status; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(GetDefaultWorkspaceResponseBody model) {
            this.conditions = model.conditions;
            this.creator = model.creator;
            this.description = model.description;
            this.displayName = model.displayName;
            this.envTypes = model.envTypes;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.owner = model.owner;
            this.requestId = model.requestId;
            this.status = model.status;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The conditions of the default workspace in the creation process.</p>
         */
        public Builder conditions(java.util.List<Conditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>17915******4216</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The workspace description.</p>
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
         * <p>The environments of the workspace. Valid values:</p>
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
         * <p>The time when the workspace was created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the workspace was modified, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workspace status. Valid values:</p>
         * <ul>
         * <li>ENABLED</li>
         * <li>INITIALIZING</li>
         * <li>FAILURE</li>
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
         * <p>The workspace name, which is unique in a region.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-example</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public GetDefaultWorkspaceResponseBody build() {
            return new GetDefaultWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDefaultWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDefaultWorkspaceResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Long code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Conditions(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long code; 
            private String message; 
            private String type; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.code = model.code;
                this.message = model.message;
                this.type = model.type;
            } 

            /**
             * <p>The returned status code. HTTP status code 200 indicates that the request was successful. Other HTTP status codes indicate that the request failed.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message. If the returned status code is 200, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Create Failed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>CREATING: The workspace is being created.</li>
             * <li>WORKSPACE_CREATED: The workspace is created.</li>
             * <li>MEMBERS_ADDED: The member is added.</li>
             * <li>ENABLED: The workspace is created and the member is added.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDefaultWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDefaultWorkspaceResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserKp")
        private String userKp;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Owner(Builder builder) {
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
            private String userId; 
            private String userKp; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Owner model) {
                this.userId = model.userId;
                this.userKp = model.userKp;
                this.userName = model.userName;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17915******4216</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17915******4216</p>
             */
            public Builder userKp(String userKp) {
                this.userKp = userKp;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
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
