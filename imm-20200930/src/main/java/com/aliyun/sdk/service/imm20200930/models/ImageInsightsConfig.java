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
 * {@link ImageInsightsConfig} extends {@link TeaModel}
 *
 * <p>ImageInsightsConfig</p>
 */
public class ImageInsightsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Caption")
    private ImageInsightsCaptionConfig caption;

    private ImageInsightsConfig(Builder builder) {
        this.caption = builder.caption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageInsightsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caption
     */
    public ImageInsightsCaptionConfig getCaption() {
        return this.caption;
    }

    public static final class Builder {
        private ImageInsightsCaptionConfig caption; 

        private Builder() {
        } 

        private Builder(ImageInsightsConfig model) {
            this.caption = model.caption;
        } 

        /**
         * Caption.
         */
        public Builder caption(ImageInsightsCaptionConfig caption) {
            this.caption = caption;
            return this;
        }

        public ImageInsightsConfig build() {
            return new ImageInsightsConfig(this);
        } 

    } 

}
