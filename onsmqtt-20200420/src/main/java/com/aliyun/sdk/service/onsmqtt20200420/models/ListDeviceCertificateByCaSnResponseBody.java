// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        public ListDeviceCertificateByCaSnResponseBody build() {
            return new ListDeviceCertificateByCaSnResponseBody(this);
        } 

    } 

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

            public DeviceCertificateVOS build() {
                return new DeviceCertificateVOS(this);
            } 

        } 

    }
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
             * DeviceCertificateVOS.
             */
            public Builder deviceCertificateVOS(java.util.List < DeviceCertificateVOS> deviceCertificateVOS) {
                this.deviceCertificateVOS = deviceCertificateVOS;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
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
