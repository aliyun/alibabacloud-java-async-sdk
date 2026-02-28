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
 * {@link GetGatewayBySubDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayBySubDeviceResponseBody</p>
 */
public class GetGatewayBySubDeviceResponseBody extends TeaModel {
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

    private GetGatewayBySubDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayBySubDeviceResponseBody create() {
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

        private Builder(GetGatewayBySubDeviceResponseBody model) {
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
         * <p>The gateway details returned if the call is successful.</p>
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

        public GetGatewayBySubDeviceResponseBody build() {
            return new GetGatewayBySubDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayBySubDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayBySubDeviceResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcActive")
        private String utcActive;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcOnline")
        private String utcOnline;

        @com.aliyun.core.annotation.NameInMap("iotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        private Data(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.firmwareVersion = builder.firmwareVersion;
            this.gmtActive = builder.gmtActive;
            this.gmtCreate = builder.gmtCreate;
            this.gmtOnline = builder.gmtOnline;
            this.ipAddress = builder.ipAddress;
            this.nodeType = builder.nodeType;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.status = builder.status;
            this.utcActive = builder.utcActive;
            this.utcCreate = builder.utcCreate;
            this.utcOnline = builder.utcOnline;
            this.iotId = builder.iotId;
            this.region = builder.region;
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
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
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
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceSecret; 
            private String firmwareVersion; 
            private String gmtActive; 
            private String gmtCreate; 
            private String gmtOnline; 
            private String ipAddress; 
            private String nodeType; 
            private String productKey; 
            private String productName; 
            private String status; 
            private String utcActive; 
            private String utcCreate; 
            private String utcOnline; 
            private String iotId; 
            private String region; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.firmwareVersion = model.firmwareVersion;
                this.gmtActive = model.gmtActive;
                this.gmtCreate = model.gmtCreate;
                this.gmtOnline = model.gmtOnline;
                this.ipAddress = model.ipAddress;
                this.nodeType = model.nodeType;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.status = model.status;
                this.utcActive = model.utcActive;
                this.utcCreate = model.utcCreate;
                this.utcOnline = model.utcOnline;
                this.iotId = model.iotId;
                this.region = model.region;
            } 

            /**
             * <p>The DeviceName of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gateway</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The DeviceSecret of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>dCYdTU3gw5Z77bsHjPk6lPHPVnBT****</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The firmware version number of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>V1.0.1</p>
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * <p>The activation time of the gateway. The time is displayed in GMT. The time is the local time of the region where the gateway resides.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-18 23:25:30</p>
             */
            public Builder gmtActive(String gmtActive) {
                this.gmtActive = gmtActive;
                return this;
            }

            /**
             * <p>The creation time of the gateway. The time is displayed in GMT. The time is the local time of the region where the gateway resides.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-18 16:58:33</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last online time of the gateway. The time is displayed in GMT. The time is the local time of the region where the gateway resides.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20 17:41:04</p>
             */
            public Builder gmtOnline(String gmtOnline) {
                this.gmtOnline = gmtOnline;
                return this;
            }

            /**
             * <p>The IP address of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>106.<strong>.1</strong>.**</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The node type. The value 1 indicates that the device is a gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the gateway belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product to which the gateway belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>LinkIoT</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The status of the gateway device. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: The device is online.</li>
             * <li><strong>offline</strong>: The device is offline.</li>
             * <li><strong>unactive</strong>: The device is not activated.</li>
             * <li><strong>disable</strong>: The device is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The activation time of the gateway. The time is displayed in UTC. The actual time of the region where the gateway resides is calculated based on the time zone of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-18T15:25:30.176Z</p>
             */
            public Builder utcActive(String utcActive) {
                this.utcActive = utcActive;
                return this;
            }

            /**
             * <p>The creation time of the gateway. The time is displayed in UTC. The actual time of the region where the gateway resides is calculated based on the time zone of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-18T08:58:33.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The last online time of the gateway. The time is displayed in UTC. The actual time of the region where the gateway resides is calculated based on the time zone of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20T09:41:04.879Z</p>
             */
            public Builder utcOnline(String utcOnline) {
                this.utcOnline = utcOnline;
                return this;
            }

            /**
             * <p>The ID of the gateway device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>WuyjPSDQE1L22z1d****000100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The region where the gateway resides. This region corresponds to the region that is displayed in the IoT Platform console.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
