// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link VideoInsightsConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsConfig</p>
 */
public class VideoInsightsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Caption")
    private VideoInsightsCaptionConfig caption;

    @com.aliyun.core.annotation.NameInMap("Label")
    private VideoInsightsLabelConfig label;

    @com.aliyun.core.annotation.NameInMap("MultiStream")
    private VideoInsightsMultiStreamConfig multiStream;

    private VideoInsightsConfig(Builder builder) {
        this.caption = builder.caption;
        this.label = builder.label;
        this.multiStream = builder.multiStream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caption
     */
    public VideoInsightsCaptionConfig getCaption() {
        return this.caption;
    }

    /**
     * @return label
     */
    public VideoInsightsLabelConfig getLabel() {
        return this.label;
    }

    /**
     * @return multiStream
     */
    public VideoInsightsMultiStreamConfig getMultiStream() {
        return this.multiStream;
    }

    public static final class Builder {
        private VideoInsightsCaptionConfig caption; 
        private VideoInsightsLabelConfig label; 
        private VideoInsightsMultiStreamConfig multiStream; 

        private Builder() {
        } 

        private Builder(VideoInsightsConfig model) {
            this.caption = model.caption;
            this.label = model.label;
            this.multiStream = model.multiStream;
        } 

        /**
         * Caption.
         */
        public Builder caption(VideoInsightsCaptionConfig caption) {
            this.caption = caption;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(VideoInsightsLabelConfig label) {
            this.label = label;
            return this;
        }

        /**
         * MultiStream.
         */
        public Builder multiStream(VideoInsightsMultiStreamConfig multiStream) {
            this.multiStream = multiStream;
            return this;
        }

        public VideoInsightsConfig build() {
            return new VideoInsightsConfig(this);
        } 

    } 

}
