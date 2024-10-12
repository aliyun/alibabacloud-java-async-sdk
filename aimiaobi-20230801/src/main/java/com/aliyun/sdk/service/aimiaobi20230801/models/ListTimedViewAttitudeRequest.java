// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTimedViewAttitudeRequest} extends {@link RequestModel}
 *
 * <p>ListTimedViewAttitudeRequest</p>
 */
public class ListTimedViewAttitudeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicSource;

    private ListTimedViewAttitudeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.topic = builder.topic;
        this.topicSource = builder.topicSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimedViewAttitudeRequest create() {
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
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return topicSource
     */
    public String getTopicSource() {
        return this.topicSource;
    }

    public static final class Builder extends Request.Builder<ListTimedViewAttitudeRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Integer maxResults; 
        private String nextToken; 
        private String topic; 
        private String topicSource; 

        private Builder() {
            super();
        } 

        private Builder(ListTimedViewAttitudeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.topic = request.topic;
            this.topicSource = request.topicSource;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>热榜主题</p>
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>热榜源</p>
         */
        public Builder topicSource(String topicSource) {
            this.putBodyParameter("TopicSource", topicSource);
            this.topicSource = topicSource;
            return this;
        }

        @Override
        public ListTimedViewAttitudeRequest build() {
            return new ListTimedViewAttitudeRequest(this);
        } 

    } 

}
