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
 * {@link GetDeviceStatusInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceStatusInfoResponseBody</p>
 */
public class GetDeviceStatusInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetDeviceStatusInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceStatusInfoResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetDeviceStatusInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The error code returned. A value of 200 indicates that the call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return result of invoking this API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0EC7*726E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Detailed information returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDeviceStatusInfoResponseBody build() {
            return new GetDeviceStatusInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceStatusInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceStatusInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Online")
        private Integer online;

        private Result(Builder builder) {
            this.online = builder.online;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return online
         */
        public Integer getOnline() {
            return this.online;
        }

        public static final class Builder {
            private Integer online; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.online = model.online;
            } 

            /**
             * <p>Indicates whether the device is online. A value of 0 means offline, and 1 means online.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder online(Integer online) {
                this.online = online;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
