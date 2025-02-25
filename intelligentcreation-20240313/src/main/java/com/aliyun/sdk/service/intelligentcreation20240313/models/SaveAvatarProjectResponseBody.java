// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link SaveAvatarProjectResponseBody} extends {@link TeaModel}
 *
 * <p>SaveAvatarProjectResponseBody</p>
 */
public class SaveAvatarProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private SaveAvatarProjectResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.errorMsg = builder.errorMsg;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAvatarProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
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

    public static final class Builder {
        private String agentId; 
        private String errorCode; 
        private String errorMessage; 
        private String errorMsg; 
        private String projectId; 
        private String projectName; 
        private String requestId; 
        private String status; 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SaveAvatarProjectResponseBody build() {
            return new SaveAvatarProjectResponseBody(this);
        } 

    } 

}
