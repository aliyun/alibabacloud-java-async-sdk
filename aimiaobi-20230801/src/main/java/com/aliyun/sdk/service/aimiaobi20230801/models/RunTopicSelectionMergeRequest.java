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
 * {@link RunTopicSelectionMergeRequest} extends {@link RequestModel}
 *
 * <p>RunTopicSelectionMergeRequest</p>
 */
public class RunTopicSelectionMergeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topics")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TopicSelection> topics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunTopicSelectionMergeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.prompt = builder.prompt;
        this.topics = builder.topics;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunTopicSelectionMergeRequest create() {
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return topics
     */
    public java.util.List<TopicSelection> getTopics() {
        return this.topics;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunTopicSelectionMergeRequest, Builder> {
        private String regionId; 
        private String prompt; 
        private java.util.List<TopicSelection> topics; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunTopicSelectionMergeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.prompt = request.prompt;
            this.topics = request.topics;
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
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder topics(java.util.List<TopicSelection> topics) {
            String topicsShrink = shrink(topics, "Topics", "json");
            this.putBodyParameter("Topics", topicsShrink);
            this.topics = topics;
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
        public RunTopicSelectionMergeRequest build() {
            return new RunTopicSelectionMergeRequest(this);
        } 

    } 

}
