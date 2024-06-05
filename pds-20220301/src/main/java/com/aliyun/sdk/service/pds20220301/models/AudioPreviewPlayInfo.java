// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AudioPreviewPlayInfo} extends {@link TeaModel}
 *
 * <p>AudioPreviewPlayInfo</p>
 */
public class AudioPreviewPlayInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("offline_audio_list")
    private java.util.List < OfflineAudioList> offlineAudioList;

    private AudioPreviewPlayInfo(Builder builder) {
        this.meta = builder.meta;
        this.offlineAudioList = builder.offlineAudioList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AudioPreviewPlayInfo create() {
        return builder().build();
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return offlineAudioList
     */
    public java.util.List < OfflineAudioList> getOfflineAudioList() {
        return this.offlineAudioList;
    }

    public static final class Builder {
        private Meta meta; 
        private java.util.List < OfflineAudioList> offlineAudioList; 

        /**
         * meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * offline_audio_list.
         */
        public Builder offlineAudioList(java.util.List < OfflineAudioList> offlineAudioList) {
            this.offlineAudioList = offlineAudioList;
            return this;
        }

        public AudioPreviewPlayInfo build() {
            return new AudioPreviewPlayInfo(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("duration")
        private Double duration;

        private Meta(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private Double duration; 

            /**
             * duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    public static class OfflineAudioList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("template_id")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private OfflineAudioList(Builder builder) {
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineAudioList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String status; 
            private String templateId; 
            private String url; 

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * template_id.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public OfflineAudioList build() {
                return new OfflineAudioList(this);
            } 

        } 

    }
}
