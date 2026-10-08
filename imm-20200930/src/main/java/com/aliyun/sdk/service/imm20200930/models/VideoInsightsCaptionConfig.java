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
 * {@link VideoInsightsCaptionConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsCaptionConfig</p>
 */
public class VideoInsightsCaptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("PersonReference")
    private PersonReferenceConfig personReference;

    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    private VideoInsightsCaptionConfig(Builder builder) {
        this.enable = builder.enable;
        this.personReference = builder.personReference;
        this.prompt = builder.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsCaptionConfig create() {
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
     * @return personReference
     */
    public PersonReferenceConfig getPersonReference() {
        return this.personReference;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    public static final class Builder {
        private Boolean enable; 
        private PersonReferenceConfig personReference; 
        private String prompt; 

        private Builder() {
        } 

        private Builder(VideoInsightsCaptionConfig model) {
            this.enable = model.enable;
            this.personReference = model.personReference;
            this.prompt = model.prompt;
        } 

        /**
         * <p>Specifies whether to enable video captioning.</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The person reference configuration.</p>
         */
        public Builder personReference(PersonReferenceConfig personReference) {
            this.personReference = personReference;
            return this;
        }

        /**
         * <p>The custom prompt for video captioning.</p>
         * 
         * <strong>example:</strong>
         * <p>请用一句话描述这个视频</p>
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        public VideoInsightsCaptionConfig build() {
            return new VideoInsightsCaptionConfig(this);
        } 

    } 

}
