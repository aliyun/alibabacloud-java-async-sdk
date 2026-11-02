// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertTransConfig} extends {@link TeaModel}
 *
 * <p>MediaConvertTransConfig</p>
 */
public class MediaConvertTransConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdjDarMethod")
    private String adjDarMethod;

    @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrate")
    private Boolean isCheckAudioBitrate;

    @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrateFail")
    private Boolean isCheckAudioBitrateFail;

    @com.aliyun.core.annotation.NameInMap("IsCheckReso")
    private Boolean isCheckReso;

    @com.aliyun.core.annotation.NameInMap("IsCheckResoFail")
    private Boolean isCheckResoFail;

    @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrate")
    private Boolean isCheckVideoBitrate;

    @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrateFail")
    private Boolean isCheckVideoBitrateFail;

    @com.aliyun.core.annotation.NameInMap("TransMode")
    private String transMode;

    private MediaConvertTransConfig(Builder builder) {
        this.adjDarMethod = builder.adjDarMethod;
        this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
        this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
        this.isCheckReso = builder.isCheckReso;
        this.isCheckResoFail = builder.isCheckResoFail;
        this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
        this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
        this.transMode = builder.transMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertTransConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjDarMethod
     */
    public String getAdjDarMethod() {
        return this.adjDarMethod;
    }

    /**
     * @return isCheckAudioBitrate
     */
    public Boolean getIsCheckAudioBitrate() {
        return this.isCheckAudioBitrate;
    }

    /**
     * @return isCheckAudioBitrateFail
     */
    public Boolean getIsCheckAudioBitrateFail() {
        return this.isCheckAudioBitrateFail;
    }

    /**
     * @return isCheckReso
     */
    public Boolean getIsCheckReso() {
        return this.isCheckReso;
    }

    /**
     * @return isCheckResoFail
     */
    public Boolean getIsCheckResoFail() {
        return this.isCheckResoFail;
    }

    /**
     * @return isCheckVideoBitrate
     */
    public Boolean getIsCheckVideoBitrate() {
        return this.isCheckVideoBitrate;
    }

    /**
     * @return isCheckVideoBitrateFail
     */
    public Boolean getIsCheckVideoBitrateFail() {
        return this.isCheckVideoBitrateFail;
    }

    /**
     * @return transMode
     */
    public String getTransMode() {
        return this.transMode;
    }

    public static final class Builder {
        private String adjDarMethod; 
        private Boolean isCheckAudioBitrate; 
        private Boolean isCheckAudioBitrateFail; 
        private Boolean isCheckReso; 
        private Boolean isCheckResoFail; 
        private Boolean isCheckVideoBitrate; 
        private Boolean isCheckVideoBitrateFail; 
        private String transMode; 

        private Builder() {
        } 

        private Builder(MediaConvertTransConfig model) {
            this.adjDarMethod = model.adjDarMethod;
            this.isCheckAudioBitrate = model.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = model.isCheckAudioBitrateFail;
            this.isCheckReso = model.isCheckReso;
            this.isCheckResoFail = model.isCheckResoFail;
            this.isCheckVideoBitrate = model.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = model.isCheckVideoBitrateFail;
            this.transMode = model.transMode;
        } 

        /**
         * <p>The method for adjusting the resolution. This parameter takes effect only if both the Width and Height parameters are specified. You can use this parameter together with the LongShortMode parameter.</p>
         * <ul>
         * <li>Valid values: rescale, crop, pad, and none.</li>
         * <li>Default value: none.</li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rescale</p>
         */
        public Builder adjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }

        /**
         * <p>Specifies whether to check the audio bitrate. Mutually exclusive with IsCheckVideoBitrateFail. IsCheckVideoBitrateFail has a higher priority.</p>
         * <ul>
         * <li><p>true: checks the audio bitrate. If the source bitrate is lower than the target, the task will transcode using the source bitrate.</p>
         * </li>
         * <li><p>false: does not check the audio bitrate.</p>
         * </li>
         * <li><p>Default value:</p>
         * <ul>
         * <li>If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.</li>
         * <li>If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
         * </ul>
         * </li>
         * </ul>
         */
        public Builder isCheckAudioBitrate(Boolean isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }

        /**
         * <p>Specifies whether to check the audio bitrate. Mutually exclusive with IsCheckAudioBitrate. This parameter has a higher priority.</p>
         * <ul>
         * <li>true: checks the audio bitrate. If the source bitrate is lower than the target, the task will fail.</li>
         * <li>false: does not check the audio bitrate.</li>
         * <li>Default value: false.</li>
         * </ul>
         */
        public Builder isCheckAudioBitrateFail(Boolean isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }

        /**
         * <p>Specifies whether to check the video resolution. Mutually exclusive with IsCheckResoFail. IsCheckResoFail has a higher priority.</p>
         * <ul>
         * <li>true: checks the video resolution. If the source resolution (width or height) is smaller than the target, the task will transcode using the source resolution.</li>
         * <li>false: does not check the video resolution.</li>
         * <li>Default value: false.</li>
         * </ul>
         */
        public Builder isCheckReso(Boolean isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }

        /**
         * <p>Specifies whether to check the video resolution. Mutually exclusive with IsCheckReso. This parameter has a higher priority.</p>
         * <ul>
         * <li>true: checks the video resolution. If the source resolution (width or height) is smaller than the target, the task will fail.</li>
         * <li>false: does not check the video resolution.</li>
         * <li>Default value: false.</li>
         * </ul>
         */
        public Builder isCheckResoFail(Boolean isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }

        /**
         * <p>Specifies whether to check the video bitrate. Mutually exclusive with IsCheckVideoBitrateFail. IsCheckVideoBitrateFail has a higher priority.</p>
         * <ul>
         * <li>true: checks the video bitrate. If the source bitrate is lower than the target, the task will transcode using the source bitrate.</li>
         * <li>false: does not check the video bitrate.</li>
         * <li>Default value: false.</li>
         * </ul>
         */
        public Builder isCheckVideoBitrate(Boolean isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }

        /**
         * <p>Specifies whether to check the video bitrate. Mutually exclusive with IsCheckVideoBitrate. This parameter has a higher priority.</p>
         * <ul>
         * <li>true: checks the video bitrate. If the source bitrate is lower than the target, the task will fail.</li>
         * <li>false: does not check the video bitrate.</li>
         * <li>Default value: false.</li>
         * </ul>
         */
        public Builder isCheckVideoBitrateFail(Boolean isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }

        /**
         * <p>The video bitrate control mode. This is only valid for H.264, H.265, and AV1 codecs and must be used with the correct Bitrate or Crf settings. Valid values:</p>
         * <ul>
         * <li>CBR: Constant bitrate mode.</li>
         * <li>onepass: Typically used for Average bitrate mode (ABR). Faster than twopass.</li>
         * <li>twopass: Typically used for variable bitrate mode (VBR). Slower than onepass.</li>
         * <li>fixCRF: Constant Rate Factor (quality-based) mode.</li>
         * <li>If you specify the Bitrate parameter, the default value of this parameter is onepass. If you do not specify the Bitrate parameter, the default value of this parameter is fixCRF, and the default value of the Crf parameter is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
        public Builder transMode(String transMode) {
            this.transMode = transMode;
            return this;
        }

        public MediaConvertTransConfig build() {
            return new MediaConvertTransConfig(this);
        } 

    } 

}
