// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The name of the image that is used for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>metabase</p>
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * <p>The ID of the honeypot template.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotPreset~~">ListHoneypotPreset</a> operation to query the IDs of honeypot templates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f75eddce-e9d3-4a88-af95-b10b6f65xxxx</p>
         */
        public Builder honeypotPresetId(String honeypotPresetId) {
            this.putQueryParameter("HoneypotPresetId", honeypotPresetId);
            this.honeypotPresetId = honeypotPresetId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The custom configurations of the honeypot template. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><strong>portrait_option</strong>: Social Source Tracing</li>
         * <li><strong>burp</strong>: Burp-specific Defense</li>
         * <li><strong>trojan_git</strong>: Git-specific Defense</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;portrait_option&quot;:true,&quot;burp&quot;:&quot;open&quot;}</p>
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * <p>The custom name of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>apc_web_python</p>
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
