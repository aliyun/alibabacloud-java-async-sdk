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
 * {@link QueryLicenseDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLicenseDeviceListResponseBody</p>
 */
public class QueryLicenseDeviceListResponseBody extends TeaModel {
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

    private QueryLicenseDeviceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLicenseDeviceListResponseBody create() {
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

        private Builder(QueryLicenseDeviceListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see the <strong>&quot;Error codes&quot;</strong> section in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>291438BA-6E10-4C4C-B761-243B9A0D324F</p>
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

        public QueryLicenseDeviceListResponseBody build() {
            return new QueryLicenseDeviceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLicenseDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLicenseDeviceListResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ExpiryTime")
        private Long expiryTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private Item(Builder builder) {
            this.deviceName = builder.deviceName;
            this.expiryTime = builder.expiryTime;
            this.gmtCreate = builder.gmtCreate;
            this.iotId = builder.iotId;
            this.licenseCode = builder.licenseCode;
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
         * @return expiryTime
         */
        public Long getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
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
            private Long expiryTime; 
            private Long gmtCreate; 
            private String iotId; 
            private String licenseCode; 
            private String productKey; 
            private String productName; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.deviceName = model.deviceName;
                this.expiryTime = model.expiryTime;
                this.gmtCreate = model.gmtCreate;
                this.iotId = model.iotId;
                this.licenseCode = model.licenseCode;
                this.productKey = model.productKey;
                this.productName = model.productName;
            } 

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>device1</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The expiration time of the license.</p>
             * 
             * <strong>example:</strong>
             * <p>1690934297000</p>
             */
            public Builder expiryTime(Long expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * <p>The time when the license was bound to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>1620634297000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Q7uOhVRdZRRlDnTLv****00100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The license type that indicates the audio and video specifications. Valid values: <strong>480P</strong> and <strong>720P</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>720P</p>
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>es****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The ProductName of the product.</p>
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
     * {@link QueryLicenseDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLicenseDeviceListResponseBody</p>
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
     * {@link QueryLicenseDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLicenseDeviceListResponseBody</p>
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
             * <p>The information about the devices.</p>
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
             * <p>2</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
