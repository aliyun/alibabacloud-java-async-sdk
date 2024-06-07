// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTaskMetaCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>SendTaskMetaCallbackResponseBody</p>
 */
public class SendTaskMetaCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("ErrMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Long errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendTaskMetaCallbackResponseBody(Builder builder) {
        this.data = builder.data;
        this.errMsg = builder.errMsg;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTaskMetaCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return errorCode
     */
    public Long getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String errMsg; 
        private Long errorCode; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendTaskMetaCallbackResponseBody build() {
            return new SendTaskMetaCallbackResponseBody(this);
        } 

    } 

}
