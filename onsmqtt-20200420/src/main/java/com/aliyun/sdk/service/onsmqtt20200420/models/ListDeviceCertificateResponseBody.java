// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceCertificateResponseBody</p>
 */
public class ListDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeviceCertificateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceCertificateResponseBody create() {
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

        public ListDeviceCertificateResponseBody build() {
            return new ListDeviceCertificateResponseBody(this);
        } 

    } 

    public static class DeviceCertificateVOS extends TeaModel {
        @NameInMap("CaSn")
        private String caSn;

        @NameInMap("DeviceContent")
        private String deviceContent;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("Status")
        private String status;

        @NameInMap("ValidBegin")
        private String validBegin;

        @NameInMap("ValidEnd")
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
        @NameInMap("DeviceCertificateVOS")
        private java.util.List < DeviceCertificateVOS> deviceCertificateVOS;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
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
