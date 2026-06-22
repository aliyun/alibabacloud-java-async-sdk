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
 * {@link ImageInsightsCaptionConfig} extends {@link TeaModel}
 *
 * <p>ImageInsightsCaptionConfig</p>
 */
public class ImageInsightsCaptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    private ImageInsightsCaptionConfig(Builder builder) {
        this.enable = builder.enable;
        this.prompt = builder.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageInsightsCaptionConfig create() {
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    public static final class Builder {
        private Boolean enable; 
        private String prompt; 

        private Builder() {
        } 

        private Builder(ImageInsightsCaptionConfig model) {
            this.enable = model.enable;
            this.prompt = model.prompt;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        public ImageInsightsCaptionConfig build() {
            return new ImageInsightsCaptionConfig(this);
        } 

    } 

}
