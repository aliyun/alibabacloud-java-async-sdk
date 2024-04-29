// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotPresetRequest</p>
 */
public class CreateHoneypotPresetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Meta")
    @com.aliyun.core.annotation.Validation(required = true)
    private String meta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PresetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String presetName;

    private CreateHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.honeypotImageName = builder.honeypotImageName;
        this.lang = builder.lang;
        this.meta = builder.meta;
        this.nodeId = builder.nodeId;
        this.presetName = builder.presetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotPresetRequest create() {
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return presetName
     */
    public String getPresetName() {
        return this.presetName;
    }

    public static final class Builder extends Request.Builder<CreateHoneypotPresetRequest, Builder> {
        private String honeypotImageName; 
        private String lang; 
        private String meta; 
        private String nodeId; 
        private String presetName; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoneypotPresetRequest request) {
            super(request);
            this.honeypotImageName = request.honeypotImageName;
            this.lang = request.lang;
            this.meta = request.meta;
            this.nodeId = request.nodeId;
            this.presetName = request.presetName;
        } 

        /**
         * The name of the honeypot image.
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
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
         * The ID of the management node to which you want to deploy honeypots.
         * <p>
         * 
         * > You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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
        public CreateHoneypotPresetRequest build() {
            return new CreateHoneypotPresetRequest(this);
        } 

    } 

}
