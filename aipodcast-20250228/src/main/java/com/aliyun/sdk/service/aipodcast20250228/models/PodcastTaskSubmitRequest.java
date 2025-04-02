// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aipodcast20250228.models;

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
 * {@link PodcastTaskSubmitRequest} extends {@link RequestModel}
 *
 * <p>PodcastTaskSubmitRequest</p>
 */
public class PodcastTaskSubmitRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("counts")
    private Integer counts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileUrls")
    private java.util.List<String> fileUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topic")
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voices")
    private java.util.List<String> voices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private PodcastTaskSubmitRequest(Builder builder) {
        super(builder);
        this.counts = builder.counts;
        this.fileUrls = builder.fileUrls;
        this.text = builder.text;
        this.topic = builder.topic;
        this.voices = builder.voices;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PodcastTaskSubmitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return counts
     */
    public Integer getCounts() {
        return this.counts;
    }

    /**
     * @return fileUrls
     */
    public java.util.List<String> getFileUrls() {
        return this.fileUrls;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return voices
     */
    public java.util.List<String> getVoices() {
        return this.voices;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PodcastTaskSubmitRequest, Builder> {
        private Integer counts; 
        private java.util.List<String> fileUrls; 
        private String text; 
        private String topic; 
        private java.util.List<String> voices; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PodcastTaskSubmitRequest request) {
            super(request);
            this.counts = request.counts;
            this.fileUrls = request.fileUrls;
            this.text = request.text;
            this.topic = request.topic;
            this.voices = request.voices;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * counts.
         */
        public Builder counts(Integer counts) {
            this.putBodyParameter("counts", counts);
            this.counts = counts;
            return this;
        }

        /**
         * fileUrls.
         */
        public Builder fileUrls(java.util.List<String> fileUrls) {
            String fileUrlsShrink = shrink(fileUrls, "fileUrls", "json");
            this.putBodyParameter("fileUrls", fileUrlsShrink);
            this.fileUrls = fileUrls;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.putBodyParameter("text", text);
            this.text = text;
            return this;
        }

        /**
         * topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * voices.
         */
        public Builder voices(java.util.List<String> voices) {
            String voicesShrink = shrink(voices, "voices", "json");
            this.putBodyParameter("voices", voicesShrink);
            this.voices = voices;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-ep8ba0dr6seiddxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PodcastTaskSubmitRequest build() {
            return new PodcastTaskSubmitRequest(this);
        } 

    } 

}
