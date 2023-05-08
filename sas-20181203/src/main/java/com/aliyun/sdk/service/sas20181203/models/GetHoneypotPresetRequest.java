// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotPresetRequest</p>
 */
public class GetHoneypotPresetRequest extends Request {
    @Query
    @NameInMap("HoneypotPresetId")
    @Validation(required = true)
    private String honeypotPresetId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private GetHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.honeypotPresetId = builder.honeypotPresetId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotPresetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetHoneypotPresetRequest, Builder> {
        private String honeypotPresetId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetHoneypotPresetRequest request) {
            super(request);
            this.honeypotPresetId = request.honeypotPresetId;
            this.lang = request.lang;
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
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetHoneypotPresetRequest build() {
            return new GetHoneypotPresetRequest(this);
        } 

    } 

}
