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
 * {@link RunCustomHotTopicViewPointAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunCustomHotTopicViewPointAnalysisRequest</p>
 */
public class RunCustomHotTopicViewPointAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AskUser")
    private String askUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchQuery")
    private String searchQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkipAskUser")
    private Boolean skipAskUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicId")
    private String topicId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicSource")
    private String topicSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicVersion")
    private String topicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserBack")
    private String userBack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunCustomHotTopicViewPointAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.askUser = builder.askUser;
        this.prompt = builder.prompt;
        this.searchQuery = builder.searchQuery;
        this.skipAskUser = builder.skipAskUser;
        this.topic = builder.topic;
        this.topicId = builder.topicId;
        this.topicSource = builder.topicSource;
        this.topicVersion = builder.topicVersion;
        this.userBack = builder.userBack;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCustomHotTopicViewPointAnalysisRequest create() {
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return searchQuery
     */
    public String getSearchQuery() {
        return this.searchQuery;
    }

    /**
     * @return skipAskUser
     */
    public Boolean getSkipAskUser() {
        return this.skipAskUser;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    /**
     * @return topicSource
     */
    public String getTopicSource() {
        return this.topicSource;
    }

    /**
     * @return topicVersion
     */
    public String getTopicVersion() {
        return this.topicVersion;
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

    public static final class Builder extends Request.Builder<RunCustomHotTopicViewPointAnalysisRequest, Builder> {
        private String regionId; 
        private String askUser; 
        private String prompt; 
        private String searchQuery; 
        private Boolean skipAskUser; 
        private String topic; 
        private String topicId; 
        private String topicSource; 
        private String topicVersion; 
        private String userBack; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunCustomHotTopicViewPointAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.askUser = request.askUser;
            this.prompt = request.prompt;
            this.searchQuery = request.searchQuery;
            this.skipAskUser = request.skipAskUser;
            this.topic = request.topic;
            this.topicId = request.topicId;
            this.topicSource = request.topicSource;
            this.topicVersion = request.topicVersion;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>自定义选题视角的Prompt</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * SearchQuery.
         */
        public Builder searchQuery(String searchQuery) {
            this.putBodyParameter("SearchQuery", searchQuery);
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * SkipAskUser.
         */
        public Builder skipAskUser(Boolean skipAskUser) {
            this.putBodyParameter("SkipAskUser", skipAskUser);
            this.skipAskUser = skipAskUser;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * TopicId.
         */
        public Builder topicId(String topicId) {
            this.putBodyParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        /**
         * TopicSource.
         */
        public Builder topicSource(String topicSource) {
            this.putBodyParameter("TopicSource", topicSource);
            this.topicSource = topicSource;
            return this;
        }

        /**
         * TopicVersion.
         */
        public Builder topicVersion(String topicVersion) {
            this.putBodyParameter("TopicVersion", topicVersion);
            this.topicVersion = topicVersion;
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
        public RunCustomHotTopicViewPointAnalysisRequest build() {
            return new RunCustomHotTopicViewPointAnalysisRequest(this);
        } 

    } 

}
