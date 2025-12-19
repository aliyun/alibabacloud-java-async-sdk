// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunAiHelperWritingRequest} extends {@link RequestModel}
 *
 * <p>RunAiHelperWritingRequest</p>
 */
public class RunAiHelperWritingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributeWriting")
    private Boolean distributeWriting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptMode")
    private String promptMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingParams")
    private java.util.Map<String, String> writingParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String writingScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingStyle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String writingStyle;

    private RunAiHelperWritingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributeWriting = builder.distributeWriting;
        this.prompt = builder.prompt;
        this.promptMode = builder.promptMode;
        this.workspaceId = builder.workspaceId;
        this.writingParams = builder.writingParams;
        this.writingScene = builder.writingScene;
        this.writingStyle = builder.writingStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAiHelperWritingRequest create() {
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
     * @return distributeWriting
     */
    public Boolean getDistributeWriting() {
        return this.distributeWriting;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptMode
     */
    public String getPromptMode() {
        return this.promptMode;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return writingParams
     */
    public java.util.Map<String, String> getWritingParams() {
        return this.writingParams;
    }

    /**
     * @return writingScene
     */
    public String getWritingScene() {
        return this.writingScene;
    }

    /**
     * @return writingStyle
     */
    public String getWritingStyle() {
        return this.writingStyle;
    }

    public static final class Builder extends Request.Builder<RunAiHelperWritingRequest, Builder> {
        private String regionId; 
        private Boolean distributeWriting; 
        private String prompt; 
        private String promptMode; 
        private String workspaceId; 
        private java.util.Map<String, String> writingParams; 
        private String writingScene; 
        private String writingStyle; 

        private Builder() {
            super();
        } 

        private Builder(RunAiHelperWritingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributeWriting = request.distributeWriting;
            this.prompt = request.prompt;
            this.promptMode = request.promptMode;
            this.workspaceId = request.workspaceId;
            this.writingParams = request.writingParams;
            this.writingScene = request.writingScene;
            this.writingStyle = request.writingStyle;
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
         * DistributeWriting.
         */
        public Builder distributeWriting(Boolean distributeWriting) {
            this.putBodyParameter("DistributeWriting", distributeWriting);
            this.distributeWriting = distributeWriting;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请帮我写一篇关于人工智能发展趋势的文章</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * PromptMode.
         */
        public Builder promptMode(String promptMode) {
            this.putBodyParameter("PromptMode", promptMode);
            this.promptMode = promptMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WritingParams.
         */
        public Builder writingParams(java.util.Map<String, String> writingParams) {
            String writingParamsShrink = shrink(writingParams, "WritingParams", "json");
            this.putBodyParameter("WritingParams", writingParamsShrink);
            this.writingParams = writingParams;
            return this;
        }

        /**
         * <p>写作场景：government(政务)、media(传媒)、market(营销)、office(办公)、custom(自定义)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>media</p>
         */
        public Builder writingScene(String writingScene) {
            this.putBodyParameter("WritingScene", writingScene);
            this.writingScene = writingScene;
            return this;
        }

        /**
         * <p>写作文体唯一标识KEY，可通过ListWritingStyles接口获取对应写作场景下的文体列表</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>news_article</p>
         */
        public Builder writingStyle(String writingStyle) {
            this.putBodyParameter("WritingStyle", writingStyle);
            this.writingStyle = writingStyle;
            return this;
        }

        @Override
        public RunAiHelperWritingRequest build() {
            return new RunAiHelperWritingRequest(this);
        } 

    } 

}
