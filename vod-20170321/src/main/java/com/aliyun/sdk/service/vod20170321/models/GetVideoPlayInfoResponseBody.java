// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetVideoPlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoPlayInfoResponseBody</p>
 */
public class GetVideoPlayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlayInfo")
    private PlayInfo playInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoInfo")
    private VideoInfo videoInfo;

    private GetVideoPlayInfoResponseBody(Builder builder) {
        this.playInfo = builder.playInfo;
        this.requestId = builder.requestId;
        this.videoInfo = builder.videoInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPlayInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playInfo
     */
    public PlayInfo getPlayInfo() {
        return this.playInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoInfo
     */
    public VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static final class Builder {
        private PlayInfo playInfo; 
        private String requestId; 
        private VideoInfo videoInfo; 

        private Builder() {
        } 

        private Builder(GetVideoPlayInfoResponseBody model) {
            this.playInfo = model.playInfo;
            this.requestId = model.requestId;
            this.videoInfo = model.videoInfo;
        } 

        /**
         * PlayInfo.
         */
        public Builder playInfo(PlayInfo playInfo) {
            this.playInfo = playInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VideoInfo.
         */
        public Builder videoInfo(VideoInfo videoInfo) {
            this.videoInfo = videoInfo;
            return this;
        }

        public GetVideoPlayInfoResponseBody build() {
            return new GetVideoPlayInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoPlayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoPlayInfoResponseBody</p>
     */
    public static class PlayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("AuthInfo")
        private String authInfo;

        @com.aliyun.core.annotation.NameInMap("PlayDomain")
        private String playDomain;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private PlayInfo(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.authInfo = builder.authInfo;
            this.playDomain = builder.playDomain;
            this.region = builder.region;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfo create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return authInfo
         */
        public String getAuthInfo() {
            return this.authInfo;
        }

        /**
         * @return playDomain
         */
        public String getPlayDomain() {
            return this.playDomain;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String authInfo; 
            private String playDomain; 
            private String region; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(PlayInfo model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.authInfo = model.authInfo;
                this.playDomain = model.playDomain;
                this.region = model.region;
                this.securityToken = model.securityToken;
            } 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * AuthInfo.
             */
            public Builder authInfo(String authInfo) {
                this.authInfo = authInfo;
                return this;
            }

            /**
             * PlayDomain.
             */
            public Builder playDomain(String playDomain) {
                this.playDomain = playDomain;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public PlayInfo build() {
                return new PlayInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoPlayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoPlayInfoResponseBody</p>
     */
    public static class VideoInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private Long customerId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private VideoInfo(Builder builder) {
            this.coverURL = builder.coverURL;
            this.customerId = builder.customerId;
            this.duration = builder.duration;
            this.status = builder.status;
            this.title = builder.title;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoInfo create() {
            return builder().build();
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return customerId
         */
        public Long getCustomerId() {
            return this.customerId;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String coverURL; 
            private Long customerId; 
            private Float duration; 
            private String status; 
            private String title; 
            private String videoId; 

            private Builder() {
            } 

            private Builder(VideoInfo model) {
                this.coverURL = model.coverURL;
                this.customerId = model.customerId;
                this.duration = model.duration;
                this.status = model.status;
                this.title = model.title;
                this.videoId = model.videoId;
            } 

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(Long customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public VideoInfo build() {
                return new VideoInfo(this);
            } 

        } 

    }
}
