// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPlanningProposalRequest} extends {@link RequestModel}
 *
 * <p>ListPlanningProposalRequest</p>
 */
public class ListPlanningProposalRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomViewPointId")
    private String customViewPointId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomViewPointIds")
    private java.util.List < String > customViewPointIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Titles")
    private java.util.List < String > titles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicVersion")
    private String topicVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ViewPointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String viewPointType;

    private ListPlanningProposalRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.customViewPointId = builder.customViewPointId;
        this.customViewPointIds = builder.customViewPointIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.titles = builder.titles;
        this.topic = builder.topic;
        this.topicSource = builder.topicSource;
        this.topicVersion = builder.topicVersion;
        this.viewPointType = builder.viewPointType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlanningProposalRequest create() {
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
     * @return customViewPointId
     */
    public String getCustomViewPointId() {
        return this.customViewPointId;
    }

    /**
     * @return customViewPointIds
     */
    public java.util.List < String > getCustomViewPointIds() {
        return this.customViewPointIds;
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
     * @return titles
     */
    public java.util.List < String > getTitles() {
        return this.titles;
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

    /**
     * @return topicVersion
     */
    public String getTopicVersion() {
        return this.topicVersion;
    }

    /**
     * @return viewPointType
     */
    public String getViewPointType() {
        return this.viewPointType;
    }

    public static final class Builder extends Request.Builder<ListPlanningProposalRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String customViewPointId; 
        private java.util.List < String > customViewPointIds; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > titles; 
        private String topic; 
        private String topicSource; 
        private String topicVersion; 
        private String viewPointType; 

        private Builder() {
            super();
        } 

        private Builder(ListPlanningProposalRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.customViewPointId = request.customViewPointId;
            this.customViewPointIds = request.customViewPointIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.titles = request.titles;
            this.topic = request.topic;
            this.topicSource = request.topicSource;
            this.topicVersion = request.topicVersion;
            this.viewPointType = request.viewPointType;
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
         * CustomViewPointId.
         */
        public Builder customViewPointId(String customViewPointId) {
            this.putBodyParameter("CustomViewPointId", customViewPointId);
            this.customViewPointId = customViewPointId;
            return this;
        }

        /**
         * CustomViewPointIds.
         */
        public Builder customViewPointIds(java.util.List < String > customViewPointIds) {
            String customViewPointIdsShrink = shrink(customViewPointIds, "CustomViewPointIds", "json");
            this.putBodyParameter("CustomViewPointIds", customViewPointIdsShrink);
            this.customViewPointIds = customViewPointIds;
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
         * Titles.
         */
        public Builder titles(java.util.List < String > titles) {
            String titlesShrink = shrink(titles, "Titles", "json");
            this.putBodyParameter("Titles", titlesShrink);
            this.titles = titles;
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

        /**
         * TopicVersion.
         */
        public Builder topicVersion(String topicVersion) {
            this.putBodyParameter("TopicVersion", topicVersion);
            this.topicVersion = topicVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomViewPoints</p>
         */
        public Builder viewPointType(String viewPointType) {
            this.putBodyParameter("ViewPointType", viewPointType);
            this.viewPointType = viewPointType;
            return this;
        }

        @Override
        public ListPlanningProposalRequest build() {
            return new ListPlanningProposalRequest(this);
        } 

    } 

}
