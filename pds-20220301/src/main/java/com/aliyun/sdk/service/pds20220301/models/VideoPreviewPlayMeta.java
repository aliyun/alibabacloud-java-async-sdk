// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoPreviewPlayMeta} extends {@link TeaModel}
 *
 * <p>VideoPreviewPlayMeta</p>
 */
public class VideoPreviewPlayMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("live_transcoding_task_list")
    private java.util.List < LiveTranscodingTaskList> liveTranscodingTaskList;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    private VideoPreviewPlayMeta(Builder builder) {
        this.category = builder.category;
        this.liveTranscodingTaskList = builder.liveTranscodingTaskList;
        this.meta = builder.meta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoPreviewPlayMeta create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return liveTranscodingTaskList
     */
    public java.util.List < LiveTranscodingTaskList> getLiveTranscodingTaskList() {
        return this.liveTranscodingTaskList;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    public static final class Builder {
        private String category; 
        private java.util.List < LiveTranscodingTaskList> liveTranscodingTaskList; 
        private Meta meta; 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * live_transcoding_task_list.
         */
        public Builder liveTranscodingTaskList(java.util.List < LiveTranscodingTaskList> liveTranscodingTaskList) {
            this.liveTranscodingTaskList = liveTranscodingTaskList;
            return this;
        }

        /**
         * meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public VideoPreviewPlayMeta build() {
            return new VideoPreviewPlayMeta(this);
        } 

    } 

    public static class LiveTranscodingTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keep_original_resolution")
        private Boolean keepOriginalResolution;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("template_id")
        private String templateId;

        private LiveTranscodingTaskList(Builder builder) {
            this.keepOriginalResolution = builder.keepOriginalResolution;
            this.status = builder.status;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveTranscodingTaskList create() {
            return builder().build();
        }

        /**
         * @return keepOriginalResolution
         */
        public Boolean getKeepOriginalResolution() {
            return this.keepOriginalResolution;
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

        public static final class Builder {
            private Boolean keepOriginalResolution; 
            private String status; 
            private String templateId; 

            /**
             * keep_original_resolution.
             */
            public Builder keepOriginalResolution(Boolean keepOriginalResolution) {
                this.keepOriginalResolution = keepOriginalResolution;
                return this;
            }

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

            public LiveTranscodingTaskList build() {
                return new LiveTranscodingTaskList(this);
            } 

        } 

    }
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("width")
        private Long width;

        private Meta(Builder builder) {
            this.duration = builder.duration;
            this.height = builder.height;
            this.width = builder.width;
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

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Double duration; 
            private Long height; 
            private Long width; 

            /**
             * duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * width.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
