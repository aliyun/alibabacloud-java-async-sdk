// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Certificate details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceCertificateResponseBody build() {
            return new GetDeviceCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceCertificateResponseBody</p>
     */
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
             * <p>The SN serial number of the CA certificate to which the device certificate belongs, used to uniquely identify a CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>00f26900ba87******</p>
             */
            public Builder caSn(String caSn) {
                this.caSn = caSn;
                return this;
            }

            /**
             * <p>Content of the device certificate.</p>
             * <p> represents a new line.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN DEVICECERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END DEVICECERTIFICATE-----</p>
             */
            public Builder deviceContent(String deviceContent) {
                this.deviceContent = deviceContent;
                return this;
            }

            /**
             * <p>Name of the device certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>mqtt_device</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The SN serial number of the device certificate, used to uniquely identify a device certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>356217374433******</p>
             */
            public Builder deviceSn(String deviceSn) {
                this.deviceSn = deviceSn;
                return this;
            }

            /**
             * <p>The status of the device certificate. The values are as follows:</p>
             * <ul>
             * <li><strong>0</strong>: Indicates that the certificate is in an inactive state. - <strong>1</strong>: Indicates that the certificate is in an active state.<blockquote>
             * <p>After the device certificate is registered, it is in an active state by default.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The start time when the device certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1654137303000</p>
             */
            public Builder validBegin(String validBegin) {
                this.validBegin = validBegin;
                return this;
            }

            /**
             * <p>The end time when the device certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1969497303000</p>
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
