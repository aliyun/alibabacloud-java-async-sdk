// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindDeviceResponseBody</p>
 */
public class UnbindDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UnbindDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public UnbindDeviceResponseBody build() {
            return new UnbindDeviceResponseBody(this);
        } 

    } 

    public static class SubDeviceUnbindResult extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("UnbindResultCode")
        private Integer unbindResultCode;

        @NameInMap("UnbindResultMessage")
        private String unbindResultMessage;

        private SubDeviceUnbindResult(Builder builder) {
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
            this.unbindResultCode = builder.unbindResultCode;
            this.unbindResultMessage = builder.unbindResultMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceUnbindResult create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return unbindResultCode
         */
        public Integer getUnbindResultCode() {
            return this.unbindResultCode;
        }

        /**
         * @return unbindResultMessage
         */
        public String getUnbindResultMessage() {
            return this.unbindResultMessage;
        }

        public static final class Builder {
            private String deviceName; 
            private String iotId; 
            private String productKey; 
            private Integer unbindResultCode; 
            private String unbindResultMessage; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * UnbindResultCode.
             */
            public Builder unbindResultCode(Integer unbindResultCode) {
                this.unbindResultCode = unbindResultCode;
                return this;
            }

            /**
             * UnbindResultMessage.
             */
            public Builder unbindResultMessage(String unbindResultMessage) {
                this.unbindResultMessage = unbindResultMessage;
                return this;
            }

            public SubDeviceUnbindResult build() {
                return new SubDeviceUnbindResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SubDeviceUnbindResult")
        private java.util.List < SubDeviceUnbindResult> subDeviceUnbindResult;

        private Data(Builder builder) {
            this.subDeviceUnbindResult = builder.subDeviceUnbindResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subDeviceUnbindResult
         */
        public java.util.List < SubDeviceUnbindResult> getSubDeviceUnbindResult() {
            return this.subDeviceUnbindResult;
        }

        public static final class Builder {
            private java.util.List < SubDeviceUnbindResult> subDeviceUnbindResult; 

            /**
             * SubDeviceUnbindResult.
             */
            public Builder subDeviceUnbindResult(java.util.List < SubDeviceUnbindResult> subDeviceUnbindResult) {
                this.subDeviceUnbindResult = subDeviceUnbindResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
