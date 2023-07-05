// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAudioTo3DAvatarVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAudioTo3DAvatarVideoTaskRequest</p>
 */
public class SubmitAudioTo3DAvatarVideoTaskRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private App app;

    @Query
    @NameInMap("AvatarInfo")
    private AvatarInfo avatarInfo;

    @Query
    @NameInMap("Callback")
    private Boolean callback;

    @Query
    @NameInMap("CallbackParams")
    private String callbackParams;

    @Query
    @NameInMap("ExtParams")
    private String extParams;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    @Query
    @NameInMap("VideoInfo")
    private VideoInfo videoInfo;

    private SubmitAudioTo3DAvatarVideoTaskRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.avatarInfo = builder.avatarInfo;
        this.callback = builder.callback;
        this.callbackParams = builder.callbackParams;
        this.extParams = builder.extParams;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.url = builder.url;
        this.videoInfo = builder.videoInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAudioTo3DAvatarVideoTaskRequest create() {
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
     * @return avatarInfo
     */
    public AvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    /**
     * @return callback
     */
    public Boolean getCallback() {
        return this.callback;
    }

    /**
     * @return callbackParams
     */
    public String getCallbackParams() {
        return this.callbackParams;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return videoInfo
     */
    public VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static final class Builder extends Request.Builder<SubmitAudioTo3DAvatarVideoTaskRequest, Builder> {
        private App app; 
        private AvatarInfo avatarInfo; 
        private Boolean callback; 
        private String callbackParams; 
        private String extParams; 
        private Long tenantId; 
        private String title; 
        private String url; 
        private VideoInfo videoInfo; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAudioTo3DAvatarVideoTaskRequest request) {
            super(request);
            this.app = request.app;
            this.avatarInfo = request.avatarInfo;
            this.callback = request.callback;
            this.callbackParams = request.callbackParams;
            this.extParams = request.extParams;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.url = request.url;
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
         * AvatarInfo.
         */
        public Builder avatarInfo(AvatarInfo avatarInfo) {
            String avatarInfoShrink = shrink(avatarInfo, "AvatarInfo", "json");
            this.putQueryParameter("AvatarInfo", avatarInfoShrink);
            this.avatarInfo = avatarInfo;
            return this;
        }

        /**
         * Callback.
         */
        public Builder callback(Boolean callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * CallbackParams.
         */
        public Builder callbackParams(String callbackParams) {
            this.putQueryParameter("CallbackParams", callbackParams);
            this.callbackParams = callbackParams;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.putQueryParameter("ExtParams", extParams);
            this.extParams = extParams;
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
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
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
        public SubmitAudioTo3DAvatarVideoTaskRequest build() {
            return new SubmitAudioTo3DAvatarVideoTaskRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
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
    public static class AvatarInfo extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("Code")
        private String code;

        @NameInMap("IndustryCode")
        private String industryCode;

        @NameInMap("Locate")
        private Integer locate;

        private AvatarInfo(Builder builder) {
            this.angle = builder.angle;
            this.code = builder.code;
            this.industryCode = builder.industryCode;
            this.locate = builder.locate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarInfo create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return industryCode
         */
        public String getIndustryCode() {
            return this.industryCode;
        }

        /**
         * @return locate
         */
        public Integer getLocate() {
            return this.locate;
        }

        public static final class Builder {
            private Integer angle; 
            private String code; 
            private String industryCode; 
            private Integer locate; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * IndustryCode.
             */
            public Builder industryCode(String industryCode) {
                this.industryCode = industryCode;
                return this;
            }

            /**
             * Locate.
             */
            public Builder locate(Integer locate) {
                this.locate = locate;
                return this;
            }

            public AvatarInfo build() {
                return new AvatarInfo(this);
            } 

        } 

    }
    public static class VideoInfo extends TeaModel {
        @NameInMap("AlphaFormat")
        private Integer alphaFormat;

        @NameInMap("BackgroundImageUrl")
        private String backgroundImageUrl;

        @NameInMap("IsAlpha")
        private Boolean isAlpha;

        @NameInMap("Resolution")
        private Integer resolution;

        private VideoInfo(Builder builder) {
            this.alphaFormat = builder.alphaFormat;
            this.backgroundImageUrl = builder.backgroundImageUrl;
            this.isAlpha = builder.isAlpha;
            this.resolution = builder.resolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoInfo create() {
            return builder().build();
        }

        /**
         * @return alphaFormat
         */
        public Integer getAlphaFormat() {
            return this.alphaFormat;
        }

        /**
         * @return backgroundImageUrl
         */
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /**
         * @return isAlpha
         */
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        /**
         * @return resolution
         */
        public Integer getResolution() {
            return this.resolution;
        }

        public static final class Builder {
            private Integer alphaFormat; 
            private String backgroundImageUrl; 
            private Boolean isAlpha; 
            private Integer resolution; 

            /**
             * AlphaFormat.
             */
            public Builder alphaFormat(Integer alphaFormat) {
                this.alphaFormat = alphaFormat;
                return this;
            }

            /**
             * BackgroundImageUrl.
             */
            public Builder backgroundImageUrl(String backgroundImageUrl) {
                this.backgroundImageUrl = backgroundImageUrl;
                return this;
            }

            /**
             * IsAlpha.
             */
            public Builder isAlpha(Boolean isAlpha) {
                this.isAlpha = isAlpha;
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
