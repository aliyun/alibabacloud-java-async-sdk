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
 * {@link ScanCodeBindResponseBody} extends {@link TeaModel}
 *
 * <p>ScanCodeBindResponseBody</p>
 */
public class ScanCodeBindResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ScanCodeBindResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanCodeBindResponseBody create() {
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

        private Builder(ScanCodeBindResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The returned error code. A value of 200 indicates that the invocation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Result message</p>
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
         * <p>686DF82F-45C4-7DF7-8B67-27B91CFD63A9</p>
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

        public ScanCodeBindResponseBody build() {
            return new ScanCodeBindResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ScanCodeBindResponseBody} extends {@link TeaModel}
     *
     * <p>ScanCodeBindResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizGroup")
        private String bizGroup;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        private String userOpenId;

        private Result(Builder builder) {
            this.bizGroup = builder.bizGroup;
            this.bizType = builder.bizType;
            this.deviceOpenId = builder.deviceOpenId;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizGroup
         */
        public String getBizGroup() {
            return this.bizGroup;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public static final class Builder {
            private String bizGroup; 
            private String bizType; 
            private String deviceOpenId; 
            private String userOpenId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.bizGroup = model.bizGroup;
                this.bizType = model.bizType;
                this.deviceOpenId = model.deviceOpenId;
                this.userOpenId = model.userOpenId;
            } 

            /**
             * <p>Product group</p>
             * 
             * <strong>example:</strong>
             * <p>X1</p>
             */
            public Builder bizGroup(String bizGroup) {
                this.bizGroup = bizGroup;
                return this;
            }

            /**
             * <p>Product categorization</p>
             * 
             * <strong>example:</strong>
             * <p>AILABS</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>A963*0158</p>
             * 
             * <strong>example:</strong>
             * <p>设备OpenId</p>
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * <p>DAFE****ce3ej=</p>
             * 
             * <strong>example:</strong>
             * <p>用户OpenId</p>
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
