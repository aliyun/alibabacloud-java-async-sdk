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

    private VideoInsightsConfig(Builder builder) {
        this.caption = builder.caption;
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

    public static final class Builder {
        private VideoInsightsCaptionConfig caption; 

        private Builder() {
        } 

        private Builder(VideoInsightsConfig model) {
            this.caption = model.caption;
        } 

        /**
         * Caption.
         */
        public Builder caption(VideoInsightsCaptionConfig caption) {
            this.caption = caption;
            return this;
        }

        public VideoInsightsConfig build() {
            return new VideoInsightsConfig(this);
        } 

    } 

}
