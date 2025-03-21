// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotPresetRequest</p>
 */
public class DeleteHoneypotPresetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotPresetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotPresetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DeleteHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.honeypotPresetId = builder.honeypotPresetId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotPresetRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteHoneypotPresetRequest, Builder> {
        private String honeypotPresetId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotPresetRequest request) {
            super(request);
            this.honeypotPresetId = request.honeypotPresetId;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the honeypot template.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotPreset~~">ListHoneypotPreset</a> operation to query the IDs of honeypot templates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>84104b7b-a2bc-41df-a190-12298f99xxxx</p>
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

        @Override
        public DeleteHoneypotPresetRequest build() {
            return new DeleteHoneypotPresetRequest(this);
        } 

    } 

}
