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
         * <p>Specifies whether to enable this feature.</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Provide a concise title for this monitoring section, capturing the core subject and key event. Keep the title within 10 characters.</p>
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
