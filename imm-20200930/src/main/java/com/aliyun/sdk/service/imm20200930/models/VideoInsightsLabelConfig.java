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
 * {@link VideoInsightsLabelConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsLabelConfig</p>
 */
public class VideoInsightsLabelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Highlight")
    private VideoInsightsHighlightLabelConfig highlight;

    @com.aliyun.core.annotation.NameInMap("System")
    private VideoInsightsSystemLabelConfig system;

    @com.aliyun.core.annotation.NameInMap("UserDefined")
    private VideoInsightsUserDefinedLabelConfig userDefined;

    private VideoInsightsLabelConfig(Builder builder) {
        this.highlight = builder.highlight;
        this.system = builder.system;
        this.userDefined = builder.userDefined;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsLabelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return highlight
     */
    public VideoInsightsHighlightLabelConfig getHighlight() {
        return this.highlight;
    }

    /**
     * @return system
     */
    public VideoInsightsSystemLabelConfig getSystem() {
        return this.system;
    }

    /**
     * @return userDefined
     */
    public VideoInsightsUserDefinedLabelConfig getUserDefined() {
        return this.userDefined;
    }

    public static final class Builder {
        private VideoInsightsHighlightLabelConfig highlight; 
        private VideoInsightsSystemLabelConfig system; 
        private VideoInsightsUserDefinedLabelConfig userDefined; 

        private Builder() {
        } 

        private Builder(VideoInsightsLabelConfig model) {
            this.highlight = model.highlight;
            this.system = model.system;
            this.userDefined = model.userDefined;
        } 

        /**
         * Highlight.
         */
        public Builder highlight(VideoInsightsHighlightLabelConfig highlight) {
            this.highlight = highlight;
            return this;
        }

        /**
         * System.
         */
        public Builder system(VideoInsightsSystemLabelConfig system) {
            this.system = system;
            return this;
        }

        /**
         * UserDefined.
         */
        public Builder userDefined(VideoInsightsUserDefinedLabelConfig userDefined) {
            this.userDefined = userDefined;
            return this;
        }

        public VideoInsightsLabelConfig build() {
            return new VideoInsightsLabelConfig(this);
        } 

    } 

}
