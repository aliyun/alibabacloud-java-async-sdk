// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentWorkspaceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataAgentWorkspaceInfoResponseBody</p>
 */
public class GetDataAgentWorkspaceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataAgentWorkspaceInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentWorkspaceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataAgentWorkspaceInfoResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DMS-DA-40114</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0D2-*****-A63B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataAgentWorkspaceInfoResponseBody build() {
            return new GetDataAgentWorkspaceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataAgentWorkspaceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAgentWorkspaceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("IsSessionShareEnabled")
        private Boolean isSessionShareEnabled;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("TotalMember")
        private String totalMember;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkspaceDesc")
        private String workspaceDesc;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceStatus")
        private String workspaceStatus;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.isSessionShareEnabled = builder.isSessionShareEnabled;
            this.modifyTime = builder.modifyTime;
            this.roleName = builder.roleName;
            this.totalMember = builder.totalMember;
            this.type = builder.type;
            this.workspaceDesc = builder.workspaceDesc;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
            this.workspaceStatus = builder.workspaceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return isSessionShareEnabled
         */
        public Boolean getIsSessionShareEnabled() {
            return this.isSessionShareEnabled;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return totalMember
         */
        public String getTotalMember() {
            return this.totalMember;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workspaceDesc
         */
        public String getWorkspaceDesc() {
            return this.workspaceDesc;
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
         * @return workspaceStatus
         */
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private Boolean isSessionShareEnabled; 
            private String modifyTime; 
            private String roleName; 
            private String totalMember; 
            private String type; 
            private String workspaceDesc; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.isSessionShareEnabled = model.isSessionShareEnabled;
                this.modifyTime = model.modifyTime;
                this.roleName = model.roleName;
                this.totalMember = model.totalMember;
                this.type = model.type;
                this.workspaceDesc = model.workspaceDesc;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
                this.workspaceStatus = model.workspaceStatus;
            } 

            /**
             * <p>The creation time of the session. Unit: seconds. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1765960516</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UID of the workspace creator.</p>
             * 
             * <strong>example:</strong>
             * <p>20282*****7591</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * IsSessionShareEnabled.
             */
            public Builder isSessionShareEnabled(Boolean isSessionShareEnabled) {
                this.isSessionShareEnabled = isSessionShareEnabled;
                return this;
            }

            /**
             * <p>The most recent modification time of the workspace. Unit: seconds. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1765961516</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The role name of the user in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The number of members in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder totalMember(String totalMember) {
                this.totalMember = totalMember;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The description of the collaborative workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>space for test</p>
             */
            public Builder workspaceDesc(String workspaceDesc) {
                this.workspaceDesc = workspaceDesc;
                return this;
            }

            /**
             * <p>The ID of the collaborative workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>20923*****7291</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>workspaceTest</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            /**
             * <p>The status of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder workspaceStatus(String workspaceStatus) {
                this.workspaceStatus = workspaceStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
