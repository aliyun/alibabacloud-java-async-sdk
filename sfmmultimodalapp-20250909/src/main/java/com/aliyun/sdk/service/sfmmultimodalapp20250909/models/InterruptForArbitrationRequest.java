// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link InterruptForArbitrationRequest} extends {@link RequestModel}
 *
 * <p>InterruptForArbitrationRequest</p>
 */
public class InterruptForArbitrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HubRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hubRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interrupt")
    @com.aliyun.core.annotation.Validation(required = true)
    private Interrupt interrupt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private InterruptForArbitrationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.chatId = builder.chatId;
        this.hubRequestId = builder.hubRequestId;
        this.interrupt = builder.interrupt;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InterruptForArbitrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return hubRequestId
     */
    public String getHubRequestId() {
        return this.hubRequestId;
    }

    /**
     * @return interrupt
     */
    public Interrupt getInterrupt() {
        return this.interrupt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<InterruptForArbitrationRequest, Builder> {
        private String appId; 
        private String chatId; 
        private String hubRequestId; 
        private Interrupt interrupt; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(InterruptForArbitrationRequest request) {
            super(request);
            this.appId = request.appId;
            this.chatId = request.chatId;
            this.hubRequestId = request.hubRequestId;
            this.interrupt = request.interrupt;
            this.sessionId = request.sessionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>chatId</p>
         * 
         * <strong>example:</strong>
         * <p>d484ce8f-5337-44d4-80b9-e346ba6741fa</p>
         */
        public Builder chatId(String chatId) {
            this.putQueryParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder hubRequestId(String hubRequestId) {
            this.putQueryParameter("HubRequestId", hubRequestId);
            this.hubRequestId = hubRequestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder interrupt(Interrupt interrupt) {
            String interruptShrink = shrink(interrupt, "Interrupt", "json");
            this.putQueryParameter("Interrupt", interruptShrink);
            this.interrupt = interrupt;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public InterruptForArbitrationRequest build() {
            return new InterruptForArbitrationRequest(this);
        } 

    } 

    /**
     * 
     * {@link InterruptForArbitrationRequest} extends {@link TeaModel}
     *
     * <p>InterruptForArbitrationRequest</p>
     */
    public static class Interrupt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Submit")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean submit;

        private Interrupt(Builder builder) {
            this.submit = builder.submit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Interrupt create() {
            return builder().build();
        }

        /**
         * @return submit
         */
        public Boolean getSubmit() {
            return this.submit;
        }

        public static final class Builder {
            private Boolean submit; 

            private Builder() {
            } 

            private Builder(Interrupt model) {
                this.submit = model.submit;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder submit(Boolean submit) {
                this.submit = submit;
                return this;
            }

            public Interrupt build() {
                return new Interrupt(this);
            } 

        } 

    }
}
