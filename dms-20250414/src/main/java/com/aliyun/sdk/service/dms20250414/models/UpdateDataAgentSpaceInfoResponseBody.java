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
 * {@link UpdateDataAgentSpaceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDataAgentSpaceInfoResponseBody</p>
 */
public class UpdateDataAgentSpaceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private UpdateDataAgentSpaceInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentSpaceInfoResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(UpdateDataAgentSpaceInfoResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DMS-DA-40114</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
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
         * <p>67E910F2-***-695C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public UpdateDataAgentSpaceInfoResponseBody build() {
            return new UpdateDataAgentSpaceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataAgentSpaceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDataAgentSpaceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsSessionShareEnabled")
        private Boolean isSessionShareEnabled;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("TotalMember")
        private String totalMember;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceStatus")
        private String workspaceStatus;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.isSessionShareEnabled = builder.isSessionShareEnabled;
            this.modifyTime = builder.modifyTime;
            this.roleName = builder.roleName;
            this.totalMember = builder.totalMember;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private Boolean isSessionShareEnabled; 
            private String modifyTime; 
            private String roleName; 
            private String totalMember; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.isSessionShareEnabled = model.isSessionShareEnabled;
                this.modifyTime = model.modifyTime;
                this.roleName = model.roleName;
                this.totalMember = model.totalMember;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
                this.workspaceStatus = model.workspaceStatus;
            } 

            /**
             * <p>The time when the workspace was created, specified as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1765960516</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user ID (UID) of the workspace creator.</p>
             * 
             * <strong>example:</strong>
             * <p>20282*****7591</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The description of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>space for test new</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether session sharing is enabled in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSessionShareEnabled(Boolean isSessionShareEnabled) {
                this.isSessionShareEnabled = isSessionShareEnabled;
                return this;
            }

            /**
             * <p>The time when the workspace was last modified, specified as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1765962516</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The user role in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The total number of members in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalMember(String totalMember) {
                this.totalMember = totalMember;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>20923*****7291</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The updated name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>yunqitest_v2</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            /**
             * <p>The updated status of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>space for test new</p>
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
