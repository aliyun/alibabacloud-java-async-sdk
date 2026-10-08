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
 * {@link VideoInsightsUserDefinedLabelConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsUserDefinedLabelConfig</p>
 */
public class VideoInsightsUserDefinedLabelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<InsightsLabel> labels;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    private VideoInsightsUserDefinedLabelConfig(Builder builder) {
        this.enable = builder.enable;
        this.labels = builder.labels;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsUserDefinedLabelConfig create() {
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

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder {
        private Boolean enable; 
        private java.util.List<InsightsLabel> labels; 
        private String mode; 

        private Builder() {
        } 

        private Builder(VideoInsightsUserDefinedLabelConfig model) {
            this.enable = model.enable;
            this.labels = model.labels;
            this.mode = model.mode;
        } 

        /**
         * <p>Specifies whether to enable custom labels.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The list of custom labels.</p>
         */
        public Builder labels(java.util.List<InsightsLabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The custom label matching mode. The SDK passes this as an optional string.</p>
         * 
         * <strong>example:</strong>
         * <p>Enhanced</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public VideoInsightsUserDefinedLabelConfig build() {
            return new VideoInsightsUserDefinedLabelConfig(this);
        } 

    } 

}
