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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
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

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("TotalMember")
        private String totalMember;

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
            this.modifyTime = builder.modifyTime;
            this.roleName = builder.roleName;
            this.totalMember = builder.totalMember;
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
            private String modifyTime; 
            private String roleName; 
            private String totalMember; 
            private String workspaceDesc; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.modifyTime = model.modifyTime;
                this.roleName = model.roleName;
                this.totalMember = model.totalMember;
                this.workspaceDesc = model.workspaceDesc;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
                this.workspaceStatus = model.workspaceStatus;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * TotalMember.
             */
            public Builder totalMember(String totalMember) {
                this.totalMember = totalMember;
                return this;
            }

            /**
             * WorkspaceDesc.
             */
            public Builder workspaceDesc(String workspaceDesc) {
                this.workspaceDesc = workspaceDesc;
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

            /**
             * WorkspaceStatus.
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
