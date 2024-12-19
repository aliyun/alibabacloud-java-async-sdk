// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ReleaseMovieSeatResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseMovieSeatResponseBody</p>
 */
public class ReleaseMovieSeatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionResult")
    private ActionResult actionResult;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReleaseMovieSeatResponseBody(Builder builder) {
        this.actionResult = builder.actionResult;
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseMovieSeatResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionResult
     */
    public ActionResult getActionResult() {
        return this.actionResult;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
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
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private ActionResult actionResult; 
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * ActionResult.
         */
        public Builder actionResult(ActionResult actionResult) {
            this.actionResult = actionResult;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReleaseMovieSeatResponseBody build() {
            return new ReleaseMovieSeatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReleaseMovieSeatResponseBody} extends {@link TeaModel}
     *
     * <p>ReleaseMovieSeatResponseBody</p>
     */
    public static class ActionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReturnCode")
        private String returnCode;

        @com.aliyun.core.annotation.NameInMap("ReturnMessage")
        private String returnMessage;

        @com.aliyun.core.annotation.NameInMap("ReturnValue")
        private String returnValue;

        private ActionResult(Builder builder) {
            this.returnCode = builder.returnCode;
            this.returnMessage = builder.returnMessage;
            this.returnValue = builder.returnValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionResult create() {
            return builder().build();
        }

        /**
         * @return returnCode
         */
        public String getReturnCode() {
            return this.returnCode;
        }

        /**
         * @return returnMessage
         */
        public String getReturnMessage() {
            return this.returnMessage;
        }

        /**
         * @return returnValue
         */
        public String getReturnValue() {
            return this.returnValue;
        }

        public static final class Builder {
            private String returnCode; 
            private String returnMessage; 
            private String returnValue; 

            /**
             * ReturnCode.
             */
            public Builder returnCode(String returnCode) {
                this.returnCode = returnCode;
                return this;
            }

            /**
             * ReturnMessage.
             */
            public Builder returnMessage(String returnMessage) {
                this.returnMessage = returnMessage;
                return this;
            }

            /**
             * ReturnValue.
             */
            public Builder returnValue(String returnValue) {
                this.returnValue = returnValue;
                return this;
            }

            public ActionResult build() {
                return new ActionResult(this);
            } 

        } 

    }
}
