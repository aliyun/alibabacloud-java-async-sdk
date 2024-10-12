// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCustomViewPointsRequest} extends {@link RequestModel}
 *
 * <p>ListCustomViewPointsRequest</p>
 */
public class ListCustomViewPointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attitude")
    private String attitude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attitudes")
    private java.util.List < String > attitudes;

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
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicId")
    private String topicId;

    private ListCustomViewPointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.attitude = builder.attitude;
        this.attitudes = builder.attitudes;
        this.customViewPointId = builder.customViewPointId;
        this.customViewPointIds = builder.customViewPointIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.topic = builder.topic;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomViewPointsRequest create() {
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
     * @return attitude
     */
    public String getAttitude() {
        return this.attitude;
    }

    /**
     * @return attitudes
     */
    public java.util.List < String > getAttitudes() {
        return this.attitudes;
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

    public static final class Builder extends Request.Builder<ListCustomViewPointsRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String attitude; 
        private java.util.List < String > attitudes; 
        private String customViewPointId; 
        private java.util.List < String > customViewPointIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String topic; 
        private String topicId; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomViewPointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.attitude = request.attitude;
            this.attitudes = request.attitudes;
            this.customViewPointId = request.customViewPointId;
            this.customViewPointIds = request.customViewPointIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.topic = request.topic;
            this.topicId = request.topicId;
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
         * Attitude.
         */
        public Builder attitude(String attitude) {
            this.putBodyParameter("Attitude", attitude);
            this.attitude = attitude;
            return this;
        }

        /**
         * Attitudes.
         */
        public Builder attitudes(java.util.List < String > attitudes) {
            String attitudesShrink = shrink(attitudes, "Attitudes", "json");
            this.putBodyParameter("Attitudes", attitudesShrink);
            this.attitudes = attitudes;
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

        @Override
        public ListCustomViewPointsRequest build() {
            return new ListCustomViewPointsRequest(this);
        } 

    } 

}
