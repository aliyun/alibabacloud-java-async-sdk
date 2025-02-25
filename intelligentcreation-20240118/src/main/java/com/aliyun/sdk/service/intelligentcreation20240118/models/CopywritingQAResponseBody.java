// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopywritingQAResponseBody} extends {@link TeaModel}
 *
 * <p>CopywritingQAResponseBody</p>
 */
public class CopywritingQAResponseBody extends TeaModel {
    @NameInMap("content")
    private String content;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("sessionId")
    private String sessionId;

    @NameInMap("success")
    private Boolean success;

    private CopywritingQAResponseBody(Builder builder) {
        this.content = builder.content;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.sessionId = builder.sessionId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopywritingQAResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String content; 
        private String errorCode; 
        private String errorMessage; 
        private String sessionId; 
        private Boolean success; 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CopywritingQAResponseBody build() {
            return new CopywritingQAResponseBody(this);
        } 

    } 

}
