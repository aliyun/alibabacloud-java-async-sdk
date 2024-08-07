// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotPresetRequest</p>
 */
public class UpdateHoneypotPresetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
    private String honeypotImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotPresetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotPresetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Meta")
    private String meta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PresetName")
    private String presetName;

    private UpdateHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.honeypotImageName = builder.honeypotImageName;
        this.honeypotPresetId = builder.honeypotPresetId;
        this.lang = builder.lang;
        this.meta = builder.meta;
        this.presetName = builder.presetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHoneypotPresetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotImageName
     */
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    /**
     * @return honeypotPresetId
     */
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return meta
     */
    public String getMeta() {
        return this.meta;
    }

    /**
     * @return presetName
     */
    public String getPresetName() {
        return this.presetName;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotPresetRequest, Builder> {
        private String honeypotImageName; 
        private String honeypotPresetId; 
        private String lang; 
        private String meta; 
        private String presetName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoneypotPresetRequest request) {
            super(request);
            this.honeypotImageName = request.honeypotImageName;
            this.honeypotPresetId = request.honeypotPresetId;
            this.lang = request.lang;
            this.meta = request.meta;
            this.presetName = request.presetName;
        } 

        /**
         * The name of the image that is used for the honeypot.
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * The ID of the honeypot template.
         * <p>
         * 
         * > You can call the [ListHoneypotPreset](~~ListHoneypotPreset~~) operation to query the IDs of honeypot templates.
         */
        public Builder honeypotPresetId(String honeypotPresetId) {
            this.putQueryParameter("HoneypotPresetId", honeypotPresetId);
            this.honeypotPresetId = honeypotPresetId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The custom configurations of the honeypot template. The value is a JSON string that contains the following fields:
         * <p>
         * 
         * *   **portrait_option**: Social Source Tracing
         * *   **burp**: Burp-specific Defense
         * *   **trojan_git**: Git-specific Defense
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * The custom name of the honeypot template.
         */
        public Builder presetName(String presetName) {
            this.putQueryParameter("PresetName", presetName);
            this.presetName = presetName;
            return this;
        }

        @Override
        public UpdateHoneypotPresetRequest build() {
            return new UpdateHoneypotPresetRequest(this);
        } 

    } 

}
