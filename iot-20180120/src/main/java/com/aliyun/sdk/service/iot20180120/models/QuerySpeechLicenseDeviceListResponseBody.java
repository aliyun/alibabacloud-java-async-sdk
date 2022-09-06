// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechLicenseDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpeechLicenseDeviceListResponseBody</p>
 */
public class QuerySpeechLicenseDeviceListResponseBody extends TeaModel {
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

        public QuerySpeechLicenseDeviceListResponseBody build() {
            return new QuerySpeechLicenseDeviceListResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceStatus")
        private String deviceStatus;

        @NameInMap("ExpiryTime")
        private Long expiryTime;

        @NameInMap("InSpecifiedGroup")
        private Boolean inSpecifiedGroup;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("LicenseStatus")
        private String licenseStatus;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
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

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * ExpiryTime.
             */
            public Builder expiryTime(Long expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * InSpecifiedGroup.
             */
            public Builder inSpecifiedGroup(Boolean inSpecifiedGroup) {
                this.inSpecifiedGroup = inSpecifiedGroup;
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
             * LicenseStatus.
             */
            public Builder licenseStatus(String licenseStatus) {
                this.licenseStatus = licenseStatus;
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
             * ProductName.
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
    public static class DeviceList extends TeaModel {
        @NameInMap("item")
        private java.util.List < Item> item;

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
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DeviceList")
        private DeviceList deviceList;

        @NameInMap("PageId")
        private Integer pageId;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
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

            /**
             * DeviceList.
             */
            public Builder deviceList(DeviceList deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
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
