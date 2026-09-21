// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyAppPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppPolicyRequest</p>
 */
public class ModifyAppPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoPolicy")
    private VideoPolicy videoPolicy;

    private ModifyAppPolicyRequest(Builder builder) {
        super(builder);
        this.appPolicyId = builder.appPolicyId;
        this.productType = builder.productType;
        this.videoPolicy = builder.videoPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appPolicyId
     */
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return videoPolicy
     */
    public VideoPolicy getVideoPolicy() {
        return this.videoPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyAppPolicyRequest, Builder> {
        private String appPolicyId; 
        private String productType; 
        private VideoPolicy videoPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppPolicyRequest request) {
            super(request);
            this.appPolicyId = request.appPolicyId;
            this.productType = request.productType;
            this.videoPolicy = request.videoPolicy;
        } 

        /**
         * <p>The policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-ee2znjktwgxu2****</p>
         */
        public Builder appPolicyId(String appPolicyId) {
            this.putQueryParameter("AppPolicyId", appPolicyId);
            this.appPolicyId = appPolicyId;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The display policy.</p>
         */
        public Builder videoPolicy(VideoPolicy videoPolicy) {
            String videoPolicyShrink = shrink(videoPolicy, "VideoPolicy", "json");
            this.putQueryParameter("VideoPolicy", videoPolicyShrink);
            this.videoPolicy = videoPolicy;
            return this;
        }

        @Override
        public ModifyAppPolicyRequest build() {
            return new ModifyAppPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppPolicyRequest</p>
     */
    public static class VideoPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Integer frameRate;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionHeight")
        private Integer sessionResolutionHeight;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionWidth")
        private Integer sessionResolutionWidth;

        @com.aliyun.core.annotation.NameInMap("StreamingMode")
        private String streamingMode;

        @com.aliyun.core.annotation.NameInMap("TerminalResolutionAdaptive")
        private Boolean terminalResolutionAdaptive;

        @com.aliyun.core.annotation.NameInMap("VisualQualityStrategy")
        private String visualQualityStrategy;

        @com.aliyun.core.annotation.NameInMap("Webrtc")
        private Boolean webrtc;

        private VideoPolicy(Builder builder) {
            this.frameRate = builder.frameRate;
            this.sessionResolutionHeight = builder.sessionResolutionHeight;
            this.sessionResolutionWidth = builder.sessionResolutionWidth;
            this.streamingMode = builder.streamingMode;
            this.terminalResolutionAdaptive = builder.terminalResolutionAdaptive;
            this.visualQualityStrategy = builder.visualQualityStrategy;
            this.webrtc = builder.webrtc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPolicy create() {
            return builder().build();
        }

        /**
         * @return frameRate
         */
        public Integer getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return sessionResolutionHeight
         */
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        /**
         * @return sessionResolutionWidth
         */
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        /**
         * @return streamingMode
         */
        public String getStreamingMode() {
            return this.streamingMode;
        }

        /**
         * @return terminalResolutionAdaptive
         */
        public Boolean getTerminalResolutionAdaptive() {
            return this.terminalResolutionAdaptive;
        }

        /**
         * @return visualQualityStrategy
         */
        public String getVisualQualityStrategy() {
            return this.visualQualityStrategy;
        }

        /**
         * @return webrtc
         */
        public Boolean getWebrtc() {
            return this.webrtc;
        }

        public static final class Builder {
            private Integer frameRate; 
            private Integer sessionResolutionHeight; 
            private Integer sessionResolutionWidth; 
            private String streamingMode; 
            private Boolean terminalResolutionAdaptive; 
            private String visualQualityStrategy; 
            private Boolean webrtc; 

            private Builder() {
            } 

            private Builder(VideoPolicy model) {
                this.frameRate = model.frameRate;
                this.sessionResolutionHeight = model.sessionResolutionHeight;
                this.sessionResolutionWidth = model.sessionResolutionWidth;
                this.streamingMode = model.streamingMode;
                this.terminalResolutionAdaptive = model.terminalResolutionAdaptive;
                this.visualQualityStrategy = model.visualQualityStrategy;
                this.webrtc = model.webrtc;
            } 

            /**
             * <p>The frame rate (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * <p>The height of the resolution, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder sessionResolutionHeight(Integer sessionResolutionHeight) {
                this.sessionResolutionHeight = sessionResolutionHeight;
                return this;
            }

            /**
             * <p>The width of the resolution, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder sessionResolutionWidth(Integer sessionResolutionWidth) {
                this.sessionResolutionWidth = sessionResolutionWidth;
                return this;
            }

            /**
             * <p>The streaming mode. Used together with the Webrtc parameter to specify the protocol type.</p>
             * <ul>
             * <li>Webrtc=<code>true</code> and StreamingMode=<code>video</code>: WebRTC stream.</li>
             * <li>Webrtc=<code>false</code> and StreamingMode=<code>video</code>: video stream.</li>
             * <li>Webrtc=<code>false</code> and StreamingMode=<code>mix</code>: mixed stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * <p>Specifies whether to use adaptive resolution.</p>
             * <ul>
             * <li><p><code>true</code>: The session resolution follows changes in the terminal display area. In this case, SessionResolutionWidth and SessionResolutionHeight specify the maximum resolution values.</p>
             * </li>
             * <li><p><code>false</code>: The session resolution does not follow changes in the terminal display area. In this case, the resolution is fixed to the values of SessionResolutionWidth and SessionResolutionHeight.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder terminalResolutionAdaptive(Boolean terminalResolutionAdaptive) {
                this.terminalResolutionAdaptive = terminalResolutionAdaptive;
                return this;
            }

            /**
             * <p>The visual quality strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>smooth</p>
             */
            public Builder visualQualityStrategy(String visualQualityStrategy) {
                this.visualQualityStrategy = visualQualityStrategy;
                return this;
            }

            /**
             * <p>Specifies whether to enable WebRTC. Used together with the StreamingMode parameter to specify the protocol type.</p>
             * <ul>
             * <li>Webrtc=<code>true</code> and StreamingMode=<code>video</code>: WebRTC stream.</li>
             * <li>Webrtc=<code>false</code> and StreamingMode=<code>video</code>: video stream.</li>
             * <li>Webrtc=<code>false</code> and StreamingMode=<code>mix</code>: mixed stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder webrtc(Boolean webrtc) {
                this.webrtc = webrtc;
                return this;
            }

            public VideoPolicy build() {
                return new VideoPolicy(this);
            } 

        } 

    }
}
