// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDeviceCertificateByCaSnResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceCertificateByCaSnResponseBody</p>
 */
public class ListDeviceCertificateByCaSnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeviceCertificateByCaSnResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceCertificateByCaSnResponseBody create() {
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
         * <p>Query result.</p>
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

        public ListDeviceCertificateByCaSnResponseBody build() {
            return new ListDeviceCertificateByCaSnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceCertificateByCaSnResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceCertificateByCaSnResponseBody</p>
     */
    public static class DeviceCertificateVOS extends TeaModel {
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

        private DeviceCertificateVOS(Builder builder) {
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

        public static DeviceCertificateVOS create() {
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
             * <li>0: indicates that the certificate is in an inactive state. </li>
             * <li>1: indicates that the certificate is in an active state.</li>
             * </ul>
             * <p>After the device certificate is registered, it is in an active state by default.</p>
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

            public DeviceCertificateVOS build() {
                return new DeviceCertificateVOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDeviceCertificateByCaSnResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceCertificateByCaSnResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceCertificateVOS")
        private java.util.List < DeviceCertificateVOS> deviceCertificateVOS;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.deviceCertificateVOS = builder.deviceCertificateVOS;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceCertificateVOS
         */
        public java.util.List < DeviceCertificateVOS> getDeviceCertificateVOS() {
            return this.deviceCertificateVOS;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < DeviceCertificateVOS> deviceCertificateVOS; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * <p>Details of the device certificate.</p>
             */
            public Builder deviceCertificateVOS(java.util.List < DeviceCertificateVOS> deviceCertificateVOS) {
                this.deviceCertificateVOS = deviceCertificateVOS;
                return this;
            }

            /**
             * <p>The current page number of the returned query records.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The maximum number of results to display per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of query results.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
