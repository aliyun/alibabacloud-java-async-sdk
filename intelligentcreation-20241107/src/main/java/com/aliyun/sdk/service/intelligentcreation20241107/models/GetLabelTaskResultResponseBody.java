// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20241107.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLabelTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetLabelTaskResultResponseBody</p>
 */
public class GetLabelTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultDataUrl")
    private String resultDataUrl;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tokens")
    private Long tokens;

    private GetLabelTaskResultResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultDataUrl = builder.resultDataUrl;
        this.status = builder.status;
        this.tokens = builder.tokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLabelTaskResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultDataUrl
     */
    public String getResultDataUrl() {
        return this.resultDataUrl;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tokens
     */
    public Long getTokens() {
        return this.tokens;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String resultDataUrl; 
        private String status; 
        private Long tokens; 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultDataUrl.
         */
        public Builder resultDataUrl(String resultDataUrl) {
            this.resultDataUrl = resultDataUrl;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tokens.
         */
        public Builder tokens(Long tokens) {
            this.tokens = tokens;
            return this;
        }

        public GetLabelTaskResultResponseBody build() {
            return new GetLabelTaskResultResponseBody(this);
        } 

    } 

}
