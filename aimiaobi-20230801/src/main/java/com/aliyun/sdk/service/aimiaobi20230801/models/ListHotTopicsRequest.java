// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHotTopicsRequest} extends {@link RequestModel}
 *
 * <p>ListHotTopicsRequest</p>
 */
public class ListHotTopicsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicIds")
    private java.util.List < String > topicIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicQuery")
    private String topicQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicSource")
    private String topicSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicVersion")
    private String topicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.List < String > topics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithNews")
    private Boolean withNews;

    private ListHotTopicsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.topicIds = builder.topicIds;
        this.topicQuery = builder.topicQuery;
        this.topicSource = builder.topicSource;
        this.topicVersion = builder.topicVersion;
        this.topics = builder.topics;
        this.withNews = builder.withNews;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotTopicsRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
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

    /**
     * @return topicIds
     */
    public java.util.List < String > getTopicIds() {
        return this.topicIds;
    }

    /**
     * @return topicQuery
     */
    public String getTopicQuery() {
        return this.topicQuery;
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
     * @return topics
     */
    public java.util.List < String > getTopics() {
        return this.topics;
    }

    /**
     * @return withNews
     */
    public Boolean getWithNews() {
        return this.withNews;
    }

    public static final class Builder extends Request.Builder<ListHotTopicsRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > topicIds; 
        private String topicQuery; 
        private String topicSource; 
        private String topicVersion; 
        private java.util.List < String > topics; 
        private Boolean withNews; 

        private Builder() {
            super();
        } 

        private Builder(ListHotTopicsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.topicIds = request.topicIds;
            this.topicQuery = request.topicQuery;
            this.topicSource = request.topicSource;
            this.topicVersion = request.topicVersion;
            this.topics = request.topics;
            this.withNews = request.withNews;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * TopicIds.
         */
        public Builder topicIds(java.util.List < String > topicIds) {
            String topicIdsShrink = shrink(topicIds, "TopicIds", "json");
            this.putBodyParameter("TopicIds", topicIdsShrink);
            this.topicIds = topicIds;
            return this;
        }

        /**
         * TopicQuery.
         */
        public Builder topicQuery(String topicQuery) {
            this.putBodyParameter("TopicQuery", topicQuery);
            this.topicQuery = topicQuery;
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
         * Topics.
         */
        public Builder topics(java.util.List < String > topics) {
            String topicsShrink = shrink(topics, "Topics", "json");
            this.putBodyParameter("Topics", topicsShrink);
            this.topics = topics;
            return this;
        }

        /**
         * WithNews.
         */
        public Builder withNews(Boolean withNews) {
            this.putBodyParameter("WithNews", withNews);
            this.withNews = withNews;
            return this;
        }

        @Override
        public ListHotTopicsRequest build() {
            return new ListHotTopicsRequest(this);
        } 

    } 

}
