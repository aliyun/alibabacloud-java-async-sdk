// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link PushStoreSpeechDataRequest} extends {@link RequestModel}
 *
 * <p>PushStoreSpeechDataRequest</p>
 */
public class PushStoreSpeechDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Speech")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Speech> speech;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    private PushStoreSpeechDataRequest(Builder builder) {
        super(builder);
        this.speech = builder.speech;
        this.storeId = builder.storeId;
        this.country = builder.country;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushStoreSpeechDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return speech
     */
    public java.util.List<Speech> getSpeech() {
        return this.speech;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    public static final class Builder extends Request.Builder<PushStoreSpeechDataRequest, Builder> {
        private java.util.List<Speech> speech; 
        private String storeId; 
        private String country; 

        private Builder() {
            super();
        } 

        private Builder(PushStoreSpeechDataRequest request) {
            super(request);
            this.speech = request.speech;
            this.storeId = request.storeId;
            this.country = request.country;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder speech(java.util.List<Speech> speech) {
            String speechShrink = shrink(speech, "Speech", "json");
            this.putBodyParameter("Speech", speechShrink);
            this.speech = speech;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>shopcode</p>
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.putBodyParameter("country", country);
            this.country = country;
            return this;
        }

        @Override
        public PushStoreSpeechDataRequest build() {
            return new PushStoreSpeechDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushStoreSpeechDataRequest} extends {@link TeaModel}
     *
     * <p>PushStoreSpeechDataRequest</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Placeholder")
        @com.aliyun.core.annotation.Validation(required = true)
        private String placeholder;

        private Contents(Builder builder) {
            this.content = builder.content;
            this.placeholder = builder.placeholder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return placeholder
         */
        public String getPlaceholder() {
            return this.placeholder;
        }

        public static final class Builder {
            private String content; 
            private String placeholder; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>VIP8</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>memberLevel</p>
             */
            public Builder placeholder(String placeholder) {
                this.placeholder = placeholder;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushStoreSpeechDataRequest} extends {@link TeaModel}
     *
     * <p>PushStoreSpeechDataRequest</p>
     */
    public static class Speech extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<Contents> contents;

        @com.aliyun.core.annotation.NameInMap("Speech")
        private Boolean speech;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private Speech(Builder builder) {
            this.contents = builder.contents;
            this.speech = builder.speech;
            this.speed = builder.speed;
            this.type = builder.type;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Speech create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        /**
         * @return speech
         */
        public Boolean getSpeech() {
            return this.speech;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private java.util.List<Contents> contents; 
            private Boolean speech; 
            private String speed; 
            private String type; 
            private String voice; 
            private Integer volume; 

            /**
             * Contents.
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder speech(Boolean speech) {
                this.speech = speech;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>marktest</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Speech build() {
                return new Speech(this);
            } 

        } 

    }
}
