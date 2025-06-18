// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AsyncEditTimelineRequest} extends {@link RequestModel}
 *
 * <p>AsyncEditTimelineRequest</p>
 */
public class AsyncEditTimelineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoClips")
    private Boolean autoClips;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timelines")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Timelines> timelines;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AsyncEditTimelineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoClips = builder.autoClips;
        this.taskId = builder.taskId;
        this.timelines = builder.timelines;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncEditTimelineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoClips
     */
    public Boolean getAutoClips() {
        return this.autoClips;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timelines
     */
    public java.util.List<Timelines> getTimelines() {
        return this.timelines;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncEditTimelineRequest, Builder> {
        private String regionId; 
        private Boolean autoClips; 
        private String taskId; 
        private java.util.List<Timelines> timelines; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncEditTimelineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoClips = request.autoClips;
            this.taskId = request.taskId;
            this.timelines = request.timelines;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AutoClips.
         */
        public Builder autoClips(Boolean autoClips) {
            this.putBodyParameter("AutoClips", autoClips);
            this.autoClips = autoClips;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timelines(java.util.List<Timelines> timelines) {
            String timelinesShrink = shrink(timelines, "Timelines", "json");
            this.putBodyParameter("Timelines", timelinesShrink);
            this.timelines = timelines;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-az2gglkjauwnnhpq</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncEditTimelineRequest build() {
            return new AsyncEditTimelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link AsyncEditTimelineRequest} extends {@link TeaModel}
     *
     * <p>AsyncEditTimelineRequest</p>
     */
    public static class Clips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipId")
        private String clipId;

        @com.aliyun.core.annotation.NameInMap("ContentInner")
        private String contentInner;

        @com.aliyun.core.annotation.NameInMap("In")
        private Integer in;

        @com.aliyun.core.annotation.NameInMap("Out")
        private Integer out;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        private Clips(Builder builder) {
            this.clipId = builder.clipId;
            this.contentInner = builder.contentInner;
            this.in = builder.in;
            this.out = builder.out;
            this.videoId = builder.videoId;
            this.videoName = builder.videoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clips create() {
            return builder().build();
        }

        /**
         * @return clipId
         */
        public String getClipId() {
            return this.clipId;
        }

        /**
         * @return contentInner
         */
        public String getContentInner() {
            return this.contentInner;
        }

        /**
         * @return in
         */
        public Integer getIn() {
            return this.in;
        }

        /**
         * @return out
         */
        public Integer getOut() {
            return this.out;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        public static final class Builder {
            private String clipId; 
            private String contentInner; 
            private Integer in; 
            private Integer out; 
            private String videoId; 
            private String videoName; 

            private Builder() {
            } 

            private Builder(Clips model) {
                this.clipId = model.clipId;
                this.contentInner = model.contentInner;
                this.in = model.in;
                this.out = model.out;
                this.videoId = model.videoId;
                this.videoName = model.videoName;
            } 

            /**
             * ClipId.
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * ContentInner.
             */
            public Builder contentInner(String contentInner) {
                this.contentInner = contentInner;
                return this;
            }

            /**
             * In.
             */
            public Builder in(Integer in) {
                this.in = in;
                return this;
            }

            /**
             * Out.
             */
            public Builder out(Integer out) {
                this.out = out;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            /**
             * VideoName.
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            public Clips build() {
                return new Clips(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncEditTimelineRequest} extends {@link TeaModel}
     *
     * <p>AsyncEditTimelineRequest</p>
     */
    public static class Timelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clips")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Clips> clips;

        @com.aliyun.core.annotation.NameInMap("TimelineId")
        private String timelineId;

        private Timelines(Builder builder) {
            this.clips = builder.clips;
            this.timelineId = builder.timelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timelines create() {
            return builder().build();
        }

        /**
         * @return clips
         */
        public java.util.List<Clips> getClips() {
            return this.clips;
        }

        /**
         * @return timelineId
         */
        public String getTimelineId() {
            return this.timelineId;
        }

        public static final class Builder {
            private java.util.List<Clips> clips; 
            private String timelineId; 

            private Builder() {
            } 

            private Builder(Timelines model) {
                this.clips = model.clips;
                this.timelineId = model.timelineId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder clips(java.util.List<Clips> clips) {
                this.clips = clips;
                return this;
            }

            /**
             * TimelineId.
             */
            public Builder timelineId(String timelineId) {
                this.timelineId = timelineId;
                return this;
            }

            public Timelines build() {
                return new Timelines(this);
            } 

        } 

    }
}
