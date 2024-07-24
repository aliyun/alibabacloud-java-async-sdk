// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantChatConstraint} extends {@link TeaModel}
 *
 * <p>AIAssistantChatConstraint</p>
 */
public class AIAssistantChatConstraint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("tone")
    private String tone;

    private AIAssistantChatConstraint(Builder builder) {
        this.language = builder.language;
        this.tone = builder.tone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantChatConstraint create() {
        return builder().build();
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return tone
     */
    public String getTone() {
        return this.tone;
    }

    public static final class Builder {
        private String language; 
        private String tone; 

        /**
         * language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * tone.
         */
        public Builder tone(String tone) {
            this.tone = tone;
            return this;
        }

        public AIAssistantChatConstraint build() {
            return new AIAssistantChatConstraint(this);
        } 

    } 

}
