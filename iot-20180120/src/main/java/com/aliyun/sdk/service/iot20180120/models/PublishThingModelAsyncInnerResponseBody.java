// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link PublishThingModelAsyncInnerResponseBody} extends {@link TeaModel}
 *
 * <p>PublishThingModelAsyncInnerResponseBody</p>
 */
public class PublishThingModelAsyncInnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("LocalizedMsg")
    private String localizedMsg;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PublishThingModelAsyncInnerResponseBody(Builder builder) {
        this.code = builder.code;
        this.localizedMsg = builder.localizedMsg;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishThingModelAsyncInnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return localizedMsg
     */
    public String getLocalizedMsg() {
        return this.localizedMsg;
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

    public static final class Builder {
        private Integer code; 
        private String localizedMsg; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PublishThingModelAsyncInnerResponseBody model) {
            this.code = model.code;
            this.localizedMsg = model.localizedMsg;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * LocalizedMsg.
         */
        public Builder localizedMsg(String localizedMsg) {
            this.localizedMsg = localizedMsg;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishThingModelAsyncInnerResponseBody build() {
            return new PublishThingModelAsyncInnerResponseBody(this);
        } 

    } 

}
