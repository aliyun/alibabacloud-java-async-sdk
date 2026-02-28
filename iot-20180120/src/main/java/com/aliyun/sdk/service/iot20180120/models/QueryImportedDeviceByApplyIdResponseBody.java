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
 * {@link QueryImportedDeviceByApplyIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryImportedDeviceByApplyIdResponseBody</p>
 */
public class QueryImportedDeviceByApplyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeviceList")
    private DeviceList deviceList;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
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

        private Builder() {
        } 

        private Builder(QueryImportedDeviceByApplyIdResponseBody model) {
            this.code = model.code;
            this.deviceList = model.deviceList;
            this.errorMessage = model.errorMessage;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.productKey = model.productKey;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried devices.</p>
         */
        public Builder deviceList(DeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>A system exception occurred.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public QueryImportedDeviceByApplyIdResponseBody build() {
            return new QueryImportedDeviceByApplyIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryImportedDeviceByApplyIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryImportedDeviceByApplyIdResponseBody</p>
     */
    public static class Device extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("Sn")
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

            private Builder() {
            } 

            private Builder(Device model) {
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.productKey = model.productKey;
                this.sn = model.sn;
            } 

            /**
             * <p>The DeviceName of the device.</p>
             * <blockquote>
             * <p> Keep the information confidential.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The DeviceSecret of the device.</p>
             * <blockquote>
             * <p> Keep the information confidential.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>b4d43f7******10ba5e5</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The serial number (SN) of the device.</p>
             * <blockquote>
             * <p>If you did not specify an SN for the device, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>QC4******001</p>
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
    /**
     * 
     * {@link QueryImportedDeviceByApplyIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryImportedDeviceByApplyIdResponseBody</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("device")
        private java.util.List<Device> device;

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
        public java.util.List<Device> getDevice() {
            return this.device;
        }

        public static final class Builder {
            private java.util.List<Device> device; 

            private Builder() {
            } 

            private Builder(DeviceList model) {
                this.device = model.device;
            } 

            /**
             * device.
             */
            public Builder device(java.util.List<Device> device) {
                this.device = device;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
