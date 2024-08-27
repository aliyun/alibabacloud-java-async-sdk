// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceCertificateResponseBody</p>
 */
public class GetDeviceCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceCertificateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceCertificateResponseBody build() {
            return new GetDeviceCertificateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaSn")
        private String caSn;

        @com.aliyun.core.annotation.NameInMap("DeviceContent")
        private String deviceContent;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSn")
        private String deviceSn;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidBegin")
        private String validBegin;

        @com.aliyun.core.annotation.NameInMap("ValidEnd")
        private String validEnd;

        private Data(Builder builder) {
            this.caSn = builder.caSn;
            this.deviceContent = builder.deviceContent;
            this.deviceName = builder.deviceName;
            this.deviceSn = builder.deviceSn;
            this.status = builder.status;
            this.validBegin = builder.validBegin;
            this.validEnd = builder.validEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caSn
         */
        public String getCaSn() {
            return this.caSn;
        }

        /**
         * @return deviceContent
         */
        public String getDeviceContent() {
            return this.deviceContent;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSn
         */
        public String getDeviceSn() {
            return this.deviceSn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validBegin
         */
        public String getValidBegin() {
            return this.validBegin;
        }

        /**
         * @return validEnd
         */
        public String getValidEnd() {
            return this.validEnd;
        }

        public static final class Builder {
            private String caSn; 
            private String deviceContent; 
            private String deviceName; 
            private String deviceSn; 
            private String status; 
            private String validBegin; 
            private String validEnd; 

            /**
             * CaSn.
             */
            public Builder caSn(String caSn) {
                this.caSn = caSn;
                return this;
            }

            /**
             * DeviceContent.
             */
            public Builder deviceContent(String deviceContent) {
                this.deviceContent = deviceContent;
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
             * DeviceSn.
             */
            public Builder deviceSn(String deviceSn) {
                this.deviceSn = deviceSn;
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
             * ValidBegin.
             */
            public Builder validBegin(String validBegin) {
                this.validBegin = validBegin;
                return this;
            }

            /**
             * ValidEnd.
             */
            public Builder validEnd(String validEnd) {
                this.validEnd = validEnd;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
