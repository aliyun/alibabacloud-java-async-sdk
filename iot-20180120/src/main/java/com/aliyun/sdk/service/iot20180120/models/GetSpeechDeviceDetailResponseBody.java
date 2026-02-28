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
 * {@link GetSpeechDeviceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpeechDeviceDetailResponseBody</p>
 */
public class GetSpeechDeviceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSpeechDeviceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpeechDeviceDetailResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetSpeechDeviceDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public GetSpeechDeviceDetailResponseBody build() {
            return new GetSpeechDeviceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSpeechDeviceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpeechDeviceDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableSpace")
        private Float availableSpace;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SpeechListUpdateTime")
        private Long speechListUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalSpace")
        private Float totalSpace;

        private Data(Builder builder) {
            this.availableSpace = builder.availableSpace;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
            this.speechListUpdateTime = builder.speechListUpdateTime;
            this.status = builder.status;
            this.totalSpace = builder.totalSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableSpace
         */
        public Float getAvailableSpace() {
            return this.availableSpace;
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
         * @return speechListUpdateTime
         */
        public Long getSpeechListUpdateTime() {
            return this.speechListUpdateTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalSpace
         */
        public Float getTotalSpace() {
            return this.totalSpace;
        }

        public static final class Builder {
            private Float availableSpace; 
            private String deviceName; 
            private String iotId; 
            private String productKey; 
            private Long speechListUpdateTime; 
            private String status; 
            private Float totalSpace; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.availableSpace = model.availableSpace;
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
                this.speechListUpdateTime = model.speechListUpdateTime;
                this.status = model.status;
                this.totalSpace = model.totalSpace;
            } 

            /**
             * AvailableSpace.
             */
            public Builder availableSpace(Float availableSpace) {
                this.availableSpace = availableSpace;
                return this;
            }

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
             * SpeechListUpdateTime.
             */
            public Builder speechListUpdateTime(Long speechListUpdateTime) {
                this.speechListUpdateTime = speechListUpdateTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalSpace.
             */
            public Builder totalSpace(Float totalSpace) {
                this.totalSpace = totalSpace;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
