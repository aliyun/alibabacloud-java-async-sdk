// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTextRequest} extends {@link RequestModel}
 *
 * <p>SendTextRequest</p>
 */
public class SendTextRequest extends Request {
    @Query
    @NameInMap("Feedback")
    private Boolean feedback;

    @Query
    @NameInMap("Interrupt")
    private Boolean interrupt;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Query
    @NameInMap("StreamExtension")
    private StreamExtension streamExtension;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    @Query
    @NameInMap("UniqueCode")
    @Validation(required = true)
    private String uniqueCode;

    private SendTextRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.interrupt = builder.interrupt;
        this.sessionId = builder.sessionId;
        this.streamExtension = builder.streamExtension;
        this.tenantId = builder.tenantId;
        this.text = builder.text;
        this.uniqueCode = builder.uniqueCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedback
     */
    public Boolean getFeedback() {
        return this.feedback;
    }

    /**
     * @return interrupt
     */
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return streamExtension
     */
    public StreamExtension getStreamExtension() {
        return this.streamExtension;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return uniqueCode
     */
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public static final class Builder extends Request.Builder<SendTextRequest, Builder> {
        private Boolean feedback; 
        private Boolean interrupt; 
        private String sessionId; 
        private StreamExtension streamExtension; 
        private Long tenantId; 
        private String text; 
        private String uniqueCode; 

        private Builder() {
            super();
        } 

        private Builder(SendTextRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.interrupt = request.interrupt;
            this.sessionId = request.sessionId;
            this.streamExtension = request.streamExtension;
            this.tenantId = request.tenantId;
            this.text = request.text;
            this.uniqueCode = request.uniqueCode;
        } 

        /**
         * Feedback.
         */
        public Builder feedback(Boolean feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * Interrupt.
         */
        public Builder interrupt(Boolean interrupt) {
            this.putQueryParameter("Interrupt", interrupt);
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

        /**
         * StreamExtension.
         */
        public Builder streamExtension(StreamExtension streamExtension) {
            String streamExtensionShrink = shrink(streamExtension, "StreamExtension", "json");
            this.putQueryParameter("StreamExtension", streamExtensionShrink);
            this.streamExtension = streamExtension;
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
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * UniqueCode.
         */
        public Builder uniqueCode(String uniqueCode) {
            this.putQueryParameter("UniqueCode", uniqueCode);
            this.uniqueCode = uniqueCode;
            return this;
        }

        @Override
        public SendTextRequest build() {
            return new SendTextRequest(this);
        } 

    } 

    public static class StreamExtension extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("IsStream")
        private Boolean isStream;

        @NameInMap("Position")
        private String position;

        private StreamExtension(Builder builder) {
            this.index = builder.index;
            this.isStream = builder.isStream;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamExtension create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return isStream
         */
        public Boolean getIsStream() {
            return this.isStream;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Integer index; 
            private Boolean isStream; 
            private String position; 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * IsStream.
             */
            public Builder isStream(Boolean isStream) {
                this.isStream = isStream;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            public StreamExtension build() {
                return new StreamExtension(this);
            } 

        } 

    }
}
