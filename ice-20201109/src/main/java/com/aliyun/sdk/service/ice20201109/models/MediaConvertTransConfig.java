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
         * AdjDarMethod.
         */
        public Builder adjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }

        /**
         * IsCheckAudioBitrate.
         */
        public Builder isCheckAudioBitrate(Boolean isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }

        /**
         * IsCheckAudioBitrateFail.
         */
        public Builder isCheckAudioBitrateFail(Boolean isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }

        /**
         * IsCheckReso.
         */
        public Builder isCheckReso(Boolean isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }

        /**
         * IsCheckResoFail.
         */
        public Builder isCheckResoFail(Boolean isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }

        /**
         * IsCheckVideoBitrate.
         */
        public Builder isCheckVideoBitrate(Boolean isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }

        /**
         * IsCheckVideoBitrateFail.
         */
        public Builder isCheckVideoBitrateFail(Boolean isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }

        /**
         * TransMode.
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
