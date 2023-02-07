// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("TenantId")
    private Long tenantId;

    @Query
    @NameInMap("TextRequest")
    private TextRequest textRequest;

    @Query
    @NameInMap("VAMLRequest")
    private VAMLRequest VAMLRequest;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.textRequest = builder.textRequest;
        this.VAMLRequest = builder.VAMLRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return textRequest
     */
    public TextRequest getTextRequest() {
        return this.textRequest;
    }

    /**
     * @return VAMLRequest
     */
    public VAMLRequest getVAMLRequest() {
        return this.VAMLRequest;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String sessionId; 
        private Long tenantId; 
        private TextRequest textRequest; 
        private VAMLRequest VAMLRequest; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
            this.textRequest = request.textRequest;
            this.VAMLRequest = request.VAMLRequest;
        } 

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TextRequest.
         */
        public Builder textRequest(TextRequest textRequest) {
            String textRequestShrink = shrink(textRequest, "TextRequest", "json");
            this.putQueryParameter("TextRequest", textRequestShrink);
            this.textRequest = textRequest;
            return this;
        }

        /**
         * VAMLRequest.
         */
        public Builder VAMLRequest(VAMLRequest VAMLRequest) {
            String VAMLRequestShrink = shrink(VAMLRequest, "VAMLRequest", "json");
            this.putQueryParameter("VAMLRequest", VAMLRequestShrink);
            this.VAMLRequest = VAMLRequest;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

    public static class TextRequest extends TeaModel {
        @NameInMap("CommandType")
        private String commandType;

        @NameInMap("Id")
        private String id;

        @NameInMap("SpeechText")
        private String speechText;

        @NameInMap("interrupt")
        private Boolean interrupt;

        private TextRequest(Builder builder) {
            this.commandType = builder.commandType;
            this.id = builder.id;
            this.speechText = builder.speechText;
            this.interrupt = builder.interrupt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextRequest create() {
            return builder().build();
        }

        /**
         * @return commandType
         */
        public String getCommandType() {
            return this.commandType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return speechText
         */
        public String getSpeechText() {
            return this.speechText;
        }

        /**
         * @return interrupt
         */
        public Boolean getInterrupt() {
            return this.interrupt;
        }

        public static final class Builder {
            private String commandType; 
            private String id; 
            private String speechText; 
            private Boolean interrupt; 

            /**
             * CommandType.
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * SpeechText.
             */
            public Builder speechText(String speechText) {
                this.speechText = speechText;
                return this;
            }

            /**
             * interrupt.
             */
            public Builder interrupt(Boolean interrupt) {
                this.interrupt = interrupt;
                return this;
            }

            public TextRequest build() {
                return new TextRequest(this);
            } 

        } 

    }
    public static class VAMLRequest extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Vaml")
        private String vaml;

        private VAMLRequest(Builder builder) {
            this.code = builder.code;
            this.vaml = builder.vaml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VAMLRequest create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return vaml
         */
        public String getVaml() {
            return this.vaml;
        }

        public static final class Builder {
            private String code; 
            private String vaml; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Vaml.
             */
            public Builder vaml(String vaml) {
                this.vaml = vaml;
                return this;
            }

            public VAMLRequest build() {
                return new VAMLRequest(this);
            } 

        } 

    }
}
