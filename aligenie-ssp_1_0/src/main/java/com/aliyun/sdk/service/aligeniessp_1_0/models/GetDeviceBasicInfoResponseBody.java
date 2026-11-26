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
 * {@link GetDeviceBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceBasicInfoResponseBody</p>
 */
public class GetDeviceBasicInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetDeviceBasicInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceBasicInfoResponseBody create() {
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

        private Builder(GetDeviceBasicInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Error code returned. A value of 200 indicates that the call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return result of invoking this API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
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

        public GetDeviceBasicInfoResponseBody build() {
            return new GetDeviceBasicInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceBasicInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceBasicInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        private Result(Builder builder) {
            this.firmwareVersion = builder.firmwareVersion;
            this.mac = builder.mac;
            this.name = builder.name;
            this.sn = builder.sn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private String firmwareVersion; 
            private String mac; 
            private String name; 
            private String sn; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.firmwareVersion = model.firmwareVersion;
                this.mac = model.mac;
                this.name = model.name;
                this.sn = model.sn;
            } 

            /**
             * <p>Firmware version of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.3</p>
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * <p>MAC address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>b4:xx:xx:xx:65:2b</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>Name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>我的设备</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>SN information of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>1200xxx048</p>
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
