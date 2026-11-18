// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoRenderJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoRenderJobRequest</p>
 */
public class SubmitVideoRenderJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Script")
    private String script;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Settings")
    private String settings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoRenderJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.script = builder.script;
        this.settings = builder.settings;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoRenderJobRequest create() {
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
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return settings
     */
    public String getSettings() {
        return this.settings;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitVideoRenderJobRequest, Builder> {
        private String regionId; 
        private String script; 
        private String settings; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoRenderJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.script = request.script;
            this.settings = request.settings;
            this.userData = request.userData;
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
         * <p>The complete creative script confirmed or edited by the user, formatted as a JSON string. The structure must align with the JSON content in the Result file returned by the GetRemakeScriptJob API.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;schemaVersion&quot;:&quot;creative/v1&quot;,
         * &quot;algoResult&quot;:{...},
         * &quot;extraInfo&quot;:{...}
         * }</p>
         */
        public Builder script(String script) {
            this.putQueryParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * <p>The rendering settings, formatted as a JSON string.</p>
         * <ul>
         * <li><strong>Resolution</strong> (String, required): The resolution. Valid values: 720P and 1080P.<ul>
         * <li><p><strong>AspectRatio</strong> (String, optional): The video aspect ratio. Valid values: 9:16, 16:9, and 1:1. Default value: 9:16.</p>
         * </li>
         * <li><p><strong>VoiceoverLanguage</strong> (String, optional): The voiceover language. Valid values: zh (Chinese), en (English), es (Spanish), pt (Portuguese), fr (French), de (German), ja (Japanese), ko (Korean), and ar (Arabic). Default value: zh.</p>
         * </li>
         * <li><p><strong>WithSubtitles</strong> (Boolean, optional): Specifies whether to generate subtitles. Default value: true.</p>
         * </li>
         * <li><p><strong>TTS</strong> (Object, optional): The text-to-speech (TTS) configuration. If you do not specify this parameter, the default voice is used. This parameter applies only to single-person and voiceover-only scenarios.</p>
         * <ul>
         * <li><strong>VoiceUrl</strong> (String, optional): The URL of the voice file, which must be an HTTP or HTTPS address. If specified, this voice is used for the voiceover throughout the entire video.</li>
         * </ul>
         * </li>
         * <li><p><strong>Bgm</strong> (String, optional): The URL or 32-character media asset ID of the background music.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;VoiceoverLanguage&quot;: &quot;zh&quot;,
         *   &quot;Resolution&quot;: &quot;1080P&quot;,
         *   &quot;AspectRatio&quot;: &quot;9:16&quot;,
         *   &quot;TTS&quot;: {
         *     &quot;VoiceUrl&quot;: &quot;<a href="http://xxx.mp3">http://xxx.mp3</a>&quot;
         *   },
         *   &quot;WithSubtitles&quot;: true,
         *   &quot;Bgm&quot;: &quot;<a href="http://xxx.mp3">http://xxx.mp3</a>&quot;
         * }</p>
         */
        public Builder settings(String settings) {
            this.putQueryParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * <p>The user-defined parameters, formatted as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoRenderJobRequest build() {
            return new SubmitVideoRenderJobRequest(this);
        } 

    } 

}
