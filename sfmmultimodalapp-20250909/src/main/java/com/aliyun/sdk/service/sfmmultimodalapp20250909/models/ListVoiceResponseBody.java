// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link ListVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListVoiceResponseBody</p>
 */
public class ListVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VoiceList")
    private java.util.List<VoiceList> voiceList;

    private ListVoiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.voiceList = builder.voiceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return voiceList
     */
    public java.util.List<VoiceList> getVoiceList() {
        return this.voiceList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VoiceList> voiceList; 

        private Builder() {
        } 

        private Builder(ListVoiceResponseBody model) {
            this.requestId = model.requestId;
            this.voiceList = model.voiceList;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82296D89-6895-574B-8AA1-64959957CB41</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VoiceList.
         */
        public Builder voiceList(java.util.List<VoiceList> voiceList) {
            this.voiceList = voiceList;
            return this;
        }

        public ListVoiceResponseBody build() {
            return new ListVoiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceResponseBody</p>
     */
    public static class VoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("Illustration")
        private String illustration;

        @com.aliyun.core.annotation.NameInMap("IllustrationAudio")
        private String illustrationAudio;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        private VoiceList(Builder builder) {
            this.gender = builder.gender;
            this.illustration = builder.illustration;
            this.illustrationAudio = builder.illustrationAudio;
            this.language = builder.language;
            this.modelId = builder.modelId;
            this.name = builder.name;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceList create() {
            return builder().build();
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return illustration
         */
        public String getIllustration() {
            return this.illustration;
        }

        /**
         * @return illustrationAudio
         */
        public String getIllustrationAudio() {
            return this.illustrationAudio;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private String gender; 
            private String illustration; 
            private String illustrationAudio; 
            private String language; 
            private String modelId; 
            private String name; 
            private String voice; 

            private Builder() {
            } 

            private Builder(VoiceList model) {
                this.gender = model.gender;
                this.illustration = model.illustration;
                this.illustrationAudio = model.illustrationAudio;
                this.language = model.language;
                this.modelId = model.modelId;
                this.name = model.name;
                this.voice = model.voice;
            } 

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * Illustration.
             */
            public Builder illustration(String illustration) {
                this.illustration = illustration;
                return this;
            }

            /**
             * IllustrationAudio.
             */
            public Builder illustrationAudio(String illustrationAudio) {
                this.illustrationAudio = illustrationAudio;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public VoiceList build() {
                return new VoiceList(this);
            } 

        } 

    }
}
