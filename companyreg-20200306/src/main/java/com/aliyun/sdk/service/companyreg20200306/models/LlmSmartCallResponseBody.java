// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link LlmSmartCallResponseBody} extends {@link TeaModel}
 *
 * <p>LlmSmartCallResponseBody</p>
 */
public class LlmSmartCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallRecordId")
    private String callRecordId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private LlmSmartCallResponseBody(Builder builder) {
        this.callRecordId = builder.callRecordId;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmSmartCallResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callRecordId
     */
    public String getCallRecordId() {
        return this.callRecordId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String callRecordId; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(LlmSmartCallResponseBody model) {
            this.callRecordId = model.callRecordId;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * CallRecordId.
         */
        public Builder callRecordId(String callRecordId) {
            this.callRecordId = callRecordId;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5D8BD6E8-28D9-5451-BBA1-3D3DCA6971F6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public LlmSmartCallResponseBody build() {
            return new LlmSmartCallResponseBody(this);
        } 

    } 

}
