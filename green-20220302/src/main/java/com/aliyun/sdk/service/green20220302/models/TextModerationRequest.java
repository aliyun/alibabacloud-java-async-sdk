// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link TextModerationRequest} extends {@link RequestModel}
 *
 * <p>TextModerationRequest</p>
 */
public class TextModerationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private TextModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextModerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<TextModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(TextModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The type of the moderation service. Valid values: nickname_detection: user nickname chat_detection: chat interactions comment_detection: dynamic comments pgc_detection: professionally-generated content (PGC) teaching materials</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>pgc_detection: moderation of PGC teaching materials</li>
         * <li>nickname_detection: user nickname moderation</li>
         * <li>comment_multilingual_pro: multi-language moderation in international business scenarios</li>
         * <li>chat_detection: moderation of interactive content of private chats</li>
         * <li>ad_compliance_detection: advertising law compliance identification</li>
         * <li>comment_detection: moderation of comment content of public chats</li>
         * <li>ai_art_detection: AI-generated text identfication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nickname_detection</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The parameters required by the moderation service. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content&quot;:&quot;Content to be moderated&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public TextModerationRequest build() {
            return new TextModerationRequest(this);
        } 

    } 

}
