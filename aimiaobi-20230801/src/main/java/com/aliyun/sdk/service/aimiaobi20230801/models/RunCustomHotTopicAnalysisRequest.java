// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunCustomHotTopicAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunCustomHotTopicAnalysisRequest</p>
 */
public class RunCustomHotTopicAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AskUser")
    private String askUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceAnalysisExistsTopic")
    private Boolean forceAnalysisExistsTopic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserBack")
    private String userBack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunCustomHotTopicAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.askUser = builder.askUser;
        this.forceAnalysisExistsTopic = builder.forceAnalysisExistsTopic;
        this.prompt = builder.prompt;
        this.sessionId = builder.sessionId;
        this.taskId = builder.taskId;
        this.userBack = builder.userBack;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCustomHotTopicAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return askUser
     */
    public String getAskUser() {
        return this.askUser;
    }

    /**
     * @return forceAnalysisExistsTopic
     */
    public Boolean getForceAnalysisExistsTopic() {
        return this.forceAnalysisExistsTopic;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return userBack
     */
    public String getUserBack() {
        return this.userBack;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunCustomHotTopicAnalysisRequest, Builder> {
        private String regionId; 
        private String askUser; 
        private Boolean forceAnalysisExistsTopic; 
        private String prompt; 
        private String sessionId; 
        private String taskId; 
        private String userBack; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunCustomHotTopicAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.askUser = request.askUser;
            this.forceAnalysisExistsTopic = request.forceAnalysisExistsTopic;
            this.prompt = request.prompt;
            this.sessionId = request.sessionId;
            this.taskId = request.taskId;
            this.userBack = request.userBack;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AskUser.
         */
        public Builder askUser(String askUser) {
            this.putBodyParameter("AskUser", askUser);
            this.askUser = askUser;
            return this;
        }

        /**
         * ForceAnalysisExistsTopic.
         */
        public Builder forceAnalysisExistsTopic(Boolean forceAnalysisExistsTopic) {
            this.putBodyParameter("ForceAnalysisExistsTopic", forceAnalysisExistsTopic);
            this.forceAnalysisExistsTopic = forceAnalysisExistsTopic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>用户输入Prompt</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * UserBack.
         */
        public Builder userBack(String userBack) {
            this.putBodyParameter("UserBack", userBack);
            this.userBack = userBack;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunCustomHotTopicAnalysisRequest build() {
            return new RunCustomHotTopicAnalysisRequest(this);
        } 

    } 

}
