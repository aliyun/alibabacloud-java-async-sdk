// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryImportedDeviceByApplyIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryImportedDeviceByApplyIdResponseBody</p>
 */
public class QueryImportedDeviceByApplyIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceList")
    private DeviceList deviceList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("ProductKey")
    private String productKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalPage")
    private Integer totalPage;

    private QueryImportedDeviceByApplyIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.deviceList = builder.deviceList;
        this.errorMessage = builder.errorMessage;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryImportedDeviceByApplyIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceList
     */
    public DeviceList getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
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

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private DeviceList deviceList; 
        private String errorMessage; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productKey; 
        private String requestId; 
        private Boolean success; 
        private Integer totalPage; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceList.
         */
        public Builder deviceList(DeviceList deviceList) {
            this.deviceList = deviceList;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
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

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public QueryImportedDeviceByApplyIdResponseBody build() {
            return new QueryImportedDeviceByApplyIdResponseBody(this);
        } 

    } 

    public static class Device extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSecret")
        private String deviceSecret;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("Sn")
        private String sn;

        private Device(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.productKey = builder.productKey;
            this.sn = builder.sn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceSecret; 
            private String productKey; 
            private String sn; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceSecret.
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
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
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
    public static class DeviceList extends TeaModel {
        @NameInMap("device")
        private java.util.List < Device> device;

        private DeviceList(Builder builder) {
            this.device = builder.device;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public java.util.List < Device> getDevice() {
            return this.device;
        }

        public static final class Builder {
            private java.util.List < Device> device; 

            /**
             * device.
             */
            public Builder device(java.util.List < Device> device) {
                this.device = device;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
