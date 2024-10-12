// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExportHotTopicPlanningProposalsRequest} extends {@link RequestModel}
 *
 * <p>ExportHotTopicPlanningProposalsRequest</p>
 */
public class ExportHotTopicPlanningProposalsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomViewPointIds")
    private java.util.List < String > customViewPointIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

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
    @com.aliyun.core.annotation.NameInMap("ViewPointType")
    private String viewPointType;

    private ExportHotTopicPlanningProposalsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.customViewPointIds = builder.customViewPointIds;
        this.exportType = builder.exportType;
        this.titles = builder.titles;
        this.topic = builder.topic;
        this.topicSource = builder.topicSource;
        this.viewPointType = builder.viewPointType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportHotTopicPlanningProposalsRequest create() {
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
     * @return customViewPointIds
     */
    public java.util.List < String > getCustomViewPointIds() {
        return this.customViewPointIds;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
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
     * @return viewPointType
     */
    public String getViewPointType() {
        return this.viewPointType;
    }

    public static final class Builder extends Request.Builder<ExportHotTopicPlanningProposalsRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private java.util.List < String > customViewPointIds; 
        private String exportType; 
        private java.util.List < String > titles; 
        private String topic; 
        private String topicSource; 
        private String viewPointType; 

        private Builder() {
            super();
        } 

        private Builder(ExportHotTopicPlanningProposalsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.customViewPointIds = request.customViewPointIds;
            this.exportType = request.exportType;
            this.titles = request.titles;
            this.topic = request.topic;
            this.topicSource = request.topicSource;
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
         * CustomViewPointIds.
         */
        public Builder customViewPointIds(java.util.List < String > customViewPointIds) {
            String customViewPointIdsShrink = shrink(customViewPointIds, "CustomViewPointIds", "json");
            this.putBodyParameter("CustomViewPointIds", customViewPointIdsShrink);
            this.customViewPointIds = customViewPointIds;
            return this;
        }

        /**
         * ExportType.
         */
        public Builder exportType(String exportType) {
            this.putBodyParameter("ExportType", exportType);
            this.exportType = exportType;
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
         * ViewPointType.
         */
        public Builder viewPointType(String viewPointType) {
            this.putBodyParameter("ViewPointType", viewPointType);
            this.viewPointType = viewPointType;
            return this;
        }

        @Override
        public ExportHotTopicPlanningProposalsRequest build() {
            return new ExportHotTopicPlanningProposalsRequest(this);
        } 

    } 

}
