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
 * {@link QuerySpeechLicenseDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpeechLicenseDeviceListResponseBody</p>
 */
public class QuerySpeechLicenseDeviceListResponseBody extends TeaModel {
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

    private QuerySpeechLicenseDeviceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechLicenseDeviceListResponseBody create() {
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

        private Builder(QuerySpeechLicenseDeviceListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The result of the request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
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

        public QuerySpeechLicenseDeviceListResponseBody build() {
            return new QuerySpeechLicenseDeviceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySpeechLicenseDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechLicenseDeviceListResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("ExpiryTime")
        private Long expiryTime;

        @com.aliyun.core.annotation.NameInMap("InSpecifiedGroup")
        private Boolean inSpecifiedGroup;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("LicenseStatus")
        private String licenseStatus;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private Item(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceStatus = builder.deviceStatus;
            this.expiryTime = builder.expiryTime;
            this.inSpecifiedGroup = builder.inSpecifiedGroup;
            this.iotId = builder.iotId;
            this.licenseStatus = builder.licenseStatus;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return expiryTime
         */
        public Long getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return inSpecifiedGroup
         */
        public Boolean getInSpecifiedGroup() {
            return this.inSpecifiedGroup;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return licenseStatus
         */
        public String getLicenseStatus() {
            return this.licenseStatus;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceStatus; 
            private Long expiryTime; 
            private Boolean inSpecifiedGroup; 
            private String iotId; 
            private String licenseStatus; 
            private String productKey; 
            private String productName; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.deviceName = model.deviceName;
                this.deviceStatus = model.deviceStatus;
                this.expiryTime = model.expiryTime;
                this.inSpecifiedGroup = model.inSpecifiedGroup;
                this.iotId = model.iotId;
                this.licenseStatus = model.licenseStatus;
                this.productKey = model.productKey;
                this.productName = model.productName;
            } 

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The status of the device.</p>
             * <ul>
             * <li><strong>ONLINE</strong>: The device is online.</li>
             * <li><strong>OFFLINE</strong>: The device is offline.</li>
             * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
             * <li><strong>DISABLE</strong>: The device is disabled.</li>
             * <li><strong>DELETE</strong>: The device is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * <p>The expiration time of the license.</p>
             * 
             * <strong>example:</strong>
             * <p>1620624606000</p>
             */
            public Builder expiryTime(Long expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * <p>Indicates whether the device belongs to the specified device group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder inSpecifiedGroup(Boolean inSpecifiedGroup) {
                this.inSpecifiedGroup = inSpecifiedGroup;
                return this;
            }

            /**
             * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Q7uOhVRdZRRlDnTLv****00100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The license status.</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The license is valid.</li>
             * <li><strong>EXPIRE</strong>: The license is expired.</li>
             * <li><strong>EXPIRING</strong>: The license is about to expire.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder licenseStatus(String licenseStatus) {
                this.licenseStatus = licenseStatus;
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
             * <p>The ProductName of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechLicenseDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechLicenseDeviceListResponseBody</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("item")
        private java.util.List<Item> item;

        private DeviceList(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(DeviceList model) {
                this.item = model.item;
            } 

            /**
             * item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechLicenseDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechLicenseDeviceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceList")
        private DeviceList deviceList;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private Integer pageId;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.deviceList = builder.deviceList;
            this.pageId = builder.pageId;
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
         * @return deviceList
         */
        public DeviceList getDeviceList() {
            return this.deviceList;
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
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
            private DeviceList deviceList; 
            private Integer pageId; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceList = model.deviceList;
                this.pageId = model.pageId;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The information about devices.</p>
             */
            public Builder deviceList(DeviceList deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
