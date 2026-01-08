// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link OpenChatappServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenChatappServiceResponseBody</p>
 */
public class OpenChatappServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OpenStatus")
    private Boolean openStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OpenChatappServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.openStatus = builder.openStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenChatappServiceResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return openStatus
     */
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Boolean openStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(OpenChatappServiceResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.openStatus = model.openStatus;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * OpenStatus.
         */
        public Builder openStatus(Boolean openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenChatappServiceResponseBody build() {
            return new OpenChatappServiceResponseBody(this);
        } 

    } 

}
