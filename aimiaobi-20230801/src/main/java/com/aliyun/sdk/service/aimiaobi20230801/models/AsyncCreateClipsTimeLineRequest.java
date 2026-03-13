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
 * {@link AsyncCreateClipsTimeLineRequest} extends {@link RequestModel}
 *
 * <p>AsyncCreateClipsTimeLineRequest</p>
 */
public class AsyncCreateClipsTimeLineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdditionalContent")
    private String additionalContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomContent")
    private String customContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HighLightConfig")
    private HighLightConfig highLightConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoRefVideo")
    private Boolean noRefVideo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessPrompt")
    private String processPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecommendAudio")
    private Boolean recommendAudio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimelineScene")
    private Integer timelineScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AsyncCreateClipsTimeLineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.additionalContent = builder.additionalContent;
        this.customContent = builder.customContent;
        this.highLightConfig = builder.highLightConfig;
        this.noRefVideo = builder.noRefVideo;
        this.processPrompt = builder.processPrompt;
        this.recommendAudio = builder.recommendAudio;
        this.taskId = builder.taskId;
        this.timelineScene = builder.timelineScene;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncCreateClipsTimeLineRequest create() {
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
     * @return additionalContent
     */
    public String getAdditionalContent() {
        return this.additionalContent;
    }

    /**
     * @return customContent
     */
    public String getCustomContent() {
        return this.customContent;
    }

    /**
     * @return highLightConfig
     */
    public HighLightConfig getHighLightConfig() {
        return this.highLightConfig;
    }

    /**
     * @return noRefVideo
     */
    public Boolean getNoRefVideo() {
        return this.noRefVideo;
    }

    /**
     * @return processPrompt
     */
    public String getProcessPrompt() {
        return this.processPrompt;
    }

    /**
     * @return recommendAudio
     */
    public Boolean getRecommendAudio() {
        return this.recommendAudio;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timelineScene
     */
    public Integer getTimelineScene() {
        return this.timelineScene;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncCreateClipsTimeLineRequest, Builder> {
        private String regionId; 
        private String additionalContent; 
        private String customContent; 
        private HighLightConfig highLightConfig; 
        private Boolean noRefVideo; 
        private String processPrompt; 
        private Boolean recommendAudio; 
        private String taskId; 
        private Integer timelineScene; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncCreateClipsTimeLineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.additionalContent = request.additionalContent;
            this.customContent = request.customContent;
            this.highLightConfig = request.highLightConfig;
            this.noRefVideo = request.noRefVideo;
            this.processPrompt = request.processPrompt;
            this.recommendAudio = request.recommendAudio;
            this.taskId = request.taskId;
            this.timelineScene = request.timelineScene;
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
         * AdditionalContent.
         */
        public Builder additionalContent(String additionalContent) {
            this.putBodyParameter("AdditionalContent", additionalContent);
            this.additionalContent = additionalContent;
            return this;
        }

        /**
         * CustomContent.
         */
        public Builder customContent(String customContent) {
            this.putBodyParameter("CustomContent", customContent);
            this.customContent = customContent;
            return this;
        }

        /**
         * HighLightConfig.
         */
        public Builder highLightConfig(HighLightConfig highLightConfig) {
            String highLightConfigShrink = shrink(highLightConfig, "HighLightConfig", "json");
            this.putBodyParameter("HighLightConfig", highLightConfigShrink);
            this.highLightConfig = highLightConfig;
            return this;
        }

        /**
         * NoRefVideo.
         */
        public Builder noRefVideo(Boolean noRefVideo) {
            this.putBodyParameter("NoRefVideo", noRefVideo);
            this.noRefVideo = noRefVideo;
            return this;
        }

        /**
         * ProcessPrompt.
         */
        public Builder processPrompt(String processPrompt) {
            this.putBodyParameter("ProcessPrompt", processPrompt);
            this.processPrompt = processPrompt;
            return this;
        }

        /**
         * RecommendAudio.
         */
        public Builder recommendAudio(Boolean recommendAudio) {
            this.putBodyParameter("RecommendAudio", recommendAudio);
            this.recommendAudio = recommendAudio;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TimelineScene.
         */
        public Builder timelineScene(Integer timelineScene) {
            this.putBodyParameter("TimelineScene", timelineScene);
            this.timelineScene = timelineScene;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncCreateClipsTimeLineRequest build() {
            return new AsyncCreateClipsTimeLineRequest(this);
        } 

    } 

    /**
     * 
     * {@link AsyncCreateClipsTimeLineRequest} extends {@link TeaModel}
     *
     * <p>AsyncCreateClipsTimeLineRequest</p>
     */
    public static class HighLightConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HtAnalyzeRhythm")
        private Boolean htAnalyzeRhythm;

        @com.aliyun.core.annotation.NameInMap("HtHighQualityLabel")
        private java.util.List<String> htHighQualityLabel;

        @com.aliyun.core.annotation.NameInMap("HtLowQualityLabel")
        private java.util.List<String> htLowQualityLabel;

        @com.aliyun.core.annotation.NameInMap("HtMaxTimeLength")
        private Integer htMaxTimeLength;

        @com.aliyun.core.annotation.NameInMap("HtMinTimeLength")
        private Integer htMinTimeLength;

        @com.aliyun.core.annotation.NameInMap("HtPrompt")
        private String htPrompt;

        @com.aliyun.core.annotation.NameInMap("HtSingleShotLen")
        private Integer htSingleShotLen;

        private HighLightConfig(Builder builder) {
            this.htAnalyzeRhythm = builder.htAnalyzeRhythm;
            this.htHighQualityLabel = builder.htHighQualityLabel;
            this.htLowQualityLabel = builder.htLowQualityLabel;
            this.htMaxTimeLength = builder.htMaxTimeLength;
            this.htMinTimeLength = builder.htMinTimeLength;
            this.htPrompt = builder.htPrompt;
            this.htSingleShotLen = builder.htSingleShotLen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighLightConfig create() {
            return builder().build();
        }

        /**
         * @return htAnalyzeRhythm
         */
        public Boolean getHtAnalyzeRhythm() {
            return this.htAnalyzeRhythm;
        }

        /**
         * @return htHighQualityLabel
         */
        public java.util.List<String> getHtHighQualityLabel() {
            return this.htHighQualityLabel;
        }

        /**
         * @return htLowQualityLabel
         */
        public java.util.List<String> getHtLowQualityLabel() {
            return this.htLowQualityLabel;
        }

        /**
         * @return htMaxTimeLength
         */
        public Integer getHtMaxTimeLength() {
            return this.htMaxTimeLength;
        }

        /**
         * @return htMinTimeLength
         */
        public Integer getHtMinTimeLength() {
            return this.htMinTimeLength;
        }

        /**
         * @return htPrompt
         */
        public String getHtPrompt() {
            return this.htPrompt;
        }

        /**
         * @return htSingleShotLen
         */
        public Integer getHtSingleShotLen() {
            return this.htSingleShotLen;
        }

        public static final class Builder {
            private Boolean htAnalyzeRhythm; 
            private java.util.List<String> htHighQualityLabel; 
            private java.util.List<String> htLowQualityLabel; 
            private Integer htMaxTimeLength; 
            private Integer htMinTimeLength; 
            private String htPrompt; 
            private Integer htSingleShotLen; 

            private Builder() {
            } 

            private Builder(HighLightConfig model) {
                this.htAnalyzeRhythm = model.htAnalyzeRhythm;
                this.htHighQualityLabel = model.htHighQualityLabel;
                this.htLowQualityLabel = model.htLowQualityLabel;
                this.htMaxTimeLength = model.htMaxTimeLength;
                this.htMinTimeLength = model.htMinTimeLength;
                this.htPrompt = model.htPrompt;
                this.htSingleShotLen = model.htSingleShotLen;
            } 

            /**
             * HtAnalyzeRhythm.
             */
            public Builder htAnalyzeRhythm(Boolean htAnalyzeRhythm) {
                this.htAnalyzeRhythm = htAnalyzeRhythm;
                return this;
            }

            /**
             * HtHighQualityLabel.
             */
            public Builder htHighQualityLabel(java.util.List<String> htHighQualityLabel) {
                this.htHighQualityLabel = htHighQualityLabel;
                return this;
            }

            /**
             * HtLowQualityLabel.
             */
            public Builder htLowQualityLabel(java.util.List<String> htLowQualityLabel) {
                this.htLowQualityLabel = htLowQualityLabel;
                return this;
            }

            /**
             * HtMaxTimeLength.
             */
            public Builder htMaxTimeLength(Integer htMaxTimeLength) {
                this.htMaxTimeLength = htMaxTimeLength;
                return this;
            }

            /**
             * HtMinTimeLength.
             */
            public Builder htMinTimeLength(Integer htMinTimeLength) {
                this.htMinTimeLength = htMinTimeLength;
                return this;
            }

            /**
             * HtPrompt.
             */
            public Builder htPrompt(String htPrompt) {
                this.htPrompt = htPrompt;
                return this;
            }

            /**
             * HtSingleShotLen.
             */
            public Builder htSingleShotLen(Integer htSingleShotLen) {
                this.htSingleShotLen = htSingleShotLen;
                return this;
            }

            public HighLightConfig build() {
                return new HighLightConfig(this);
            } 

        } 

    }
}
