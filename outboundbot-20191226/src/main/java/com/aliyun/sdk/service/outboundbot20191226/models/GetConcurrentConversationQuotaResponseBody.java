// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetConcurrentConversationQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetConcurrentConversationQuotaResponseBody</p>
 */
public class GetConcurrentConversationQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
    private Integer maxConcurrent;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RemainingConcurrent")
    private Integer remainingConcurrent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConcurrentConversationQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxConcurrent = builder.maxConcurrent;
        this.message = builder.message;
        this.remainingConcurrent = builder.remainingConcurrent;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConcurrentConversationQuotaResponseBody create() {
        return builder().build();
    }

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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxConcurrent
     */
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return remainingConcurrent
     */
    public Integer getRemainingConcurrent() {
        return this.remainingConcurrent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private Integer maxConcurrent; 
        private String message; 
        private Integer remainingConcurrent; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetConcurrentConversationQuotaResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.maxConcurrent = model.maxConcurrent;
            this.message = model.message;
            this.remainingConcurrent = model.remainingConcurrent;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>maxConcurrent</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxConcurrent(Integer maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RemainingConcurrent.
         */
        public Builder remainingConcurrent(Integer remainingConcurrent) {
            this.remainingConcurrent = remainingConcurrent;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConcurrentConversationQuotaResponseBody build() {
            return new GetConcurrentConversationQuotaResponseBody(this);
        } 

    } 

}
