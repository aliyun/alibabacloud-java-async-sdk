// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTextToSignVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitTextToSignVideoTaskRequest</p>
 */
public class SubmitTextToSignVideoTaskRequest extends Request {
    @Query
    @NameInMap("App")
    private App app;

    @Query
    @NameInMap("TenantId")
    private Long tenantId;

    @Query
    @NameInMap("Text")
    @Validation(maxLength = 4096, minLength = 1)
    private String text;

    @Query
    @NameInMap("Title")
    @Validation(maxLength = 128, minLength = 1)
    private String title;

    @Query
    @NameInMap("VideoInfo")
    private VideoInfo videoInfo;

    private SubmitTextToSignVideoTaskRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.tenantId = builder.tenantId;
        this.text = builder.text;
        this.title = builder.title;
        this.videoInfo = builder.videoInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTextToSignVideoTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return videoInfo
     */
    public VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static final class Builder extends Request.Builder<SubmitTextToSignVideoTaskRequest, Builder> {
        private App app; 
        private Long tenantId; 
        private String text; 
        private String title; 
        private VideoInfo videoInfo; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTextToSignVideoTaskRequest request) {
            super(request);
            this.app = request.app;
            this.tenantId = request.tenantId;
            this.text = request.text;
            this.title = request.title;
            this.videoInfo = request.videoInfo;
        } 

        /**
         * App.
         */
        public Builder app(App app) {
            String appShrink = shrink(app, "App", "json");
            this.putQueryParameter("App", appShrink);
            this.app = app;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * VideoInfo.
         */
        public Builder videoInfo(VideoInfo videoInfo) {
            String videoInfoShrink = shrink(videoInfo, "VideoInfo", "json");
            this.putQueryParameter("VideoInfo", videoInfoShrink);
            this.videoInfo = videoInfo;
            return this;
        }

        @Override
        public SubmitTextToSignVideoTaskRequest build() {
            return new SubmitTextToSignVideoTaskRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        @Validation(maxLength = 64, minLength = 1)
        private String appId;

        private App(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    public static class VideoInfo extends TeaModel {
        @NameInMap("IsAlpha")
        private Boolean isAlpha;

        @NameInMap("IsSubtitles")
        private Boolean isSubtitles;

        @NameInMap("Resolution")
        private Integer resolution;

        private VideoInfo(Builder builder) {
            this.isAlpha = builder.isAlpha;
            this.isSubtitles = builder.isSubtitles;
            this.resolution = builder.resolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoInfo create() {
            return builder().build();
        }

        /**
         * @return isAlpha
         */
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        /**
         * @return isSubtitles
         */
        public Boolean getIsSubtitles() {
            return this.isSubtitles;
        }

        /**
         * @return resolution
         */
        public Integer getResolution() {
            return this.resolution;
        }

        public static final class Builder {
            private Boolean isAlpha; 
            private Boolean isSubtitles; 
            private Integer resolution; 

            /**
             * IsAlpha.
             */
            public Builder isAlpha(Boolean isAlpha) {
                this.isAlpha = isAlpha;
                return this;
            }

            /**
             * IsSubtitles.
             */
            public Builder isSubtitles(Boolean isSubtitles) {
                this.isSubtitles = isSubtitles;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(Integer resolution) {
                this.resolution = resolution;
                return this;
            }

            public VideoInfo build() {
                return new VideoInfo(this);
            } 

        } 

    }
}
