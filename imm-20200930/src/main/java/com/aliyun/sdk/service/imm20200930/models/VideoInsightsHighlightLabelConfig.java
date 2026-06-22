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
 * {@link VideoInsightsHighlightLabelConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsHighlightLabelConfig</p>
 */
public class VideoInsightsHighlightLabelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<InsightsLabel> labels;

    private VideoInsightsHighlightLabelConfig(Builder builder) {
        this.enable = builder.enable;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsHighlightLabelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return labels
     */
    public java.util.List<InsightsLabel> getLabels() {
        return this.labels;
    }

    public static final class Builder {
        private Boolean enable; 
        private java.util.List<InsightsLabel> labels; 

        private Builder() {
        } 

        private Builder(VideoInsightsHighlightLabelConfig model) {
            this.enable = model.enable;
            this.labels = model.labels;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<InsightsLabel> labels) {
            this.labels = labels;
            return this;
        }

        public VideoInsightsHighlightLabelConfig build() {
            return new VideoInsightsHighlightLabelConfig(this);
        } 

    } 

}
