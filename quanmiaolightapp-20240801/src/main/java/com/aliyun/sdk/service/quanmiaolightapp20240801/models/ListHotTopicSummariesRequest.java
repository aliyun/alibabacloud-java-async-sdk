// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotTopicSummariesRequest} extends {@link RequestModel}
 *
 * <p>ListHotTopicSummariesRequest</p>
 */
public class ListHotTopicSummariesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotTopic")
    private String hotTopic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotTopicVersion")
    private String hotTopicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListHotTopicSummariesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.category = builder.category;
        this.hotTopic = builder.hotTopic;
        this.hotTopicVersion = builder.hotTopicVersion;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotTopicSummariesRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return hotTopic
     */
    public String getHotTopic() {
        return this.hotTopic;
    }

    /**
     * @return hotTopicVersion
     */
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListHotTopicSummariesRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String category; 
        private String hotTopic; 
        private String hotTopicVersion; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListHotTopicSummariesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.category = request.category;
            this.hotTopic = request.hotTopic;
            this.hotTopicVersion = request.hotTopicVersion;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * hotTopic.
         */
        public Builder hotTopic(String hotTopic) {
            this.putBodyParameter("hotTopic", hotTopic);
            this.hotTopic = hotTopic;
            return this;
        }

        /**
         * hotTopicVersion.
         */
        public Builder hotTopicVersion(String hotTopicVersion) {
            this.putBodyParameter("hotTopicVersion", hotTopicVersion);
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListHotTopicSummariesRequest build() {
            return new ListHotTopicSummariesRequest(this);
        } 

    } 

}
