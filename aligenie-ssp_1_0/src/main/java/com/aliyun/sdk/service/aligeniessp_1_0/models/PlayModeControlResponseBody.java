// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link PlayModeControlResponseBody} extends {@link TeaModel}
 *
 * <p>PlayModeControlResponseBody</p>
 */
public class PlayModeControlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private PlayModeControlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayModeControlResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String success; 

        private Builder() {
        } 

        private Builder(PlayModeControlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Return code of the invocation</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information, typically used to briefly describe a failed invocation to help the caller troubleshoot the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10002398812</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Actual return result of the service</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the invocation succeeded. true indicates success, and false indicates failure. When the value is false, check the Message field for details.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public PlayModeControlResponseBody build() {
            return new PlayModeControlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PlayModeControlResponseBody} extends {@link TeaModel}
     *
     * <p>PlayModeControlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenPlayMode")
        private String openPlayMode;

        private Result(Builder builder) {
            this.openPlayMode = builder.openPlayMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return openPlayMode
         */
        public String getOpenPlayMode() {
            return this.openPlayMode;
        }

        public static final class Builder {
            private String openPlayMode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.openPlayMode = model.openPlayMode;
            } 

            /**
             * <p>Playback mode</p>
             * <p>List loop: Repeat; Shuffle: Shuffle; Single-track loop: RepeatOne; NAT mode: Normal;</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder openPlayMode(String openPlayMode) {
                this.openPlayMode = openPlayMode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
