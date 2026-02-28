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
 * {@link QueryDeviceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceDetailResponseBody</p>
 */
public class QueryDeviceDetailResponseBody extends TeaModel {
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

    private QueryDeviceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceDetailResponseBody create() {
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

        private Builder(QueryDeviceDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device details returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceDetailResponseBody build() {
            return new QueryDeviceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @com.aliyun.core.annotation.NameInMap("GmtActive")
        private String gmtActive;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtOnline")
        private String gmtOnline;

        @com.aliyun.core.annotation.NameInMap("GmtTimestamp")
        private String gmtTimestamp;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Boolean owner;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcActive")
        private String utcActive;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcOnline")
        private String utcOnline;

        @com.aliyun.core.annotation.NameInMap("UtcTimestamp")
        private String utcTimestamp;

        private Data(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.firmwareVersion = builder.firmwareVersion;
            this.gmtActive = builder.gmtActive;
            this.gmtCreate = builder.gmtCreate;
            this.gmtOnline = builder.gmtOnline;
            this.gmtTimestamp = builder.gmtTimestamp;
            this.iotId = builder.iotId;
            this.ipAddress = builder.ipAddress;
            this.nickname = builder.nickname;
            this.nodeType = builder.nodeType;
            this.owner = builder.owner;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.region = builder.region;
            this.status = builder.status;
            this.utcActive = builder.utcActive;
            this.utcCreate = builder.utcCreate;
            this.utcOnline = builder.utcOnline;
            this.utcTimestamp = builder.utcTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return gmtActive
         */
        public String getGmtActive() {
            return this.gmtActive;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtOnline
         */
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        /**
         * @return gmtTimestamp
         */
        public String getGmtTimestamp() {
            return this.gmtTimestamp;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return owner
         */
        public Boolean getOwner() {
            return this.owner;
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

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return utcActive
         */
        public String getUtcActive() {
            return this.utcActive;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcOnline
         */
        public String getUtcOnline() {
            return this.utcOnline;
        }

        /**
         * @return utcTimestamp
         */
        public String getUtcTimestamp() {
            return this.utcTimestamp;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceSecret; 
            private String firmwareVersion; 
            private String gmtActive; 
            private String gmtCreate; 
            private String gmtOnline; 
            private String gmtTimestamp; 
            private String iotId; 
            private String ipAddress; 
            private String nickname; 
            private Integer nodeType; 
            private Boolean owner; 
            private String productKey; 
            private String productName; 
            private String region; 
            private String status; 
            private String utcActive; 
            private String utcCreate; 
            private String utcOnline; 
            private String utcTimestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.firmwareVersion = model.firmwareVersion;
                this.gmtActive = model.gmtActive;
                this.gmtCreate = model.gmtCreate;
                this.gmtOnline = model.gmtOnline;
                this.gmtTimestamp = model.gmtTimestamp;
                this.iotId = model.iotId;
                this.ipAddress = model.ipAddress;
                this.nickname = model.nickname;
                this.nodeType = model.nodeType;
                this.owner = model.owner;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.region = model.region;
                this.status = model.status;
                this.utcActive = model.utcActive;
                this.utcCreate = model.utcCreate;
                this.utcOnline = model.utcOnline;
                this.utcTimestamp = model.utcTimestamp;
            } 

            /**
             * <p>The DeviceName of the device.</p>
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
             * 
             * <strong>example:</strong>
             * <p>mz2Canp4GB7qRVf1OYPNtRqB2anu****</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The version number of the default OTA module of the device.</p>
             * <p>If you want to query the version information about other OTA modules, call the <a href="https://help.aliyun.com/document_detail/190622.html">ListOTAModuleVersionsByDevice</a> operation. The version information is submitted by the device.</p>
             * 
             * <strong>example:</strong>
             * <p>V1.0.0.0</p>
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * <p>The time when the device was activated. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06 10:48:41</p>
             */
            public Builder gmtActive(String gmtActive) {
                this.gmtActive = gmtActive;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06 10:47:50</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The most recent time when the device was online. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06 13:43:12</p>
             */
            public Builder gmtOnline(String gmtOnline) {
                this.gmtOnline = gmtOnline;
                return this;
            }

            /**
             * GmtTimestamp.
             */
            public Builder gmtTimestamp(String gmtTimestamp) {
                this.gmtTimestamp = gmtTimestamp;
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
             * <p>The IP address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The alias of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>detectors_in_beijing</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can connect to IoT Platform directly or as a sub-device of a gateway.</li>
             * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain the topological relationships with sub-devices, and synchronize the topological relationships to IoT Platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>Indicates whether the operation is called by the owner of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder owner(Boolean owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1rYuVF****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The ID of the region where the device resides. The region is the same as the region where IoT Platform resides. You can view the region in the IoT Platform console.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The device status. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>ONLINE</strong>: The device is online.</li>
             * <li><strong>OFFLINE</strong>: The device is offline.</li>
             * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
             * <li><strong>DISABLE</strong>: The device is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the device was activated. The time is in the UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06T02:48:41.000Z</p>
             */
            public Builder utcActive(String utcActive) {
                this.utcActive = utcActive;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is in the UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06T02:47:50.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The most recent time when the device was online. The time is in the UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06T05:43:12.000Z</p>
             */
            public Builder utcOnline(String utcOnline) {
                this.utcOnline = utcOnline;
                return this;
            }

            /**
             * UtcTimestamp.
             */
            public Builder utcTimestamp(String utcTimestamp) {
                this.utcTimestamp = utcTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
