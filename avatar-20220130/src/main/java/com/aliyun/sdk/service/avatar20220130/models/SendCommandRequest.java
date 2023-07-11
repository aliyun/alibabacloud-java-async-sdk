// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCommandRequest} extends {@link RequestModel}
 *
 * <p>SendCommandRequest</p>
 */
public class SendCommandRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("Content")
    private java.util.Map < String, ? > content;

    @Query
    @NameInMap("Feedback")
    private Boolean feedback;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("UniqueCode")
    @Validation(required = true)
    private String uniqueCode;

    private SendCommandRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.content = builder.content;
        this.feedback = builder.feedback;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.uniqueCode = builder.uniqueCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return feedback
     */
    public Boolean getFeedback() {
        return this.feedback;
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
     * @return uniqueCode
     */
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public static final class Builder extends Request.Builder<SendCommandRequest, Builder> {
        private String code; 
        private java.util.Map < String, ? > content; 
        private Boolean feedback; 
        private String sessionId; 
        private Long tenantId; 
        private String uniqueCode; 

        private Builder() {
            super();
        } 

        private Builder(SendCommandRequest request) {
            super(request);
            this.code = request.code;
            this.content = request.content;
            this.feedback = request.feedback;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
            this.uniqueCode = request.uniqueCode;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(java.util.Map < String, ? > content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
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
         * UniqueCode.
         */
        public Builder uniqueCode(String uniqueCode) {
            this.putQueryParameter("UniqueCode", uniqueCode);
            this.uniqueCode = uniqueCode;
            return this;
        }

        @Override
        public SendCommandRequest build() {
            return new SendCommandRequest(this);
        } 

    } 

}
