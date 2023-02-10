// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotPresetRequest</p>
 */
public class UpdateHoneypotPresetRequest extends Request {
    @Query
    @NameInMap("HoneypotImageName")
    private String honeypotImageName;

    @Query
    @NameInMap("HoneypotPresetId")
    @Validation(required = true)
    private String honeypotPresetId;

    @Query
    @NameInMap("Meta")
    private String meta;

    @Query
    @NameInMap("PresetName")
    private String presetName;

    private UpdateHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.honeypotImageName = builder.honeypotImageName;
        this.honeypotPresetId = builder.honeypotPresetId;
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
        private String meta; 
        private String presetName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoneypotPresetRequest request) {
            super(request);
            this.honeypotImageName = request.honeypotImageName;
            this.honeypotPresetId = request.honeypotPresetId;
            this.meta = request.meta;
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
         * The ID of the honeypot template.
         * <p>
         * 
         * > You can call the [ListHoneypotPreset](~~ListHoneypotPreset~~) operation to query the ID of the honeypot template.
         */
        public Builder honeypotPresetId(String honeypotPresetId) {
            this.putQueryParameter("HoneypotPresetId", honeypotPresetId);
            this.honeypotPresetId = honeypotPresetId;
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
