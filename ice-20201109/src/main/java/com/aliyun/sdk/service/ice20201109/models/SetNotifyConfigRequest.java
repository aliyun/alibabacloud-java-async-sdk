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
 * {@link SetNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>SetNotifyConfigRequest</p>
 */
public class SetNotifyConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNotify")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableNotify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private String eventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private SetNotifyConfigRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.callbackUrl = builder.callbackUrl;
        this.enableNotify = builder.enableNotify;
        this.eventTypes = builder.eventTypes;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetNotifyConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return enableNotify
     */
    public Boolean getEnableNotify() {
        return this.enableNotify;
    }

    /**
     * @return eventTypes
     */
    public String getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<SetNotifyConfigRequest, Builder> {
        private String AIAgentId; 
        private String callbackUrl; 
        private Boolean enableNotify; 
        private String eventTypes; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(SetNotifyConfigRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.callbackUrl = request.callbackUrl;
            this.enableNotify = request.enableNotify;
            this.eventTypes = request.eventTypes;
            this.token = request.token;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableNotify(Boolean enableNotify) {
            this.putQueryParameter("EnableNotify", enableNotify);
            this.enableNotify = enableNotify;
            return this;
        }

        /**
         * EventTypes.
         */
        public Builder eventTypes(String eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public SetNotifyConfigRequest build() {
            return new SetNotifyConfigRequest(this);
        } 

    } 

}
